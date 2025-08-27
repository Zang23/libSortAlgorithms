package br.edu.fateczl.ordenacao;

public class BubbleSort {

	public BubbleSort() {
		super();;
	}
	
	public void bbSort(int[] vet) {
		int tamanho = vet.length;
		
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanho-1; j++) {
				if(vet[j] > vet[j+1]) {
					int aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
	}
	
}
