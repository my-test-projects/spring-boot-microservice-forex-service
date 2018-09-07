package nao.cycledev.forex.service.controllers;

import nao.cycledev.forex.service.modal.ExchangeValue;
import nao.cycledev.forex.service.repositories.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {

    @Value("${server.port}")
    private int port;

    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
        ExchangeValue value = repository.findByFromAndTo(from, to);
        value.setPort(port);

        return value;
    }
}
