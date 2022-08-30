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
 * Filing Request Status types
 */
public enum FilingRequestStatus {
    /** 
     * Customer is building a request for a new filing calendar
     */
    New(1),

    /** 
     * Customer’s information validated before submitting to go live. All required information as per state and form selection is entered.
     */
    Validated(2),

    /** 
     * Customer submitted a request for a new filing calendar
     */
    Pending(3),

    /** 
     * Filing calender is active
     */
    Active(4),

    /** 
     * Customer requested to deactivate filing calendar
     */
    PendingStop(5),

    /** 
     * Filing calendar is inactive
     */
    Inactive(6),

    /** 
     * This indicates that there is a new change request.
     */
    ChangeRequest(7),

    /** 
     * This indicates that the change request was approved.
     */
    RequestApproved(8),

    /** 
     * This indicates that compliance rejected the request.
     */
    RequestDenied(9);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private FilingRequestStatus(int value) {
		this.value = value;
	}
	
	static {
		for (FilingRequestStatus enumName : FilingRequestStatus.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static FilingRequestStatus valueOf(int intValue) {
		return (FilingRequestStatus) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
