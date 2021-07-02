import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Currency } from '../entities/currency';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CurrencyService {

  private baseUrl = 'http://localhost:8080/api/currencies';

  constructor(private httpClient: HttpClient) { }

  getCurrencyList(): Observable<Currency[]> {

    // need to build URL based on category id
    const searchUrl = `${this.baseUrl}`;

    return this.getCurrencies(searchUrl);
  }

  private getCurrencies(searchUrl: string) {
    return this.httpClient.get<GetResponseCurrencies>(searchUrl).pipe(
      map(response => response._embedded.currencies)
    );
  }
}

export interface GetResponseCurrencies {
  _embedded: {
    currencies: Currency[];
  }
}
