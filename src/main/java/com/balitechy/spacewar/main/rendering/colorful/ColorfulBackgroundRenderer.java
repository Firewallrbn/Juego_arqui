package com.balitechy.spacewar.main.rendering.colorful;

import java.awt.Color;

import com.balitechy.spacewar.main.rendering.vectorial.VectorialBackgroundRenderer;

/**
 * Renderer colorido del fondo que hereda de VectorialBackgroundRenderer.
 * Aplica el principio DRY: solo cambia los colores, reutiliza la lógica de dibujo.
 */
public class ColorfulBackgroundRenderer extends VectorialBackgroundRenderer {
    
    public ColorfulBackgroundRenderer() {
        // Solo modificamos los colores, la lógica de dibujo se hereda
        this.backgroundColor = new Color(25, 25, 112);   // Azul medianoche
        this.starColor = new Color(255, 215, 0);         // Dorado
    }
}
