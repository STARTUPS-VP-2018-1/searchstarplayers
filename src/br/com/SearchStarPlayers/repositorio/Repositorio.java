/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SearchStarPlayers.repositorio;

import br.com.SearchStarPlayers.dominio.Cliente;
import br.com.SearchStarPlayers.dominio.Clientetime;
import br.com.SearchStarPlayers.dominio.Servidor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author internet
 */
public class Repositorio {
    
    public static List<Servidor> servidorDBFake = new ArrayList<Servidor>();
    public static List<Cliente> clienteDBFake = new ArrayList<Cliente>();
    public static List<Clientetime> clienteTimeDBFake = new ArrayList<Clientetime>();
    
}
