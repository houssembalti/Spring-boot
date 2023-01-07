package com.example.validation.Stock;

import com.example.validation.Generic.IGenericimp;
import com.example.validation.entities.Stock;
import com.example.validation.repositories.Stockrepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class Istockimp extends IGenericimp<Stock,Long> implements  Istock{

    private Stockrepo stockrepo;
    @Scheduled(cron = "0 0 22 * * *")
    @Override
    public void retrieveStatusStock() {



        //with JPQL(In StockRepo)
        List<Stock> stocks=stockrepo.getAllConcernedStocks();
        for (Stock stock:stocks) {
            log.info("stock: "+stock);
        }
    }
}
