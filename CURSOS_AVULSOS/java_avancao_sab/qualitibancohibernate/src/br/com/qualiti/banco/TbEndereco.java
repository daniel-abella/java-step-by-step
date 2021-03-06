package br.com.qualiti.banco;

// Generated 02/03/2013 15:39:02 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * TbEndereco generated by hbm2java
 */
@Entity
@Table(name = "tb_endereco", catalog = "qualitibanco")
public class TbEndereco implements java.io.Serializable {

	private String tbClienteCpf;
	private TbCliente tbCliente;
	private String cep;
	private String numero;
	private String complemento;

	public TbEndereco() {
	}

	public TbEndereco(TbCliente tbCliente) {
		this.tbCliente = tbCliente;
	}

	public TbEndereco(TbCliente tbCliente, String cep, String numero,
			String complemento) {
		this.tbCliente = tbCliente;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "tbCliente"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "tb_cliente_cpf", unique = true, nullable = false, length = 11)
	public String getTbClienteCpf() {
		return this.tbClienteCpf;
	}

	public void setTbClienteCpf(String tbClienteCpf) {
		this.tbClienteCpf = tbClienteCpf;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public TbCliente getTbCliente() {
		return this.tbCliente;
	}

	public void setTbCliente(TbCliente tbCliente) {
		this.tbCliente = tbCliente;
	}

	@Column(name = "cep", length = 8)
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Column(name = "numero", length = 5)
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Column(name = "complemento", length = 100)
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
