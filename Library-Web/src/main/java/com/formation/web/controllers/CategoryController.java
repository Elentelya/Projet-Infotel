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

import com.formation.dao.entities.Category;
import com.formation.service.exceptions.ServiceException;
import com.formation.service.interfaces.ICategoryService;
import com.formation.web.controller.dto.CategoryDto;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	ICategoryService categoryService;

	/*********************** CREATE **************************************/
	@PutMapping(value="/add", consumes =  MediaType.APPLICATION_JSON_VALUE)
	private Resultat addCategory(@RequestBody CategoryDto categoryDto) {
		
		Resultat resultat = new Resultat();
		try {
			Category category = new Category(categoryDto.getName(), categoryDto.getDescription());		
			categoryService.insert(category);
			
			resultat.setPayload(category); //
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.ADD_CATEGORY_SUCCESS);
		}catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		}catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.ADD_CATEGORY_ERRORS);
			e.printStackTrace();
		}
		return resultat;
	}

	/*********************** READ ALL ************************************/
	@GetMapping(value="/getAll")
	private Resultat getAllCategories() {
		
		Resultat resultat = new Resultat();
		List<CategoryDto> listCategories = new ArrayList<CategoryDto>();
		
		try {
			List<Category> categories = categoryService.getAll();
			categories.forEach(cat -> {
				CategoryDto categoryDto = new CategoryDto(cat.getName(), cat.getDescription());
				categoryDto.setCategoryId(cat.getCategoryId());
				listCategories.add(categoryDto);
				resultat.setPayload(listCategories);
			});
			
			
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.LIST_CATEGORY_SUCCESS);
		}catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		}catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.LIST_CATEGORY_ERRORS);
			e.printStackTrace();
		}
		return resultat;		
	}
	
	/************************* READ  ************************************/
	@GetMapping(value="/get/{id}")
	private Resultat getCategoryById(@PathVariable(value="id") int id) {
		
		Resultat resultat = new Resultat();
		try {
			Category category = categoryService.getById(id);
			CategoryDto categoryDto = new CategoryDto(category.getName(), category.getDescription());
			categoryDto.setCategoryId(category.getCategoryId());
			
			resultat.setPayload(categoryDto);
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.READ_CATEGORY_SUCCESS);
		}catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		}catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.READ_CATEGORY_ERRORS);
			e.printStackTrace();
		}
		return resultat;
	}
	
	/************************* UPDATE  ************************************/
	@PostMapping(value="/update/{id}", consumes =  MediaType.APPLICATION_JSON_VALUE)
	private Resultat updateCategory(@RequestBody CategoryDto categoryDto, @PathVariable(value="id") int id) {
		
		Resultat resultat = new Resultat();
		try {
			Category category = categoryService.getById(id);
			category.setName(categoryDto.getName());
			category.setDescription(categoryDto.getDescription());
			
			categoryService.update(category);
			
			resultat.setPayload(category); //
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.UPDATE_CATEGORY_SUCCESS);
		}catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		}catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.UPDATE_CATEGORY_ERRORS);
			e.printStackTrace();
		}
		return resultat;
	}
	
	/************************* DELETE  ************************************/
	@DeleteMapping(value="/delete/{id}")
	private Resultat deleteCategory(@PathVariable(value="id") int id) {
		
		Resultat resultat = new Resultat();
		try {
			categoryService.delete(categoryService.getById(id));
			
			String message = "Deleted";
			resultat.setPayload(message); //
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.DELETE_CATEGORY_SUCCESS);
		}catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		}catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.DELETE_CATEGORY_ERRORS);
			e.printStackTrace();
		}
		return resultat;
		}
}