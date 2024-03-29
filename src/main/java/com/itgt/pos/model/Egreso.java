package com.itgt.pos.model;

import java.sql.Date;
import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "egreso")
public class Egreso {
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
    
    @Column(name = "total_egreso")
    private String total_egreso;
    
    @Column(name = "estado")
    private int estado;
    
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    
    @OneToMany(mappedBy="egreso")
    @JsonManagedReference
    private List<DetalleEgreso> items;
    
    @OneToMany(mappedBy="egreso")
    @JsonManagedReference(value="pagos")
    private List<Pago> pagos;
    
    @Column(name = "fecha_egreso")
    private OffsetDateTime fechaegreso;
    
    @Column(name = "tipo_pago")
    private int tipopago;
    
    @Column(name = "pago_pendiente")
    private float pagopendiente;
    
    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;
    
    @Column(name = "comentario")
    private String comentario;
    
    @Column(name = "pago_recibido")
    private float pago;   
    
    @Column(name = "cambio")
    private float cambio;
    
    public Egreso() {

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

    public String getTotal_egreso() {
        return total_egreso;
    }

    public void setTotal_egreso(String total_egreso) {
        this.total_egreso = total_egreso;
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

	public List<DetalleEgreso> getItems() {
		return items;
	}

	public void setItems(List<DetalleEgreso> items) {
		this.items = items;
	}

	public OffsetDateTime getFechaegreso() {
		return fechaegreso;
	}

	public void setFechaegreso(OffsetDateTime fechaegreso) {
		this.fechaegreso = fechaegreso;
	}

	public int getTipopago() {
		return tipopago;
	}

	public void setTipopago(int tipopago) {
		this.tipopago = tipopago;
	}

	public List<Pago> getPagos() {
		return pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}

	public float getPagopendiente() {
		return pagopendiente;
	}

	public void setPagopendiente(float pagopendiente) {
		this.pagopendiente = pagopendiente;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public float getPago() {
		return pago;
	}

	public void setPagorecibido(float pago) {
		this.pago = pago;
	}

	public float getCambio() {
		return cambio;
	}

	public void setCambio(float cambio) {
		this.cambio = cambio;
	}
	
	

}
