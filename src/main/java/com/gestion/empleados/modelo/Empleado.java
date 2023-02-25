package com.gestion.empleados.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", length = 60, nullable=false)
    private String nombre;
    
    @Column(name = "apellido", length = 60, nullable=false)
    private String apellido;
    
    @Column(name = "email", length = 60, nullable=false, unique = true)
    private String email;
    
    public Empleado(){
    }

    public Empleado(Long id , String nombre , String apellido , String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    
}
