package com.rest.services;

import java.util.Date;
import java.util.LinkedList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.joda.time.DateTime;

import com.rest.security.Hashing;
import com.rest.services.model.ApiMessage;
import com.rest.services.model.Persona;
import com.rest.util.Parser;

@Path("")
public class GeneralWebService {
	
	@GET
	@Path("person")
	@Produces({ MediaType.APPLICATION_JSON })
	public String person() {
		try {
			Persona p = new Persona();
			p.setDni(Hashing.sha256Encode("3-321-7AD"));
			p.setEdad(32);
			p.setNombre("Mirna Bethancourt");
			p.setOcupacion("Ingeniero de Sistemas");
			p.setFechaNacimiento(new Date(DateTime.parse("1987-01-25").getMillis()));
			return Parser.objetoAJson(p);
		} catch (Exception e) {
			e.printStackTrace();
			return Parser.objetoAJson(new ApiMessage(ApiMessage.TYPE_ERROR, ApiMessage.CODE_APP_ERROR, "Error al procesar la solicitud")); 
		}
	}
	
	@GET
	@Path("person/list")
	@Produces({ MediaType.APPLICATION_JSON })
	public String personList() {
		try {
			Persona p = new Persona();
			p.setDni(Hashing.sha256Encode("3-321-7AD"));
			p.setEdad(32);
			p.setNombre("Mirna Bethancourt");
			p.setOcupacion("Ingeniero de Sistemas");
			p.setFechaNacimiento(new Date(DateTime.parse("1999-12-25").getMillis()));
			
			Persona p2 = new Persona();
			p2.setDni(Hashing.sha256Encode("5-987-987A"));
			p2.setEdad(27);
			p2.setNombre("Manuel Lasso");
			p2.setOcupacion("Ingeniero de Sistemas Base de Datos");
			p2.setFechaNacimiento(new Date(DateTime.parse("1987-01-25T15:30:45").getMillis()));
			
			LinkedList<Persona> list = new LinkedList<Persona>();
			list.add(p);
			list.add(p2);
			
			return Parser.objetoAJson(list);
		} catch (Exception e) {
			e.printStackTrace();
			return Parser.objetoAJson(new ApiMessage(ApiMessage.TYPE_ERROR, ApiMessage.CODE_APP_ERROR, "Error al procesar la solicitud")); 
		}
	}
	
	@POST
	@Path("person/add")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public String addPerson(Persona input) {
		try {
			Persona p = input;
			return "Persona " + p.getNombre() + " agregada!";   
		}catch(Exception e) {
			return Parser.objetoAJson(new ApiMessage(ApiMessage.TYPE_ERROR, ApiMessage.CODE_APP_ERROR, "Error al procesar la solicitud")); 
		}
	}
}
