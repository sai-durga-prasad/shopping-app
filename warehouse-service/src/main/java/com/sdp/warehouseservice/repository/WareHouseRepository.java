package com.sdp.warehouseservice.repository;

import com.sdp.warehouseservice.model.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WareHouseRepository extends JpaRepository<WareHouse, Long> {
    Optional<WareHouse> findByItemCode(String itemCode);
}
