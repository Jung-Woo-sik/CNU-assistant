package com.cscnu.Simulation;

public class SimClient implements Client { 
	private int id;
	private int arrivalTime = -1;
	private int startTime = -1;
	private int stopTime = -1;
	public SimClient (int id, int t) {
		this.id = id;
		this.arrivalTime = t;
		System.out.println(this + " arrived at time " + t);
	}
	public int getStartTime() {
		return startTime;
	}
	public int getStopTime() {
		return stopTime;
	}
	public void setStartTime(int t) {
		startTime = t;
	}
	public void setStopTime(int t) {
		stopTime = t;
	}
	public String toString() {
		return "Client " + id;
	}
}
