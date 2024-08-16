/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class RoundedTextField extends JTextField {

    private final int borderRadius;
    private final Color paleta = new Color(0xdbedff);

    public RoundedTextField(int columns, int borderRadius) {
        super(columns);
        this.borderRadius = borderRadius;
        setOpaque(false); 
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); 
    
        setBackground(paleta);

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);
        super.paintComponent(g2);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        // No pintamos el borde, ya que el borde redondeado está incluido en paintComponent
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension preferredSize = super.getPreferredSize();
        int height = 40; // ajusta este valor según sea necesario
        return new Dimension(preferredSize.width, height);
    }

}


