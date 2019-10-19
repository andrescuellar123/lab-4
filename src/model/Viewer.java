package model;

public class Viewer {
	

	private Human raiz;
	private int size;
	
	public Viewer() {
		
		raiz = null;
		size = 0;
	}

	/**
	 * @return the raiz
	 */
	public Human getRaiz() {
		return raiz;
	}

	/**
	 * @param raiz the raiz to set
	 */
	public void setRaiz(Human raiz) {
		this.raiz = raiz;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	/** Description : search the id
	 * return Human
	 */
	
	public Human searchId(String id) {
		return raiz == null ? null : raiz.searchId(id); 
	}
	/** Description :  the weight
	 * return int
	 */
    private int weight(){
    	int p =0;
    	if(raiz == null)
    		p=0;
    	else
    		p=raiz.weight();
        return p;
    }
	/** Description :  the height
	 * return int
	 */
    private int Height() {
    	int p =0;
    	if(raiz == null)
    		p=0;
    	else
    		p=raiz.Height();
        return p;
    }
	/**
	 * @param name a new name
	 * @param id a new id
	 * return b
	 */
	public void addHuman(String name , String id) throws MyException {
		Human nuevo = new Human( name ,  id);
		if(raiz == null) {
			raiz=nuevo;
		}
		else {
			raiz.insertHuman(nuevo);
			size++;

		}
		
		
			
	}


}
