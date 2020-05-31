package cz.spsejecna.c2a.nykorych;

public class Stats extends Player {

	public Stats(String nAME, String sURNAME, String nICK, int pRICE, int aGE, String rOLE, double kD, double kR,
			double hS, double iMP) {
		super(nAME, sURNAME, nICK, pRICE, aGE, rOLE);
		KD = kD;
		KR = kR;
		HS = hS;
		IMP = iMP;
	}

	public double KD;
	public double KR;
	public double HS;
	public double IMP;

	public double getKD() {
		return KD;
	}

	public void setKD(double kD) {
		KD = kD;
	}

	public double getKR() {
		return KR;
	}

	public void setKR(double kR) {
		KR = kR;
	}

	public double getHS() {
		return HS;
	}

	public void setHS(double hS) {
		HS = hS;
	}

	public double getIMP() {
		return IMP;
	}

	public void setIMP(double iMP) {
		IMP = iMP;
	}
}
