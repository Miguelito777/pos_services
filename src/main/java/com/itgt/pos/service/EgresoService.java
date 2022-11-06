package com.itgt.pos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgt.pos.manager.EgresoRepository;
import com.itgt.pos.model.Egreso;

@Service
public class EgresoService {
	
	@Autowired
	private EgresoRepository repo;

	public List<Egreso> getAll() throws Exception{
		List<Egreso> items = new ArrayList<Egreso>();
		try {
			items = repo.findAll();	
		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
		return items;
	}
	
	public Egreso getItemById(Long id) throws Exception{
		Egreso item;
		try {
			item = repo.findById(id).get();
		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
		return item;
	}
	
	public Egreso addItem(Egreso data) throws Exception{
		Egreso item = new Egreso();
		try {
			item = repo.save(data);
		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
		return item;
	}
	
	public void delItem(Long id) throws Exception{
		try {
			repo.deleteById(id);
		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}	
}