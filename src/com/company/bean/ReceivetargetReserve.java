package com.company.bean;

import java.util.Date;

public class ReceivetargetReserve {
    private String receivetargetReserveId;

    private Integer tid;

    private String roomNumber;

    private Integer predetermineDay;

    private Double deposit;

    private String payWayID;

    private Date arriveTime;

    private String reserveState;

    public String getReceivetargetReserveId() {
        return receivetargetReserveId;
    }

    public void setReceivetargetReserveId(String receivetargetReserveId) {
        this.receivetargetReserveId = receivetargetReserveId == null ? null : receivetargetReserveId.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public Integer getPredetermineDay() {
        return predetermineDay;
    }

    public void setPredetermineDay(Integer predetermineDay) {
        this.predetermineDay = predetermineDay;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public String getPayWayID() {
        return payWayID;
    }

    public void setPayWayID(String payWayID) {
        this.payWayID = payWayID == null ? null : payWayID.trim();
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getReserveState() {
        return reserveState;
    }

    public void setReserveState(String reserveState) {
        this.reserveState = reserveState == null ? null : reserveState.trim();
    }
}