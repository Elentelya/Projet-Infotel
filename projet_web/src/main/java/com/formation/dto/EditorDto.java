package com.formation.dto;

import java.util.List;

public class EditorDto {

	private int editorId;
	private String name;
	private int editorAddressId;
	public String getName() {
		return name;
	}
	
	public EditorDto(String name, int editorAddressId) {
		super();
		this.name = name;
		this.editorAddressId = editorAddressId;
	}
	
	public EditorDto() {
		super();
		// TODO Auto-generated constructor stub
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
}
