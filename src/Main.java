import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual ingrediente você quer buscar: ");

        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNome(scanner.nextLine());

        ApiClient apiClient = new ApiClient();
        String jsonResponse = apiClient.buscarReceitasPorIngrediente(ingrediente.getNome());

        System.out.println(jsonResponse);
    }
}