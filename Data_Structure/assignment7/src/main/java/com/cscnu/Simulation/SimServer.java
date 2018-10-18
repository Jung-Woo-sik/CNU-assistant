package com.cscnu.Simulation;

public class SimServer implements Server {
	private int id;
	private int meanServiceTime;
	private int stopTime = -1;
	private Client client;
	private java.util.Random random;

	public SimServer(int id, int meanServiceTime) {
		this.id = id;
		this.meanServiceTime = meanServiceTime;
		this.random = new ExponentialRandom(meanServiceTime);
	}
	public int getMeanServiceTime() {
		return meanServiceTime;
	}
	public int getStopTime() {
		return stopTime;
	}
	public boolean isIdle() {
		return (client == null);
	}
	public void startServing(Client client, int t) {
		this.client = client;
		this.client.setStartTime(t);
		this.stopTime = t + random.nextInt();
		System.out.println(this + " started serving " + client + " at time " + t + ", and will finish at time " + stopTime);
	}
	public void stopServing(int t) {
		client.setStopTime(t);
		System.out.println(this + " stopped serving " + client + " at time " + t);
		client = null;
	}
	public String toString() {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return "Server " + s.charAt(id);
	}
}
