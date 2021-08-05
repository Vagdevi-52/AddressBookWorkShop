package AddressBookWorkShop;


import java.util.Scanner;

public class AddressBookMain 
{
	static AddressBook service = new AddressBook();

    public static void main(String[] args)
    {
        boolean isExit = false;
        while (!isExit)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter options \n 1.Add Contact.\n 2.Edit Contact.\n 3.Delete Contact.\n 4.Search City.\n 5.search State.\n 6.view City.\n 7.view State.\n 8.Sort ByName.\n 9.Sort ByCity.\n 10.Display Contact.\n 11.Exit.");
            int userInput = scanner.nextInt();
            switch (userInput)
            {
                case 1:
                	service.addNewContact();
                    break;
                case 2:
                    service.editContact();
                    break;
                case 3:
                    System.out.println("Enter the Name of the Person do you Wants to Delete:");
                    String personName = scanner.next();
                    service.deleteContact(personName);
                 case 4:
                	 System.out.println("Enter the city to be Searched:");
                	 String searchCity = scanner.next();
                	 service.searchaPersoninaCity(searchCity);
                 case 5:
                	 System.out.println("Enter the state to be searched: ");
                	 String searchState = scanner.next();
                	 service.searchaPersoninaState(searchState);
                  case 6:
                	  System.out.println("Enter the city of a person to be viewed:");
                	  String viewCity =  scanner.next();
                  	  service.viewPersonInACity(viewCity);
                  case 7:
                	  System.out.println("Enter the State of a person to be viewed:");
                	  String viewState =  scanner.next();
                  	  service.viewPersonInACity(viewState);
                 case 8:
                	 System.out.println("Enter the State of a person to be viewed:");
               	     String SortByName =  scanner.next();
                	 service.sortByName();
                	 break;
                 case 9:
                	 System.out.println("Enter the State of a person to be viewed:");
               	     String SortByCity =  scanner.next();
                	 service.sortByCity();
                	 
                 case 10:
                    service.displayList();
                    break;
                 case 11:
                    isExit = true;
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}