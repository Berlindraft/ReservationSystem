/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;
import Model.ConfirmationModel;
import Utils.EmailSender;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
/**
 *
 * @author Zyron
 */
public class Confirmation1 extends javax.swing.JPanel {
private static ConfirmationModel model;
private static EmailSender emailSender;
    /**
     * Creates new form Confirmation1
     */
    public Confirmation1() {
        initComponents();
        this.model = new ConfirmationModel();
        this.emailSender = new EmailSender("hoteldayuhan@gmail.com", "rajg fifw hngh fnvf");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("BOOKING ID: ");

        jLabel2.setText("GUEST ID: ");

        jLabel3.setText("ROOM DESCRIPTION");

        jLabel4.setText("ROOM TYPE");

        jLabel5.setText("ROOM NAME");

        jLabel6.setText("ROOM DESCRIPTION");

        jLabel7.setText("BOOKING INFORMATION");

        jLabel8.setText("CHECK IN DATE");

        jLabel9.setText("CHECK OUT DATE");

        jLabel10.setText("NO OF DAYS STAY");

        jLabel11.setText("ADDITIONAL OPTIONS");

        jLabel12.setText("GUEST INFORMATION");

        jLabel13.setText("GUEST NAME");

        jLabel14.setText("GUEST NUMBER");

        jLabel15.setText("GUEST EMAIL");

        jLabel16.setText("PAYMENT AMOUNT");

        jLabel17.setText("PAYMENT METHOD");

        jButton1.setText("CONFIRM BOOKING");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("AGREE WITH THE PRIVACY TERMS");

        jCheckBox2.setText("AGREE WITH THE BOOKING CONDITIONS");

        jLabel18.setText("ROOM NUMBER:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(188, 188, 188)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2)
                                .addGap(104, 104, 104)
                                .addComponent(jLabel18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel10))
                                .addGap(135, 135, 135)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))))
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))))
                        .addGap(191, 191, 191))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel18))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel14)))
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17))
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jCheckBox1.isSelected() || !jCheckBox2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please agree to all terms before confirming the booking.", "Terms Agreement Required", JOptionPane.ERROR_MESSAGE);
            return;
        }

        updateAllInformation(); 
        String htmlContent = generateHtmlContent(); 

        try {
            int guestid = model.getLastInsertedGuestId();
            String email = model.getGuestEmail(guestid);
            emailSender.sendEmail(email, "Booking Confirmation", htmlContent);  
            JOptionPane.showMessageDialog(this, "Booking confirmed and email sent successfully!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(this, "Failed to send confirmation email.", "Email Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Management management = (Management) SwingUtilities.getWindowAncestor(this);
    management.getDashboardPanel().removeAll();
    GuestInput guestInput = new GuestInput();
    management.getDashboardPanel().add(guestInput);
    management.getDashboardPanel().revalidate();
    management.getDashboardPanel().repaint();
    }//GEN-LAST:event_jButton2ActionPerformed
private String generateHtmlContent() {
    try {
        int bookingId = model.getLastInsertedBookingId();
        int guestId = model.getLastInsertedGuestId();

        int roomNumber = model.getRoomNumber();
        String roomType = model.getRoomType(roomNumber);
        String roomName = model.getRoomNameByType(roomType);
        String roomDescription = model.getRoomDescriptionByType(roomType);

        String fullname = model.getGuestFullName(guestId);
        String email = model.getGuestEmail(guestId);

        int paymentId = model.getLastPaymentId();
        double paymentamount = model.getPaymentAmount(paymentId);

        String[] checkInOutDates = model.retrieveCheckInOutDates(bookingId);
        String checkInDate = checkInOutDates[0];
        String checkOutDate = checkInOutDates[1];

        jLabel6.setText("Check-in Date: " + checkInDate);
        jLabel7.setText("Check-out Date: " + checkOutDate);

        long numberOfDays = calculateNumberOfDays(checkInDate, checkOutDate);
        jLabel8.setText("No. of days stay: " + numberOfDays);
        List<String> addOns = model.getAddOnOptions(bookingId);
        String addOnText = String.join(", ", addOns);
        if (addOnText.isEmpty()) {
            addOnText = "No additional options selected.";
        }

        return String.format("""
            <!DOCTYPE html>
            <html lang="en">
            <head>
            <meta charset="UTF-8">
            <title>Booking Confirmation</title>
            </head>
            <body style="font-family: Arial, sans-serif; color: #333;">
            <div style="max-width: 600px; margin: auto; border: 1px solid #ccc; padding: 20px; border-radius: 5px; background: #f9f9f9;">
                <h1 style="color: #0264d6; text-align: center;">Booking Confirmation</h1>
                <p style="font-size: 16px; text-align: center;">Thank you for booking with us, <strong>%s</strong>! Here are the details of your booking:</p>

                <table style="width: 100%%; border-collapse: collapse; margin-top: 20px;">
                    <tr style="background-color: #0264d6; color: white;">
                        <th style="padding: 10px; border: 1px solid #ddd;">Booking</th>
                        <th style="padding: 10px; border: 1px solid #ddd;">Details</th>
                    </tr>
                    <tr>
                        <td style="padding: 10px; border: 1px solid #ddd;">Booking ID</td>
                        <td style="padding: 10px; border: 1px solid #ddd;">%d</td>
                    </tr>
                    <tr>
                        <td style="padding: 10px; border: 1px solid #ddd;">Room Number</td>
                        <td style="padding: 10px; border: 1px solid #ddd;">%d</td>
                    </tr>
                    <tr>
                        <td style="padding: 10px; border: 1px solid #ddd;">Room Type</td>
                        <td style="padding: 10px; border: 1px solid #ddd;">%s</td>
                    </tr>
                    <tr>
                        <td style="padding: 10px; border: 1px solid #ddd;">Room Name</td>
                        <td style="padding: 10px; border: 1px solid #ddd;">%s</td>
                    </tr>
                    <tr>
                        <td style="padding: 10px; border: 1px solid #ddd;">Check-in Date</td>
                        <td style="padding: 10px; border: 1px solid #ddd;">%s</td>
                    </tr>
                    <tr>
                        <td style="padding: 10px; border: 1px solid #ddd;">Check-out Date</td>
                        <td style="padding: 10px; border: 1px solid #ddd;">%s</td>
                    </tr>
                    <tr>
                        <td style="padding: 10px; border: 1px solid #ddd;">Payment Amount</td>
                        <td style="padding: 10px; border: 1px solid #ddd;">$%.2f</td>
                    </tr>
                </table>

                <p style="text-align: center; font-size: 16px; margin-top: 20px;">If you have any questions or need further assistance, please do not hesitate to contact us.</p>

                <div style="text-align: center; margin-top: 20px;">
                    <a href="https://www.yourwebsite.com" style="padding: 10px 20px; color: white; background-color: #0264d6; text-decoration: none; border-radius: 5px;">xraymundzyron@gmail.com</a>
                </div>
            </div>
            </body>
            </html>
            """, fullname, bookingId, roomNumber, roomType, roomName, checkInDate, checkOutDate, paymentamount);
    } catch (Exception e) {
        e.printStackTrace();
        return "Error generating booking confirmation.";
    }
}


    private void updateAllInformation() {
        updateBookingGuestId();
        updateRoomDescription();
        updateGuestInformation();
        updatePaymentInformation();
        updateBookingInformation();
        displayAddOns();
    }
    
        public void setupCheckboxListeners() {
    jCheckBox1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            checkAndEnableConfirmButton();
        }
    });

    jCheckBox2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            checkAndEnableConfirmButton();
        }
    });
}
    public void checkAndEnableConfirmButton() {
    if (jCheckBox1.isSelected() && jCheckBox2.isSelected()) {
        jButton1.setEnabled(true);
    } else {
        jButton1.setEnabled(false); 
    }
}
    public void displayRoomNumber() {
    int roomNumber = model.getRoomNumber();
    jLabel18.setText("Room Number: " + roomNumber);
}

