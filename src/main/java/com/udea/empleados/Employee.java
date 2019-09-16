/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.empleados;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 *
 * @author Lenovo
 */
@Document(collection = "employees")
@Data
@NoArgsConstructor
public class Employee {
    
@Id 
private String id;
 private @NonNull String email; 
private @NonNull String fullName; 
private @NonNull String managerEmail;

}