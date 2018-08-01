package br.com.tenorio.stephano.entity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "TB_DEMAND")
public class Demand implements Serializable {

	private static final long serialVersionUID = 313697920925645437L;

	private static final Logger log = LoggerFactory.getLogger(Demand.class);
	
	@Id
	@Column(name = "ID_DEMAND")
	private String id;

	@Column(name = "ID_TRELLO")
	private String idTrello;

	@Column(name = "NM_DEMAND")
	private String name;

	@Column(name = "ST_SCUA")
	private String statusScua;

	@Column(name = "LT_COMMENT_SCUA", length = 5000)
	private String lastCommentScua;

	@Column(name = "DT_LAST_COMMENT_SCUA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLastCommentScua;

	@Column(name = "NM_USER")
	private String user;

	@Column(name = "ID_CLOSED")
	private boolean closed;

	public Demand(String id, String idTrello, String name, boolean closed) {
		this.id = id;
		this.idTrello = idTrello;
		this.name = name;
		this.closed = closed;
	}

	public Demand() {
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdTrello() {
		return idTrello;
	}

	public void setIdTrello(String idTrello) {
		this.idTrello = idTrello;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatusScua() {
		return statusScua;
	}

	public void setStatusScua(String statusScua) {
		this.statusScua = statusScua;
	}

	public String getLastCommentScua() {
		return lastCommentScua;
	}

	public void setLastCommentScua(String lastCommentScua) {
		this.lastCommentScua = lastCommentScua;
	}

	public Date getDateLastCommentScua() {
		return dateLastCommentScua;
	}

	public void setDateLastCommentScua(Date dateLastCommentScua) {
		this.dateLastCommentScua = dateLastCommentScua;
	}

	public void setDateLastCommentScua(String dateLastCommentScua) {
		try {
			setDateLastCommentScua(new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dateLastCommentScua));
		} catch (ParseException e) {
			log.warn("Error during the parsing of date of the last comment on the scua, date: {}", dateLastCommentScua);
		}
	}
	
	public String getDateLastCommentScuaFormatted() {
		try {
			return getDateLastCommentScua() != null ? new SimpleDateFormat("dd/MM/yyyy HH:mm").format(getDateLastCommentScua()) : StringUtils.EMPTY;
		} catch (Exception e) {
			return StringUtils.EMPTY;
		}
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Demand [id=");
		builder.append(id);
		builder.append(", idTrello=");
		builder.append(idTrello);
		builder.append(", name=");
		builder.append(name);
		builder.append(", statusScua=");
		builder.append(statusScua);
		builder.append(", lastCommentScua=");
		builder.append(lastCommentScua);
		builder.append(", dateLastCommentScua=");
		builder.append(dateLastCommentScua);
		builder.append(", user=");
		builder.append(user);
		builder.append(", closed=");
		builder.append(closed);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (closed ? 1231 : 1237);
		result = prime * result + ((dateLastCommentScua == null) ? 0 : dateLastCommentScua.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idTrello == null) ? 0 : idTrello.hashCode());
		result = prime * result + ((lastCommentScua == null) ? 0 : lastCommentScua.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((statusScua == null) ? 0 : statusScua.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) { //NOSONAR IGNORE IMPLEMENTATION OF EQUALS
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Demand other = (Demand) obj;
		if (closed != other.closed) {
			return false;
		}
		if (dateLastCommentScua == null) {
			if (other.dateLastCommentScua != null) {
				return false;
			}
		} else if (!dateLastCommentScua.equals(other.dateLastCommentScua)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (idTrello == null) {
			if (other.idTrello != null) {
				return false;
			}
		} else if (!idTrello.equals(other.idTrello)) {
			return false;
		}
		if (lastCommentScua == null) {
			if (other.lastCommentScua != null) {
				return false;
			}
		} else if (!lastCommentScua.equals(other.lastCommentScua)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (statusScua == null) {
			if (other.statusScua != null) {
				return false;
			}
		} else if (!statusScua.equals(other.statusScua)) {
			return false;
		}
		if (user == null) {
			if (other.user != null) {
				return false;
			}
		} else if (!user.equals(other.user)) {
			return false;
		}
		return true;
	}

}
