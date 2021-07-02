import { Component, OnInit } from '@angular/core';
import { Currency } from 'src/app/entities/currency';
import { ActivatedRoute } from '@angular/router';
import { CurrencyService } from 'src/app/services/currency.service';
import { GetResponseCurrencies } from 'src/app/services/currency.service';

@Component({
  selector: 'app-currencies',
  templateUrl: './currencies.component.html',
  styleUrls: ['./currencies.component.less']
})
export class CurrenciesComponent implements OnInit {

  currencies: Currency[] = [];

  constructor(private currenciesService: CurrencyService) { }

  ngOnInit(): void {
    this.listCurrencies();
  }

  listCurrencies() {
    this.currenciesService.getCurrencyList().subscribe(data => 
    {
      this.currencies = data;
    });
  }

  processResult() {
    return (data: GetResponseCurrencies) => {
      this.currencies = data._embedded.currencies;
    };
  }

}
