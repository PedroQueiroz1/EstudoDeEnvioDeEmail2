package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {

	private static final String QUEBRA_DE_LINHA_UNICA = "<br>";
	private static final String QUEBRA_DE_LINHA_DUPLA = "<br><br>";
	
	public Email montarEmailAdministrator(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto.append("testeee")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto.append("Solicito alguma coisa alguma coisa!")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
		
		return new Email(destinatario, assunto, texto.toString());
	}
	
	
	private String gerarAssinatura(StringBuilder texto) {
		return texto.append("Att.:")
					.append(QUEBRA_DE_LINHA_UNICA)
					.append("Pedro Queiroz")
					.append(QUEBRA_DE_LINHA_DUPLA).toString();
	}


	private String gerarRodape(StringBuilder texto) {
		return texto.append("Email automatico. Favor, não responder esse e-mail!").toString();
	}
}
