package muratbek.bauyrzhan.currency.exchange.project.dao;

import muratbek.bauyrzhan.currency.exchange.project.entity.Currency;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
