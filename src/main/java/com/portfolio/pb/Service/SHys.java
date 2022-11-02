package com.portfolio.pb.Service;

import com.portfolio.pb.Entity.Hys;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.pb.Repository.RHys;

@Transactional
@Service
public class SHys {

    @Autowired
    RHys rHys;

    public List<Hys> lista() {
        return rHys.findAll();
    }

    public Optional<Hys> getOne(int id) {
        return rHys.findById(id);
    }

    public Optional<Hys> getByNombre(String nombre) {
        return rHys.findByNombre(nombre);
    }

    public void guardar(Hys skill) {
        rHys.save(skill);
    }

    public void borrar(int id) {
        rHys.deleteById(id);
    }

    public boolean existsById(int id) {
        return rHys.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return rHys.existsByNombre(nombre);
    }
}
