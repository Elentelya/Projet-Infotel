package com.formation.test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;

import javax.persistence.EntityTransaction;
//import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.formation.entity.*;


public class HibernateMain {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {

			Author werber = new Author("Bernard", "Werber", "Fran�ais, n� en 1961");
			Author paolini = new Author("Christopher", "Paolini", "Americain, n� en 1983");
			Author nothomb = new Author("Amelie", "Nothomb", "Belge, née en 1966");
			Author chattam = new Author("Maxime", "Chattam", "Français, née en 1976");
			Author levy = new Author("Marc", "Levy", "Français, née en 1961");

			session.save(werber);
			session.save(paolini);
			session.save(nothomb);
			session.save(chattam);
			session.save(levy);

			Category sf = new Category("Science-Fiction", "La science-fiction est un genre narratif, qui consiste � raconter des fictions reposant sur des progr�s scientifiques et techniques obtenus dans un futur plus ou moins lointain");
			Category fantasy = new Category("Fantasy", "La fantasy est un genre litt�raire pr�sentant un ou plusieurs �l�ments surnaturels qui rel�vent souvent du mythe et qui sont souvent incarn�s par l�irruption ou l�utilisation de la magie.");
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

			Address bayardJeunAddress = new Address("18 rue Barb�s", "", montrouge, bayardJeun);
			Address albinMichelAddress = new Address("5 all�e de la Deuxi�me Division Blind�e", "", paris14, albinMichel);
			Address robertLaffontAddress = new Address("30 Place d'Italie", "", paris13, robertLaffont);

			session.save(bayardJeunAddress);
			session.save(albinMichelAddress);
			session.save(robertLaffontAddress);

			List<Author> eragonAuthor = new ArrayList();
			eragonAuthor.add(paolini);

			SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
			Date dateEragon = (Date) dateformat.parse("26/08/2003");

			Book eragon = new Book("Eragon", "Eragon est le premier roman du cycle L�H�ritage. C�est un voyage dans un univers fantastique o� l'on retrouve de nombreuses races : elfes, nains, dragons, chats-garous... Le personnage visible sur la couverture est Saphira, la dragonne d�Eragon.", 
					20, dateEragon, "Eragon.jpg",
					true, fantasy, bayardJeun, eragonAuthor);

			List<Author> troisiemeHumAuthor = new ArrayList();
			troisiemeHumAuthor.add(werber);

			Date dateTroisemeHum = (Date) dateformat.parse("02/10/2012");

			Book troisiemHum = new Book("Troisième Humanité", "Troisième humanité est le premier opus du cycle de romans Troisieme humanite. Charles Wells, un pal�ontologue très connu, part explorer le lac Vostok en Antarctique. L�-bas, il fait la d�couverte de deux squelettes d'humains de dix-sept m�tres de haut et un corps de la m�me taille, parfaitement conserv� dans la glace.", 
					20, dateTroisemeHum, "TroisiemeHum.jpg",
					true, sf, bayardJeun, troisiemeHumAuthor);

			List<Author> stupTrembAuthor = new ArrayList();
			stupTrembAuthor.add(nothomb);

			Date dateStupTremb = (Date) dateformat.parse("01/01/1999");

			Book stupTremb = new Book("Stupeur et Tremblements", "Amélie, originaire de Belgique qui a vécu sa petite enfance au Japon, a toujours admiré le raffinement et l’art de vivre du pays. À l’âge adulte, elle y retourne pour un contrat d’interprète au sein de la prestigieuse compagnie Yumimoto, afin d’y travailler et d’y vivre comme une Japonaise en tant qu'employée.", 
					10, dateStupTremb, "StupTremb.jpg",
					true, roman, albinMichel, stupTrembAuthor);

			List<Author> ouEsTuAuthor = new ArrayList();
			ouEsTuAuthor.add(levy);

			Date dateOuEsTu = (Date) dateformat.parse("12/11/2001");

			Book ouEsTu = new Book("Ou es_tu?", "Philip et Susan ont toujours compté l'un sur l'autre, et ce, depuis leur plus tendre enfance. Mais le choix de Susan qui souhaite participer à une mission humanitaire en Amérique centrale, va bouleverser leurs vies.", 
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

			session.save(library3);
			session.save(library3Address);


			Member membre1 = new Member("Lucas", "Morachini", "adresse@mail.com", "1234", "0631589658",false);
			Address membre1Address = new Address("Rue St Exupéry", "", bastia2, membre1);
			Date dateregMembre1 = (Date) dateformat.parse("02/07/2012");
			Registration regMembre1 = new Registration(dateregMembre1, library3, membre1);

			session.save(membre1);
			session.save(regMembre1);

			Member membre2 = new Member("Slitheen", "Jerry", "jerryslitheen@mail.com", "1234", "156894563789",false);
			City raxacoricofallapatorius = new City("Raxacoricofallapatorius", "369458");
			Address membre2Address = new Address("Une autre planète", "à droite après Clom", raxacoricofallapatorius, membre2);
			Date dateregMembre2 = (Date) dateformat.parse("15/04/2015");
			Registration regMembre2 = new Registration(dateregMembre2, library1, membre2);

			session.save(membre2);
			session.save(regMembre2);

			transaction.commit();

		}catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			if (session.isOpen())
				session.close();
		}
	}

	public HibernateMain() {
		// TODO Auto-generated constructor stub
	}

}
