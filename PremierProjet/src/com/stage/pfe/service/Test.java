package com.stage.pfe.service;

import java.util.ArrayList;
import java.util.List;

import com.stage.pfe.persistance.Personne;

public class Test {

	public static void main(String[] args) {
		PersonneService ser = new PersonneService();
		List<Personne> l = new ArrayList<Personne>(0);

		l = ser.recherchePersonne();
		for (int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));
		System.out.println("test1");
	}

}
