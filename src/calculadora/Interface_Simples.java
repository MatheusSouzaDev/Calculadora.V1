package calculadora;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*  @author Matheus Souza */
public class Interface_Simples extends javax.swing.JFrame {
    
    public static double n1; // cria uma variável para armazenar o primeiro número
    public static double n2; // cria a variável para armazenar o segundo número
    public static double r; // cria uma variável para armazenar o resultado
    public static int op; // variável para a operação
    public static int verif; // verificação se o valor apresentado no visor não pe resultado de outra operação

    public void exibe_texto2x(double temp) { // retornar informação com operações de 2 números
        if (temp % 1 == 0) { //verifica se o número dividido por um se o resto seria igual a '0' sem vírgulas
            DecimalFormat formatacao = new DecimalFormat("#"); // importa a função para formatação dos números decimais
            TXT_Visor1.setText(formatacao.format(temp)); // retorna para a tela a conversão do resultado em string com a formatação            
        } else { // caso o resto não de '0' as variáveis serão do tipo double retornando a vírgula
            TXT_Visor1.setText(Double.toString(temp));
        }
    }

    public void exibe_texto(double temp) { // retornar informações de operações de 1 número
        if (temp % 1 == 0) { //verifica se o número dividido por um se o resto seria igual a '0' sem vírgulas
            DecimalFormat formatacao = new DecimalFormat("#"); // importa a função para formatação dos números decimais
            TXT_Visor.setText(formatacao.format(temp)); // retorna para a tela a conversão do resultado em string com a formatação            
        } else { // caso o resto não de '0' as variáveis serão do tipo double retornando a vírgula
            TXT_Visor.setText(Double.toString(temp));
        }
        TXT_Visor1.setText("");
    }

    public Interface_Simples() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXT_Visor1 = new javax.swing.JTextField();
        TXT_Visor = new javax.swing.JTextField();
        BTN_Soma = new javax.swing.JButton();
        BTN_Sub = new javax.swing.JButton();
        BTN_Mult = new javax.swing.JButton();
        BTN_Div = new javax.swing.JButton();
        BTN_X2 = new javax.swing.JButton();
        BTN_Fat = new javax.swing.JButton();
        BTN_Sinais = new javax.swing.JButton();
        BTN_Raiz = new javax.swing.JButton();
        BTN_XY = new javax.swing.JButton();
        BTN_CE = new javax.swing.JButton();
        BTN_C = new javax.swing.JButton();
        BTN_1 = new javax.swing.JButton();
        BTN_2 = new javax.swing.JButton();
        BTN_3 = new javax.swing.JButton();
        BTN_4 = new javax.swing.JButton();
        BTN_5 = new javax.swing.JButton();
        BTN_6 = new javax.swing.JButton();
        BTN_7 = new javax.swing.JButton();
        BTN_8 = new javax.swing.JButton();
        BTN_9 = new javax.swing.JButton();
        BTN_0 = new javax.swing.JButton();
        BTN_1DivX = new javax.swing.JButton();
        BTN_Igual = new javax.swing.JButton();
        BTN_Virgula = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Java - Simples");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(345, 424));
        setResizable(false);

