
package com.vnayak.contract.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vnayak.contract.dto.Contract;

/**
 * @author vnayak
 *
 */

@RestController
@RequestMapping(ContractController.CONTRACT_BASE_URI)
public class ContractController {
	public static final String CONTRACT_BASE_URI= "contract-svc/v1/contracts";
    
	@RequestMapping(value="{ctNumber}")
	public Contract getContract (@PathVariable final int ctNumber) {
    	Contract contract=new Contract();
    	System.out.println("Received request with contract Number =="+ ctNumber);
    	contract.setName("Vinaya Contract");
    	contract.setId(ctNumber);
    	return contract;
    	
		}
}
