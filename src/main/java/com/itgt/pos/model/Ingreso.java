package com.itgt.pos.model;

import java.sql.Date;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "ingreso")
public class Ingreso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "tipoComprobante")
    private int tipoComprobante;
    
    @Column(name = "serie_doc")
    private String serie_doc;
    
    @Column(name = "numero_doc")
    private String numero_doc;
    
    @Column(name = "fecha_doc")
    private Date fecha_doc;
    
    @Column(name = "impuesto")
    private float impuesto;
    
    @Column(name = "total_ingreso")
    private String total_ingreso;
    
    @Column(name = "estado")
    private int estado;
    
    @ManyToOne
    @JoinColumn(name="id_proveedor")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy="ingreso")
    @JsonManagedReference
    private List<DetalleIngreso> items;
    
    @ManyToOne
    @JoinColumn(name="id_sucursal")
    private Sucursal sucursal;
    
    @CreatedDate
    private Instant createdDate;
    
    @Column(name = "fecha_ingreso")
    private OffsetDateTime fechaingreso; 
    
    public Ingreso() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int gettipoComprobante() {
        return tipoComprobante;
    }

    public void settipoComprobante(int tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getSerie_doc() {
        return serie_doc;
    }

    public void setSerie_doc(String serie_doc) {
        this.serie_doc = serie_doc;
    }

    public String getNumero_doc() {
        return numero_doc;
    }

    public void setNumero_doc(String numero_doc) {
        this.numero_doc = numero_doc;
    }

    public Date getFecha_doc() {
        return fecha_doc;
    }

    public void setFecha_doc(Date fecha_doc) {
        this.fecha_doc = fecha_doc;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }



    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

	public List<DetalleIngreso> getItems() {
		return items;
	}

	public void setItems(List<DetalleIngreso> items) {
		this.items = items;
	}

	public String getTotal_ingreso() {
		return total_ingreso;
	}

	public void setTotal_ingreso(String total_ingreso) {
		this.total_ingreso = total_ingreso;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public OffsetDateTime getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(OffsetDateTime fechaingreso) {
		this.fechaingreso = fechaingreso;
	}
}
