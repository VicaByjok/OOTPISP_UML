package Class;


/**
 * @author laptop
 * @version 1.0
 * @created 06-дек-2020 15:51:13
 */
public abstract class MainController {

	private User currentUser;
	private DBControl DataBaseControl;
	private Storage Storage;

	public MainController(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param request
	 */
	public HttpResponse processRequest(HttpRequest request){
		return null;
	}
}//end MainController