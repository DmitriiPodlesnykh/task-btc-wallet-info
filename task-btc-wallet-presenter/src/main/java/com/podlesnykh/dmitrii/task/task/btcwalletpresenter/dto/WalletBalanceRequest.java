package com.podlesnykh.dmitrii.task.task.btcwalletpresenter.dto;

import java.time.LocalDateTime;

public class WalletBalanceRequest {

    private LocalDateTime startDatetime;

    private LocalDateTime endDatetime;

    public WalletBalanceRequest() {
    }

    public WalletBalanceRequest(LocalDateTime startDatetime, LocalDateTime endDatetime) {
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
    }

    public LocalDateTime getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(LocalDateTime startDatetime) {
        this.startDatetime = startDatetime;
    }

    public LocalDateTime getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(LocalDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }

    @Override
    public String toString() {
        return "WalletBalanceRequest{" +
                "startDatetime=" + startDatetime +
                ", endDatetime=" + endDatetime +
                '}';
    }
}
