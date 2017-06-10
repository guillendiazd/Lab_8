package david_diaz_lab7;

import java.awt.Color;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_Sexo = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTF_HA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTF_HB = new javax.swing.JTextField();
        jRB_L = new javax.swing.JRadioButton();
        jRB_MA = new javax.swing.JRadioButton();
        jRB_MI = new javax.swing.JRadioButton();
        jRB_J = new javax.swing.JRadioButton();
        jRB_V = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTF_Nombre = new javax.swing.JTextField();
        jTF_Edad = new javax.swing.JTextField();
        jTF_Peso = new javax.swing.JTextField();
        jTF_ID = new javax.swing.JTextField();
        jRB_M = new javax.swing.JRadioButton();
        jRB_F = new javax.swing.JRadioButton();
        jTF_Anios = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTF_Nombre1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTF_Edad1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTF_ID1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTF_Peso1 = new javax.swing.JTextField();
        jRB_M1 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jRB_F1 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jCB_Sangre = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTF_Causa = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jCB_E = new javax.swing.JCheckBox();
        jCB_H = new javax.swing.JCheckBox();
        jCB_C = new javax.swing.JCheckBox();
        jCB_PU = new javax.swing.JCheckBox();
        jCB_CO = new javax.swing.JCheckBox();
        jCB_P = new javax.swing.JCheckBox();
        jCB_R = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jCB_Paciente = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jCB_Organos = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        Color_O = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTF_NIPO = new javax.swing.JTextField();
        jTF_NIPR = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jCB_Doc = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        arbolito = new javax.swing.JTree();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jCB_DOC_A = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jCB_PA_A = new javax.swing.JComboBox<>();
        JPB_Barra = new javax.swing.JProgressBar();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPB_E = new javax.swing.JProgressBar();
        jLabel19 = new javax.swing.JLabel();
        jPB_H = new javax.swing.JProgressBar();
        jLabel20 = new javax.swing.JLabel();
        jPB_CE = new javax.swing.JProgressBar();
        jLabel27 = new javax.swing.JLabel();
        jPB_P = new javax.swing.JProgressBar();
        jLabel31 = new javax.swing.JLabel();
        jPB_CO = new javax.swing.JProgressBar();
        jLabel32 = new javax.swing.JLabel();
        jPB_PU = new javax.swing.JProgressBar();
        jLabel33 = new javax.swing.JLabel();
        jPB_R = new javax.swing.JProgressBar();
        jLabel34 = new javax.swing.JLabel();

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ingrese Doctor");

        jLabel2.setText("Años como Doctor:");

        jLabel3.setText("Horario de Trabajo:");

        jLabel4.setText("Dias de Trabajo:");

        jLabel5.setText("a");

        jRB_L.setText("Lunes");

        jRB_MA.setText("Martes");

        jRB_MI.setText("Miercoles");

        jRB_J.setText("Jueves");

        jRB_V.setText("Viernes");

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel7.setText("Nombre:");

        jLabel8.setText("Edad:");

        jLabel9.setText("ID:");

        jLabel11.setText("Peso:");

        jLabel12.setText("Sexo:");

        BG_Sexo.add(jRB_M);
        jRB_M.setText("M");

        BG_Sexo.add(jRB_F);
        jRB_F.setText("F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Anios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTF_Nombre))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRB_L)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRB_MA)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRB_MI))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRB_J)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRB_V))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTF_HA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTF_HB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(jTF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jTF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel9)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTF_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRB_M)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRB_F)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTF_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jRB_M)
                    .addComponent(jRB_F))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_Anios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTF_HA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTF_HB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRB_L)
                    .addComponent(jRB_MA)
                    .addComponent(jRB_MI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRB_J)
                    .addComponent(jRB_V))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Doctor", jPanel1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Ingrese Paciente");

        jLabel13.setText("Nombre:");

        jLabel14.setText("Edad:");

        jLabel15.setText("ID:");

        jLabel17.setText("Peso:");

        BG_Sexo.add(jRB_M1);
        jRB_M1.setText("M");

        jLabel18.setText("Sexo:");

        BG_Sexo.add(jRB_F1);
        jRB_F1.setText("F");

        jLabel21.setText("Tipo de Sangre:");

        jLabel22.setText("Causa de la Visita:");

        jCB_Sangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        jTF_Causa.setColumns(20);
        jTF_Causa.setRows(5);
        jScrollPane1.setViewportView(jTF_Causa);

        jButton2.setText("Agregar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel23.setText("Organos a Evaluar:");

        jCB_E.setText("Estomago");

        jCB_H.setText("Hígado");

        jCB_C.setText("Cerebro");

        jCB_PU.setText("Pulmones");

        jCB_CO.setText("Corazon");

        jCB_P.setText("Páncreas");

        jCB_R.setText("Riñones");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCB_P)
                            .addComponent(jCB_R)
                            .addComponent(jCB_E))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCB_H)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCB_C))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCB_CO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCB_PU))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTF_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCB_Sangre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(jTF_Edad1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(16, 16, 16)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTF_Peso1)
                                .addComponent(jTF_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel15)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(18, 18, 18)
                            .addComponent(jRB_M1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRB_F1))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTF_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTF_Edad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTF_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jRB_M1)
                    .addComponent(jRB_F1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTF_Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jCB_Sangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jCB_E)
                    .addComponent(jCB_H)
                    .addComponent(jCB_C))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB_P)
                    .addComponent(jCB_CO)
                    .addComponent(jCB_PU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_R)
                .addGap(18, 51, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Paciente", jPanel3);

        jCB_Paciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCB_PacienteItemStateChanged(evt);
            }
        });

        jLabel24.setText("Paciente:");

        jLabel25.setText("Lista de Organos:");

        jLabel26.setText("Color:");

        Color_O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Color_OMouseClicked(evt);
            }
        });

        jLabel28.setText("Nivel de Potenciado:");

        jLabel29.setText("Nivel de Prueba:");

        jButton3.setText("Guardar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCB_Organos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCB_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Color_O, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTF_NIPR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jTF_NIPO, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(177, Short.MAX_VALUE))
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jCB_Organos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Color_O, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(120, 120, 120)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTF_NIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTF_NIPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Organos", jPanel4);

        jLabel30.setText("Doctor:");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Doctor");
        arbolito.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbolito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolitoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(arbolito);

        jButton4.setText("Listar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCB_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(jCB_Doc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reporte", jPanel5);

        jLabel10.setText("Doctor:");

        jLabel16.setText("Paciente:");

        JPB_Barra.setMaximum(7);

        jButton5.setText("Asignar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Evaluar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jPB_E.setMaximum(100000000);

        jLabel19.setText("Estomago");

        jLabel20.setText("Hígado");

        jLabel27.setText("Cerebro");

        jLabel31.setText("Páncreas");

        jLabel32.setText("Corazón");

        jLabel33.setText("Pulmones");

        jLabel34.setText("Riñones");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPB_Barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCB_PA_A, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCB_DOC_A, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPB_E, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPB_H, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPB_CE, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPB_P, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPB_CO, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPB_PU, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPB_R, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jCB_DOC_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jCB_PA_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPB_Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPB_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPB_H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPB_CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPB_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPB_CO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPB_PU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPB_R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Elegir Medico", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            String horario = jTF_HA + "a" + jTF_HB;
            String dias = "", sexo = "", op = "s", es = "";
            if (jRB_L.isSelected()) {
                dias += "Lunes";
            }
            if (jRB_MA.isSelected()) {
                dias += " Martes";
            }
            if (jRB_MI.isSelected()) {
                dias += " Miercoles";
            }
            if (jRB_J.isSelected()) {
                dias += " Jueves";
            }
            if (jRB_V.isSelected()) {
                dias += " Viernes";
            }
            if (jRB_M.isSelected()) {
                sexo = "Maculino";
            }else{
                sexo = "Femenino";
            }
            Doctor p = new Doctor(Integer.parseInt(jTF_Anios.getText()), horario, dias, jTF_Nombre.getText(), Integer.parseInt(jTF_Edad.getText()), jTF_ID.getText(), Double.parseDouble(jTF_Peso.getText()), sexo);
            op = JOptionPane.showInputDialog(this, "Desea Ingresar Especialidad?[n/s]");
            while(!op.equalsIgnoreCase("n")){
                
                es = JOptionPane.showInputDialog(this, "Ingree Especialidad");
                ((Doctor)p).getEspecialidades().add(es);
                op = JOptionPane.showInputDialog(this, "Desea Ingresar Especialidad?[n/s]");
            }
            
            JOptionPane.showMessageDialog(this, "Doctor Creado");
            DefaultComboBoxModel modelo = (DefaultComboBoxModel)jCB_Doc.getModel();
            modelo.addElement(p);
            jCB_Doc.setModel(modelo);
            jCB_DOC_A.setModel(modelo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            String sexo = "", op="s", op1 = "s", en= "", al="";
            if (jRB_M.isSelected()) {
                sexo = "Masculino";
            }else{
                sexo = "Femenino";
            }
            
            Persona p = new Paciente(new Date(), new Date(), (String)jCB_Sangre.getSelectedItem(),jTF_Causa.getText(), jTF_Nombre1.getText(), Integer.parseInt(jTF_Edad1.getText()), jTF_ID1.getText(), Double.parseDouble(jTF_Peso1.getText()), sexo);
            if (jCB_E.isSelected()) {
                Estomago E = new Estomago();
                E.setNivel_efectividad(52580);
                ((Paciente)p).getOrganos().add(E);
            }
            if (jCB_H.isSelected()) {
                Higado H = new Higado();
                H.setNivel_efectividad(69864);
                ((Paciente)p).getOrganos().add(H);
            }
            if (jCB_C.isSelected()) {
                Cerebro C = new Cerebro();
                C.setNivel_efectividad(600000);
                ((Paciente)p).getOrganos().add(C);
            }
            if (jCB_P.isSelected()) {
                Pancreas P = new Pancreas();
                P.setNivel_efectividad(984236);
                ((Paciente)p).getOrganos().add((P));
            }
            if (jCB_CO.isSelected()) {
                Corazon CO = new Corazon();
                CO.setNivel_efectividad(21546);
                ((Paciente)p).getOrganos().add(CO);
            }
            if (jCB_PU.isSelected()) {
                Pulmones P = new Pulmones();
                P.setNivel_efectividad(589213);
                ((Paciente)p).getOrganos().add(P);
            }
            if (jCB_R.isSelected()) {
                Riniones R = new Riniones();
                R.setNivel_efectividad(753266);
                ((Paciente)p).getOrganos().add(R);
            }
            op = JOptionPane.showInputDialog(this, "Desea Ingresar Enfermedades?[n/s]");
            while(!op.equalsIgnoreCase("n")){
                
                en = JOptionPane.showInputDialog(this, "Ingrese Enfermedad");
                ((Paciente)p).getEnfermedades().add(en);
                op = JOptionPane.showInputDialog(this, "Desea Ingresar Enfermedades?[n/s]");
            }
            op1 = JOptionPane.showInputDialog(this, "Desea Ingresar Alergias?[n/s]");
            while(!op1.equalsIgnoreCase("n")){
                
                al = JOptionPane.showInputDialog(this, "Ingrese Alergias");
                ((Paciente)p).getAlergias().add(al);
                op1 = JOptionPane.showInputDialog(this, "Desea Ingresar Alergias?[n/s]");
            }
            JOptionPane.showMessageDialog(this, "Paciente Creado");
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) jCB_Paciente.getModel();
            modelo.addElement(p);
            jCB_Paciente.setModel(modelo);
            jCB_PA_A.setModel(modelo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jCB_PacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCB_PacienteItemStateChanged
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)jCB_Organos.getModel();
        for (int i = 0; i < ((Paciente)jCB_Paciente.getSelectedItem()).getOrganos().size(); i++) {
            modelo.addElement(((Paciente)jCB_Paciente.getSelectedItem()).getOrganos().get(i));
        }
        jCB_Organos.setModel(modelo);
    }//GEN-LAST:event_jCB_PacienteItemStateChanged

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String op = "";
        ((Paciente)jCB_Paciente.getSelectedItem()).getOrganos().get(jCB_Organos.getSelectedIndex()).setColor(Color_O.getBackground());
        op = JOptionPane.showInputDialog(this, "Desea Ingresar Caracterisicas? [s/n]");
        while (!op.equalsIgnoreCase("n")){
            
            ((Paciente)jCB_Paciente.getSelectedItem()).getOrganos().get(jCB_Organos.getSelectedIndex()).getCaracteristicas().add(JOptionPane.showInputDialog(this, "Ingrese Caracteristica"));
            op = JOptionPane.showInputDialog(this, "Desea Ingresar Caracterisicas? [s/n]");
        }
        
        ((Paciente)jCB_Paciente.getSelectedItem()).getOrganos().get(jCB_Organos.getSelectedIndex()).setNivel_potenciado(Integer.parseInt(jTF_NIPO.getText()));
        ((Paciente)jCB_Paciente.getSelectedItem()).getOrganos().get(jCB_Organos.getSelectedIndex()).setNivel_prueba(Integer.parseInt(jTF_NIPR.getText()));
        JOptionPane.showMessageDialog(this, "Organo Modificado");
    }//GEN-LAST:event_jButton3MouseClicked

    private void Color_OMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Color_OMouseClicked
        Color c = JColorChooser.showDialog(this, "Seleccione un Color", Color.yellow);
        Color_O.setBackground(c);
    }//GEN-LAST:event_Color_OMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        DefaultTreeModel modelo = (DefaultTreeModel)arbolito.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        DefaultMutableTreeNode nodo_doc;
        nodo_doc = new DefaultMutableTreeNode(new Doctor(((Doctor)jCB_Doc.getSelectedItem()).getAnio_doctor(), ((Doctor)jCB_Doc.getSelectedItem()).getHorario_trabajo(), ((Doctor)jCB_Doc.getSelectedItem()).getDias_trabajo(), ((Doctor)jCB_Doc.getSelectedItem()).getNombre(), ((Doctor)jCB_Doc.getSelectedItem()).getEdad(), ((Doctor)jCB_Doc.getSelectedItem()).getID(), ((Doctor)jCB_Doc.getSelectedItem()).getPeso(), ((Doctor)jCB_Doc.getSelectedItem()).getSexo()));
        DefaultMutableTreeNode pac;
        DefaultMutableTreeNode or;
        
        for (int i = 0; i < ((Doctor)jCB_Doc.getSelectedItem()).getPacientes().size(); i++) {
            pac = new DefaultMutableTreeNode(((Doctor)jCB_Doc.getSelectedItem()).getPacientes().get(i));
            for (int j = 0; j < ((Doctor)jCB_Doc.getSelectedItem()).getPacientes().get(i).getOrganos().size(); j++) {
                or = new DefaultMutableTreeNode(((Doctor)jCB_Doc.getSelectedItem()).getPacientes().get(i).getOrganos().get(j));
                pac.add(or);
            }
            nodo_doc.add(pac);
        }
        raiz.add(nodo_doc);
        modelo.reload();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        ((Doctor)jCB_DOC_A.getSelectedItem()).getPacientes().add(((Paciente)jCB_PA_A.getSelectedItem()));
        JOptionPane.showMessageDialog(this, "Paciente Asignado");
        
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        for (int i = 0; i < ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().size(); i++) {
            if (((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(i) instanceof Estomago) {
                AE = new AdmEsto(jPB_E, ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_efectividad(), ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_potenciado());
                try {
                    AE.start();

                } catch (Exception e) {
                }
            }
            if (((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(i) instanceof Higado) {
                AH = new AdmHig(jPB_H, ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_efectividad(), ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_potenciado());
                try {
                    AH.start();

                } catch (Exception e) {
                }
            }
            if (((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(i) instanceof Cerebro) {
                AC = new AdmCer(jPB_CE, ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_efectividad(), ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_potenciado());
                try {
                    AC.start();

                } catch (Exception e) {
                }
            }
            if (((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(i) instanceof Pancreas) {
                AP = new AdmPan(jPB_P, ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_efectividad(), ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_potenciado());
                try {
                    AP.start();

                } catch (Exception e) {
                }
            }
            if (((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(i) instanceof Corazon) {
                ACO = new AdmCor(jPB_CO, ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_efectividad(), ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_potenciado());
                try {
                    ACO.start();

                } catch (Exception e) {
                }
            }
            if (((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(i) instanceof Pulmones) {
                APU = new AdmPul(jPB_PU, ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_efectividad(), ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_potenciado());
                try {
                    APU.start();

                } catch (Exception e) {
                }
            }
            if (((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(i) instanceof Riniones) {
                AR = new AdmRin(jPB_R, ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_efectividad(), ((Paciente) jCB_PA_A.getSelectedItem()).getOrganos().get(0).getNivel_potenciado());
                try {
                    AR.start();

                } catch (Exception e) {
                }
            }
        }


    }//GEN-LAST:event_jButton6MouseClicked

    private void arbolitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolitoMouseClicked
        if (evt.isMetaDown()) {
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
            
        }
    }//GEN-LAST:event_arbolitoMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        DefaultTreeModel modelo = (DefaultTreeModel) arbolito.getModel();
        Object v1 = arbolito.getSelectionPath().getLastPathComponent();
        nodo_seleccionado = (DefaultMutableTreeNode) v1;
        modelo.removeNodeFromParent(nodo_seleccionado);
        modelo.reload();
    }//GEN-LAST:event_EliminarActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_Sexo;
    private javax.swing.JButton Color_O;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JProgressBar JPB_Barra;
    private javax.swing.JTree arbolito;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCB_C;
    private javax.swing.JCheckBox jCB_CO;
    private javax.swing.JComboBox<String> jCB_DOC_A;
    private javax.swing.JComboBox<String> jCB_Doc;
    private javax.swing.JCheckBox jCB_E;
    private javax.swing.JCheckBox jCB_H;
    private javax.swing.JComboBox<String> jCB_Organos;
    private javax.swing.JCheckBox jCB_P;
    private javax.swing.JComboBox<Paciente> jCB_PA_A;
    private javax.swing.JCheckBox jCB_PU;
    private javax.swing.JComboBox<String> jCB_Paciente;
    private javax.swing.JCheckBox jCB_R;
    private javax.swing.JComboBox<String> jCB_Sangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jPB_CE;
    private javax.swing.JProgressBar jPB_CO;
    private javax.swing.JProgressBar jPB_E;
    private javax.swing.JProgressBar jPB_H;
    private javax.swing.JProgressBar jPB_P;
    private javax.swing.JProgressBar jPB_PU;
    private javax.swing.JProgressBar jPB_R;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRB_F;
    private javax.swing.JRadioButton jRB_F1;
    private javax.swing.JRadioButton jRB_J;
    private javax.swing.JRadioButton jRB_L;
    private javax.swing.JRadioButton jRB_M;
    private javax.swing.JRadioButton jRB_M1;
    private javax.swing.JRadioButton jRB_MA;
    private javax.swing.JRadioButton jRB_MI;
    private javax.swing.JRadioButton jRB_V;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTF_Anios;
    private javax.swing.JTextArea jTF_Causa;
    private javax.swing.JTextField jTF_Edad;
    private javax.swing.JTextField jTF_Edad1;
    private javax.swing.JTextField jTF_HA;
    private javax.swing.JTextField jTF_HB;
    private javax.swing.JTextField jTF_ID;
    private javax.swing.JTextField jTF_ID1;
    private javax.swing.JTextField jTF_NIPO;
    private javax.swing.JTextField jTF_NIPR;
    private javax.swing.JTextField jTF_Nombre;
    private javax.swing.JTextField jTF_Nombre1;
    private javax.swing.JTextField jTF_Peso;
    private javax.swing.JTextField jTF_Peso1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    AdmEsto AE;
    AdmHig AH;
    AdmCer AC;
    AdmPan AP;
    AdmCor ACO;
    AdmPul APU;
    AdmRin AR;
    private DefaultMutableTreeNode nodo_seleccionado;
}
