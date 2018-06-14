/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SearchStarPlayers.dominio;

import java.util.Objects;

/**
 *
 * @author internet
 */
public class Servidor {
    
    private int id;
    private String nomeServidor;
    private String modoDeJogo;
    private String ping;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeServidor() {
        return nomeServidor;
    }

    public void setNomeServidor(String nomeServidor) {
        this.nomeServidor = nomeServidor;
    }

    public String getModoDeJogo() {
        return modoDeJogo;
    }

    public void setModoDeJogo(String modoDeJogo) {
        this.modoDeJogo = modoDeJogo;
    }

    public String getValidade() {
        return ping;
    }

    public void setValidade(String validade) {
        this.ping = ping;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.nomeServidor);
        hash = 17 * hash + Objects.hashCode(this.modoDeJogo);
        hash = 17 * hash + Objects.hashCode(this.ping);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Servidor other = (Servidor) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nomeServidor, other.nomeServidor)) {
            return false;
        }
        if (!Objects.equals(this.modoDeJogo, other.modoDeJogo)) {
            return false;
        }
        if (!Objects.equals(this.ping, other.ping)) {
            return false;
        }
        return true;
    }
    
    
        
}
