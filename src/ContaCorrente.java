public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Imprimir o Extrato Bancário da Conta Corrente===");
        System.out.println("Tipo: Corrente");
        super.ImprimirInformações();
    }
}

