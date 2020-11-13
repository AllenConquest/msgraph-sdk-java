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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.ReferenceRequestBody;
import com.microsoft.graph.models.extensions.MobileAppCategory;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Category Collection Reference Request.
 */
public class MobileAppCategoryCollectionReferenceRequest extends BaseCollectionRequest<MobileAppCategoryCollectionResponse, MobileAppCategoryCollectionPage> {

    /**
     * The request builder for this collection of MobileAppCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppCategoryCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppCategoryCollectionResponse.class, MobileAppCategoryCollectionPage.class);
    }

    public void post(@Nonnull final MobileAppCategory newMobileAppCategory, @Nonnull final ICallback<? super MobileAppCategory> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceAppManagement/categories/" + newMobileAppCategory.id);
        new MobileAppCategoryWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMobileAppCategory, body, callback);
    }

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
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MobileAppCategoryCollectionReferenceRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public MobileAppCategoryCollectionReferenceRequest filter(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (MobileAppCategoryCollectionReferenceRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    @Nonnull
    public MobileAppCategoryCollectionReferenceRequest orderBy(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (MobileAppCategoryCollectionReferenceRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public MobileAppCategoryCollectionReferenceRequest select(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MobileAppCategoryCollectionReferenceRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public MobileAppCategoryCollectionReferenceRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (MobileAppCategoryCollectionReferenceRequest)this;
    }
}
