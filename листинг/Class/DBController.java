package Class;


/**
 * @author laptop
 * @version 1.0
 * @created 06-дек-2020 15:51:12
 */
public class DBController implements IDBControl {

	private String name;
	private String password;
	private String URL;

	public DBController(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param entity
	 */
	public void addEntity(Object entity){

	}

	/**
	 * 
	 * @param entity
	 */
	public void deleteEntity(Object entity){

	}

	/**
	 * 
	 * @param params
	 */
	public Object getEntity(Object params){
		return null;
	}

	public HttpResponse processRequest(){
		return null;
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
	 * @param entity
	 */
	public ArrayList<Object> searchEntity(Object entity){
		return null;
	}

	/**
	 * 
	 * @param password
	 */
	public void setConnectionPassword(String password){

	}

	/**
	 * 
	 * @param URL
	 */
	public void setConnectionURL(String URL){

	}

	/**
	 * 
	 * @param name
	 */
	public void setConnectionUserName(String name){

	}

	/**
	 * 
	 * @param params
	 */
	public void updateEntity(Object params){

	}
}//end DBController