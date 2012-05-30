package br.gov.serpro.security;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import br.gov.frameworkdemoiselle.security.Authenticator;
import br.gov.frameworkdemoiselle.security.User;

@Alternative
public class MeuAutenticador implements Authenticator {

	private static final long serialVersionUID = 1L;

	@Inject
	private Credentials credentials;
	
	boolean authenticated = false;

	@Override
	public boolean authenticate() {
		if (credentials.getUsername().equals("zyc") && credentials.getPassword().equals("zyc")) {
			authenticated = true;

		} else if (credentials.getUsername().equals("eudes") && credentials.getPassword().equals("biba")) {
			authenticated = true;
		}

		return authenticated;
	}

	@Override
	public void unAuthenticate() {
	}

	@Override
	public User getUser() {
		return authenticated ? credentials : null;
	}

}
