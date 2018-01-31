package com.test.demo.primary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "BalanceDetail")
@Table(name="t_balance_detail")
public class TBalanceDetail {
    @Id
    private Long  id;
    @Column(name="user_admin")
    private String userAdmin;
    @Column(name="org_guid")
    private String orgGuid;
    @Column(name="balance_status")
    private Long  balanceStatus;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserAdmin() {
        return userAdmin;
    }
    public void setUserAdmin(String userAdmin) {
        this.userAdmin = userAdmin;
    }

    public Long getBalanceStatus() {
        return balanceStatus;
    }
    public void setBalanceStatus(Long balanceStatus) {
        this.balanceStatus = balanceStatus;
    }
    public String getOrgGuid() {
        return orgGuid;
    }
    public void setOrgGuid(String orgGuid) {
        this.orgGuid = orgGuid;
    }
    @Override
    public String toString() {
        return "TBalanceDetail [id=" + id + ", userAdmin=" + userAdmin + ", orgGuid=" + orgGuid
               + ", balanceStatus=" + balanceStatus + "]";
    }
}
