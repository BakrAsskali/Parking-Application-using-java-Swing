import javax.swing.*;

/**
 * ParkingUI
 */
public class ParkingUI extends javax.swing.JFrame {

    public static Voiture tabParking[] = new Voiture[24];
    public static JLabel[] parkingLabels = new JLabel[24];
    JLabel background = new JLabel();

    public ParkingUI() {
        initComponents();

        for (int i = 0; i < tabParking.length; i++) {
            parkingLabels[i] = new JLabel();
            parkingLabels[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("Voiture.png")));
            parkingLabels[i].setBounds(0, 0, 1058, 794);
            this.add(parkingLabels[i]);
            background.add(parkingLabels[i]);
        }
    }

    private void initComponents() {
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Parking");
        this.setResizable(false);
        this.setSize(1058, 794);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("Parking.png")));
        background.setBounds(0, 0, 1058, 794);
        this.add(background);

        this.setVisible(true);
    }

    public static void draw() {
        for (int i = 0; i < tabParking.length; i++) {
            Voiture v = ParkingUI.tabParking[i];
            if (v == null) {
                parkingLabels[i].setIcon(null);
            } else {
                parkingLabels[i].setIcon(new javax.swing.ImageIcon("Voiture.png"));
                switch (i) {
                    case 0:
                        parkingLabels[i].setBounds(15, -310, 1058, 794);
                        break;
                    case 1:
                        parkingLabels[i].setBounds(15, -219, 1058, 794);
                        break;
                    case 2:
                        parkingLabels[i].setBounds(15, -127, 1058, 794);
                        break;
                    case 3:
                        parkingLabels[i].setBounds(350, -310, 1058, 794);
                        break;
                    case 4:
                        parkingLabels[i].setBounds(350, -219, 1058, 794);
                        break;
                    case 5:
                        parkingLabels[i].setBounds(350, -127, 1058, 794);
                        break;
                    case 6:
                        parkingLabels[i].setBounds(550, -310, 1058, 794);
                        break;
                    case 7:
                        parkingLabels[i].setBounds(550, -219, 1058, 794);
                        break;
                    case 8:
                        parkingLabels[i].setBounds(550, -127, 1058, 794);
                        break;
                    case 9:
                        parkingLabels[i].setBounds(900, -310, 1058, 794);
                        break;
                    case 10:
                        parkingLabels[i].setBounds(900, -219, 1058, 794);
                        break;
                    case 11:
                        parkingLabels[i].setBounds(900, -127, 1058, 794);
                        break;
                    case 12:
                        parkingLabels[i].setBounds(15, 123, 1058, 794);
                        break;

                    case 13:
                        parkingLabels[i].setBounds(15, 215, 1058, 794);
                        break;
                    case 14:
                        parkingLabels[i].setBounds(15, 310, 1058, 794);
                        break;
                    case 15:
                        parkingLabels[i].setBounds(350, 123, 1058, 794);
                        break;
                    case 16:
                        parkingLabels[i].setBounds(350, 215, 1058, 794);
                        break;
                    case 17:
                        parkingLabels[i].setBounds(350, 310, 1058, 794);
                        break;
                    case 18:
                        parkingLabels[i].setBounds(550, 123, 1058, 794);
                        break;
                    case 19:
                        parkingLabels[i].setBounds(550, 215, 1058, 794);
                        break;
                    case 20:
                        parkingLabels[i].setBounds(550, 310, 1058, 794);
                        break;
                    case 21:
                        parkingLabels[i].setBounds(900, 123, 1058, 794);
                        break;
                    case 22:
                        parkingLabels[i].setBounds(900, 215, 1058, 794);
                        break;
                    case 23:
                        parkingLabels[i].setBounds(900, 310, 1058, 794);
                        break;
                }
            }
        }
    }

}
