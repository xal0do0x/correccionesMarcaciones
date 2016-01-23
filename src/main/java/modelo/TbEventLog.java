/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aldo
 */
@Entity
@Table(name = "TB_EVENT_LOG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEventLog.findAll", query = "SELECT t FROM TbEventLog t"),
    @NamedQuery(name = "TbEventLog.findByNEventLogIdn", query = "SELECT t FROM TbEventLog t WHERE t.nEventLogIdn = :nEventLogIdn"),
    @NamedQuery(name = "TbEventLog.findByNDateTime", query = "SELECT t FROM TbEventLog t WHERE t.tbEventLogPK.nDateTime = :nDateTime"),
    @NamedQuery(name = "TbEventLog.findByNReaderIdn", query = "SELECT t FROM TbEventLog t WHERE t.tbEventLogPK.nReaderIdn = :nReaderIdn"),
    @NamedQuery(name = "TbEventLog.findByNEventIdn", query = "SELECT t FROM TbEventLog t WHERE t.tbEventLogPK.nEventIdn = :nEventIdn"),
    @NamedQuery(name = "TbEventLog.findByNUserID", query = "SELECT t FROM TbEventLog t WHERE t.tbEventLogPK.nUserID = :nUserID"),
    @NamedQuery(name = "TbEventLog.findByNIsLog", query = "SELECT t FROM TbEventLog t WHERE t.nIsLog = :nIsLog"),
    @NamedQuery(name = "TbEventLog.findByNTNAEvent", query = "SELECT t FROM TbEventLog t WHERE t.nTNAEvent = :nTNAEvent"),
    @NamedQuery(name = "TbEventLog.findByNIsUseTA", query = "SELECT t FROM TbEventLog t WHERE t.nIsUseTA = :nIsUseTA"),
    @NamedQuery(name = "TbEventLog.findByNType", query = "SELECT t FROM TbEventLog t WHERE t.nType = :nType")})
public class TbEventLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TbEventLogPK tbEventLogPK;
    @Basic(optional = false)
    @Column(name = "nEventLogIdn")
    private int nEventLogIdn;
    @Basic(optional = false)
    @Column(name = "nIsLog")
    private short nIsLog;
    @Basic(optional = false)
    @Column(name = "nTNAEvent")
    private short nTNAEvent;
    @Basic(optional = false)
    @Column(name = "nIsUseTA")
    private short nIsUseTA;
    @Basic(optional = false)
    @Column(name = "nType")
    private short nType;

    public TbEventLog() {
    }

    public TbEventLog(TbEventLogPK tbEventLogPK) {
        this.tbEventLogPK = tbEventLogPK;
    }

    public TbEventLog(TbEventLogPK tbEventLogPK, int nEventLogIdn, short nIsLog, short nTNAEvent, short nIsUseTA, short nType) {
        this.tbEventLogPK = tbEventLogPK;
        this.nEventLogIdn = nEventLogIdn;
        this.nIsLog = nIsLog;
        this.nTNAEvent = nTNAEvent;
        this.nIsUseTA = nIsUseTA;
        this.nType = nType;
    }

    public TbEventLog(int nDateTime, int nReaderIdn, int nEventIdn, int nUserID) {
        this.tbEventLogPK = new TbEventLogPK(nDateTime, nReaderIdn, nEventIdn, nUserID);
    }

    public TbEventLogPK getTbEventLogPK() {
        return tbEventLogPK;
    }

    public void setTbEventLogPK(TbEventLogPK tbEventLogPK) {
        this.tbEventLogPK = tbEventLogPK;
    }

    public int getNEventLogIdn() {
        return nEventLogIdn;
    }

    public void setNEventLogIdn(int nEventLogIdn) {
        this.nEventLogIdn = nEventLogIdn;
    }

    public short getNIsLog() {
        return nIsLog;
    }

    public void setNIsLog(short nIsLog) {
        this.nIsLog = nIsLog;
    }

    public short getNTNAEvent() {
        return nTNAEvent;
    }

    public void setNTNAEvent(short nTNAEvent) {
        this.nTNAEvent = nTNAEvent;
    }

    public short getNIsUseTA() {
        return nIsUseTA;
    }

    public void setNIsUseTA(short nIsUseTA) {
        this.nIsUseTA = nIsUseTA;
    }

    public short getNType() {
        return nType;
    }

    public void setNType(short nType) {
        this.nType = nType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tbEventLogPK != null ? tbEventLogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEventLog)) {
            return false;
        }
        TbEventLog other = (TbEventLog) object;
        if ((this.tbEventLogPK == null && other.tbEventLogPK != null) || (this.tbEventLogPK != null && !this.tbEventLogPK.equals(other.tbEventLogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TbEventLog[ tbEventLogPK=" + tbEventLogPK + " ]";
    }
    
}
