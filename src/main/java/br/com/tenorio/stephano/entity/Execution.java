package br.com.tenorio.stephano.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.StringUtils;

@Entity
@Table(name = "TB_EXECUTION")
public class Execution  implements Serializable {
	
	private static final long serialVersionUID = -7759530795566011923L;

	@Id
	@Column(name = "ID_EXECUTION")
	private Integer id;
	
	@Column(name = "DT_LAST_EXECUTION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfLastExecution;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateOfLastExecution() {
		return dateOfLastExecution;
	}

	public void setDateOfLastExecution(Date dateOfLastExecution) {
		this.dateOfLastExecution = dateOfLastExecution;
	}
	
	public String getDateOfLastExecutionFormated() {
		try {
			return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("pt", "BR")).format(getDateOfLastExecution());
		} catch (Exception e) {
			return StringUtils.EMPTY;
		}
	}
}
