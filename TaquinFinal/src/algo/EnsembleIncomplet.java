package algo;


import jeu.*;

public class EnsembleIncomplet implements EnsembleMarque {

	private int[] ensemble;
	
	public EnsembleIncomplet (int pTaille){
		ensemble=new int[pTaille];
	}
	public void ajout(Jeu pSommet) {
		int indice=pSommet.hashCode()%ensemble.length;
		if(indice<0)
			indice=indice*-1;
		if(ensemble[indice]==0)
			ensemble[indice]=1;
	}

	public boolean appartient(Jeu pATester) {
		int indice=pATester.hashCode()%ensemble.length;
		if(indice<0)
			indice=indice*-1;
		return ensemble[indice]==1;
	}
}