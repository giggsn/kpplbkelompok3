/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sau-mfh
 */
@Entity
@Table(name = "isi_komentar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IsiKomentar.findAll", query = "SELECT i FROM IsiKomentar i"),
    @NamedQuery(name = "IsiKomentar.findByIdisiKomentar", query = "SELECT i FROM IsiKomentar i WHERE i.idisiKomentar = :idisiKomentar"),
    @NamedQuery(name = "IsiKomentar.findByIsiKomentar", query = "SELECT i FROM IsiKomentar i WHERE i.isiKomentar = :isiKomentar")})
public class IsiKomentar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idisi_komentar")
    private Integer idisiKomentar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "isi_komentar")
    private String isiKomentar;
    @JoinColumn(name = "komentar_idkomentar", referencedColumnName = "idkomentar")
    @ManyToOne(optional = false)
    private Komentar komentarIdkomentar;
    @JoinColumn(name = "user_iduser", referencedColumnName = "iduser")
    @ManyToOne(optional = false)
    private User userIduser;

    public IsiKomentar() {
    }

    public IsiKomentar(Integer idisiKomentar) {
        this.idisiKomentar = idisiKomentar;
    }

    public IsiKomentar(Integer idisiKomentar, String isiKomentar) {
        this.idisiKomentar = idisiKomentar;
        this.isiKomentar = isiKomentar;
    }

    public Integer getIdisiKomentar() {
        return idisiKomentar;
    }

    public void setIdisiKomentar(Integer idisiKomentar) {
        this.idisiKomentar = idisiKomentar;
    }

    public String getIsiKomentar() {
        return isiKomentar;
    }

    public void setIsiKomentar(String isiKomentar) {
        this.isiKomentar = isiKomentar;
    }

    public Komentar getKomentarIdkomentar() {
        return komentarIdkomentar;
    }

    public void setKomentarIdkomentar(Komentar komentarIdkomentar) {
        this.komentarIdkomentar = komentarIdkomentar;
    }

    public User getUserIduser() {
        return userIduser;
    }

    public void setUserIduser(User userIduser) {
        this.userIduser = userIduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idisiKomentar != null ? idisiKomentar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IsiKomentar)) {
            return false;
        }
        IsiKomentar other = (IsiKomentar) object;
        if ((this.idisiKomentar == null && other.idisiKomentar != null) || (this.idisiKomentar != null && !this.idisiKomentar.equals(other.idisiKomentar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.IsiKomentar[ idisiKomentar=" + idisiKomentar + " ]";
    }
    
}
