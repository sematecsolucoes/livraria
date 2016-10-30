package br.com.sematec.livraria.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.sematec.livraria.dao.AutorDAO;
import br.com.sematec.livraria.dao.LivroDAO;
import br.com.sematec.livraria.modelo.Autor;
import br.com.sematec.livraria.modelo.Livro;

@ManagedBean
public class LivroBean {
	private Livro livro = new Livro();



	public Livro getLivro() {
		return livro;
	}


	public void gravar() {
		System.out.println("Gravando livro " + this.livro.getTitulo());
		if (livro.getAutores().isEmpty()) {
			throw new RuntimeException("Livro deve ter pelo menos um Autor.");
		}
		LivroDAO.getInstance().adiciona(this.livro);
	}

}
