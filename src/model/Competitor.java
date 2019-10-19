package model;

public class Competitor {
	
	private Human first;
	private Competitor next;
	private Competitor prev;
	
	/**
	 * @param first
	 * @param next
	 * @param prev
	 */
	public Competitor() {
		super();
		this.first = first;
		this.next = next;
		this.prev = prev;
	}
	/**
	 * @return the first
	 */
	public Human getFirst() {
		return first;
	}
	/**
	 * @param first the first to set
	 */
	public void setFirst(Human first) {
		this.first = first;
	}
	/**
	 * @return the next
	 */
	public Competitor getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Competitor next) {
		this.next = next;
	}
	/**
	 * @return the prev
	 */
	public Competitor getPrev() {
		return prev;
	}
	/**
	 * @param prev the prev to set
	 */
	public void setPrev(Competitor prev) {
		this.prev = prev;
	}
	
	/**
	 * @param tec a new human
	 * return repetitive
	 */
	
	public boolean repetitiveHuman(Human hum) {
		boolean repetitive = false;
		Human act = first;
		while(!repetitive && act != null) {
			if(act.compareTo(hum)==0) {
				repetitive = true;
			}
			act = act.getNext();
		}
		return repetitive;
	}
	/**
	 * @param tec a new human
	 * return b
	 */
	
	public boolean addHuman(Human tec)throws MyException {
		boolean b = false;
		Human act = first;
		if(repetitiveHuman(tec)== false) {
			
			if (act==null) {
				act = tec;
				b = true;
			} else {
				while(act != null) {
					tec.setNext(act);
					act = tec;
					b =true;
				}
			}
		}
		else
			throw new MyException("La tecnica tiene el mismo id");
		
		return b;
	}
	
	/** Description : find the id
	 * return String
	 */
	
    public String findId(String id ){
    	Human act =first;
    	String msj= "";
       while( act != null && act.getId().equals(id) == true ) {
    	   
			msj += act+"\n";
		
       }

        return msj;
    }

	
	
	
}
