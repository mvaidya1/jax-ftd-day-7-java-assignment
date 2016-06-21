package com.cooksys.butterpillar.model.buttuerP;

import com.cooksys.butterpillar.model.IButterpillar;

public class Butterpillar implements IButterpillar{
	
	private double length, leavesEaten;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLeavesEaten() {
		return leavesEaten;
	}

	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;
	}

	@Override
	public String toString() {
		return "Butterpillar [length=" + length + ", leavesEaten=" + leavesEaten + "]";
	}

	public Butterpillar() {
		super();

	}

	@Override
	public int compareTo(IButterpillar ButterP) {
		// TODO Auto-generated method stub
		if(this.length > ButterP.getLength()){
			return 1;
		}
		else if(this.length == ButterP.getLength()){
			if(this.leavesEaten > ButterP.getLeavesEaten())
		
			return 1;
		
		else if (this.leavesEaten == ButterP.getLeavesEaten())
		return 0;
	
			}
		
	return -1;	
	
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Butterpillar other = (Butterpillar) obj;
		if (Double.doubleToLongBits(leavesEaten) != Double.doubleToLongBits(other.leavesEaten))
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		return true;
	}
}