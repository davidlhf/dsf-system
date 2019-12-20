package com.dsfsys.pub.exception;

public class ConcrrentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8176226765268007632L;

	private String err_code;
	
	private String err_msg;
	
	private String err_func;

	public ConcrrentException(String err_code, String err_msg, String err_func) {
		super(err_msg);
		this.err_code = err_code;
		this.err_msg = err_msg;
		this.err_func = err_func;
	}

	public String getErr_code() {
		return err_code;
	}

	public void setErr_code(String err_code) {
		this.err_code = err_code;
	}

	public String getErr_msg() {
		return err_msg;
	}

	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}

	public String getErr_func() {
		return err_func;
	}

	public void setErr_func(String err_func) {
		this.err_func = err_func;
	}
	
	
}
