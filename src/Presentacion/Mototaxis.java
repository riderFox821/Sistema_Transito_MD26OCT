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
import Presentacion.interconexion;


/**
 *
 * @author Aaron
 */
public class Mototaxis extends javax.swing.JFrame {
    
    DefaultTableModel modelo=new DefaultTableModel();
 
    public Mototaxis() {  
        
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        //listarConductores_bk();
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

        jPanel3.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1960, 220));

        tbl_socios_filtros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "DNI", "Placa"
            }
        ));
        jScrollPane11.setViewportView(tbl_socios_filtros);

        jPanel3.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 360, 480, 330));

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

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 360, 760, 330));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 228, 29));
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
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 97, -1));

        jLabel21.setText("Buscar conductores");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 320, -1, -1));

        txt_buscar_asociacion_filtro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_buscar_asociacion_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscar_asociacion_filtroKeyReleased(evt);
            }
        });
        jPanel3.add(txt_buscar_asociacion_filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 453, 29));

        jLabel22.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setText("Buscar Asociacion");
        jLabel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 40));

        lbl_mensaje_asociaciones.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lbl_mensaje_asociaciones.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(lbl_mensaje_asociaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 25, 217, 34));

        jButton1.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/icons8-agregar-carpeta-48.png"))); // NOI18N
        jButton1.setText("Agregar Asociacion ");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 170, 43));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/icons8-lupa-48.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 50, -1));

        jButton2.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/icons8-agregar-carpeta-48.png"))); // NOI18N
        jButton2.setText("AGREGAR S");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 140, 37));

        jLabel2.setText("Buscar  Propetarios");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 101, 37));

        jButton5.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes02/icons8-agregar-carpeta-48.png"))); // NOI18N
        jButton5.setText("AGREGAR P");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 170, 37));

        jButton8.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbl_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 2010, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbl_filtros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        int fila = tbl_Asociaciones_filtros.getSelectedRow();
        if (fila < 0)
        JOptionPane.showMessageDialog(this, "Debe seleccionar una asociacion para añadir un conductor");
        else {
            Form_agregar_conductor formulario = new Form_agregar_conductor(this);
            formulario.setLocationRelativeTo(null); // Centra el formulario en la pantalla
            formulario.setVisible(true); // Hace visible e
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int fila = tbl_Asociaciones_filtros.getSelectedRow();
        if (fila < 0)
        JOptionPane.showMessageDialog(this, "Debe seleccionar una asociacion para añadir un propietario");
        else {
            Form_agregar_propetario formulario = new Form_agregar_propetario(this);
            formulario.setLocationRelativeTo(null); // Centra el formulario en la pantalla
            formulario.setVisible(true); // Hace visible e
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int fila = tbl_Asociaciones_filtros.getSelectedRow();
        if (fila < 0)
        JOptionPane.showMessageDialog(this, "Debe seleccionar una asociacion para añadir un socio");
        else {
            Form_agregar_socio formulario = new Form_agregar_socio();
            formulario.setLocationRelativeTo(null); // Centra el formulario en la pantalla
            formulario.setVisible(true); // Hace visible e
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Form_agregar_asociaciones formulario = new Form_agregar_asociaciones();
        formulario.setLocationRelativeTo(null); // Centra el formulario en la pantalla
        formulario.setVisible(true); // Hace visible el formulario
    }//GEN-LAST:event_jButton1ActionPerformed

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
            AsociacionesDTO asociacionesDTO= new AsociacionesDTO();
            asociacionesDTO.setIdAsociacion(Integer.parseInt(tbl_Asociaciones_filtros.getValueAt(fila, 0).toString()));
            asociacionesDTO.setNombre("EL PASCUALO");
            interconexion.setAsociacionesDTO(asociacionesDTO);
        }
    }//GEN-LAST:event_tbl_Asociaciones_filtrosMouseClicked

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lbl_mensaje_asociaciones;
    private javax.swing.JTable tbl_Asociaciones_filtros;
    private javax.swing.JTable tbl_conductores_filtros;
    private javax.swing.JTabbedPane tbl_filtros;
    private javax.swing.JTable tbl_propietarios_filtros;
    private javax.swing.JTable tbl_socios_filtros;
    private javax.swing.JTextField txt_buscar_asociacion_filtro;
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
   /* private void listarConductores_bk()
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
   }*/
    
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
   public void refrescarUI(int id_asociacion){
       limpiarTabla(tbl_propietarios_filtros);
       listarPropietarios(id_asociacion);
       limpiarTabla(tbl_conductores_filtros);
       listarConductores(id_asociacion);
   }
}