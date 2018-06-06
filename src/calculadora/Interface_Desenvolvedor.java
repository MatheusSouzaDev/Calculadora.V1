package calculadora;


/* @author Matheus Sozua */
public class Interface_Desenvolvedor extends javax.swing.JFrame {

    public static int op1, op2, op3, n2, result;
    public static int n1[] = new int[6];
    public static String[] temp = new String[10], resultado;
    public static int verif = 0;

    public void exibe_resultado(int op) {
        /* Converte o resultado de acordo com a opção que está selecionada
         e retorna o valor */
        switch (op) {
            case 1:
                TXT_visor.setText(Integer.toBinaryString(result));
                temp[0] = Integer.toBinaryString(result);
                break;
            case 2:
                TXT_visor.setText(Integer.toString(result));
                temp[1] = Integer.toString(result);
                break;
            case 3:
                TXT_visor.setText(Integer.toHexString(result).toUpperCase());
                temp[2] = Integer.toHexString(result).toUpperCase();
                break;
        }
    }

    public void calculadora(int op) {
        /*  zera a calculadora e habilita apenas os botões que a opção iria usar */
        if (op == 1) {
            BTN_f5.setEnabled(true);
            BTN_f2.setEnabled(true);
            BTN_f4.setEnabled(true);
            BTN_f1.setEnabled(true);
            BTN_f3.setEnabled(true);
            BTN_CE.setEnabled(true);
            BTN_C.setEnabled(true);
            BTN_0.setEnabled(true);
            BTN_1.setEnabled(true);
            BTN_2.setEnabled(false);
            BTN_3.setEnabled(false);
            BTN_4.setEnabled(false);
            BTN_5.setEnabled(false);
            BTN_6.setEnabled(false);
            BTN_7.setEnabled(false);
            BTN_8.setEnabled(false);
            BTN_9.setEnabled(false);
            BTN_a.setEnabled(false);
            BTN_b.setEnabled(false);
            BTN_c.setEnabled(false);
            BTN_d.setEnabled(false);
            BTN_e.setEnabled(false);
            BTN_f.setEnabled(false);
            temp[0] = "0";
            verif = 0;
        } else if (op == 2) {
            BTN_f5.setEnabled(true);
            BTN_f2.setEnabled(true);
            BTN_f4.setEnabled(true);
            BTN_f1.setEnabled(true);
            BTN_f3.setEnabled(true);
            BTN_CE.setEnabled(true);
            BTN_C.setEnabled(true);
            BTN_0.setEnabled(true);
            BTN_1.setEnabled(true);
            BTN_2.setEnabled(true);
            BTN_3.setEnabled(true);
            BTN_4.setEnabled(true);
            BTN_5.setEnabled(true);
            BTN_6.setEnabled(true);
            BTN_7.setEnabled(true);
            BTN_8.setEnabled(true);
            BTN_9.setEnabled(true);
            BTN_a.setEnabled(false);
            BTN_b.setEnabled(false);
            BTN_c.setEnabled(false);
            BTN_d.setEnabled(false);
            BTN_e.setEnabled(false);
            BTN_f.setEnabled(false);
            temp[1] = "0";
            verif = 0;
        } else if (op == 3) {
            BTN_f5.setEnabled(true);
            BTN_f2.setEnabled(true);
            BTN_f4.setEnabled(true);
            BTN_f1.setEnabled(true);
            BTN_f3.setEnabled(true);
            BTN_CE.setEnabled(true);
            BTN_C.setEnabled(true);
            BTN_0.setEnabled(true);
            BTN_1.setEnabled(true);
            BTN_2.setEnabled(true);
            BTN_3.setEnabled(true);
            BTN_4.setEnabled(true);
            BTN_5.setEnabled(true);
            BTN_6.setEnabled(true);
            BTN_7.setEnabled(true);
            BTN_8.setEnabled(true);
            BTN_9.setEnabled(true);
            BTN_a.setEnabled(true);
            BTN_b.setEnabled(true);
            BTN_c.setEnabled(true);
            BTN_d.setEnabled(true);
            BTN_e.setEnabled(true);
            BTN_f.setEnabled(true);
            temp[2] = "0";
            verif = 0;
        } else {
            BTN_f5.setEnabled(false);
            BTN_f2.setEnabled(false);
            BTN_f4.setEnabled(false);
            BTN_f1.setEnabled(false);
            BTN_f3.setEnabled(false);
            BTN_CE.setEnabled(false);
            BTN_C.setEnabled(false);
            BTN_0.setEnabled(false);
            BTN_1.setEnabled(false);
            BTN_2.setEnabled(false);
            BTN_3.setEnabled(false);
            BTN_4.setEnabled(false);
            BTN_5.setEnabled(false);
            BTN_6.setEnabled(false);
            BTN_7.setEnabled(false);
            BTN_8.setEnabled(false);
            BTN_9.setEnabled(false);
            BTN_a.setEnabled(false);
            BTN_b.setEnabled(false);
            BTN_c.setEnabled(false);
            BTN_d.setEnabled(false);
            BTN_e.setEnabled(false);
            BTN_f.setEnabled(false);
            temp[0] = "0";
            temp[1] = "0";
            temp[2] = "0";
            verif = 0;
        }
    }

