package com.formation.dao.main;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.formation.dao.config.SpringConfig;
import com.formation.dao.entities.Address;
import com.formation.dao.entities.Author;
import com.formation.dao.entities.Basket;
import com.formation.dao.entities.Book;
import com.formation.dao.entities.BookCopy;
import com.formation.dao.entities.Borrow;
import com.formation.dao.entities.Category;
import com.formation.dao.entities.City;
import com.formation.dao.entities.Editor;
import com.formation.dao.entities.Library;
import com.formation.dao.entities.Member;
import com.formation.dao.entities.Registration;
import com.formation.dao.entities.Status;
import com.formation.dao.interfaces.IGenericDao;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

		IGenericDao daoGeneric = (IGenericDao) ctx.getBean("genericDaoImpl");

		List<Author> authors1 = new ArrayList<>();
		List<Author> authors2 = new ArrayList<>();
		List<Author> authors3 = new ArrayList<>();
		List<Author> authors4 = new ArrayList<>();

		List<Category> categs1 = new ArrayList<>();
		List<Category> categs2 = new ArrayList<>();

		List<Library> libraries = new ArrayList<>();

		List<Book> books = new ArrayList<>();

		List<Member> members = new ArrayList<>();

		Author auth1 = new Author("Bernard", "Werber", "Francais, ne en 1961");
		Author auth2 = new Author("Christopher", "Paolini", "Americain, ne en 1983");
		Author auth3 = new Author("Amelie", "Nothomb", "Belge, née en 1966");
		Author auth4 = new Author("Maxime", "Chattam", "Français, née en 1976");
		Author auth5 = new Author("Marc", "Levy", "Français, née en 1961");

		authors1.add(auth1);
		authors2.add(auth2);
		authors3.add(auth3);
		authors4.add(auth4);
		authors4.add(auth5);

		Category cat1 = new Category("Science-Fiction",
				"La science-fiction est un genre narratif, qui consiste a raconter des fictions reposant sur des progr�s scientifiques et techniques obtenus dans un futur plus ou moins lointain");
		Category cat2 = new Category("Fantasy",
				"La fantasy est un genre litt�raire pr�sentant un ou plusieurs elements surnaturels qui relevent souvent du mythe et qui sont souvent incarn�s par l�irruption ou l�utilisation de la magie.");
		Category cat3 = new Category("Thriller",
				"Le thriller est un genre artistique utilisant le suspense ou la tension narrative pour provoquer chez le lecteur ou le spectateur une excitation ou une appréhension et le tenir en haleine jusqu'au dénouement de l'intrigue.");
		Category cat4 = new Category("Drame",
				"Le drame romantique est une forme littéraire qui traite de situations généralement non-épiques dans un contexte sérieux, sur un ton plus susceptible d'inspirer la tristesse que le rire.");
		Category cat5 = new Category("Roman",
				"Le roman est un genre littéraire, caractérisé essentiellement par une narration fictionnelle. La place importante faite à l'imagination renvoient à l'extraordinaire des personnages, des situations ou de l'intrigue.");

		categs1.add(cat1);
		categs1.add(cat2);
		categs2.add(cat3);
		categs2.add(cat4);
		categs2.add(cat5);

		Editor edit1 = new Editor("Bayard Jeunesse");
		Editor edit2 = new Editor("Albin Michel");
		Editor edit3 = new Editor("Robert Laffont");

		City city1 = new City("Montrouge", "92120");
		City city2 = new City("Paris", "75014");
		City city3 = new City("Rennes", "35000");
		City city4 = new City("Bastia", "20200");
		City city5 = new City("Lannion", "22300");
		City city6 = new City("Londres", "SW1A 2AA");

		Address adr1 = new Address("18 rue Barbes", "", city1, edit1);
		Address adr2 = new Address("5 allee de la Deuxieme Division Blindee", "", city2, edit2);
		Address adr3 = new Address("30 Place d'Italie", "", city3, edit3);

		Library library1 = new Library("Bibliothèque Centrale", "0495584600");
		Library library2 = new Library("Médiathèque Gwenadu", "0296474700");
		Library library3 = new Library("Bibliothèque de Toga", "0299324126");

		Address library1Address = new Address("Place du théâtre", "", city4, library1);
		//library1.setLibraryAddress(library1Address);
		Address library2Address = new Address("Rue St Exupéry", "", city5, library2);
		//library2.setLibraryAddress(library2Address);
		Address library3Address = new Address("Rue de St Malo", "", city3, library3);
		//library3.setLibraryAddress(library3Address);

		libraries.add(library1);
		libraries.add(library2);
		libraries.add(library3);

		/***************** AJOUT DE MEMBRES ******************/
		Member membre1 = new Member("Lucas", "Morachini", "adresse@mail.com", "1234", "0631589658", false, true);
		Address membre1Address = new Address("Rue St Exupéry", "", city3, membre1);
		Date dateregMembre1 = new Date(2012, 07, 02);
		Registration regMembre1 = new Registration(dateregMembre1, library3, membre1);

		Member membre2 = new Member("Jerry", "Slitheen", "jerryslitheen@mail.com", "1234", "156894563789", false, true);
		Address membre2Address = new Address("Une autre planète", "à droite après Clom", city3, membre2);
		Date dateregMembre2 = new Date(2015, 04, 20);
		Registration regMembre2 = new Registration(dateregMembre2, library1, membre2);

		Member membre3 = new Member("Maitre", "", "haroldsaxon@mail.com", "1234", "8596467315", true, true);
		Address membre3Address = new Address("10 Downing Street", "", city6, membre3);
		Date dateregMembre3 = new Date(2011, 11, 10);
		Registration regMembre3 = new Registration(dateregMembre3, library2, membre3);

		Member membre4 = new Member("Doctor", "Who", "tardis@mail.com", "1234", "9632154878", true, true);
		Address membre4Address = new Address("Tardis", "ça dépend", city6, membre4);
		Date dateregMembre4 = new Date(2009, 02, 16);
		Registration regMembre4 = new Registration(dateregMembre4, library1, membre4);

		Member membre5 = new Member("Tyler", "Rose", "roseTyler@mail.com", "1234", "7596472315", false, true);
		Address membre5Address = new Address("Tardis", "ça dépend", city3, membre5);
		Date dateregMembre5 = new Date(2013, 05, 17);
		Registration regMembre5 = new Registration(dateregMembre5, library1, membre5);
		
		members.add(membre1);
		members.add(membre2);
		members.add(membre3);
		members.add(membre4);
		members.add(membre5);

		/***************** AJOUT DE LIVRES ******************/
		Date datebook1 = new Date(2003,06,26);
		Book book1 = new Book("Eragon", "Eragon est le premier roman du cycle L'Heritage.", 20, datebook1,
				"Eragon.jpg", true, cat2, edit1, authors2);

		Date datebook2 = new Date(2012,10,2);
		Book book2 = new Book("Troisième Humanité",
				"Troisième humanité est le premier opus du cycle de romans Troisieme humanite.", 20, datebook2,
				"TroisiemeHum.jpg", true, cat1, edit1, authors1);

		Date datebook3 = new Date(1999,1,1);
		Book book3 = new Book("Stupeur et Tremblements",
				"Amélie, originaire de Belgique qui a vécu sa petite enfance au Japon, a toujours admiré le raffinement et l’art de vivre du pays.",
				10, datebook3, "StupTremb.jpg", true, cat5, edit2, authors3);

		Date datebook4 = new Date(2001,11,12);
		Book book4 = new Book("Ou es_tu?", "Philip et Susan ont toujours compté l'un sur l'autre.", 10, datebook4,
				"OuEsTu.jpg", true, cat4, edit3, authors4);

		Date datebook5 = new Date(2006,1,1);
		Book book5 = new Book("Les Arcanes du Chaos",
				"Le roman bâti sur les attentats du 11 septembre 2001, fait référence à la théorie du complot et à la manipulation de masse.",
				10, datebook5, "ArcanesChaos.jpg", true, cat3, edit2, authors4);

		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		
		BookCopy bookCopy1 = new BookCopy("bon", book3, library1, true);
		BookCopy bookCopy2 = new BookCopy("moyen", book3, library2, true);
		BookCopy bookCopy3 = new BookCopy("bon", book3, library3, true);
		
		Status status1 = new Status("En cours");
		Status status2 = new Status("Validé");
		Status status3 = new Status("Payé");
		Status status4 = new Status("Annulé");
		
		Date dateBasket1 = new Date(2002,4,16);
		Date dateBasket1_2 = new Date(2002,4,26);
		Basket basket1 = new Basket(dateBasket1, dateBasket1_2, membre4, status4);
		
		Date dateBasket2 = new Date(2017,8,16);
		Date dateBasket2_2 = new Date(2017,9,2);
		Basket basket2 = new Basket(dateBasket2, dateBasket2_2, membre1, status3);
		
		Date dateBasket3 = new Date(2017,9,16);
		Date dateBasket3_2 = new Date(2017,9,23);
		Basket basket3 = new Basket(dateBasket3, dateBasket3_2, membre1, status2);
		
		Date dateBorrow1 = new Date(2009,5,19);
		Borrow borrow1 = new Borrow(dateBasket1_2, dateBorrow1, bookCopy1, basket1);
		
		
		/************ SAUVEGARDE DES INFORMATIONS ***************/
		daoGeneric.save(auth1);
		daoGeneric.save(auth2);
		daoGeneric.save(auth3);
		daoGeneric.save(auth4);
		daoGeneric.save(auth5);
		
		daoGeneric.save(cat1);
		daoGeneric.save(cat2);
		daoGeneric.save(cat3);
		daoGeneric.save(cat4);
		daoGeneric.save(cat5);
		
		daoGeneric.save(edit1);
		daoGeneric.save(edit2);
		daoGeneric.save(edit3);
		
		daoGeneric.save(city1);
		daoGeneric.save(city2);
		daoGeneric.save(city3);
		daoGeneric.save(city4);
		daoGeneric.save(city5);
		daoGeneric.save(city6);
		
		daoGeneric.save(adr1);
		daoGeneric.save(adr2);
		daoGeneric.save(adr3);
		
		daoGeneric.save(library1);
		daoGeneric.save(library2);
		daoGeneric.save(library3);
		
		daoGeneric.save(library1Address);
		daoGeneric.save(library2Address);
		daoGeneric.save(library3Address);
		
		daoGeneric.save(membre1);
		daoGeneric.save(membre2);
		daoGeneric.save(membre3);
		daoGeneric.save(membre4);
		daoGeneric.save(membre5);
		
		daoGeneric.save(membre1Address);
		daoGeneric.save(membre2Address);
		daoGeneric.save(membre3Address);
		daoGeneric.save(membre4Address);
		daoGeneric.save(membre5Address);
		
		daoGeneric.save(regMembre1);
		daoGeneric.save(regMembre2);
		daoGeneric.save(regMembre3);
		daoGeneric.save(regMembre4);
		daoGeneric.save(regMembre5);
		
		daoGeneric.save(book1);
		daoGeneric.save(book2);
		daoGeneric.save(book3);
		daoGeneric.save(book4);
		daoGeneric.save(book5);
		
		daoGeneric.save(bookCopy1);
		daoGeneric.save(bookCopy2);
		daoGeneric.save(bookCopy3);
		
		daoGeneric.save(status1);
		daoGeneric.save(status2);
		daoGeneric.save(status3);
		daoGeneric.save(status4);
		
		daoGeneric.save(basket1);
		daoGeneric.save(basket2);
		daoGeneric.save(basket3);
		
		daoGeneric.save(borrow1);
		
		System.out.println("Données insérées en base");
	}
}
