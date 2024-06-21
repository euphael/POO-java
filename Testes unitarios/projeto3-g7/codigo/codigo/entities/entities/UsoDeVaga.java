package entities;

import java.time.LocalDateTime;

public class UsoDeVaga {

	private static final double FRACAO_USO = 0.25;
	private static final double VALOR_FRACAO = 4.0;
	private static final double VALOR_MAXIMO = 50.0;
	private double valorServicos;
	private Vaga vaga;
	private LocalDateTime entrada;
	private LocalDateTime saida;
	private double valorPago;
	private Servicos servicos;

	/**
	 * Construtor da classe UsoDeVaga.
	 *
	 * @param vaga A vaga de estacionamento a ser usada.
	 */
	public UsoDeVaga(Vaga vaga) {
		this.vaga = vaga;
		this.entrada = LocalDateTime.now();
	}

	/**
	 * Registra a saída do veículo da vaga e calcula o valor a ser pago com base no
	 * tempo de uso.
	 *
	 * @return O valor a ser pago pelo uso da vaga.
	 */
	public double sair() {
		if (vaga.sair()) {
			this.saida = LocalDateTime.now();
			// Calcule o tempo de uso em horas
			long tempoEmHoras = entrada.until(saida, java.time.temporal.ChronoUnit.HOURS);
			if (tempoEmHoras >= servicos.getMinPermanencia()) {
				valorServicos = servicos.getValor();
			} else {
				return 0;
			}
			// Calcule o valor a ser pago, limitado ao valor máximo
			valorPago = (Math.min(tempoEmHoras * VALOR_FRACAO, VALOR_MAXIMO)) + valorServicos;

			return valorPago;
		} else {
			return 0;
		}
	}

	/**
	 * Verifica se o uso da vaga ocorreu no mês especificado.
	 *
	 * @param mes O mês a ser verificado (1 para janeiro, 2 para fevereiro, etc.).
	 * @return true se o uso da vaga ocorreu no mês especificado, false caso
	 *         contrário.
	 */
	public boolean ehDoMes(int mes) {
		return this.entrada.getMonthValue() == mes;
	}

	/**
	 * Obtém o valor pago pelo uso da vaga.
	 *
	 * @return O valor pago pelo uso da vaga.
	 */
	public double valorPago() {
		return valorPago;
	}

	public boolean adicionarServico(Servicos servicos) {
		if (this.servicos == null) {
			this.servicos = servicos;
			return true;
		} else {
			return false;
		}
	}
}