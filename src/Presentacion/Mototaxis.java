/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import DataBussinessObject.Asociaciones;
import DataBussinessObject.Conductores;
import DataBussinessObject.Propietarios;
import DataBussinessObject.Socios;
import DataTransferObject.AsociacionesDTO;
import DataTransferObject.ConductoresDTO;
import DataTransferObject.PropietariosDTO;
import DataTransferObject.SociosDTO;
import static java.awt.GridBagConstraints.BOTH;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Aaron
 */
public class Mototaxis extends javax.swing.JFrame {
    
    DefaultTableModel modelo=new DefaultTableModel();
 
    public Mototaxis() {  
        
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        listarConductores_bk();
        listarAsociaciones();
        
        DefaultTableModel tbl_filtros = new DefaultTableModel(
        new Object[][]{}, // Datos vacíos
        new String[]{"Nombre", "N° Permiso", "RUC", "Domicilio", "Ubicación", "Vigencia de Permiso"} // Columnas
    );
      
    }
    
    // Método para validar que una fecha es válida según el formato "dd/MM/yyyy"
private boolean isFechaValida(String fecha) {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    formato.setLenient(false); // No permitir fechas inválidas como 31/02/2024
    try {
        formato.parse(fecha); // Intenta convertir la cadena a una fecha
        return true; // Si lo logra, la fecha es válida
    } catch (ParseException e) {
        return false; // Si falla, la fecha no es válida
    }
}



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_filtros = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_socios = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_propietarios = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_conductores = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        btn_registrar_propietario = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_dni_registrar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_apellido_materno_registrar = new javax.swing.JTextField();
        txt_nombres_registrar = new javax.swing.JTextField();
        txt_apellido_paterno_registrar = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_buscar_conductor = new javax.swing.JTextField();
        lbl_mensaje_conductores = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txt_placa_registrar = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txt_vigencia_soat_registrar = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_Asociaciones_filtros = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbl_socios_filtros = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_propietarios_filtros = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_conductores_filtros = new javax.swing.JTable();
        jTextField8 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        Txt_buscar_conductor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_buscar_asociacion_filtro = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        lbl_mensaje_asociaciones = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_socios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "DNI", "Placa"
            }
        ));
        jScrollPane3.setViewportView(tbl_socios);

        tbl_propietarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "DNI", "Placa", "SOAT"
            }
        ));
        jScrollPane4.setViewportView(tbl_propietarios);

        jLabel7.setText("Buscar propietario");

        tbl_conductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "DNI", "Placa", "Licencia de Conducir"
            }
        ));
        jScrollPane5.setViewportView(tbl_conductores);

        jLabel8.setText("Socios");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton4.setText("Registrar como conductor");

        btn_registrar_propietario.setText("Registrar como propietario");
        btn_registrar_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_propietarioActionPerformed(evt);
            }
        });

        jLabel9.setText("Placa del Vehiculo");

        jLabel12.setText("Nombre");

        jLabel13.setText("Apellido Materno");

        jLabel14.setText("Apellido Paterno");

        jLabel15.setText("DNI");

        jButton6.setText("Registrar como conductor y propietario");

        jButton7.setText("Registrar como socio, propietario y conductor");

        jLabel10.setText("Buscar conductor");

        txt_buscar_conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_conductorActionPerformed(evt);
            }
        });
        txt_buscar_conductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscar_conductorKeyReleased(evt);
            }
        });

        jLabel16.setText("Asociaciones");

        jLabel17.setText("N°Permiso");

        jLabel18.setText("Ruc");

        jLabel19.setText("Vigencia de Permiso");

        jLabel20.setText("Ubicacion");

        jButton3.setText("Registrar como Socio ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_placa_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_placa_registrarActionPerformed(evt);
            }
        });

        jLabel40.setText("Tarjeta de Circulacion-Fecha");

        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jLabel41.setText("Fotocheck-Fecha");

        jLabel42.setText("SOAT");

        jLabel43.setText("Licencia de Conducir");

        txt_vigencia_soat_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_vigencia_soat_registrarActionPerformed(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/red.png"))); // NOI18N
        jLabel44.setText("jLabel44");

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/saludable.png"))); // NOI18N

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/moto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                                                .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(txt_apellido_materno_registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_apellido_paterno_registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_nombres_registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel45)
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel10)
                                                .addGap(38, 38, 38)
                                                .addComponent(txt_buscar_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txt_placa_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(39, 39, 39)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txt_vigencia_soat_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(559, 559, 559))))))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 5279, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_mensaje_conductores, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(206, 206, 206)
                                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addComponent(txt_dni_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(68, 68, 68)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                            .addComponent(btn_registrar_propietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_nombres_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_apellido_paterno_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_apellido_materno_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_vigencia_soat_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dni_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_placa_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_registrar_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel10)))
                        .addGap(682, 682, 682)
                        .addComponent(lbl_mensaje_conductores, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel45))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel46)
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(txt_buscar_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_filtros.addTab("Socios", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Asociaciones_filtros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "N°Permiso", "RUC", "Domicilio", "Ubicacion", "Vigencia de Permiso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_Asociaciones_filtros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_Asociaciones_filtrosMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tbl_Asociaciones_filtros);

        jPanel3.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1263, 220));

        tbl_socios_filtros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "DNI", "Placa"
            }
        ));
        jScrollPane11.setViewportView(tbl_socios_filtros);

        jPanel3.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 499, 330));

        tbl_propietarios_filtros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "DNI", "Placa", "SOAT", "Tarjde de C Fecha de Emision", "Tarjde de C Fecha de Caducidad"
            }
        ));
        jScrollPane6.setViewportView(tbl_propietarios_filtros);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 686, 330));

        tbl_conductores_filtros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "DNI", "Placa", "Licencia de Conducir", "Fotochack Emision", "Fotocheck Caducidad"
            }
        ));
        jScrollPane7.setViewportView(tbl_conductores_filtros);

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 360, 836, 330));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 228, 29));
        jPanel3.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 275, 31));

        Txt_buscar_conductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_buscar_conductorMouseClicked(evt);
            }
        });
        Txt_buscar_conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_buscar_conductorActionPerformed(evt);
            }
        });
        jPanel3.add(Txt_buscar_conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 320, 301, -1));

        jLabel6.setText("Buscar socios");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 97, -1));

        jLabel21.setText("Buscar conductores");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 320, -1, -1));

        txt_buscar_asociacion_filtro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_buscar_asociacion_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscar_asociacion_filtroKeyReleased(evt);
            }
        });
        jPanel3.add(txt_buscar_asociacion_filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 24, 453, 29));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("Buscar Asociacion");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 23, -1, 29));
        jPanel3.add(lbl_mensaje_asociaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 25, 217, 34));

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 16, 104, 43));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/icons8-lupa-48.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 11, 50, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/icons8-agregar-carpeta-48.png"))); // NOI18N
        jButton2.setText("AGREGAR S");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, 37));

        jLabel2.setText("Buscar  Propetarios");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 101, 37));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/icons8-agregar-carpeta-48.png"))); // NOI18N
        jButton5.setText("AGREGAR P");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, -1, 37));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/icons8-agregar-carpeta-48.png"))); // NOI18N
        jButton8.setText("AGREGAR CONDUCTOR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 300, 227, 43));

        tbl_filtros.addTab("Filtros", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbl_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 6809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbl_filtros)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_vigencia_soat_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_vigencia_soat_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_vigencia_soat_registrarActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void txt_placa_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_placa_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_placa_registrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_buscar_conductorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_conductorKeyReleased
        // TODO add your handling code here:
        //Producto producto=new Producto();
        if(!txt_buscar_conductor.getText().isEmpty()){
            if(conductores.buscarPorLike(txt_buscar_conductor.getText())!=null){
                limpiarTabla_conductores_bk();
                modelo=(DefaultTableModel) tbl_conductores.getModel();
                Object[]obj=new Object[4];
                for(ConductoresDTO conductoresDTO:conductores.buscarPorLike(txt_buscar_conductor.getText()))
                {
                    obj[0]=conductoresDTO.getNombres();
                    obj[1]=conductoresDTO.getApellidos();
                    obj[2]=conductoresDTO.getDNI();
                    obj[3]=conductoresDTO.getPlaca();
                    modelo.addRow(obj);
                    //obj[8] = productoDTO.getEstado();
                }
                tbl_conductores.setModel(modelo);
                //mensajePositivo(lblMensaje, lblIcon);
                lbl_mensaje_conductores.setText("Encontrado");
            }
            else
            {
                //mensajeNegativo(lblMensaje, lblIcon);
                lbl_mensaje_conductores.setText("No se encontro");
                limpiarTabla_conductores_bk();
            }
        }else
        {
            //mensajeNegativo(lblMensaje, lblIcon);
            lbl_mensaje_conductores.setText("Ingresa un valor");
            limpiarTabla_conductores_bk();
            listarConductores_bk();
        }
    }//GEN-LAST:event_txt_buscar_conductorKeyReleased

    private void txt_buscar_conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_conductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscar_conductorActionPerformed

    private void btn_registrar_propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_propietarioActionPerformed
        // TODO add your handling code here:

        String mensaje=propietarios.agregar(txt_nombres_registrar.getText(),txt_apellido_paterno_registrar.getText(),
            txt_apellido_materno_registrar.getText(),txt_dni_registrar.getText(),txt_vigencia_soat_registrar.getText(),txt_placa_registrar.getText());
        JOptionPane.showMessageDialog(this, mensaje, "Resultado de la agregacion",1);

        //actualizarUI();
    }//GEN-LAST:event_btn_registrar_propietarioActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void txt_buscar_asociacion_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_asociacion_filtroKeyReleased
        // TODO add your handling code here:
        if(!txt_buscar_asociacion_filtro.getText().isEmpty()){
            if(asociaciones.buscarPorLike(txt_buscar_asociacion_filtro.getText())!=null){
                limpiarTabla(tbl_Asociaciones_filtros);
                modelo=(DefaultTableModel) tbl_Asociaciones_filtros.getModel();
                Object[]obj=new Object[7];
                for(AsociacionesDTO asociacionesDTO:asociaciones.buscarPorLike(txt_buscar_asociacion_filtro.getText()))
                {
                    //System.out.println(asociacionesDTO.getNombre());
                    obj[0]=asociacionesDTO.getIdAsociacion();
                    obj[1]=asociacionesDTO.getNombre();
                    obj[2]=asociacionesDTO.getNumeroDePermiso();
                    obj[3]=asociacionesDTO.getRUC();
                    obj[4]=asociacionesDTO.getDomicilio();
                    obj[5]=asociacionesDTO.getUbicacionParadero();
                    obj[6]=asociacionesDTO.getVigencia();
                    modelo.addRow(obj);
                    //obj[8] = productoDTO.getEstado();
                }
                tbl_Asociaciones_filtros.setModel(modelo);
                //mensajePositivo(lblMensaje, lblIcon);
                lbl_mensaje_asociaciones.setText("Encontrado");
            }
            else
            {
                //mensajeNegativo(lblMensaje, lblIcon);
                lbl_mensaje_asociaciones.setText("No se encontro");
                limpiarTabla(tbl_Asociaciones_filtros);
            }
        }else
        {
            //mensajeNegativo(lblMensaje, lblIcon);
            lbl_mensaje_asociaciones.setText("Ingresa un valor");
            limpiarTabla(tbl_Asociaciones_filtros);
            listarAsociaciones();
        }
    }//GEN-LAST:event_txt_buscar_asociacion_filtroKeyReleased

    private void Txt_buscar_conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_buscar_conductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_buscar_conductorActionPerformed

    private void Txt_buscar_conductorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_buscar_conductorMouseClicked

    }//GEN-LAST:event_Txt_buscar_conductorMouseClicked

    private void tbl_Asociaciones_filtrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_Asociaciones_filtrosMouseClicked
        // TODO add your handling code here:
        int fila = tbl_Asociaciones_filtros.getSelectedRow();
        if (fila < 0)
        JOptionPane.showMessageDialog(this, "No hay filas para seleccionar");
        else {
            //txtIdCliente.setText(tblClientes.getValueAt(fila, 0).toString());
            //txtNombreCliente.setText(tblClientes.getValueAt(fila, 1).toString());
            //txtDNI.setText(tblClientes.getValueAt(fila, 3).toString());
            limpiarTabla(tbl_conductores_filtros);
            listarConductores(Integer.parseInt(tbl_Asociaciones_filtros.getValueAt(fila, 0).toString()));
            limpiarTabla(tbl_propietarios_filtros);
            listarPropietarios(Integer.parseInt(tbl_Asociaciones_filtros.getValueAt(fila, 0).toString()));
            limpiarTabla(tbl_socios_filtros);
            listarSocios(Integer.parseInt(tbl_Asociaciones_filtros.getValueAt(fila, 0).toString()));
        }
    }//GEN-LAST:event_tbl_Asociaciones_filtrosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
           Form_agregar_asociaciones formulario = new Form_agregar_asociaciones();
    formulario.setLocationRelativeTo(null); // Centra el formulario en la pantalla
    formulario.setVisible(true); // Hace visible el formulario
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        Form_agregar_socio formulario = new Form_agregar_socio();
    formulario.setLocationRelativeTo(null); // Centra el formulario en la pantalla
    formulario.setVisible(true); // Hace visible e
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
        Form_agregar_propetario formulario = new Form_agregar_propetario();
    formulario.setLocationRelativeTo(null); // Centra el formulario en la pantalla
    formulario.setVisible(true); // Hace visible e
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      Form_agregar_propetario formulario = new Form_agregar_propetario();
    formulario.setLocationRelativeTo(null); // Centra el formulario en la pantalla
    formulario.setVisible(true); // Hace visible e
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mototaxis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_buscar_conductor;
    private javax.swing.JButton btn_registrar_propietario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lbl_mensaje_asociaciones;
    private javax.swing.JLabel lbl_mensaje_conductores;
    private javax.swing.JTable tbl_Asociaciones_filtros;
    private javax.swing.JTable tbl_conductores;
    private javax.swing.JTable tbl_conductores_filtros;
    private javax.swing.JTabbedPane tbl_filtros;
    private javax.swing.JTable tbl_propietarios;
    private javax.swing.JTable tbl_propietarios_filtros;
    private javax.swing.JTable tbl_socios;
    private javax.swing.JTable tbl_socios_filtros;
    private javax.swing.JTextField txt_apellido_materno_registrar;
    private javax.swing.JTextField txt_apellido_paterno_registrar;
    private javax.swing.JTextField txt_buscar_asociacion_filtro;
    private javax.swing.JTextField txt_buscar_conductor;
    private javax.swing.JTextField txt_dni_registrar;
    private javax.swing.JTextField txt_nombres_registrar;
    private javax.swing.JTextField txt_placa_registrar;
    private javax.swing.JTextField txt_vigencia_soat_registrar;
    // End of variables declaration//GEN-END:variables

    Asociaciones asociaciones=new Asociaciones();
    Conductores conductores=new Conductores();
    Propietarios propietarios=new Propietarios();
    Socios socios=new Socios();
    //quiero comitear algo nuevo
    private void ocultarColumna(JTable table, int index){
        table.getColumnModel().getColumn(index).setMinWidth(0);
        table.getColumnModel().getColumn(index).setMaxWidth(0);
        table.getColumnModel().getColumn(index).setPreferredWidth(0);
        table.getColumnModel().getColumn(index).setResizable(false);
   }
    
    private void listarAsociaciones()
    { 
      modelo=(DefaultTableModel) tbl_Asociaciones_filtros.getModel();
      Object[]obj=new Object[7];
      for(AsociacionesDTO asociacionesDTO:asociaciones.listar())
      {
          obj[0]=asociacionesDTO.getIdAsociacion();
          obj[1]=asociacionesDTO.getNombre();
          obj[2]=asociacionesDTO.getNumeroDePermiso();
          obj[3]=asociacionesDTO.getRUC();
          obj[4]=asociacionesDTO.getDomicilio();
          obj[5]=asociacionesDTO.getUbicacionParadero();
          obj[6]=asociacionesDTO.getVigencia();
          
          modelo.addRow(obj);
          ocultarColumna(tbl_Asociaciones_filtros, 0);
      }
      tbl_Asociaciones_filtros.setModel(modelo);
    } 
    private void listarConductores_bk()
    { 
      modelo=(DefaultTableModel) tbl_conductores.getModel();
      Object[]obj=new Object[4];
      for(ConductoresDTO conductoresDTO:conductores.listar())
      {
          obj[0]=conductoresDTO.getNombres();
          obj[1]=conductoresDTO.getApellidos();
          obj[2]=conductoresDTO.getDNI();
          obj[3]=conductoresDTO.getPlaca();
          modelo.addRow(obj);
      }
      tbl_conductores.setModel(modelo);
    } 
    
    private void limpiarTabla_conductores_bk() {
        modelo = (DefaultTableModel) tbl_conductores.getModel();
        modelo.getDataVector().removeAllElements();
        tbl_conductores.removeAll();
        tbl_conductores.clearSelection();
   }
    
     private void listarConductores(int id_asociacion)
    { 
      modelo=(DefaultTableModel) tbl_conductores_filtros.getModel();
      Object[]obj=new Object[4];
      if (conductores.buscarPorIdAsociacion(id_asociacion)!=null){
          for(ConductoresDTO conductoresDTO:conductores.buscarPorIdAsociacion(id_asociacion))
            {
                obj[0]=conductoresDTO.getNombres();
                obj[1]=conductoresDTO.getApellidos();
                obj[2]=conductoresDTO.getDNI();
                obj[3]=conductoresDTO.getPlaca();
                modelo.addRow(obj);
            }
            tbl_conductores_filtros.setModel(modelo);
      }else{
          
      }
    } 
    
    private void listarPropietarios(int id_asociacion)
    { 
      modelo=(DefaultTableModel) tbl_propietarios_filtros.getModel();
      Object[]obj=new Object[5];
      if (propietarios.buscarPorIdAsociacion(id_asociacion)!=null){
          for(PropietariosDTO propietariosDTO:propietarios.buscarPorIdAsociacion(id_asociacion))
            {
                obj[0]=propietariosDTO.getNombres();
                obj[1]=propietariosDTO.getApellidos();
                obj[2]=propietariosDTO.getDNI();
                obj[3]=propietariosDTO.getPlaca();
                obj[4]=propietariosDTO.getVigenciaSoat();
                modelo.addRow(obj);
            }
            tbl_propietarios_filtros.setModel(modelo);
      }else{
          
      }
    } 
    
    private void listarSocios(int id_asociacion)
    { 
      modelo=(DefaultTableModel) tbl_socios_filtros.getModel();
      Object[]obj=new Object[5];
      if (socios.buscarPorIdAsociacion(id_asociacion)!=null){
          for(SociosDTO sociosDTO:socios.buscarPorIdAsociacion(id_asociacion))
            {
                obj[0]=sociosDTO.getNombre();
                obj[1]=sociosDTO.getApellido();
                obj[2]=sociosDTO.getDNI();
                obj[3]=sociosDTO.getPlaca();
                obj[4]=sociosDTO.getVigenciaFotocheck();
                modelo.addRow(obj);
            }
            tbl_socios_filtros.setModel(modelo);
      }else{
          
      }
    } 
       
     private void limpiarTabla(JTable tabla ){
        modelo = (DefaultTableModel) tabla.getModel();
        modelo.getDataVector().removeAllElements();
        tabla.removeAll();
        tabla.clearSelection();
   }
}