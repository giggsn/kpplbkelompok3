/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sau-mfh
 */
@Entity
@Table(name = "komentar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Komentar.findAll", query = "SELECT k FROM Komentar k"),
    @NamedQuery(name = "Komentar.findByIdkomentar", query = "SELECT k FROM Komentar k WHERE k.idkomentar = :idkomentar")})
public class Komentar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idkomentar")
    private Integer idkomentar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "komentarIdkomentar")
    private Collection<IsiKomentar> isiKomentarCollection;
    @JoinColumn(name = "surat_idsurat", referencedColumnName = "idsurat")
    @ManyToOne(optional = false)
    private Surat suratIdsurat;

    public Komentar() {
    }

    public Komentar(Integer idkomentar) {
        this.idkomentar = idkomentar;
    }

    public Integer getIdkomentar() {
        return idkomentar;
    }

    public void setIdkomentar(Integer idkomentar) {
        this.idkomentar = idkomentar;
    }

    @XmlTransient
    public Collection<IsiKomentar> getIsiKomentarCollection() {
        return isiKomentarCollection;
    }

    public void setIsiKomentarCollection(Collection<IsiKomentar> isiKomentarCollection) {
        this.isiKomentarCollection = isiKomentarCollection;
    }

    public Surat getSuratIdsurat() {
        return suratIdsurat;
    }

    public void setSuratIdsurat(Surat suratIdsurat) {
        this.suratIdsurat = suratIdsurat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idkomentar != null ? idkomentar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Komentar)) {
            return false;
        }
        Komentar other = (Komentar) object;
        if ((this.idkomentar == null && other.idkomentar != null) || (this.idkomentar != null && !this.idkomentar.equals(other.idkomentar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Komentar[ idkomentar=" + idkomentar + " ]";
    }
    
}
