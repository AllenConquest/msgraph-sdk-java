// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ServicePrincipalAddKeyRequest;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Add Key Request Builder.
 */
public class ServicePrincipalAddKeyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ServicePrincipalAddKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param keyCredential the keyCredential
     * @param passwordCredential the passwordCredential
     * @param proof the proof
     */
    public ServicePrincipalAddKeyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final KeyCredential keyCredential, @Nullable final PasswordCredential passwordCredential, @Nullable final String proof) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("keyCredential", keyCredential);
        bodyParams.put("passwordCredential", passwordCredential);
        bodyParams.put("proof", proof);
    }

    /**
     * Creates the ServicePrincipalAddKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalAddKeyRequest instance
     */
    @Nonnull
    public ServicePrincipalAddKeyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ServicePrincipalAddKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalAddKeyRequest instance
     */
    @Nonnull
    public ServicePrincipalAddKeyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ServicePrincipalAddKeyRequest request = new ServicePrincipalAddKeyRequest(
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
