package br.com.qualiti.banco.hibernate;

// Generated 02/03/2013 14:55:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TbConta generated by hbm2java
 */
@Entity
@Table(name = "tb_conta", catalog = "qualitiBanco")
public class TbConta implements java.io.Serializable {

	private int id;
	private String tbClienteCpf;
	private String numero;
	private BigDecimal saldo;
	private Byte tipo;

	public TbConta() {
	}

	public TbConta(String tbClienteCpf, String numero, BigDecimal saldo,
			Byte tipo) {
		this.tbClienteCpf = tbClienteCpf;
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "tb_cliente_cpf", length = 11)
	public String getTbClienteCpf() {
		return this.tbClienteCpf;
	}

	public void setTbClienteCpf(String tbClienteCpf) {
		this.tbClienteCpf = tbClienteCpf;
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
