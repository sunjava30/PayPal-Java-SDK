package com.paypal.api.payments;

import com.paypal.base.rest.PayPalResource;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @deprecated PaymentInstruction object is not available for public use.
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PaymentInstruction extends PayPalResource {

	/**
	 * ID of payment instruction
	 */
	private String referenceNumber;

	/**
	 * Type of payment instruction
	 */
	private String instructionType;

	/**
	 * Recipient bank Details.
	 */
	private RecipientBankingInstruction recipientBankingInstruction;

	/**
	 * Amount to be transferred
	 */
	private Currency amount;

	/**
	 * Date by which payment should be received
	 */
	private String paymentDueDate;

	/**
	 * Additional text regarding payment handling
	 */
	private String note;

	/**
	 * 
	 */
	private List<Links> links;

	/**
	 * Parameterized Constructor
	 */
	public PaymentInstruction(String referenceNumber, String instructionType, RecipientBankingInstruction recipientBankingInstruction, Currency amount) {
		this.referenceNumber = referenceNumber;
		this.instructionType = instructionType;
		this.recipientBankingInstruction = recipientBankingInstruction;
		this.amount = amount;
	}
}
