package com.cscnu.Simulation;

import com.cscnu.DLLQueue.*;

public class Simulation {
	private static final int MAX_SERVICE_TIME = 10000000;
	private static int numServers;
	private static int numClients;
	private static int meanServiceTime;
	private static int meanInterarrivalTime;
	private static Server[] servers;
	private static Client[] clients;
	private static Queue q = new DLLQueue();
	private static java.util.Random randomArrival;
	private static java.util.Random randomService;
	public static void main(String[] args) {
		init(args);
		int nextArrivalTime = randomArrival.nextInt();
		int i = 0;
		for (int t = 0; t < MAX_SERVICE_TIME; t++) {
			if (t == nextArrivalTime) {
				Client client = clients[i++] = new SimClient(i,t);
				q.EnqueueFront(client);
				System.out.println("The queue has " + q.size() + " clients.");
				if (i < numClients) nextArrivalTime = t + randomArrival.nextInt();
				else nextArrivalTime = -1;
			}
			for (int j=0; j<numServers; j++) {
				Server server = servers[j];
				if (t == server.getStopTime()) server.stopServing(t);
				if (server.isIdle() && (q.size()!=0)) {
					Client client = (SimClient)q.DequeueRear();
					System.out.println("The queue has " + q.size() + " clients.");
					server.startServing(client, t);
				}
			}
		}
		System.out.println("Service is over. Thank you for calling our service.");
	}
	static void init(String[] args) {
		if (args.length<4) {
			System.out.println("Usage: mvn exec:java -Dexec.class=\"com.cscnu.Simulation.Simulation\" -Dexec.args=\"<numServers> <numClients> <meanServiceTime> <meanInterarrivalTime>\"");
			System.out.println(" e.g. : mvn exec:java -Dexec.class=\"com.cscnu.Simulation.Simulation\" -Dexec.args=\"3 100 12 4\"");
			System.exit(0);
		}
		numServers = Integer.parseInt(args[0]);
		numClients = Integer.parseInt(args[1]);
		meanServiceTime = Integer.parseInt(args[2]);
		meanInterarrivalTime = Integer.parseInt(args[3]);
		servers = new Server[numServers];
		clients = new Client[numClients];
		randomService = new ExponentialRandom(meanServiceTime);
		randomArrival = new ExponentialRandom(meanInterarrivalTime);
		for (int j=0; j<numServers; j++)
			servers[j] = new SimServer(j, randomService.nextInt());
		System.out.println("Number of servers = " + numServers); 
		System.out.println("Number of clients = " + numClients); 
		System.out.println("Mean service time = " + meanServiceTime); 
		System.out.println("Mean interarrival time = "
				+ meanInterarrivalTime); 
		for (int j=0; j<numServers; j++)
			System.out.println("Mean service time for " + servers[j]
					+ " = "+ servers[j].getMeanServiceTime());   
	}
}
