package ISP.ERROR;

import ISP.Produto;
import ISP.Usuario;

public class SuperUsuario implements permissaoSuperUsuario {

	public void cadastrarProduto(Produto dataProduto) {
		// ...
	}

	public void editarProduto(Produto dataProduto) {
		// ...
	}

	public void deletarProduto(int produtoId) {
		// ...
	}

	public void consultarCarrinhoDeCompras(int usuarioId) { // M�todo exclusivo do cliente
		// Se usar uma interface com esse m�todo, a classe ser� obrigada a implementa-la, mesmo que n�o
		// v� usar, e isso vai contra o princ�pio do ISP
	}

	public void cadastrarUsuario(Usuario usuario) {
		// ...
	}

	public void editarUsuario(Usuario usuario) {
		// ...
	}

	public void consultarUsuario(int usuarioId) {
		// ...
	}

	public void deletarUsuario(int usuarioId) {
		// ...
	}

	public void visualizarVendas(int usuarioId) {
		// ...
	}

	public void consultarProduto(int produtoId) {
		// ...
	}

}
