package com.example.ioc;

import org.springframework.stereotype.Component;

@Component
public class SaludaImpl implements Saluda {

	Entorno entorno;
	
	public SaludaImpl(Entorno e) {
		this.entorno = e;
	}
	@Override
	public void saluda (String nombre) {
		entorno.write("Hola "+ nombre);
	}
}
