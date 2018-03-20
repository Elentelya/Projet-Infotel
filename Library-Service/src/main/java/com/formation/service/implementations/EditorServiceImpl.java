package com.formation.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.entities.Editor;
import com.formation.dao.interfaces.IEditorDao;
import com.formation.dao.interfaces.IGenericDao;
import com.formation.service.interfaces.IEditorService;

@Service
@Transactional
public class EditorServiceImpl implements IEditorService{

    @Autowired
    private IEditorDao editorDao;
    @Autowired
    private IGenericDao genericDao;
    
	@Override
	public void insert(Editor editor) throws Exception {
		genericDao.save(editor);
	}
	@Override
	public Editor getById(int editorId) throws Exception {
		return genericDao.getById(Editor.class, editorId);
	}
	@Override
	public List<Editor> getAll() throws Exception {
		return genericDao.getAll(Editor.class);
	}
	@Override
	public void update(Editor editor) throws Exception {
		genericDao.saveOrUpdate(editor);
	}
	@Override
	public void delete(Editor editor) throws Exception {
		genericDao.delete(editor);
	}
	@Override
	public Editor getEditorByName(String editorname) throws Exception {
		return editorDao.getEditorByName(editorname);
	}
}
