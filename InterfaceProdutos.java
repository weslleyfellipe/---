package TestesProdutos;

public class InterfaceProdutos {
    private String nome;
    private double valor;
    private boolean disponivel;

    public InterfaceProdutos(String nome, double valor, boolean disponivel) {
        this.nome = nome;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Valor: R$ " + valor + ", Disponível: " + (disponivel ? "Sim" : "Não");
    }
}

