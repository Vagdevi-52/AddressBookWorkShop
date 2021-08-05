package AddressBookWorkShop;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook
{
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Contact> contactlist = new ArrayList<>();
    private Map<String, ArrayList<Contact>> addressbook = new HashMap<>();
	private Object contact;

    public void addNewContact()
    {
        Contact contact = new Contact();
        
        System.out.println("Enter First name:");
        contact.setFirstname(scanner.next());

        System.out.println("Enter Last Name:");
        contact.setLastname(scanner.next());

        System.out.println("Enter Address:");
        contact.setAddress(scanner.next());

        System.out.println("Enter City:");
        contact.setCity(scanner.next());

        System.out.println("Enter State:");
        contact.setState(scanner.next());

        System.out.println("Enter Zip:");
        contact.setZipcode(scanner.nextInt());
        
        System.out.println("Enter Phone:");
        contact.setPhonenumber(scanner.next());

        System.out.println("Enter Email:");
        contact.setEmailid(scanner.next());
        
        System.out.println("Enter Book name to which you have to add contact");
        String bookName  = scanner.next();
        if(addressbook.containsKey(bookName))
        {
        	    contactlist.stream().filter(value -> value.getFirstname(). equals(contact.getFirstname())).forEach(value -> 
        	    {
        	    	System.out.println("Duplicate Contact");
        	    	addNewContact();
        	    });
        	contactlist.add(contact);
            addressbook.put(bookName,contactlist);
            System.out.println("New Contact Has Been Added Successfully");
        }
        else
        {
            contactlist.add(contact);
            addressbook.put(bookName,contactlist);
            System.out.println("New AddressBook is created and Added Contact in the AddressBook Successfully");
        }
    }
    public void editContact()
    {
        String enteredFirstName;
        System.out.println("Enter First name of contact to edit it ");
        enteredFirstName = scanner.next();
        for (int i = 0; i < contactlist.size(); i++) 
        {
            if (contactlist.get(i).getFirstname().equals(enteredFirstName))
            {
                System.out.println("Enter the field to edit:\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Phone\n8.Email");
                int userInput = scanner.nextInt();
                switch (userInput)
                {
                    case 1:
                        System.out.println("Enter new first name");
                        contactlist.get(i).setFirstname(scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter new last name");
                        contactlist.get(i).setLastname(scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter new Address");
                        contactlist.get(i).setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter new city");
                        contactlist.get(i).setCity(scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter new state");
                        contactlist.get(i).setState(scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter new zip");
                        contactlist.get(i).setZipcode(scanner.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter new phone number");
                        contactlist.get(i).setPhonenumber(scanner.next());
                        break;
                    case 8:
                        System.out.println("Enter new email");
                        contactlist.get(i).setEmailid(scanner.next());
                        break;
                    default:
                        System.out.println("Invalid Entry");
                        
                }     
            }
        }
        System.out.println("Contact Edited Successfully");
    }
    
    public void deleteContact(String name)
    {
        for (int i = 0; i < contactlist.size(); i++) 
        {
            if (contactlist.get(i).getFirstname().equals(name)) 
            {
                Contact contact = contactlist.get(i);
                contactlist.remove(contact);
            }
        }
        System.out.println("Contact Deleted Successfully");
    }
    
    public void searchaPersoninaCity (String city)
    {
        System.out.println("following are the persons who belongs to :" + city);
        for(String bookName : addressbook.keySet())
        {
            addressbook.get(bookName);
            contactlist.stream().filter(value -> value.getCity().equals(city)).map(Contact::getFirstname).forEach(System.out::println);
        }
    }
    
    public void viewPersonInACity (String city)
    {
        for(String bookName : addressbook.keySet())
        {
            int countofPerson = 0;
            addressbook.get(bookName);
            contactlist.stream().filter(value -> value.getCity().equals(city)).map(Contact::getFirstname).forEach(System.out::println);
            countofPerson++;
            System.out.println("total no.of.persons:"+countofPerson);
        }
    }
    public void displayList() 
    {
        for (Contact iterator : contactlist) System.out.println(iterator);
    }

}