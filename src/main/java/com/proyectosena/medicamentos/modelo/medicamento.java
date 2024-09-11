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
 @Entity
 @Data
public class medicamento {
     //CONFIRME LA LLAVE PRIMARIA Y LUEGO LOS ATRIBUTOS
      @Id
      //se pueden identificar las columnas,especificar el tipo de contenido,las caracteristicas
     @Column
     private long idcodigo;
     @Column
     private String nombre;
     @Column
     private String gramaje;
     @Column
     private String caracteristicas;
     @Column
     private long existencias;
     
}
