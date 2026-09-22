package com.senai.cti_nexus.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Mapeia a classe como uma entidade do JPA associada à tabela "telemetria" no banco de dados
@Entity
@Table(name = "telemetria")
public class Telemetria {

    // Define o ID como chave primária com incremento automático gerado pelo banco
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_telemetria")
    private Long idTelemetria;

    // Atributo para o tipo de evento registrado (ex: UPLOAD, EXECUCAO_PYTHON, API_CALL)
    @Column(name = "evento", nullable = false, length = 100)
    private String evento;

    // Atributo para a data e hora exata em que o evento ocorreu, usando LocalDateTime
    @Column(name = "data_hora", nullable = false)
    private LocalDateTime dataHora;

    // Atributo para a mensagem descritiva detalhada do evento de telemetria
    @Column(name = "mensagem", nullable = false, length = 500)
    private String mensagem;

    // Construtor padrão vazio (obrigatório para o Spring/Hibernate instanciar a entidade)
    public Telemetria() {
    }

    // Construtor com parâmetros para inicializar os dados de telemetria
    public Telemetria(String evento, LocalDateTime dataHora, String mensagem) {
        this.evento = evento;
        this.dataHora = dataHora;
        this.mensagem = mensagem;
    }

    // Cria função para pegar o ID da telemetria
    public Long getIdTelemetria() {
        return idTelemetria;
    }

    // Função para setar o ID da telemetria
    public void setIdTelemetria(Long idTelemetria) {
        this.idTelemetria = idTelemetria;
    }

    // Cria função para pegar o nome do evento
    public String getEvento() {
        return evento;
    }

    // Função para setar o nome do evento
    public void setEvento(String evento) {
        this.evento = evento;
    }

    // Cria função para pegar a data e hora do evento
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    // Função para setar a data e hora do evento
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    // Cria função para pegar a mensagem descritiva
    public String getMensagem() {
        return mensagem;
    }

    // Função para setar a mensagem descritiva
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}