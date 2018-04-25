// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Terms And Conditions Acceptance Status Request Builder.
 */
public class BaseTermsAndConditionsAcceptanceStatusRequestBuilder extends BaseRequestBuilder implements IBaseTermsAndConditionsAcceptanceStatusRequestBuilder {

    /**
     * The request builder for the TermsAndConditionsAcceptanceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTermsAndConditionsAcceptanceStatusRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ITermsAndConditionsAcceptanceStatusRequest instance
     */
    public ITermsAndConditionsAcceptanceStatusRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITermsAndConditionsAcceptanceStatusRequest instance
     */
    public ITermsAndConditionsAcceptanceStatusRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new TermsAndConditionsAcceptanceStatusRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for TermsAndConditions
     *
     * @return the ITermsAndConditionsWithReferenceRequestBuilder instance
     */
    public ITermsAndConditionsWithReferenceRequestBuilder termsAndConditions() {
        return new TermsAndConditionsWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("termsAndConditions"), getClient(), null);
    }
}
