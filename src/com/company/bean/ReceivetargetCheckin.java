package com.company.bean;

import java.util.Date;

public class ReceivetargetCheckin {
    private String receivetargetCheckInId;

    private Integer tid;

    private Integer pid;

    private String roomNumber;

    private Date registerTime;

    private String rentOutTypeID;

    private String passengerTypeID;

    private Double stayNumber;

    private String billUnitID;

    private String depositPayWayID;

    private Integer changingRoomNumber;

    private Double changRoomMoney;

    private Date changRoomTime;

    private Double sumConst;

    private String isBillID;

    private Date payTime;

    public String getReceivetargetCheckInId() {
        return receivetargetCheckInId;
    }

    public void setReceivetargetCheckInId(String receivetargetCheckInId) {
        this.receivetargetCheckInId = receivetargetCheckInId == null ? null : receivetargetCheckInId.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRentOutTypeID() {
        return rentOutTypeID;
    }

    public void setRentOutTypeID(String rentOutTypeID) {
        this.rentOutTypeID = rentOutTypeID == null ? null : rentOutTypeID.trim();
    }

    public String getPassengerTypeID() {
        return passengerTypeID;
    }

    public void setPassengerTypeID(String passengerTypeID) {
        this.passengerTypeID = passengerTypeID == null ? null : passengerTypeID.trim();
    }

    public Double getStayNumber() {
        return stayNumber;
    }

    public void setStayNumber(Double stayNumber) {
        this.stayNumber = stayNumber;
    }

    public String getBillUnitID() {
        return billUnitID;
    }

    public void setBillUnitID(String billUnitID) {
        this.billUnitID = billUnitID == null ? null : billUnitID.trim();
    }

    public String getDepositPayWayID() {
        return depositPayWayID;
    }

    public void setDepositPayWayID(String depositPayWayID) {
        this.depositPayWayID = depositPayWayID == null ? null : depositPayWayID.trim();
    }

    public Integer getChangingRoomNumber() {
        return changingRoomNumber;
    }

    public void setChangingRoomNumber(Integer changingRoomNumber) {
        this.changingRoomNumber = changingRoomNumber;
    }

    public Double getChangRoomMoney() {
        return changRoomMoney;
    }

    public void setChangRoomMoney(Double changRoomMoney) {
        this.changRoomMoney = changRoomMoney;
    }

    public Date getChangRoomTime() {
        return changRoomTime;
    }

    public void setChangRoomTime(Date changRoomTime) {
        this.changRoomTime = changRoomTime;
    }

    public Double getSumConst() {
        return sumConst;
    }

    public void setSumConst(Double sumConst) {
        this.sumConst = sumConst;
    }

    public String getIsBillID() {
        return isBillID;
    }

    public void setIsBillID(String isBillID) {
        this.isBillID = isBillID == null ? null : isBillID.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}