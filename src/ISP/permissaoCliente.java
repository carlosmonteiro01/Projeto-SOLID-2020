package ISP;

public interface permissaoCliente extends permissaoUsuario {
	//Interface que orienta as implementa��es dos perfil cliente.
	void podeConsultarCarrinhoDeCompras(int usuarioId);
}
