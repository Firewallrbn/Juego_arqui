package com.balitechy.spacewar.main;

import java.awt.Graphics;

import com.balitechy.spacewar.main.rendering.PlayerRenderer;

public class Player {
	
	private double x;
	private double y;
	
	private double velX;
	private double velY;
	
	public static final int WIDTH = 56;
	public static final int HEIGHT = 28;
	
	private PlayerRenderer renderer;
	private Game game;
	
	public Player(double x, double y, Game game, PlayerRenderer renderer){
		this.x = x;
		this.y = y;
		this.game = game;
		this.renderer = renderer;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setVelX(double velX) {
		this.velX = velX;
	}

	public void setVelY(double velY) {
		this.velY = velY;
	}
	
	public void shoot(){
		BulletController bullets = game.getBullets();
		Bullet b = new Bullet(x+(WIDTH/2)-5, y-18, bullets.getBulletRenderer());
		bullets.addBullet(b);
	}

	public void tick(){
		x += velX;
		y += velY;
		
		// To avoid player go outside the arena.		
		if(x <= 0)
			x = 0;
		if(x >= (Game.WIDTH * Game.SCALE) - WIDTH)
			x = (Game.WIDTH * Game.SCALE) - WIDTH;
		if(y <= 0)
			y = 0;
		if(y >= (Game.HEIGHT * Game.SCALE) - HEIGHT)
			y = (Game.HEIGHT * Game.SCALE) - HEIGHT;
	}
	
	public void render(Graphics g){
		renderer.render(g, x, y, WIDTH, HEIGHT);
	}
}
