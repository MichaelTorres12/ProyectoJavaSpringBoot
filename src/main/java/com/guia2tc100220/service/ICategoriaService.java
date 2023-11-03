package com.guia2tc100220.service;

import models.Categoria;

import java.util.List;

public interface ICategoriaService {

    List<Categoria> buscarTodas();

    Categoria buscarPorId(Integer idCategoria);

    Void guardar(Categoria categoria);

}
