
public class Main {
	
	public static void main(String[] args) {
		InterfaceCliente cliente = Factory.getCliente("Jo�o Marcos Maciel", "joaoMaciel@dipjava.com", "1296659874");
		
		InterfaceEmail email = Factory.getEmail();
		email.enviarEmail(cliente, "Sua solicita��o de servi�o", "Segue em axexo o seu n�mero de solicita��o de servi�o.");
		
		InterfaceSms sms = Factory.getSms();
		sms.enviarSms(cliente, "Segue sua solicita��o de servi�o...");
	
	}
}

