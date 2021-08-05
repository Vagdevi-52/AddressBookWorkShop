package AddressBookWorkShop;

public class Contact 
{
	
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String phonenumber;
	private String emailid;
	private long zipcode;
	
	public void Contact(String firstname,String lastname, String address, String city, String state, String phonenumber, String emailid, long zipcode) 
	{
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phonenumber = phonenumber;
		this.emailid = emailid;
		this.zipcode = zipcode;
	}
	
	public String getFirstname()
	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	public String getLastname()
	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getPhonenumber()
	{
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	public String getEmailid() 
	{
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getZipcode()
	{
		return zipcode;
	}
	public void setZipcode(long zipcode)
	{
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() 
	{
		return "Contact[ FirstName=" + firstname + ",LastName=" + lastname + ",Address=" + address + ",City=" + city + ",State=" + state +
								",PhoneNumber=" + phonenumber + ",Emailid=" + emailid + ",Zipcode=" + zipcode + "]";
	}
}