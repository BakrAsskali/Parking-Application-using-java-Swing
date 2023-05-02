/**
 * Voiture
 */
public class Voiture implements Runnable {

    String nom;
    Parking park;

    public Voiture(String name, Parking park) {
        this.nom = name;
        this.park = park;
    }

    public void run() {
        System.out.format("[%s]: Je débute ! \n", this.nom);
        try {
            while (true) {
                Thread.sleep((long) (50000 * Math.random()));
                System.out.format("[%s]: Je demande à rentrer \n", this.nom);
                this.rentrer();
                System.out.format("[%s]: Je viens d'entrer \n", this.nom);
                Thread.sleep((long) (50000 * Math.random()));
                System.out.format("[%s]: Je demande à sortir \n", this.nom);
                this.park.leave(this);
            }
        } catch (InterruptedException e) {
            System.out.format("[%s]: Je meurs ! \n", this.nom);
        }
    }

    public void rentrer() throws InterruptedException {
        while (!this.park.accept(this)) {
            Thread.sleep((long) (50000 * Math.random()));
            System.out.format("[%s]: Je redemande à rentrer \n", this.nom);
        }
    }

    public static void main(String[] args) {
        ParkingUI parking = new ParkingUI();
        Parking park = new Parking(24);
        int nbVoitures = 50;
        Thread[] voitures = new Thread[nbVoitures];
        for (int i = 0; i < nbVoitures; i++) {
            voitures[i] = new Thread(new Voiture("Voiture " + i, park));
            voitures[i].start();
            ParkingUI.draw();
        }
    }
}