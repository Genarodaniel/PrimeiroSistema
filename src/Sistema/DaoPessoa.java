/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import java.util.*;
/**
 *
 * @author adm
 */
public class DaoPessoa {
   
    public List<Pessoa> getLista(){
        return Dados.listaPessoas;
    }
    
    public boolean salvar(Pessoa obj){
        if(obj.getCodigo()==null){
            Integer codigo=Dados.listaPessoas.size()+1;
            obj.setCodigo(codigo);
            Dados.listaPessoas.add(obj);
            
        }
        else
        {
            System.out.println("Não foi possivel salvar \n Objeto ja existe");
    }
        return true;
    }
    
    public boolean remover (Pessoa obj){
        Dados.listaPessoas.remove(obj);
        return true;
    }
    
    
    
}

