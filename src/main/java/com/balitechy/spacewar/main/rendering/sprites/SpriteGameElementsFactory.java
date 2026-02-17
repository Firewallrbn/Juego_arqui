package com.balitechy.spacewar.main.rendering.sprites;

import com.balitechy.spacewar.main.SpritesImageLoader;
import com.balitechy.spacewar.main.rendering.BackgroundRendererInterface;
import com.balitechy.spacewar.main.rendering.BulletRenderer;
import com.balitechy.spacewar.main.rendering.GameElementsFactory;
import com.balitechy.spacewar.main.rendering.PlayerRenderer;

/**
 * Fábrica concreta que crea renderers basados en sprites/imágenes.
 * Esta es la implementación original del juego.
 */
public class SpriteGameElementsFactory implements GameElementsFactory {
    
    private SpritesImageLoader sprites;
    
    public SpriteGameElementsFactory(SpritesImageLoader sprites) {
        this.sprites = sprites;
    }
    
    @Override
    public PlayerRenderer createPlayerRenderer() {
        return new SpritePlayerRenderer(sprites);
    }
    
    @Override
    public BulletRenderer createBulletRenderer() {
        return new SpriteBulletRenderer(sprites);
    }
    
    @Override
    public BackgroundRendererInterface createBackgroundRenderer() {
        return new SpriteBackgroundRenderer();
    }
}
