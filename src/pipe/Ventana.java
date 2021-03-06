package pipe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jpl7.Term;

public class Ventana extends JFrame {

    private Juego juego;

    public Ventana() {
        initComponents();
        this.juego = Juego.getJuego((VistaPipe) this.jPanelJuego);
        this.initComand((VistaPipe) this.jPanelComandos);
        this.setTitle("Trabajo Final IA: Pipes por Pablos y Mateos");
        this.jFormattedTextFieldDestinoX.setText("6");
        this.jFormattedTextFieldDestinoY.setText("1");
        this.jFormattedTextFieldOrigenX.setText("0");
        this.jFormattedTextFieldOrigenY.setText("4");
        this.jButtonSigSol.setEnabled(false);
    }

    private void initComand(VistaPipe panel) {
        panel.agregaPipe(0, 1, 1);
        panel.agregaPipe(2, 1, 2);
        panel.agregaPipe(4, 1, 3);
        panel.agregaPipe(6, 1, 4);
        panel.agregaPipe(8, 1, 5);
        panel.agregaPipe(10, 1, 6);
    }

    private int cambio(String valor, char op) {
        int aux = Integer.parseInt(valor);
        if (aux > 0) {
            if (op == '+') {
                aux++;
            } else {
                aux--;
            }
        } else {
            if (aux == 0) {
                if (op == '+') {
                    aux++;
                }
            }
        }
        return aux;
    }

    public int orientar(int x, int y) {
        int aux = 1;
        if (x == 0) {
            aux = 8;
        } else {
            if (x == 6) {
                aux = 7;
            } else {
                if (y == 0) {
                    aux = 10;
                } else {
                    if (y == 6) {
                        aux = 9;
                    }
                }
            }
        }
        return aux;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelJuego = new VistaPipe();
        jPanelComandos = new VistaPipe();
        jButtonMasVertical = new javax.swing.JButton();
        jButtonMenosVertical = new javax.swing.JButton();
        jLabelCantVertical = new javax.swing.JLabel();
        jButtonMasHorizontal = new javax.swing.JButton();
        jLabelCantHorizontal = new javax.swing.JLabel();
        jButtonMenosHorizontal = new javax.swing.JButton();
        jButtonMasAbajoDer = new javax.swing.JButton();
        jLabelCantAbajoDer = new javax.swing.JLabel();
        jButtonMenosAbajoDer = new javax.swing.JButton();
        jButtonMasAbajoIzq = new javax.swing.JButton();
        jLabelCantAbajoIzq = new javax.swing.JLabel();
        jButtonMenosAbajoizq = new javax.swing.JButton();
        jButtonMasArribaDer = new javax.swing.JButton();
        jLabelCantArribaDer = new javax.swing.JLabel();
        jButtonMenosArribaDer = new javax.swing.JButton();
        jButtonMasArribaIzq = new javax.swing.JButton();
        jLabelCantArribaIzq = new javax.swing.JLabel();
        jButtonMenosArribaIzq = new javax.swing.JButton();
        jPanelParametros = new javax.swing.JPanel();
        jLabelTextoOrigen = new javax.swing.JLabel();
        jLabelTextoOrigenX = new javax.swing.JLabel();
        jLabelTextoOrigenY = new javax.swing.JLabel();
        jLabelTextoDestino = new javax.swing.JLabel();
        jLabelTextoDestinoX = new javax.swing.JLabel();
        jLabelTextoDestinoY = new javax.swing.JLabel();
        jButtonResolver = new javax.swing.JButton();
        jFormattedTextFieldOrigenX = new javax.swing.JFormattedTextField();
        jFormattedTextFieldOrigenY = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDestinoY = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDestinoX = new javax.swing.JFormattedTextField();
        jButtonSigSol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelJuego.setToolTipText("");

        javax.swing.GroupLayout jPanelJuegoLayout = new javax.swing.GroupLayout(jPanelJuego);
        jPanelJuego.setLayout(jPanelJuegoLayout);
        jPanelJuegoLayout.setHorizontalGroup(
            jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        jPanelJuegoLayout.setVerticalGroup(
            jPanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        jPanelComandos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonMasVertical.setText("+");
        jButtonMasVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasVerticalActionPerformed(evt);
            }
        });

