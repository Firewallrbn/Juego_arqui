package com.balitechy.spacewar.main.rendering.colorful;

import java.awt.Color;

import com.balitechy.spacewar.main.rendering.vectorial.VectorialBulletRenderer;


 // Renderer colorido de balas que hereda de VectorialBulletRenderer.

public class ColorfulBulletRenderer extends VectorialBulletRenderer {
    
    public ColorfulBulletRenderer() {
       
        this.bulletColor = new Color(0, 255, 255);  
        this.glowColor = new Color(138, 43, 226);    
    }
}
