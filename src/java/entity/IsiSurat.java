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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sau-mfh
 */
@Entity
@Table(name = "isi_surat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IsiSurat.findAll", query = "SELECT i FROM IsiSurat i"),
    @NamedQuery(name = "IsiSurat.findByIdisiSurat", query = "SELECT i FROM IsiSurat i WHERE i.idisiSurat = :idisiSurat"),
    @NamedQuery(name = "IsiSurat.findByIsiSurat", query = "SELECT i FROM IsiSurat i WHERE i.isiSurat = :isiSurat")})
public class IsiSurat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idisi_surat")
    private Integer idisiSurat;
    @Size(max = 45)
    @Column(name = "isi_surat")
    private String isiSurat;
    @JoinColumn(name = "kolom_surat_idkolom_surat", referencedColumnName = "idkolom_surat")
    @ManyToOne(optional = false)
    private KolomSurat kolomSuratIdkolomSurat;

    public IsiSurat() {
    }

    public IsiSurat(Integer idisiSurat) {
        this.idisiSurat = idisiSurat;
    }

    public Integer getIdisiSurat() {
        return idisiSurat;
    }

    public void setIdisiSurat(Integer idisiSurat) {
        this.idisiSurat = idisiSurat;
    }

    public String getIsiSurat() {
        return isiSurat;
    }

    public void setIsiSurat(String isiSurat) {
        this.isiSurat = isiSurat;
    }

    public KolomSurat getKolomSuratIdkolomSurat() {
        return kolomSuratIdkolomSurat;
    }

    public void setKolomSuratIdkolomSurat(KolomSurat kolomSuratIdkolomSurat) {
        this.kolomSuratIdkolomSurat = kolomSuratIdkolomSurat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idisiSurat != null ? idisiSurat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IsiSurat)) {
            return false;
        }
        IsiSurat other = (IsiSurat) object;
        if ((this.idisiSurat == null && other.idisiSurat != null) || (this.idisiSurat != null && !this.idisiSurat.equals(other.idisiSurat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.IsiSurat[ idisiSurat=" + idisiSurat + " ]";
    }
    
}
