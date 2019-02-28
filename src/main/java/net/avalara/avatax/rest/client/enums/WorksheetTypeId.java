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
 * Filing worksheet Type
 */
public enum WorksheetTypeId {
    /** 
     * The original filing for a period
     */
    Original(0),

    /** 
     * Represents an amended filing for a period
     */
    Amended(1),

    /** 
     * Represents a test filing
     */
    Test(2);

    private int value;
	private static Map map = new HashMap<>();
	
	private WorksheetTypeId(int value) {
		this.value = value;
	}
	
	static {
		for (WorksheetTypeId enumName : WorksheetTypeId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static WorksheetTypeId valueOf(int intValue) {
		return (WorksheetTypeId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
