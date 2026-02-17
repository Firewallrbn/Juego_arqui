package com.balitechy.spacewar.main.rendering;

import java.awt.Graphics;

/**
 * Interfaz para renderizar las balas.
 * Parte del patrón Abstract Factory para desacoplar la lógica del juego de su visualización.
 */
public interface BulletRenderer {
    
    /**
     * Renderiza una bala en la posición especificada.
     * @param g El contexto gráfico donde dibujar
     * @param x Posición X de la bala
     * @param y Posición Y de la bala
     * @param width Ancho de la bala
     * @param height Alto de la bala
     */
    void render(Graphics g, double x, double y, int width, int height);
}
