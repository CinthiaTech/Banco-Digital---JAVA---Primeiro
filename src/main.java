import java.util.List;

public class main {

    public static void main(String[] args) {
           Cliente Cinthia_Eller = new Cliente();
           Cinthia_Eller.setNome("Cinthia_Eller");

           Conta cc = new ContaCorrente(Cinthia_Eller);
           Conta poupanca = new ContaPoupança(Cinthia_Eller);


       cc.depositar(5800);
       cc.transferir(2200, poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();

       poupanca.depositar(4000.99);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();

       }

}