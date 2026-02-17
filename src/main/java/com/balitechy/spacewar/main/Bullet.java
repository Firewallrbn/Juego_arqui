package com.balitechy.spacewar.main;

import java.awt.Graphics;

import com.balitechy.spacewar.main.rendering.BulletRenderer;

public class Bullet {
	
	private double x;
	private double y;
	public static final int WIDTH = 11;
	public static final int HEIGHT = 21;
	private BulletRenderer renderer;
	
	public Bullet(double x, double y, BulletRenderer renderer){
		this.x = x;
		this.y = y;
		this.renderer = renderer;
	}
	
	public void tick(){
		y -= 5;
	}
	
	public void render(Graphics g){
		renderer.render(g, x, y, WIDTH, HEIGHT);
	}
	
	public double getY(){
		return y;
	}
}
