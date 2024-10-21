package com.example.BDSpringSD.InterfaceService;


import com.example.BDSpringSD.Model.Propietarios;

import java.util.List;
import java.util.Optional;

public interface IPropietarioService {

    // AQUI SE VAN A CREAR LOS METODOS QUE VOY USAR

    public List<Propietarios> listar();

    public void guardar(Propietarios est);

    public Optional<Propietarios> editar(int id);

    public void eliminar (int id);


}
