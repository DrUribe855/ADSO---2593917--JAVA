package Principal;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.*;



public class ListarUsuarios extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    private JLabel etqTemporal;
    
    
    public ListarUsuarios(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
        initAlternComponents(); 
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        for(int i = 0; i < this.ventanaMenu.indexPersona; i++){
            if(this.ventanaMenu.listaPersonas[i] != null){
                etqTemporal = new JLabel(i + " " + this.ventanaMenu.listaPersonas[i].getCedula() + " " + this.ventanaMenu.listaPersonas[i].getNombres() + " " + this.ventanaMenu.listaPersonas[i].getTelefono() + " " + this.ventanaMenu.listaPersonas[i].getEmail() );
                panelLista.add(etqTemporal);
                revalidate();
            }
        }
        
    }
    
    //*public void imprimirClientes(){
        //for(int i = 0; i < this.ventanaMenu.indexPersona; i++){
            //if(this.ventanaMenu.listaPersonas[i] != null){
              //  JLabel etqTemporal = new JLabel(i + " " + this.ventanaMenu.listaPersonas[i].getCedula() + " " + this.ventanaMenu.listaPersonas[i].getNombres() + " " + this.ventanaMenu.listaPersonas[i].getTelefono() + " " + this.ventanaMenu.listaPersonas[i].getEmail() );
            //    panelLista.add(etqTemporal);
          //  }
        //}
    //}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalContainer = new javax.swing.JPanel();
        EtqTitulo = new javax.swing.JLabel();
        panelLista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principalContainer.setBackground(new java.awt.Color(153, 153, 255));

        EtqTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EtqTitulo.setText("LISTA USUARIOS");
        EtqTitulo.setToolTipText("");

        panelLista.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelListaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelListaLayout.setVerticalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout principalContainerLayout = new javax.swing.GroupLayout(principalContainer);
        principalContainer.setLayout(principalContainerLayout);
        principalContainerLayout.setHorizontalGroup(
            principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalContainerLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(EtqTitulo)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(principalContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        principalContainerLayout.setVerticalGroup(
            principalContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalContainerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(EtqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelListaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelListaAncestorAdded
        //imprimirClientes();
    }//GEN-LAST:event_panelListaAncestorAdded

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtqTitulo;
    private javax.swing.JPanel panelLista;
    private javax.swing.JPanel principalContainer;
    // End of variables declaration//GEN-END:variables
}
