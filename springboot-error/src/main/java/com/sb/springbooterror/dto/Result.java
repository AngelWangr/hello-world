package com.sb.springbooterror.dto;

import java.io.Serializable;

/**
 * 页面响应Result
 *
 */
public class Result<T> implements Serializable {

	// 状态码
	private Integer code=200;

	// 状态消息
	private String message="成功";

	// 返回的数据
	private T rows=null;

	// 总行数
	private Integer total;

	// token
	private String token;

	public Result() {
		super();
	}

	public Result(Integer code, String message, T rows, Integer total, String token) {
		super();
		this.code = code;
		this.message = message;
		this.rows = rows;
		this.total = total;
		this.token = token;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getRows() {
		return rows;
	}

	public void setRows(T rows) {
		this.rows = rows;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", message=" + message + ", rows=" + rows + ", total=" + total + ", token="
				+ token + "]";
	}

	
}