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

import com.formation.dao.entities.Editor;
import com.formation.service.exceptions.ServiceException;
import com.formation.service.interfaces.IEditorService;
import com.formation.web.controller.dto.EditorDto;

@RestController
@RequestMapping("/editor")
public class EditorController {

	@Autowired
	IEditorService editorService;

	/*********************** CREATE **************************************/
	@PutMapping(value="/add", consumes =  MediaType.APPLICATION_JSON_VALUE)
	private Resultat addEditor(@RequestBody EditorDto editorDto) {
		
		Resultat resultat = new Resultat();
		try {
			Editor editor = new Editor(editorDto.getName(), editorDto.getEditorAddress());		
			editorService.insert(editor);
			
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.ADD_EDITOR_SUCCESS);
		}catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		}catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.ADD_EDITOR_ERRORS);
			e.printStackTrace();
		}
		return resultat;
	}

	/*********************** READ ALL ************************************/
	@GetMapping(value="/getAll")
	private Resultat getAllAuthor() {
		
		Resultat resultat = new Resultat();
		List<EditorDto> listEditors = new ArrayList<EditorDto>();
		
		try {
			List<Editor> editors = editorService.getAll();
			editors.forEach(editor -> {
				EditorDto editorDto = new EditorDto(editor.getName(), editor.getAddress());
				editorDto.setEditorId(editor.getEditorId());
				listEditors.add(editorDto);
				resultat.setPayload(listEditors);
			});
			
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.LIST_EDITOR_SUCCESS);
		}catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		}catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.LIST_EDITOR_ERRORS);
			e.printStackTrace();
		}
		return resultat;		
	}
	
	/************************* READ  ************************************/
	@GetMapping(value="/get/{id}")
	private Resultat getEditorById(@PathVariable(value="id") int id) {
		
		Resultat resultat = new Resultat();
		try {
			Editor editor = editorService.getById(id);
			EditorDto editorById = new EditorDto(editor.getName(), editor.getAddress());
			editorById.setEditorId(editor.getEditorId());
			
			resultat.setPayload(editorById);
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.READ_EDITOR_SUCCESS);
		}catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		}catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.READ_EDITOR_ERRORS);
			e.printStackTrace();
		}
		return resultat;
	}
	
	/************************* UPDATE  ************************************/
	@PostMapping(value="/update/{id}", consumes =  MediaType.APPLICATION_JSON_VALUE)
	private Resultat updateEditor(@RequestBody EditorDto editorDto, @PathVariable(value="id") int id) {
		
		Resultat resultat = new Resultat();
		try {
			Editor editor = editorService.getById(id);
			editor.setName(editorDto.getName());
			editor.setAddress(editorDto.getEditorAddress());
			
			editorService.update(editor);
			
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.UPDATE_EDITOR_SUCCESS);
		}catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		}catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.UPDATE_EDITOR_ERRORS);
			e.printStackTrace();
		}
		return resultat;
	}
	
	/************************* DELETE  ************************************/
	@DeleteMapping(value="/delete/{id}")
	private Resultat deleteEditor(@PathVariable(value="id") int id) {
		
		Resultat resultat = new Resultat();
		try {
			editorService.delete(editorService.getById(id));
			
			resultat.setSuccess(true);
			resultat.setMessage(ConstantsController.DELETE_AUTHOR_SUCCESS);
		}catch (ServiceException se) {
			resultat.setSuccess(false);
			resultat.setMessage(se.getMessage());
		}catch (Exception e) {
			resultat.setSuccess(false);
			resultat.setMessage(ConstantsController.DELETE_AUTHOR_ERRORS);
			e.printStackTrace();
		}
		return resultat;
		}
}