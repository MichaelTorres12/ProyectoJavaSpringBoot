package com.guia2tc100220.controller;


import com.guia2tc100220.service.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import models.trip;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/trips")
public class TripController {

    @Autowired
    private ITripService servicesTrip;

    @GetMapping("/view/{id}")
    public String verDetalle(@PathVariable("id") int idTrip, Model model) {
        trip trip = servicesTrip.buscarPorId(idTrip);
        System.out.println("ID de Trip es: " + idTrip);
        model.addAttribute("trip", trip);

        return "trips/detalle";
    }

    @GetMapping("/delete")
    public String eliminar(@RequestParam("id") int IdTrip, Model model) {
        System.out.println("IdTrip: " + IdTrip);

        model.addAttribute("id", IdTrip);
        return "trips/mensaje";
    }

    @GetMapping("/index")
    public String mostrarIndex(Model model) {

        List<trip> lista = servicesTrip.BuscarTodos();
        model.addAttribute("trips", lista);
        System.out.println(lista);
        return "trips/listTrips";
    }
}


