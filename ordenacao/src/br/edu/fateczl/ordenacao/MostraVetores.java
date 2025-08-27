package br.edu.fateczl.ordenacao;

public class MostraVetores {

	public MostraVetores() {
		super();
	}
	
	public void mostraVetorInt(int[] vetor) {
		StringBuffer buffer = new StringBuffer();
		
		for(int v : vetor) {
			buffer.append(" ").append(v);
		}
		
		System.out.println(buffer);
	}	
}
