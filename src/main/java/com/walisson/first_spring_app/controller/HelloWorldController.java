package com.walisson.first_spring_app.controller;


import com.walisson.first_spring_app.domain.User;
import com.walisson.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//Controller -> Serve para criar as nossas ulrs e passar dados para o nosso service
//Funcionando basicamente para passar os dados necessarios para realizarmos a nossa regra de negocio
@RestController
@RequestMapping("opa")
public class HelloWorldController {

    // Autiwired -> Serve para indicar para o Spring que o nosso atributo tem que ser injetada.
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWord(){
        return helloWorldService.helloWorld("Walisson");
    }

    @PostMapping("/{id}")
    public String helloPost(@PathVariable("id") String id, @RequestBody User body ){
        return "Hello world " + body.getName();
    }
}
