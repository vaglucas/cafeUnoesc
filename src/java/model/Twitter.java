
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;


/**
 *
 * @author vag
 */
@Entity
@Table(name = "twitter")
public class Twitter implements Serializable, Comparable<Twitter> {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "idTwitter")
    private String idTwitter;
    @Column(name = "texto")
    private String text;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "data")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Column(name = "status")
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdTwitter() {
        return idTwitter;
    }

    public void setIdTwitter(String idTwitter) {
        this.idTwitter = idTwitter;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Twitter() {
    }

    public Twitter(Integer id, String idTwitter, String text, String usuario, Date data) {
        this.id = id;
        this.idTwitter = idTwitter;
        this.text = text;
        this.usuario = usuario;
        this.data = data;
    }

    
    
    @Override
    public int compareTo(Twitter o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
