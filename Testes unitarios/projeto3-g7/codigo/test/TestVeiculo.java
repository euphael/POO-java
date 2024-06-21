package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import entities.*;

public class TestVeiculo {
    Veiculo veiculo = new Veiculo("3561");
  @Test
 public void testVeiculo() {
        Veiculo veiculo = new Veiculo("ABC123");
        assertEquals(0, veiculo.totalDeUsos());
        assertEquals(0.0, veiculo.totalArrecadado(), 0.001);
    }

    @Test
    public void testEstacionar() {
        Veiculo veiculo = new Veiculo("XYZ789");
        Vaga vaga = new Vaga();

        veiculo.estacionar(vaga);
        assertEquals(1, veiculo.totalDeUsos());
    }

    @Test
    public void testSair() {
        Veiculo veiculo = new Veiculo("LMN456");
        Vaga vaga = new Vaga();

        veiculo.estacionar(vaga);
        double valorPago = veiculo.sair();

        assertEquals(0, veiculo.totalDeUsos());
        assertEquals(10.0, valorPago, 0.001); // Assumindo que o valor pago seja 10.0
    }

    @Test
    public void testTotalArrecadado() {
        Veiculo veiculo = new Veiculo("PQR789");
        Vaga vaga1 = new Vaga();
        Vaga vaga2 = new Vaga();

        veiculo.estacionar(vaga1);
        veiculo.estacionar(vaga2);

        assertEquals(2, veiculo.totalDeUsos());

        double valorPago1 = veiculo.sair();
        double valorPago2 = veiculo.sair();

        assertEquals(0, veiculo.totalDeUsos());
        assertEquals(20.0, veiculo.totalArrecadado(), 0.001); // Assumindo que o valor pago seja 10.0 por uso
    }
}