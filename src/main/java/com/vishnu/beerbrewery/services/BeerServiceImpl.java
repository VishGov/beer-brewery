package com.vishnu.beerbrewery.services;

import com.vishnu.beerbrewery.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .beerName("RandomBeer")
                .beerStyle("Pale Ale").build();
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .beerName(beerDTO.getBeerName())
                .beerStyle(beerDTO.getBeerStyle())
                .upc(beerDTO.getUpc())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {
        //TODO :  need to be implemented with a datasource!
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting beer with ID: " + beerId.toString());
    }
}
