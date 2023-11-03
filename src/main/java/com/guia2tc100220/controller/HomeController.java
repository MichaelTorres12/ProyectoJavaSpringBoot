package com.guia2tc100220.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import models.trip;
import com.guia2tc100220.service.ITripService;

@Controller
public class HomeController {

    @Autowired(required=true)
    private ITripService tripService;

    @GetMapping("/")
    public String mostrarHome(Model model) {

        List<trip> lista = tripService.BuscarTodos();
        model.addAttribute("trips", lista);
        return "home";
    }




    @GetMapping("/listado")
    public String mostrarListado(Model model) {
    	List<String> lista = new LinkedList<String>();
    	lista.add("En la Montaña");
    	lista.add("En la Ciudad");
    	lista.add("En los pueblos");
    	lista.add("En la playas");
    	model.addAttribute("listadoTrips", lista);
    	
    	return "listado";
    }

    @GetMapping("/detalle/{id}")
    public String mostrarDetalle(@PathVariable("id") int id) {

        System.out.println(id);
        return "detalle";
    }


    @GetMapping("/tabla")
    public String mostrarTabla(Model model) {
        List<trip> lista = tripService.BuscarTodos();
        model.addAttribute("trips", lista);

        return "tabla";
    }

}
