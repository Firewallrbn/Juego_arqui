package com.balitechy.spacewar.main.rendering.colorful;

import java.awt.Color;

import com.balitechy.spacewar.main.rendering.vectorial.VectorialPlayerRenderer;


// Renderer colorido del jugador que hereda de VectorialPlayerRenderer.

public class ColorfulPlayerRenderer extends VectorialPlayerRenderer {
    
    public ColorfulPlayerRenderer() {
        
        this.shipColor = new Color(50, 205, 50);    
        this.cockpitColor = new Color(255, 69, 0);  
    }
}