        TXT_Visor1.setEditable(false);
        TXT_Visor1.setBackground(new java.awt.Color(255, 255, 255));
        TXT_Visor1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TXT_Visor1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_Visor1.setToolTipText("");
        TXT_Visor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TXT_Visor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_Visor1ActionPerformed(evt);
            }
        });

        TXT_Visor.setEditable(false);
        TXT_Visor.setBackground(new java.awt.Color(255, 255, 255));
        TXT_Visor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TXT_Visor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXT_Visor.setText("0");
        TXT_Visor.setToolTipText("");
        TXT_Visor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TXT_Visor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_VisorActionPerformed(evt);
            }
        });

        BTN_Soma.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Soma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_Soma.setText("+");
        BTN_Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SomaActionPerformed(evt);
            }
        });

        BTN_Sub.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Sub.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_Sub.setText("-");
        BTN_Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SubActionPerformed(evt);
            }
        });

        BTN_Mult.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Mult.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_Mult.setText("*");
        BTN_Mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MultActionPerformed(evt);
            }
        });

        BTN_Div.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Div.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_Div.setText("÷");
        BTN_Div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DivActionPerformed(evt);
            }
        });

        BTN_X2.setBackground(new java.awt.Color(204, 204, 204));
        BTN_X2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_X2.setText("x²");
        BTN_X2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_X2ActionPerformed(evt);
            }
        });

        BTN_Fat.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Fat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_Fat.setText("FAT");
        BTN_Fat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_FatActionPerformed(evt);
            }
        });

        BTN_Sinais.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Sinais.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_Sinais.setText("±");
        BTN_Sinais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SinaisActionPerformed(evt);
            }
        });

        BTN_Raiz.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Raiz.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_Raiz.setText("√");
        BTN_Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RaizActionPerformed(evt);
            }
        });

        BTN_XY.setBackground(new java.awt.Color(204, 204, 204));
        BTN_XY.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_XY.setText("xʸ");
        BTN_XY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_XYActionPerformed(evt);
            }
        });

        BTN_CE.setBackground(new java.awt.Color(204, 204, 204));
        BTN_CE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_CE.setText("CE");
        BTN_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CEActionPerformed(evt);
            }
        });

        BTN_C.setBackground(new java.awt.Color(204, 204, 204));
        BTN_C.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_C.setText("C");
        BTN_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CActionPerformed(evt);
            }
        });

        BTN_1.setBackground(new java.awt.Color(204, 204, 204));
        BTN_1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_1.setText("1");
        BTN_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_1ActionPerformed(evt);
            }
        });

        BTN_2.setBackground(new java.awt.Color(204, 204, 204));
        BTN_2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_2.setText("2");
        BTN_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_2ActionPerformed(evt);
            }
        });

        BTN_3.setBackground(new java.awt.Color(204, 204, 204));
        BTN_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_3.setText("3");
        BTN_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_3ActionPerformed(evt);
            }
        });

        BTN_4.setBackground(new java.awt.Color(204, 204, 204));
        BTN_4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_4.setText("4");
        BTN_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_4ActionPerformed(evt);
            }
        });

        BTN_5.setBackground(new java.awt.Color(204, 204, 204));
        BTN_5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_5.setText("5");
        BTN_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_5ActionPerformed(evt);
            }
        });

        BTN_6.setBackground(new java.awt.Color(204, 204, 204));
        BTN_6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_6.setText("6");
        BTN_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_6ActionPerformed(evt);
            }
        });

        BTN_7.setBackground(new java.awt.Color(204, 204, 204));
        BTN_7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_7.setText("7");
        BTN_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_7ActionPerformed(evt);
            }
        });

        BTN_8.setBackground(new java.awt.Color(204, 204, 204));
        BTN_8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_8.setText("8");
        BTN_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_8ActionPerformed(evt);
            }
        });

        BTN_9.setBackground(new java.awt.Color(204, 204, 204));
        BTN_9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_9.setText("9");
        BTN_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_9ActionPerformed(evt);
            }
        });

        BTN_0.setBackground(new java.awt.Color(204, 204, 204));
        BTN_0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_0.setText("0");
        BTN_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_0ActionPerformed(evt);
            }
        });

        BTN_1DivX.setBackground(new java.awt.Color(204, 204, 204));
        BTN_1DivX.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTN_1DivX.setText("1/x");
        BTN_1DivX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_1DivXActionPerformed(evt);
            }
        });

        BTN_Igual.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Igual.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_Igual.setText("=");
        BTN_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_IgualActionPerformed(evt);
            }
        });

        BTN_Virgula.setBackground(new java.awt.Color(204, 204, 204));
        BTN_Virgula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTN_Virgula.setText(",");
        BTN_Virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VirgulaActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Calculadora Simples");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Calculadora de Desenvolvedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTN_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTN_Soma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN_Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN_Mult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_0, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Div, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_Sinais, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_Fat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_1DivX, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_Igual)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_X2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_XY, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_C, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TXT_Visor1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_Visor, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BTN_1, BTN_1DivX, BTN_2, BTN_3, BTN_4, BTN_5, BTN_6, BTN_7, BTN_8, BTN_9, BTN_C, BTN_CE, BTN_Div, BTN_Fat, BTN_Igual, BTN_Mult, BTN_Raiz, BTN_Sinais, BTN_Soma, BTN_Sub, BTN_Virgula, BTN_X2, BTN_XY});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TXT_Visor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(TXT_Visor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_X2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_XY, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_C, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Soma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Fat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Sinais, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Mult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_1DivX, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Div, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BTN_0, BTN_1, BTN_1DivX, BTN_2, BTN_3, BTN_4, BTN_5, BTN_6, BTN_7, BTN_8, BTN_9, BTN_C, BTN_CE, BTN_Div, BTN_Fat, BTN_Igual, BTN_Mult, BTN_Raiz, BTN_Sinais, BTN_Soma, BTN_Sub, BTN_Virgula, BTN_X2, BTN_XY});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_Visor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_Visor1ActionPerformed
        // Visor limpo:
        TXT_Visor1.setText("");
    }//GEN-LAST:event_TXT_Visor1ActionPerformed

    private void BTN_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CEActionPerformed
        // Botão Backspace:
        String back = TXT_Visor.getText(); // insere o valor do visor na variável
        int quantidade_c = back.length(); // cria uma variável para armazenar a quantidade de caracteres que existem na string
        if (quantidade_c > 1) { // se a quantidade de carácteres da string for maior que 1 
            back = back.substring(0, quantidade_c - 1); // ele pega o texto inteiro e retorna o texto com 1 carácter a menos
            TXT_Visor.setText(back); // exibe no visor a string alterada
        } else if (quantidade_c == 1) { // e se a quantidade de carácteres for igual a 1
            TXT_Visor.setText("0"); //ele retorna 0 para o visor
        }
    }//GEN-LAST:event_BTN_CEActionPerformed

    private void BTN_XYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_XYActionPerformed
        //  Potenciação de 2 números:
        /*  Atribui a variável o número da operação, cria uma variável temporária,
            se o visor secundario estiver limpo ele pega o valor do primeiro visor 
            e retorna esse valor dentro do secundario.
            Se o primeiro visor for igual a 0, pega o valor do texto do visor 2 e 
            retorna o mesmo valor para não perder o valor.
            Caso ele queira fazer a operação com o valor armazenado, a variável 
            temporária recebe o valor armazenado no visor 2,
            n2 recebe o valor que ele deseja elevar e chama o exibidor do resultado
            de 2 números.
            Ao clicar no botão, n1 recebe o valor do visor 2, retorna o visor principal
            para 0 e atribui o valor 1 para verificação de resultados.*/
        op = 5; 
        double temp; 
        if (TXT_Visor1.getText().equals("")) { 
            TXT_Visor1.setText(TXT_Visor.getText()); 
        } else if (TXT_Visor.getText().equals("0")) {
            TXT_Visor1.setText(TXT_Visor1.getText());
        } else { 
            temp = Double.parseDouble(TXT_Visor1.getText()); 
            n2 = Double.parseDouble(TXT_Visor.getText()); 
            temp = Math.pow(temp, n2); 
            exibe_texto2x(temp); 
        }
        n1 = Double.parseDouble(TXT_Visor1.getText()); 
        TXT_Visor.setText("0"); 
        verif = 1; 
    }//GEN-LAST:event_BTN_XYActionPerformed

    private void BTN_IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_IgualActionPerformed
        // Igualdade:
        n2 = Double.parseDouble(TXT_Visor.getText()); // n2 recebe o valor do visor principalpara o cálculo
        switch (op) { // abre uma lista de condições para seguintes operações
            case 1: // caso 1 foi clicado o botão de +
                r = n1 + n2;
                exibe_texto(r);
                break;
            case 2: // caso 2 foi clilcado o botão de -
                r = n1 - n2;
                exibe_texto(r);
                break;
            case 3: // caso 3 foi clilcado o botão de *
                r = n1 * n2;
                exibe_texto(r);
                break;
            case 4:  // caso 4 foi clilcado o botão de ÷
                if (n2 == 0) {
                    JOptionPane.showMessageDialog(this, "Não existe divisão com divisor 0!");
                } else {
                    r = n1 / n2;
                    exibe_texto(r);
                }
                break;
            case 5: // caso 5 foi clulcado o botão de potência
                r = Math.pow(n1, n2);
                exibe_texto(r);
                break;
        }
        verif = 1; // retorna a verificação
        TXT_Visor1.setText(""); // limpa o visor secundario
    }//GEN-LAST:event_BTN_IgualActionPerformed

    private void BTN_DivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DivActionPerformed
        // Divisão:
        /*  Atribui a variável o número da operação, cria uma variável temporária,
            se o visor secundario estiver limpo ele pega o valor do primeiro visor 
            e retorna esse valor dentro do secundario.
            Se o primeiro visor for igual a 0, pega o valor do texto do visor 2 e 
            retorna o mesmo valor para não perder o valor.
            Caso ele queira fazer a operação com o valor armazenado, a variável 
            temporária recebe o valor armazenado no visor 2,
            n2 recebe o valor que ele deseja fazer a operação,
            faz a operação e chama o exibidor do resultado de 2 números.
            Ao clicar no botão, n1 recebe o valor do visor 2, retorna o visor principal
            para 0 e atribui o valor 1 para verificação de resultados.
            PS.: Nesse modo não é possível fazer divisão com 0 no divisor por 
            verificar se o valor é '0' sempre.*/
        op = 4;
        double temp;
        if (TXT_Visor1.getText().equals("")) {
            TXT_Visor1.setText(TXT_Visor.getText());
        } else if (TXT_Visor.getText().equals("0")) {
            TXT_Visor1.setText(TXT_Visor1.getText());
        } else {
            temp = Double.parseDouble(TXT_Visor1.getText());
            n2 = Double.parseDouble(TXT_Visor.getText());
            temp = temp / n2;
            exibe_texto2x(temp);
        }
        n1 = Double.parseDouble(TXT_Visor1.getText());
        TXT_Visor.setText("0");
    }//GEN-LAST:event_BTN_DivActionPerformed

    private void BTN_MultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MultActionPerformed
        // Multiplicação:
        /*  Atribui a variável o número da operação, cria uma variável temporária,
            se o visor secundario estiver limpo ele pega o valor do primeiro visor 
            e retorna esse valor dentro do secundario.
            Se o primeiro visor for igual a 0, pega o valor do texto do visor 2 e 
            retorna o mesmo valor para não perder o valor.
            Caso ele queira fazer a operação com o valor armazenado, a variável 
            temporária recebe o valor armazenado no visor 2,
            n2 recebe o valor que ele deseja fazer a operação,
            faz a operação e chama o exibidor do resultado de 2 números.
            Ao clicar no botão, n1 recebe o valor do visor 2, retorna o visor principal
            para 0 e atribui o valor 1 para verificação de resultados.*/
        op = 3;
        double temp;
        if (TXT_Visor1.getText().equals("")) {
            TXT_Visor1.setText(TXT_Visor.getText());
        } else if (TXT_Visor.getText().equals("0")) {
            TXT_Visor1.setText(TXT_Visor1.getText());
        } else {
            temp = Double.parseDouble(TXT_Visor1.getText());
            n2 = Double.parseDouble(TXT_Visor.getText());
            temp = temp * n2;
            exibe_texto2x(temp);
        }
        n1 = Double.parseDouble(TXT_Visor1.getText());
        TXT_Visor.setText("0");
    }//GEN-LAST:event_BTN_MultActionPerformed

    private void BTN_SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SubActionPerformed
        // subtração:
        /*  Atribui a variável o número da operação, cria uma variável temporária,
            se o visor secundario estiver limpo ele pega o valor do primeiro visor 
            e retorna esse valor dentro do secundario.
            Se o primeiro visor for igual a 0, pega o valor do texto do visor 2 e 
            retorna o mesmo valor para não perder o valor.
            Caso ele queira fazer a operação com o valor armazenado, a variável 
            temporária recebe o valor armazenado no visor 2,
            n2 recebe o valor que ele deseja fazer a operação,
            faz a operação e chama o exibidor do resultado de 2 números.
            Ao clicar no botão, n1 recebe o valor do visor 2, retorna o visor principal
            para 0 e atribui o valor 1 para verificação de resultados.*/
        op = 2;
        double temp;
        if (TXT_Visor1.getText().equals("")) {
            TXT_Visor1.setText(TXT_Visor.getText());
        } else if (TXT_Visor.getText().equals("0")) {
            TXT_Visor1.setText(TXT_Visor1.getText());
        } else {
            temp = Double.parseDouble(TXT_Visor1.getText());
            n2 = Double.parseDouble(TXT_Visor.getText());
            temp = temp - n2;
            exibe_texto2x(temp);
        }
        n1 = Double.parseDouble(TXT_Visor1.getText());
        TXT_Visor.setText("0");
    }//GEN-LAST:event_BTN_SubActionPerformed

    private void BTN_SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SomaActionPerformed
        // Sinal de soma:
        /*  Atribui a variável o número da operação, cria uma variável temporária,
            se o visor secundario estiver limpo ele pega o valor do primeiro visor 
            e retorna esse valor dentro do secundario.
            Se o primeiro visor for igual a 0, pega o valor do texto do visor 2 e 
            retorna o mesmo valor para não perder o valor.
            Caso ele queira fazer a operação com o valor armazenado, a variável 
            temporária recebe o valor armazenado no visor 2,
            n2 recebe o valor que ele deseja fazer a operação,
            faz a operação e chama o exibidor do resultado de 2 números.
            Ao clicar no botão, n1 recebe o valor do visor 2, retorna o visor principal
            para 0 e atribui o valor 1 para verificação de resultados.*/
        double temp;
        if (TXT_Visor1.getText().equals("")) {
            TXT_Visor1.setText(TXT_Visor.getText());
        } else if (TXT_Visor.getText().equals("0")) {
            TXT_Visor1.setText(TXT_Visor1.getText());
        } else if (!"0".equals(TXT_Visor.getText())) {
            temp = Double.parseDouble(TXT_Visor1.getText());
            n2 = Double.parseDouble(TXT_Visor.getText());
            temp = temp + n2;
            exibe_texto2x(temp);
        }
        n1 = Double.parseDouble(TXT_Visor1.getText());
        op = 1;
        TXT_Visor.setText("0");
    }//GEN-LAST:event_BTN_SomaActionPerformed

    private void BTN_FatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_FatActionPerformed
        // Fatorial:
        /*  Cria 2 variáveis: no começo as duas recebem o mesmo valor digitado no
            visor, no processamento ele pega esse valor e multiplica o valor digitado
            vezes o valor -1,e depois subtrai -1 da variável.
            Para exibir o resultado sem dar erro transformo o resultado em string,
            atribui o número de caracteres em uma variável tipo int.
            Caso seja menor que 19 caracteres ele chama o método exibe_texto.
            Se não ele exibe apenas a parte do valor em que a String é capaz de 
            apresentar.*/
        TXT_Visor1.setText("");
        double fat, x;
        x = Double.parseDouble(TXT_Visor.getText());
        fat = x;
        do {
            fat = fat * (x - 1);
            x--;
        } while (x > 1);
        String tamanho_c = Double.toString(fat);
        int tam = tamanho_c.length();
        if (tam < 19) {
            verif = 1;
            exibe_texto(fat);
        } else {
            String part = tamanho_c.substring(0, tam);
            TXT_Visor.setText(part);
            verif = 1;
        }
    }//GEN-LAST:event_BTN_FatActionPerformed

    private void BTN_SinaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SinaisActionPerformed
        // Troca de Sinais:
        /* Pega o valor do visor e compara se é igual a '0', caso seja verdadeira
           ele pega o valor e retorna o mesmo valor, pois não há negativo de '0'. 
           Se não, ele converte para double e multiplica o valor por (-1), e chama
           o método de exibe_texto*/
        if (TXT_Visor.getText().equals("0")) {
            TXT_Visor.setText(TXT_Visor.getText());
        } else {
            double sinal = Double.parseDouble(TXT_Visor.getText());
            sinal = sinal * (-1);
            exibe_texto(sinal);
        }
    }//GEN-LAST:event_BTN_SinaisActionPerformed

    private void BTN_RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RaizActionPerformed
        // Raiz Quadrada de um número:
        /*  cria uma variável para receber o valor do visor e converte para
            double. Verifica se a variável é menor que '0' para apresentar
            mensagem de erro, pois não existe raiz de números negativos.
            Caso não seja menor ele pega o valor da variável e faz a operação.
            Para exibir o resultado ele chama o método exibe_texto.*/
        double raiz; 
        raiz = Double.parseDouble(TXT_Visor.getText()); 
        if (raiz < 0) {
            TXT_Visor.setText("0");
            TXT_Visor1.setText("");
            JOptionPane.showMessageDialog(this, "Não existe raiz de números negativos!");
            verif = 1;
        } else {
            raiz = Math.sqrt(raiz); 
            exibe_texto(raiz);
        }
        verif = 1;
    }//GEN-LAST:event_BTN_RaizActionPerformed

    private void BTN_1DivXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_1DivXActionPerformed
        // Função Inverso:
        /* Cria uma variável que receberá o visor principal em double, verifica 
           se ele é igual a '0' para exibir a janela de erro, se não for ele faz 
           a operação e chama o método exibe_texto para retornar o valor*/
        double inverso = Double.parseDouble(TXT_Visor.getText());
        if (TXT_Visor.getText().equals("0")) {
            TXT_Visor.setText("0");
            JOptionPane.showMessageDialog(this, "Não existe inverso de 0!");
        } else {
            inverso = 1 / inverso;
            exibe_texto(inverso);
        }
        verif = 1;
    }//GEN-LAST:event_BTN_1DivXActionPerformed

    private void BTN_X2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_X2ActionPerformed
        // Número elevado a 2:
        double potencia;
        /*  Cria variável para receber o número do texto,
         Faz a operação do número elevado e limpa o visor secundario
         e chama a função de exibir texto.
         */
        potencia = Double.parseDouble(TXT_Visor.getText());
        potencia = Math.pow(potencia, 2);
        exibe_texto(potencia);
        verif = 1;
        TXT_Visor1.setText("");
    }//GEN-LAST:event_BTN_X2ActionPerformed

    private void BTN_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CActionPerformed
        // Botão C ou Cleaner ou Limpar Tudo:
        TXT_Visor.setText("0");
        TXT_Visor1.setText("");
    }//GEN-LAST:event_BTN_CActionPerformed

    private void BTN_VirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VirgulaActionPerformed
        // Sinal de vírgula:
        /* Faz a verificação se o visor é resultado de uma operação e retorna
         para o visor o valor '0'. Após isto ele cria uma variável para pegar
         o valor do visor e a converte em numeros e concatena á virgula.
         Caso não seja resultado de outra operação ele pega o valor em
         números e concatena a vírgula.*/
        if (verif == 1) {
            TXT_Visor.setText("0");
            double valid;
            valid = Double.parseDouble(TXT_Visor.getText());
            DecimalFormat formatacao = new DecimalFormat("#");
            TXT_Visor.setText(formatacao.format(valid) + '.');
            verif = 0;
        } else {
            double valid;
            valid = Double.parseDouble(TXT_Visor.getText());
            DecimalFormat formatacao = new DecimalFormat("#");
            TXT_Visor.setText(formatacao.format(valid) + '.');
            verif = 0;
        }
    }//GEN-LAST:event_BTN_VirgulaActionPerformed

    private void BTN_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_9ActionPerformed
        // Número 9:
        /*  Nesse botão ao ser clicado irá criara uma variável
         para pegar o valor do visor e distribuir em uma variável.
         Após isso vai verificar se o visor é igual a '0'
         para que não o concatane. Depois verificará se o valor
         armazenado não é resultado de uma operação, e retorna o valor
         do botão retornando a variável de verificação a 0 para não 
         ser apagado. Caso não entre em nenhumas das condições ele
         apenas concatena o valor cliclado ao já existente.*/
        String valid;
        valid = (TXT_Visor.getText());
        if (valid.equals("0")) {
            TXT_Visor.setText("9");
        } else if (verif == 1) {
            TXT_Visor.setText("9");
            verif = 0;
        } else {
            TXT_Visor.setText(TXT_Visor.getText() + "9");
        }
    }//GEN-LAST:event_BTN_9ActionPerformed

    private void BTN_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_8ActionPerformed
        // Número 8:
        /*  Nesse botão ao ser clicado irá criara uma variável
         para pegar o valor do visor e distribuir em uma variável.
         Após isso vai verificar se o visor é igual a '0'
         para que não o concatane. Depois verificará se o valor
         armazenado não é resultado de uma operação, e retorna o valor
         do botão retornando a variável de verificação a 0 para não 
         ser apagado. Caso não entre em nenhumas das condições ele
         apenas concatena o valor cliclado ao já existente.*/
        String valid;
        valid = (TXT_Visor.getText());
        if (valid.equals("0")) {
            TXT_Visor.setText("8");
        } else if (verif == 1) {
            TXT_Visor.setText("8");
            verif = 0;
        } else {
            TXT_Visor.setText(TXT_Visor.getText() + "8");
        }
    }//GEN-LAST:event_BTN_8ActionPerformed

    private void BTN_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_7ActionPerformed
        // Número 7:
        /*  Nesse botão ao ser clicado irá criara uma variável
         para pegar o valor do visor e distribuir em uma variável.
         Após isso vai verificar se o visor é igual a '0'
         para que não o concatane. Depois verificará se o valor
         armazenado não é resultado de uma operação, e retorna o valor
         do botão retornando a variável de verificação a 0 para não 
         ser apagado. Caso não entre em nenhumas das condições ele
         apenas concatena o valor cliclado ao já existente.*/
        String valid;
        valid = (TXT_Visor.getText());
        if (valid.equals("0")) {
            TXT_Visor.setText("7");
        } else if (verif == 1) {
            TXT_Visor.setText("7");
            verif = 0;
        } else {
            TXT_Visor.setText(TXT_Visor.getText() + "7");
        }
    }//GEN-LAST:event_BTN_7ActionPerformed

    private void BTN_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_6ActionPerformed
        // Número 6:
        /*  Nesse botão ao ser clicado irá criara uma variável
         para pegar o valor do visor e distribuir em uma variável.
         Após isso vai verificar se o visor é igual a '0'
         para que não o concatane. Depois verificará se o valor
         armazenado não é resultado de uma operação, e retorna o valor
         do botão retornando a variável de verificação a 0 para não 
         ser apagado. Caso não entre em nenhumas das condições ele
         apenas concatena o valor cliclado ao já existente.*/
        String valid;
        valid = (TXT_Visor.getText());
        if (valid.equals("0")) {
            TXT_Visor.setText("6");
        } else if (verif == 1) {
            TXT_Visor.setText("6");
            verif = 0;
        } else {
            TXT_Visor.setText(TXT_Visor.getText() + "6");
        }
    }//GEN-LAST:event_BTN_6ActionPerformed

    private void BTN_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_5ActionPerformed
        // Número 5:
        /*  Nesse botão ao ser clicado irá criara uma variável
         para pegar o valor do visor e distribuir em uma variável.
         Após isso vai verificar se o visor é igual a '0'
         para que não o concatane. Depois verificará se o valor
         armazenado não é resultado de uma operação, e retorna o valor
         do botão retornando a variável de verificação a 0 para não 
         ser apagado. Caso não entre em nenhumas das condições ele
         apenas concatena o valor cliclado ao já existente.*/
        String valid;
        valid = (TXT_Visor.getText());
        if (valid.equals("0")) {
            TXT_Visor.setText("5");
        } else if (verif == 1) {
            TXT_Visor.setText("5");
            verif = 0;
        } else {
            TXT_Visor.setText(TXT_Visor.getText() + "5");
        }
    }//GEN-LAST:event_BTN_5ActionPerformed

    private void BTN_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_4ActionPerformed
        // Número 4:
        /*  Nesse botão ao ser clicado irá criara uma variável
         para pegar o valor do visor e distribuir em uma variável.
         Após isso vai verificar se o visor é igual a '0'
         para que não o concatane. Depois verificará se o valor
         armazenado não é resultado de uma operação, e retorna o valor
         do botão retornando a variável de verificação a 0 para não 
         ser apagado. Caso não entre em nenhumas das condições ele
         apenas concatena o valor cliclado ao já existente.*/
        String valid;
        valid = (TXT_Visor.getText());
        if (valid.equals("0")) {
            TXT_Visor.setText("4");
        } else if (verif == 1) {
            TXT_Visor.setText("4");
            verif = 0;
        } else {
            TXT_Visor.setText(TXT_Visor.getText() + "4");
        }
    }//GEN-LAST:event_BTN_4ActionPerformed

    private void BTN_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_3ActionPerformed
        // Número 3:
        /*  Nesse botão ao ser clicado irá criara uma variável
         para pegar o valor do visor e distribuir em uma variável.
         Após isso vai verificar se o visor é igual a '0'
         para que não o concatane. Depois verificará se o valor
         armazenado não é resultado de uma operação, e retorna o valor
         do botão retornando a variável de verificação a 0 para não 
         ser apagado. Caso não entre em nenhumas das condições ele
         apenas concatena o valor cliclado ao já existente.*/
        String valid;
        valid = (TXT_Visor.getText());
        if (valid.equals("0")) {
            TXT_Visor.setText("3");
        } else if (verif == 1) {
            TXT_Visor.setText("3");
            verif = 0;
        } else {
            TXT_Visor.setText(TXT_Visor.getText() + "3");
        }
    }//GEN-LAST:event_BTN_3ActionPerformed

    private void BTN_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_2ActionPerformed
        // Número 2:
        /*  Nesse botão ao ser clicado irá criara uma variável
         para pegar o valor do visor e distribuir em uma variável.
         Após isso vai verificar se o visor é igual a '0'
         para que não o concatane. Depois verificará se o valor
         armazenado não é resultado de uma operação, e retorna o valor
         do botão retornando a variável de verificação a 0 para não 
         ser apagado. Caso não entre em nenhumas das condições ele
         apenas concatena o valor cliclado ao já existente.*/
        String valid;
        valid = (TXT_Visor.getText());
        if (valid.equals("0")) {
            TXT_Visor.setText("2");
        } else if (verif == 1) {
            TXT_Visor.setText("2");
            verif = 0;
        } else {
            TXT_Visor.setText(TXT_Visor.getText() + "2");
        }
    }//GEN-LAST:event_BTN_2ActionPerformed

    private void BTN_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_1ActionPerformed
        // Núemro 1:
        /*  Nesse botão ao ser clicado irá criara uma variável
         para pegar o valor do visor e distribuir em uma variável.
         Após isso vai verificar se o visor é igual a '0'
         para que não o concatane. Depois verificará se o valor
         armazenado não é resultado de uma operação, e retorna o valor
         do botão retornando a variável de verificação a 0 para não 
         ser apagado. Caso não entre em nenhumas das condições ele
         apenas concatena o valor cliclado ao já existente.*/
        String valid;
        valid = (TXT_Visor.getText());
        if (valid.equals("0")) {
            TXT_Visor.setText("1");
        } else if (verif == 1) {
            TXT_Visor.setText("1");
            verif = 0;
        } else {
            TXT_Visor.setText(TXT_Visor.getText() + "1");
        }
    }//GEN-LAST:event_BTN_1ActionPerformed

    private void BTN_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_0ActionPerformed
        // Número 0:
        /*  Nesse botão ao ser clicado irá criara uma variável
         para pegar o valor do visor e distribuir em uma variável.
         Após isso vai verificar se o visor é igual a '0'
         para que não o concatane. Depois verificará se o valor
         armazenado não é resultado de uma operação, e retorna o valor
         do botão retornando a variável de verificação a 0 para não 
         ser apagado. Caso não entre em nenhumas das condições ele
         apenas concatena o valor cliclado ao já existente.*/
        String valid;
        valid = (TXT_Visor.getText());
        if (valid.equals("0")) {
            TXT_Visor.setText("0");
        } else if (verif == 1) {
            TXT_Visor.setText("0");
            verif = 0;
        } else {
            TXT_Visor.setText(TXT_Visor.getText() + "0");
        }
    }//GEN-LAST:event_BTN_0ActionPerformed

    private void TXT_VisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_VisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_VisorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Simples:
        // não há comandos para que não feche nem altere a janela

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Desenvolvedor:
        /*  Esta opção fechará a interface aberta 
         e abrirá a outra interface desejada */
        dispose();
        new Interface_Desenvolvedor().setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // About:
        new About().setVisible(true); // abre o formulário que fala sobre o programa;
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Simples().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_0;
    private javax.swing.JButton BTN_1;
    private javax.swing.JButton BTN_1DivX;
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
    private javax.swing.JButton BTN_Div;
    private javax.swing.JButton BTN_Fat;
    private javax.swing.JButton BTN_Igual;
    private javax.swing.JButton BTN_Mult;
    private javax.swing.JButton BTN_Raiz;
    private javax.swing.JButton BTN_Sinais;
    private javax.swing.JButton BTN_Soma;
    private javax.swing.JButton BTN_Sub;
    private javax.swing.JButton BTN_Virgula;
    private javax.swing.JButton BTN_X2;
    private javax.swing.JButton BTN_XY;
    private javax.swing.JTextField TXT_Visor;
    private javax.swing.JTextField TXT_Visor1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
