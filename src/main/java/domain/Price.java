package domain;

import java.util.Optional;

public class Price {

	@Override
	public String toString() {
		return "Price [was=" + was + ", then1=" + then1 + ", then2=" + then2 + ", now=" + now + ", currency=" + currency
				+ "]";
	}
	public Price() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Price(Optional<Float> was, Optional<Float> then1, Optional<Float> then2, Object now, CurrencyEnum currency) {
		super();
		this.was = was;
		this.then1 = then1;
		this.then2 = then2;
		this.now = now;
		this.currency = currency;
	}

	


	public Price(Optional<Float> was, Optional<Float> then1, Optional<Float> then2, Object now) {
		super();
		this.was = was;
		this.then1 = then1;
		this.then2 = then2;
		this.now = now;
	}




	private Optional<Float> was;
	private Optional<Float> then1;
	private Optional<Float> then2;
	private Object now;
	private CurrencyEnum currency;
	public Optional<Float> getWas() {
		return was;
	}
	public void setWas(Optional<Float> was) {
		this.was = was;
	}
	public Optional<Float> getThen1() {
		return then1;
	}
	public void setThen1(Optional<Float> then1) {
		this.then1 = then1;
	}
	public Optional<Float> getThen2() {
		return then2;
	}
	public void setThen2(Optional<Float> then2) {
		this.then2 = then2;
	}
	public Object getNow() {
		return now;
	}
	public void setNow(Object now) {
		this.now = now;
	}
	public CurrencyEnum getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyEnum currency) {
		this.currency = currency;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((now == null) ? 0 : now.hashCode());
		result = prime * result + ((then1 == null) ? 0 : then1.hashCode());
		result = prime * result + ((then2 == null) ? 0 : then2.hashCode());
		result = prime * result + ((was == null) ? 0 : was.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Price other = (Price) obj;
		if (currency != other.currency)
			return false;
		if (now == null) {
			if (other.now != null)
				return false;
		} else if (!now.equals(other.now))
			return false;
		if (then1 == null) {
			if (other.then1 != null)
				return false;
		} else if (!then1.equals(other.then1))
			return false;
		if (then2 == null) {
			if (other.then2 != null)
				return false;
		} else if (!then2.equals(other.then2))
			return false;
		if (was == null) {
			if (other.was != null)
				return false;
		} else if (!was.equals(other.was))
			return false;
		return true;
	}

}
