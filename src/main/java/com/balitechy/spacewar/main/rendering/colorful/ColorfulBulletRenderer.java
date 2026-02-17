package com.balitechy.spacewar.main.rendering.colorful;

import java.awt.Color;

import com.balitechy.spacewar.main.rendering.vectorial.VectorialBulletRenderer;

/**
 * Renderer colorido de balas que hereda de VectorialBulletRenderer.
 * Aplica el principio DRY: solo cambia los colores, reutiliza la lógica de dibujo.
 */
public class ColorfulBulletRenderer extends VectorialBulletRenderer {
    
    public ColorfulBulletRenderer() {
        // Solo modificamos los colores, la lógica de dibujo se hereda
        this.bulletColor = new Color(0, 255, 255);   // Cian brillante
        this.glowColor = new Color(138, 43, 226);    // Violeta
    }
}
