package Class;


/**
 * @author laptop
 * @version 1.0
 * @created 06-дек-2020 15:51:12
 */
public class AuthorizedUserController extends MainController {

	private PaymentController payment;

	public AuthorizedUserController(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param mail
	 */
	public Boolean changeMail(String mail){
		return false;
	}

	/**
	 * 
	 * @param oldPass
	 * @param newPass
	 */
	public Boolean changePassword(String oldPass, String newPass){
		return false;
	}

	public void logOut(){

	}

	/**
	 * 
	 * @param request
	 */
	public HttpResponse processRequest(HttpRequest request){
		return null;
	}
}//end AuthorizedUserController