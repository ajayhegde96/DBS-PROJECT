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
 * @author Ajay Hegde
 */
@Entity
@Table(name = "league", catalog = "football_league", schema = "")
@NamedQueries({
    @NamedQuery(name = "League_1.findAll", query = "SELECT l FROM League_1 l")
    , @NamedQuery(name = "League_1.findByPosition", query = "SELECT l FROM League_1 l WHERE l.position = :position")
    , @NamedQuery(name = "League_1.findByClubName", query = "SELECT l FROM League_1 l WHERE l.clubName = :clubName")
    , @NamedQuery(name = "League_1.findByWon", query = "SELECT l FROM League_1 l WHERE l.won = :won")
    , @NamedQuery(name = "League_1.findByLost", query = "SELECT l FROM League_1 l WHERE l.lost = :lost")
    , @NamedQuery(name = "League_1.findByDraw", query = "SELECT l FROM League_1 l WHERE l.draw = :draw")
    , @NamedQuery(name = "League_1.findByGoalsFor", query = "SELECT l FROM League_1 l WHERE l.goalsFor = :goalsFor")
    , @NamedQuery(name = "League_1.findByGoalsAgainst", query = "SELECT l FROM League_1 l WHERE l.goalsAgainst = :goalsAgainst")
    , @NamedQuery(name = "League_1.findByPoints", query = "SELECT l FROM League_1 l WHERE l.points = :points")})
public class League_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "POSITION")
    private int position;
    @Id
    @Basic(optional = false)
    @Column(name = "CLUB_NAME")
    private String clubName;
    @Basic(optional = false)
    @Column(name = "WON")
    private int won;
    @Basic(optional = false)
    @Column(name = "LOST")
    private int lost;
    @Basic(optional = false)
    @Column(name = "DRAW")
    private int draw;
    @Basic(optional = false)
    @Column(name = "GOALS_FOR")
    private int goalsFor;
    @Basic(optional = false)
    @Column(name = "GOALS_AGAINST")
    private int goalsAgainst;
    @Basic(optional = false)
    @Column(name = "POINTS")
    private int points;

    public League_1() {
    }

    public League_1(String clubName) {
        this.clubName = clubName;
    }

    public League_1(String clubName, int position, int won, int lost, int draw, int goalsFor, int goalsAgainst, int points) {
        this.clubName = clubName;
        this.position = position;
        this.won = won;
        this.lost = lost;
        this.draw = draw;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.points = points;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        int oldPosition = this.position;
        this.position = position;
        changeSupport.firePropertyChange("position", oldPosition, position);
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        String oldClubName = this.clubName;
        this.clubName = clubName;
        changeSupport.firePropertyChange("clubName", oldClubName, clubName);
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        int oldWon = this.won;
        this.won = won;
        changeSupport.firePropertyChange("won", oldWon, won);
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        int oldLost = this.lost;
        this.lost = lost;
        changeSupport.firePropertyChange("lost", oldLost, lost);
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        int oldDraw = this.draw;
        this.draw = draw;
        changeSupport.firePropertyChange("draw", oldDraw, draw);
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        int oldGoalsFor = this.goalsFor;
        this.goalsFor = goalsFor;
        changeSupport.firePropertyChange("goalsFor", oldGoalsFor, goalsFor);
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        int oldGoalsAgainst = this.goalsAgainst;
        this.goalsAgainst = goalsAgainst;
        changeSupport.firePropertyChange("goalsAgainst", oldGoalsAgainst, goalsAgainst);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        int oldPoints = this.points;
        this.points = points;
        changeSupport.firePropertyChange("points", oldPoints, points);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clubName != null ? clubName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof League_1)) {
            return false;
        }
        League_1 other = (League_1) object;
        if ((this.clubName == null && other.clubName != null) || (this.clubName != null && !this.clubName.equals(other.clubName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "football_league.League_1[ clubName=" + clubName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