    public void operacao(int op) {
        /*  faz a conversão do número que está na tela com o tipo selecionado de
         entrada */
        if (op1 == 1) {
            if (op1 == op) {
                TXT_visor.setText(temp[0]);
                Op2.setSelectedIndex(0);
                verif = 1;
            } else {
                if (op == 2) {
                    temp[3] = temp[0];
                    n1[1] = Integer.parseInt(temp[3], 2);
                    TXT_visor.setText(Integer.toString(n1[1]));
                    Op2.setSelectedIndex(0);
                    verif = 1;
                } else if (op == 3) {
                    temp[4] = temp[0];
                    n1[2] = Integer.parseInt(temp[4], 2);
                    temp[4] = Integer.toHexString(n1[2]);
                    TXT_visor.setText(temp[4].toUpperCase());
                    verif = 1;
                    Op2.setSelectedIndex(0);
                }
            }
        } else if (op1 == 2) {
            if (op1 == op) {
                TXT_visor.setText(temp[1]);
                Op2.setSelectedIndex(0);
                verif = 1;
            } else {
                if (op == 1) {
                    temp[5] = temp[1];
                    n1[3] = Integer.parseInt(temp[5]);
                    temp[5] = Integer.toBinaryString(n1[3]);
                    TXT_visor.setText(temp[5]);
                    Op2.setSelectedIndex(0);
                    verif = 1;
                } else if (op == 3) {
                    temp[6] = temp[1];
                    n1[4] = Integer.parseInt(temp[6]);
                    temp[6] = Integer.toHexString(n1[4]);
                    TXT_visor.setText(temp[6].toUpperCase());
                    verif = 1;
                    Op2.setSelectedIndex(0);
                }
            }
        } else if (op1 == 3) {
            if (op1 == op) {
                TXT_visor.setText(temp[2]);
                Op2.setSelectedIndex(0);
                verif = 1;
            } else {
                if (op == 1) {
                    String hex;
                    int n6;
                    hex = temp[2];
                    n6 = Integer.parseInt(hex, 16);
                    temp[8] = Integer.toBinaryString(n6);
                    TXT_visor.setText(temp[8]);
                    Op2.setSelectedIndex(0);
                    verif = 1;
                } else if (op == 2) {
                    String hex = temp[2];
                    int n7;
                    n7 = Integer.parseInt(hex, 16);
                    TXT_visor.setText(Integer.toString(n7));
                    verif = 1;
                    Op2.setSelectedIndex(0);
                }
            }
        }
    }

    public void verificacao(int op) {
        /*  verifica a opção selecionada e armazena o número de acordo com que 
         a pessoa coloca o valor */
        if (op == 1) {
            temp[0] = TXT_visor.getText();
            TXT_visor.setText(temp[0]);
        } else if (op == 2) {
            temp[1] = TXT_visor.getText();
            TXT_visor.setText(temp[1]);
        } else if (op == 3) {
            temp[2] = TXT_visor.getText();
            TXT_visor.setText(temp[2]);
        }
    }

