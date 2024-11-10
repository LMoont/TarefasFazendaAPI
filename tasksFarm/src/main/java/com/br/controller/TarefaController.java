package com.br.controller;

import com.br.repository.entity.Tarefa;
import com.br.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }


    @PostMapping
    public Tarefa adicionarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }
}