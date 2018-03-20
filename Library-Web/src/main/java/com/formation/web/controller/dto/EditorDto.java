package com.formation.web.controller.dto;

public class EditorDto {

	private int editorId;
	private String name;
	private String editorAddress;


	public EditorDto(String name, String editorAddress) {
		super();
		this.name = name;
		this.editorAddress = editorAddress;
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

	public String getEditorAddress() {
		return editorAddress;
	}

	public void setEditorAddress(String editorAddress) {
		this.editorAddress = editorAddress;
	}

	public int getEditorId() {
		return editorId;
	}

	public void setEditorId(int editorId) {
		this.editorId = editorId;
	}
	
	
}