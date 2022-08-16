
package com.portfolio.sc.Repository;

import com.portfolio.sc.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByNombreE(String nombre);
    public boolean existsByNombreE(String nombreE);
    
    
}