package ISP.ERROR;

import ISP.Produto;
import ISP.Usuario;

public interface permissaoSuperUsuario {
	void cadastrarProduto(Produto dataProduto);
	void editarProduto(Produto dataProduto);
	void deletarProduto(int produtoId);
	void consultarCarrinhoDeCompras(int usuarioId); // Fun��o exclusiva de clitente
	void cadastrarUsuario(Usuario usuario);
	void editarUsuario(Usuario usuario);
	void consultarUsuario(int usuarioId);
	void deletarUsuario(int usuarioId);
	void visualizarVendas(int usuarioId); // Fun��o exclusiva do vendedor
	void consultarProduto(int produtoId);
}

//Interface gen�rica
