
package com.portfolio.pb.Service;

import com.portfolio.pb.Entity.Persona;
import com.portfolio.pb.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService {
    
    @Autowired 
    IPersonaRepository ipersonaRepository;
    
    public List<Persona> lista() {
         return ipersonaRepository.findAll();
     }
     
     public Optional<Persona> getOne(int id) {
         return ipersonaRepository.findById(id);
     }
     
     public Optional<Persona> getByNombre(String nombre) {
         return ipersonaRepository.findByNombre(nombre);
     }
     
     public void guardar(Persona persona) {
         ipersonaRepository.save(persona);
     }
     
     public void borrar(int id) {
         ipersonaRepository.deleteById(id);
     }
     
     public boolean existsById(int id) {
         return ipersonaRepository.existsById(id);
     }
     
     public boolean existsByNombre(String nombre) {
         return ipersonaRepository.existsByNombre(nombre);
     }
}

    
