package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PaymentExecution  extends PayPalModel {

	/**
	 * The ID of the Payer, passed in the `return_url` by PayPal.
	 */
	private String payerId;

	/**
	 * Carrier account id for a carrier billing payment. For a carrier billing payment, payer_id is not applicable.
	 */
	private String carrierAccountId;

	/**
	 * Transactional details including the amount and item details.
	 */
	private List<Transactions> transactions;

	/**
	 * Default Constructor
	 */
	public PaymentExecution() {
	}
}
