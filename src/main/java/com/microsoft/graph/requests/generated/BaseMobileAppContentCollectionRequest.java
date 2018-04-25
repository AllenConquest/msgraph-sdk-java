// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base Mobile App Content Collection Request.
 */
public class BaseMobileAppContentCollectionRequest extends BaseCollectionRequest<BaseMobileAppContentCollectionResponse, IMobileAppContentCollectionPage> implements IBaseMobileAppContentCollectionRequest {

    /**
     * The request builder for this collection of MobileAppContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMobileAppContentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseMobileAppContentCollectionResponse.class, IMobileAppContentCollectionPage.class);
    }

    public void get(final ICallback<IMobileAppContentCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IMobileAppContentCollectionPage get() throws ClientException {
        final BaseMobileAppContentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MobileAppContent newMobileAppContent, final ICallback<MobileAppContent> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MobileAppContentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMobileAppContent, callback);
    }

    public MobileAppContent post(final MobileAppContent newMobileAppContent) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MobileAppContentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMobileAppContent);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMobileAppContentCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (MobileAppContentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMobileAppContentCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (MobileAppContentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMobileAppContentCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (MobileAppContentCollectionRequest)this;
    }

    public IMobileAppContentCollectionPage buildFromResponse(final BaseMobileAppContentCollectionResponse response) {
        final IMobileAppContentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MobileAppContentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MobileAppContentCollectionPage page = new MobileAppContentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
