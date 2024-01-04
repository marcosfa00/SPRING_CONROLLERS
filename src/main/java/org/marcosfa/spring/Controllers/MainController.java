package org.marcosfa.spring.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class MainController {
  /*  @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("message", "El arroz con huevos es una receta sencilla pero deliciosa");
        return "index";
    }*/
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("message", "dentro de la pagina about");
        return "about";
    }

    @GetMapping("/end")
    public String end(Model model) {
        model.addAttribute("message", "dentro de la pagina end");
        return "end";
    }

    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "Default Value") String name,Model model){
        model.addAttribute("name",name);
        return "greeting";
    }

    //Normal controller
    @GetMapping("/normal")
    public String normal(Model model){
        model.addAttribute("message","dentro de la pagina normal que no tiene request param");
        return "index2";
    }

   // Ahora e este controlador vamos a usar PathVariable
    @GetMapping("/normal/{name}")
    public String path(@PathVariable String name, Model model){
        model.addAttribute("Saludo","Hola "  + name);
        return "greeting2";
    }

    // Ahora e este controlador vamos a usar pedir Nombre y apellidos con PathVariable y RequestParam

}
