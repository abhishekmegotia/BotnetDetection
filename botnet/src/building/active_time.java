package building;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class active_time extends javax.swing.JFrame {

    public Connection con;
    public ResultSet rs1,rs2,rs3,rs4,rs5,rs6,rs7,rs8,rs9,rs10;
    public Statement st;String s;
    public static String ditem, proto="acd";
    public static double tr=0.0;
     public static double tt=first.tt;
      public static String sitem=first.sitem;
      public static double initialtime1=first.initialtime;
    public static double initialtime = 0.0, receivetime;
    public static double time=0,timeinminutes;
    public static ArrayList<Integer> r = new ArrayList();
    public static File fileToOpen = first.f;
    int size = 32768, repeat = 1000;
    byte[] buff;
    Integer sum = 0;
 public static ArrayList<String> p2p = new ArrayList();
    public static String[] ar;
    public active_time() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/p2p", "root", "");
                        st = con.createStatement();
            
            System.out.println("connected to database");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                Packet Transmission Process");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 630, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Active_Time Evaluation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monotype Corsiva", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setOpaque(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Packet Format");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 330, 750, 200);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peer Response  Evaluation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Send Packet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(370, 130, 190, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("Form clusters");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(370, 230, 190, 30);

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jList1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "147.142.15.12", "157.156.37.18", "211.114.23.14", "82.221.129.17", "138.111.14.2", "58.26.185.34", "65.55.175.254", "201.178.124.56", "123.23.139.88" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jPanel4.add(jScrollPane3);
        jScrollPane3.setBounds(90, 120, 220, 150);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Select Peers");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(150, 100, 100, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Transmission Packet");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(300, 20, 210, 20);

        jTextField1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1);
        jTextField1.setBounds(50, 60, 670, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Packet Format");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(580, 180, 160, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(50, 30, 750, 290);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 60, 850, 550);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 50, 930, 10);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(750, 10, 150, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2111.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 920, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                    
                if (jList1.getSelectedIndex() == 0) {

                    ditem = jList1.getSelectedValue().toString();
                    JOptionPane.showMessageDialog(null, "Packet sent to " + ditem);
                    try {

                        initialtime = System.currentTimeMillis();
                        ServerSocket send = new ServerSocket(1201);
                        Socket rec = send.accept();
                         s = fileToOpen.toString();
                        File sendFile = new File(s);
                        BufferedReader br = new BufferedReader(new FileReader(sendFile));
                        PrintStream ps = new PrintStream(rec.getOutputStream());
                        ps.println(s);
                        
                        String read;
                        while ((read = br.readLine()) != null) {
                            ps.println(read);
                            System.out.println("read=" + read);
                        }
                       
                            receivetime = System.currentTimeMillis();
                            double time1 = receivetime - initialtime;
                            System.out.println("time=" + time1);
                            timeinminutes = (time1 / (60000));
                            
                            send.close();
                            rec.close();
                            
                        
                        JOptionPane.showMessageDialog(null, "File sent");
                        tt*=1000;
                        tr*=1000;

                       
                        
                       st.executeUpdate("UPDATE table1 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                    
                       st.executeUpdate("UPDATE table1 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}
                    
                    
                     if (jList1.getSelectedIndex() == 1) {

                    ditem = jList1.getSelectedValue().toString();
                    JOptionPane.showMessageDialog(null, "Packet sent to " + ditem);
                    try {

                        initialtime = System.currentTimeMillis();
                        ServerSocket send = new ServerSocket(1202);
                        Socket rec = send.accept();
                         s = fileToOpen.toString();
                        File sendFile = new File(s);
                        BufferedReader br = new BufferedReader(new FileReader(sendFile));
                        PrintStream ps = new PrintStream(rec.getOutputStream());
                        ps.println(s);
                       
                            receivetime = System.currentTimeMillis();
                            double time1 = receivetime - initialtime;
                            System.out.println("time=" + time1);
                            timeinminutes = (time1 / (60000));
                            
                            send.close();
                            rec.close();
                            
                        
                        JOptionPane.showMessageDialog(null, "File sent");
                        tt*=1000;
                        tr*=1000;

                       
                        
                       st.executeUpdate("UPDATE table1 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_sent='" +tt+"', Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_sent='" +tt+"', Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_sent='" +tt+"', Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_sent='" +tt+"', Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_sent='" +tt+"', Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_sent='" +tt+"', Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_sent='" +tt+"', Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_sent='" +tt+"', Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_sent='" +tt+"', Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                    
                       st.executeUpdate("UPDATE table1 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}
                    
                     if (jList1.getSelectedIndex() == 2) {

                    ditem = jList1.getSelectedValue().toString();
                    JOptionPane.showMessageDialog(null, "Packet sent to " + ditem);
                    try {

                        initialtime = System.currentTimeMillis();
                        ServerSocket send = new ServerSocket(1203);
                        Socket rec = send.accept();
                         s = fileToOpen.toString();
                        File sendFile = new File(s);
                        BufferedReader br = new BufferedReader(new FileReader(sendFile));
                        PrintStream ps = new PrintStream(rec.getOutputStream());
                        ps.println(s);
                       
                            receivetime = System.currentTimeMillis();
                            double time1 = receivetime - initialtime;
                            System.out.println("time=" + time1);
                            timeinminutes = (time1 / (60000));
                            
                            send.close();
                            rec.close();
                            
                        
                        JOptionPane.showMessageDialog(null, "File sent");
                        tt*=1000;
                        tr*=1000;

                       
                        
                       st.executeUpdate("UPDATE table1 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                    
                       st.executeUpdate("UPDATE table1 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}
                if (jList1.getSelectedIndex() == 4) {

                    ditem = jList1.getSelectedValue().toString();
                    JOptionPane.showMessageDialog(null, "Packet sent to " + ditem);
                    try {

                        initialtime = System.currentTimeMillis();
                        ServerSocket send = new ServerSocket(1204);
                        Socket rec = send.accept();
                         s = fileToOpen.toString();
                        File sendFile = new File(s);
                        BufferedReader br = new BufferedReader(new FileReader(sendFile));
                        PrintStream ps = new PrintStream(rec.getOutputStream());
                        ps.println(s);
                       
                            receivetime = System.currentTimeMillis();
                            double time1 = receivetime - initialtime;
                            System.out.println("time=" + time1);
                            timeinminutes = (time1 / (60000));
                            
                            send.close();
                            rec.close();
                            
                        
                        JOptionPane.showMessageDialog(null, "File sent");
                        tt*=1000;
                        tr*=1000;

                       
                        
                       st.executeUpdate("UPDATE table1 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                    
                       st.executeUpdate("UPDATE table1 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}
                if (jList1.getSelectedIndex() == 3) {

                    ditem = jList1.getSelectedValue().toString();
                    JOptionPane.showMessageDialog(null, "Packet sent to " + ditem);
                    try {

                        initialtime = System.currentTimeMillis();
                        ServerSocket send = new ServerSocket(1204);
                        Socket rec = send.accept();
                         s = fileToOpen.toString();
                        File sendFile = new File(s);
                        BufferedReader br = new BufferedReader(new FileReader(sendFile));
                        PrintStream ps = new PrintStream(rec.getOutputStream());
                        ps.println(s);
                       
                            receivetime = System.currentTimeMillis();
                            double time1 = receivetime - initialtime;
                            System.out.println("time=" + time1);
                            timeinminutes = (time1 / (60000));
                            
                            send.close();
                            rec.close();
                            
                        
                        JOptionPane.showMessageDialog(null, "File sent");
                        tt*=1000;
                        tr*=1000;

                       
                        
                       st.executeUpdate("UPDATE table1 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                    
                       st.executeUpdate("UPDATE table1 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}
                if (jList1.getSelectedIndex() == 5) {

                    ditem = jList1.getSelectedValue().toString();
                    JOptionPane.showMessageDialog(null, "Packet sent to " + ditem);
                    try {

                        initialtime = System.currentTimeMillis();
                        ServerSocket send = new ServerSocket(1206);
                        Socket rec = send.accept();
                         s = fileToOpen.toString();
                        File sendFile = new File(s);
                        BufferedReader br = new BufferedReader(new FileReader(sendFile));
                        PrintStream ps = new PrintStream(rec.getOutputStream());
                        ps.println(s);
                       
                            receivetime = System.currentTimeMillis();
                            double time1 = receivetime - initialtime;
                            System.out.println("time=" + time1);
                            timeinminutes = (time1 / (60000));
                            
                            send.close();
                            rec.close();
                            
                        
                        JOptionPane.showMessageDialog(null, "File sent");
                        tt*=1000;
                        tr*=1000;

                       
                        
                       st.executeUpdate("UPDATE table1 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                    
                       st.executeUpdate("UPDATE table1 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}
                if (jList1.getSelectedIndex() == 6) {

                    ditem = jList1.getSelectedValue().toString();
                    JOptionPane.showMessageDialog(null, "Packet sent to " + ditem);
                    try {

                        initialtime = System.currentTimeMillis();
                        ServerSocket send = new ServerSocket(1207);
                        Socket rec = send.accept();
                         s = fileToOpen.toString();
                        File sendFile = new File(s);
                        BufferedReader br = new BufferedReader(new FileReader(sendFile));
                        PrintStream ps = new PrintStream(rec.getOutputStream());
                        ps.println(s);
                       
                            receivetime = System.currentTimeMillis();
                            double time1 = receivetime - initialtime;
                            System.out.println("time=" + time1);
                            timeinminutes = (time1 / (60000));
                            
                            send.close();
                            rec.close();
                            
                        
                        JOptionPane.showMessageDialog(null, "File sent");
                        tt*=1000;
                        tr*=1000;

                       
                        
                       st.executeUpdate("UPDATE table1 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                    
                       st.executeUpdate("UPDATE table1 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}
                if (jList1.getSelectedIndex() == 7) {

                    ditem = jList1.getSelectedValue().toString();
                    JOptionPane.showMessageDialog(null, "Packet sent to " + ditem);
                    try {

                        initialtime = System.currentTimeMillis();
                        ServerSocket send = new ServerSocket(1212);
                        Socket rec = send.accept();
                         s = fileToOpen.toString();
                        File sendFile = new File(s);
                        BufferedReader br = new BufferedReader(new FileReader(sendFile));
                        PrintStream ps = new PrintStream(rec.getOutputStream());
                        ps.println(s);
                       
                            receivetime = System.currentTimeMillis();
                            double time1 = receivetime - initialtime;
                            System.out.println("time=" + time1);
                            timeinminutes = (time1 / (60000));
                            
                            send.close();
                            rec.close();
                            
                        
                        JOptionPane.showMessageDialog(null, "File sent");
                        tt*=1000;
                        tr*=1000;

                       
                        
                       st.executeUpdate("UPDATE table1 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                    
                       st.executeUpdate("UPDATE table1 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}
                if (jList1.getSelectedIndex() == 8) {

                    ditem = jList1.getSelectedValue().toString();
                    JOptionPane.showMessageDialog(null, "Packet sent to " + ditem);
                    try {

                        initialtime = System.currentTimeMillis();
                        ServerSocket send = new ServerSocket(1251);
                        Socket rec = send.accept();
                         s = fileToOpen.toString();
                        File sendFile = new File(s);
                        BufferedReader br = new BufferedReader(new FileReader(sendFile));
                        PrintStream ps = new PrintStream(rec.getOutputStream());
                        ps.println(s);
                       
                            receivetime = System.currentTimeMillis();
                            double time1 = receivetime - initialtime;
                            System.out.println("time=" + time1);
                            timeinminutes = (time1 / (60000));
                            
                            send.close();
                            rec.close();
                            
                        
                        JOptionPane.showMessageDialog(null, "File sent");
                        tt*=1000;
                        tr*=1000;

                       
                        
                       st.executeUpdate("UPDATE table1 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                    
                       st.executeUpdate("UPDATE table1 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}
                if (jList1.getSelectedIndex() == 9) {

                    ditem = jList1.getSelectedValue().toString();
                    JOptionPane.showMessageDialog(null, "Packet sent to " + ditem);
                    try {

                        initialtime = System.currentTimeMillis();
                        ServerSocket send = new ServerSocket(1201);
                        Socket rec = send.accept();
                         s = fileToOpen.toString();
                        File sendFile = new File(s);
                        BufferedReader br = new BufferedReader(new FileReader(sendFile));
                        PrintStream ps = new PrintStream(rec.getOutputStream());
                        ps.println(s);
                       
                            receivetime = System.currentTimeMillis();
                            double time1 = receivetime - initialtime;
                            System.out.println("time=" + time1);
                            timeinminutes = (time1 / (60000));
                            
                            send.close();
                            rec.close();
                            
                        
                        JOptionPane.showMessageDialog(null, "File sent");
                        tt*=1000;
                        tr*=1000;

                       
                        
                       st.executeUpdate("UPDATE table1 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_sent='" +tt+"',Transactiontime='" +timeinminutes +"' WHERE src_Node='"+sitem+"' AND dest_Node='"+ditem+"'");
                    
                       st.executeUpdate("UPDATE table1 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table2 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table3 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table4 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table5 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table6 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table7 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table8 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table9 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       st.executeUpdate("UPDATE table10 set bytesize_recieved='" +tt+"' WHERE src_Node='"+ditem+"' AND dest_Node='"+sitem+"'");
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}
                
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clusterforamtion fb = new clusterforamtion();
        fb.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           jTextArea1.append("*************************************************************************************************\n");
            jTextArea1.append("Sourcenode\t  Destination node  \tFileName  \t            byteSize_sent\t    active_time\n");
            jTextArea1.append("*************************************************************************************************\n");
           
               jTextArea1.append(sitem+"    "+ditem+"          "+fileToOpen.getName()+"           "+tt+"                   "+timeinminutes+"\n");
           
       }
       catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      try
      {
          jTextField1.setText(fileToOpen.getName());
          rs1=st.executeQuery("select * from neighbor");
          while(rs1.next())
          {
              String s=rs1.getString(1);
              p2p.add(s);
          }
          System.out.println("prdct=" + p2p);
            ar = new String[p2p.size()];
            ar = p2p.toArray(ar);
 for (int i = 0; i < ar.length; i++) {
                jList1.setListData(ar);
            }
      }
       catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

  
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
            java.util.logging.Logger.getLogger(active_time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(active_time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(active_time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(active_time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new active_time().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
