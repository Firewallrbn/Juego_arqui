package com.balitechy.spacewar.main.rendering;

import java.awt.Canvas;
import java.awt.Graphics;
import java.io.IOException;


public interface BackgroundRendererInterface {
    
    /**
     * Renderiza el fondo del juego.
     * @param g El contexto gráfico donde dibujar
     * @param c El canvas sobre el cual se dibuja
     * @throws IOException Si hay error al cargar recursos
     */
    void render(Graphics g, Canvas c) throws IOException;
}
