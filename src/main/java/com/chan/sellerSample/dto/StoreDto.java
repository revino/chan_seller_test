package com.chan.sellerSample.dto;

import com.chan.sellerSample.domain.Store;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StoreDto {

    private String name;

    private String description;

    public Store toEntity(){
        return Store.builder()
                .description(this.description)
                .name(this.name)
                .build();
    }

}