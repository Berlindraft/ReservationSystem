/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.RoomAvailabilityController;
import Model.DashboardModel;
import Model.RoomAvailabilityModel;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Zyron
 */
public class Management1 extends javax.swing.JFrame {
    private final Color activeColor = new Color(179, 139, 78); 
    private final Color inactiveColor = new Color(101, 28, 50);
    private RoomAvailability roomA;
    private RoomAvailabilityController controller;
    private RoomAvailabilityModel model;
    /**
     * Creates new form Management2
     */
    public Management1() {
        initComponents();
        
        Dashboard dashboard = new Dashboard();
        dashboard.loadData();
        dashboardPanel.add(dashboard);
        dashboardPanel.revalidate();
        dashboardPanel.repaint();
        this.roomA = new RoomAvailability();
        this.model = new RoomAvailabilityModel();
        this.controller = new RoomAvailabilityController(model, roomA);
        this.dispose();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public JPanel getDashboardPanel()
    {
        return dashboardPanel;
    }
private void setActiveButton(javax.swing.JButton activeButton) {
    // List of all buttons
    javax.swing.JButton[] buttons = {floorbtn, dashboardBtn, bookingBtn, guestsBtn, roomsBtn, transactionsBtn};

    // Set all to inactive, then set the active one
    for (javax.swing.JButton btn : buttons) {
        btn.setBackground(inactiveColor);
        btn.setForeground(Color.WHITE);  // Optional: change text color if needed
    }

    // Set active button color
    activeButton.setBackground(activeColor);
    activeButton.setForeground(Color.BLACK);  // Optional: change text color if needed
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        closeBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bookingBtn = new javax.swing.JButton();
        dashboardBtn = new javax.swing.JButton();
        roomsBtn = new javax.swing.JButton();
        guestsBtn = new javax.swing.JButton();
        transactionsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        floorbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dashboardPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(101, 28, 50));

        closeBtn.setBackground(new java.awt.Color(179, 139, 78));
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close_2.png"))); // NOI18N
        closeBtn.setToolTipText("");
        closeBtn.setFocusCycleRoot(true);
        closeBtn.setMargin(new java.awt.Insets(5, 14, 5, 14));
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(956, Short.MAX_VALUE)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(101, 28, 50));

