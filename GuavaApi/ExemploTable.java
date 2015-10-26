package com.edu.guavaapi;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class ExemploTable {

	public static void main(String[] args) {
		//criando a estrutura
		Table<String, String, Double> weightedGraph = HashBasedTable.create();
		weightedGraph.put("A100", "A200", 4.0);
		weightedGraph.put("A100", "B300", 20.0);
		weightedGraph.put("A200", "B300", 5.0);
	
		//procurando por falores primeiro na linha e depois na coluna
		weightedGraph.row("A200"); // returns a Map mapping v2 to 4, v3 to 20
		weightedGraph.column("B300"); // returns a Map mapping v1 to 20, v2 to 5
		//removendo uma das chaves
		weightedGraph.remove("A200", "B300");		
	}	
}
