package br.com.qualiti.banco;

// Generated 02/03/2013 15:39:02 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TbConta generated by hbm2java
 */
@Entity
@Table(name = "tb_conta", catalog = "qualitibanco")
public class TbConta implements java.io.Serializable {

	private Integer id;
	private TbCliente tbCliente;
	private String numero;
	private BigDecimal saldo;
	private Byte tipo;

	public TbConta() {
	}

	public TbConta(TbCliente tbCliente, String numero, BigDecimal saldo,
			Byte tipo) {
		this.tbCliente = tbCliente;
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tb_cliente_cpf")
	public TbCliente getTbCliente() {
		return this.tbCliente;
	}

	public void setTbCliente(TbCliente tbCliente) {
		this.tbCliente = tbCliente;
	}

	@Column(name = "numero", length = 10)
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Column(name = "saldo", precision = 16, scale = 4)
	public BigDecimal getSaldo() {
		return this.saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Column(name = "tipo")
	public Byte getTipo() {
		return this.tipo;
	}

	public void setTipo(Byte tipo) {
		this.tipo = tipo;
	}

}