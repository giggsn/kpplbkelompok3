/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sau-mfh
 */
@Entity
@Table(name = "surat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Surat.findAll", query = "SELECT s FROM Surat s"),
    @NamedQuery(name = "Surat.findByIdsurat", query = "SELECT s FROM Surat s WHERE s.idsurat = :idsurat"),
    @NamedQuery(name = "Surat.findByNomorSurat", query = "SELECT s FROM Surat s WHERE s.nomorSurat = :nomorSurat"),
    @NamedQuery(name = "Surat.findByTanggalDibuat", query = "SELECT s FROM Surat s WHERE s.tanggalDibuat = :tanggalDibuat"),
    @NamedQuery(name = "Surat.findByStatus", query = "SELECT s FROM Surat s WHERE s.status = :status")})
public class Surat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsurat")
    private Integer idsurat;
    @Size(max = 20)
    @Column(name = "nomor_surat")
    private String nomorSurat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tanggal_dibuat")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggalDibuat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "status")
    private String status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "suratIdsurat")
    private Collection<Komentar> komentarCollection;
    @JoinColumn(name = "jenis_surat_idjenis_surat", referencedColumnName = "idjenis_surat")
    @ManyToOne(optional = false)
    private JenisSurat jenisSuratIdjenisSurat;
    @JoinColumn(name = "user_iduser", referencedColumnName = "iduser")
    @ManyToOne(optional = false)
    private User userIduser;

    public Surat() {
    }

    public Surat(Integer idsurat) {
        this.idsurat = idsurat;
    }

    public Surat(Integer idsurat, Date tanggalDibuat, String status) {
        this.idsurat = idsurat;
        this.tanggalDibuat = tanggalDibuat;
        this.status = status;
    }

    public Integer getIdsurat() {
        return idsurat;
    }

    public void setIdsurat(Integer idsurat) {
        this.idsurat = idsurat;
    }

    public String getNomorSurat() {
        return nomorSurat;
    }

    public void setNomorSurat(String nomorSurat) {
        this.nomorSurat = nomorSurat;
    }

    public Date getTanggalDibuat() {
        return tanggalDibuat;
    }

    public void setTanggalDibuat(Date tanggalDibuat) {
        this.tanggalDibuat = tanggalDibuat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<Komentar> getKomentarCollection() {
        return komentarCollection;
    }

    public void setKomentarCollection(Collection<Komentar> komentarCollection) {
        this.komentarCollection = komentarCollection;
    }

    public JenisSurat getJenisSuratIdjenisSurat() {
        return jenisSuratIdjenisSurat;
    }

    public void setJenisSuratIdjenisSurat(JenisSurat jenisSuratIdjenisSurat) {
        this.jenisSuratIdjenisSurat = jenisSuratIdjenisSurat;
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
        hash += (idsurat != null ? idsurat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Surat)) {
            return false;
        }
        Surat other = (Surat) object;
        if ((this.idsurat == null && other.idsurat != null) || (this.idsurat != null && !this.idsurat.equals(other.idsurat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Surat[ idsurat=" + idsurat + " ]";
    }
    
}
