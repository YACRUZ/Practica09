/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.practica9.controller;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yacruz
 */
public interface DAOEmpleado extends JpaRepository<Empleado, Long>  {
    
}
