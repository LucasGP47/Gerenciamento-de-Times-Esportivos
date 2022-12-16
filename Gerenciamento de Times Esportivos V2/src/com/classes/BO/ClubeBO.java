package com.classes.BO;

import com.classes.DTO.Clube;
import com.classes.DAO.ClubeDAO;
import java.util.List;

public class ClubeBO {
	
	public List<Clube> consultaVerba(){
        ClubeDAO nomeDAO = new ClubeDAO();
        return nomeDAO.consultaVerba();
    }
	
	

}
