package br.edu.ifpr.boletim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoletimTest {

    @Test
    void deveCalcularMedia() {
        Boletim boletim = new Boletim();

        double resultado = boletim.calcularMedia(8, 10);

        assertEquals(9.0, resultado);
    }

    @Test
    void deveAprovarAluno() {
        Boletim boletim = new Boletim();

        String resultado = boletim.verificarSituacao(7);

        assertEquals("APROVADO", resultado);
    }

    @Test
    void deveColocarAlunoEmRecuperacao() {
        Boletim boletim = new Boletim();

        String resultado = boletim.verificarSituacao(5);

        assertEquals("RECUPERACAO", resultado);
    }

    @Test
    void deveReprovarAluno() {
        Boletim boletim = new Boletim();

        String resultado = boletim.verificarSituacao(3);

        assertEquals("REPROVADO", resultado);
    }

    @Test
    void deveContarAprovados() {
        Boletim boletim = new Boletim();

        double[] medias = {8, 5, 7, 3};

        int resultado = boletim.contarAprovados(medias);

        assertEquals(2, resultado);
    }

    @Test
    void deveRetornarZeroQuandoNaoHouverAprovados() {
        Boletim boletim = new Boletim();

        double[] medias = {4, 5, 6};

        int resultado = boletim.contarAprovados(medias);

        assertEquals(0, resultado);
    }

    @Test
    void deveRetornarZeroParaArrayVazio() {
        Boletim boletim = new Boletim();

        double[] medias = {};

        int resultado = boletim.contarAprovados(medias);

        assertEquals(0, resultado);
    }
}
