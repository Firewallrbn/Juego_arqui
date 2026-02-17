package com.balitechy.spacewar.main.rendering;


public interface GameElementsFactory {
    

    PlayerRenderer createPlayerRenderer();
    

    BulletRenderer createBulletRenderer();
    

    BackgroundRendererInterface createBackgroundRenderer();
}
