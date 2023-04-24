import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;


public class Factura extends JFrame{

    private Persona listaClientes [];
    private Persona listaVendedores [];
    private Productos arrayProductos [];
    private JLabel encabezadoDatosClientes;
    private JLabel encabezadoDatosVendedor;
    private JLabel encabezadoDatosProductos;
    private JLabel etqCedula;
    private JLabel etqNombre;
    private JLabel etqDireccion;
    private JLabel etqCedulaVendedor;
    private JLabel etqNombresVendedor;
    private JLabel etqId;
    private JLabel etqNombreProducto;
    private JLabel etqCantidad;
    private JPanel listaProductos;
    private JLabel etqTotal;
    private JLabel etqProducto;
    private JTextField inputCedula;
    private JTextField inputNombre;
    private JTextField inputDireccion;
    private JTextField inputCedulaVendedor;
    private JTextField inputNombresVendedor;
    private JTextField inputId;
    private JTextField nombreProducto;
    private JTextField cantidadProducto;
    private JButton buscarCliente;
    private JButton buscarVendedor;
    private JButton botonAgregar;

    
    public Factura(Persona[] listaClientes, Persona[] listaVendedores, Productos [] arrayProductos){

        this.listaClientes = listaClientes;
        this.listaVendedores = listaVendedores;
        this.arrayProductos = arrayProductos;

        initComponents();
    }

    public void initComponents(){

        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamanio = sistema.getScreenSize();

        setSize(((int) (tamanio.width*0.4)),((int) (tamanio.height*0.9)));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Factura");

        JPanel contenedorPrincipal = new JPanel();
        contenedorPrincipal.setLayout(new GridBagLayout());
        contenedorPrincipal.setBorder( BorderFactory.createEmptyBorder(20,20,20,20));
        GridBagConstraints restriccion = new GridBagConstraints();

        encabezadoDatosClientes = new JLabel("DATOS CLIENTE: ");
        encabezadoDatosClientes.setVerticalAlignment(JLabel.TOP);
        encabezadoDatosClientes.setFont(new Font("Arial", Font.BOLD, 20));
        encabezadoDatosClientes.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
        restriccion.gridx = 0;
        restriccion.gridy = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 1;
        restriccion.weightx = 100;
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(encabezadoDatosClientes, restriccion);

        etqCedula = new JLabel("CEDULA: ");
        restriccion.gridx = 0;
        restriccion.gridy = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqCedula, restriccion);

        inputCedula = new JTextField(" ");
        inputCedula.setBorder( BorderFactory.createEmptyBorder(0,10,0,10));
        restriccion.gridx = 1;
        restriccion.gridy = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(0,10,0,10);
        contenedorPrincipal.add(inputCedula, restriccion);

        buscarCliente = new JButton("BUSCAR");
        restriccion.gridx = 3;
        restriccion.gridy = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(buscarCliente, restriccion);

        etqNombre = new JLabel("NOMBRES: ");
        restriccion.gridx = 0;
        restriccion.gridy = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(10,0,10,0);
        contenedorPrincipal.add(etqNombre, restriccion);

        inputNombre = new JTextField(" ");
        inputNombre.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        restriccion.gridx = 1;
        restriccion.gridy = 2;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(10,10,10,10);
        contenedorPrincipal.add(inputNombre, restriccion);

        etqDireccion = new JLabel("DIRECCION: ");
        restriccion.gridx = 0;
        restriccion.gridy = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(0,0,10,0);
        contenedorPrincipal.add(etqDireccion, restriccion);

        inputDireccion = new JTextField(" ");
        inputDireccion.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        restriccion.gridx = 1;
        restriccion.gridy = 3;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(0,10,10,10);
        contenedorPrincipal.add(inputDireccion, restriccion);

        encabezadoDatosVendedor = new JLabel("DATOS VENDEDOR: ");
        encabezadoDatosVendedor.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
        encabezadoDatosVendedor.setFont(new Font("Arial", Font.BOLD, 20));
        restriccion.gridx = 0;
        restriccion.gridy = 4;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 1;
        restriccion.weightx = 100;
        restriccion.insets = new Insets(10,0,0,10);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(encabezadoDatosVendedor, restriccion);

