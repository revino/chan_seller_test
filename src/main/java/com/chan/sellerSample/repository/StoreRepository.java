package com.chan.sellerSample.repository;

import com.chan.sellerSample.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
     Store findByName(String name);
}
