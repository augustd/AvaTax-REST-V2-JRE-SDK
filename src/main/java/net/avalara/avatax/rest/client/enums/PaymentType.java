package net.avalara.avatax.rest.client.enums;
import java.util.HashMap;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 * Swagger name: AvaTaxClient
 */

/**
 * Indicates the type of payments
 */
public enum PaymentType {
    /** 
     * The payment is for the current payment
     */
    CurrentPeriod(0),

    /** 
     * The payment is a prepayment
     */
    Prepayment(1),

    /** 
     * The payment is a prior payment
     */
    PriorPayment(2),

    /** 
     * The payment is a prior CSP fee
     */
    PriorCspFee(3);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private PaymentType(int value) {
		this.value = value;
	}
	
	static {
		for (PaymentType enumName : PaymentType.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static PaymentType valueOf(int intValue) {
		return (PaymentType) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
