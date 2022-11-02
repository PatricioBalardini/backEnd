package com.portfolio.pb.Security.Service;

import com.portfolio.pb.Security.Entity.Rol;
import com.portfolio.pb.Security.Enums.RolNombre;
import com.portfolio.pb.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void guardar(Rol rol) {
        irolRepository.save(rol);
    }
}
