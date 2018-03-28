package com.formation.dao.implementations;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.http.HttpHost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.entities.Book;

@Repository
@Transactional
public class BookDaoES extends BookDaoImpl {
	
	private final static Logger log = LogManager.getLogger(BookDaoES.class);
	
	private RestHighLevelClient client;
	
	@PostConstruct
	public void init() {
		try {
			client = new RestHighLevelClient(
			        RestClient.builder(
			                new HttpHost("localhost", 9200, "http"),
			                new HttpHost("localhost", 9201, "http")));
			
		} catch (Exception e) {
			log.error("Echec initialisation client ES", e);
		}			
	}

	
	@Override
	public List<Book> search(String search) {
		try {
			List<Book> books = new LinkedList<>();
			
			QueryBuilder queryBuilder = QueryBuilders.matchQuery("title", search)
			        .fuzziness(Fuzziness.AUTO)
			        .prefixLength(3)
			        .maxExpansions(10);
			
			SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
			searchSourceBuilder.query(queryBuilder);
			
			SearchRequest request = new SearchRequest("bibli"); 
			//request.types("doc");
			request.source(searchSourceBuilder);
			
			String[] includeFields = new String[] {"title", "description", "bookImage"};
			String[] excludeFields = new String[] {};
			searchSourceBuilder.fetchSource(includeFields, excludeFields);
			
			SearchResponse response = client.search(request);
			
			SearchHits hits = response.getHits();
			for (SearchHit hit : hits.getHits()) {
				
				if (log.isDebugEnabled()) {
					log.debug("\t[" + hit.getId() + "] " + hit.getSourceAsString());
				}
				
				JSONObject obj = new JSONObject(hit.getSourceAsString());
				
				Book book = new Book(Integer.parseInt(hit.getId()));
				book.setTitle(obj.getString("title"));
				book.setDescription(obj.getString("description"));
				book.setBookImage(obj.getString("bookImage"));
				
				books.add(book);
			}
			
			return books;
		} catch (IOException e) {
			throw new RuntimeException("Echec requêtage ES", e);
		}
	}
}
