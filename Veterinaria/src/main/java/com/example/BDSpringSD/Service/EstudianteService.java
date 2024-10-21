package com.example.BDSpringSD.Service;

import com.example.BDSpringSD.InterfaceService.IPropietarioService;
import com.example.BDSpringSD.Model.Propietarios;
import com.example.BDSpringSD.Repository.REpropietarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService implements IPropietarioService {

    // AQUI SE IMPLMENTAN LOS METODOS QUE ESTAN EN INTERFACE SERVICE

    // SE DEBE INYECTAR LA INTERFACE QUE EXITENDE DE JPA

    @Autowired
    private REpropietarios repositorio;


    @Override
    public List<Propietarios> listar() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Propietarios est) {
        repositorio.save(est);
    }

    @Override
    public Optional<Propietarios> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {

        repositorio.deleteById(id);

    }
}