    public void calculo(int op) {
        /*  converte os valores para decimal para fazer o cálculo
         */
        if (op == 1) {
            n1[0] = Integer.parseInt(temp[9], 2);
            n2 = Integer.parseInt(TXT_visor.getText(), 2);
        } else if (op == 2) {
            n1[0] = Integer.parseInt(temp[9]);
            n2 = Integer.parseInt(TXT_visor.getText());
        } else if (op == 3) {
            n1[0] = Integer.parseInt(temp[9], 16);
            n2 = Integer.parseInt(TXT_visor.getText(), 16);
        }
    }

    public Interface_Desenvolvedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXT_visor = new javax.swing.JTextField();
        BTN_1 = new javax.swing.JButton();
        BTN_2 = new javax.swing.JButton();
        BTN_3 = new javax.swing.JButton();
        BTN_6 = new javax.swing.JButton();
        BTN_5 = new javax.swing.JButton();
        BTN_4 = new javax.swing.JButton();
        BTN_7 = new javax.swing.JButton();
        BTN_8 = new javax.swing.JButton();
        BTN_9 = new javax.swing.JButton();
        BTN_0 = new javax.swing.JButton();
        BTN_CE = new javax.swing.JButton();
        BTN_C = new javax.swing.JButton();
        BTN_a = new javax.swing.JButton();
        BTN_b = new javax.swing.JButton();
        BTN_c = new javax.swing.JButton();
        BTN_d = new javax.swing.JButton();
        BTN_e = new javax.swing.JButton();
        BTN_f = new javax.swing.JButton();
        BTN_f1 = new javax.swing.JButton();
        BTN_f2 = new javax.swing.JButton();
        BTN_f3 = new javax.swing.JButton();
        BTN_f4 = new javax.swing.JButton();
        BTN_f5 = new javax.swing.JButton();
        Op1 = new javax.swing.JComboBox();
        Op2 = new javax.swing.JComboBox();
        de = new javax.swing.JLabel();
        para = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Java - Desenvolvedor");
        setMinimumSize(new java.awt.Dimension(360, 394));
        setResizable(false);

