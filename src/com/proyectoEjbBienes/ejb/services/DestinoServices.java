package com.proyectoEjbBienes.ejb.services;


import java.util.List;

import javax.ejb.Remote;

import proyectoEjbBienes.Catdestino;
@Remote
public interface DestinoServices {
	public void addDestino(Catdestino destino);
	public  List<Catdestino> getDestinos();

}
