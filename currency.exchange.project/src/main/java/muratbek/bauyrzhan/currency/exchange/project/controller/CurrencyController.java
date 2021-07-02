package muratbek.bauyrzhan.currency.exchange.project.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import muratbek.bauyrzhan.currency.exchange.project.service.CurrencyService;
import muratbek.bauyrzhan.currency.exchange.project.entity.Currency;

@RestController
@RequestMapping("/currencies")
public class CurrencyController {
	@Autowired
	CurrencyService currencyService;
	
	@GetMapping("")
	public List<Currency> list() {
		return currencyService.listCurrencies();
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Currency> get(@PathVariable Long id) {
        try {
        	Currency currency = currencyService.findById(id);
            return new ResponseEntity<Currency>(currency, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Currency>(HttpStatus.NOT_FOUND);
        }
    }
}
