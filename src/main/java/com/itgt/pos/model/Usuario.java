package com.itgt.pos.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tt_usuario")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "usuario")
  private String usuario;

  @Column(name = "password")
  private String password;
  
  @Column(name = "id_estado")
  private String estado;
  
  @ManyToOne
  @JoinColumn(name = "sucursal_id")
  private Sucursal sucursal;

  public Usuario() {

  }

  public Usuario(String nombre, String usuario, String password) {
    this.nombre = nombre;
    this.usuario = usuario;
    this.password = password;
  }

  public long getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

public void setSucursal(Sucursal sucursal) {
	this.sucursal = sucursal;
}

public void setId(long id) {
	this.id = id;
}

@Override
  public String toString() {
    return "Usuario [id=" + id + ", nombre=" + nombre + ", desc=" + usuario + ", password=" + password + "]";
  }
}
