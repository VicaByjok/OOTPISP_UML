package Class;


/**
 * @author laptop
 * @version 1.0
 * @created 06-дек-2020 15:51:13
 */
public interface IDBControl {

	/**
	 * 
	 * @param entity
	 */
	public void addEntity(Object entity);

	/**
	 * 
	 * @param entity
	 */
	public void deleteEntity(Object entity);

	/**
	 * 
	 * @param params
	 */
	public Object getEntity(Object params);

	public HttpResponse processRequest();

	/**
	 * 
	 * @param request
	 */
	public HttpResponse processRequest(HttpRequest request);

	/**
	 * 
	 * @param entity
	 */
	public ArrayList<Object> searchEntity(Object entity);

	/**
	 * 
	 * @param password
	 */
	public void setConnectionPassword(String password);

	/**
	 * 
	 * @param URL
	 */
	public void setConnectionURL(String URL);

	/**
	 * 
	 * @param name
	 */
	public void setConnectionUserName(String name);

	/**
	 * 
	 * @param params
	 */
	public void updateEntity(Object params);

}