package cz.spsejecna.c2a.nykorych;

public class Player {
	public String NAME;
	public String SURNAME;
	public String NICK;
	public int PRICE;
	public int AGE;
	public String ROLE;

	public String getNICK() {
		return NICK;
	}

	public void setNICK(String nICK) {
		NICK = nICK;
	}

	public int getPRICE() {
		return PRICE;
	}

	public void setPRICE(int pRICE) {
		PRICE = pRICE;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getSURNAME() {
		return SURNAME;
	}

	public void setSURNAME(String sURNAME) {
		SURNAME = sURNAME;
	}

	public int getAGE() {
		return AGE;
	}

	public void setAGE(int aGE) {
		AGE = aGE;
	}

	public String getROLE() {
		return ROLE;
	}

	public void setROLE(String rOLE) {
		ROLE = rOLE;
	}

	public Player(String nAME, String sURNAME, String nICK, int pRICE, int aGE, String rOLE) {
		super();
		NAME = nAME;
		SURNAME = sURNAME;
		NICK = nICK;
		PRICE = pRICE;
		AGE = aGE;
		ROLE = rOLE;
	}

	@Override
	public String toString() {
		return "\r\nFull name: " + NAME + " " + SURNAME + "\r\nNicname: " + NICK + "\r\nPrice: " + PRICE + "\r\nAge: " + AGE
				+ "\r\nRole: " + ROLE+"\r\n";
	}


}
