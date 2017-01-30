

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author delacal_23
 */
public class VentanaAhorcado extends javax.swing.JFrame {
    
    String palabraOculta = "CETYS";
    
    
    int numeroFallos = 0;
    
    /**
     * Creates new form VentanaAhorcado
     */
    public VentanaAhorcado() {
        initComponents();
        // DIBUJA LA IMAGEN  DEL AHORCADO
        dibujaImagen (0); 
    }

    private void dibujaImagen (int numeroFallos){
        ImageIcon miImagen = null;
        URL nombreimagen = null;
        int ancho = panelAhorcado.getWidth();
        int alto = panelAhorcado.getHeight();
        
        switch (numeroFallos) {
            case 0 : nombreimagen = ((getClass().getResource("/imagenes/ahorcado_0.png"))); break;
            case 1 : nombreimagen = ((getClass().getResource("/imagenes/ahorcado_1.png"))); break;
            case 2 : nombreimagen = ((getClass().getResource("/imagenes/ahorcado_2.png"))); break;
            case 3 : nombreimagen = ((getClass().getResource("/imagenes/ahorcado_3.png"))); break;
            case 4 : nombreimagen = ((getClass().getResource("/imagenes/ahorcado_4.png"))); break;
            case 5 : nombreimagen = ((getClass().getResource("/imagenes/ahorcado_5.png"))); break;
            default  : nombreimagen = ((getClass().getResource("/imagenes/ahorcado_fin.png"))); break;
            
        }
        
        
        miImagen = new ImageIcon (new ImageIcon (nombreimagen).getImage() .getScaledInstance (ancho, alto, Image.SCALE_DEFAULT));
       
       panelAhorcado.setIcon(miImagen);
           
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        B = new javax.swing.JButton();
        A = new javax.swing.JButton();
        C = new javax.swing.JButton();
        E = new javax.swing.JButton();
        D = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        I = new javax.swing.JButton();
        R = new javax.swing.JButton();
        S = new javax.swing.JButton();
        M = new javax.swing.JButton();
        L = new javax.swing.JButton();
        N = new javax.swing.JButton();
        O = new javax.swing.JButton();
        Ñ = new javax.swing.JButton();
        P = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        J = new javax.swing.JButton();
        K = new javax.swing.JButton();
        T = new javax.swing.JButton();
        U = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        panelAhorcado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_ _ _ _ _");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 500, 46));

        B.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        B.setText("B");
        B.setPreferredSize(new java.awt.Dimension(40, 40));
        B.setSize(new java.awt.Dimension(40, 40));
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BMousePressed(evt);
            }
        });
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 332, -1, -1));

        A.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        A.setText("A");
        A.setPreferredSize(new java.awt.Dimension(40, 40));
        A.setSize(new java.awt.Dimension(40, 40));
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AMousePressed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 332, -1, -1));

        C.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        C.setText("C");
        C.setPreferredSize(new java.awt.Dimension(40, 40));
        C.setSize(new java.awt.Dimension(40, 40));
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CMousePressed(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 332, -1, -1));

        E.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        E.setText("E");
        E.setPreferredSize(new java.awt.Dimension(40, 40));
        E.setSize(new java.awt.Dimension(40, 40));
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EMousePressed(evt);
            }
        });
        getContentPane().add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 332, -1, -1));

        D.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        D.setText("D");
        D.setToolTipText("");
        D.setPreferredSize(new java.awt.Dimension(40, 40));
        D.setSize(new java.awt.Dimension(40, 40));
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DMousePressed(evt);
            }
        });
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 332, -1, -1));

        F.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        F.setText("F");
        F.setPreferredSize(new java.awt.Dimension(40, 40));
        F.setSize(new java.awt.Dimension(40, 40));
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FMousePressed(evt);
            }
        });
        getContentPane().add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 332, -1, -1));

        G.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        G.setText("G");
        G.setPreferredSize(new java.awt.Dimension(40, 40));
        G.setSize(new java.awt.Dimension(40, 40));
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GMousePressed(evt);
            }
        });
        getContentPane().add(G, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 332, -1, -1));

        H.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        H.setText("H");
        H.setToolTipText("");
        H.setPreferredSize(new java.awt.Dimension(40, 40));
        H.setSize(new java.awt.Dimension(40, 40));
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HMousePressed(evt);
            }
        });
        getContentPane().add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 332, -1, -1));

        I.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        I.setText("I");
        I.setPreferredSize(new java.awt.Dimension(40, 40));
        I.setSize(new java.awt.Dimension(40, 40));
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IMousePressed(evt);
            }
        });
        getContentPane().add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 332, -1, -1));

        R.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        R.setText("B");
        R.setPreferredSize(new java.awt.Dimension(40, 40));
        R.setSize(new java.awt.Dimension(40, 40));
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RMousePressed(evt);
            }
        });
        getContentPane().add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 378, -1, -1));

        S.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        S.setText("S");
        S.setPreferredSize(new java.awt.Dimension(40, 40));
        S.setSize(new java.awt.Dimension(40, 40));
        S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SMousePressed(evt);
            }
        });
        getContentPane().add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 378, -1, -1));

        M.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        M.setText("M");
        M.setPreferredSize(new java.awt.Dimension(40, 40));
        M.setSize(new java.awt.Dimension(40, 40));
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MMousePressed(evt);
            }
        });
        getContentPane().add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 378, -1, -1));

        L.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        L.setText("L");
        L.setPreferredSize(new java.awt.Dimension(40, 40));
        L.setSize(new java.awt.Dimension(40, 40));
        L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LMousePressed(evt);
            }
        });
        getContentPane().add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 378, -1, -1));

        N.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        N.setText("N");
        N.setPreferredSize(new java.awt.Dimension(40, 40));
        N.setSize(new java.awt.Dimension(40, 40));
        N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NMousePressed(evt);
            }
        });
        getContentPane().add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 378, -1, -1));

        O.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        O.setText("O");
        O.setPreferredSize(new java.awt.Dimension(40, 40));
        O.setSize(new java.awt.Dimension(40, 40));
        O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OMousePressed(evt);
            }
        });
        getContentPane().add(O, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 378, -1, -1));

        Ñ.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Ñ.setText("Ñ");
        Ñ.setPreferredSize(new java.awt.Dimension(40, 40));
        Ñ.setSize(new java.awt.Dimension(40, 40));
        Ñ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ÑMousePressed(evt);
            }
        });
        getContentPane().add(Ñ, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 378, -1, -1));

        P.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        P.setText("P");
        P.setPreferredSize(new java.awt.Dimension(40, 40));
        P.setSize(new java.awt.Dimension(40, 40));
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PMousePressed(evt);
            }
        });
        getContentPane().add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 378, -1, -1));

        Q.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Q.setText("Q");
        Q.setPreferredSize(new java.awt.Dimension(40, 40));
        Q.setSize(new java.awt.Dimension(40, 40));
        Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QMousePressed(evt);
            }
        });
        getContentPane().add(Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 378, -1, -1));

        J.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        J.setText("J");
        J.setPreferredSize(new java.awt.Dimension(40, 40));
        J.setSize(new java.awt.Dimension(40, 40));
        J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMousePressed(evt);
            }
        });
        getContentPane().add(J, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 332, -1, -1));

        K.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        K.setText("K");
        K.setPreferredSize(new java.awt.Dimension(40, 40));
        K.setSize(new java.awt.Dimension(40, 40));
        K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KMousePressed(evt);
            }
        });
        getContentPane().add(K, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 332, -1, -1));

        T.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        T.setText("T");
        T.setPreferredSize(new java.awt.Dimension(40, 40));
        T.setSize(new java.awt.Dimension(40, 40));
        T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TMousePressed(evt);
            }
        });
        getContentPane().add(T, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 378, -1, -1));

        U.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        U.setText("U");
        U.setPreferredSize(new java.awt.Dimension(40, 40));
        U.setSize(new java.awt.Dimension(40, 40));
        U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UMousePressed(evt);
            }
        });
        getContentPane().add(U, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 378, -1, -1));

        Y.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Y.setText("Y");
        Y.setPreferredSize(new java.awt.Dimension(40, 40));
        Y.setSize(new java.awt.Dimension(40, 40));
        Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                YMousePressed(evt);
            }
        });
        getContentPane().add(Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 424, -1, -1));

        V.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        V.setText("V");
        V.setPreferredSize(new java.awt.Dimension(40, 40));
        V.setSize(new java.awt.Dimension(40, 40));
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VMousePressed(evt);
            }
        });
        getContentPane().add(V, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 424, -1, -1));

        W.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        W.setText("W");
        W.setPreferredSize(new java.awt.Dimension(40, 40));
        W.setSize(new java.awt.Dimension(40, 40));
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                WMousePressed(evt);
            }
        });
        getContentPane().add(W, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 424, -1, -1));

        Z.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Z.setText("Z");
        Z.setPreferredSize(new java.awt.Dimension(40, 40));
        Z.setSize(new java.awt.Dimension(40, 40));
        Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ZMousePressed(evt);
            }
        });
        getContentPane().add(Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 424, -1, -1));

        jButton27.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jButton27.setText(" ");
        jButton27.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton27.setSize(new java.awt.Dimension(40, 40));
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 424, 316, -1));

        panelAhorcado.setText("Panel Ahorcado");
        getContentPane().add(panelAhorcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 58, 271, 234));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void chequeaLetra (String letra){
        numeroFallos ++;
        dibujaImagen(numeroFallos);
    }
    

    
    
    private void chequeaBoton(JButton miBoton){
        miBoton.setEnabled(false);
        chequeaLetra (miBoton.getText());
    }
    
    
    
    private void AMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMousePressed
        chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_AMousePressed

    private void BMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_BMousePressed

    private void CMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_CMousePressed

    private void DMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_DMousePressed

    private void EMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_EMousePressed

    private void FMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_FMousePressed

    private void GMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_GMousePressed

    private void HMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_HMousePressed

    private void IMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_IMousePressed

    private void JMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_JMousePressed

    private void KMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_KMousePressed

    private void LMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_LMousePressed

    private void MMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_MMousePressed

    private void NMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_NMousePressed

    private void ÑMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ÑMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_ÑMousePressed

    private void OMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_OMousePressed

    private void PMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_PMousePressed

    private void QMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_QMousePressed

    private void RMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_RMousePressed

    private void SMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_SMousePressed

    private void TMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_TMousePressed

    private void UMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_UMousePressed

    private void VMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_VMousePressed

    private void WMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_WMousePressed

    private void YMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_YMousePressed

    private void ZMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMousePressed
         chequeaBoton(  (JButton) evt.getSource());
    }//GEN-LAST:event_ZMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JButton jButton27;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel panelAhorcado;
    private javax.swing.JButton Ñ;
    // End of variables declaration//GEN-END:variables
}
