package model;

/**
 * <h1>Used to fetch the data about the Map from the database </h1>
 *
 */
public class MapData {
	
//----------------------ATTRIBUTES--------------------
	private int id;
	private int width;
	private int height;
	public final static int IDCOL = 1 ;
	public final static int WIDTHCOL= 2 ;
	public final static int HEIGHTCOL= 3 ;
	
//----------------------METHODS---------------------	
	/**
	 * constructor
	 * @param id The ID of the map.
	 * @param width The width of the map.
	 * @param height The height of the map.
	 */
	public MapData(int id, int width, int height) {
		this.setID(id);
		this.setWidth(width);
		this.setHeight(height);
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
