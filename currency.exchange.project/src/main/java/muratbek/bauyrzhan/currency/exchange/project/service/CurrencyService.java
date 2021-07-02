package muratbek.bauyrzhan.currency.exchange.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import muratbek.bauyrzhan.currency.exchange.project.dao.CurrencyRepository;
import muratbek.bauyrzhan.currency.exchange.project.entity.Currency;

@Service
//@Transactional
public class CurrencyService {
	@Autowired
	private CurrencyRepository currencyRepository;
	
	public List<Currency> listCurrencies() {
		return currencyRepository.findAll();
	}
	
    public Currency findById(Long id) {
        return currencyRepository.findById(id).get();
    }
}
