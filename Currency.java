package hm;


public class Currency implements CurrencyDB {
	CurrencyId cur;
	public Currency(CurrencyId cur) {
		this.cur = cur;
		System.out.print(cur.isoCode() + " is for " + cur.Name());
	}
	
}
