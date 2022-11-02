package com.portfolio.pb.Service;

import com.portfolio.pb.Entity.Experiencia;
import com.portfolio.pb.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
     @Autowired
     RExperiencia rExperiencia;
     
     public List<Experiencia> lista() {
         return rExperiencia.findAll();
     }
     
     public Optional<Experiencia> getOne(int id) {
         return rExperiencia.findById(id);
     }
     
     public Optional<Experiencia> getByNombre(String nombre) {
         return rExperiencia.findByNombre(nombre);
     }
     
     public void guardar(Experiencia experiencia) {
         rExperiencia.save(experiencia);
     }
     
     public void borrar(int id) {
         rExperiencia.deleteById(id);
     }
     
     public boolean existsById(int id) {
         return rExperiencia.existsById(id);
     }
     
     public boolean existsByNombre(String nombre) {
         return rExperiencia.existsByNombre(nombre);
     }
}
