package com.paypal.api.payments;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class InvoiceAddress extends BaseAddress {
	
	private Phone phone;
}
