public class ContaBancaria {

  private int numeroConta;
  private String nomeTitular;
  private float saldo;

  int getNumConta(){
    return numeroConta;
  }

  float getSaldo(){
    return saldo;
  }
  
  ContaBancaria(int numConta, String nmTitular){
    numeroConta = numConta;
    nomeTitular = nmTitular;
    saldo = 0;
  }

  void SacarValor(float valor){

    saldo = saldo - valor;

    System.out.println("\n\nNúmero da conta: " + numeroConta);
    System.out.println("Titular da conta: " + nomeTitular);
    System.out.println("Valor sacado: " + valor);
    System.out.println("Saldo disponível: " + saldo);

  }

  void DepositarValor(float valor){
    saldo = saldo + valor;

    System.out.println("\n\nNúmero da conta: " + numeroConta);
    System.out.println("Titular da conta: " + nomeTitular);
    System.out.println("Valor depositado: " + valor);
    System.out.println("Saldo disponível: " + saldo);
  }

  void ListarConta(){
    System.out.println("\n\nNúmero da conta: " + numeroConta);
    System.out.println("Titular da conta: " + nomeTitular);
    System.out.println("Saldo disponível: " + saldo);
  }

}