        TXT_visor.setEditable(false);
        TXT_visor.setBackground(new java.awt.Color(255, 255, 255));
        TXT_visor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TXT_visor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_visor.setText("0");
        TXT_visor.setToolTipText("");
        TXT_visor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TXT_visor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_visorActionPerformed(evt);
            }
        });

        BTN_1.setBackground(new java.awt.Color(204, 204, 204));
        BTN_1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_1.setText("1");
        BTN_1.setEnabled(false);
        BTN_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_1ActionPerformed(evt);
            }
        });

        BTN_2.setBackground(new java.awt.Color(204, 204, 204));
        BTN_2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_2.setText("2");
        BTN_2.setEnabled(false);
        BTN_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_2ActionPerformed(evt);
            }
        });

        BTN_3.setBackground(new java.awt.Color(204, 204, 204));
        BTN_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_3.setText("3");
        BTN_3.setEnabled(false);
        BTN_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_3ActionPerformed(evt);
            }
        });

        BTN_6.setBackground(new java.awt.Color(204, 204, 204));
        BTN_6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_6.setText("6");
        BTN_6.setEnabled(false);
        BTN_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_6ActionPerformed(evt);
            }
        });

        BTN_5.setBackground(new java.awt.Color(204, 204, 204));
        BTN_5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_5.setText("5");
        BTN_5.setEnabled(false);
        BTN_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_5ActionPerformed(evt);
            }
        });

        BTN_4.setBackground(new java.awt.Color(204, 204, 204));
        BTN_4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_4.setText("4");
        BTN_4.setEnabled(false);
        BTN_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_4ActionPerformed(evt);
            }
        });

        BTN_7.setBackground(new java.awt.Color(204, 204, 204));
        BTN_7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_7.setText("7");
        BTN_7.setEnabled(false);
        BTN_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_7ActionPerformed(evt);
            }
        });

        BTN_8.setBackground(new java.awt.Color(204, 204, 204));
        BTN_8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_8.setText("8");
        BTN_8.setEnabled(false);
        BTN_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_8ActionPerformed(evt);
            }
        });

        BTN_9.setBackground(new java.awt.Color(204, 204, 204));
        BTN_9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_9.setText("9");
        BTN_9.setEnabled(false);
        BTN_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_9ActionPerformed(evt);
            }
        });

        BTN_0.setBackground(new java.awt.Color(204, 204, 204));
        BTN_0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_0.setText("0");
        BTN_0.setEnabled(false);
        BTN_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_0ActionPerformed(evt);
            }
        });

        BTN_CE.setBackground(new java.awt.Color(204, 204, 204));
        BTN_CE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_CE.setText("CLS");
        BTN_CE.setEnabled(false);
        BTN_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CEActionPerformed(evt);
            }
        });

        BTN_C.setBackground(new java.awt.Color(204, 204, 204));
        BTN_C.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_C.setText("CE");
        BTN_C.setEnabled(false);
        BTN_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CActionPerformed(evt);
            }
        });

        BTN_a.setBackground(new java.awt.Color(204, 204, 204));
        BTN_a.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_a.setText("A");
        BTN_a.setEnabled(false);
        BTN_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_aActionPerformed(evt);
            }
        });

        BTN_b.setBackground(new java.awt.Color(204, 204, 204));
        BTN_b.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_b.setText("B");
        BTN_b.setEnabled(false);
        BTN_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_bActionPerformed(evt);
            }
        });

        BTN_c.setBackground(new java.awt.Color(204, 204, 204));
        BTN_c.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_c.setText("C");
        BTN_c.setEnabled(false);
        BTN_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_cActionPerformed(evt);
            }
        });

        BTN_d.setBackground(new java.awt.Color(204, 204, 204));
        BTN_d.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_d.setText("D");
        BTN_d.setEnabled(false);
        BTN_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_dActionPerformed(evt);
            }
        });

        BTN_e.setBackground(new java.awt.Color(204, 204, 204));
        BTN_e.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_e.setText("E");
        BTN_e.setEnabled(false);
        BTN_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_eActionPerformed(evt);
            }
        });

        BTN_f.setBackground(new java.awt.Color(204, 204, 204));
        BTN_f.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_f.setText("F");
        BTN_f.setEnabled(false);
        BTN_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_fActionPerformed(evt);
            }
        });

        BTN_f1.setBackground(new java.awt.Color(204, 204, 204));
        BTN_f1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_f1.setText("+");
        BTN_f1.setEnabled(false);
        BTN_f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_f1ActionPerformed(evt);
            }
        });

        BTN_f2.setBackground(new java.awt.Color(204, 204, 204));
        BTN_f2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_f2.setText("-");
        BTN_f2.setEnabled(false);
        BTN_f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_f2ActionPerformed(evt);
            }
        });

        BTN_f3.setBackground(new java.awt.Color(204, 204, 204));
        BTN_f3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_f3.setText("/");
        BTN_f3.setEnabled(false);
        BTN_f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_f3ActionPerformed(evt);
            }
        });

        BTN_f4.setBackground(new java.awt.Color(204, 204, 204));
        BTN_f4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_f4.setText("*");
        BTN_f4.setEnabled(false);
        BTN_f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_f4ActionPerformed(evt);
            }
        });

        BTN_f5.setBackground(new java.awt.Color(204, 204, 204));
        BTN_f5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_f5.setText("=");
        BTN_f5.setEnabled(false);
        BTN_f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_f5ActionPerformed(evt);
            }
        });

        Op1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo:", "Binário", "Decimal", "Hexadecimal" }));
        Op1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Op1ItemStateChanged(evt);
            }
        });
        Op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op1ActionPerformed(evt);
            }
        });

        Op2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo:", "Binário", "Decimal", "Hexadecimal" }));
        Op2.setEnabled(false);
        Op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op2ActionPerformed(evt);
            }
        });

        de.setText("De:");

        para.setText("Para:");

        jMenu3.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Calculadora Simples");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Calculadora de Desenvolvedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Ajuda");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem3.setText("Sobre");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_C, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(BTN_CE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Op1, 0, 113, Short.MAX_VALUE)
                                        .addGap(9, 9, 9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(de)))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(para)
                                    .addComponent(Op2, 0, 111, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BTN_0, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(BTN_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(72, 72, 72)
                                            .addComponent(BTN_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BTN_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_f2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_e, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_f, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_f1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_f3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_f5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_f4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BTN_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_b, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_c, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_d, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TXT_visor))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BTN_1, BTN_2, BTN_3, BTN_4, BTN_5, BTN_6, BTN_a, BTN_b, BTN_c, BTN_e, BTN_f, BTN_f1, BTN_f2, BTN_f3, BTN_f4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TXT_visor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(de)
                                .addComponent(para))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Op1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Op2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(BTN_C, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTN_CE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_b, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_c, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_d, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_e, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_f, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_f1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_f2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(BTN_f3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_f5)
                            .addComponent(BTN_f4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BTN_C, BTN_CE});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BTN_1, BTN_2, BTN_3, BTN_5, BTN_6, BTN_7, BTN_8, BTN_9, BTN_a, BTN_b, BTN_c, BTN_d, BTN_e, BTN_f, BTN_f1, BTN_f2, BTN_f3, BTN_f4});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BTN_0, BTN_f5});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void BTN_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_2ActionPerformed
        // Número 2:
        String valid; // Cria uma variável para pegar o valor do visor.
        valid = (TXT_visor.getText()); // Distribui o valor mostrado na tela para a variável
        if (valid.equals("0")) { // E verifica se ele é igual a '0' para limpar o visor quando for digitado
            TXT_visor.setText("2"); // Substitui o valor '0' para o botão pressionado
        } else if (verif == 1) {
            TXT_visor.setText("2");
            verif = 0;
        } else { // caso não seja igual a '0' apenas adiciona o valor na frente do que ja está sendo mostrado
            TXT_visor.setText(TXT_visor.getText() + "2");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_2ActionPerformed

    private void BTN_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_3ActionPerformed
        // Número 3:
        String valid; // Cria uma variável para pegar o valor do visor.
        valid = (TXT_visor.getText()); // Distribui o valor mostrado na tela para a variável
        if (valid.equals("0")) { // E verifica se ele é igual a '0' para limpar o visor quando for digitado
            TXT_visor.setText("3"); // Substitui o valor '0' para o botão pressionado
        } else if (verif == 1) {
            TXT_visor.setText("3");
            verif = 0;
        } else { // caso não seja igual a '0' apenas adiciona o valor na frente do que ja está sendo mostrado
            TXT_visor.setText(TXT_visor.getText() + "3");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_3ActionPerformed

    private void BTN_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_6ActionPerformed
        // Número 6:
        String valid; // Cria uma variável para pegar o valor do visor.
        valid = (TXT_visor.getText()); // Distribui o valor mostrado na tela para a variável
        if (valid.equals("0")) { // E verifica se ele é igual a '0' para limpar o visor quando for digitado
            TXT_visor.setText("6"); // Substitui o valor '0' para o botão pressionado
        } else if (verif == 1) {
            TXT_visor.setText("6");
            verif = 0;
        } else { // caso não seja igual a '0' apenas adiciona o valor na frente do que ja está sendo mostrado
            TXT_visor.setText(TXT_visor.getText() + "6");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_6ActionPerformed

    private void BTN_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_5ActionPerformed
        // Número 5:
        String valid; // Cria uma variável para pegar o valor do visor.
        valid = (TXT_visor.getText()); // Distribui o valor mostrado na tela para a variável
        if (valid.equals("0")) { // E verifica se ele é igual a '0' para limpar o visor quando for digitado
            TXT_visor.setText("5"); // Substitui o valor '0' para o botão pressionado
        } else if (verif == 1) {
            TXT_visor.setText("5");
            verif = 0;
        } else { // caso não seja igual a '0' apenas adiciona o valor na frente do que ja está sendo mostrado
            TXT_visor.setText(TXT_visor.getText() + "5");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_5ActionPerformed

    private void BTN_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_4ActionPerformed
        // Número 4:
        String valid; // Cria uma variável para pegar o valor do visor.
        valid = (TXT_visor.getText()); // Distribui o valor mostrado na tela para a variável
        if (valid.equals("0")) { // E verifica se ele é igual a '0' para limpar o visor quando for digitado
            TXT_visor.setText("4"); // Substitui o valor '0' para o botão pressionado
        } else if (verif == 1) {
            TXT_visor.setText("4");
            verif = 0;
        } else { // caso não seja igual a '0' apenas adiciona o valor na frente do que ja está sendo mostrado
            TXT_visor.setText(TXT_visor.getText() + "4");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_4ActionPerformed

    private void BTN_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_7ActionPerformed
        // Número 7:
        String valid; // Cria uma variável para pegar o valor do visor.
        valid = (TXT_visor.getText()); // Distribui o valor mostrado na tela para a variável
        if (valid.equals("0")) { // E verifica se ele é igual a '0' para limpar o visor quando for digitado
            TXT_visor.setText("7"); // Substitui o valor '0' para o botão pressionado
        } else if (verif == 1) {
            TXT_visor.setText("7");
            verif = 0;
        } else { // caso não seja igual a '0' apenas adiciona o valor na frente do que ja está sendo mostrado
            TXT_visor.setText(TXT_visor.getText() + "7");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_7ActionPerformed

    private void BTN_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_8ActionPerformed
        // Número 8:
        String valid; // Cria uma variável para pegar o valor do visor.
        valid = (TXT_visor.getText()); // Distribui o valor mostrado na tela para a variável
        if (valid.equals("0")) { // E verifica se ele é igual a '0' para limpar o visor quando for digitado
            TXT_visor.setText("8"); // Substitui o valor '0' para o botão pressionado
        } else if (verif == 1) { // verifica se o resultado na tela é da operação anterior
            TXT_visor.setText("8");
            verif = 0;
        } else { // caso não seja igual a '0' ou resultado de outra operação, apenas adiciona o valor na frente do que ja está sendo mostrado
            TXT_visor.setText(TXT_visor.getText() + "8");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_8ActionPerformed

    private void BTN_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_9ActionPerformed
        // Número 9:
        String valid; // Cria uma variável para pegar o valor do visor.
        valid = (TXT_visor.getText()); // Distribui o valor mostrado na tela para a variável
        if (valid.equals("0")) { // E verifica se ele é igual a '0' para limpar o visor quando for digitado
            TXT_visor.setText("9"); // Substitui o valor '0' para o botão pressionado
        } else if (verif == 1) { // verifica se o resultado na tela é da operação anterior
            TXT_visor.setText("9");
            verif = 0;
        } else { // caso não seja igual a '0' ou resultado de outra operação, apenas adiciona o valor na frente do que ja está sendo mostrado
            TXT_visor.setText(TXT_visor.getText() + "9");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_9ActionPerformed

    private void BTN_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_0ActionPerformed
        // Número 0:
        String valid; // Cria uma variável para pegar o valor do visor.
        valid = (TXT_visor.getText()); // Distribui o valor mostrado na tela para a variável
        if (valid.equals("0")) { // E verifica se ele é igual a '0' para limpar o visor quando for digitado
            TXT_visor.setText(""); // limpa o visor
            TXT_visor.setText(TXT_visor.getText() + "0"); // insere o valor
        } else if (verif == 1) {
            TXT_visor.setText("0"); // insere o valor
            verif = 0;
        } else {
            TXT_visor.setText(TXT_visor.getText() + "0"); // insere o valor
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_0ActionPerformed

    private void BTN_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CEActionPerformed
        // Botão Limpa tudo:
        /*  limpa o visor e habilita a segunda opção caso ela esteja desabilitada*/
        TXT_visor.setText("0");
        verif = 0;
        Op2.setEnabled(true);
        calculadora(op1);
    }//GEN-LAST:event_BTN_CEActionPerformed

    private void BTN_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CActionPerformed
        //  Botão Backspace:
        /*  pega a quantidade de carácteres da string e vai diminuindo -1 a cada
         clique no botão, quando chega no limite ele retorna o valor 0 para a
         tela e chama o métudo calculadora.
         retorna o valor de verificação para 0 e habilita a opção 2
         caso ela esteja desabilitada*/
        String back = TXT_visor.getText();
        int quantidade_c = back.length();
        if (quantidade_c > 1) {
            back = back.substring(0, quantidade_c - 1);
            TXT_visor.setText(back);
        } else if (quantidade_c == 1) {
            TXT_visor.setText("0");
            calculadora(op1);
        }
        verif = 0;
        verificacao(op1);
        Op2.setEnabled(true);
    }//GEN-LAST:event_BTN_CActionPerformed

    private void BTN_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_aActionPerformed
        // Botão A:
        /*  mostra o alfanumérico A no visor e chama o método para alterar o valor
         da variável */
        String valid;
        valid = (TXT_visor.getText());
        if (valid.equals("0")) {
            TXT_visor.setText("A");
        } else if (verif == 1) {
            TXT_visor.setText("A");
            verif = 0;
        } else {
            TXT_visor.setText(TXT_visor.getText() + "A");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_aActionPerformed

    private void BTN_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_bActionPerformed
        //  Botão B:
        /*  Mostra o alfanumérico B no visor e chama o método para alterar o valor
         da variável*/
        String valid;
        valid = (TXT_visor.getText());
        if (valid.equals("0")) {
            TXT_visor.setText("B");
        } else if (verif == 1) {
            TXT_visor.setText("B");
            verif = 0;
        } else {
            TXT_visor.setText(TXT_visor.getText() + "B");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_bActionPerformed

    private void BTN_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_cActionPerformed
        // Botão C:
        /*  mostra o alfanumerico C no visor e chama o método para alterar o valor
         da variável*/
        String valid;
        valid = (TXT_visor.getText());
        if (valid.equals("0")) {
            TXT_visor.setText("C");
        } else if (verif == 1) {
            TXT_visor.setText("C");
            verif = 0;
        } else {
            TXT_visor.setText(TXT_visor.getText() + "C");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_cActionPerformed

    private void BTN_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_dActionPerformed
        // Botão D:
        /*  mostra o alfanumério D no visor e chama o método para alterar o valor
         da variável*/
        String valid;
        valid = (TXT_visor.getText());
        if (valid.equals("0")) {
            TXT_visor.setText("D");
        } else if (verif == 1) {
            TXT_visor.setText("D");
            verif = 0;
        } else {
            TXT_visor.setText(TXT_visor.getText() + "D");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_dActionPerformed

    private void BTN_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_eActionPerformed
        // Botão E:
        /*  mostra o alfanumérico E no visor e chama o método para alterar o valor
         da variável*/
        String valid;
        valid = (TXT_visor.getText());
        if (valid.equals("0")) {
            TXT_visor.setText("E");
        } else if (verif == 1) {
            TXT_visor.setText("E");
            verif = 0;
        } else {
            TXT_visor.setText(TXT_visor.getText() + "E");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_eActionPerformed

    private void BTN_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_fActionPerformed
        // Botão F:
        /*  mostra o alfanumérico F no visor e chama o método para alterar o valor
         da variável*/
        String valid;
        valid = (TXT_visor.getText());
        if (valid.equals("0")) {
            TXT_visor.setText("F");
        } else if (verif == 1) {
            TXT_visor.setText("F");
            verif = 0;
        } else {
            TXT_visor.setText(TXT_visor.getText() + "F");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_fActionPerformed

    private void BTN_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_1ActionPerformed
        // Número 1:
        String valid; // Cria uma variável para pegar o valor do visor.
        valid = (TXT_visor.getText()); // Distribui o valor mostrado na tela para a variável
        if (valid.equals("0")) { // E verifica se ele é igual a '0' para limpar o visor quando for digitado
            TXT_visor.setText("1"); // Substitui o valor '0' para o botão pressionado
        } else if (verif == 1) {
            TXT_visor.setText("1");
            verif = 0;
        } else { // caso não seja igual a '0' apenas adiciona o valor na frente do que ja está sendo mostrado
            TXT_visor.setText(TXT_visor.getText() + "1");
        }
        verificacao(op1);
    }//GEN-LAST:event_BTN_1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Simples:
        dispose();
        new Interface_Simples().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Desenvolvedor:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void TXT_visorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_visorActionPerformed
        // Visor:
        TXT_visor.setText("0");

    }//GEN-LAST:event_TXT_visorActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // About:
        new About().setVisible(true); // abre o formulário que fala sobre o programa;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void BTN_f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_f3ActionPerformed
        //  Sinal de divisão:
        /*  desativa a opção 2 para que não possa ocorrer erros durante a operação
         atribui o valor da operação na variável armazena o texto na variável
         temporária e retorna o valor 0 */
        Op2.setEnabled(false);
        op3 = 3;
        temp[9] = TXT_visor.getText();
        TXT_visor.setText("0");
    }//GEN-LAST:event_BTN_f3ActionPerformed

    private void BTN_f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_f1ActionPerformed
        // Sinal de soma:
        /*  desativa a opção 2 para que não possa ocorrer erros durante a operação
         atribui o valor da operação na variável armazena o texto na variável
         temporária e retorna o valor 0 */
        temp[9] = TXT_visor.getText();
        Op2.setEnabled(false);
        op3 = 1;
        TXT_visor.setText("0");
    }//GEN-LAST:event_BTN_f1ActionPerformed

    private void BTN_f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_f4ActionPerformed
        // Sinal de multiplicação:
        /*  desativa a opção 2 para que não possa ocorrer erros durante a operação
         atribui o valor da operação na variável armazena o texto na variável
         temporária e retorna o valor 0 */
        Op2.setEnabled(false);
        op3 = 4;
        temp[9] = TXT_visor.getText();
        TXT_visor.setText("0");
    }//GEN-LAST:event_BTN_f4ActionPerformed

    private void BTN_f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_f2ActionPerformed
        // Sinal de subtração:
        /*  desativa a opção 2 para que não possa ocorrer erros durante a operação
         atribui o valor da operação na variável armazena o texto na variável
         temporária e retorna o valor 0 */
        Op2.setEnabled(false);
        op3 = 2;
        temp[9] = TXT_visor.getText();
        temp[9] = TXT_visor.getText();
        TXT_visor.setText("0");
    }//GEN-LAST:event_BTN_f2ActionPerformed

    private void BTN_f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_f5ActionPerformed
        // Igual:
        /*  ativa a caixa de opções 2 e faz a operação de acordo com a opção
         chama o método de saída de informações */
        Op2.setEnabled(true);
        calculo(op1);
        switch (op3) {
            case 1:
                result = n1[0] + n2;
                exibe_resultado(op1);

                break;
            case 2:
                result = n1[0] - n2;
                exibe_resultado(op1);
                break;
            case 3:
                result = n1[0] / n2;
                exibe_resultado(op1);
                break;
            case 4:
                result = n1[0] * n2;
                exibe_resultado(op1);
                break;
        }
        verif = 1;
    }//GEN-LAST:event_BTN_f5ActionPerformed

    private void Op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op1ActionPerformed
        // caixa de opções 1:
        /*  Habilita a caida de opções 2 e chama o método para ativar os botões
         de acordo com o tipo */
        Op2.setEnabled(true);
        op1 = Op1.getSelectedIndex();
        TXT_visor.setText("0");
        if (op1 == 0) {
            calculadora(op1);
            Op2.setEnabled(false);
        } else if (op1 == 1) {
            calculadora(op1);
        } else if (op1 == 2) {
            calculadora(op1);
        } else if (op1 == 3) {
            calculadora(op1);
        }
    }//GEN-LAST:event_Op1ActionPerformed

    private void Op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op2ActionPerformed
        // caixa de opções 2:
        /*  chama o método para converter os números */
        op2 = Op2.getSelectedIndex();
        if (op2 == 0) {
        } else if (op2 == 1) {
            operacao(op2);
        } else if (op2 == 2) {
            operacao(op2);
        } else if (op2 == 3) {
            operacao(op2);
        }

    }//GEN-LAST:event_Op2ActionPerformed

    private void Op1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Op1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Op1ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Desenvolvedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_0;
    private javax.swing.JButton BTN_1;
    private javax.swing.JButton BTN_2;
    private javax.swing.JButton BTN_3;
    private javax.swing.JButton BTN_4;
    private javax.swing.JButton BTN_5;
    private javax.swing.JButton BTN_6;
    private javax.swing.JButton BTN_7;
    private javax.swing.JButton BTN_8;
    private javax.swing.JButton BTN_9;
    private javax.swing.JButton BTN_C;
    private javax.swing.JButton BTN_CE;
    private javax.swing.JButton BTN_a;
    private javax.swing.JButton BTN_b;
    private javax.swing.JButton BTN_c;
    private javax.swing.JButton BTN_d;
    private javax.swing.JButton BTN_e;
    private javax.swing.JButton BTN_f;
    private javax.swing.JButton BTN_f1;
    private javax.swing.JButton BTN_f2;
    private javax.swing.JButton BTN_f3;
    private javax.swing.JButton BTN_f4;
    private javax.swing.JButton BTN_f5;
    private javax.swing.JComboBox Op1;
    private javax.swing.JComboBox Op2;
    private javax.swing.JTextField TXT_visor;
    private javax.swing.JLabel de;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel para;
    // End of variables declaration//GEN-END:variables

}
