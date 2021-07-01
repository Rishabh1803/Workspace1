package com.rk.graphdemo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyGraph<T> {

	private Map<T, List<T>> map=new HashMap<>();
	
	public void addNewVertex(T vertex) {
		map.put(vertex, new LinkedList<T>());
	}
	
	public void addNewEdge(T sourceVertex,T destinationVertex,boolean bidirectional) {
		
		if(!map.containsKey(sourceVertex))
			addNewVertex(sourceVertex);
		
		if(!map.containsKey(destinationVertex))
			addNewVertex(destinationVertex);
		
		map.get(sourceVertex).add(destinationVertex);
		
		if(bidirectional)
			map.get(destinationVertex).add(sourceVertex);
	}
	
	public void displayGraph() {
		System.out.println("Vertex ------> List of connected members");
		System.out.println("==================================================================");
		for(T vertex: map.keySet()) {
			System.out.print(vertex + " ------> ");
			for(T link : map.get(vertex)) {
				System.out.print(link + "\t");
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
	public boolean isConnected(T source, T destination) {
		return map.get(source).contains(destination);
	}
	public static void main(String[] args) {
		MyGraph<String> graph = new MyGraph<String>();
		graph.addNewEdge("Sourav", "Tushar", true);
		graph.addNewEdge("Sourav", "Kriti", true);
		graph.addNewEdge("Tushar", "Kajal", true);
		graph.addNewEdge("Rishabh", "Tushar", true);
		graph.addNewEdge("Rishabh", "Kriti", true);
		graph.addNewEdge("Kajal", "Kriti", true);
		
		graph.displayGraph();
		graph.getVertexCount();
		graph.getEdgeCount(true);
		System.out.println("Connected Status: " + graph.isConnected("Rishabh", "Kriti"));
		System.out.println("Connected Status: " + graph.isConnected("Rishabh", "Sourav"));
	}
}
