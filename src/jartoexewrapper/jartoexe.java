/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jartoexewrapper;

import java.awt.HeadlessException;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
/**
 *
 * @author Herat Afghan Asia
 */
public class jartoexe extends javax.swing.JFrame {

    String jarDirectory, jarName;
    /**
     * Creates new form frame1
     */
    public jartoexe() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtVendorName = new javax.swing.JTextField();
        txticonPath = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSelectIconPath = new javax.swing.JButton();
        txtAppVersion = new javax.swing.JTextField();
        txtOutPut = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAppName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        rbtEXE = new javax.swing.JRadioButton();
        rbtMSI = new javax.swing.JRadioButton();
        btnWarp = new javax.swing.JButton();
        Progressbar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaOutputResult = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtJarFile = new javax.swing.JTextField();
        btnJarFile = new javax.swing.JButton();
        btnBrowseOutput = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 585));
        setPreferredSize(new java.awt.Dimension(550, 585));
        setResizable(false);

        txtVendorName.setToolTipText("the owner name company or publisher");

        txticonPath.setToolTipText("the icon for your application with .ico extension");

        jLabel5.setText("Company (Publisher) Name");

        btnSelectIconPath.setText("Select");
        btnSelectIconPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectIconPathActionPerformed(evt);
            }
        });

        txtAppVersion.setToolTipText("application version example (1.0.0 or 1.2.4)");

        txtOutPut.setToolTipText("the folder or path that you want to save your converted file");

        jLabel6.setText("Application Version (Ex: 1.0.0)");

        jLabel7.setText("Application Output Name");

        txtAppName.setToolTipText("the name of your software");

        jLabel2.setText("Icon Path .ico");

        jLabel8.setText("This Application Requiered Wix3 if you don't install it on your system please download and install it");

        jLabel3.setText("Output exe File *");

        jLabel9.setText("From:  ");

        jLabel4.setText("Application Type *");

        jTextField7.setEditable(false);
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText("https://github.com/wixtoolset/wix3/releases/download/wix3141rtm/wix314.exe");
        jTextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        buttonGroup1.add(rbtEXE);
        rbtEXE.setText("EXE");

        buttonGroup1.add(rbtMSI);
        rbtMSI.setText("MSI");

        btnWarp.setText("Convert");
        btnWarp.setToolTipText("Press to Convert");
        btnWarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarpActionPerformed(evt);
            }
        });

        txtAreaOutputResult.setEditable(false);
        txtAreaOutputResult.setColumns(20);
        txtAreaOutputResult.setRows(5);
        txtAreaOutputResult.setToolTipText("Converting Result");
        jScrollPane1.setViewportView(txtAreaOutputResult);

        jLabel11.setText("Jar File *");

        txtJarFile.setToolTipText("the JAR File that you want to Convert");

        btnJarFile.setText("Select");
        btnJarFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJarFileActionPerformed(evt);
            }
        });

        btnBrowseOutput.setText("Browse");
        btnBrowseOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtJarFile, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnJarFile, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txticonPath, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnSelectIconPath, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtOutPut, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnBrowseOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(rbtEXE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbtMSI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtAppVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtVendorName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnWarp, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJarFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJarFile))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txticonPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectIconPath))
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOutPut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowseOutput))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(rbtEXE)
                    .addComponent(rbtMSI))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(txtAppVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addComponent(txtAppName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(txtVendorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnWarp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9))
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnWarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarpActionPerformed
        String inputJarFile = jarDirectory;
        String iconPath = txticonPath.getText();
        String outputFile = txtOutPut.getText();
        String appName = txtAppName.getText();
        String appVersion = txtAppVersion.getText();
        String vendorName = txtVendorName.getText();
        String jarFile = jarName;
        String appType = rbtEXE.isSelected() ? "exe" : "msi";

        // Construct the jpackage command
        String command = String.format(
                "jpackage --name %s --input \"%s\" --main-jar %s --type %s --icon \"%s\" --app-version %s --dest \"%s\" --vendor \"%s\" --win-shortcut --win-dir-chooser",
                appName, inputJarFile, jarFile,  appType, iconPath, appVersion, outputFile, vendorName
        );
        System.out.println(command);

        // Use SwingWorker to run the command and update UI
        new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                Process process = Runtime.getRuntime().exec(command);

                // Readers to capture output and errors from the process
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));

                String line;
                int progress = 0;

                // Initially set progress to 0
                setProgress(progress);
                publish("Starting...");

                while ((line = reader.readLine()) != null || (line = errorReader.readLine()) != null) {
                    publish(line);  // Send real-time output to txtAreaOutputResult

                    // Update progress based on output or time intervals
                    if (line.contains("compiling") && progress < 25) {
                        progress = 25;
                        publish("Compiling... 25%");
                        setProgress(progress);
                    } else if (line.contains("integrating") && progress < 50) {
                        progress = 50;
                        publish("Integrating JRE... 50%");
                        setProgress(progress);
                    } else if (line.contains("making exe") && progress < 75) {
                        progress = 75;
                        publish("Making EXE... 75%");
                        setProgress(progress);
                    }
                }

                process.waitFor();
                return null;
            }

            @Override
            protected void process(List<String> chunks) {
                for (String line : chunks) {
                    txtAreaOutputResult.append(line + "\n");

                    // Update the progress bar based on the progress
                    if (line.contains("Compiling... 25%")) {
                        Progressbar.setValue(25);
                    } else if (line.contains("Integrating JRE... 50%")) {
                        Progressbar.setValue(50);
                    } else if (line.contains("Making EXE... 75%")) {
                        Progressbar.setValue(75);
                    } else if (line.contains("Completed! 100%")) {
                        Progressbar.setValue(100);
                    }
                }
            }

            @Override
            protected void done() {
                try {
                    get();  // Ensure any exceptions are propagated
                    publish("Completed! 100%");
                    Progressbar.setValue(100);  // Set progress bar to 100% upon completion
                    JOptionPane.showMessageDialog(null,"Converted successfully!","Result",JOptionPane.INFORMATION_MESSAGE);
                } catch (HeadlessException | InterruptedException | ExecutionException e) {
                    txtAreaOutputResult.append("An error occurred during packaging: " + e.getMessage()+" \nJava Version 14 or later is not installed on your system");
                }
            }
        }.execute();
    }//GEN-LAST:event_btnWarpActionPerformed

    private void btnSelectIconPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectIconPathActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Icon File");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        // Set file filter for .ico files
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory() || f.getName().toLowerCase().endsWith(".ico");
            }

            @Override
            public String getDescription() {
                return "Icon Files (*.ico)";
            }
        });

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            txticonPath.setText(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_btnSelectIconPathActionPerformed

    private void btnJarFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJarFileActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select JAR File");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);  // Only JAR files allowed

        // Optionally, filter only JAR files
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory() || f.getName().toLowerCase().endsWith(".jar");
            }

            @Override
            public String getDescription() {
                return "JAR Files (*.jar)";
            }
        });

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            txtJarFile.setText(selectedFile.getAbsolutePath());  // Set the JAR file name in txtJarFile
            jarDirectory = selectedFile.getParent();
            jarName = selectedFile.getName();
        }
    }//GEN-LAST:event_btnJarFileActionPerformed

    private void btnBrowseOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseOutputActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Output Directory");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedDirectory = fileChooser.getSelectedFile();
            txtOutPut.setText(selectedDirectory.getAbsolutePath());
        }
    }//GEN-LAST:event_btnBrowseOutputActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jartoexe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jartoexe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jartoexe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jartoexe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jartoexe().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progressbar;
    private javax.swing.JButton btnBrowseOutput;
    private javax.swing.JButton btnJarFile;
    private javax.swing.JButton btnSelectIconPath;
    private javax.swing.JButton btnWarp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JRadioButton rbtEXE;
    private javax.swing.JRadioButton rbtMSI;
    private javax.swing.JTextField txtAppName;
    private javax.swing.JTextField txtAppVersion;
    private javax.swing.JTextArea txtAreaOutputResult;
    private javax.swing.JTextField txtJarFile;
    private javax.swing.JTextField txtOutPut;
    private javax.swing.JTextField txtVendorName;
    private javax.swing.JTextField txticonPath;
    // End of variables declaration//GEN-END:variables
}
