package com.proyectoEjbBienes.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.persistence.Query;

import com.proyectoEjbBienes.ejb.services.DestinoServices;
import proyectoEjbBienes.Catdestino;;
 
@ManagedBean
public class DestinoController {
	
	@EJB
	private DestinoServices service;
	
	private Catdestino destino = new Catdestino();
	private List<Catdestino> destinos; 
	 
	public void setDestinos(List<Catdestino> destinos) {
		this.destinos = destinos;
	}


	
 
	public Catdestino getDestino() {
		return destino;
	}
 
	public void setDestino(Catdestino destino) {
		this.destino = destino;
	}
 
	public void saveDestino(Catdestino destino) {
		System.out.println("Nombre " + destino.getNombre());
		service.addDestino(destino);
	}

	
	public List <Catdestino> getDestinos(){
		return service.getDestinos();
	}
}

	
	
