package com.podlesnykh.dmitrii.task.task.btcwalletpresenter.service;

import com.podlesnykh.dmitrii.task.task.btcwalletpresenter.dto.BtcWalletRecordResponse;
import com.podlesnykh.dmitrii.task.task.btcwalletpresenter.dto.WalletBalanceRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class BtcWalletService {

    private final RestTemplate restTemplate;

    public BtcWalletService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<BtcWalletRecordResponse> getRecords(WalletBalanceRequest dto) {
        return Collections.emptyList();

    }

    //public void saveRecord()

  //  + cache + github test file reqsuset
}
