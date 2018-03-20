package com.formation.dao.interfaces;

import com.formation.dao.entities.Editor;

public interface IEditorDao {

    Editor getEditorByName(String editorname);
}
