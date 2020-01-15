package br.com.gft.main;

import java.util.*;

import br.com.gft.model.Pessoa;

public class Main {
	public static void main(String[] args) {
		Pessoa joao = new Pessoa("João", 15);
		Pessoa leandro = new Pessoa("Leandro", 21);
		Pessoa paulo = new Pessoa("Paulo", 17);
		Pessoa jessica = new Pessoa("Jessica", 18);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(joao);
		pessoas.add(leandro);
		pessoas.add(paulo);
		pessoas.add(jessica);
		
		System.out.println(maiorIdade(pessoas));
		
		System.out.println("Quantidade de pessoa: " + pessoas.size());
		
		excluiMenores(pessoas);
		
		System.out.println("Quantidade de pessoa: " + pessoas.size());
		
		System.out.println(idadePessoa("Jessica", pessoas));
	}
	
	static String maiorIdade(List<Pessoa> pessoas) {
		if(pessoas.size() == 0) {
			return "Sem pessoas na lista";
		}
		int indice = 0;
		int maiorIdade = -1;
		
		for(int i = 0; i < pessoas.size(); i++) {
			if(pessoas.get(i).getIdade() > maiorIdade) {
				maiorIdade = pessoas.get(i).getIdade();
				indice = i;
			}
		}
		
		return pessoas.get(indice).getNome();
	}
	
	static void excluiMenores(List<Pessoa> pessoas) {
		for(int i = 0; i < pessoas.size(); i++) {
			if(pessoas.get(i).getIdade() < 18) {
				String fulano = pessoas.get(i).getNome();
				pessoas.remove(i);
				System.out.println(fulano + " removido da lista.");
			}
		}
	}
	
	static int idadePessoa(String nome, List<Pessoa> pessoas) {
		int idade = -1;
		
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getNome() == nome) {
				idade = pessoa.getIdade();
			}
		}
		
		return idade;
	}
}
