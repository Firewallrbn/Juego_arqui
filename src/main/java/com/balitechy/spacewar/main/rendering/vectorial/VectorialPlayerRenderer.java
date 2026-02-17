package com.balitechy.spacewar.main.rendering.vectorial;

import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.rendering.PlayerRenderer;

/**
 * Renderer vectorial del jugador usando primitivas geométricas.
 * Dibuja el jugador como una nave espacial usando formas simples.
 */
public class VectorialPlayerRenderer implements PlayerRenderer {
    
    protected Color shipColor = Color.WHITE;
    protected Color cockpitColor = Color.CYAN;
    
    @Override
    public void render(Graphics g, double x, double y, int width, int height) {
        int ix = (int) x;
        int iy = (int) y;
        
        // Cuerpo principal de la nave (triángulo/polígono)
        g.setColor(shipColor);
        int[] xPoints = {
            ix + width / 2,      // Punta superior
            ix,                   // Esquina inferior izquierda
            ix + width / 4,       // Ala izquierda interior
            ix + width * 3 / 4,   // Ala derecha interior
            ix + width            // Esquina inferior derecha
        };
        int[] yPoints = {
            iy,                   // Punta superior
            iy + height,          // Esquina inferior izquierda
            iy + height * 2 / 3,  // Ala izquierda interior
            iy + height * 2 / 3,  // Ala derecha interior
            iy + height           // Esquina inferior derecha
        };
        g.fillPolygon(xPoints, yPoints, 5);
        
        // Cabina (óvalo)
        g.setColor(cockpitColor);
        g.fillOval(ix + width / 2 - 5, iy + height / 3, 10, 10);
        
        // Contorno
        g.setColor(Color.WHITE);
        g.drawPolygon(xPoints, yPoints, 5);
    }
}
