// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ApplicationAddPasswordRequest;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Add Password Request Builder.
 */
public class ApplicationAddPasswordRequestBuilder extends BaseActionRequestBuilder<PasswordCredential> {

    /**
     * The request builder for this ApplicationAddPassword
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param passwordCredential the passwordCredential
     */
    public ApplicationAddPasswordRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final PasswordCredential passwordCredential) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("passwordCredential", passwordCredential);
    }

    /**
     * Creates the ApplicationAddPasswordRequest
     *
     * @param requestOptions the options for the request
     * @return the ApplicationAddPasswordRequest instance
     */
    public ApplicationAddPasswordRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ApplicationAddPasswordRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ApplicationAddPasswordRequest instance
     */
    public ApplicationAddPasswordRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ApplicationAddPasswordRequest request = new ApplicationAddPasswordRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("passwordCredential")) {
            request.body.passwordCredential = getParameter("passwordCredential");
        }

        return request;
    }
}
