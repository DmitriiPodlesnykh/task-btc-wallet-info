package com.podlesnykh.dmitrii.task.btcwalletinfo.storage.taskbtcwalletinfostorage.resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class WalletInfoRecordRepositoryRestResourceTest {

    private static final String TEST_URL_BASE = "/api/v1/wallet-info-records";

    @Autowired
    private MockMvc mvc;

    @Autowired
    private WalletInfoRecordRepositoryRestResource sut;

    @Test
    void findByDatetimeBetween() throws Exception{
        RequestBuilder builder = get(TEST_URL_BASE)
                .param("startDate", "2009-10-05T13:00:00+00:00")
                .param("endDate", "2039-10-05T13:00:00+00:00");

        mvc.perform(builder)
                .andExpect(status().isOk());

        assertEquals(2, sut.count());
    }

    @Test
    void save_addNewRecord() throws Exception{

        assertEquals(2, sut.count());

        RequestBuilder builder = post(TEST_URL_BASE)
                .param("amount", "10")
                .param("datetime", "2019-10-05T13:00:00+00:00");
        mvc.perform(builder)
                .andExpect(status().isOk());

        assertEquals(3, sut.count());
    }
}