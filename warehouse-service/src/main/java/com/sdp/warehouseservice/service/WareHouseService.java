package com.sdp.warehouseservice.service;

import com.sdp.warehouseservice.repository.WareHouseRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WareHouseService {

    private final WareHouseRepository wareHouseRepository;

    @Transactional(readOnly = true)
    public boolean isItemInStock(String itemCode){

        return wareHouseRepository.findByItemCode(itemCode).isPresent();
    }

}
