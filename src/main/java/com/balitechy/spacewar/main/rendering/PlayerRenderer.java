package com.balitechy.spacewar.main.rendering;

import java.awt.Graphics;

/**
 * Interfaz para renderizar el jugador.
 * Parte del patrón Abstract Factory para desacoplar la lógica del juego de su visualización.
 */
public interface PlayerRenderer {
    
    /**
     * Renderiza el jugador en la posición especificada.
     * @param g El contexto gráfico donde dibujar
     * @param x Posición X del jugador
     * @param y Posición Y del jugador
     * @param width Ancho del jugador
     * @param height Alto del jugador
     */
    void render(Graphics g, double x, double y, int width, int height);
}
