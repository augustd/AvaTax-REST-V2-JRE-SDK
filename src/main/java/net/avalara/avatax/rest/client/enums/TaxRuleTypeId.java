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
 * Specifies the type of custom tax rule you have created.
 */
public enum TaxRuleTypeId {
	
    /** 
     * Reserved for Avalara internal usage.
     */
    RateRule(0),

    /** 
     * Specifies a rule that changes the rate of tax for a specified set of criteria.
     *  
     *  This rule can apply to one specific type of product (identified by `TaxCode`) or all products (identified by a null `TaxCode`).
     */
    RateOverrideRule(1),

    /** 
     * Specifies a rule that changes the tax base of a specific product.
     *  
     *  This rule can apply to one specific type of product (identified by `TaxCode`) or all products (identified by a null `TaxCode`).
     */
    BaseRule(2),

    /** 
     * Indicates that a particular product is exempt from tax due to an exempt usage reason.
     *  
     *  Amounts exempted by this rule are stored in the `exemptAmount` field on the transaction.
     */
    ExemptEntityRule(3),

    /** 
     * Specifies a rule that changes whether a product is taxable or not.
     *  
     *  This rule must be applied to a specific type of product. If you attempt to create a product taxability rule while
     *  leaving the `TaxCode` and `TaxCodeId` fields empty, you will get an error.
     *  
     *  A `value` field of `1` means that this tax code is taxable; `0` means it is nontaxable.
     *  
     *  Amounts that are considered not taxable according to this rule are stored in the `nonTaxableAmount`
     *  column in a transaction.
     *  
     *  This type of rule can also determine the rate type for a product or to apply a cap or threshold.
     */
    ProductTaxabilityRule(4),

    /** 
     * Reserved for Avalara internal usage.
     */
    NexusRule(5),

    /**
     * Integer value for TaxRuleTypeId
     */
    public final int Value;

    private TaxRuleTypeId(int value) {
		Value = value;
    }
	
	/**
	 * Map TaxRuleTypeId to TaxRuleTypeId integer ID.
	 */
	 private static final Map<Integer, TaxRuleTypeId> _map = new HashMap<Integer, TaxRuleTypeId>();
	 static
	 {
		 for (TaxRuleTypeId modelName : TaxRuleTypeId.values()
			 _map.put(modelName.Value, modelName);
	 }
	 
	 /**
	  * Get TaxRuleTypeId from value 
	  */
	 public static TaxRuleTypeId from(int value)
	 {
		 return _map.get(value);
	 }
}
