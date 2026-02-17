package com.balitechy.spacewar.main.rendering.vectorial;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Random;

import com.balitechy.spacewar.main.rendering.BackgroundRendererInterface;

/**
 * Renderer vectorial del fondo usando primitivas geométricas.
 * Dibuja un fondo espacial con estrellas generadas proceduralmente.
 */
public class VectorialBackgroundRenderer implements BackgroundRendererInterface {
    
    protected Color backgroundColor = Color.BLACK;
    protected Color starColor = Color.WHITE;
    
    // Posiciones de estrellas generadas aleatoriamente
    private int[][] stars;
    private boolean initialized = false;
    
    private void initStars(int width, int height) {
        if (!initialized) {
            Random rand = new Random(42); // Seed fijo para consistencia
            stars = new int[100][3]; // 100 estrellas con x, y, tamaño
            for (int i = 0; i < stars.length; i++) {
                stars[i][0] = rand.nextInt(width);   // x
                stars[i][1] = rand.nextInt(height);  // y
                stars[i][2] = rand.nextInt(3) + 1;   // tamaño (1-3)
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
