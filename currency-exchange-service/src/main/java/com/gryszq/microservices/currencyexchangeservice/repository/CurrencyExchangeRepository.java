package com.gryszq.microservices.currencyexchangeservice.repository;

import com.gryszq.microservices.currencyexchangeservice.model.ExchangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<ExchangeValue, Long> {
    public ExchangeValue findByCurrencyAndTo(String currency, String to);
}
