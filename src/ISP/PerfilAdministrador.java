package ISP;

public class PerfilAdministrador extends Usuario implements permissaoAdministrador {
	
	//Composi��o - Aternativa para reutiliza��o de m�todos de classe sem afetar a heran�a
	Produto CrudProduto;

	public void podeVisualizarVendas(int usuarioId) {
		//...
	}
	public void podeCadastrarUsuario(Usuario usuario) {
		cadastrarUsuario(usuario);
	}
	public void podeEditarUsuario(Usuario usuario) {
		editarUsuario(usuario);
	}
	public void podeConsultarUsuario(int usuarioId) {
		consultarUsuario(usuarioId);
	}
	public void podeDeletarUsuario(int usuarioId) {
		deletarUsuario(usuarioId);
	}
	public void podeCadastrarProduto(Produto produto) {
		CrudProduto.cadastrarProduto(produto);
	}
	public void podeEditarProduto(Produto produto) {
		CrudProduto.editarProduto(produto);;
	}
	public void podeDeletarProduto(int produtoId) {
		CrudProduto.deletarProduto(produtoId);
	}
	public void podeConsultarProduto(int produtoId) {
		CrudProduto.consultarProduto(produtoId);
	}
	public void podeVerTotalVendas() {
		// ...
	}
}