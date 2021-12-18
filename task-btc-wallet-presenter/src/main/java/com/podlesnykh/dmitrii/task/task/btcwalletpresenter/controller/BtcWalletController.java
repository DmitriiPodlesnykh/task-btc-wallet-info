package com.podlesnykh.dmitrii.task.task.btcwalletpresenter.controller;

import com.podlesnykh.dmitrii.task.task.btcwalletpresenter.dto.BtcWalletRecordResponse;
import com.podlesnykh.dmitrii.task.task.btcwalletpresenter.dto.NewBtcWalletRecordRequest;
import com.podlesnykh.dmitrii.task.task.btcwalletpresenter.dto.WalletBalanceRequest;
import com.podlesnykh.dmitrii.task.task.btcwalletpresenter.service.BtcWalletService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("v1/btc-wallet")
public class BtcWalletController {

    private final BtcWalletService btcWalletService;

    public BtcWalletController(BtcWalletService btcWalletService) {
        this.btcWalletService = btcWalletService;
    }

    @PutMapping("/")
    public ResponseEntity<String> save(@RequestBody NewBtcWalletRecordRequest dto) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<BtcWalletRecordResponse>> getInfo(@RequestBody WalletBalanceRequest dto) {
        return ResponseEntity.ok(btcWalletService.getRecords(dto));
    }
}
