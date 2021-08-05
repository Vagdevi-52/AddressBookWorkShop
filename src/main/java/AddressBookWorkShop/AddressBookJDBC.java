package AddressBookWorkShop;


import java.util.List;

public class AddressBookJDBC {
    public enum IOService {
        DB_IO
    }

    private List<Contact> addressBookList;
    private static AddressBook addressBookDBService;

    public AddressBookJDBC() {
        addressBookDBService = AddressBook.getInstance();
    }

    public AddressBookJDBC(List<Contact> addresBookList) {
        this();
        this.addressBookList = addressBookList;
    }

    public List<Contact> readAddressBookData(IOService ioservice) {
        if (ioservice.equals(IOService.DB_IO))
			try {
				this.addressBookList = addressBookDBService.readData();
			} catch (AddressBookException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        return this.addressBookList;
    }
}
