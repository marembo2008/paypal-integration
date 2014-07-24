/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anosym.paypal.integration;

import com.anosym.khameleon.core.annotations.Default;

/**
 *
 * @author mochieng
 */
public interface PaypalConfigurationService {

    @Default("https://api-3t.sandbox.paypal.com/2.0/")
    String getSignatureApiEndpoint();

    @Default("https://api.sandbox.paypal.com/2.0/")
    String getCertificateApiEndpoint();

    PaypalEndpointOption getEndpointOption();

    String getUsername();

    String getPassword();

    String getSignature();

    String getAuthorizedAccountEmailAddress();
}
