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
                parkingLabels[i].setBounds(v.getxInit(), v.getyInit(), 1058, 794);
                int xstep, ystep;
                if (v.getInit() != v.getFinal()) {
                    switch (i) {
                        case 0:
                            v.setFinal(15, -310);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -310) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -310) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 15) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 1:
                            v.setFinal(15, -219);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -219) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -219) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 15) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 2:
                            v.setFinal(15, -128);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -128) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -128) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 15) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 3:
                            v.setFinal(350, -310);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -310) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -310) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 350) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 4:
                            v.setFinal(350, -219);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -219) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -219) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 350) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 5:
                            v.setFinal(350, -128);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -128) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -128) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 350) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 6:
                            v.setFinal(550, -310);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -310) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -310) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 550) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 7:
                            v.setFinal(550, -219);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -219) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -219) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 550) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 8:
                            v.setFinal(550, -128);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -128) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -128) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 550) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 9:
                            v.setFinal(900, -310);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -310) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -310) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 900) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 10:
                            v.setFinal(900, -219);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -219) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -219) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 900) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 11:
                            v.setFinal(900, -128);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > -128) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > -128) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 900) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 12:
                            v.setFinal(15, 123);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 123) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 123) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 15) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 13:
                            v.setFinal(15, 214);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 214) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 214) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 15) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 14:
                            v.setFinal(15, 310);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 310) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 310) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 15) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 15:
                            v.setFinal(350, 123);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 123) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 123) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 350) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 16:
                            v.setFinal(350, 214);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 214) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 214) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 350) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 17:
                            v.setFinal(350, 310);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 310) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 310) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 350) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 18:
                            v.setFinal(550, 123);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 123) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 123) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 550) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 19:
                            v.setFinal(550, 214);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 214) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 214) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 550) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 20:
                            v.setFinal(550, 310);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 310) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 310) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 550) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 21:
                            v.setFinal(900, 123);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 123) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 123) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 900) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 22:
                            v.setFinal(900, 214);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 214) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 214) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 900) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 23:
                            v.setFinal(900, 310);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 310) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 310) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit < 900) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                    }
                }

            }
        }
    }

    public static void leave(Voiture myVoit) {
        for (int i = 0; i < tabParking.length; i++) {
            Voiture v = ParkingUI.tabParking[i];
            if (v == null) {
                parkingLabels[i].setIcon(null);
            } else {
                parkingLabels[i].setIcon(new javax.swing.ImageIcon("Voiture.png"));
                parkingLabels[i].setBounds(v.getxInit(), v.getyInit(), 1058, 794);
                int xstep, ystep;
                if (v.getInit() != v.getFinal()) {
                    switch (i) {
                        case 0:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit < 200) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            parkingLabels[i].setIcon(null);
                            break;
                        case 1:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit < 200) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            parkingLabels[i].setIcon(null);
                            break;
                        case 2:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit < 200) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            parkingLabels[i].setIcon(null);
                            break;
                        case 3:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit > 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            parkingLabels[i].setIcon(null);
                            break;
                        case 4:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit > 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            parkingLabels[i].setIcon(null);
                            break;
                        case 5:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit > 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            parkingLabels[i].setIcon(null);
                            break;
                        case 6:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit > 750) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            parkingLabels[i].setIcon(null);
                            break;
                        case 7:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit > 750) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            parkingLabels[i].setIcon(null);
                            break;
                        case 8:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit > 750) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit += xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            parkingLabels[i].setIcon(null);
                            break;
                        case 9:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit > 750) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 10:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit > 750) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 11:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit < 0) {
                                    while (v.xInit > 750) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit < 0) {
                                    v.yInit += ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 12:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 13:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 14:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit < 200) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 15:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit > 200) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 16:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit > 200) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 17:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit > 200) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 18:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 19:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 20:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit < 750) {
                                        v.xInit += xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 21:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit > 750) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 22:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit > 750) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                        case 23:
                            v.setFinal(0, 0);
                            for (int j = 0; j < 10; j++) {
                                xstep = (v.getxFinal() - v.getxInit()) / 15;
                                ystep = (v.getyFinal() - v.getyInit()) / 15;
                                if (v.yInit > 0) {
                                    while (v.xInit > 750) {
                                        v.xInit -= xstep;
                                        parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                        try {
                                            Thread.sleep(25);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                while (v.yInit > 0) {
                                    v.yInit -= ystep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                while (v.xInit > 0) {
                                    v.xInit -= xstep;
                                    parkingLabels[i].setBounds(v.xInit, v.yInit, 1058, 794);
                                    try {
                                        Thread.sleep(25);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            break;
                    }
                }

            }
        }
    }
}
