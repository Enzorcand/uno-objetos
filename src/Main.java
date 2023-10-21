import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Hand> jogadores = new ArrayList<>();
        Deck baralho = new Deck(1);

        System.out.println("Insira o numero de jogadores:");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            Hand h = new Hand(baralho);
            jogadores.add(h);
        }
    }
}