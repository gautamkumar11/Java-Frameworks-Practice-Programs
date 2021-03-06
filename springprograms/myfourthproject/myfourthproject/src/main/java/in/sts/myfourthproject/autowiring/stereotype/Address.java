package in.sts.myfourthproject.autowiring.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("560006")
	private int pincode;
	
	@Value("Bengaluru")
	private String city;
	
	@Value("Basvangudi")
	private String street;
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", street=" + street + "]";
	}
	
	
}
