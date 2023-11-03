package com.guia2tc100220.controller;

import com.guia2tc100220.service.ICategoriaService;
import models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/categorias")
public class categoriaTripController {


	@Autowired
	private ICategoriaService categoriaService;
	//@RequestMapping(value="/index", method= RequestMethod.GET)
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Categoria> lista = categoriaService.buscarTodas();
		model.addAttribute("categorias", lista);
		System.out.println(lista);

		return "categoriasTrip/listCategoria";
		
	}
	
	//@RequestMapping(value = "/create", method = RequestMethod.GET)
	@GetMapping("/create")
	public String crear() {
		
		return "categoriasTrip/formCategoria";
	}

	//@RequestMapping(value = "/save", method = RequestMethod.POST)
	@PostMapping("/save")
	public String guardar(@RequestParam("nombre") String nombre, @RequestParam("descripcion") String descripcion) {
		System.out.println("Categoria Nombre: " + nombre);
		System.out.println("Descripcion: " + descripcion);
		return "categoriasTrip/listCategoria";
	}
}
