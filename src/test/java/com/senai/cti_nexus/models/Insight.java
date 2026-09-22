package com.senai.cti_nexus.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// Mapeia a classe como uma entidade do JPA associada à tabela "insight" no banco de dados
@Entity
@Table(name = "insight")
public class Insight {

    // Define o ID como chave primária com incremento automático gerado pelo banco
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_insight")
    private Long idInsight;

    // Relacionamento N:1 - Vários insights podem estar associados a um único cliente
    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    // Relacionamento N:1 - Vários insights podem estar associados a um único contrato
    @ManyToOne
    @JoinColumn(name = "id_contrato", nullable = false)
    private Contrato contrato;

    // Atributo para o tipo de insight gerado (obrigatório, até 100 caracteres)
    @Column(name = "tipo", nullable = false, length = 100)
    private String tipo;

    // Atributo para a descrição detalhada do insight (obrigatório, suportando textos maiores com length 500)
    @Column(name = "descricao", nullable = false, length = 500)
    private String descricao;

    // Construtor padrão vazio (obrigatório para o Spring/Hibernate instanciar a entidade)
    public Insight() {
    }

    // Construtor com parâmetros para inicializar os dados do insight
    public Insight(Cliente cliente, Contrato contrato, String tipo, String descricao) {
        this.cliente = cliente;
        this.contrato = contrato;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    // Cria função para pegar o ID do insight
    public Long getIdInsight() {
        return idInsight;
    }

    // Função para setar o ID do insight
    public void setIdInsight(Long idInsight) {
        this.idInsight = idInsight;
    }

    // Cria função para pegar o cliente do insight
    public Cliente getCliente() {
        return cliente;
    }

    // Função para setar o cliente do insight
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Cria função para pegar o contrato do insight
    public Contrato getContrato() {
        return contrato;
    }

    // Função para setar o contrato do insight
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    // Cria função para pegar o tipo do insight
    public String getTipo() {
        return tipo;
    }

    // Função para setar o tipo do insight
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Cria função para pegar a descrição do insight
    public String getDescricao() {
        return descricao;
    }

    // Função para setar a descrição do insight
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}