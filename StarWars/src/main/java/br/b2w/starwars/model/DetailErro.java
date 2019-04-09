package br.b2w.starwars.model;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DetailErro implements Serializable {
	private static final long serialVersionUID = 3363639931787440448L;

	private Integer statusCode;
	private String statusMessage;
	private String httpMethod;
	private String erro;
	private String detail;
	private String path;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private DetailErro erro;

		Builder() {
			this.erro = new DetailErro();
		}

		public Builder addStatus(HttpStatus status) {
			this.erro.statusCode = status.value();
			this.erro.statusMessage = status.getReasonPhrase();
			return this;
		}

		public Builder addHttpMethod(String method) {
			this.erro.httpMethod = method;
			return this;
		}

		public Builder addErro(String erro) {
			this.erro.erro = erro;
			return this;
		}

		public Builder addDetail(String detail) {
			this.erro.detail = detail;
			return this;
		}

		public Builder addPath(String path) {
			this.erro.path = path;
			return this;
		}

		public DetailErro build() {
			return this.erro;
		}
	}
}