public void updateBookingGuestId() {
    int bookingId = model.getLastInsertedBookingId();
    int guestId = model.getLastInsertedGuestId();
    jLabel1.setText("BOOKING ID: " + bookingId);
    jLabel2.setText("GUEST ID: " + guestId);
}
    
   public void updateRoomDescription() {
    int roomNumber = model.getRoomNumber();
    String roomType = model.getRoomType(roomNumber);
    String roomName = model.getRoomNameByType(roomType);
    String roomDescription = model.getRoomDescriptionByType(roomType);
    
    jLabel4.setText("Room Type: " + roomType);
    jLabel5.setText("Room Name: " + roomName);
    jLabel6.setText("Room Description: " + roomDescription);
} 
    public void updateGuestInformation() {
    int guestId = model.getLastInsertedGuestId();
    String fullname = model.getGuestFullName(guestId);
    String contact = model.getGuestNumber(guestId);
    String email = model.getGuestEmail(guestId);
    jLabel13.setText("Guest Name: " + fullname);
    jLabel14.setText("Guest Number: " + contact);
    jLabel15.setText("Guest Email: " + email);
}
public void updatePaymentInformation() {
    
    int paymentId = model.getLastPaymentId();
    int guestId = model.getLastInsertedGuestId();
    double paymentamount = model.getPaymentAmount(paymentId);
    String paymentmethod = model.getPaymentMethod(paymentId);
    jLabel16.setText("Payment Amount: " + paymentamount);
    jLabel17.setText("Payment Method: " + paymentmethod);
}

public void updateBookingInformation() {
   
    int bookingId = model.getLastInsertedBookingId();
    String[] checkInOutDates = model.retrieveCheckInOutDates(bookingId);
    String checkInDate = checkInOutDates[0];
    String checkOutDate = checkInOutDates[1];

    jLabel8.setText("Check-in Date: " + checkInDate);
    jLabel9.setText("Check-out Date: " + checkOutDate); 
    
    long numberOfDays = calculateNumberOfDays(checkInDate, checkOutDate);
    jLabel10.setText("No. of days stay: " + numberOfDays); 

}

public long calculateNumberOfDays(String checkInDate, String checkOutDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate checkIn = LocalDate.parse(checkInDate, formatter);
        LocalDate checkOut = LocalDate.parse(checkOutDate, formatter);

        // Calculate the number of days between the two dates
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

public void displayAddOns() {
    int bookingId = model.getLastInsertedBookingId();
    List<String> addOns = model.getAddOnOptions(bookingId);
    String addOnText = String.join(", ", addOns); 
    if (addOnText.isEmpty()) {
        addOnText = "No additional options selected.";
    }
    jLabel11.setText(addOnText); 
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
