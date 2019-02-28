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
 */

/**
 * Types of jurisdiction referenced in a transaction
 */
public enum JurisTypeId {
    /** 
     * State
     */
    STA(1),

    /** 
     * County
     */
    CTY(2),

    /** 
     * City
     */
    CIT(3),

    /** 
     * Special
     */
    STJ(4),

    /** 
     * Country
     */
    CNT(5);

    private int value;
	private static Map map = new HashMap<>();
	
	private JurisTypeId(int value) {
		this.value = value;
	}
	
	static {
		for (JurisTypeId enumName : JurisTypeId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static JurisTypeId valueOf(int intValue) {
		return (JurisTypeId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
