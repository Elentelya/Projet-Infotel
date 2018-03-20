package com.formation.web.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.dao.entities.Book;
import com.formation.service.exceptions.ServiceException;
import com.formation.service.interfaces.IAuthorService;
import com.formation.service.interfaces.IBookService;
import com.formation.service.interfaces.ICategoryService;
import com.formation.service.interfaces.IEditorService;
import com.formation.web.controller.dto.BookDto;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	IBookService bookService;

	@Autowired
	ICategoryService categoryService;

	@Autowired
	IEditorService editorService;

	@Autowired
	IAuthorService authorService;
	

	DateFormat formatter = new SimpleDateFormat("dd-MMM-yy");

	// /*********************** CREATE **************************************/
	// @PutMapping(value="/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	// private Resultat addBook(@RequestBody BookDto bookDto) {
	//
	// Resultat resultat = new Resultat();
	// try {
	// Book book = new Book(bookDto.getTitle(), bookDto.getDescription(),
	// bookDto.getPrice(), bookDto.getPublicationDate(), bookDto.isPopularBook(),
	// bookDto.getBookImage());
	// book.setBookCategory(categoryService.getCategoryByName(bookDto..));
	// book.setBookEditor(editorService.getById(bookDto.getBookEditorId()));
	// List<Author> authors = new ArrayList<>();
	// for (int i = 0; i < bookDto.getAuthorsId().size(); i++) {
	// authors.add(authorService.getAuthor(bookDto.getAuthorsId().get(i)));
	// }
	// book.setAuthors(authors);
	// bookService.insert(book);
	//
	// resultat.setSuccess(true);
	// resultat.setMessage(ConstantsController.ADD_AUTHOR_SUCCESS);
	// }catch (ServiceException se) {
	// resultat.setSuccess(false);
	// resultat.setMessage(se.getMessage());
	// }catch (Exception e) {
	// resultat.setSuccess(false);
	// resultat.setMessage(ConstantsController.ADD_AUTHOR_ERRORS);
	// e.printStackTrace();
	// }
	// return resultat;
	// }
	
	/*********************** READ ALL ************************************/
	@GetMapping(value="/getAll")
	private Resultat getAllAuthor() {
		
		Resultat resultat = new Resultat();
		List<BookDto> listBooks = new ArrayList<BookDto>();
		
		try {
			List<Book> books = bookService.getAll();
			
			books.forEach(book -> {				
				BookDto bookDto = new BookDto(book.getTitle(), book.getDescription(), book.getPrice(), book.getPublicationDate(), book.isPopularBook(),
						book.getBookImage(), book.getBookCategory().getCategoryId(), book.getBookEditor().getEditorId());
				List<Integer> authorIds = new ArrayList<Integer>();
				book.getBookAuthors().forEach(author -> authorIds.add(author.getAuthorId()));
				
				resultat.setPayload(listBooks);
			});
			
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.LIST_AUTHOR_SUCCESS);
		}catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		}catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.LIST_AUTHOR_ERRORS);
			e.printStackTrace();
		}
		return resultat;		
	}