        jButtonMenosVertical.setText("-");
        jButtonMenosVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosVerticalActionPerformed(evt);
            }
        });

        jLabelCantVertical.setText("5");

        jButtonMasHorizontal.setText("+");
        jButtonMasHorizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasHorizontalActionPerformed(evt);
            }
        });

        jLabelCantHorizontal.setText("5");

        jButtonMenosHorizontal.setText("-");
        jButtonMenosHorizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosHorizontalActionPerformed(evt);
            }
        });

        jButtonMasAbajoDer.setText("+");
        jButtonMasAbajoDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasAbajoDerActionPerformed(evt);
            }
        });

        jLabelCantAbajoDer.setText("1");

        jButtonMenosAbajoDer.setText("-");
        jButtonMenosAbajoDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosAbajoDerActionPerformed(evt);
            }
        });

        jButtonMasAbajoIzq.setText("+");
        jButtonMasAbajoIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasAbajoIzqActionPerformed(evt);
            }
        });

        jLabelCantAbajoIzq.setText("0");

        jButtonMenosAbajoizq.setText("-");
        jButtonMenosAbajoizq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosAbajoizqActionPerformed(evt);
            }
        });

        jButtonMasArribaDer.setText("+");
        jButtonMasArribaDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasArribaDerActionPerformed(evt);
            }
        });

        jLabelCantArribaDer.setText("0");

        jButtonMenosArribaDer.setText("-");
        jButtonMenosArribaDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosArribaDerActionPerformed(evt);
            }
        });

        jButtonMasArribaIzq.setText("+");
        jButtonMasArribaIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasArribaIzqActionPerformed(evt);
            }
        });

        jLabelCantArribaIzq.setText("1");

        jButtonMenosArribaIzq.setText("-");
        jButtonMenosArribaIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosArribaIzqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelComandosLayout = new javax.swing.GroupLayout(jPanelComandos);
        jPanelComandos.setLayout(jPanelComandosLayout);
        jPanelComandosLayout.setHorizontalGroup(
            jPanelComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComandosLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanelComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMenosVertical)
                    .addComponent(jButtonMasVertical)
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelCantVertical)))
                .addGap(77, 77, 77)
                .addGroup(jPanelComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMenosHorizontal)
                    .addComponent(jButtonMasHorizontal)
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelCantHorizontal)))
                .addGap(58, 58, 58)
                .addGroup(jPanelComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMenosAbajoDer)
                    .addComponent(jButtonMasAbajoDer)
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelCantAbajoDer)))
                .addGap(68, 68, 68)
                .addGroup(jPanelComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMenosAbajoizq)
                    .addComponent(jButtonMasAbajoIzq)
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelCantAbajoIzq)))
                .addGap(64, 64, 64)
                .addGroup(jPanelComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMenosArribaDer)
                    .addComponent(jButtonMasArribaDer)
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelCantArribaDer)))
                .addGap(71, 71, 71)
                .addGroup(jPanelComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMenosArribaIzq)
                    .addComponent(jButtonMasArribaIzq)
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelCantArribaIzq)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelComandosLayout.setVerticalGroup(
            jPanelComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComandosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addComponent(jButtonMasAbajoDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCantAbajoDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMenosAbajoDer))
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addComponent(jButtonMasHorizontal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCantHorizontal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMenosHorizontal))
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addComponent(jButtonMasVertical)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCantVertical)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMenosVertical))
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addComponent(jButtonMasAbajoIzq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCantAbajoIzq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMenosAbajoizq))
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addComponent(jButtonMasArribaIzq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCantArribaIzq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMenosArribaIzq))
                    .addGroup(jPanelComandosLayout.createSequentialGroup()
                        .addComponent(jButtonMasArribaDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCantArribaDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonMenosArribaDer)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanelParametros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTextoOrigen.setText("Posición del origen:");

        jLabelTextoOrigenX.setText("X: ");

        jLabelTextoOrigenY.setText("Y:");

        jLabelTextoDestino.setText("Posición del destino:");

        jLabelTextoDestinoX.setText("X: ");

        jLabelTextoDestinoY.setText("Y:");

        jButtonResolver.setText("Resolver");
        jButtonResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResolverActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldOrigenX.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldOrigenY.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldDestinoY.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldDestinoX.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonSigSol.setText("Sig Solución");
        jButtonSigSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSigSolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelParametrosLayout = new javax.swing.GroupLayout(jPanelParametros);
        jPanelParametros.setLayout(jPanelParametrosLayout);
        jPanelParametrosLayout.setHorizontalGroup(
            jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelParametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelParametrosLayout.createSequentialGroup()
                        .addComponent(jLabelTextoOrigenX)
                        .addGap(4, 4, 4)
                        .addComponent(jFormattedTextFieldOrigenX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTextoOrigenY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldOrigenY, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTextoOrigen)
                    .addComponent(jLabelTextoDestino)
                    .addGroup(jPanelParametrosLayout.createSequentialGroup()
                        .addComponent(jLabelTextoDestinoX)
                        .addGap(4, 4, 4)
                        .addGroup(jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonResolver)
                            .addGroup(jPanelParametrosLayout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldDestinoX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTextoDestinoY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldDestinoY, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelParametrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSigSol)
                .addGap(19, 19, 19))
        );
        jPanelParametrosLayout.setVerticalGroup(
            jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelParametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTextoOrigen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextoOrigenX)
                    .addComponent(jLabelTextoOrigenY)
                    .addComponent(jFormattedTextFieldOrigenX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldOrigenY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelTextoDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTextoDestinoX)
                        .addComponent(jLabelTextoDestinoY)
                        .addComponent(jFormattedTextFieldDestinoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFormattedTextFieldDestinoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonResolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSigSol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelComandos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelParametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelParametros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResolverActionPerformed
        int xO = Integer.parseInt(this.jFormattedTextFieldOrigenX.getText());
        int yO = Integer.parseInt(this.jFormattedTextFieldOrigenY.getText());
        int xD = Integer.parseInt(this.jFormattedTextFieldDestinoX.getText());
        int yD = Integer.parseInt(this.jFormattedTextFieldDestinoY.getText());
        HashMap<Integer, Integer> cantidades = new HashMap<Integer, Integer>();
        cantidades.put(1, Integer.parseInt(this.jLabelCantVertical.getText()));
        cantidades.put(2, Integer.parseInt(this.jLabelCantHorizontal.getText()));
        cantidades.put(3, Integer.parseInt(this.jLabelCantAbajoDer.getText()));
        cantidades.put(4, Integer.parseInt(this.jLabelCantAbajoIzq.getText()));
        cantidades.put(5, Integer.parseInt(this.jLabelCantArribaDer.getText()));
        cantidades.put(6, Integer.parseInt(this.jLabelCantArribaIzq.getText()));
        try {
            Map<String, Term> sol = juego.comenzar(xO, yO, xD, yD, cantidades);
            VistaPipe paneldejuego = (VistaPipe) this.jPanelJuego;
            paneldejuego.reiniciar();
            Iterator<Pipe> valores = (juego.transformar(sol)).iterator();
            paneldejuego.agregaPipe(xO, yO, this.orientar(xO, yO));
            paneldejuego.agregaPipe(xD, yD, this.orientar(xD, yD));
            Pipe aux;
            while (valores.hasNext()) {
                aux = valores.next();
                paneldejuego.agregaPipe(aux);
            }
            this.jButtonSigSol.setEnabled(true);
        } catch (NoSolutionException ex) {
            JOptionPane.showMessageDialog(this, "El problema planteado no tiene solución.");
        }
    }//GEN-LAST:event_jButtonResolverActionPerformed

    private void jButtonMasVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasVerticalActionPerformed
        this.jLabelCantVertical.setText(cambio(this.jLabelCantVertical.getText(), '+') + "");
    }//GEN-LAST:event_jButtonMasVerticalActionPerformed

    private void jButtonMenosVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosVerticalActionPerformed
        this.jLabelCantVertical.setText(cambio(this.jLabelCantVertical.getText(), '-') + "");
    }//GEN-LAST:event_jButtonMenosVerticalActionPerformed

    private void jButtonMasHorizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasHorizontalActionPerformed
        this.jLabelCantHorizontal.setText(cambio(this.jLabelCantHorizontal.getText(), '+') + "");
    }//GEN-LAST:event_jButtonMasHorizontalActionPerformed

    private void jButtonMenosHorizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosHorizontalActionPerformed
        this.jLabelCantHorizontal.setText(cambio(this.jLabelCantHorizontal.getText(), '-') + "");
    }//GEN-LAST:event_jButtonMenosHorizontalActionPerformed

    private void jButtonMasAbajoDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasAbajoDerActionPerformed
        this.jLabelCantAbajoDer.setText(cambio(this.jLabelCantAbajoDer.getText(), '+') + "");
    }//GEN-LAST:event_jButtonMasAbajoDerActionPerformed

    private void jButtonMenosAbajoDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosAbajoDerActionPerformed
        this.jLabelCantAbajoDer.setText(cambio(this.jLabelCantAbajoDer.getText(), '-') + "");
    }//GEN-LAST:event_jButtonMenosAbajoDerActionPerformed

    private void jButtonMasAbajoIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasAbajoIzqActionPerformed
        this.jLabelCantAbajoIzq.setText(cambio(this.jLabelCantAbajoIzq.getText(), '+') + "");
    }//GEN-LAST:event_jButtonMasAbajoIzqActionPerformed

    private void jButtonMenosAbajoizqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosAbajoizqActionPerformed
        this.jLabelCantAbajoIzq.setText(cambio(this.jLabelCantAbajoIzq.getText(), '-') + "");
    }//GEN-LAST:event_jButtonMenosAbajoizqActionPerformed

    private void jButtonMenosArribaDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosArribaDerActionPerformed
        this.jLabelCantArribaDer.setText(cambio(this.jLabelCantArribaDer.getText(), '-') + "");
    }//GEN-LAST:event_jButtonMenosArribaDerActionPerformed

    private void jButtonMasArribaIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasArribaIzqActionPerformed
        this.jLabelCantArribaIzq.setText(cambio(this.jLabelCantArribaIzq.getText(), '+') + "");
    }//GEN-LAST:event_jButtonMasArribaIzqActionPerformed

    private void jButtonMenosArribaIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosArribaIzqActionPerformed
        this.jLabelCantArribaIzq.setText(cambio(this.jLabelCantArribaIzq.getText(), '-') + "");
    }//GEN-LAST:event_jButtonMenosArribaIzqActionPerformed

    private void jButtonMasArribaDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasArribaDerActionPerformed
        this.jLabelCantArribaDer.setText(cambio(this.jLabelCantArribaDer.getText(), '+') + "");
    }//GEN-LAST:event_jButtonMasArribaDerActionPerformed

    private void jButtonSigSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSigSolActionPerformed
        int xO = Integer.parseInt(this.jFormattedTextFieldOrigenX.getText());
        int yO = Integer.parseInt(this.jFormattedTextFieldOrigenY.getText());
        int xD = Integer.parseInt(this.jFormattedTextFieldDestinoX.getText());
        int yD = Integer.parseInt(this.jFormattedTextFieldDestinoY.getText());
        VistaPipe paneldejuego = (VistaPipe) this.jPanelJuego;
        paneldejuego.reiniciar();
        try {
            Map<String, Term> sol = juego.resolver();
            Iterator<Pipe> valores = (juego.transformar(sol)).iterator();
            paneldejuego.agregaPipe(xO, yO, this.orientar(xO, yO));
            paneldejuego.agregaPipe(xD, yD, this.orientar(xD, yD));
            Pipe aux;
            while (valores.hasNext() ) {
                aux = valores.next();
                paneldejuego.agregaPipe(aux);
            }
        }
        catch (NoSolutionException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButtonSigSolActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMasAbajoDer;
    private javax.swing.JButton jButtonMasAbajoIzq;
    private javax.swing.JButton jButtonMasArribaDer;
    private javax.swing.JButton jButtonMasArribaIzq;
    private javax.swing.JButton jButtonMasHorizontal;
    private javax.swing.JButton jButtonMasVertical;
    private javax.swing.JButton jButtonMenosAbajoDer;
    private javax.swing.JButton jButtonMenosAbajoizq;
    private javax.swing.JButton jButtonMenosArribaDer;
    private javax.swing.JButton jButtonMenosArribaIzq;
    private javax.swing.JButton jButtonMenosHorizontal;
    private javax.swing.JButton jButtonMenosVertical;
    private javax.swing.JButton jButtonResolver;
    private javax.swing.JButton jButtonSigSol;
    private javax.swing.JFormattedTextField jFormattedTextFieldDestinoX;
    private javax.swing.JFormattedTextField jFormattedTextFieldDestinoY;
    private javax.swing.JFormattedTextField jFormattedTextFieldOrigenX;
    private javax.swing.JFormattedTextField jFormattedTextFieldOrigenY;
    private javax.swing.JLabel jLabelCantAbajoDer;
    private javax.swing.JLabel jLabelCantAbajoIzq;
    private javax.swing.JLabel jLabelCantArribaDer;
    private javax.swing.JLabel jLabelCantArribaIzq;
    private javax.swing.JLabel jLabelCantHorizontal;
    private javax.swing.JLabel jLabelCantVertical;
    private javax.swing.JLabel jLabelTextoDestino;
    private javax.swing.JLabel jLabelTextoDestinoX;
    private javax.swing.JLabel jLabelTextoDestinoY;
    private javax.swing.JLabel jLabelTextoOrigen;
    private javax.swing.JLabel jLabelTextoOrigenX;
    private javax.swing.JLabel jLabelTextoOrigenY;
    private javax.swing.JPanel jPanelComandos;
    private javax.swing.JPanel jPanelJuego;
    private javax.swing.JPanel jPanelParametros;
    // End of variables declaration//GEN-END:variables
}
