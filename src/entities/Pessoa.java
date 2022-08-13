//primeira classe criada

package entities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pessoa {

	// atributos (dados)
	private Integer idPessoa;
	private String nome;
	private String cpf;
	private String email;

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {

		if (idPessoa <= 0)
			throw new IllegalArgumentException("O id de ve ser maior que zero.");

		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		if (nome == null)
			throw new IllegalArgumentException("O nome é obrigatorio.");
		// trim().length() - limpa os campos vazios no inicio e no final
		else if (nome.trim().length() < 6)
			throw new IllegalArgumentException("O nome deve conter no minimo 6 caracteres.");

		else if (nome.trim().length() > 150)
			throw new IllegalArgumentException("O nome deve conter no maximo 150 caracteres.");

		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		// ^ marca inicio $ marca final [] - somentes numeros {} - quantidade de
		// caracteres
		// pattern usado para validar a formaula que esta entre ()
		// matcher é para verificar a validação
		Pattern pattern = Pattern.compile("^[0-9]{11}$");
		Matcher matcher = pattern.matcher(cpf);
		// ! negação - não - se não der verdadeiro
		if (!matcher.matches())
			throw new IllegalArgumentException("O cpf deve conter 11 digitos numericos");

		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {

		if (email == null)
			throw new IllegalArgumentException("O email e obrigatorio");

		else if (email.trim().length() < 10)
			throw new IllegalArgumentException("O email deve conter no mínimo 6 caracteres.");

		else if (email.trim().length() > 100)
			throw new IllegalArgumentException("O email deve conter no máximo 100 caracteres.");

		this.email = email;
	}

}
