import java.util.Scanner;

public class RelatorioVendedores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o nome do vendedor: ");
            String nomeVendedor = scanner.nextLine();

            System.out.print("Digite o número de produtos vendidos: ");
            int numeroProdutos = scanner.nextInt();

            double totalVendas = 0;

            for (int i = 1; i <= numeroProdutos; i++) {
                System.out.println("--- Produto #" + i + " ---");

                System.out.print("Digite o preço unitário: R$ ");
                double precoUnitario = scanner.nextDouble();

                System.out.print("Digite a quantidade vendida: ");
                int quantidadeVendida = scanner.nextInt();

                double vendaProduto = precoUnitario * quantidadeVendida;
                totalVendas += vendaProduto;
            }

            double salario = totalVendas * 0.3;

            System.out.println("---- Relatório do Vendedor ----");
            System.out.println("Nome do vendedor: " + nomeVendedor);
            System.out.println("Total de vendas: R$ " + totalVendas);
            System.out.println("Salário do vendedor: R$ " + salario);

            scanner.nextLine(); 

            System.out.print("Deseja digitar os dados de mais um vendedor? (s/N): ");
            String resposta = scanner.nextLine();

            continuar = resposta.equalsIgnoreCase("s");

            System.out.println();
        }



    }
}
