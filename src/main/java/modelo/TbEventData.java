/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aldo
 */
@Entity
@Table(name = "TB_EVENT_DATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEventData.findAll", query = "SELECT t FROM TbEventData t"),
    @NamedQuery(name = "TbEventData.findByNEventIdn", query = "SELECT t FROM TbEventData t WHERE t.nEventIdn = :nEventIdn"),
    @NamedQuery(name = "TbEventData.findBySName", query = "SELECT t FROM TbEventData t WHERE t.sName = :sName"),
    @NamedQuery(name = "TbEventData.findBySDescription", query = "SELECT t FROM TbEventData t WHERE t.sDescription = :sDescription")})
public class TbEventData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nEventIdn")
    private Integer nEventIdn;
    @Basic(optional = false)
    @Column(name = "sName")
    private String sName;
    @Basic(optional = false)
    @Column(name = "sDescription")
    private String sDescription;

    public TbEventData() {
    }

    public TbEventData(Integer nEventIdn) {
        this.nEventIdn = nEventIdn;
    }

    public TbEventData(Integer nEventIdn, String sName, String sDescription) {
        this.nEventIdn = nEventIdn;
        this.sName = sName;
        this.sDescription = sDescription;
    }

    public Integer getNEventIdn() {
        return nEventIdn;
    }

    public void setNEventIdn(Integer nEventIdn) {
        this.nEventIdn = nEventIdn;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getSDescription() {
        return sDescription;
    }

    public void setSDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nEventIdn != null ? nEventIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEventData)) {
            return false;
        }
        TbEventData other = (TbEventData) object;
        if ((this.nEventIdn == null && other.nEventIdn != null) || (this.nEventIdn != null && !this.nEventIdn.equals(other.nEventIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TbEventData[ nEventIdn=" + nEventIdn + " ]";
    }
    
}
