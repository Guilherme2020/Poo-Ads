
package cap10.exemplo;

class Gerente extends Funcionario implements Autenticavel{

	
	public boolean autentica(int senha){
		if(this.getSenha() != senha){
			return false;
		}
		return true;
	}

	
}
