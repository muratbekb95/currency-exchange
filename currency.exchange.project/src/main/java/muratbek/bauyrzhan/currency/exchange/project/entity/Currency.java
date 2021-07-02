package muratbek.bauyrzhan.currency.exchange.project.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="currencies")
//@Data
public class Currency {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
	
	@Column(name = "currency")
    private String currency;
	
	@Column(name = "purchase")
    private double purchase;
	
	@Column(name = "sell")
    private double sell;

	public Currency() {
		super();
	}

	public Currency(String currency, double purchase, double sell) {
		super();
		this.currency = currency;
		this.purchase = purchase;
		this.sell = sell;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getPurchase() {
		return purchase;
	}

	public void setPurchase(double purchase) {
		this.purchase = purchase;
	}

	public double getSell() {
		return sell;
	}

	public void setSell(double sell) {
		this.sell = sell;
	}
    
}
