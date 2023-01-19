package odev1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.StreamSupport;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class ImageOpenFrame extends javax.swing.JFrame {
    public int pageNumber = 0;
    public static int pageNumberMax = 5;
    public static int pageNumberMin = 0;
    public static String pageNumberComboBox[][] = {{"GrayLevelImageConversion","Black_WhiteLevelImageConversion","ZoomIn_ZoomOut","CuttingImage"},
                                                   {"GeneratingHistograms","EqualizationHistograms","Quantization"},
                                                   {"GaussianBlurFilter","SharpenFilter","EdgeDetectionFilter","MeanFilter","MedianFilter","ContraHarmonicAverageFilter"},
                                                   {"Black_WhiteLevelImageExpand","Black_WhiteLevelImageErosion","Skeletonization"},
                                                   {".jpg",".bmp",".png"}};
    public String imageName = null;
    public String imagePath = null;
    public File file;
    public BufferedImage imgX = null;
    public int ImageCounter = 0;
    public DefaultTableModel model;
    public int histogramsCount[][] = new int[3][256];
    public int totalCount = 0;
    public int HistogramChannel = 3;
    
    public ImageOpenFrame() {
        initComponents();
        //pageNumber = 2;
        //jRadioButton1.setText("Bruh1");
        //jRadioButton1.setEnabled(true);
        //jRadioButton1.setSelected(true);
        jRadioButton1.setText("");
        jRadioButton2.setText("");
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jComboBox1.setVisible(false);
        ZoomInButton.setVisible(false);
        ZoomOutButton.setVisible(false);
        VariableTextField.setVisible(false);
        MakeTransactionButton.setVisible(false);
        //jFileChooser1.setVisible(false);
        model = (DefaultTableModel) jTable1.getModel();
        jTable1.setModel(model);
        model.setColumnCount(0);
        jScrollPane1.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        furtherButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        ZoomInButton = new javax.swing.JButton();
        ZoomOutButton = new javax.swing.JButton();
        VariableTextField = new javax.swing.JTextField();
        MakeTransactionButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        RedButton = new javax.swing.JButton();
        GreenButton = new javax.swing.JButton();
        BlueButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        scrollPane1 = new java.awt.ScrollPane();
        imageLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Source Serif Pro", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Resim Menüsü");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        backButton.setBackground(new java.awt.Color(153, 153, 255));
        backButton.setFont(new java.awt.Font("Source Serif Pro", 1, 36)); // NOI18N
        backButton.setForeground(new java.awt.Color(102, 102, 255));
        backButton.setText("Geri");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        furtherButton.setBackground(new java.awt.Color(153, 153, 255));
        furtherButton.setFont(new java.awt.Font("Source Serif Pro", 1, 36)); // NOI18N
        furtherButton.setForeground(new java.awt.Color(102, 102, 255));
        furtherButton.setText("İleri");
        furtherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                furtherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(furtherButton, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(furtherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Source Serif Pro", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 255));
        jButton3.setText("Resim Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Text");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Text");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(153, 153, 255));
        jComboBox1.setFont(new java.awt.Font("Source Serif Pro", 1, 36)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(102, 102, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        ZoomInButton.setBackground(new java.awt.Color(153, 153, 255));
        ZoomInButton.setFont(new java.awt.Font("Source Serif Pro", 1, 36)); // NOI18N
        ZoomInButton.setForeground(new java.awt.Color(102, 102, 255));
        ZoomInButton.setText("ZoomIn");
        ZoomInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomInButtonActionPerformed(evt);
            }
        });

        ZoomOutButton.setBackground(new java.awt.Color(153, 153, 255));
        ZoomOutButton.setFont(new java.awt.Font("Source Serif Pro", 1, 36)); // NOI18N
        ZoomOutButton.setForeground(new java.awt.Color(102, 102, 255));
        ZoomOutButton.setText("ZoomOut");
        ZoomOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomOutButtonActionPerformed(evt);
            }
        });

        VariableTextField.setBackground(new java.awt.Color(153, 153, 255));
        VariableTextField.setForeground(new java.awt.Color(102, 102, 255));

        MakeTransactionButton.setBackground(new java.awt.Color(153, 153, 255));
        MakeTransactionButton.setFont(new java.awt.Font("Source Serif Pro", 1, 36)); // NOI18N
        MakeTransactionButton.setForeground(new java.awt.Color(102, 102, 255));
        MakeTransactionButton.setText("Make Transaction");
        MakeTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeTransactionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MakeTransactionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VariableTextField)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(ZoomInButton, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZoomOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZoomOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZoomInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VariableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MakeTransactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        RedButton.setBackground(new java.awt.Color(153, 153, 255));
        RedButton.setForeground(new java.awt.Color(102, 102, 255));
        RedButton.setText("jButton1");
        RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedButtonActionPerformed(evt);
            }
        });

        GreenButton.setBackground(new java.awt.Color(153, 153, 255));
        GreenButton.setForeground(new java.awt.Color(102, 102, 255));
        GreenButton.setText("jButton2");
        GreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenButtonActionPerformed(evt);
            }
        });

        BlueButton.setBackground(new java.awt.Color(153, 153, 255));
        BlueButton.setForeground(new java.awt.Color(102, 102, 255));
        BlueButton.setText("jButton4");
        BlueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RedButton, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GreenButton, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlueButton, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BlueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GreenButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RedButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        imageLabel.setBackground(new java.awt.Color(204, 204, 255));
        scrollPane1.add(imageLabel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setForeground(new java.awt.Color(102, 102, 255));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void progressCase(int pageNum){
        switch(pageNum){
            case 0:{
                jLabel1.setText("Image Menu");
                jButton3.setVisible(true);
                jButton3.setText("Image Add");
                jRadioButton1.setVisible(false);
                jRadioButton2.setVisible(false);
                jComboBox1.setVisible(false);
                VariableTextField.setVisible(false);
                MakeTransactionButton.setVisible(false);
                ZoomInButton.setVisible(false);
                ZoomOutButton.setVisible(false);
                break;
            }
            case 1:{
                jLabel1.setText("Pre-Process1 Menu");
                jRadioButton1.setText("I want to Pre-Process.");
                jRadioButton2.setText("I don't want to Pre-Process.");
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(true);
                jButton3.setVisible(false);
                jRadioButton1.setVisible(true);
                jRadioButton2.setVisible(true);
                jComboBox1.setVisible(true);
                VariableTextField.setVisible(false);
                MakeTransactionButton.setVisible(false);
                jComboBox1.removeAllItems();
                for (int i = 0; pageNumberComboBox[pageNum-1].length > i;i++){
                    jComboBox1.addItem(pageNumberComboBox[pageNum-1][i]);
                }
                ZoomInButton.setVisible(false);
                ZoomOutButton.setVisible(false);
                jComboBox1.setEnabled(false);
                break;
            }
            case 2:{
                jLabel1.setText("Pre-Process2 Menu");
                jRadioButton1.setText("I want to Pre-Process.");
                jRadioButton2.setText("I don't want to Pre-Process.");
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(true);
                VariableTextField.setVisible(false);
                MakeTransactionButton.setVisible(false);
                jComboBox1.removeAllItems();
                for (int i = 0; pageNumberComboBox[pageNum-1].length > i;i++){
                    jComboBox1.addItem(pageNumberComboBox[pageNum-1][i]);
                }
                ZoomInButton.setVisible(false);
                ZoomOutButton.setVisible(false);
                jComboBox1.setEnabled(false);
                break;
            }
            case 3:{
                jLabel1.setText("Filter Menu");
                jRadioButton1.setText("I want to Filter.");
                jRadioButton2.setText("I don't want Filter.");
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(true);
                VariableTextField.setVisible(false);
                MakeTransactionButton.setVisible(false);
                jComboBox1.removeAllItems();
                for (int i = 0; pageNumberComboBox[pageNum-1].length > i;i++){
                    jComboBox1.addItem(pageNumberComboBox[pageNum-1][i]);
                }
                jComboBox1.setEnabled(false);
                break;
            }
            case 4:{
                jLabel1.setText("Morphology Operations Menu");
                jRadioButton1.setText("I want to Morphology Operations.");
                jRadioButton2.setText("I don't want to Morphology Operations.");
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(true);
                jButton3.setVisible(false);
                jRadioButton1.setVisible(true);
                jRadioButton2.setVisible(true);
                jComboBox1.setVisible(true);
                VariableTextField.setVisible(false);
                MakeTransactionButton.setVisible(false);
                jComboBox1.removeAllItems();
                for (int i = 0; pageNumberComboBox[pageNum-1].length > i;i++){
                    jComboBox1.addItem(pageNumberComboBox[pageNum-1][i]);
                }
                jComboBox1.setEnabled(false);
                break;
            }
            case 5:{
                
                jLabel1.setText("Save Menu");
                jButton3.setVisible(true);
                jButton3.setText("Image Save");
                jRadioButton1.setVisible(false);
                jRadioButton2.setVisible(false);
                jComboBox1.setVisible(true);
                VariableTextField.setVisible(false);
                MakeTransactionButton.setVisible(false);
                jComboBox1.removeAllItems();
                for (int i = 0; pageNumberComboBox[pageNum-1].length > i;i++){
                    jComboBox1.addItem(pageNumberComboBox[pageNum-1][i]);
                }
                jComboBox1.setEnabled(true);
                break;
            }
            default:{
                
            }
        }
    }
    
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        furtherButton.setEnabled(true);
        pageNumber--;
        if(pageNumber == 0){
                backButton.setEnabled(false);  
            }
        //imageLabel.setText(Integer.toString(pageNumber));
        ImageIcon img = new ImageIcon(imagePath);
        imageLabel.setIcon((Icon) img);
        progressCase(pageNumber);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
        jComboBox1.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void furtherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_furtherButtonActionPerformed

        backButton.setEnabled(true);
        pageNumber++;
        if(pageNumber == 5){
            furtherButton.setEnabled(false);
        }
        //imageLabel.setText(Integer.toString(pageNumber));
        ImageIcon img = new ImageIcon(imagePath);
        imageLabel.setIcon((Icon) img);
        progressCase(pageNumber);
    }//GEN-LAST:event_furtherButtonActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
        jComboBox1.setEnabled(true);
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //jLabel1.setText(Integer.toString(pageNumber));
        //String Data = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        //jLabel1.setText(Integer.toString(jComboBox1.getSelectedIndex()));
        int width = imgX.getWidth();
        int height = imgX.getHeight();
        int avg = 0;
        int a=255;
        int p = 0;
        if(jRadioButton1.isSelected()){
            switch(pageNumber){
            case 1:{
                
                switch(jComboBox1.getSelectedIndex()){
                    case 0:{
                        VariableTextField.setVisible(false);
                        MakeTransactionButton.setVisible(false);
                        ZoomInButton.setVisible(false);
                        ZoomOutButton.setVisible(false);
                        //gri tona çevirme
                        for(int i = 0; height>i;i++){
                            for(int j = 0; width>j;j++){
                                p = imgX.getRGB(j, i);
                                avg = ((p>>16) & 0xff + (p>>8) & 0xff + p & 0xff)/3;
                                //System.out.println(avg);
                                p = ((p>>24 & 0xff) << 24) | (avg << 16) | (avg << 8) | avg;
                                imgX.setRGB(j, i, p);
                            }
                        }
                        HistogramChannel = 1;
                        break;
                    }
                    case 1:{
                        VariableTextField.setVisible(true);
                        MakeTransactionButton.setVisible(true);
                        ZoomInButton.setVisible(false);
                        ZoomOutButton.setVisible(false);
                        break;
                    }
                    case 2:{
                        VariableTextField.setVisible(false);
                        MakeTransactionButton.setVisible(false);
                        ZoomInButton.setVisible(true);
                        ZoomOutButton.setVisible(true);
                        break;
                    }
                    case 3:{
                        VariableTextField.setVisible(true);
                        MakeTransactionButton.setVisible(true);
                        ZoomInButton.setVisible(false);
                        ZoomOutButton.setVisible(false);
                        break;
                    }
                }
                break;
            }
            case 2:{
                jPanel7.setVisible(true);
                switch(jComboBox1.getSelectedIndex()){
                    case 0:{
                        VariableTextField.setVisible(false);
                        MakeTransactionButton.setVisible(false);
                        jScrollPane1.setVisible(true);
                        jPanel6.setVisible(true);
                        switch(HistogramChannel){
                            case 1:{
                                RedButton.setVisible(false);
                                GreenButton.setVisible(true);
                                GreenButton.setText("Show Gray xor White-Black Histogram");
                                BlueButton.setVisible(false);
                                break;
                            }
                            case 3:{
                                RedButton.setVisible(true);
                                RedButton.setText("Show Red Histogram");
                                GreenButton.setVisible(true);
                                GreenButton.setText("Show Green Histogram");
                                BlueButton.setVisible(true);
                                BlueButton.setText("Show Blue Histogram");
                                break;
                            }
                        }
                        break;
                    }
                    case 1:{
                        VariableTextField.setVisible(false);
                        MakeTransactionButton.setVisible(false);
                        jScrollPane1.setVisible(true);
                        jPanel6.setVisible(true);
                        RedButton.setVisible(false);
                        GreenButton.setVisible(true);
                        GreenButton.setText("Show Gray xor White-Black Histogram");
                        BlueButton.setVisible(false);
                        break;
                    }
                    case 2:{
                        VariableTextField.setVisible(true);
                        MakeTransactionButton.setVisible(true);                        
                        jScrollPane1.setVisible(true);
                        jPanel6.setVisible(true);
                        break;
                    }
                }
                break;
            }
            case 3:{
                jPanel6.setVisible(false);
                jPanel7.setVisible(false);
                
                switch(jComboBox1.getSelectedIndex()){
                    case 0:{
                        VariableTextField.setVisible(true);
                        MakeTransactionButton.setVisible(true);
                        break;
                    }
                    case 1:{
                        VariableTextField.setVisible(false);
                        MakeTransactionButton.setVisible(false);
                        int widthOutput = width +2;
                        int heightOutput = height +2;
                        BufferedImage output = new BufferedImage(widthOutput, heightOutput,BufferedImage.TYPE_INT_RGB);
                        for(int i = 0; i < heightOutput;i++){
                            for(int j = 0; j < widthOutput;j++ ){
                                if(i == 0 || i == heightOutput-1 || j == 0 || j == widthOutput-1){
                                    output.setRGB(j, i, 0);
                                }else{
                                    int CoorX = j-1;
                                    int CoorY = i-1;
                                    output.setRGB(j,i,imgX.getRGB(CoorX, CoorY));
                                }
                            }
                        }
                        
                        int avg2[] = new int[3];
                        for(int i = 1; i < heightOutput-1;i++){
                            for(int j = 1; j < widthOutput-1;j++ ){
                                int CoorX = j ,CoorY = i;
                                avg2[0] = 0; avg2[1] = 0; avg2[2]=0;
                                for(int k = 0 ; k < 9 ; k++){
                                    CoorX = j + (k%3 -1);
                                    CoorY = i + (k/3 -1);
                                    p = output.getRGB(CoorX, CoorY);
                                    if((k%3 == 1) && ((int)k/3 == 1)){
                                        avg2[0] -= (8*((p>>16) & 0xff));//Red
                                        avg2[1] -= (8*((p>>8) & 0xff));//Green
                                        avg2[2] -= (8*((p) & 0xff));//Blue
                                    }else{
                                        avg2[0] += ((p>>16) & 0xff);//Red
                                        avg2[1] += ((p>>8) & 0xff);//Green
                                        avg2[2] += ((p) & 0xff);//Blue
                                    }
                                }
                                if(avg2[0]<0){
                                    avg2[0] = 0;
                                }
                                if(avg2[1]<0){
                                    avg2[1] = 0;
                                }
                                if(avg2[2]<0){
                                    avg2[2] = 0;
                                }
                                if(avg2[0]>255){
                                    avg2[0] = 255;
                                }
                                if(avg2[1]>255){
                                    avg2[1] = 255;
                                }
                                if(avg2[2]>255){
                                    avg2[2] = 255;
                                }
                                p = ((p>>24 & 0xff) << 24) | (avg2[0]<<16) | avg2[1]<<8 | avg2[2];
                                CoorX = j-1;
                                CoorY = i-1;
                                imgX.setRGB(CoorX, CoorY, p);
                            }
                        }
                        break;
                    }
                    case 2:{
                        VariableTextField.setVisible(false);
                        MakeTransactionButton.setVisible(false);
                        break;
                    }
                    case 3:{
                        VariableTextField.setVisible(false);
                        MakeTransactionButton.setVisible(false);
                        int widthOutput = width +2;
                        int heightOutput = height +2;
                        BufferedImage output = new BufferedImage(widthOutput, heightOutput,BufferedImage.TYPE_INT_RGB);
                        for(int i = 0; i < heightOutput;i++){
                            for(int j = 0; j < widthOutput;j++ ){
                                if(i == 0 || i == heightOutput-1 || j == 0 || j == widthOutput-1){
                                    output.setRGB(j, i, 0);
                                }else{
                                    int CoorX = j-1;
                                    int CoorY = i-1;
                                    output.setRGB(j,i,imgX.getRGB(CoorX, CoorY));
                                }
                            }
                        }
                        int avg2[] = new int[3];
                        for(int i = 1; i < heightOutput-1;i++){
                            for(int j = 1; j < widthOutput-1;j++ ){
                                int CoorX = j ,CoorY = i;
                                avg2[0] = 0; avg2[1] = 0; avg2[2]=0;
                                for(int k = 0 ; k < 9 ; k++){
                                    CoorX = j + (k%3 -1);
                                    CoorY = i + (k/3 -1);
                                    p = output.getRGB(CoorX, CoorY);
                                    avg2[0] += ((p>>16) & 0xff);//Red
                                    avg2[1] += ((p>>8) & 0xff);//Green
                                    avg2[2] += ((p) & 0xff);//Blue
                                }
                                avg2[0] /= 9;
                                avg2[1] /= 9;
                                avg2[2] /= 9;
                                CoorX = j-1;
                                CoorY = i-1;
                                p = ((p>>24 & 0xff) << 24) | (avg2[0]<<16) | avg2[1]<<8 | avg2[2];
                                imgX.setRGB(CoorX, CoorY, p);
                            }
                        }
                        break;
                    }
                    case 4:{
                        VariableTextField.setVisible(false);
                        MakeTransactionButton.setVisible(false);
                        int widthOutput = width +2;
                        int heightOutput = height +2;
                        BufferedImage output = new BufferedImage(widthOutput, heightOutput,BufferedImage.TYPE_INT_RGB);
                        for(int i = 0; i < heightOutput;i++){
                            for(int j = 0; j < widthOutput;j++ ){
                                if(i == 0 || i == heightOutput-1 || j == 0 || j == widthOutput-1){
                                    output.setRGB(j, i, 0);
                                }else{
                                    int CoorX = j-1;
                                    int CoorY = i-1;
                                    output.setRGB(j,i,imgX.getRGB(CoorX, CoorY));
                                }
                            }
                        }
                        int avg2[][] = new int[3][9];
                        for(int i = 1; i < heightOutput-1;i++){
                            for(int j = 1; j < widthOutput-1;j++ ){
                                int CoorX = j ,CoorY = i;
                                for(int k = 0 ; k < 9 ; k++){
                                    CoorX = j + (k%3 -1);
                                    CoorY = i + (k/3 -1);
                                    p = output.getRGB(CoorX, CoorY);
                                    avg2[0][k] = ((p>>16) & 0xff);//Red
                                    avg2[1][k] = ((p>>8) & 0xff);//Green
                                    avg2[2][k] = ((p) & 0xff);//Blue
                                }
                                CoorX = j-1;
                                CoorY = i-1;
                                for(int k = 0 ; k <3 ;k++){
                                    for (int l = 0; l < avg2[k].length; l++){  
                                    int index = l;  
                                    for (int m = l + 1; m < avg2[k].length; m++){  
                                        if (avg2[k][m] < avg2[k][index]){  
                                            index = m;//searching for lowest index  
                                        }  
                                    }  
                                    int smallerNumber = avg2[k][index];   
                                    avg2[k][index] = avg2[k][l];  
                                    avg2[k][l] = smallerNumber;  
                                }
                                }  
                                p = ((p>>24 & 0xff) << 24) | (avg2[0][5]<<16) | avg2[1][5]<<8 | avg2[2][5];
                                imgX.setRGB(CoorX, CoorY, p);
                            }
                        }
                        break;
                    }
                    case 5:{
                        VariableTextField.setVisible(true);
                        MakeTransactionButton.setVisible(true);
                        break;
                    }
                }
                break;
            }
            case 4:{
                switch(jComboBox1.getSelectedIndex()){
                    case 0:{
                        VariableTextField.setVisible(false);
                        MakeTransactionButton.setVisible(false);
                        break;
                    }
                    case 1:{
                        VariableTextField.setVisible(false);
                        MakeTransactionButton.setVisible(false);
                        break;
                    }
                    case 2:{
                        VariableTextField.setVisible(false);
                        MakeTransactionButton.setVisible(false);
                        break;
                    }
                }
                break;
            }
            default:{
                
                break;
            }
        }
            if(!(pageNumber ==1 && jComboBox1.getSelectedIndex()==1)){
                ImageCounter++;
                Path path = Paths.get(imagePath);
                String x[];
                x = StreamSupport.stream(path.spliterator(), false).map(Path::toString).toArray(String[]::new);
                System.out.println(Arrays.toString(x));
                String newFilePath = "C:";
                for(int i = 0;i < x.length-1;i++){
                    newFilePath += "\\";
                    newFilePath += x[i];
                }
                newFilePath += "\\";
                newFilePath += "New"+imageName+Integer.toString(ImageCounter);
                System.out.println(newFilePath);
                newFilePath += ".png";
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println(newFilePath);
                try {
                    File f = new File(newFilePath);
                    ImageIO.write(imgX, "png", f);
                }
                catch (IOException e) {
                    System.out.println(e);
                }
        ImageIcon img = new ImageIcon(newFilePath);
        imageLabel.setIcon((Icon) img);
        imagePath = newFilePath;
            }
        
        }
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        switch(pageNumber){
            case 0:{
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                file = chooser.getSelectedFile();
                imagePath = file.getAbsolutePath();
                System.out.println(imagePath);
                ImageIcon img = new ImageIcon(imagePath);
                try {
                    imgX = ImageIO.read(file);
                } catch (IOException ex) {
                    Logger.getLogger(ImageOpenFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                imageLabel.setIcon((Icon) img);
                Path path = Paths.get(imagePath);
                String x[];
                x = StreamSupport.stream(path.spliterator(), false).map(Path::toString).toArray(String[]::new);
                System.out.println(Arrays.toString(x));
                String imageNames[] = x[x.length-1].split("\\.");
                imageName = imageNames[0];
                System.out.println(imageName);
                break;
            }

            case 5:{
                Path path = Paths.get(imagePath);
                String x[];
                x = StreamSupport.stream(path.spliterator(), false).map(Path::toString).toArray(String[]::new);
                System.out.println(Arrays.toString(x));
                String newFilePath = "C:";
                for(int i = 0;i < x.length-1;i++){
                    newFilePath += "\\";
                    newFilePath += x[i];
                }
                newFilePath += "\\";
                newFilePath += "New"+imageName;
                System.out.println(newFilePath);
                newFilePath += jComboBox1.getSelectedItem();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println(newFilePath);
                try {
                    File f = new File(newFilePath);
                    String url = null;
                    switch(jComboBox1.getSelectedIndex()){
                        case 0:{
                            url = "jpg";
                            break;
                        }
                        case 1:{
                            url = "bmp";        
                            break;
                        }
                        case 2:{
                            url = "png";
                            break;
                        }
                    }
                    ImageIO.write(imgX, url, f);
                }
                catch (IOException e) {
                    System.out.println(e);
                }
                break;
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void MakeTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeTransactionButtonActionPerformed
        boolean control = false;
        
        int width = imgX.getWidth();
        int height = imgX.getHeight();
        int avg = 0;
        int a=255;
        int p = 0;
        switch(pageNumber){
            case 1:{
                switch(jComboBox1.getSelectedIndex()){
                    case 1:{
                        control = true;
                        int esikDeger = Integer.parseInt(VariableTextField.getText());
                        for(int i = 0; height>i;i++){
                            for(int j = 0; width>j;j++){
                                p = imgX.getRGB(j, i);
                                int pX = (p>>16) & 0xff;
                                if(pX < esikDeger){
                                    p = ((255 & 0xff) << 24) | ((0 & 0xff) << 16) | ((0 & 0xff) << 8) | (0 & 0xff);
                                }else{
                                    p = (255 << 24) | (255 << 16) | (255 << 8) | 255;
                                }
                                imgX.setRGB(j, i, p);
                            }
                        }
                        HistogramChannel = 1;
                        break;
                    }
                    case 3:{
                        //data bilgisi width,height,coorX,coorY şeklinde girilmeli
                        String data = VariableTextField.getText();
                        String dataArray[] = data.split(",");
                        int dataIntArray[] = new int[dataArray.length];
                        for(int i = 0;i<dataArray.length;i++){
                            dataIntArray[i] = Integer.parseInt(dataArray[i]);
                        }
                        BufferedImage output = new BufferedImage(dataIntArray[0], dataIntArray[1],BufferedImage.TYPE_INT_RGB);
                        for(int i = 0; dataIntArray[1]>i;i++){
                            for(int j = 0; dataIntArray[0]>j;j++){
                                p = imgX.getRGB(dataIntArray[2]+j, dataIntArray[3]+i);
                                output.setRGB(j, i, p);
                            }
                        }
                        imgX = output;
                        control = true;
                        break;
                    }
                }
                break;
            }
            case 3:{
                
                switch(jComboBox1.getSelectedIndex()){
                    case 0:{
                        control = true;
                        double alpha = Double.parseDouble(VariableTextField.getText());
                        height = imgX.getHeight();
                        width = imgX.getWidth();
                        double AVGOrt[] = new double[3];
                        for(int i = 0; i < height;i++){
                            for(int j = 0; j < width;j++ ){
                                p = imgX.getRGB(j, i);
                                    AVGOrt[0] += ((p>>16) & 0xff);//Red
                                    AVGOrt[1] += ((p>>8) & 0xff);//Green
                                    AVGOrt[2] += ((p) & 0xff);//Blue
                            }
                        }
                        AVGOrt[0] /= (height*width);//Red
                        AVGOrt[1] /= (height*width);//Green
                        AVGOrt[2] /= (height*width);//Blue
                        int avg2[] = new int[3];
                        double avg3[][] = new double[3][2];
                        int avg4[] = new int[3];
                        for(int i = 0; i < height;i++){
                            for(int j = 0; j < width;j++ ){
                                    p = imgX.getRGB(j, i);
                                    avg2[0] = ((p>>16) & 0xff);//Red
                                    avg2[1] = ((p>>8) & 0xff);//Green
                                    avg2[2] = ((p) & 0xff);//Blue
                                    
                                    avg3[0][0] = Math.sqrt(Math.PI*2*alpha);
                                    avg3[1][0] = Math.sqrt(Math.PI*2*alpha);
                                    avg3[2][0] = Math.sqrt(Math.PI*2*alpha);
                                    
                                    avg3[0][1] = Math.pow(Math.E, -1*(Math.pow((avg2[0] - AVGOrt[0]), 2)/(2*Math.pow(alpha, 2))));
                                    avg3[1][1] = Math.pow(Math.E, -1*(Math.pow((avg2[1] - AVGOrt[1]), 2)/(2*Math.pow(alpha, 2))));
                                    avg3[2][1] = Math.pow(Math.E, -1*(Math.pow((avg2[2] - AVGOrt[2]), 2)/(2*Math.pow(alpha, 2))));
                                    
                                    avg4[0] = (int) (avg3[0][0] / avg3[0][1]);
                                    avg4[1] = (int) (avg3[1][0] / avg3[1][1]);
                                    avg4[2] = (int) (avg3[2][0] / avg3[2][1]);
                                    if(avg4[0]<0){
                                    avg4[0] = 0;
                                    }
                                    if(avg4[1]<0){
                                        avg4[1] = 0;
                                    }
                                    if(avg4[2]<0){
                                        avg4[2] = 0;
                                    }
                                    if(avg4[0]>255){
                                        avg4[0] = 255;
                                    }
                                    if(avg4[1]>255){
                                        avg4[1] = 255;
                                    }
                                    if(avg4[2]>255){
                                        avg4[2] = 255;
                                    }
                                    p = (((p >> 24) & 0xff)<< 24) | (avg4[0]<<16) | avg4[1]<<8 | avg4[2];
                                    imgX.setRGB(j, i, p);
                                }
                                
                            }
                        break;
                    }
                    case 5:{
                        control = true;
                        double ustelDeger = Double.parseDouble(VariableTextField.getText());
                        double ustelDeger1 = ustelDeger +1 ;
                        int widthOutput = width +2;
                        int heightOutput = height +2;
                        BufferedImage output = new BufferedImage(widthOutput, heightOutput,BufferedImage.TYPE_INT_RGB);
                        for(int i = 0; i < heightOutput;i++){
                            for(int j = 0; j < widthOutput;j++ ){
                                if(i == 0 || i == heightOutput-1 || j == 0 || j == widthOutput-1){
                                    output.setRGB(j, i, 0);
                                }else{
                                    int CoorX = j-1;
                                    int CoorY = i-1;
                                    output.setRGB(j,i,imgX.getRGB(CoorX, CoorY));
                                }
                            }
                        }
                        int avg2[][] = new int[3][9];
                        double avg3[][] = new double[3][2];
                        int avg4[] = new int[3];
                        for(int i = 1; i < heightOutput-1;i++){
                            for(int j = 1; j < widthOutput-1;j++ ){
                                int CoorX = j ,CoorY = i;
                                avg3[0][0] = 0; avg3[1][0] = 0; avg3[2][0] = 0;
                                avg3[0][1] = 0; avg3[1][1] = 0; avg3[2][1] = 0;        
                                for(int k = 0 ; k < 9 ; k++){
                                    CoorX = j + (k%3 -1);
                                    CoorY = i + (k/3 -1);
                                    p = output.getRGB(CoorX, CoorY);
                                    avg2[0][k] = ((p>>16) & 0xff);//Red
                                    avg2[1][k] = ((p>>8) & 0xff);//Green
                                    avg2[2][k] = ((p) & 0xff);//Blue
                                    
                                    avg3[0][0] += Math.pow(avg2[0][k],(double)(ustelDeger1));
                                    avg3[1][0] += Math.pow(avg2[1][k],(double)(ustelDeger1));
                                    avg3[2][0] += Math.pow(avg2[2][k],(double)(ustelDeger1));
                                    
                                    avg3[0][1] += Math.pow(avg2[0][k],(double)(ustelDeger));
                                    avg3[1][1] += Math.pow(avg2[1][k],(double)(ustelDeger));
                                    avg3[2][1] += Math.pow(avg2[2][k],(double)(ustelDeger));
                                }
                                avg4[0] = (int) (avg3[0][0]/avg3[0][1]);
                                avg4[1] = (int) (avg3[1][0]/avg3[1][1]);
                                avg4[2] = (int) (avg3[2][0]/avg3[2][1]);
                                CoorX = j-1;
                                CoorY = i-1;
                                System.out.println("Avg4[0]" + avg4[0] + "Avg4[1]:" + avg4[1] + "Avg4[2]:" + avg4[2]);
                                System.out.println(p);
                                p = (((p >> 24) & 0xff)<< 24) | (avg4[0]<<16) | avg4[1]<<8 | avg4[2];
                                imgX.setRGB(CoorX, CoorY, p);
                            }
                        }
                        break;
                    }
                }
                break;
            }
            case 4:{
                switch(jComboBox1.getSelectedIndex()){
                    case 0:{
                        break;
                    }
                    case 1:{
                        break;
                    }
                    case 2:{
                        break;
                    }
                }
                break;
            }
        }
        if(control){
            ImageCounter++;
            Path path = Paths.get(imagePath);
            String x[];
            x = StreamSupport.stream(path.spliterator(), false).map(Path::toString).toArray(String[]::new);
            System.out.println(Arrays.toString(x));
            String newFilePath = "C:";
            for(int i = 0;i < x.length-1;i++){
                newFilePath += "\\";
                newFilePath += x[i];
            }
            newFilePath += "\\";
            newFilePath += "New"+imageName+Integer.toString(ImageCounter);
            System.out.println(newFilePath);
            newFilePath += ".png";
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println(newFilePath);
            try {
                File f = new File(newFilePath);
                ImageIO.write(imgX, "png", f);
            }
            catch (IOException e) {
                System.out.println(e);
            }
            ImageIcon img = new ImageIcon(newFilePath);
            imageLabel.setIcon((Icon) img);
            imagePath = newFilePath;
        }
        
    }//GEN-LAST:event_MakeTransactionButtonActionPerformed

    private void ZoomInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomInButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZoomInButtonActionPerformed

    private void ZoomOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomOutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZoomOutButtonActionPerformed

    private void RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedButtonActionPerformed
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Red");
        model.addColumn("HistogramsCount");
        int width = imgX.getWidth();
        int height = imgX.getHeight();
        int p;
        for(int l  = 0;l < 256;l++){
            histogramsCount[0][l] = 0;
        }     
        for(int i = 0; height>i;i++){
            for(int j = 0; width>j;j++){
                p = imgX.getRGB(j, i);
                histogramsCount[0][(p>>16) & 0xff ] +=1;//red
                totalCount++;
            }
        }
        for(int i = 0; i<histogramsCount[0].length ;i++){
            model.addRow(new Object[]{i,histogramsCount[0][i]});
            System.out.println(histogramsCount[0][i]);
        }
    }//GEN-LAST:event_RedButtonActionPerformed

    private void GreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenButtonActionPerformed
        model.setColumnCount(0);
        model.setRowCount(0);
        switch(jComboBox1.getSelectedIndex()){
                case 0:{
                    switch(HistogramChannel){
                        case 1:{
                            model.addColumn("Gray xor White-Black");
                            break;
                        }
                        case 3:{
                            model.addColumn("Green");
                            break;
                        }
                    }
                    model.addColumn("HistogramsCount");
                    int width = imgX.getWidth();
                    int height = imgX.getHeight();
                    int p;
                    for(int l  = 0;l < 256;l++){
                        histogramsCount[1][l] = 0;
                    }     
                    for(int i = 0; height>i;i++){
                        for(int j = 0; width>j;j++){
                            p = imgX.getRGB(j, i);
                            histogramsCount[1][(p>>8) & 0xff ] +=1;//green (gri ve siyahBeyaz resimler de 32 bit olarak pikselleri saklanıyor.)
                            totalCount++;
                        }
                    }
                    for(int i = 0; i<histogramsCount[1].length ;i++){
                        model.addRow(new Object[]{i,histogramsCount[1][i]});
                    }
                break;
            }
                case 1:{
                    model.addColumn("Gray xor White-Black");
                    model.addColumn("HistogramsCount");
                    model.addColumn("CumulativeCount");
                    model.addColumn("CumulativePosibility");
                    model.addColumn("New Gray xor White-Black");
                    model.addColumn("Value Rounding");
                    model.addColumn("New HistogramsCount");
                    model.addColumn("New HistogramsPosibility");
                    double cumulativeCount[][] = new double[3][256];
                    int numberRouding[] = new int[256];
                        for(int k = 0; 3 > k;k++)
                            for(int l  = 0;l < 256;l++){
                                cumulativeCount[k][l] = 0;
                            }     
                        for(int i = 0; 256 > i; i++){
                            for(int j = 0;j <= i ; j++){
                                cumulativeCount[0][i] += histogramsCount[1][j];
                            }
                            cumulativeCount[1][i]  = cumulativeCount[0][i]/ totalCount;
                            cumulativeCount[2][i] = cumulativeCount[1][i] * 255;
                            numberRouding[i] = (int) cumulativeCount[2][i];
                            if(cumulativeCount[2][i] - numberRouding[i] >= 0.5){
                                numberRouding[i] = (int) Math.ceil(cumulativeCount[2][i]);
                            }else{
                                numberRouding[i] = (int) Math.floor(cumulativeCount[2][i]);
                            }

                        }
                    int cumulativeCounts[] = new int[256];
                    int cumulativesCounterIndex = 0;
                    int newCumulativeCount[] = new int[256];
                    int totalCumulativesCounter = 0;
                    double newCumulativeCounters[] = new double[256];
                    for( int i = 0;i < 256;i++){
                        for(int j = 0; j < 256 ; j++){
                            if(numberRouding[j] ==i){
                                cumulativesCounterIndex ++;
                            }
                        }
                        cumulativeCounts[i] = cumulativesCounterIndex;
                        for(int l = 0; l < cumulativeCounts[i];l++){
                            newCumulativeCount[i] += histogramsCount[1][totalCumulativesCounter+l];
                        }
                        totalCumulativesCounter +=  cumulativesCounterIndex;
                        cumulativesCounterIndex = 0;
                        newCumulativeCounters[i] = (double)newCumulativeCount[i]/totalCount;
                    }
                    
                    
                    for(int i = 0; i<histogramsCount[1].length ;i++){
                        model.addRow(new Object[]{i,
                                                  cumulativeCount[0][i],
                                                  cumulativeCount[1][i],
                                                  cumulativeCount[2][i],
                                                  numberRouding[i],
                                                  cumulativeCounts[i],
                                                  newCumulativeCount[i],
                                                  newCumulativeCounters[i]});
                    }
                    
                    break;
                }
            
        }
        
    }//GEN-LAST:event_GreenButtonActionPerformed

    private void BlueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueButtonActionPerformed
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Blue");
        model.addColumn("HistogramsCount");
        int width = imgX.getWidth();
        int height = imgX.getHeight();
        int p;
        for(int l  = 0;l < 256;l++){
            histogramsCount[2][l] = 0;
        }     
        for(int i = 0; height>i;i++){
            for(int j = 0; width>j;j++){
                p = imgX.getRGB(j, i);
                histogramsCount[2][(p) & 0xff ] +=1;//blue
                totalCount++;
            }
        }
        for(int i = 0; i<histogramsCount[2].length ;i++){
            model.addRow(new Object[]{i,histogramsCount[2][i]});
            System.out.println(histogramsCount[2][i]);
        }
    }//GEN-LAST:event_BlueButtonActionPerformed

    
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageOpenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ImageOpenFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BlueButton;
    private javax.swing.JButton GreenButton;
    private javax.swing.JButton MakeTransactionButton;
    private javax.swing.JButton RedButton;
    private javax.swing.JTextField VariableTextField;
    private javax.swing.JButton ZoomInButton;
    private javax.swing.JButton ZoomOutButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton furtherButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
