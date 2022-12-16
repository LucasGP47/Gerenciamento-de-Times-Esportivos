package com.classes.main;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.ClubeBO;
import com.classes.DTO.Clube;

public class MainProcuraVerba {

	public static void main(String[] args) {
		
		ClubeBO playerBO = new ClubeBO();
		
		List<Clube> lista = new ArrayList<Clube>();
		
		lista = playerBO.consultaVerba();	
					
			System.out.println(lista.toString());
	
	}

	}

