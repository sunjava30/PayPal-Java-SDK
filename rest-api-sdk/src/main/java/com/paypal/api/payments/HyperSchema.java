package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class HyperSchema  extends PayPalModel {

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * 
	 */
	private String fragmentResolution;

	/**
	 * 
	 */
	private Boolean readonly;

	/**
	 * 
	 */
	private String contentEncoding;

	/**
	 * 
	 */
	private String pathStart;

	/**
	 * 
	 */
	private String mediaType;

	/**
	 * Default Constructor
	 */
	public HyperSchema() {
	}
}
