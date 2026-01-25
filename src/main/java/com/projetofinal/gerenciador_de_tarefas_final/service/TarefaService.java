package com.projetofinal.gerenciador_de_tarefas_final.service;

import com.projetofinal.gerenciador_de_tarefas_final.model.Tarefa;
import com.projetofinal.gerenciador_de_tarefas_final.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    @Autowired
    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}