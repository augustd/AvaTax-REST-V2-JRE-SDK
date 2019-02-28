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
 * Tax type
 */
public enum TaxType {
	
    /** 
     * Match Lodging tax type
     */
    Lodging(6),

    /** 
     * Match bottle tax type
     */
    Bottle(7),

    /** 
     * EWaste tax type
     */
    EWaste(10),

    /** 
     * LandedCost tax type
     */
    LandedCost(12),

    /** 
     * Consumer Use Tax
     */
    ConsumerUse(67),

    /** 
     * Medical Excise Tax
     */
    Excise(69),

    /** 
     * Fee - PIFs (Public Improvement Fees) and RSFs (Retail Sales Fees)
     */
    Fee(70),

    /** 
     * VAT/GST Input tax
     */
    Input(73),

    /** 
     * VAT/GST Nonrecoverable Input tax
     */
    Nonrecoverable(78),

    /** 
     * VAT/GST Output tax
     */
    Output(79),

    /** 
     * Rental Tax
     */
    Rental(82),

    /** 
     * Sales tax
     */
    Sales(83),

    /** 
     * Use tax
     */
    Use(85),

    /**
     * Integer value for TaxType
     */
    public final int Value;

    private TaxType(int value) {
		Value = value;
    }
	
	/**
	 * Map TaxType to TaxType integer ID.
	 */
	 private static final Map<Integer, TaxType> _map = new HashMap<Integer, TaxType>();
	 static
	 {
		 for (TaxType modelName : TaxType.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get TaxType from value 
	  */
	 public static TaxType from(int value)
	 {
		 return _map.get(value);
	 }
}
