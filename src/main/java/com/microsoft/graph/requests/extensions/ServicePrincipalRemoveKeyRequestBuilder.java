// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ServicePrincipalRemoveKeyRequest;
import com.microsoft.graph.models.extensions.ServicePrincipal;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Remove Key Request Builder.
 */
public class ServicePrincipalRemoveKeyRequestBuilder extends BaseActionRequestBuilder<ServicePrincipal> {

    /**
     * The request builder for this ServicePrincipalRemoveKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param keyId the keyId
     * @param proof the proof
     */
    public ServicePrincipalRemoveKeyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final java.util.UUID keyId, @Nullable final String proof) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("keyId", keyId);
        bodyParams.put("proof", proof);
    }

    /**
     * Creates the ServicePrincipalRemoveKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalRemoveKeyRequest instance
     */
    @Nonnull
    public ServicePrincipalRemoveKeyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ServicePrincipalRemoveKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalRemoveKeyRequest instance
     */
    @Nonnull
    public ServicePrincipalRemoveKeyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ServicePrincipalRemoveKeyRequest request = new ServicePrincipalRemoveKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("keyId")) {
            request.body.keyId = getParameter("keyId");
        }

        if (hasParameter("proof")) {
            request.body.proof = getParameter("proof");
        }

        return request;
    }
}
