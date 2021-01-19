package Class;


/**
 * @author laptop
 * @version 1.0
 * @created 06-дек-2020 15:51:14
 */
public class UnauthorizedUserController extends MainController {

	public UnauthorizedUserController(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param login
	 * @param password
	 */
	public Boolean authorization(String login, String password){
		return false;
	}

	/**
	 * 
	 * @param request
	 */
	public HttpResponse processRequest(HttpRequest request){
		return null;
	}

	/**
	 * 
	 * @param login
	 * @param password
	 */
	public Boolean registration(String login, String password){
		return false;
	}
}//end UnauthorizedUserController