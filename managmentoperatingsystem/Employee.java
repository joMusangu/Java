/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.o.managmentoperatingsystem;

/**
 *
 * @author matsh
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblBAckground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setText("NAME");
        jLayeredPane1.add(lblName);
        lblName.setBounds(190, 180, 240, 60);

        lblSurname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSurname.setText("SURNAME");
        jLayeredPane1.add(lblSurname);
        lblSurname.setBounds(190, 230, 190, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("DoB");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(190, 300, 43, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("NATIONALITY");
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(180, 350, 240, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("GENDER");
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(180, 410, 160, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("ADDRESS");
        jLayeredPane1.add(jLabel6);
        jLabel6.setBounds(650, 290, 180, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("POST CODE");
        jLayeredPane1.add(jLabel7);
        jLabel7.setBounds(650, 350, 200, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("MOBILE NO");
        jLayeredPane1.add(jLabel8);
        jLabel8.setBounds(180, 470, 200, 80);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("JOB TITLE");
        jLayeredPane1.add(jLabel9);
        jLabel9.setBounds(650, 400, 200, 60);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane1.add(jTextField1);
        jTextField1.setBounds(350, 190, 260, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane1.add(jTextField2);
        jTextField2.setBounds(350, 240, 260, 50);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane1.add(jTextField3);
        jTextField3.setBounds(350, 300, 260, 50);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane1.add(jTextField4);
        jTextField4.setBounds(350, 360, 260, 50);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane1.add(jTextField6);
        jTextField6.setBounds(350, 480, 260, 50);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane1.add(jTextField7);
        jTextField7.setBounds(850, 290, 270, 50);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane1.add(jTextField9);
        jTextField9.setBounds(850, 410, 280, 50);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButton1.setText("MALE");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroup2, org.jdesktop.beansbinding.ObjectProperty.create(), jRadioButton1, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jLayeredPane1.add(jRadioButton1);
        jRadioButton1.setBounds(360, 430, 100, 30);

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButton2.setText("FEMALE");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroup2, org.jdesktop.beansbinding.ObjectProperty.create(), jRadioButton2, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jLayeredPane1.add(jRadioButton2);
        jRadioButton2.setBounds(480, 430, 130, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4096" }));
        jLayeredPane1.add(jComboBox1);
        jComboBox1.setBounds(900, 350, 160, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("UPDATE");
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(740, 510, 150, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("NEXT");
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(1040, 720, 150, 50);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\matsh\\Desktop\\Joseph Musangu\\M.O(ManagmentOperatingSystem)\\wer.jpg")); // NOI18N
        jLayeredPane1.add(jButton3);
        jButton3.setBounds(920, 510, 70, 70);
        jLayeredPane1.add(lblBAckground);
        lblBAckground.setBounds(0, 0, 1220, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1223, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblBAckground;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSurname;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
