/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SearchStarPlayers.business;

import br.com.SearchStarPlayers.dominio.Servidor;
import br.com.SearchStarPlayers.repositorio.Repositorio;
import java.util.ArrayList;
import java.util.List;
import br.com.SearchStarPlayers.business.interfaces.ServidorInterface;
import java.util.Objects;

/**
 *
 * @author internet
 */
public class ServidorBusiness implements ServidorInterface{

    private ServidorBusiness servidor;

    public Servidor salvarServidor(Servidor Servidor) {
        Repositorio.servidorDBFake.add(Servidor);
        Servidor servidor;
        return Servidor;
    }



   
    public ServidorBusiness buscarServidorPorId(Integer id) {
        for( Servidor ServidorBusiness: Repositorio.servidorDBFake){
            if(Objects.equals(servidor.getId(), id)){
                return servidor;
            }
        } 
        return null;
    }
   
   
    public List<Servidor> buscarServidorPorNome(String nome) {           
        List<Servidor> listaDeServidorEncontrados = new ArrayList<Servidor>();        
        
        for(int i = 0; i< Repositorio.servidorDBFake.size();i++){
            Servidor servidor = Repositorio.servidorDBFake.get(i);
            if(servidor.getNomeServidor().startsWith(nome)){
                listaDeServidorEncontrados.add(servidor);
            }           
        }
        return listaDeServidorEncontrados;
    }

    public List<Servidor> buscarTodosServidor() {
      return Repositorio.servidorDBFake;  
    }

    @Override
    public Servidor salvarProduto(Servidor produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Servidor buscarProdutoPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Servidor> buscarProdutoPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Servidor> buscarTodosProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Integer getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
