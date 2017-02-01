package cap10.exemplo;

public abstract  class Funcionario {
	
	private int senha;
	
	public int getSenha() {
		return senha;
	}
	
	
	abstract  boolean autentica(int senha);
	
}
