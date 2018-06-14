/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SearchStarPlayers.business;

import br.com.SearchStarPlayers.business.interfaces.LoginInterface;
import br.com.SearchStarPlayers.dominio.Cliente;
import br.com.SearchStarPlayers.dominio.Clientetime;
import br.com.SearchStarPlayers.dominio.Usuario;
import br.com.SearchStarPlayers.repositorio.Repositorio;

/**
 *
 * @author internet
 */
public class LoginBusiness implements LoginInterface{

    @Override
    public boolean validaUsuario(Usuario usuario) {
        
        for(Cliente cliente: Repositorio.clienteDBFake){
            if(cliente.getNomeUsuario().
                    equals(usuario.getNomeUsuario()) &&
               cliente.getSenha().equals(cliente.getSenha())){
                return true;
            }   
        }
        
        for(Clientetime clientetime:Repositorio.clienteTimeDBFake){
            if(clientetime.getNomeUsuario().
                    equals(usuario.getNomeUsuario()) &&
                clientetime.getSenha().equals(usuario.getSenha())){
                return true;
            }
        }        
        return false;
    }

    @Override
    public Usuario validaUsuario(String nomeUsuario, String senha) {
        Usuario usuario = null;
        
        for(Cliente cliente: Repositorio.clienteDBFake){
            if(cliente.getNomeUsuario().
                    equals(nomeUsuario) &&
               cliente.getSenha().equals(senha)){
                usuario = new Usuario();
                usuario.setNomeUsuario(nomeUsuario);
                usuario.setSenha(senha);
                usuario.setEmail(false);
                        
            }   
        }        
        for(Clientetime clienteTime:Repositorio.clienteTimeDBFake){
            if(clienteTime.getNomeUsuario().
                    equals(nomeUsuario) &&
                clienteTime.getSenha().equals(senha)){
                
                usuario = new Usuario();
                usuario.setNomeUsuario(nomeUsuario);
                usuario.setSenha(senha);
                usuario.setClienteTime(true);                
            }
        }        
        return usuario;
    }
    
}








