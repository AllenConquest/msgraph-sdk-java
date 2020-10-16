// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ApplicationAddKeyRequest;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Add Key Request Builder.
 */
public class ApplicationAddKeyRequestBuilder extends BaseActionRequestBuilder<KeyCredential> {

    /**
     * The request builder for this ApplicationAddKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param keyCredential the keyCredential
     * @param passwordCredential the passwordCredential
     * @param proof the proof
     */
    public ApplicationAddKeyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final KeyCredential keyCredential, final PasswordCredential passwordCredential, final String proof) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("keyCredential", keyCredential);
        bodyParams.put("passwordCredential", passwordCredential);
        bodyParams.put("proof", proof);
    }

    /**
     * Creates the ApplicationAddKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the ApplicationAddKeyRequest instance
     */
    public ApplicationAddKeyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ApplicationAddKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ApplicationAddKeyRequest instance
     */
    public ApplicationAddKeyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ApplicationAddKeyRequest request = new ApplicationAddKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("keyCredential")) {
            request.body.keyCredential = getParameter("keyCredential");
        }

        if (hasParameter("passwordCredential")) {
            request.body.passwordCredential = getParameter("passwordCredential");
        }

        if (hasParameter("proof")) {
            request.body.proof = getParameter("proof");
        }

        return request;
    }
}
