package com.rk.graphdemo;

import java.util.HashMap;
import java.util.Map;

public class MyGraphWeighted<T> {

	private Map<T, Map<T,Integer>> map=new HashMap<>();

	public void addNewVertex(T vertex) {
		map.put(vertex, new HashMap<T, Integer>());
	}

	public void addNewEdge(T sourceVertex,T destinationVertex,int weight, boolean bidirectional) {

		if(!map.containsKey(sourceVertex))
			addNewVertex(sourceVertex);

		if(!map.containsKey(destinationVertex))
			addNewVertex(destinationVertex);

		map.get(sourceVertex).put(destinationVertex,weight);

		if(bidirectional)
			map.get(destinationVertex).put(sourceVertex,weight);
	}

	public void displayGraph() {
		System.out.println("Source City ------> List of Destination Cities(Distance in KMs)");
		System.out.println("===========================================================================");
		for(T vertex: map.keySet()) {
			System.out.print(vertex + " ------> ");
			HashMap<T, Integer> link = (HashMap<T, Integer>) map.get(vertex);
			for(T value : link.keySet()) {
				System.out.print(value + "(" + link.get(value) + ")\t");
			}
			System.out.println();
		}
	}
	public void getVertexCount() {
		System.out.println("The graph has " + map.size() + " vertices");
	}
	public void getEdgeCount(boolean bidirectional) {
		int edges = 0;
		for(T vertex: map.keySet()) {
			int size = map.get(vertex).size();
			edges += size;
		}
		if(bidirectional)
			edges /= 2;
		System.out.println("The graph has " + edges + " egdes");
	}
	public int getDistance(T source, T destination)throws NullPointerException {
		return map.get(source).get(destination);
	}
	public static void main(String[] args) {
		MyGraphWeighted<String> graph = new MyGraphWeighted<String>();
		graph.addNewEdge("Lucknow", "Delhi",500, true);
		graph.addNewEdge("Lucknow", "Kanpur",95, true);
		graph.addNewEdge("Prayagraj", "Lucknow",200, true);
		graph.addNewEdge("Delhi", "Gorakhpur",750, true);
		graph.addNewEdge("Gorakhpur", "Lucknow",250, true);
		graph.addNewEdge("Prayagraj", "Kanpur",250, true);

		graph.displayGraph();
		System.out.println();

		try {
			System.out.println("Distance between Lucknow and Kanpur: " + graph.getDistance("Lucknow", "Kanpur"));
			System.out.println("Distance between Delhi and Kanpur: " + graph.getDistance("Delhi", "Kanpur"));
		}catch(NullPointerException e) {
			System.out.println("No link found between the two cities");
		}
	}
}
