package com.guia2tc100220.service;

import models.trip;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.text.ParseException;

@Service
public class TripServiceImpl implements ITripService {

    List<trip> lista = null;
    
    public TripServiceImpl(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
        this.lista = new LinkedList<trip>();
        try {
            trip trip1 = new trip();
            trip1.setId(1);
            trip1.setNombre("Rapel el volcatenango");
            trip1.setDescripcion("Hacer Rapel en los circuito de Volcatenango");
            trip1.setFecha(sdf.parse("10-05-2022"));
            trip1.setEstatus("Creada");
            trip1.setCosto(5.0);
            trip1.setDestacado(1);
            trip1.setImg("trip1.png");

            trip trip2 = new trip();
            trip2.setId(2);
            trip2.setNombre("Deslizadero en el picnic");
            trip2.setDescripcion("Deslizarte en el bonito tovogan en la colina");
            trip2.setFecha(sdf.parse("10-05-2022"));
            trip2.setEstatus("Creada");
            trip2.setCosto(5.0);
            trip2.setDestacado(0);
            trip2.setImg("trip2.png");

            trip trip3 = new trip();
            trip3.setId(3);
            trip3.setNombre("Comida y Flores");
            trip3.setDescripcion("Disfrutar de un amplio jardin en el cual podras comprar");
            trip3.setFecha(sdf.parse("10-05-2022"));
            trip3.setEstatus("Creada");
            trip3.setCosto(1.0);
            trip3.setDestacado(1);
            trip3.setImg("tirp3.png");

            trip trip4 = new trip();
            trip4.setId(4);
            trip4.setNombre("Caminatas");
            trip4.setDescripcion("Disfruta de hacer senderismo por las montañas chalatecas");
            trip4.setFecha(sdf.parse("01-02-2022"));
            trip4.setEstatus("Eliminada");
            trip4.setCosto(1.0);
            trip4.setDestacado(0);
            trip4.setImg("trip1.png");

            lista.add(trip1);
            lista.add(trip2);
            lista.add(trip3);
            lista.add(trip4);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<trip> BuscarTodos() {
        return lista;
    }

    @Override
    public trip buscarPorId(Integer idTrip) {
        for (trip trip : lista) {
            if(trip.getId() == idTrip) {
                return trip;
            }
        }
        return null;
    }

}
