package com.chan.sellerSample.controller;

import com.chan.sellerSample.domain.Store;
import com.chan.sellerSample.dto.StoreDto;
import com.chan.sellerSample.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class StoreController {

    private final StoreService storeService;

    @PostMapping(value = "/account")
    public String signin(@RequestBody StoreDto store){
        storeService.signUp(store);
        return store.getName();
    }

    @GetMapping(value = "/account/{id}")
    public String signin(@PathVariable("id") String id){
        Store store = storeService.findId(id);
        return store.getName() + "-" + store.getDescription();
    }
}
