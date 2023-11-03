package com.guia2tc100220.service;

import models.Categoria;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;


@Service
public class CategoriaServiceImpl implements ICategoriaService{

    List<Categoria> lista = null;

    public CategoriaServiceImpl() {
        this.lista = new LinkedList<Categoria>();
        try{
            Categoria categoria1 = new Categoria();
            categoria1.setId(1);
            categoria1.setNombre("En la Playa");
            categoria1.setDescripcion("Servicios de entretenimiento en la playa");

            Categoria categoria2 = new Categoria();
            categoria2.setId(2);
            categoria2.setNombre("En la Ciudad");
            categoria2.setDescripcion("Clasificación de trips en la ciudad");

            Categoria categoria3 = new Categoria();
            categoria3.setId(3);
            categoria3.setNombre("En la Montaña");
            categoria3.setDescripcion("Interesantes actividades en la montaña");

            lista.add(categoria1);
            lista.add(categoria2);
            lista.add(categoria3);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Categoria> buscarTodas() { return  lista; }

    @Override
    public Categoria buscarPorId(Integer idCategoria) {
        return null;
    }

    @Override
    public Void guardar(Categoria categoria) {
        return null;
    }
}
