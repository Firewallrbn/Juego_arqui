package com.balitechy.spacewar.main.rendering.vectorial;

import com.balitechy.spacewar.main.rendering.BackgroundRendererInterface;
import com.balitechy.spacewar.main.rendering.BulletRenderer;
import com.balitechy.spacewar.main.rendering.GameElementsFactory;
import com.balitechy.spacewar.main.rendering.PlayerRenderer;

/**
 * Fábrica concreta que crea renderers vectoriales usando primitivas geométricas.
 * Este estilo dibuja el juego usando formas simples como líneas, rectángulos y óvalos.
 */
public class VectorialGameElementsFactory implements GameElementsFactory {
    
    @Override
    public PlayerRenderer createPlayerRenderer() {
        return new VectorialPlayerRenderer();
    }
    
    @Override
    public BulletRenderer createBulletRenderer() {
        return new VectorialBulletRenderer();
    }
    
    @Override
    public BackgroundRendererInterface createBackgroundRenderer() {
        return new VectorialBackgroundRenderer();
    }
}
