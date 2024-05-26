package View;

import Controller.GuestInputController;
import Model.GuestInputModel;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.SwingUtilities;

/**
 *
 * @author Zyron
 */
public class GuestInput extends javax.swing.JPanel {
    private GuestInputController controller;
    private GuestInputModel model;
    private PaymentInformation1 payment;
    private static final double STANDARD_PRICE_PER_DAY = 2000.0;
    private static final double DELUXE_PRICE_PER_DAY = 4000.0; 
    private static final double SUITE_PRICE_PER_DAY = 6000.0; 
    private static final double EXECUTIVE_PRICE_PER_DAY = 10000.0; 
    public static final double OPTION_1 = 7000;
    public static final double OPTION_2 = 8500;
    public static final double OPTION_3 = 10000;
    private double initialTotalCost = 0;
    private double addTotalCost = 0;
    private double combinedTotalCost = 0;
    /**
     * Creates new form Guest
     */
    public GuestInput() {
        initComponents();
        this.controller = new GuestInputController();
        this.model = new GuestInputModel();
        this.payment = new PaymentInformation1();
        
jCheckBox1.addActionListener(e -> updateTotalCost());
jCheckBox2.addActionListener(e -> updateTotalCost());
jCheckBox3.addActionListener(e -> updateTotalCost());
        updateCheckInOutDates();
        updateTotalCost();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        emailaddress = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        phonenumber = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(101, 28, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Guest Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Check-In");

        jLabel4.setText("Check-Out");

        jLabel5.setText("12: 00 pm");

        jLabel6.setText("3:00 pm");

        jLabel7.setText("date");

        jLabel8.setText("date");

        jLabel9.setText("#");

        jLabel10.setText("#");

        jLabel11.setText("Total: ");

        jLabel12.setText("Miscellaneous Fees");

        jLabel14.setText("Total: ");

        jLabel15.setText("0");

        jLabel17.setText("$ 0");

        jLabel1.setText("$ 200");

        jLabel13.setText("$ 300");

        jLabel18.setText("$ 400");

        jCheckBox1.setText("Room Service");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Eat all you can Buffet");

        jCheckBox3.setText("Spa treatment");

        jButton3.setBackground(new java.awt.Color(101, 28, 50));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CONFIRM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel8))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(69, 69, 69))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel13))
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel17)))
                                .addGap(63, 63, 63))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox1))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(26, 26, 26))
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(101, 28, 50));
        jLabel16.setText("YOUR STAY");

        jButton1.setBackground(new java.awt.Color(101, 28, 50));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONFIRM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(101, 28, 50));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CONTINUE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(101, 28, 50));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        emailaddress.setText("Email Address or Username");
        emailaddress.setToolTipText("");
        emailaddress.setMargin(new java.awt.Insets(6, 6, 6, 6));
        emailaddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailaddressFocusGained(evt);
            }
        });
        emailaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailaddressActionPerformed(evt);
            }
        });

        jLabel19.setText("EMAIL ADDRESS");

        fullname.setText("FULL NAME");
        fullname.setToolTipText("");
        fullname.setMargin(new java.awt.Insets(6, 6, 6, 6));
        fullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fullnameFocusGained(evt);
            }
        });
        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });

        jLabel20.setText("FULL NAME");

        jLabel21.setText("PHONE NUMBER");

        phonenumber.setText("0900-0000-000");
        phonenumber.setToolTipText("");
        phonenumber.setMargin(new java.awt.Insets(6, 6, 6, 6));
        phonenumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phonenumberFocusGained(evt);
            }
        });
        phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phonenumber)
                            .addComponent(emailaddress)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel19)
                                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(0, 18, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    Management management = (Management) SwingUtilities.getWindowAncestor(this);
    management.getDashboardPanel().removeAll();
    payment.setVisible(true);
    management.getDashboardPanel().add(payment);
    management.getDashboardPanel().revalidate();
    management.getDashboardPanel().repaint();  
    
        int paymentId = model.getLastInsertedPaymentId(); // Retrieve the last inserted booking ID
        payment.displayPaymentTotal(paymentId);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String guestFullname = fullname.getText();
        String guestPhone = phonenumber.getText();
        String guestEmail = emailaddress.getText();
        
        controller.signUp(guestFullname, guestPhone, guestEmail);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int guestId = model.getLastInsertedGuestId();
        String[] checkInOutDates = controller.retrieveCheckInOutDates(guestId);
        String checkInDate = checkInOutDates[0];
        String checkOutDate = checkInOutDates[1];
        displayTotalCost(checkInDate, checkOutDate);
        
    String status = "Yes";
    String statusNull = null;
    
    int lastBookingId = model.getLastInsertedBookingId();
    
        if (jCheckBox1.isSelected()) {
            model.updateOption1(lastBookingId, status);
        }else{model.updateOption1(lastBookingId, statusNull);}
        if (jCheckBox2.isSelected()) {
            model.updateOption2(lastBookingId, status);
        }else{model.updateOption2(lastBookingId, statusNull);}
        if (jCheckBox3.isSelected()) {
            model.updateOption3(lastBookingId, status);
        }else{model.updateOption3(lastBookingId, statusNull);}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Management management = (Management) SwingUtilities.getWindowAncestor(this);
    management.getDashboardPanel().removeAll();
    RoomAvailability roomAvailability = new RoomAvailability();
    management.getDashboardPanel().add(roomAvailability);
    management.getDashboardPanel().revalidate();
    management.getDashboardPanel().repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void emailaddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailaddressFocusGained
        if(emailaddress != null && emailaddress.getText().equals("Email Address or Username"))
        {
            emailaddress.setText("");
            emailaddress.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_emailaddressFocusGained

    private void emailaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailaddressActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_emailaddressActionPerformed

    private void fullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameFocusGained
        // TODO add your handling code here:
        if (fullname != null && fullname.getText().equals("FIRSTNAME")) {
            fullname.setText("");
            fullname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_fullnameFocusGained

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void phonenumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phonenumberFocusGained
        // TODO add your handling code here:
        if (phonenumber != null && phonenumber.getText().equals("0900-0000-000")) {
            phonenumber.setText("");
            phonenumber.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_phonenumberFocusGained

    private void phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberActionPerformed

private void updateTotalCost() {
    double additionalFees = 0;
    String status = "Yes";
    
    int paymentId = model.getLastInsertedPaymentId();
    
        if (jCheckBox1.isSelected()) {
            additionalFees += OPTION_1;
        }
        if (jCheckBox2.isSelected()) {
            additionalFees += OPTION_2;
        }
        if (jCheckBox3.isSelected()) {
            additionalFees += OPTION_3;
        }

        jLabel17.setText("" + additionalFees);
        combinedTotalCost = initialTotalCost + additionalFees;
        jLabel15.setText("" + combinedTotalCost);
        model.updatePaymentTotal(paymentId, combinedTotalCost);
        //System.out.println(combinedTotalCost + " updated in database to paymentId" + paymentId );
}

    public void updateCheckInOutDates() {
        int guestId = model.getLastInsertedGuestId();
        String[] checkInOutDates = controller.retrieveCheckInOutDates(guestId);
        String checkInDate = checkInOutDates[0];
        String checkOutDate = checkInOutDates[1];
        displayCheckInOutDates(checkInDate, checkOutDate);

    }
    

    public void displayCheckInOutDates(String checkInDate, String checkOutDate) {
    jLabel9.setText("Check-in Date: " + checkInDate);
    jLabel10.setText("Check-out Date: " + checkOutDate);    }
    
    
        public long calculateNumberOfDays(String checkInDate, String checkOutDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate checkIn = LocalDate.parse(checkInDate, formatter);
        LocalDate checkOut = LocalDate.parse(checkOutDate, formatter);

        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public void displayTotalCost(String checkInDate, String checkOutDate) {
        int lastBookingId = model.getLastInsertedBookingId();
        System.out.println("Last Booking ID: " + lastBookingId); // Debug print

        int roomNumber = model.getRoomNumberForBooking(lastBookingId);
        System.out.println("Room Number: " + roomNumber); 

        String roomType = model.getRoomType(roomNumber);
        System.out.println("Room Type: " + roomType); 

        long numberOfDays = calculateNumberOfDays(checkInDate, checkOutDate);
        System.out.println("Number of Days: " + numberOfDays); 

        double basePricePerDay = getPricePerDayByRoomType(roomType);
        System.out.println("Base Price of " + roomType + " :"  + basePricePerDay); 

        double totalCost = numberOfDays * basePricePerDay;
        System.out.println("Total Cost: $" + totalCost); 
        initialTotalCost = numberOfDays * basePricePerDay;
        
        jLabel11.setText("Total Cost: $" + totalCost);
        updateTotalCost();
    }
    
    public double getPricePerDayByRoomType(String roomType) {
    switch (roomType) {
        case "Deluxe":
            return STANDARD_PRICE_PER_DAY;
        case "Premier":
            return DELUXE_PRICE_PER_DAY;
        case "Executive":
            return SUITE_PRICE_PER_DAY;
        case "Presidential":
            return EXECUTIVE_PRICE_PER_DAY;
        default:
            return 0.0; 
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emailaddress;
    private javax.swing.JTextField fullname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField phonenumber;
    // End of variables declaration//GEN-END:variables
   
}