        etqCedulaVendedor = new JLabel("CEDULA: ");
        restriccion.gridx = 0;
        restriccion.gridy = 5;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(10,0,0,10);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqCedulaVendedor, restriccion);

        inputCedulaVendedor = new JTextField(" ");
        inputCedulaVendedor.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        restriccion.gridx = 1;
        restriccion.gridy = 5;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 2;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(0,10,0,10);
        contenedorPrincipal.add(inputCedulaVendedor, restriccion);

        buscarVendedor = new JButton("BUSCAR");
        restriccion.gridx = 3;
        restriccion.gridy = 5;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(buscarVendedor, restriccion);

        etqNombresVendedor = new JLabel("NOMBRES: ");
        restriccion.gridx = 0;
        restriccion.gridy = 6;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.insets = new Insets(10,0,10,0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqNombresVendedor, restriccion);

        inputNombresVendedor = new JTextField(" ");
        inputNombresVendedor.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        restriccion.gridx = 1;
        restriccion.gridy = 6;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 3;
        restriccion.weighty = 1;
        restriccion.weightx = 80;
        restriccion.insets = new Insets(10,10,10,10);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(inputNombresVendedor, restriccion);

        encabezadoDatosProductos = new JLabel("PRODUCTOS ");
        encabezadoDatosProductos.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
        restriccion.gridx = 0;
        restriccion.gridy = 7;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 0;
        restriccion.weightx = 0;
        restriccion.insets = new Insets(10, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(encabezadoDatosProductos, restriccion);

        etqId = new JLabel("ID ");
        etqId.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridx = 0;
        restriccion.gridy = 8;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqId, restriccion);

        etqNombreProducto = new JLabel("NOMBRE");
        etqNombreProducto.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridx = 1;
        restriccion.gridy = 8;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 50;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqNombreProducto, restriccion);

        etqCantidad = new JLabel("CANT ");
        etqCantidad.setHorizontalAlignment( JLabel.CENTER );
        restriccion.gridx = 2;
        restriccion.gridy = 8;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(etqCantidad, restriccion);

        inputId = new JTextField(" ");
        restriccion.gridx = 0;
        restriccion.gridy = 9;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(inputId, restriccion);

        nombreProducto = new JTextField(" ");
        restriccion.gridx = 1;
        restriccion.gridy = 9;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 50;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(nombreProducto, restriccion);

        cantidadProducto = new JTextField("");
        restriccion.gridx = 2;
        restriccion.gridy = 9;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 10;
        restriccion.insets = new Insets(0, 0, 0, 0);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(cantidadProducto, restriccion);

        botonAgregar = new JButton("ADD");
        restriccion.gridx = 3;
        restriccion.gridy = 9;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 1;
        restriccion.weighty = 1;
        restriccion.weightx = 20;
        restriccion.insets = new Insets(0, 10, 0, 10);
        restriccion.fill = (GridBagConstraints.BOTH);
        contenedorPrincipal.add(botonAgregar, restriccion);

        listaProductos = new JPanel();
        listaProductos.setLayout( new BoxLayout(listaProductos, BoxLayout.Y_AXIS) );
        restriccion.gridx = 0;
        restriccion.gridy = 10;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 90;
        restriccion.weightx = 100;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(10,0,0,10);
        listaProductos.setOpaque(true);
        listaProductos.setBackground(Color.white);
        
        contenedorPrincipal.add(listaProductos, restriccion);

        etqTotal = new JLabel("Total: $ 0");
        etqTotal.setHorizontalAlignment(JLabel.RIGHT);
        etqTotal.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        restriccion.gridx = 0;
        restriccion.gridy = 11;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 2;
        restriccion.weightx = 100;
        restriccion.fill = (GridBagConstraints.BOTH);
        restriccion.insets = new Insets(0,0,0,10);
        etqTotal.setOpaque(true);
        etqTotal.setBackground(Color.white);
        contenedorPrincipal.add(etqTotal, restriccion);

        add(contenedorPrincipal); 
        revalidate();
        setVisible(true);

        ActionListener eventoBuscarCliente = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				buscarCliente();
			}
		};
        buscarCliente.addActionListener(eventoBuscarCliente);

        ActionListener eventoBuscarVendedor = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buscarVendedor();
            }
        };
        buscarVendedor.addActionListener(eventoBuscarVendedor);

        ActionListener eventoAgregarProductos = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buscarProductos();
            }
        };
        botonAgregar.addActionListener(eventoAgregarProductos);

        KeyListener eventoKeyBuscarCliente = new KeyListener(){
            public void keyPressed(KeyEvent e){
            }

            public void keyReleased(KeyEvent e){
                String texto = inputCedula.getText();
                if(texto.equalsIgnoreCase("")){
                    inputNombre.setText("");
                    inputDireccion.setText("");
                }
            }

            public void keyTyped(KeyEvent e){
            }
        };

        KeyListener eventoKeyBuscarVendedor = new KeyListener(){
            public void keyPressed(KeyEvent e){
            }

            public void keyReleased(KeyEvent e){
                buscarVendedor();
            }

            public void keyTyped(KeyEvent e){
            }
        };

        inputCedula.addKeyListener(eventoKeyBuscarCliente);
        inputCedulaVendedor.addKeyListener(eventoKeyBuscarVendedor);
        deshabilitarInput(inputNombre);
        deshabilitarInput(inputDireccion);
        deshabilitarInput(inputNombresVendedor);
    }

    public void buscarCliente(){
        String cedula = inputCedula.getText().replaceAll(" ","");
        boolean encontrado = false;
        for(int i = 0; i < this.listaClientes.length; i++){
            if(this.listaClientes[i]!=null && this.listaClientes[i].getCedula().equalsIgnoreCase(cedula)){
                this.inputCedula.setText( cedula );
				this.inputNombre.setText( this.listaClientes[i].getNombres() );
				this.inputDireccion.setText( this.listaClientes[i].getDireccion() );
				encontrado = true;
				break;
			}
        }

        if(encontrado){
            deshabilitarInput(this.inputNombre);
            deshabilitarInput(this.inputDireccion);
            this.inputCedulaVendedor.requestFocus();
        }else{
            habilitarInput(this.inputNombre);
            habilitarInput(this.inputDireccion);
            this.inputNombre.requestFocus();
        }
    }

    public void buscarVendedor(){
        String cedula = inputCedulaVendedor.getText().replaceAll(" ","");
        boolean encontrado = false;
        for(int i = 0; i < this.listaVendedores.length; i++){
            if(this.listaVendedores[i]!=null && this.listaVendedores[i].getCedula().equalsIgnoreCase(cedula)){
                this.inputNombresVendedor.setText(this.listaVendedores[i].getNombres());
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            //this.inputCedulaVendedor.requestFocus();
            this.inputNombresVendedor.setText("VENDEDOR NO ENCONTRADO");
        }else{
            //this.inputId.requestFocus();
        }
    }

    public void deshabilitarInput(JTextField input){
        input.setEditable(false);
        input.setEnabled(false);
        input.setDisabledTextColor(Color.black);
    }

    public void habilitarInput(JTextField input){
        input.setText(" ");
        input.setEditable(true);
        input.setEnabled(true);
    }

    public void buscarProductos(){
        String id = inputId.getText().replaceAll(" ","");
        String cantidadString =  cantidadProducto.getText().replaceAll(" ","");

        if(!id.equalsIgnoreCase("") && !cantidadString.equalsIgnoreCase("")){
            boolean encontrado = false;
            for(int i = 0; i < this.arrayProductos.length; i++){
                if(this.arrayProductos[i] != null && this.arrayProductos[i].getIdProducto().equalsIgnoreCase(id)){
                    int cantidadInt = Integer.parseInt(cantidadString);
                    int valorProducto = this.arrayProductos[i].getPrecio() * cantidadInt;
                    JLabel etq_temporal = new JLabel(this.arrayProductos[i].getIdProducto() + " - " + this.arrayProductos[i].getNombreProducto() + " - " + etqCantidad.getText() + " - " + valorProducto);
                    listaProductos.add(etq_temporal);
                    encontrado = true;
                    revalidate();
                    break;
                }
            }

            if(!encontrado){
                System.out.println("El producto no se encuentra");
            }
        }else{
            System.out.println("Datos incompletos");
        }

    }


}
