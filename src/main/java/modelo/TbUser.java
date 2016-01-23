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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aldo
 */
@Entity
@Table(name = "TB_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUser.findAll", query = "SELECT t FROM TbUser t"),
    @NamedQuery(name = "TbUser.findByNUserIdn", query = "SELECT t FROM TbUser t WHERE t.nUserIdn = :nUserIdn"),
    @NamedQuery(name = "TbUser.findBySUserName", query = "SELECT t FROM TbUser t WHERE t.sUserName = :sUserName"),
    @NamedQuery(name = "TbUser.findByNDepartmentIdn", query = "SELECT t FROM TbUser t WHERE t.nDepartmentIdn = :nDepartmentIdn"),
    @NamedQuery(name = "TbUser.findBySTelNumber", query = "SELECT t FROM TbUser t WHERE t.sTelNumber = :sTelNumber"),
    @NamedQuery(name = "TbUser.findBySEmail", query = "SELECT t FROM TbUser t WHERE t.sEmail = :sEmail"),
    @NamedQuery(name = "TbUser.findBySUserID", query = "SELECT t FROM TbUser t WHERE t.sUserID = :sUserID"),
    @NamedQuery(name = "TbUser.findBySPassword", query = "SELECT t FROM TbUser t WHERE t.sPassword = :sPassword"),
    @NamedQuery(name = "TbUser.findByNStartDate", query = "SELECT t FROM TbUser t WHERE t.nStartDate = :nStartDate"),
    @NamedQuery(name = "TbUser.findByNEndDate", query = "SELECT t FROM TbUser t WHERE t.nEndDate = :nEndDate"),
    @NamedQuery(name = "TbUser.findByNAdminLevel", query = "SELECT t FROM TbUser t WHERE t.nAdminLevel = :nAdminLevel"),
    @NamedQuery(name = "TbUser.findByNAuthMode", query = "SELECT t FROM TbUser t WHERE t.nAuthMode = :nAuthMode"),
    @NamedQuery(name = "TbUser.findByNAuthLimitCount", query = "SELECT t FROM TbUser t WHERE t.nAuthLimitCount = :nAuthLimitCount"),
    @NamedQuery(name = "TbUser.findByNTimedAPB", query = "SELECT t FROM TbUser t WHERE t.nTimedAPB = :nTimedAPB"),
    @NamedQuery(name = "TbUser.findByNEncryption", query = "SELECT t FROM TbUser t WHERE t.nEncryption = :nEncryption")})
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nUserIdn")
    private Integer nUserIdn;
    @Basic(optional = false)
    @Column(name = "sUserName")
    private String sUserName;
    @Basic(optional = false)
    @Column(name = "nDepartmentIdn")
    private int nDepartmentIdn;
    @Basic(optional = false)
    @Column(name = "sTelNumber")
    private String sTelNumber;
    @Basic(optional = false)
    @Column(name = "sEmail")
    private String sEmail;
    @Basic(optional = false)
    @Column(name = "sUserID")
    private String sUserID;
    @Basic(optional = false)
    @Column(name = "sPassword")
    private String sPassword;
    @Basic(optional = false)
    @Lob
    @Column(name = "bPassword2")
    private byte[] bPassword2;
    @Basic(optional = false)
    @Column(name = "nStartDate")
    private int nStartDate;
    @Basic(optional = false)
    @Column(name = "nEndDate")
    private int nEndDate;
    @Basic(optional = false)
    @Column(name = "nAdminLevel")
    private int nAdminLevel;
    @Basic(optional = false)
    @Column(name = "nAuthMode")
    private int nAuthMode;
    @Basic(optional = false)
    @Column(name = "nAuthLimitCount")
    private int nAuthLimitCount;
    @Basic(optional = false)
    @Column(name = "nTimedAPB")
    private int nTimedAPB;
    @Basic(optional = false)
    @Column(name = "nEncryption")
    private int nEncryption;

    public TbUser() {
    }

    public TbUser(Integer nUserIdn) {
        this.nUserIdn = nUserIdn;
    }

    public TbUser(Integer nUserIdn, String sUserName, int nDepartmentIdn, String sTelNumber, String sEmail, String sUserID, String sPassword, byte[] bPassword2, int nStartDate, int nEndDate, int nAdminLevel, int nAuthMode, int nAuthLimitCount, int nTimedAPB, int nEncryption) {
        this.nUserIdn = nUserIdn;
        this.sUserName = sUserName;
        this.nDepartmentIdn = nDepartmentIdn;
        this.sTelNumber = sTelNumber;
        this.sEmail = sEmail;
        this.sUserID = sUserID;
        this.sPassword = sPassword;
        this.bPassword2 = bPassword2;
        this.nStartDate = nStartDate;
        this.nEndDate = nEndDate;
        this.nAdminLevel = nAdminLevel;
        this.nAuthMode = nAuthMode;
        this.nAuthLimitCount = nAuthLimitCount;
        this.nTimedAPB = nTimedAPB;
        this.nEncryption = nEncryption;
    }

    public Integer getNUserIdn() {
        return nUserIdn;
    }

    public void setNUserIdn(Integer nUserIdn) {
        this.nUserIdn = nUserIdn;
    }

    public String getSUserName() {
        return sUserName;
    }

    public void setSUserName(String sUserName) {
        this.sUserName = sUserName;
    }

    public int getNDepartmentIdn() {
        return nDepartmentIdn;
    }

    public void setNDepartmentIdn(int nDepartmentIdn) {
        this.nDepartmentIdn = nDepartmentIdn;
    }

    public String getSTelNumber() {
        return sTelNumber;
    }

    public void setSTelNumber(String sTelNumber) {
        this.sTelNumber = sTelNumber;
    }

    public String getSEmail() {
        return sEmail;
    }

    public void setSEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getSUserID() {
        return sUserID;
    }

    public void setSUserID(String sUserID) {
        this.sUserID = sUserID;
    }

    public String getSPassword() {
        return sPassword;
    }

    public void setSPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public byte[] getBPassword2() {
        return bPassword2;
    }

    public void setBPassword2(byte[] bPassword2) {
        this.bPassword2 = bPassword2;
    }

    public int getNStartDate() {
        return nStartDate;
    }

    public void setNStartDate(int nStartDate) {
        this.nStartDate = nStartDate;
    }

    public int getNEndDate() {
        return nEndDate;
    }

    public void setNEndDate(int nEndDate) {
        this.nEndDate = nEndDate;
    }

    public int getNAdminLevel() {
        return nAdminLevel;
    }

    public void setNAdminLevel(int nAdminLevel) {
        this.nAdminLevel = nAdminLevel;
    }

    public int getNAuthMode() {
        return nAuthMode;
    }

    public void setNAuthMode(int nAuthMode) {
        this.nAuthMode = nAuthMode;
    }

    public int getNAuthLimitCount() {
        return nAuthLimitCount;
    }

    public void setNAuthLimitCount(int nAuthLimitCount) {
        this.nAuthLimitCount = nAuthLimitCount;
    }

    public int getNTimedAPB() {
        return nTimedAPB;
    }

    public void setNTimedAPB(int nTimedAPB) {
        this.nTimedAPB = nTimedAPB;
    }

    public int getNEncryption() {
        return nEncryption;
    }

    public void setNEncryption(int nEncryption) {
        this.nEncryption = nEncryption;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nUserIdn != null ? nUserIdn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUser)) {
            return false;
        }
        TbUser other = (TbUser) object;
        if ((this.nUserIdn == null && other.nUserIdn != null) || (this.nUserIdn != null && !this.nUserIdn.equals(other.nUserIdn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TbUser[ nUserIdn=" + nUserIdn + " ]";
    }
    
}
