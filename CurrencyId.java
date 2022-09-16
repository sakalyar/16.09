package hm;

public enum CurrencyId {
	DZD("Dinar algerien"),
	EUR("Euro"), 
	GNF("franc gineen"), 
	MAD("Dirham moroccain");
	public String isoCode() {
		return "" + this;
	}
	private final String cur;
	private CurrencyId(String id) {
		cur = id;
	}
	/*@Override public String toString() {
		return cur;
	}*/
	public String Name() {
		return "" + cur;
	}
}
