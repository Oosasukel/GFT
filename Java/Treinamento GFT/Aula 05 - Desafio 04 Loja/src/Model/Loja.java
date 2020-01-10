package Model;

import java.util.List;

public class Loja {
	public Loja() {
		
	}
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}
	
	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros(){
		if(livros.size() > 0) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("A loja " + nome + " possui estes livros para venda:");
			for(int i = 0; i < livros.size(); i++) {
				System.out.println("Titulo: " + livros.get(i).getNome() + " , preço: " + livros.get(i).getPreco() + " , quantidade: " + livros.get(i).getQtd() + " em estoque.");
			}
		}
		else {
			System.out.println("------------------------------------------------------------------");
			System.out.println("A loja não tem livros no seu estoque.");
		}
	}
	
	public void listaVideoGames() {
		if(videoGames.size() > 0) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("A loja " + nome + " possui estes video-games para venda:");
			for(int i = 0; i < videoGames.size(); i++) {
				System.out.println("Video-game: " + videoGames.get(i).getModelo() + " , preço: " + videoGames.get(i).getPreco() + " , quantidade: " + videoGames.get(i).getQtd() + " em estoque.");
			}
		}
		else {
			System.out.println("------------------------------------------------------------------");
			System.out.println("A loja não tem video-games no seu estoque.");
		}
	}
	
	public double calculaPatrimonio() {
		double patrimonio = 0;

		for(int i = 0; i < videoGames.size(); i++) {
			patrimonio += videoGames.get(i).getPreco() * videoGames.get(i).getQtd();
		}
		
		for(int i = 0; i < livros.size(); i++) {
			patrimonio += livros.get(i).getPreco() * livros.get(i).getQtd();
		}
		

		System.out.println("------------------------------------------------------------------");
		System.out.println("O patrimonio da loja: "+ nome + " é de R$ " + patrimonio);
		
		return patrimonio;
	}
}
