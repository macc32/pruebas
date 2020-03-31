package com.proyectoabp.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.proyectoabp.ws.rest.vo.VOUsuario;

@Path("/Usuario")
public class ServiceLogin {
	@POST
    @Path("/validaUsuario")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public void validaUsuario(VOUsuario vo) {
        System.out.println("hola :)");
    }
}
