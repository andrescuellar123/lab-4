package model;

public class VolleyballCup {
	private Viewer view;
	private Competitor first;
	
	
	
	
	/**
	 * @param view
	 * @param first
	 */
	public VolleyballCup() {
		super();
		this.view = view;
		this.first = first;
	}

	/**
	 * @return the view
	 */
	public Viewer getView() {
		return view;
	}

	/**
	 * @param view the view to set
	 */
	public void setView(Viewer view) {
		this.view = view;
	}

	/**
	 * @return the first
	 */
	public Competitor getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(Competitor first) {
		this.first = first;
	}

	public Competitor findIdList(Human hum,String id2) {
		Competitor comp = null;
		Competitor act = first;
		boolean finded = false;
		
		while(comp != null && finded == true) {
			if(comp.findId(hum.getId()).equals(id2)) {
				comp = act;
				finded = true;
			}
			act = act.getNext();
		}
		return comp;
	}
	
	//responsabilities 
	
	/**
	 * @param t a new technique
	 * @param name a new name
	 * return ad
	 */
	public boolean addHumanList(Human hum, String name) throws MyException {
		boolean ad = false;
		Competitor act = first;
		while( ad==true && act != null ) {
			if(act.findId(hum.getId()).equals(name)) {
				act.addHuman(hum);
				act = act.getNext();
				ad=true;
			}
			else
				throw new MyException("no se puede agregar la tecnica");
		}
		return ad;
	}
	
	/**
	 * @param t a new Charact
	 * return upda
	 */
	
	public boolean addCompetitorList(Competitor chac,String id,Human hum) throws MyException {
		boolean ad = false;
		
		 if(repetitiveCompetitorList(chac, id, hum) == false) {
			chac.setNext(first);
			first.setPrev(chac);
			first = chac;
			ad = true;
		}
		 else if(first == null) {
				first = chac;
				ad = true;
			}

			
		
		else {
			throw new MyException("no se puede aniadir");
		}
		return ad;
	}
	
	/**
	 * @param t a new Charact
	 * return repetitive
	 */
	
	public boolean repetitiveCompetitorList(Competitor charc,String id,Human hum) {
		boolean repetitive = false;
		Competitor act = first;
		while(!repetitive && act != null) {
			if(act.findId(charc.findId(hum.getId())).compareTo(id)==0) {
				repetitive = true;
			}
			act = act.getNext();
		}
		return repetitive;
	}
	
	
	
	
	
	
	
	
}
