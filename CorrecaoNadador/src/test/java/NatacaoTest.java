import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class NatacaoTest {

    private Natacao natacao = new Natacao();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        natacao.setNome("ze");
        natacao.setIdade(6);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
     *
     */
    @org.junit.jupiter.api.Test
    void verificarCategoria() {
        assertEquals("Não pode ser nadador", natacao.verificarCategoria());
        natacao.setIdade(9);
        assertEquals("Infantil", natacao.verificarCategoria());
        natacao.setIdade(13);
        assertEquals("Juvenil", natacao.verificarCategoria());
        natacao.setIdade(20);
        assertEquals("Adulto", natacao.verificarCategoria());
        natacao.setIdade(-20);
        assertEquals("Inválido", natacao.verificarCategoria());
    }

}