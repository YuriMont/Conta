
package execicioconta;

import Entidades.Conta;
import Entidades.ExcecoesConta;
import java.util.Scanner;

public class ExecicioConta {

    public static void main(String[] args) {
      try{
          Scanner t = new Scanner(System.in);
          System.out.println("Insira os dados da conta: ");
          double saldo = 0; 
          System.out.print("Número: ");
          int numero = t.nextInt();
          System.out.print("Titular: ");
          t.nextLine();
          String nome = t.nextLine();
          System.out.print("Saldo inicial: ");
          double saldoIn=t.nextDouble();
          System.out.print("Limite de saque: ");
          double limite = t.nextDouble();
          System.out.println("");
          Conta con = new Conta(numero, nome, saldo, limite);
          con.deposito(saldoIn);
         
          System.out.print("Insira o valor para sacar: ");
           double quantia = t.nextDouble();
           con.saque(quantia);
          System.out.println("Novo saldo: "+String.format("%.2f", con.getSaldo())+" R$ ");   
      }
      catch(ExcecoesConta e){
          System.out.println("Erro ao sacar: "+ e.getMessage());
      }
    }
    
}
