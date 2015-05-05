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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sau-mfh
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findByIduser", query = "SELECT u FROM User u WHERE u.iduser = :iduser"),
    @NamedQuery(name = "User.findByEmailIts", query = "SELECT u FROM User u WHERE u.emailIts = :emailIts"),
    @NamedQuery(name = "User.findByNama", query = "SELECT u FROM User u WHERE u.nama = :nama"),
    @NamedQuery(name = "User.findByRole", query = "SELECT u FROM User u WHERE u.role = :role")})
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "iduser")
    private String iduser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "email_its")
    private String emailIts;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "role")
    private String role;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userIduser")
    private Collection<IsiKomentar> isiKomentarCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userIduser")
    private Collection<Surat> suratCollection;

    public User() {
    }

    public User(String iduser) {
        this.iduser = iduser;
    }

    public User(String iduser, String emailIts, String nama, String role) {
        this.iduser = iduser;
        this.emailIts = emailIts;
        this.nama = nama;
        this.role = role;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getEmailIts() {
        return emailIts;
    }

    public void setEmailIts(String emailIts) {
        this.emailIts = emailIts;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @XmlTransient
    public Collection<IsiKomentar> getIsiKomentarCollection() {
        return isiKomentarCollection;
    }

    public void setIsiKomentarCollection(Collection<IsiKomentar> isiKomentarCollection) {
        this.isiKomentarCollection = isiKomentarCollection;
    }

    @XmlTransient
    public Collection<Surat> getSuratCollection() {
        return suratCollection;
    }

    public void setSuratCollection(Collection<Surat> suratCollection) {
        this.suratCollection = suratCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduser != null ? iduser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.iduser == null && other.iduser != null) || (this.iduser != null && !this.iduser.equals(other.iduser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.User[ iduser=" + iduser + " ]";
    }
    
}
