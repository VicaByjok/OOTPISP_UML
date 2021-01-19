package Class;


/**
 * @author laptop
 * @version 1.0
 * @created 06-дек-2020 15:51:14
 */
public class User {

	private Basket basket;
	private ArrayList<Sale> historySale;
	private int id;
	private String lastName;
	private String mail;
	private String middleName;
	private String name;
	private String passwordHash;
	private Role role;

	public User(){

	}

	public void finalize() throws Throwable {

	}
}//end User