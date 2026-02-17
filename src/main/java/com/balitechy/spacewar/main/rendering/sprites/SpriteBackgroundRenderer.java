package com.balitechy.spacewar.main.rendering.sprites;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import com.balitechy.spacewar.main.SpritesImageLoader;
import com.balitechy.spacewar.main.rendering.BackgroundRendererInterface;


 // Renderer del fondo usando sprites (imágenes).
 
public class SpriteBackgroundRenderer implements BackgroundRendererInterface {
    
    private BufferedImage background;
    private boolean loaded = false;
    
    @Override
    public void render(Graphics g, Canvas c) throws IOException {
        if (!loaded) {
            SpritesImageLoader bg = new SpritesImageLoader("/bg.png");
            bg.loadImage();
            background = bg.getImage(0, 0, 640, 480);
            loaded = true;
        }
        g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
    }
}
