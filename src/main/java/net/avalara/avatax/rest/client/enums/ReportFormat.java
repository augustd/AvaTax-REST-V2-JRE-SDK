import java.util.HashMap;

package net.avalara.avatax.rest.client.enums;

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
 * Different types of formats allowed for exporting a report
 */
public enum ReportFormat {
	
    /** 
     * The Comma Separated Values file format
     */
    CSV(0),

    /** 
     * The Extensible Markup Language file format
     */
    XML(1),

    /**
     * Integer value for ReportFormat
     */
    public final int Value;

    private ReportFormat(int value) {
		Value = value;
    }
	
	/**
	 * Map ReportFormat to ReportFormat integer ID.
	 */
	 private static final Map<Integer, ReportFormat> _map = new HashMap<Integer, ReportFormat>();
	 static
	 {
		 for (ReportFormat modelName : ReportFormat.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get ReportFormat from value 
	  */
	 public static ReportFormat from(int value)
	 {
		 return _map.get(value);
	 }
}
