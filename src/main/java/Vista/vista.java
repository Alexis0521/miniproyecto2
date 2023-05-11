/*
 * MINIPROYECTO #2
 *
 * INTEGRANTES: 
 * Orlando Alexis Rengifo Mejia(2223878)
 * PROFESOR: Luis Yohany Romo Portilla 
 */

package Vista;

public class vista extends javax.swing.JFrame {
       
    public vista() {
        initComponents();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        casilla1 = new javax.swing.JButton();
        casilla2 = new javax.swing.JButton();
        casilla3 = new javax.swing.JButton();
        casilla4 = new javax.swing.JButton();
        casilla5 = new javax.swing.JButton();
        casilla6 = new javax.swing.JButton();
        casilla7 = new javax.swing.JButton();
        casilla8 = new javax.swing.JButton();
        casilla9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        victoriasJ1 = new javax.swing.JLabel();
        victoriasJ2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla1.setBackground(new java.awt.Color(153, 255, 255));
        casilla1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla1.setOpaque(true);
        casilla1.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 100));

        casilla2.setBackground(new java.awt.Color(153, 255, 255));
        casilla2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla2.setOpaque(true);
        casilla2.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 100));

        casilla3.setBackground(new java.awt.Color(153, 255, 255));
        casilla3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla3.setOpaque(true);
        casilla3.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 110, 100));

        casilla4.setBackground(new java.awt.Color(153, 255, 255));
        casilla4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla4.setOpaque(true);
        casilla4.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 110, 100));

        casilla5.setBackground(new java.awt.Color(153, 255, 255));
        casilla5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla5.setOpaque(true);
        casilla5.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, 100));

        casilla6.setBackground(new java.awt.Color(153, 255, 255));
        casilla6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla6.setOpaque(true);
        casilla6.setPreferredSize(new java.awt.Dimension(150, 150));
        casilla6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 110, 100));

        casilla7.setBackground(new java.awt.Color(153, 255, 255));
        casilla7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla7.setOpaque(true);
        casilla7.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 110, 100));

        casilla8.setBackground(new java.awt.Color(153, 255, 255));
        casilla8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla8.setOpaque(true);
        casilla8.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 110, 100));

        casilla9.setBackground(new java.awt.Color(153, 255, 255));
        casilla9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        casilla9.setOpaque(true);
        casilla9.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel1.add(casilla9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 110, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 330, 300));

        jLabel1.setText("Jugador 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 61, -1));

        jLabel2.setText("Jugador 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 82, -1));

        victoriasJ1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        victoriasJ1.setText("0");
        getContentPane().add(victoriasJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 21, 28));

        victoriasJ2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        victoriasJ2.setText("0");
        getContentPane().add(victoriasJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 21, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setText("Triqui");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("Puntaje");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casilla6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6ActionPerformed

    }//GEN-LAST:event_casilla6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton casilla1;
    public javax.swing.JButton casilla2;
    public javax.swing.JButton casilla3;
    public javax.swing.JButton casilla4;
    public javax.swing.JButton casilla5;
    public javax.swing.JButton casilla6;
    public javax.swing.JButton casilla7;
    public javax.swing.JButton casilla8;
    public javax.swing.JButton casilla9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel victoriasJ1;
    private javax.swing.JLabel victoriasJ2;
    // End of variables declaration//GEN-END:variables

    
}
