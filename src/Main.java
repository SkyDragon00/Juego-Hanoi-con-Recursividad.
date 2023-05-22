// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
                int numberOfDisks = 3; // Define el número de discos del juego

                HanoiTower hanoiTower = new HanoiTower(numberOfDisks);
                hanoiTower.solve();

                System.out.println("Número total de movimientos: " + hanoiTower.getNumberOfMoves());
            }
        }