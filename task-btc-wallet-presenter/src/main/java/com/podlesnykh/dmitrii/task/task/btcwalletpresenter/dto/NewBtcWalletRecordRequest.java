package com.podlesnykh.dmitrii.task.task.btcwalletpresenter.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class NewBtcWalletRecordRequest extends BtcWalletRecord {

    public NewBtcWalletRecordRequest() {
    }

    public NewBtcWalletRecordRequest(LocalDateTime datetime, BigDecimal amount) {
        super(datetime, amount);
    }
}
