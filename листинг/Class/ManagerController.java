package Class;


/**
 * @author laptop
 * @version 1.0
 * @created 06-дек-2020 15:51:13
 */
public class ManagerController extends MainController {

	public ManagerController(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param Promocode
	 */
	public Boolean addPromocodes(Promocode Promocode){
		return false;
	}

	public ArrayList<Promocode> getAllPromocode(){
		return null;
	}

	public ArrayList<User> getAllUsers(){
		return null;
	}

	/**
	 * 
	 * @param name
	 */
	public ArrayList<User> getAllUsersWithSpecifiedName(String name){
		return null;
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
}//end ManagerController