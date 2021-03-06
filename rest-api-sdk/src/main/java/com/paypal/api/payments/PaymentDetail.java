package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PaymentDetail  extends PayPalModel {

	/**
	 * PayPal payment detail indicating whether payment was made in an invoicing flow via PayPal or externally. In the case of the mark-as-paid API, payment type is EXTERNAL and this is what is now supported. The PAYPAL value is provided for backward compatibility.
	 */
	private String type;

	/**
	 * PayPal payment transaction id. Mandatory field in case the type value is PAYPAL.
	 */
	private String transactionId;

	/**
	 * Type of the transaction.
	 */
	private String transactionType;

	/**
	 * Date when the invoice was paid. Date format: yyyy-MM-dd z. For example, 2014-02-27 PST.
	 */
	private String date;

	/**
	 * Payment mode or method. This field is mandatory if the value of the type field is OTHER.
	 */
	private String method;

	/**
	 * Optional note associated with the payment.
	 */
	private String note;

	/**
	 * Default Constructor
	 */
	public PaymentDetail() {
	}

	/**
	 * Parameterized Constructor
	 */
	public PaymentDetail(String method) {
		this.method = method;
	}
}
