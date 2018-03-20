package com.formation.web.controller.dto;

public class EditorDto {

	private int editorId;
	private String name;
	private int editorAddressId;


	public EditorDto(String name, int editorAddressId) {
		super();
		this.name = name;
		this.editorAddressId = editorAddressId;
	}

	public EditorDto() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEditorAddressId() {
		return editorAddressId;
	}

	public void setEditorAddressId(int editorAddressId) {
		this.editorAddressId = editorAddressId;
	}

	public int getEditorId() {
		return editorId;
	}

	public void setEditorId(int editorId) {
		this.editorId = editorId;
	}
	
	
}