package com.gabrielcunha.socialbooks.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException{

	
	private static final long serialVersionUID = 7739800756643283608L;

	public LivroNaoEncontradoException (String mensagem){
		super(mensagem);
	}
	
	public LivroNaoEncontradoException (String mensagem, Throwable causa){
		super(mensagem, causa);
	}
	
}
