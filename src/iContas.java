public abstract interface iContas {

    void sacar (double valor);
    void depositar (double valor);
    void transferir (double valor, iContas ContaDestino);

    default void imprimirExtrato() {

    }
}
