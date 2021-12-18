package com.podlesnykh.dmitrii.task.task.btcwalletpresenter.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class BtcWalletRecord {

    private LocalDateTime datetime;

    private BigDecimal amount;

    public BtcWalletRecord() {
    }

    public BtcWalletRecord(LocalDateTime datetime, BigDecimal amount) {
        this.datetime = datetime;
        this.amount = amount;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BtcWalletRecord{" +
                "datetime=" + datetime +
                ", amount=" + amount +
                '}';
    }
}
