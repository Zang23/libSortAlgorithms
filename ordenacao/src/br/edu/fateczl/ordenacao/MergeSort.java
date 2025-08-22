package br.edu.fateczl.ordenacao;

public class MergeSort {
	
	public MergeSort() {
		super();
	}
	
	public int[] mgSort(int[] vetor, int inicio, int fim) {
		
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			
			mgSort(vetor, inicio, meio); 
			mgSort(vetor,meio+1,fim); 
			
			intercalar(vetor, inicio, meio, fim);
		}
		
		
		return vetor;
	}

	private void intercalar(int[] vetor, int inicio, int meio, int fim) {
		int esquerda = inicio;
		int direita = meio+1;
		
		int tamanho = vetor.length;
		int[] aux = new int[tamanho];
	
		for(int i = inicio; i <= fim; i++) {
			aux[i] = vetor[i];
		}
		
		
		for(int i = inicio; i <= fim; i++) {
			
			if(esquerda > meio) {
				vetor[i] = aux[direita];
				direita++;
			}else if(direita > fim) {
				vetor[i] = aux[esquerda];			
				esquerda++;
			}else if(aux[esquerda] < aux[direita]) {
				vetor[i] = aux[esquerda];
				esquerda++;
			}else {
				vetor[i] = aux[direita];
				direita++;
			}
		}
	
		
	}
	
}
