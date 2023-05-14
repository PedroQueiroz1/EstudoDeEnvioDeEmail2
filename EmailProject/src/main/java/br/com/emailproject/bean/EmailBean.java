package br.com.emailproject.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.emailproject.dto.EmailLayout;
import br.com.emailproject.model.Email;
import br.com.emailproject.service.EmailService;

/*
 * O Wildfly está proporcioando as anotações:
 * @Named,@RequestScoped,@Inject...
 * Ele implementa a especificação JavaEE completa!
 */

//Named = referencia a pagina, é um Bean.
@Named
@RequestScoped
public class EmailBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final String DESTINATARIO = "pedrotestejava@outlook.com";
	private static final String ASSUNTO = "testando segundo envio de email";

	@Inject
	private EmailService emailService;
	
	public String enviarEmail() {
		emailService.enviar(montarEmail());
		return null;
	}
	
	private Email montarEmail() {
		EmailLayout layout = new EmailLayout();
		return layout.montarEmailAdministrator(DESTINATARIO, ASSUNTO);
	}
}
