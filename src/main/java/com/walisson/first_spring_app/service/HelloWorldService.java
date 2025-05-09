package com.walisson.first_spring_app.service;

import org.springframework.stereotype.Service;

// As classes de serviço -> Servem para realizar toda a regra do nosso programa.
// EX.: O nosso controller passa algum dado(nome) para o nosso service e o service faz a operação que deve ser realizada com o nome.
@Service
public class HelloWorldService {

    public String helloWorld(String name){
        return "Hello World " + name;
    }
}
