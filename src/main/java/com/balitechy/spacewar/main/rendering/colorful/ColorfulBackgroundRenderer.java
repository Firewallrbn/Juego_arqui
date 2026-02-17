package com.balitechy.spacewar.main.rendering.colorful;

import java.awt.Color;

import com.balitechy.spacewar.main.rendering.vectorial.VectorialBackgroundRenderer;


// Renderer colorido del fondo que hereda de VectorialBackgroundRenderer.

public class ColorfulBackgroundRenderer extends VectorialBackgroundRenderer {
    
    public ColorfulBackgroundRenderer() {
        // Solo modificamos los colores
        this.backgroundColor = new Color(25, 25, 112);   
        this.starColor = new Color(255, 215, 0);         
    }
}
