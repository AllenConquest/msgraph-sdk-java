// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.requests.extensions.RoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Definition Reference Request.
 */
public class RoleDefinitionReferenceRequest extends BaseRequest {

    /**
     * The request for the RoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleDefinitionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoleDefinition.class);
    }

    public void delete(@Nonnull final ICallback<? super RoleDefinition> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    @Nullable
    public RoleDefinition delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public RoleDefinitionReferenceRequest select(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (RoleDefinitionReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public RoleDefinitionReferenceRequest expand(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (RoleDefinitionReferenceRequest)this;
    }
    /**
     * Puts the RoleDefinition
     *
     * @param srcRoleDefinition the RoleDefinition reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final RoleDefinition srcRoleDefinition, @Nonnull final ICallback<? super RoleDefinition> callback) {
        send(HttpMethod.PUT, callback, srcRoleDefinition);
    }

    /**
     * Puts the RoleDefinition
     *
     * @param srcRoleDefinition the RoleDefinition reference to PUT
     * @return the RoleDefinition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public RoleDefinition put(@Nonnull final RoleDefinition srcRoleDefinition) throws ClientException {
        return send(HttpMethod.PUT, srcRoleDefinition);
    }
}
