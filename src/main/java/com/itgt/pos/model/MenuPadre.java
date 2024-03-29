package com.itgt.pos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "menu_padre")
public class MenuPadre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private int estado;
    
    @Column(name = "classname")
    private String classname;
    
    @OneToMany(mappedBy="menupadre")
    @JsonManagedReference
    private List<MenuHijo> menuhijos;
    
    @Column(name = "orden")
    private int orden;

	public MenuPadre() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public List<MenuHijo> getMenuhijos() {
		return menuhijos;
	}

	public void setMenuhijos(List<MenuHijo> menuhijos) {
		this.menuhijos = menuhijos;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}
	
	
}
