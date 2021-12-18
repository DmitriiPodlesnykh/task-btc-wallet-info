package com.podlesnykh.dmitrii.task.btcwalletinfo.storage.taskbtcwalletinfostorage.resource;

import com.podlesnykh.dmitrii.task.btcwalletinfo.storage.taskbtcwalletinfostorage.model.WalletInfoRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@RepositoryRestResource(path = "wallet-info")
public interface WalletInfoRecordRepositoryRestResource extends CrudRepository<WalletInfoRecord, BigInteger> {

    @RestResource(path = "/")
    List<WalletInfoRecord> findByDatetimeBetween(@Param("startDate") LocalDateTime startDate,
                                                 @Param("endDate") LocalDateTime endDate);
}
