package com.proyectoEjbBienes.ejb.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.proyectoEjbBienes.ejb.services.DestinoServices;
import proyectoEjbBienes.Catdestino;


@Stateless
public class DestinoServiceImpl implements DestinoServices {
	
	
	@PersistenceContext(name = "DestinoApp")
	private EntityManager em;
 
	@Override
	public void addDestino(Catdestino destino) {
	try {
		System.out.println(" Nombre addDestino "+ destino.getDescripcion());
		em.persist(destino);
		em.flush();
		System.out.println(" paso incluir");
	}catch(Exception e) {
	    e.printStackTrace();	
	}	
		
	}
	@Override
	public  List<Catdestino> getDestinos(){
		em.flush();
		Query queryObj = em.createNamedQuery("Catdestino.findAll");
        List<Catdestino>  listaDestino = queryObj.getResultList();
        System.out.println(" lista destino "+ listaDestino.size() );
            return listaDestino;
	}
	
}