package br.edu.fateczl.ordenacao;

public class QuickSort {

	
	public QuickSort() {
		super();
	}
	
	public int[] quickSort(int[] vetor, int inicio, int fim) {
		
		if(inicio < fim) {
			int pivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, pivoFixo - 1);
			quickSort(vetor, pivoFixo + 1, fim);
		}
		return vetor;
	}
	
	
	private int dividir(int[] vetor, int inicio, int fim){
			
		int pivo = vetor[inicio];
		int esquerda = inicio + 1;
		int direita = fim;
		
		while(esquerda <= direita) {
			while(esquerda <= direita && vetor[esquerda] <= pivo) {
				esquerda++;
			}
			
			while(direita >= esquerda && vetor[direita] > pivo) {
				direita--;
			}
			
			if(esquerda < direita) {
				trocar(vetor, esquerda, direita);
				esquerda++;
				direita--;
			}
		}
			
		trocar(vetor, inicio, direita);
		return direita;
	}
		
		
	
	private void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
	
	
}
