package com.formation.test;

import java.util.Date;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.persistence.EntityTransaction;
//import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.query.Query;

import com.formation.dao.DaoAuthorImpl;
import com.formation.entity.*;


public class HibernateMain {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
		

          SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
			Author werber = new Author("Bernard", "Werber", "Francais, ne en 1961");
			Author paolini = new Author("Christopher", "Paolini", "Americain, ne en 1983");
			Author nothomb = new Author("Amelie", "Nothomb", "Belge, née en 1966");
			Author chattam = new Author("Maxime", "Chattam", "Français, née en 1976");
			Author levy = new Author("Marc", "Levy", "Français, née en 1961");

			session.save(werber);
			session.save(paolini);
			session.save(nothomb);
			session.save(chattam);
			session.save(levy);

			Category sf = new Category("Science-Fiction", "La science-fiction est un genre narratif, qui consiste a raconter des fictions reposant sur des progr�s scientifiques et techniques obtenus dans un futur plus ou moins lointain");
			Category fantasy = new Category("Fantasy", "La fantasy est un genre litt�raire pr�sentant un ou plusieurs elements surnaturels qui relevent souvent du mythe et qui sont souvent incarn�s par l�irruption ou l�utilisation de la magie.");
			Category thriller = new Category("Thriller", "Le thriller est un genre artistique utilisant le suspense ou la tension narrative pour provoquer chez le lecteur ou le spectateur une excitation ou une appréhension et le tenir en haleine jusqu'au dénouement de l'intrigue.");
			Category drame = new Category("Drame", "Le drame romantique est une forme littéraire qui traite de situations généralement non-épiques dans un contexte sérieux, sur un ton plus susceptible d'inspirer la tristesse que le rire.");
			Category roman = new Category("Roman", "Le roman est un genre littéraire, caractérisé essentiellement par une narration fictionnelle. La place importante faite à l'imagination renvoient à l'extraordinaire des personnages, des situations ou de l'intrigue.");

			session.save(sf);
			session.save(fantasy);
			session.save(thriller);
			session.save(drame);
			session.save(roman);

			Editor bayardJeun = new Editor("Bayard Jeunesse");
			Editor albinMichel = new Editor("Albin Michel");
			Editor robertLaffont = new Editor("Robert Laffont");

			session.save(bayardJeun);
			session.save(albinMichel);
			session.save(robertLaffont);

			City montrouge = new City("Montrouge", "92120");
			City paris14 = new City("Paris", "75014");
			City paris13 = new City("Paris", "75013");

			session.save(montrouge);
			session.save(paris14);
			session.save(paris13);

			Address bayardJeunAddress = new Address("18 rue Barbes", "", montrouge, bayardJeun);
			Address albinMichelAddress = new Address("5 allee de la Deuxieme Division Blindee", "", paris14, albinMichel);
			Address robertLaffontAddress = new Address("30 Place d'Italie", "", paris13, robertLaffont);

			session.save(bayardJeunAddress);
			session.save(albinMichelAddress);
			session.save(robertLaffontAddress);

			List<Author> eragonAuthor = new ArrayList();
			eragonAuthor.add(paolini);

			Library library1 = new Library("Bibliothèque Centrale", "0495584600");
			City bastia = new City("Bastia", "20200");
			Address library1Address = new Address("Place du théâtre", "", bastia, library1);

			session.save(library1);
			session.save(bastia);
			session.save(library1Address);

			Library library2 = new Library("Médiathèque Alb'Oru", "0495474700");
			City bastia2 = new City("Bastia", "20600");
			Address library2Address = new Address("Rue St Exupéry", "", bastia2, library2);

			session.save(library2);
			session.save(bastia2);
			session.save(library2Address);

			Library library3 = new Library("Bibliothèque de Toga", "0495324126");
			Address library3Address = new Address("18, av. Emile Sari", "", bastia, library3);
			
			Member membre1 = new Member("Lucas", "Morachini", "adresse@mail.com", "1234", "0631589658",false, true);
			Address membre1Address = new Address("Rue St Exupéry", "", bastia2, membre1);
			Date dateregMembre1 = (Date) dateformat.parse("02/07/2012");
			Registration regMembre1 = new Registration(dateregMembre1, library3, membre1);

			session.save(membre1);
			session.save(membre1Address);
			session.save(regMembre1);

			Member membre2 = new Member( "Jerry", "Slitheen", "jerryslitheen@mail.com", "1234", "156894563789",false, true);
			City raxacoricofallapatorius = new City("Raxacoricofallapatorius", "369458");
			Address membre2Address = new Address("Une autre planète", "à droite après Clom", raxacoricofallapatorius, membre2);
			Date dateregMembre2 = (Date) dateformat.parse("15/04/2015");
			Registration regMembre2 = new Registration(dateregMembre2, library1, membre2);

			session.save(membre2);
			session.save(raxacoricofallapatorius);
			session.save(membre2Address);
			session.save(regMembre2);

			Member membre3 = new Member("Maitre", "", "haroldsaxon@mail.com", "1234", "8596467315",true, true);
			City londresSW1A = new City("Londres", "SW1A 2AA");
			Address membre3Address = new Address("10 Downing Street","", londresSW1A, membre3);
			Date dateregMembre3 = (Date) dateformat.parse("30/09/2007");
			Registration regMembre3 = new Registration(dateregMembre3, library2, membre3);

			session.save(membre3);
			session.save(londresSW1A);
			session.save(membre3Address);
			session.save(regMembre3);

			Member membre4 = new Member("Doctor", "Who", "tardis@mail.com", "1234", "9632154878",true, true);
			City londresX = new City("Londres", "XXXX");
			Address membre4Address = new Address("Tardis", "ça dépend", londresX, membre4);
			Date dateregMembre4 = (Date) dateformat.parse("19/01/1596");
			Registration regMembre4 = new Registration(dateregMembre4, library1, membre4);

