/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package car.hire.view;

import car.hire.controller.CarController;
import car.hire.dto.CarDto;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PrasadiKengalle
 */
public class CarPanel extends javax.swing.JPanel {
    
    private CarController carController;

    /**
     * Creates new form CarPanel
     */
    public CarPanel() {
        carController = new CarController();
        initComponents();
        loadAllCars();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        customerPanel = new javax.swing.JPanel();
        carIdLabel = new javax.swing.JLabel();
        carIdText = new javax.swing.JTextField();
        licensePlateLabel = new javax.swing.JLabel();
        licensePlateText = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        yearText = new javax.swing.JTextField();
        dailyRentalLabel = new javax.swing.JLabel();
        availableLabel = new javax.swing.JLabel();
        dailyRentalText = new javax.swing.JTextField();
        makeLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        modelText = new javax.swing.JTextField();
        categoryLabel = new javax.swing.JLabel();
        categoryIdText = new javax.swing.JTextField();
        makeText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        availableText = new javax.swing.JTextField();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Car Manage");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(577, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        carIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        carIdLabel.setText("Car ID  ");

        carIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carIdTextActionPerformed(evt);
            }
        });

        licensePlateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        licensePlateLabel.setText("License Plate");

        yearLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        yearLabel.setText("Year");

        dailyRentalLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dailyRentalLabel.setText("Daily Rental Rate");

        availableLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        availableLabel.setText("Available");

        dailyRentalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyRentalTextActionPerformed(evt);
            }
        });

        makeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        makeLabel.setText("Make");
        makeLabel.setToolTipText("");

        modelLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        modelLabel.setText("Model");

        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        categoryLabel.setText("Category ID");

        makeText.setToolTipText("");

        addButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        addButton.setText("Save Car");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        updateButton.setText("Update Car");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        deleteButton.setText("Delete Car");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        availableText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(deleteButton)
                                .addGap(38, 38, 38)
                                .addComponent(updateButton)
                                .addGap(51, 51, 51))
                            .addGroup(customerPanelLayout.createSequentialGroup()
                                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(licensePlateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(carIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(availableLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dailyRentalLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(carIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dailyRentalText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(licensePlateText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(availableText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)))
                        .addComponent(addButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(makeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearText, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(makeText))
                        .addGap(46, 46, 46)
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modelText, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(categoryIdText))
                        .addContainerGap(122, Short.MAX_VALUE))))
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carIdLabel)
                    .addComponent(carIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryLabel)
                    .addComponent(categoryIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licensePlateLabel)
                    .addComponent(licensePlateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(makeLabel)
                    .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(makeText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modelLabel)
                        .addComponent(modelText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearLabel)
                    .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dailyRentalLabel)
                    .addComponent(dailyRentalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availableLabel)
                    .addComponent(availableText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(addButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        carTable.setModel(new javax.swing.table.DefaultTableModel(
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
        carTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(basePanelLayout.createSequentialGroup()
                        .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void carIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carIdTextActionPerformed

    private void dailyRentalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyRentalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dailyRentalTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
             addCar();
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
             updateCar();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
              deleteCar();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void availableTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableTextActionPerformed

    private void carTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carTableMouseClicked
              searchCar();
    }//GEN-LAST:event_carTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel availableLabel;
    private javax.swing.JTextField availableText;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel carIdLabel;
    private javax.swing.JTextField carIdText;
    private javax.swing.JTable carTable;
    private javax.swing.JTextField categoryIdText;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JLabel dailyRentalLabel;
    private javax.swing.JTextField dailyRentalText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel licensePlateLabel;
    private javax.swing.JTextField licensePlateText;
    private javax.swing.JLabel makeLabel;
    private javax.swing.JTextField makeText;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelText;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables

    private void addCar() {
      
        try {
            CarDto carDto = new CarDto(carIdText.getText(),
                    categoryIdText.getText(),
                    makeText.getText(),
                    modelText.getText(),
                    Integer.parseInt(yearText.getText()),
                    categoryIdText.getText(),
                    Double.parseDouble(dailyRentalText.getText()),
                    availableText.getText());

            String result = carController.addCar(carDto);
            JOptionPane.showMessageDialog(this, result);
            clear();
            loadAllCars();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(CarPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
           
        
    }

    private void updateCar() {
       
        try {
            CarDto carDto = new CarDto(carIdText.getText(),
                    licensePlateText.getText(),
                    makeText.getText(),
                    modelText.getText(),
                    Integer.parseInt(yearText.getText()),
                    categoryIdText.getText(),
                    Double.parseDouble(dailyRentalText.getText()),
                    availableText.getText());

            String result = carController.updateCar(carDto);
            JOptionPane.showMessageDialog(this, result);
            clear();
            loadAllCars();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(CarPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    private void deleteCar() {
       
        try {
            String result = carController.deleteCar(carIdText.getText());
            JOptionPane.showMessageDialog(this, result);
            clear();
            loadAllCars();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(CarPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    private void searchCar() {
       
        try {
            String carId = carTable.getValueAt(carTable.getSelectedRow(), 0).toString();

            CarDto carDto = carController.getCar(carId);

            if (carDto != null) {
                carIdText.setText(carDto.getCarId());
                categoryIdText.setText(carDto.getCategoryId());
                licensePlateText.setText(carDto.getLicensePlate());
                makeText.setText(carDto.getMake());
                modelText.setText(carDto.getModel());
                yearText.setText(Integer.toString(carDto.getYear()));
                dailyRentalText.setText(Double.toString(carDto.getDailyRentalRate()));
                availableText.setText(carDto.getAvailable());

            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(CarPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    private void clear() {
        carIdText.setText("");
        categoryIdText.setText("");
        licensePlateText.setText("");
        makeText.setText("");
        modelText.setText("");
        yearText.setText("");
        dailyRentalText.setText("");
        availableText.setText("");
    }

    private void loadAllCars() {
        
        try {
            String[] collumns = {"Car ID", "Make", "Model", "Daily Rental", "Availability"};

            DefaultTableModel dtm = new DefaultTableModel(collumns, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };

            carTable.setModel(dtm);

            ArrayList<CarDto> carDtos = carController.getAllCars();

            for (CarDto car : carDtos) {
                Object[] rowData = {car.getCarId(), car.getMake(), car.getModel(), car.getDailyRentalRate(), car.getAvailable()};
                dtm.addRow(rowData);
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(CarPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

}
