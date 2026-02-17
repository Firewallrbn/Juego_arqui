package com.balitechy.spacewar.main.rendering.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.SpritesImageLoader;
import com.balitechy.spacewar.main.rendering.PlayerRenderer;

/**
 * Renderer del jugador usando sprites (imágenes).
 */
public class SpritePlayerRenderer implements PlayerRenderer {
    
    private BufferedImage image;
    
    public SpritePlayerRenderer(SpritesImageLoader sprites) {
        // Obtener la imagen del jugador del sprite sheet
        this.image = sprites.getImage(219, 304, 56, 28);
    }
    
    @Override
    public void render(Graphics g, double x, double y, int width, int height) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}
