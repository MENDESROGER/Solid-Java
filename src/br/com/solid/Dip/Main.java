package br.com.solid.Dip;

import br.com.solid.Dip.payment.Payment;

public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.pay("250");
	}

}
