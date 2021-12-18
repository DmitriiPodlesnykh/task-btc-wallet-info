package com.podlesnykh.dmitrii.task.task.btcwalletpresenter.service;

import com.podlesnykh.dmitrii.task.task.btcwalletpresenter.dto.WalletBalanceRequest;
import org.springframework.stereotype.Component;

public interface BtcWalletServiceDataProvider {

    String getJsonBy(WalletBalanceRequest walletBalanceRequest);

   // String addN
}
