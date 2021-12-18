package com.podlesnykh.dmitrii.task.task.btcwalletpresenter.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BtcWalletRecordResponse extends BtcWalletRecord {

    public BtcWalletRecordResponse() {
    }

    public BtcWalletRecordResponse(LocalDateTime datetime, BigDecimal amount) {
        super(datetime, amount);
    }
}
