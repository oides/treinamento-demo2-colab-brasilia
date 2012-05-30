package br.gov.serpro.security;

import javax.enterprise.inject.Alternative;

import br.gov.frameworkdemoiselle.security.Authorizer;

@Alternative
public class MeuAutorizador implements Authorizer {

	private static final long serialVersionUID = 1L;

	@Override
	public boolean hasRole(String role) {
		return true;
	}

	@Override
	public boolean hasPermission(String resource, String operation) {
		return true;
	}

}
