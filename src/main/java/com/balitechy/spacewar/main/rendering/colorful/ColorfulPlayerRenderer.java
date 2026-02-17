package com.balitechy.spacewar.main.rendering.colorful;

import java.awt.Color;

import com.balitechy.spacewar.main.rendering.vectorial.VectorialPlayerRenderer;

/**
 * Renderer colorido del jugador que hereda de VectorialPlayerRenderer.
 * Aplica el principio DRY: solo cambia los colores, reutiliza la lógica de dibujo.
 */
public class ColorfulPlayerRenderer extends VectorialPlayerRenderer {
    
    public ColorfulPlayerRenderer() {
        // Solo modificamos los colores, la lógica de dibujo se hereda
        this.shipColor = new Color(50, 205, 50);    // Verde lima
        this.cockpitColor = new Color(255, 69, 0);  // Rojo-naranja
    }
}
