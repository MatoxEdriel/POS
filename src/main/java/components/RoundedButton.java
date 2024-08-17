package components;

import javax.swing.JButton;
import javax.swing.Icon;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

public class RoundedButton extends JButton {

    private int radius;

    public RoundedButton(String text, Icon icon, int radius) {
        super(text, icon);
        this.radius = radius;
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);

        // Alinear el ícono a la izquierda del texto
        setHorizontalTextPosition(RIGHT); // El texto se posiciona a la derecha del ícono
        setHorizontalAlignment(LEFT); // Alinear el contenido (ícono + texto) hacia la izquierda del botón
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Color de fondo
        g2.setColor(getBackground());
        
        // Dibujar el rectángulo redondeado
        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), radius, radius));
        
        // Pintar el texto y el ícono
        super.paintComponent(g2);
        
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
    
    }
}
