package AddressBookWorkShop;

public class AddressBookMain 
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book System");
        Contacts contact = new Contacts("Vagdevi","dh","Kukatpally","Hyderabad","Telangana",500085,"987654321","dhulipalavagdevi1952@gmail.com");
        System.out.println(contact);
    }
}