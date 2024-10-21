package com.example.BDSpringSD.Repository;

import com.example.BDSpringSD.Model.Propietarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REpropietarios extends JpaRepository<Propietarios, Integer> {

}
