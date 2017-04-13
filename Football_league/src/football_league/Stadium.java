/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football_league;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ajayhegde
 */
@Entity
@Table(name = "stadium", catalog = "football_league", schema = "")
@NamedQueries({
    @NamedQuery(name = "Stadium.findAll", query = "SELECT s FROM Stadium s")
    , @NamedQuery(name = "Stadium.findByClubName", query = "SELECT s FROM Stadium s WHERE s.clubName = :clubName")
    , @NamedQuery(name = "Stadium.findByName", query = "SELECT s FROM Stadium s WHERE s.name = :name")
    , @NamedQuery(name = "Stadium.findByCapacity", query = "SELECT s FROM Stadium s WHERE s.capacity = :capacity")
    , @NamedQuery(name = "Stadium.findByCity", query = "SELECT s FROM Stadium s WHERE s.city = :city")})
public class Stadium implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "CLUB_NAME")
    private String clubName;
    @Id
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "CAPACITY")
    private int capacity;
    @Basic(optional = false)
    @Column(name = "CITY")
    private String city;

    public Stadium() {
    }

    public Stadium(String name) {
        this.name = name;
    }

    public Stadium(String name, String clubName, int capacity, String city) {
        this.name = name;
        this.clubName = clubName;
        this.capacity = capacity;
        this.city = city;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        String oldClubName = this.clubName;
        this.clubName = clubName;
        changeSupport.firePropertyChange("clubName", oldClubName, clubName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        int oldCapacity = this.capacity;
        this.capacity = capacity;
        changeSupport.firePropertyChange("capacity", oldCapacity, capacity);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stadium)) {
            return false;
        }
        Stadium other = (Stadium) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "football_league.Stadium[ name=" + name + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
