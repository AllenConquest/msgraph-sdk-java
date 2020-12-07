// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.MobileAppCategoryWithReferenceRequest;
import com.microsoft.graph.requests.extensions.MobileAppCategoryReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Category Collection Reference Request.
 */
public class MobileAppCategoryCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<MobileAppCategory, MobileAppCategoryWithReferenceRequest, MobileAppCategoryReferenceRequestBuilder, MobileAppCategoryWithReferenceRequestBuilder, MobileAppCategoryCollectionResponse, MobileAppCategoryCollectionWithReferencesPage, MobileAppCategoryCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of MobileAppCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppCategoryCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppCategoryCollectionResponse.class, MobileAppCategoryCollectionWithReferencesPage.class, MobileAppCategoryCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new MobileAppCategory
     * @param newMobileAppCategory the MobileAppCategory to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final MobileAppCategory newMobileAppCategory, @Nonnull final ICallback<? super MobileAppCategory> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceAppManagement/categories/" + newMobileAppCategory.id);
        new MobileAppCategoryWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMobileAppCategory, body, callback);
    }

    /**
     * Creates a new MobileAppCategory
     * @param newMobileAppCategory the MobileAppCategory to create
     * @return the newly created object
     */
    @Nonnull
    public MobileAppCategory post(@Nonnull final MobileAppCategory newMobileAppCategory) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceAppManagement/categories/" + newMobileAppCategory.id);
        return new MobileAppCategoryWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newMobileAppCategory, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public MobileAppCategoryCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public MobileAppCategoryCollectionReferenceRequest filter(@Nonnull final String value) {
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
    public MobileAppCategoryCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public MobileAppCategoryCollectionReferenceRequest select(@Nonnull final String value) {
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
    public MobileAppCategoryCollectionReferenceRequest top(final int value) {
        addTopOption(value);
        return this;
    }
    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public MobileAppCategoryCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public MobileAppCategoryCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
