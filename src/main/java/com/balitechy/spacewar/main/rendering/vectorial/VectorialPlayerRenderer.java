package com.balitechy.spacewar.main.rendering.vectorial;

import java.awt.Color;
import java.awt.Graphics;

import com.balitechy.spacewar.main.rendering.PlayerRenderer;


public class VectorialPlayerRenderer implements PlayerRenderer {
    
    protected Color shipColor = Color.WHITE;
    protected Color cockpitColor = Color.CYAN;
    
    @Override
    public void render(Graphics g, double x, double y, int width, int height) {
        int ix = (int) x;
        int iy = (int) y;
        
        // Cuerpo de la nave 
        g.setColor(shipColor);
        int[] xPoints = {
            ix + width / 2,      
            ix,                  
            ix + width / 4,      
            ix + width * 3 / 4,   
            ix + width            
        };
        int[] yPoints = {
            iy,                  
            iy + height,          
            iy + height * 2 / 3,  
            iy + height * 2 / 3,  
            iy + height           
        };
        g.fillPolygon(xPoints, yPoints, 5);
        
        
        g.setColor(cockpitColor);
        g.fillOval(ix + width / 2 - 5, iy + height / 3, 10, 10);
        
        
        g.setColor(Color.WHITE);
        g.drawPolygon(xPoints, yPoints, 5);
    }
}
