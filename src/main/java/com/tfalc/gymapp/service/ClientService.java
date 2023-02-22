package com.tfalc.gymapp.service;

import com.tfalc.gymapp.entity.ClientEntity;
import com.tfalc.gymapp.entity.Form.ClientForm;
import com.tfalc.gymapp.entity.Form.ClientUpdateForm;
import com.tfalc.gymapp.entity.PhysicalAssessment;

import java.util.List;

public interface ClientService {
    /**
     * Create a client and save into database.
     * @param form related to the data to create a new client
     * @return Client created.
     */
    ClientEntity create(ClientForm form);

    /**
     * Retorna um Aluno que está no banco de dados de acordo com seu Id.
     * @param id id do Aluno que será exibido.
     * @return Aluno de acordo com o Id fornecido.
     */
    ClientEntity get(Long id);

    /**
     * Retorna os Alunos que estão no banco de dados.
     * @return Uma lista os Alunos que estão salvas no DB.
     */
    List<ClientEntity> getAll(String dataDeNascimento);

    List<ClientEntity> getAll();

    /**
     * Atualiza o Aluno.
     * @param id id do Aluno que será atualizado.
     * @param formUpdate formulário referente aos dados necessários para atualização do Aluno
     * no banco de dados.
     * @return Aluno recém-atualizado.
     */
    ClientEntity update(Long id, ClientUpdateForm formUpdate);

    /**
     * Deleta um Aluno específico.
     * @param id id do Aluno que será removido.
     */
    void delete(Long id);

    /**
     *
     * @param id id do aluno que será recuperada a lista de avaliações
     * @return uma lista com todas as avaliações do aluno de acordo com o Id
     */
    List<PhysicalAssessment> getAllPhysicalAssessment(Long id);

}
