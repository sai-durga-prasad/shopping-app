package com.sdp.warehouseservice.controller;

import com.sdp.warehouseservice.service.WareHouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/warehouse")
@RequiredArgsConstructor
public class WareHouseController {

    private final WareHouseService wareHouseService;
    @GetMapping("/itemCode")
    @ResponseStatus(HttpStatus.OK)
    public boolean isItemInStock(@PathVariable("itemCode") String itemCode){
        return wareHouseService.isItemInStock(itemCode);
    }
}
