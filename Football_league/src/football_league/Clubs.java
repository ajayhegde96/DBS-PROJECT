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
@Table(name = "clubs", catalog = "football_league", schema = "")
@NamedQueries({
    @NamedQuery(name = "Clubs.findAll", query = "SELECT c FROM Clubs c")
    , @NamedQuery(name = "Clubs.findByClubId", query = "SELECT c FROM Clubs c WHERE c.clubId = :clubId")
    , @NamedQuery(name = "Clubs.findByName", query = "SELECT c FROM Clubs c WHERE c.name = :name")
    , @NamedQuery(name = "Clubs.findByCity", query = "SELECT c FROM Clubs c WHERE c.city = :city")
    , @NamedQuery(name = "Clubs.findByStadiumName", query = "SELECT c FROM Clubs c WHERE c.stadiumName = :stadiumName")
    , @NamedQuery(name = "Clubs.findByPosition", query = "SELECT c FROM Clubs c WHERE c.position = :position")})
public class Clubs implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLUB_ID")
    private String clubId;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "CITY")
    private String city;
    @Basic(optional = false)
    @Column(name = "STADIUM_NAME")
    private String stadiumName;
    @Basic(optional = false)
    @Column(name = "POSITION")
    private int position;

    public Clubs() {
    }

    public Clubs(String clubId) {
        this.clubId = clubId;
    }

    public Clubs(String clubId, String name, String city, String stadiumName, int position) {
        this.clubId = clubId;
        this.name = name;
        this.city = city;
        this.stadiumName = stadiumName;
        this.position = position;
    }

    public String getClubId() {
        return clubId;
    }

    public void setClubId(String clubId) {
        String oldClubId = this.clubId;
        this.clubId = clubId;
        changeSupport.firePropertyChange("clubId", oldClubId, clubId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        String oldStadiumName = this.stadiumName;
        this.stadiumName = stadiumName;
        changeSupport.firePropertyChange("stadiumName", oldStadiumName, stadiumName);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        int oldPosition = this.position;
        this.position = position;
        changeSupport.firePropertyChange("position", oldPosition, position);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clubId != null ? clubId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clubs)) {
            return false;
        }
        Clubs other = (Clubs) object;
        if ((this.clubId == null && other.clubId != null) || (this.clubId != null && !this.clubId.equals(other.clubId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "football_league.Clubs[ clubId=" + clubId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
