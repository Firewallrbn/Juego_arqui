package com.balitechy.spacewar.main.rendering.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.balitechy.spacewar.main.SpritesImageLoader;
import com.balitechy.spacewar.main.rendering.BulletRenderer;


 // Renderer de balas usando sprites (imágenes).
 
public class SpriteBulletRenderer implements BulletRenderer {
    
    private BufferedImage image;
    
    public SpriteBulletRenderer(SpritesImageLoader sprites) {

        this.image = sprites.getImage(35, 52, 11, 21);
    }
    
    @Override
    public void render(Graphics g, double x, double y, int width, int height) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}
