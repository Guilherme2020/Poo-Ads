package cap10.Exercicios.interfaces.Conta.domain;

public class SeguroDeVida implements Tributavel {
	@Override
	public double calculaTributos() {
		return 42;
	}
}
