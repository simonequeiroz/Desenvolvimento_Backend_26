package com.senai.cti_nexus.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// Mapeia a classe como uma entidade do JPA associada à tabela "contrato" no banco de dados
@Entity
@Table(name = "contrato")
public class Contrato {

    // Define o ID como chave primária com incremento automático gerado pelo banco
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrato")
    private Long idContrato;

    // Relacionamento N:1 - Vários contratos podem pertencer a um único cliente
    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    // Relacionamento N:1 - Vários contratos podem estar associados a um único serviço
    @ManyToOne
    @JoinColumn(name = "id_servico", nullable = false)
    private Servico servico;

    // Atributo para a data de início do contrato (obrigatório, usando LocalDate para datas sem hora)
    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    // Atributo para a data de término do contrato (opcional)
    @Column(name = "data_fim")
    private LocalDate dataFim;

    // Atributo para o valor financeiro do contrato usando BigDecimal para precisão monetária
    @Column(
        name = "valor",
        nullable = false,
        precision = 12,
        scale = 2
    )
    private BigDecimal valor;

    // Atributo booleano para indicar se o contrato está ativo
    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

    // Construtor padrão vazio (obrigatório para o Spring/Hibernate instanciar a entidade)
    public Contrato() {
    }

    // Construtor com parâmetros para inicializar os dados principais do contrato
    public Contrato(
        Cliente cliente,
        Servico servico,
        LocalDate dataInicio,
        LocalDate dataFim,
        BigDecimal valor,
        Boolean ativo
    ) {
        this.cliente = cliente;
        this.servico = servico;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
        this.ativo = ativo;
    }

    // Cria função para pegar o ID do contrato
    public Long getIdContrato() {
        return idContrato;
    }

    // Função para setar o ID do contrato
    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    // Cria função para pegar o cliente associado ao contrato
    public Cliente getCliente() {
        return cliente;
    }

    // Função para setar o cliente associado ao contrato
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Cria função para pegar o serviço associado ao contrato
    public Servico getServico() {
        return servico;
    }

    // Função para setar o serviço associado ao contrato
    public void setServico(Servico servico) {
        this.servico = servico;
    }

    // Cria função para pegar a data de início
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    // Função para setar a data de início
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    // Cria função para pegar a data de fim
    public LocalDate getDataFim() {
        return dataFim;
    }

    // Função para setar a data de fim
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    // Cria função para pegar o valor do contrato
    public BigDecimal getValor() {
        return valor;
    }

    // Função para setar o valor do contrato
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    // Cria função para verificar se está ativo
    public Boolean getAtivo() {
        return ativo;
    }

    // Função para setar o status de ativo
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}