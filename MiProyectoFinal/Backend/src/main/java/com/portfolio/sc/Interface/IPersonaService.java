
package com.portfolio.sc.Interface;

import com.portfolio.sc.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer la lista de Personas
    public List<Persona> getPersona();
    
    
    //guardar objeto de tipo Persona
    public void savePersona(Persona persona);
    
    
    //eliminar un objeto buscando por id
    public void deletePersona(Long id);
    
    
    //buscar una persona por id
    public Persona findPersona(Long id);
}
