
package ModuloProductos;

import Clases.Producto;
import Principal.Alert;
import Principal.Menu;
import java.awt.Color;
import java.text.NumberFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;


public class ModificarProducto extends javax.swing.JFrame {

    Menu ventanaMenu;
    Producto listaProductos [];
    String titulo;
    int indexLista;
    Alert alerta;
    int posicionProducto;
    public ModificarProducto(Menu ventanaMenu, Producto [] listaProductos, int indexLista, String titulo) {
        this.ventanaMenu = ventanaMenu;
        this.listaProductos = listaProductos;
        this.titulo = titulo;
        this.indexLista = indexLista;
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contentPrincipal = new javax.swing.JPanel();
        etqCedula = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        etqNombres = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoCantidad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelUsuarioEncontrado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentPrincipal.setBackground(new java.awt.Color(153, 153, 255));

        etqCedula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqCedula.setText("     ID");

        campoId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoId.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqNombres.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqNombres.setForeground(new java.awt.Color(51, 51, 51));
        etqNombres.setText("Nombre");
        etqNombres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNombre.setEnabled(false);
        campoNombre.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqApellidos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqApellidos.setForeground(new java.awt.Color(51, 51, 51));
        etqApellidos.setText("Precio");
        etqApellidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoPrecio.setEnabled(false);
        campoPrecio.setMargin(new java.awt.Insets(2, 5, 2, 5));

        etqTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(51, 51, 51));
        etqTelefono.setText("Cantidad");
        etqTelefono.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        campoCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCantidad.setEnabled(false);
        campoCantidad.setMargin(new java.awt.Insets(2, 5, 2, 5));

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 0, 153));
        btnModificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.setFocusable(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 0, 153));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labelUsuarioEncontrado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUsuarioEncontrado.setForeground(new java.awt.Color(51, 51, 51));
        labelUsuarioEncontrado.setText("Usuario encontrado:");

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuarioEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(61, 61, 61)
                                .addComponent(btnModificar))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(etqApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                        .addComponent(etqNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsuarioEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("MODIFICAR ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png")));
        this.ventanaMenu.deshabilitarCampos(campoNombre);
        this.ventanaMenu.deshabilitarCampos(campoPrecio);
        this.ventanaMenu.deshabilitarCampos(campoCantidad);
        btnModificar.setEnabled(false);
        //NumberFormat integerFormat = NumberFormat.getIntegerInstance();
        
        //jFormattedTextField1 = new JFormattedTextField(integerFormat);
        
    }
    
    
    
    public void buscarProducto(){
        String id = this.campoId.getText();
        String nombre = this.campoNombre.getText();
        
        String cantidadT = this.campoCantidad.getText();
        if(id != ""){
            for(int i = 0; i < this.listaProductos.length; i++){
                if(this.listaProductos[i] != null){
                    if(this.listaProductos[i].getId().equalsIgnoreCase(id)){
                        posicionProducto = i;
                        this.campoNombre.setText(this.listaProductos[i].getNombre());
                        this.campoPrecio.setText(String.valueOf(this.listaProductos[i].getPrecio()));
                        this.campoCantidad.setText(String.valueOf(this.listaProductos[i].getCantidad()));
                        this.labelUsuarioEncontrado.setText("Usuario encontrado");
                        habilitarCampo(this.campoNombre);
                        habilitarCampo(this.campoPrecio);
                        habilitarCampo(this.campoCantidad);
                        this.btnModificar.setEnabled(true);
                    }else{
                        labelUsuarioEncontrado.setText("Usuario NO encontrado");
                        this.campoNombre.setText("");
                        this.campoPrecio.setText("");
                        this.campoCantidad.setText("");
                        btnModificar.setEnabled(false);
                    }
                }
            }
        }
    }
    
    public void modificarProducto(){
        String nombre = this.campoNombre.getText();
        String precioT = this.campoPrecio.getText();
        String cantidadT = this.campoCantidad.getText();
        
        if(!nombre.equals("") && !precioT.equals("") && !cantidadT.equals("")){
            int precio = Integer.parseInt(precioT);
            int cantidad = Integer.parseInt(cantidadT);
            this.listaProductos[posicionProducto].setNombre(nombre);
            this.listaProductos[posicionProducto].setPrecio(precio);
            this.listaProductos[posicionProducto].setCantidad(cantidad);
            dispose();
            this.ventanaMenu.setVisible(true);
            Alert alerta = new Alert("VALIDADO", "La informaciión ha sido modificada", "success");
        }else{
            Alert alerta = new Alert("INVALIDO", "Todos los campos deben ser validados","error");
        }
        
    }
    
    public void habilitarCampo(JTextField campo){
        campo.setEnabled(true);
        campo.setBackground(Color.WHITE);
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //modificarUsuario();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBuscarActionPerformed

    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelUsuarioEncontrado;
    // End of variables declaration//GEN-END:variables
}
