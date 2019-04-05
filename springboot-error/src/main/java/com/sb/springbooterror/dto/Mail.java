/**
 * 
 */
package com.sb.springbooterror.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author 王锐
 * @date 2018年12月6日下午4:10:51
 * @package_name com.sb.springbooterror.dto
 * @project_name springboot-error
 */
@Configuration
@ConfigurationProperties(prefix = "mail")
@PropertySource("classpath:config/mail.properties")
@Component
public class Mail {

	private String auth;
    private String host;
    private String protocol;
    private int port;
    private String name;
    private String password;
    private boolean ssl;
    private String charset;
    private String timeout;
	public Mail() {
		super();
	}
	public Mail(String auth, String host, String protocol, int port, String name, String password, boolean ssl,
			String charset, String timeout) {
		super();
		this.auth = auth;
		this.host = host;
		this.protocol = protocol;
		this.port = port;
		this.name = name;
		this.password = password;
		this.ssl = ssl;
		this.charset = charset;
		this.timeout = timeout;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean getSsl() {
		return ssl;
	}
	public void setSsl(boolean ssl) {
		this.ssl = ssl;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getTimeout() {
		return timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	
	
}
