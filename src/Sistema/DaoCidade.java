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
public class DaoCidade {
    
    public List<Cidade> getLista(){
        return Dados.listaCidades;
    }
    
    public boolean salvar(Cidade obj){
        
        if(obj.getCodigo()==null){
            Integer codigo = Dados.listaCidades.size() +1;
            obj.setCodigo(codigo);
            Dados.listaCidades.add(obj);
             }
         return true;
        }


public boolean remover(Cidade obj){
    Dados.listaCidades.remove(obj);
    return true;
        
}


}