			session.save(membre4);
			session.save(londresX);
			session.save(membre4Address);
			session.save(regMembre4);

			Member membre5 = new Member("Tyler", "Rose", "roseTyler@mail.com", "1234", "7596472315",false, true);
			Address membre5Address = new Address("Tardis", "ça dépend", londresX, membre5);
			Date dateregMembre5 = (Date) dateformat.parse("19/01/1596");
			Registration regMembre5 = new Registration(dateregMembre5, library1, membre5);

			session.save(membre5);
			session.save(membre5Address);
			session.save(regMembre5);

			session.save(library3);
			session.save(library3Address);
			
			Date dateEragon = (Date) dateformat.parse("26/08/2003");

			Book eragon = new Book("Eragon", "Eragon est le premier roman du cycle L'Heritage.", 
					20, dateEragon, "Eragon.jpg",
					true, fantasy, bayardJeun, eragonAuthor);
			List<Author> troisiemeHumAuthor = new ArrayList();
			troisiemeHumAuthor.add(werber);

			Date dateTroisemeHum = (Date) dateformat.parse("02/10/2012");

			Book troisiemHum = new Book("Troisième Humanité", "Troisième humanité est le premier opus du cycle de romans Troisieme humanite.", 
					20, dateTroisemeHum, "TroisiemeHum.jpg",
					true, sf, bayardJeun, troisiemeHumAuthor);

			List<Author> stupTrembAuthor = new ArrayList();
			stupTrembAuthor.add(nothomb);

			Date dateStupTremb = (Date) dateformat.parse("01/01/1999");

			Book stupTremb = new Book("Stupeur et Tremblements", "Amélie, originaire de Belgique qui a vécu sa petite enfance au Japon, a toujours admiré le raffinement et l’art de vivre du pays.", 
					10, dateStupTremb,"StupTremb.jpg",
					true, roman, albinMichel, stupTrembAuthor);

			List<Author> ouEsTuAuthor = new ArrayList();
			ouEsTuAuthor.add(levy);

			Date dateOuEsTu = (Date) dateformat.parse("12/11/2001");

			Book ouEsTu = new Book("Ou es_tu?", "Philip et Susan ont toujours compté l'un sur l'autre.", 
					10, dateOuEsTu, "OuEsTu.jpg",
					true, drame, robertLaffont, ouEsTuAuthor);

			List<Author> arcanesChaosAuthor = new ArrayList();
			arcanesChaosAuthor.add(chattam);

			Date dateArcanesChaos = (Date) dateformat.parse("01/01/2006");

			Book arcanesChaos = new Book("Les Arcanes du Chaos", "Le roman bâti sur les attentats du 11 septembre 2001, fait référence à la théorie du complot et à la manipulation de masse.", 
					10, dateArcanesChaos, "ArcanesChaos.jpg",
					true, thriller, albinMichel, arcanesChaosAuthor);

			session.save(eragon);
			session.save(troisiemHum);
			session.save(stupTremb);
			session.save(arcanesChaos);
			session.save(ouEsTu);
			
			BookCopy copyStupTremb1 = new BookCopy("bon", stupTremb, library1, true);
			BookCopy copyStupTremb2 = new BookCopy("moyen", stupTremb, library2, true);
			BookCopy copyStupTremb3 = new BookCopy("bon", stupTremb, library3, true);
			
			session.save(copyStupTremb1);
			session.save(copyStupTremb2);
			session.save(copyStupTremb3);

			Status status1 = new Status("En cours");
			Status status2 = new Status("Validé");
			Status status3 = new Status("Payé");
			Status status4 = new Status("Annulé");

			session.save(status1);
			session.save(status2);
			session.save(status3);
			session.save(status4);

			
			
			Date dateBasket1 = (Date) dateformat.parse("16/04/2002");
			Date dateBasket1_2 = (Date) dateformat.parse("21/04/2002");
			Basket basket1 = new Basket(dateBasket1, dateBasket1_2, membre4, status4);
			
			session.save(basket1);
			
			Date dateBasket2 = (Date) dateformat.parse("16/08/2017");
			Date dateBasket2_2 = (Date) dateformat.parse("21/08/2017");
			Basket basket2 = new Basket(dateBasket2, dateBasket2_2, membre1, status3);
			
			session.save(basket2);
			
			Date dateBasket3 = (Date) dateformat.parse("16/02/2018");
			Date dateBasket3_2 = (Date) dateformat.parse("16/03/2018");
			Basket basket3 = new Basket(dateBasket3, dateBasket3_2, membre1, status2);
			
			session.save(basket3);
			
			Date dateBorrow1 = (Date) dateformat.parse("21/05/2002");
			Borrow borrow1 = new Borrow(dateBasket1_2, dateBorrow1, copyStupTremb1, basket1);

			session.save(borrow1);
			
			transaction.commit();

		}catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			if (session.isOpen())
				session.close();
		}
	}
	
	public static byte[] getImage(String imageName) {
	      File file =new File(imageName);
	      if(file.exists()){
	         try {
	            BufferedImage bufferedImage=ImageIO.read(file);
	            ByteArrayOutputStream byteOutStream=new ByteArrayOutputStream();
	            ImageIO.write(bufferedImage, "png", byteOutStream);
	            return byteOutStream.toByteArray();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	      return null;
	      
	      /*BlobProxy.generateProxy(getImage("C:\\Users\\maga\\git\\Projet-Infotel\\projet_dao\\src\\main\\resources\\images\\ArcanesChaos.jpg"))*/
	   }

	public HibernateMain() {
		// TODO Auto-generated constructor stub
	}

}
