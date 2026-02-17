package com.balitechy.spacewar.main.rendering.colorful;

import com.balitechy.spacewar.main.rendering.BackgroundRendererInterface;
import com.balitechy.spacewar.main.rendering.BulletRenderer;
import com.balitechy.spacewar.main.rendering.GameElementsFactory;
import com.balitechy.spacewar.main.rendering.PlayerRenderer;

/**
  Fábrica concreta que crea renderers vectoriales coloridos.
  Hereda la lógica de dibujo de las clases vectoriales base pero con colores personalizados.
  toda la lógica de dibujo se reutiliza de las clases Vectorial base.
 */
public class ColorfulVectorialGameElementsFactory implements GameElementsFactory {
    
    @Override
    public PlayerRenderer createPlayerRenderer() {
        return new ColorfulPlayerRenderer();
    }
    
    @Override
    public BulletRenderer createBulletRenderer() {
        return new ColorfulBulletRenderer();
    }
    
    @Override
    public BackgroundRendererInterface createBackgroundRenderer() {
        return new ColorfulBackgroundRenderer();
    }
}
