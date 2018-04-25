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
 * The class for the Base Mobile App Content File Collection Request.
 */
public class BaseMobileAppContentFileCollectionRequest extends BaseCollectionRequest<BaseMobileAppContentFileCollectionResponse, IMobileAppContentFileCollectionPage> implements IBaseMobileAppContentFileCollectionRequest {

    /**
     * The request builder for this collection of MobileAppContentFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseMobileAppContentFileCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseMobileAppContentFileCollectionResponse.class, IMobileAppContentFileCollectionPage.class);
    }

    public void get(final ICallback<IMobileAppContentFileCollectionPage> callback) {
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

    public IMobileAppContentFileCollectionPage get() throws ClientException {
        final BaseMobileAppContentFileCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MobileAppContentFile newMobileAppContentFile, final ICallback<MobileAppContentFile> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MobileAppContentFileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMobileAppContentFile, callback);
    }

    public MobileAppContentFile post(final MobileAppContentFile newMobileAppContentFile) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MobileAppContentFileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMobileAppContentFile);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMobileAppContentFileCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (MobileAppContentFileCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMobileAppContentFileCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (MobileAppContentFileCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMobileAppContentFileCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (MobileAppContentFileCollectionRequest)this;
    }

    public IMobileAppContentFileCollectionPage buildFromResponse(final BaseMobileAppContentFileCollectionResponse response) {
        final IMobileAppContentFileCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MobileAppContentFileCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MobileAppContentFileCollectionPage page = new MobileAppContentFileCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