        bookingBtn.setBackground(new java.awt.Color(101, 28, 50));
        bookingBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookingBtn.setForeground(new java.awt.Color(255, 255, 255));
        bookingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking.png"))); // NOI18N
        bookingBtn.setText("Bookings");
        bookingBtn.setToolTipText("");
        bookingBtn.setBorder(null);
        bookingBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bookingBtn.setIconTextGap(10);
        bookingBtn.setInheritsPopupMenu(true);
        bookingBtn.setMargin(new java.awt.Insets(5, 5, 5, 5));
        bookingBtn.setMaximumSize(new java.awt.Dimension(64, 42));
        bookingBtn.setMinimumSize(new java.awt.Dimension(64, 42));
        bookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingBtnActionPerformed(evt);
            }
        });

        dashboardBtn.setBackground(new java.awt.Color(101, 28, 50));
        dashboardBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboard.png"))); // NOI18N
        dashboardBtn.setText("Dashboard");
        dashboardBtn.setBorder(null);
        dashboardBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardBtn.setIconTextGap(10);
        dashboardBtn.setInheritsPopupMenu(true);
        dashboardBtn.setMargin(new java.awt.Insets(5, 5, 5, 5));
        dashboardBtn.setMaximumSize(new java.awt.Dimension(64, 42));
        dashboardBtn.setMinimumSize(new java.awt.Dimension(64, 42));
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });

        roomsBtn.setBackground(new java.awt.Color(101, 28, 50));
        roomsBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        roomsBtn.setForeground(new java.awt.Color(255, 255, 255));
        roomsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rooms.png"))); // NOI18N
        roomsBtn.setText("Rooms");
        roomsBtn.setToolTipText("");
        roomsBtn.setBorder(null);
        roomsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        roomsBtn.setIconTextGap(10);
        roomsBtn.setInheritsPopupMenu(true);
        roomsBtn.setMargin(new java.awt.Insets(5, 5, 5, 5));
        roomsBtn.setMaximumSize(new java.awt.Dimension(64, 42));
        roomsBtn.setMinimumSize(new java.awt.Dimension(64, 42));
        roomsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsBtnActionPerformed(evt);
            }
        });

        guestsBtn.setBackground(new java.awt.Color(101, 28, 50));
        guestsBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guestsBtn.setForeground(new java.awt.Color(255, 255, 255));
        guestsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guest.png"))); // NOI18N
        guestsBtn.setText("Guests");
        guestsBtn.setBorder(null);
        guestsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guestsBtn.setIconTextGap(10);
        guestsBtn.setInheritsPopupMenu(true);
        guestsBtn.setMargin(new java.awt.Insets(5, 5, 5, 5));
        guestsBtn.setMaximumSize(new java.awt.Dimension(64, 42));
        guestsBtn.setMinimumSize(new java.awt.Dimension(64, 42));
        guestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestsBtnActionPerformed(evt);
            }
        });

        transactionsBtn.setBackground(new java.awt.Color(101, 28, 50));
        transactionsBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        transactionsBtn.setForeground(new java.awt.Color(255, 255, 255));
        transactionsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transaction.png"))); // NOI18N
        transactionsBtn.setText("Transactions");
        transactionsBtn.setToolTipText("");
        transactionsBtn.setBorder(null);
        transactionsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transactionsBtn.setIconTextGap(10);
        transactionsBtn.setInheritsPopupMenu(true);
        transactionsBtn.setMargin(new java.awt.Insets(5, 5, 5, 5));
        transactionsBtn.setMaximumSize(new java.awt.Dimension(64, 42));
        transactionsBtn.setMinimumSize(new java.awt.Dimension(64, 42));
        transactionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionsBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        logoutBtn.setBackground(new java.awt.Color(101, 28, 50));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Log out");
        logoutBtn.setInheritsPopupMenu(true);
        logoutBtn.setMargin(new java.awt.Insets(5, 14, 5, 14));
        logoutBtn.setMaximumSize(new java.awt.Dimension(64, 42));
        logoutBtn.setMinimumSize(new java.awt.Dimension(64, 42));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        floorbtn.setBackground(new java.awt.Color(101, 28, 50));
        floorbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        floorbtn.setForeground(new java.awt.Color(255, 255, 255));
        floorbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/room-icon.png"))); // NOI18N
        floorbtn.setText("Floor");
        floorbtn.setBorder(null);
        floorbtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        floorbtn.setIconTextGap(10);
        floorbtn.setInheritsPopupMenu(true);
        floorbtn.setMargin(new java.awt.Insets(5, 5, 5, 5));
        floorbtn.setMaximumSize(new java.awt.Dimension(64, 42));
        floorbtn.setMinimumSize(new java.awt.Dimension(64, 42));
        floorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorbtnActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floorbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookingBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guestsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(dashboardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(floorbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(bookingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(guestsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(roomsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(transactionsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
    int confirm = JOptionPane.showConfirmDialog(this,
        "Are you sure you want to close?", "Exit Confirmation",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (confirm == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void bookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingBtnActionPerformed
        // TODO add your handling code here:
        dashboardPanel.removeAll();
        Booking book = new Booking();
        dashboardPanel.add(book);
        dashboardPanel.revalidate();
        dashboardPanel.repaint();
        setActiveButton(bookingBtn);
    }//GEN-LAST:event_bookingBtnActionPerformed

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
        // TODO add your handling code here:
        
        dashboardPanel.removeAll();
        Dashboard dashboard = new Dashboard();
        DashboardModel dashboardModel = new DashboardModel();

        try {
            // Fetch total check-ins using DashboardModel instance
            int totalCheckIns = dashboardModel.getTotalCheckInsToday();
            dashboard.setTotalCheckIns(totalCheckIns);

            // Fetch total check-outs using DashboardModel instance
            int totalCheckOuts = dashboardModel.getTotalCheckOutsToday();
            dashboard.setTotalCheckOuts(totalCheckOuts);

            // Fetch total check-outs using DashboardModel instance
            int totalOccupied = dashboardModel.getTotalOccupiedRooms();
            dashboard.setTotalOccupied(totalOccupied);

            // Fetch total check-outs using DashboardModel instance
            int totalAvailable = dashboardModel.getTotalAvailableRooms();
            dashboard.setTotalAvailable(totalAvailable);

            // Fetch week total using DashboardModel instance
            int weekTotal = dashboardModel.getCheckinTotal();
            dashboard.setTotalCheckinWeek(weekTotal);

            // Fetch room status using DashboardModel instance
            Map<String, Integer> OccupiedStatus = dashboardModel.getOccupiedRoomCounts();
            dashboard.displayOccupiedRoomStatusCounts(OccupiedStatus);

            // Fetch room status using DashboardModel instance
            Map<String, Integer> AvailableStatus = dashboardModel.getAvailableRoomCounts();
            dashboard.displayAvailableRoomStatusCounts(AvailableStatus);

            // Fetch week total using DashboardModel instance
            String DeluxeRooms = dashboardModel.getRoom1Status();
            dashboard.displayRoom1Status(DeluxeRooms);
            String PremierRooms = dashboardModel.getRoom2Status();
            dashboard.displayRoom2Status(PremierRooms);
            String SuiteRooms = dashboardModel.getRoom3Status();
            dashboard.displayRoom3Status(SuiteRooms);
            String PresidentialRooms = dashboardModel.getRoom4Status();
            dashboard.displayRoom4Status(PresidentialRooms);


        } catch (SQLException e) {

        }


        dashboardPanel.add(dashboard);
        dashboardPanel.revalidate();
        dashboardPanel.repaint();
        setActiveButton(dashboardBtn);
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void roomsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsBtnActionPerformed
        dashboardPanel.removeAll();
        RoomTable roomTable = new RoomTable();
        dashboardPanel.add(roomTable);
        dashboardPanel.revalidate();
        dashboardPanel.repaint();
        setActiveButton(roomsBtn);
    }//GEN-LAST:event_roomsBtnActionPerformed

    private void guestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestsBtnActionPerformed
        dashboardPanel.removeAll();
        GuestTable guestTable = new GuestTable();
        dashboardPanel.add(guestTable);
        dashboardPanel.revalidate();
        dashboardPanel.repaint();
        setActiveButton(guestsBtn);
    }//GEN-LAST:event_guestsBtnActionPerformed

    private void transactionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionsBtnActionPerformed
        dashboardPanel.removeAll();
        TransactionTable transactionTable = new TransactionTable();
        dashboardPanel.add(transactionTable);
        dashboardPanel.revalidate();
        dashboardPanel.repaint();
        setActiveButton(transactionsBtn);
    }//GEN-LAST:event_transactionsBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void floorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorbtnActionPerformed
    handleRoomTypeButtonClick("Deluxe");
    handleRoomTypeButtonClick("Premier");
    handleRoomTypeButtonClick("Executive");
    handleRoomTypeButtonClick("Presidential");
    
        dashboardPanel.removeAll();
        roomA.setVisible(true);
        dashboardPanel.add(roomA);
        dashboardPanel.revalidate();
        dashboardPanel.repaint();
        setActiveButton(floorbtn);
    

    }//GEN-LAST:event_floorbtnActionPerformed
    
    
    private void handleRoomTypeButtonClick(String roomType) {
        controller.updateColors(roomType);
        System.out.println(roomType + " scanning");
    }
    
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookingBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton floorbtn;
    private javax.swing.JButton guestsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton roomsBtn;
    private javax.swing.JButton transactionsBtn;
    // End of variables declaration//GEN-END:variables
}
