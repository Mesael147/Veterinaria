package com.example.BDSpringSD.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

@Data
@Entity
@Table(name = "propietarios")
public class Propietarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PropietarioID;
    private String nombre;
    private VarcharJdbcType direccion;
    private int telefono;





}
