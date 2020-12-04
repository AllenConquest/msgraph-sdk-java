// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ManagedAppRegistrationWithReferenceRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Collection Reference Request.
 */
public class ManagedAppRegistrationCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<ManagedAppRegistration, ManagedAppRegistrationWithReferenceRequest, ManagedAppRegistrationReferenceRequestBuilder, ManagedAppRegistrationWithReferenceRequestBuilder, ManagedAppRegistrationCollectionResponse, ManagedAppRegistrationCollectionWithReferencesPage, ManagedAppRegistrationCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppRegistrationCollectionResponse.class, ManagedAppRegistrationCollectionWithReferencesPage.class, ManagedAppRegistrationCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new ManagedAppRegistration
     * @param newManagedAppRegistration the ManagedAppRegistration to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final ManagedAppRegistration newManagedAppRegistration, @Nonnull final ICallback<? super ManagedAppRegistration> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceAppManagement/managedAppRegistrations/" + newManagedAppRegistration.id);
        new ManagedAppRegistrationWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedAppRegistration, body, callback);
    }

    /**
     * Creates a new ManagedAppRegistration
     * @param newManagedAppRegistration the ManagedAppRegistration to create
     * @return the newly created object
     */
    @Nonnull
    public ManagedAppRegistration post(@Nonnull final ManagedAppRegistration newManagedAppRegistration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceAppManagement/managedAppRegistrations/" + newManagedAppRegistration.id);
        return new ManagedAppRegistrationWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newManagedAppRegistration, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ManagedAppRegistrationCollectionReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public ManagedAppRegistrationCollectionReferenceRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    @Nonnull
    public ManagedAppRegistrationCollectionReferenceRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ManagedAppRegistrationCollectionReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public ManagedAppRegistrationCollectionReferenceRequest top(final int value) {
        addTopOption(value);
        return this;
    }
}
