/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SearchStarPlayers.business.interfaces;

import br.com.SearchStarPlayers.ClienteTime;
import java.util.List;

/**
 *
 * @author internet
 */
public interface ClienteTimeInterface {
    
    public ClienteTime salvar(ClienteTime clientetime);
    
    public ClienteTime buscarClienteTimePorId(Integer id);
    
    public List<ClienteTime> buscarClienteTimePorNome(String nome);
    
    public List<ClienteTime> buscarTodosClienteTime();
}
