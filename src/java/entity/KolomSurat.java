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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sau-mfh
 */
@Entity
@Table(name = "kolom_surat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KolomSurat.findAll", query = "SELECT k FROM KolomSurat k"),
    @NamedQuery(name = "KolomSurat.findByIdkolomSurat", query = "SELECT k FROM KolomSurat k WHERE k.idkolomSurat = :idkolomSurat"),
    @NamedQuery(name = "KolomSurat.findByNamaKolom", query = "SELECT k FROM KolomSurat k WHERE k.namaKolom = :namaKolom")})
public class KolomSurat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idkolom_surat")
    private Integer idkolomSurat;
    @Size(max = 45)
    @Column(name = "nama_kolom")
    private String namaKolom;
    @JoinColumn(name = "jenis_surat_idjenis_surat", referencedColumnName = "idjenis_surat")
    @ManyToOne(optional = false)
    private JenisSurat jenisSuratIdjenisSurat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kolomSuratIdkolomSurat")
    private Collection<IsiSurat> isiSuratCollection;

    public KolomSurat() {
    }

    public KolomSurat(Integer idkolomSurat) {
        this.idkolomSurat = idkolomSurat;
    }

    public Integer getIdkolomSurat() {
        return idkolomSurat;
    }

    public void setIdkolomSurat(Integer idkolomSurat) {
        this.idkolomSurat = idkolomSurat;
    }

    public String getNamaKolom() {
        return namaKolom;
    }

    public void setNamaKolom(String namaKolom) {
        this.namaKolom = namaKolom;
    }

    public JenisSurat getJenisSuratIdjenisSurat() {
        return jenisSuratIdjenisSurat;
    }

    public void setJenisSuratIdjenisSurat(JenisSurat jenisSuratIdjenisSurat) {
        this.jenisSuratIdjenisSurat = jenisSuratIdjenisSurat;
    }

    @XmlTransient
    public Collection<IsiSurat> getIsiSuratCollection() {
        return isiSuratCollection;
    }

    public void setIsiSuratCollection(Collection<IsiSurat> isiSuratCollection) {
        this.isiSuratCollection = isiSuratCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idkolomSurat != null ? idkolomSurat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KolomSurat)) {
            return false;
        }
        KolomSurat other = (KolomSurat) object;
        if ((this.idkolomSurat == null && other.idkolomSurat != null) || (this.idkolomSurat != null && !this.idkolomSurat.equals(other.idkolomSurat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.KolomSurat[ idkolomSurat=" + idkolomSurat + " ]";
    }
    
}
