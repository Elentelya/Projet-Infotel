package com.formation.dao.implementations;

import com.formation.dao.entities.Editor;
import com.formation.dao.interfaces.IEditorDao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EditorDaoImpl implements IEditorDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Editor getEditorByName(String editorname) {
    	return (Editor) sessionFactory.getCurrentSession().createQuery("FROM Editor e where e.name = :editorname").getSingleResult();
    }
}
