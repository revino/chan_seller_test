package com.chan.sellerSample.service;

import com.chan.sellerSample.domain.Store;
import com.chan.sellerSample.dto.StoreDto;
import com.chan.sellerSample.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class StoreService {

    private final StoreRepository storeRepository;

    public Store signUp(StoreDto store){
        return storeRepository.save(store.toEntity());
    }

    public Store findId(String name){
        return storeRepository.findByName(name);
    }
}
