package com.balitechy.spacewar.main.rendering.vectorial;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Random;

import com.balitechy.spacewar.main.rendering.BackgroundRendererInterface;


// Renderer vectorial del fondo 
public class VectorialBackgroundRenderer implements BackgroundRendererInterface {
    
    protected Color backgroundColor = Color.BLACK;
    protected Color starColor = Color.WHITE;
    
// decoracion fondo
    private int[][] stars;
    private boolean initialized = false;
    
    private void initStars(int width, int height) {
        if (!initialized) {
            Random rand = new Random(42); 
            stars = new int[100][3];
            for (int i = 0; i < stars.length; i++) {
                stars[i][0] = rand.nextInt(width);   
                stars[i][1] = rand.nextInt(height);  
                stars[i][2] = rand.nextInt(3) + 1;   
            }
            initialized = true;
        }
    }
    
    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        int width = c.getWidth();
        int height = c.getHeight();
        
        initStars(width, height);
        
        // Fondo negro del espacio
        g.setColor(backgroundColor);
        g.fillRect(0, 0, width, height);
        
        // Dibujar estrellas
        g.setColor(starColor);
        for (int[] star : stars) {
            g.fillOval(star[0], star[1], star[2], star[2]);
        }
    }
}
