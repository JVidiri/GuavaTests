package com.edu.guavaapi;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class ExemploBimap {
	public static void main(String[] args) {
		BiMap<String, Integer> userId = HashBiMap.create();
		//adicionando
		userId.put("Eu", 10);
		userId.put("Eu", 11);//erro pois ela suporta apenas um dado
		userId.forcePut("Eu", 11);//mas com o forceput ela apaga os dados anteriores
		
		int idForUser = userId.get("Eu");//recuperando o value pelo key
		String userForId = userId.inverse().get(11);//recuperando key, pelo value
		
		//printando o resultado da pesquisa
		System.out.println("key = "+userForId+"| value = "+idForUser);
		
		userId.remove(userForId);
		//userId.inverse().remove(11);
		
		//verificando remoção
		userForId = userId.inverse().get(11);		
		if(null == userForId){
			System.out.println("Excluiu mesmo...");
		}
	}
}
