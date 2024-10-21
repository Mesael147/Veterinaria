package com.example.BDSpringSD.Controller;

import com.example.BDSpringSD.InterfaceService.IPropietarioService;
import com.example.BDSpringSD.Model.Propietarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class propietariosController {

    @Autowired
    private IPropietarioService service;


    @GetMapping("/listar")
    public String listarPropietarios(Model model){

        model.addAttribute("titulo","Spring DB");
        model.addAttribute("cuerpo","LISTA DE ESTUDIANTES");

        model.addAttribute("datos", service.listar());
        return "index";
    }

    @GetMapping("/nuevo")
    public String formAgregarPropietarios(Model model){

        model.addAttribute("titulo", "Nuevo");
        model.addAttribute("cuerpo", "USUARIO NUEVO");

        model.addAttribute("estu",new Propietarios());
        return "nuevo";
    }

    @PostMapping("/guardar")
    public String guardarPropietario(@ModelAttribute Propietarios est){

        service.guardar(est);

        return "redirect:/listar";
    }


    @GetMapping("/editar/{id}")
    public String editarEstudiante(@PathVariable("id") int id, Model model){


        model.addAttribute("estu", service.editar(id));

        return "nuevo";

    }

    @GetMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable("id") int id){

       service.eliminar(id);

        return "redirect:/listar";

    }














}
