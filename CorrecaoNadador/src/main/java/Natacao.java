/**
 *
 */
public class Natacao {

    private String nome;
    private int idade;

    public Natacao() {
    }

    /**
     *
     * @param nome
     * @param idade
     */
    public Natacao(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *
     * @return
     */
    public String verificarCategoria() {
        if(this.idade > 0 && this.idade < 8) {
            return "Não pode ser nadador";
        } else if(this.idade >= 8 && this.idade <= 10) {
            return "Infantil";
        } else if(this.idade >= 11 && this.idade <= 17) {
            return "Juvenil";
        } else if(this.idade >= 18) {
            return "Adulto";
        } else {
            return "Inválido";
        }
    }

    @Override
    public String toString() {
        return "\nNome = " + nome
             + "\nIdade = " + idade
             + "\nVerificar categoria = " + this.verificarCategoria();
    }
}
