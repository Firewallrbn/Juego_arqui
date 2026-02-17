package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.util.LinkedList;

import com.balitechy.spacewar.main.rendering.BulletRenderer;

public class BulletController {
	private LinkedList<Bullet> bl = new LinkedList<Bullet>();
	private BulletRenderer bulletRenderer;
	
	public BulletController(BulletRenderer bulletRenderer) {
		this.bulletRenderer = bulletRenderer;
	}
	
	public BulletRenderer getBulletRenderer() {
		return bulletRenderer;
	}
	
	public void tick(){
		for(int i=0; i < bl.size(); i++){
			if(bl.get(i).getY() < 0){
				removeBullet(bl.get(i));
			}else{
				bl.get(i).tick();
			}
		}
	}
	
	public void render(Graphics g){
		for(int i=0; i < bl.size(); i++){
			bl.get(i).render(g);
		}
	}
	
	public void addBullet(Bullet bullet){
		bl.add(bullet);
	}
	
	public void removeBullet(Bullet bullet){
		bl.remove(bullet);
	}
}
