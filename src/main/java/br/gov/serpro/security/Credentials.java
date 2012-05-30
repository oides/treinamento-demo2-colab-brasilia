package br.gov.serpro.security;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.gov.frameworkdemoiselle.security.User;

@Named
@SessionScoped
public class Credentials implements User {

	private static final long serialVersionUID = 1L;

	private String username;

	private String password;

	@Override
	public String getId() {
		return username;
	}

	@Override
	public Object getAttribute(Object key) {
		return null;
	}

	@Override
	public void setAttribute(Object key, Object value) {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
