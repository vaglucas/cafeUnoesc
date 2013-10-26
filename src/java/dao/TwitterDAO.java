/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Twitter;

/**
 *
 * @author vag
 */
public interface TwitterDAO {
    
    String incluir(Twitter tt);
    List<Twitter> getTwitters();
    List<Twitter> getTwittersPorTexto(String filtro);
    List<Twitter> getTwittersPorUsuario(String filtro);
    String getTwittersPorId(String id);
    
    
}
