package com.gestion.empleados.controlalor;

import com.gestion.empleados.modelo.Empleado;
import com.gestion.empleados.repositorio.EmpleadoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins= "http://localhost:4200")
public class EmpleadoControlador {
    
    @Autowired
    private EmpleadoRepositorio repositorio;
    
    //Metodo para listar todos los empleados
    @GetMapping("/empleados")
    public List<Empleado> listarEmpleados(){
        return repositorio.findAll();
    }
    
    //Metodo para guardar el empleado
    @PostMapping("/empleados")
    public Empleado guardarEmpleados(@RequestBody Empleado empleado){
        return repositorio.save(empleado);
    }
    
    
    
    
}
