package com.balitechy.spacewar.main.rendering;

/**
 * Fábrica Abstracta para crear los elementos de renderizado del juego.
 * 
 * Este patrón permite cambiar el estilo visual completo del juego
 * simplemente cambiando la implementación de esta fábrica.
 * 
 * Implementaciones disponibles:
 * - SpriteGameElementsFactory: Estilo con sprites/imágenes
 * - VectorialGameElementsFactory: Estilo vectorial con primitivas geométricas
 * - ColorfulVectorialGameElementsFactory: Estilo vectorial con colores personalizados
 */
public interface GameElementsFactory {
    
    /**
     * Crea un renderer para el jugador.
     * @return Una instancia de PlayerRenderer
     */
    PlayerRenderer createPlayerRenderer();
    
    /**
     * Crea un renderer para las balas.
     * @return Una instancia de BulletRenderer
     */
    BulletRenderer createBulletRenderer();
    
    /**
     * Crea un renderer para el fondo.
     * @return Una instancia de BackgroundRendererInterface
     */
    BackgroundRendererInterface createBackgroundRenderer();
}
