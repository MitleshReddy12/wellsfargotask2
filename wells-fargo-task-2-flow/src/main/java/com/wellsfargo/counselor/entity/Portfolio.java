package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long Id;

    @Column(nullable = false)
    private long clientId;


    protected Portfolio() {

    }

    public Portfolio(Long id, Long cliendId) {
        this.id = id;
        this.clientId = clientId;

    }
    public Long getId() {
        return id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId ) {
        this.clientId = clientId;
    }


}

