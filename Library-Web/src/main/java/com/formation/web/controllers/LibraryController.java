package com.formation.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.dao.entities.Library;
import com.formation.service.exceptions.ServiceException;
import com.formation.service.interfaces.ILibraryService;
import com.formation.web.controller.dto.LibraryDto;

@RestController
@RequestMapping("/library")
public class LibraryController {

	@Autowired
	ILibraryService libraryService;

	/*********************** CREATE **************************************/
	@PutMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	private Resultat addLibrary(@RequestBody LibraryDto libraryDto) {

		Resultat resultat = new Resultat();
		try {
			Library library = new Library(libraryDto.getName(), libraryDto.getLibraryAddress(), libraryDto.getNumero());
			libraryService.insert(library);
			
			resultat.setPayload(library); //
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.ADD_LIBRARY_SUCCESS);
		} catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		} catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.ADD_LIBRARY_ERRORS);
			e.printStackTrace();
		}
		return resultat;
	}

	/*********************** READ ALL ************************************/
	@GetMapping(value = "/getAll")
	private Resultat getAllLibrary() {

		Resultat resultat = new Resultat();
		List<LibraryDto> listLibraries = new ArrayList<LibraryDto>();

		try {
			List<Library> libraries = libraryService.getAll();
			libraries.forEach(library -> {
				LibraryDto libraryDto = new LibraryDto(library.getName(), library.getNumero(), library.getAddress(), null, null);
				libraryDto.setLibraryId(library.getLibraryId());
				listLibraries.add(libraryDto);
				//library.getLibraryBookCopy(), library.getLibraryRegistrations()
				resultat.setPayload(listLibraries);
			});

			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.LIST_LIBRARY_SUCCESS);
		} catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		} catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.LIST_LIBRARY_ERRORS);
			e.printStackTrace();
		}
		return resultat;
	}

	/************************* READ ************************************/
	@GetMapping(value = "/get/{id}")
	private Resultat getLibraryById(@PathVariable(value = "id") int id) {

		Resultat resultat = new Resultat();
		try {
			Library library = libraryService.getById(id);
			LibraryDto libraryById = new LibraryDto(library.getName(), library.getNumero(), library.getAddress(), null, null);
			//libraryById.setLibraryBookCopyIds(library.getLibraryBookCopy()); //libraryBookCopyIds
			//libraryById.setLibraryRegistrationIds(libraryRegistrationIds);
			libraryById.setLibraryId(library.getLibraryId());

			resultat.setPayload(libraryById);
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.READ_LIBRARY_SUCCESS);
		} catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		} catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.READ_LIBRARY_ERRORS);
			e.printStackTrace();
		}
		return resultat;
	}

	/************************* UPDATE ************************************/
	@PostMapping(value = "/update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	private Resultat updateLibrary(@RequestBody LibraryDto libraryDto, @PathVariable(value = "id") int id) {

		Resultat resultat = new Resultat();
		try {
			Library library = libraryService.getById(id);
			library.setName(libraryDto.getName());
			library.setNumero(libraryDto.getNumero());
			library.setAddress(libraryDto.getLibraryAddress());
			// copy
			// registration

			libraryService.update(library);

			resultat.setPayload(library); //
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.UPDATE_LIBRARY_SUCCESS);
		} catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		} catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.UPDATE_LIBRARY_ERRORS);
			e.printStackTrace();
		}
		return resultat;
	}

	/************************* DELETE ************************************/
	@DeleteMapping(value = "/delete/{id}")
	private Resultat deleteLibrary(@PathVariable(value = "id") int id) {

		Resultat resultat = new Resultat();
		try {
			libraryService.delete(libraryService.getById(id));

			String message = "Deleted";
			resultat.setPayload(message); //
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.DELETE_LIBRARY_SUCCESS);
		} catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		} catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.DELETE_LIBRARY_ERRORS);
			e.printStackTrace();
		}
		return resultat;
	}
}
