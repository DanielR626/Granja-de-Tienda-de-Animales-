/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimalesVista;

import MenuPrincipal.MenuPrincipal;
import java.io.File;
import javax.swing.JOptionPane;
import animales.AnimalesController;
import java.io.FileWriter;
import DAOanimales.DAOanimales;

/**
 *
 * @author Mateo Salcedo
 */
public class AgregarAnimal extends javax.swing.JFrame {
    
    /*-----------------------------------
    *atributos
    *-----------------------------*/
    private String codAnm;
    private String nomAnm;
    private String tipAnm;
    private String sexAnm;
    private String varAnm;
    private String estAnm;
    private static AgregarAnimal agregaranimal;
    /**
     * Creates new form AgregarPokemon
     */
    private AgregarAnimal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }
    
    public static AgregarAnimal getInstance(){
        if(agregaranimal == null)
            agregaranimal=new AgregarAnimal();
        agregaranimal.porDefecto();
        return agregaranimal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexodeanimal = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        TexFieCodAnm = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        TexFieNomAnm = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cH_Bovino = new javax.swing.JCheckBox();
        cH_Aviar = new javax.swing.JCheckBox();
        cH_Equino = new javax.swing.JCheckBox();
        cH_Porcino = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        rD_Ma = new javax.swing.JRadioButton();
        rD_He = new javax.swing.JRadioButton();
        cH_Domestico = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        sliEst = new javax.swing.JSlider();
        spiEst = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setBackground(new java.awt.Color(116, 185, 255));
        jLabel5.setFont(new java.awt.Font("GeoSlab703 Md BT", 0, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mateo Salcedo\\Downloads\\Granja Animal\\GranjaAnimalesFinal\\icons\\mas.png")); // NOI18N
        jLabel5.setText("Agregar Animal");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel6.setBackground(new java.awt.Color(116, 185, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo animal"));
        jPanel6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        TexFieCodAnm.setText("Codigo");
        TexFieCodAnm.setToolTipText("");
        TexFieCodAnm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TexFieCodAnmMouseClicked(evt);
            }
        });
        TexFieCodAnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TexFieCodAnmKeyTyped(evt);
            }
        });
        jPanel6.add(TexFieCodAnm);

        jPanel1.add(jPanel6);

        jPanel5.setBackground(new java.awt.Color(116, 185, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del animal"));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        TexFieNomAnm.setText("Nombre");
        TexFieNomAnm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TexFieNomAnmMouseClicked(evt);
            }
        });
        jPanel5.add(TexFieNomAnm);

        jPanel1.add(jPanel5);

        jPanel2.setBackground(new java.awt.Color(116, 185, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Especie"));
        jPanel2.setLayout(new java.awt.GridLayout(0, 2));

        cH_Bovino.setText("Bovino");
        cH_Bovino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cH_BovinoActionPerformed(evt);
            }
        });
        jPanel2.add(cH_Bovino);

        cH_Aviar.setText("Aviar");
        jPanel2.add(cH_Aviar);

        cH_Equino.setText("Equino");
        cH_Equino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cH_EquinoActionPerformed(evt);
            }
        });
        jPanel2.add(cH_Equino);

        cH_Porcino.setText("Porcino");
        jPanel2.add(cH_Porcino);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(116, 185, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        sexodeanimal.add(rD_Ma);
        rD_Ma.setText("Macho");
        jPanel3.add(rD_Ma);

        sexodeanimal.add(rD_He);
        rD_He.setText("Hembra");
        jPanel3.add(rD_He);

        jPanel1.add(jPanel3);

        cH_Domestico.setBackground(new java.awt.Color(116, 185, 255));
        cH_Domestico.setText("Domestico");
        cH_Domestico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cH_DomesticoActionPerformed(evt);
            }
        });
        jPanel1.add(cH_Domestico);

        jPanel4.setBackground(new java.awt.Color(116, 185, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Peso"));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        sliEst.setMinorTickSpacing(10);
        sliEst.setPaintLabels(true);
        sliEst.setPaintTicks(true);
        sliEst.setSnapToTicks(true);
        sliEst.setToolTipText("0");
        sliEst.setValue(0);
        sliEst.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliEstStateChanged(evt);
            }
        });
        jPanel4.add(sliEst);

        spiEst.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(100.0f), Float.valueOf(1.0f)));
        spiEst.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiEstStateChanged(evt);
            }
        });
        jPanel4.add(spiEst);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setBackground(new java.awt.Color(162, 155, 254));
        jButton1.setText("Guardar Animal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);

        jButton2.setBackground(new java.awt.Color(162, 155, 254));
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);

        getContentPane().add(jPanel7, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void porDefecto(){
        TexFieCodAnm.setText("Codigo");
        TexFieNomAnm.setText("Nombre");
        cH_Equino.setSelected(false);
        cH_Bovino.setSelected(false);
        cH_Aviar.setSelected(false);
        cH_Porcino.setSelected(false);
        rD_Ma.setSelected(false);
        rD_He.setSelected(false);
        sexodeanimal.clearSelection();
        cH_Domestico.setSelected(false); 
        spiEst.setValue(0);
    }
    private void cH_BovinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cH_BovinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cH_BovinoActionPerformed

    private void TexFieCodAnmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TexFieCodAnmMouseClicked
        // TODO add your handling code here:
        TexFieCodAnm.setText("");
    }//GEN-LAST:event_TexFieCodAnmMouseClicked

    private void TexFieNomAnmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TexFieNomAnmMouseClicked
        // TODO add your handling code here:
        TexFieNomAnm.setText("");
    }//GEN-LAST:event_TexFieNomAnmMouseClicked

    private void TexFieCodAnmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TexFieCodAnmKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())) evt.consume();
        
    }//GEN-LAST:event_TexFieCodAnmKeyTyped

    private void sliEstStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliEstStateChanged
        // TODO add your handling code here:
        spiEst.setValue(sliEst.getValue());
    }//GEN-LAST:event_sliEstStateChanged

    private void spiEstStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiEstStateChanged
        // TODO add your handling code here:  
        sliEst.setValue((int) Float.parseFloat(spiEst.getValue()+""));
       
    }//GEN-LAST:event_spiEstStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MostrarAnimal mosPokInterfaz = MostrarAnimal.getInstance();
        mosPokInterfaz.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String[] opcion={"en la apliacion", "en un archivo"};
        int selec = JOptionPane.showConfirmDialog(null,"seguro desea guradar "
               , "confirmacion",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        int seleccion = 0;
        if(selec==0)
        {
            seleccion=JOptionPane.showOptionDialog(null,"donde deseas guardar la informacion","Elige...",0,
            JOptionPane.QUESTION_MESSAGE,null,opcion,null);
        }
        if(seleccion==0)
        {
            DAOanimales pokAnm = AnimalesController.getInstance();
            codAnm=TexFieCodAnm.getText();
            nomAnm=TexFieNomAnm.getText();
            tipAnm="";
            if(cH_Equino.isSelected())
                tipAnm+="Equino ";
            if(cH_Bovino.isSelected())
                tipAnm+="Bovino ";
            if(cH_Aviar.isSelected())
                tipAnm+="Aviar";
            if(cH_Porcino.isSelected())
                tipAnm+="Porcino ";
            sexAnm="";
            if(rD_Ma.isSelected()){
                sexAnm="Macho";
            }else{
                sexAnm="Hembra";
            }
            varAnm="";
            if(cH_Domestico.isSelected()){
                varAnm="Si";
            }else{
                varAnm="No";
            }
            estAnm=spiEst.getValue().toString();
            String[] Animal={codAnm,nomAnm,tipAnm,sexAnm,varAnm,estAnm};
            System.out.print("codigo "+codAnm);
            if(pokAnm.GuardarAnimal(Animal))
                JOptionPane.showMessageDialog(this, "Guardado Exitoso, en la aplicacion");
        }
        else
        {
            try{
                File archivo=new File("Registro.docx");
                if(archivo.createNewFile())
                {
                    System.out.print("Archivo ya se ha creado"+archivo.getName());
                }
                tipAnm="";
                if(cH_Equino.isSelected())
                    tipAnm+="Equino ";
                if(cH_Bovino.isSelected())
                    tipAnm+="Bovino ";
                if(cH_Aviar.isSelected())
                    tipAnm+="Aviar";
                if(cH_Porcino.isSelected())
                    tipAnm+="Porcino ";
                sexAnm="";
                if(rD_Ma.isSelected()){
                    sexAnm="Macho";
                }else{
                    sexAnm="Hembra";
                }
                varAnm="";
                if(cH_Domestico.isSelected()){
                    varAnm="Si";
                }else{
                    varAnm="No";
                }
                estAnm=spiEst.getValue().toString();
                
                FileWriter escribir=new FileWriter("Registro.docx",true);
                escribir.write(TexFieCodAnm.getText());
                escribir.write(", ");
                escribir.write(TexFieNomAnm.getText());
                escribir.write(", ");
                escribir.write(tipAnm);
                escribir.write(", ");
                escribir.write(sexAnm);
                escribir.write(", ");
                escribir.write(varAnm);
                escribir.write(", ");
                escribir.write(estAnm);
                escribir.write("\n");
                escribir.close();
                JOptionPane.showMessageDialog(null,"registro exitoso, en el archivo "+archivo.getName());
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "no se  ha echo el registro, "
                        + "ocurrio un error"+ e.toString());
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cH_EquinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cH_EquinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cH_EquinoActionPerformed

    private void cH_DomesticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cH_DomesticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cH_DomesticoActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TexFieCodAnm;
    private javax.swing.JTextField TexFieNomAnm;
    private javax.swing.JCheckBox cH_Aviar;
    private javax.swing.JCheckBox cH_Bovino;
    private javax.swing.JCheckBox cH_Domestico;
    private javax.swing.JCheckBox cH_Equino;
    private javax.swing.JCheckBox cH_Porcino;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton rD_He;
    private javax.swing.JRadioButton rD_Ma;
    private javax.swing.ButtonGroup sexodeanimal;
    private javax.swing.JSlider sliEst;
    private javax.swing.JSpinner spiEst;
    // End of variables declaration//GEN-END:variables
}
