/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectosena.medicamentos.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author User
 */
/**
 * Length----Longitud de los datos
 * Unique----Aplicacion de entidad
 * Nullable--El campo no sea nulo
 * @author User
 */
 @Entity
 @Data
public class medicamento {
     //CONFIRME LA LLAVE PRIMARIA Y LUEGO LOS ATRIBUTOS
     @Id
      //se pueden identificar las columnas,especificar el tipo de contenido,las caracteristicas
     @Column(name="IdCodigo")
     private long idcodigo;
     @Column(name="nombre",nullable=false,length=20,unique=true)
     private String nombre;
     @Column(nullable=false)
     private String gramaje;
     @Column(nullable=false)
     private String caracteristicas;
     @Column(nullable=false)
     private long existencias;
     
}
