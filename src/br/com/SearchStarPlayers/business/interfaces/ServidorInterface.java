/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.SearchStarPlayers.business.interfaces;
import br.com.SearchStarPlayers.dominio.Servidor;
import java.util.List;

public interface ServidorInterface {
    
    public Servidor salvarProduto(Servidor produto);
    
    public Servidor buscarProdutoPorId(Integer id);
    
    public List<Servidor> buscarProdutoPorNome(String nome);
    
    public List<Servidor> buscarTodosProdutos();
}