//	/************************* READ ************************************/
//	@GetMapping(value = "/get/{id}")
//	private Resultat getAuteurById(@PathVariable(value = "id") int id) {
//
//		Resultat resultat = new Resultat();
//		try {
//			Author author = authorService.getById(id);
//			AuthorDto authorById = new AuthorDto(author.getFirstname(), author.getLastname(), author.getShortBio());
//			authorById.setId(author.getAuthorId());
//
//			resultat.setPayload(authorById);
//			resultat.setSuccess(true);
//			resultat.setMessage(ConstantsController.READ_AUTHOR_SUCCESS);
//		} catch (ServiceException se) {
//			resultat.setSuccess(false);
//			resultat.setMessage(se.getMessage());
//		} catch (Exception e) {
//			resultat.setSuccess(false);
//			resultat.setMessage(ConstantsController.READ_AUTHOR_ERRORS);
//			e.printStackTrace();
//		}
//		return resultat;
//	}
//
//	/************************* UPDATE ************************************/
//	@PostMapping(value = "/update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
//	private Resultat updateAuthor(@RequestBody AuthorDto authorDto, @PathVariable(value = "id") int id) {
//
//		Resultat resultat = new Resultat();
//		try {
//			Author author = authorService.getById(id);
//			author.setFirstname(authorDto.getFirstname());
//			author.setLastname(authorDto.getLastname());
//			author.setShortBio(authorDto.getShortBio());
//
//			resultat.setSuccess(true);
//			resultat.setMessage(ConstantsController.READ_AUTHOR_SUCCESS);
//		} catch (ServiceException se) {
//			resultat.setSuccess(false);
//			resultat.setMessage(se.getMessage());
//		} catch (Exception e) {
//			resultat.setSuccess(false);
//			resultat.setMessage(ConstantsController.READ_AUTHOR_ERRORS);
//			e.printStackTrace();
//		}
//		return resultat;
//	}
//
//	/************************* DELETE ************************************/
//	@DeleteMapping(value = "/delete/{id}")
//	private Resultat deleteAuthor(@RequestBody AuthorDto authorDto, @PathVariable(value = "id") int id) {
//
//		Resultat resultat = new Resultat();
//		try {
//			authorService.delete(authorService.getById(id));
//
//			resultat.setSuccess(true);
//			resultat.setMessage(ConstantsController.DELETE_AUTHOR_SUCCESS);
//		} catch (ServiceException se) {
//			resultat.setSuccess(false);
//			resultat.setMessage(se.getMessage());
//		} catch (Exception e) {
//			resultat.setSuccess(false);
//			resultat.setMessage(ConstantsController.DELETE_AUTHOR_ERRORS);
//			e.printStackTrace();
//		}
//		return resultat;
//	}
//}

	
	
	
	
	
// @GetMapping("/get")
// public List<BookDto> getBook() {
// List<BookDto> viewBooks = new ArrayList<BookDto>();
//
// List<Book> books = bookService.getAll();
//
// for (Book oneBook : books) {
// viewBooks.add(new BookDto(oneBook.getTitle(), oneBook.getDescription(),
// oneBook.getPrice(),
// oneBook.getPublicationDate().toString(), oneBook.isPopularBook(),
// oneBook.getBookImage(),
// oneBook.getBookCategory().getCategoryId(),
// oneBook.getBookEditor().getEditorId(), null));
// }
// return viewBooks;
// }
//
// @PutMapping("/add")
// public void bookAdd(@RequestBody BookDto bookDto) throws ParseException {
//
// DateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
//
// Book book = new Book(bookDto.getTitle(), bookDto.getDescription(),
// bookDto.getPrice(),
// (Date) formatter.parse(bookDto.getPublicationDate()),
// bookDto.isPopularBook(), bookDto.getBookImage());
//
// book.setBookCategory(categoryService.getById(bookDto.getBookCategoryId()));
// book.setBookEditor(editorService.getById(bookDto.getBookEditorId()));
// List<Author> authors = new ArrayList<>();
// for (int i = 0; i < bookDto.getBookAuthorsIds().size(); i++) {
// authors.add(authorService.getById(i));
// }
// book.setBookAuthors(authors);
// System.out.println("Livre ajouté dans la base de données");
// bookService.insert(book);
// }

// @RequestMapping(value = "/books", method = RequestMethod.GET)
// private String login(Model model) {
// model.addAttribute("listeLivres", iServiceBook.findAll());
// return "books";
// }
//
// @RequestMapping(value = "/recherche", method = RequestMethod.POST)
// private String resultatRecherche(HttpServletRequest request, Model model) {
// String motRecherche = request.getParameter("motRecherche");
// model.addAttribute("listeLivres", iServiceBook.search(motRecherche));
// return "books";
// }
//
// @RequestMapping(value = "/bestseller", method = RequestMethod.GET)
// private String popularBook(Model model) {
// model.addAttribute("listeLivres", iServiceBook.popular());
// return "bestseller";
// }

// @PostMapping(value = "/book/add", consumes =
// MediaType.APPLICATION_JSON_VALUE)
// public void bookAdd(@RequestBody BookDto bookDto) {
//
// Book book = new Book(bookDto.getBookTitle(), bookDto.getDescription(),
// bookDto.getPrice(), bookDto.getPubDate(), bookDto.isPopular(),
// bookDto.getImagePath());
//
// book.setCategory(categoryService.getCategory(bookDto.getCategoryId()));
// book.setEditor(editorService.getEditor(bookDto.getEditorId()));
// List<Author> authors = new ArrayList<>();
// for(int i=0;i<bookDto.getAuthorsId().size();i++){
// authors.add(authorService.getAuthor(i));
// }
// book.setAuthors(authors);
//
// bookService.insertBook(book);
// }
//
// /*@PostMapping(value = "/book/update", consumes =
// MediaType.APPLICATION_JSON_VALUE)
// public void bookUpdate(@RequestBody BookDto bookDto) {
//
//
//
// bookService.updateBook(book);
// }*/
//
// @RequestMapping("book/get")
// public List<BookDto> getBooks(){
// List<BookDto> viewBooks = new ArrayList<>();
// List<Book> books = bookService.getAll();
// List<Integer> authorsId = new ArrayList<>();
// books.forEach(b -> {
// b.getAuthors().forEach(a -> authorsId.add(a.getAuthorId()));
// viewBooks.add(new BookDto(b.getBookTitle(), b.getBookDescription(),
// b.getBookPrice(), authorsId, b.getCategory().getCategoryId(),
// b.getEditor().getEditorId(), b.getPublicationDate(), b.isPopularBook(),
// b.getImagePath()));
// });
// return viewBooks;
// }
}
