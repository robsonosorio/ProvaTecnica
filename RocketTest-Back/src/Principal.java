import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("========================= tarefa 1 =========================");

        for (int pares = 0; pares <= 100; pares+=2) {
            System.out.println(pares);
        }

        System.out.println("\n========================= tarefa 2 =========================");

        Scanner read = new Scanner(System.in);
        String cpf;

        System.out.print("Digite seu CPF: ");
        cpf = read.nextLine();

        Boolean verificaNumeros = cpf.matches("[0-9]*");

        if(cpf.length() != 11){
            System.out.println("CPF inválido! Seu CPF deve conter 11 dígitos!");
        }else if(verificaNumeros == false){
            System.out.println("CPF inválido! Seu CPF deve conter apenas números!");
        }else{
            System.out.println("CPF: " + cpf + " Validado com sucesso!");
        }

        System.out.println("\n========================= tarefa 3 =========================");

        float valor;
        float percentual;

        System.out.print("Informe um valor: R$");
        valor = read.nextFloat();
        System.out.print("Informe percentual de desconto: ");
        percentual = read.nextFloat();

        float valorComDesconto = valor - (valor * percentual / 100);
        System.out.print("Valor com desconto : R$" + valorComDesconto);
    }
}
