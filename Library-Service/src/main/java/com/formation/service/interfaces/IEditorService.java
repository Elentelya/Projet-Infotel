package com.formation.service.interfaces;

import java.util.List;

import com.formation.dao.entities.Editor;

public interface IEditorService {

	// IGenericDao
	void insert(Editor editor) throws Exception;
	Editor getById(int editorId) throws Exception;
	List<Editor> getAll() throws Exception;
	void update(Editor editor) throws Exception;
	void delete(Editor editor) throws Exception;

	// IEditorDao
	Editor getEditorByName(String editorname) throws Exception;

}
