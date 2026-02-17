package com.balitechy.spacewar.main.rendering;

import java.awt.Canvas;
import java.awt.Graphics;
import java.io.IOException;

/**
 * Interfaz para renderizar el fondo del juego.
 * Parte del patrón Abstract Factory para desacoplar la lógica del juego de su visualización.
 */
public interface BackgroundRendererInterface {
    
    /**
     * Renderiza el fondo del juego.
     * @param g El contexto gráfico donde dibujar
     * @param c El canvas sobre el cual se dibuja
     * @throws IOException Si hay error al cargar recursos
     */
    void render(Graphics g, Canvas c) throws IOException;
}
