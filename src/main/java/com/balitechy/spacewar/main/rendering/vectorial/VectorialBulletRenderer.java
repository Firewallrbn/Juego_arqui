package com.balitechy.spacewar.main.rendering.vectorial;

import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.rendering.BulletRenderer;


public class VectorialBulletRenderer implements BulletRenderer {
    
    protected Color bulletColor = Color.YELLOW;
    protected Color glowColor = Color.ORANGE;
    
    @Override
    public void render(Graphics g, double x, double y, int width, int height) {
        int ix = (int) x;
        int iy = (int) y;
        
        // Resplandor exterior
        g.setColor(glowColor);
        g.drawLine(ix + width / 2, iy, ix + width / 2, iy + height);
        g.drawLine(ix + width / 2 - 1, iy + 2, ix + width / 2 - 1, iy + height - 2);
        g.drawLine(ix + width / 2 + 1, iy + 2, ix + width / 2 + 1, iy + height - 2);
        
        // Núcleo de la bala
        g.setColor(bulletColor);
        g.fillRect(ix + width / 2 - 2, iy, 4, height);
        
        // Punta brillante
        g.setColor(Color.WHITE);
        g.fillOval(ix + width / 2 - 3, iy - 2, 6, 6);
    }
}
