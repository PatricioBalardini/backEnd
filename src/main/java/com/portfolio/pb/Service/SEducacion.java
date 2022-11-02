package com.portfolio.pb.Service;

import com.portfolio.pb.Entity.Educacion;
import com.portfolio.pb.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {

    @Autowired
    REducacion rEducacion;

    public List<Educacion> lista() {
        return rEducacion.findAll();
    }

    public Optional<Educacion> getOne(int id) {
        return rEducacion.findById(id);
    }

    public Optional<Educacion> getByNombre(String nombre) {
        return rEducacion.findByNombre(nombre);
    }

    public void guardar(Educacion educacion) {
        rEducacion.save(educacion);
    }

    public void borrar(int id) {
        rEducacion.deleteById(id);
    }

    public boolean existsById(int id) {
        return rEducacion.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return rEducacion.existsByNombre(nombre);
    }
}
