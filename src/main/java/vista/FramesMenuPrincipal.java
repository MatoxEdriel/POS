/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import components.ButtonHover;
import components.PlaceHolder;
import components.RoundedButton;
import components.RoundedPanel;
import components.RoundedTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Gabriel
 */
public class FramesMenuPrincipal extends JFrame {
//BRILAS

    private JPanel contentPane;

    //Frame Menu 
    private JPanel pnlMenuIzquierda;

    private JPanel pnlMenuNavegacion;
    //BOTONES
    private RoundedButton btnPlantas;
    private RoundedButton btnAbonos;
    private RoundedButton btnSacos;
    private RoundedButton btnMacetas;

    private JPanel pnlRuletaOrden;

    //Paleta de colores
    public final Color v1 = new Color(0xa7cd2c);
    public final Color v2 = new Color(0xbada5f);
    public final Color v3 = new Color(0xcee891);
    public final Color v4 = new Color(0xe1f5c4);
    public final Color v5 = new Color(0x50c8c6);
    public final Color gris = new Color(0xEFEFEF);

    //PADDINGS
    public final int topPadding = 10;
    public final int leftPadding = 10;
    public final int bottomPadding = 10;
    public final int rightPadding = 50;

    //Componentes 
    private JButton btnBoton;

    private ImageIcon icon;

    private RoundedTextField txtBusqueda;

    private ImageIcon iconApp;

    public ImageIcon search = new ImageIcon(FramesMenuPrincipal.class.getResource("/images/buscar.png"));

    public FramesMenuPrincipal() {
        initComponents();
        setIconImage(iconApp.getImage());
        PlaceHolder placeHolder = new PlaceHolder("Busqueda", txtBusqueda, search);
        //Samuel hpt 
    }

    public FramesMenuPrincipal(String titulo) {
        setTitle(titulo);

        initComponents();
        setIconImage(iconApp.getImage());

    }

    private void initComponents() {
        setSize(1050, 655);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon icono = new ImageIcon(FramesMenuPrincipal.class.getResource("/images/logo1.png"));

        iconApp = new ImageIcon(FramesMenuPrincipal.class.getResource("/images/logo1.png"));

        JLabel lblIcono = new JLabel(icono);

        JPanel pnlIcono = new JPanel(new BorderLayout());
        pnlIcono.setBackground(Color.WHITE);
        //pnlIcono.setBorder(new EmptyBorder(20, 0, 0, 0)); 
        pnlIcono.add(lblIcono);

        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        JPanel pnlBotonHome = new JPanel();
        pnlBotonHome.setBackground(Color.WHITE);
        pnlBotonHome.setBorder(new EmptyBorder(30, 0, 0, 0));
        btnBoton = new ButtonHover();
        pnlBotonHome.add(btnBoton);

        addPropiedades();

        pnlMenuIzquierda = new JPanel(new GridLayout(8, 1));
        pnlMenuIzquierda.setBackground(Color.WHITE);
        pnlMenuIzquierda.add(pnlIcono);
        pnlMenuIzquierda.add(pnlBotonHome);

        pnlMenuNavegacion = new JPanel(new BorderLayout());
        //NAVEGACION 

        JPanel pnlMenuNavegacionNorte = new JPanel(new FlowLayout());
        JPanel pnlMenuNavegacionBotones = new JPanel(new BorderLayout());
        //FLOWLAYOUT.LEFT, 50, 0 MANEJA LOS ESPACIOS ENTRE COMPONENTES
        JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.LEFT,40, 0));
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(20, leftPadding, bottomPadding, rightPadding));
        pnlBotones.setBackground(Color.WHITE);
        ImageIcon imgPlanta = new ImageIcon(FramesMenuPrincipal.class.getResource("/images/plant1.png"));
        ImageIcon imgSack = new ImageIcon(FramesMenuPrincipal.class.getResource("/images/sack1.png"));
        ImageIcon imgCompost = new ImageIcon(FramesMenuPrincipal.class.getResource("/images/compost1.png"));
        ImageIcon imgPot = new ImageIcon(FramesMenuPrincipal.class.getResource("/images/po1.png"));

        btnPlantas = new RoundedButton("PLANTAS", imgPlanta, 30);
        //SPRINT MODIFICAR SIZE DE CADA BOTON
        // btnPlantas.setBorder(BorderFactory.createEmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        btnSacos = new RoundedButton("SACOS", imgSack, 30);
        btnAbonos = new RoundedButton("ABONOS", imgCompost, 30);
        btnMacetas = new RoundedButton("MACETAS", imgPot, 30);

        btnPlantas.setBackground(v2);
        btnPlantas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPlantas.setFont(new Font("Arial", Font.BOLD, 12));

        btnSacos.setBackground(v2);
        btnSacos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSacos.setFont(new Font("Arial", Font.BOLD, 12));

        btnAbonos.setBackground(v2);
        btnAbonos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAbonos.setFont(new Font("Arial", Font.BOLD, 12));

        btnMacetas.setBackground(v2);
        btnMacetas.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMacetas.setFont(new Font("Arial", Font.BOLD, 12));
        //Agregar Botones 
        pnlBotones.add(btnPlantas);
        pnlBotones.add(btnSacos);
        pnlBotones.add(btnAbonos);
        pnlBotones.add(btnMacetas);

        pnlMenuNavegacionBotones.add(pnlBotones, BorderLayout.NORTH);

        pnlMenuNavegacionNorte.setBackground(Color.WHITE);
        //Variable cuenta.nombre; 
        JLabel lblBienvenido = new JLabel("  Bienvenido Gabriel");
        lblBienvenido.setFont(new Font("Arial", Font.PLAIN, 30));
        txtBusqueda = new RoundedTextField(26, 15);
        txtBusqueda.setBackground(gris);
        pnlMenuNavegacionNorte.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 10));
        JLabel lblSpace = new JLabel("                   ");

        pnlMenuNavegacionNorte.add(lblBienvenido);
        pnlMenuNavegacionNorte.add(lblSpace);
        pnlMenuNavegacionNorte.add(txtBusqueda);

        pnlMenuNavegacion.add(pnlMenuNavegacionNorte, BorderLayout.NORTH);
        pnlMenuNavegacion.add(pnlMenuNavegacionBotones, BorderLayout.CENTER);

        pnlRuletaOrden = new JPanel(new BorderLayout());
        pnlRuletaOrden.setBackground(Color.WHITE);
        JPanel pnlOrden = new JPanel();
        pnlOrden.setBackground(Color.WHITE);

        JLabel lblOrden = new JLabel("Orden Actual");
        lblOrden.setFont(new Font("Arial", Font.BOLD, 24));

        lblOrden.setBorder(BorderFactory.createEmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));

        pnlOrden.add(lblOrden);

        pnlRuletaOrden.add(pnlOrden, BorderLayout.NORTH);

        contentPane.add(pnlMenuIzquierda, BorderLayout.WEST);
        contentPane.add(pnlMenuNavegacion, BorderLayout.CENTER);
        contentPane.add(pnlRuletaOrden, BorderLayout.EAST);

    }

    private void addPropiedades() {

        btnBoton.setIcon(new ImageIcon(FramesMenuPrincipal.class.getResource("/images/iconoHome.png")));
        btnBoton.setContentAreaFilled(false);
        btnBoton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnBoton.setBounds(273, 137, 169, 128);
    }

}
