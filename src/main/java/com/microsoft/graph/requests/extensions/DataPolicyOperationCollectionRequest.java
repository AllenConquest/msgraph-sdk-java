// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataPolicyOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionRequest;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Policy Operation Collection Request.
 */
public class DataPolicyOperationCollectionRequest extends BaseCollectionRequest<DataPolicyOperationCollectionResponse, DataPolicyOperationCollectionPage> {

    /**
     * The request builder for this collection of DataPolicyOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataPolicyOperationCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataPolicyOperationCollectionResponse.class, DataPolicyOperationCollectionPage.class);
    }

    public void get(@Nonnull final ICallback<? super DataPolicyOperationCollectionPage> callback) {
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

    @Nonnull
    public DataPolicyOperationCollectionPage get() throws ClientException {
        final DataPolicyOperationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(@Nonnull final DataPolicyOperation newDataPolicyOperation, @Nonnull final ICallback<? super DataPolicyOperation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DataPolicyOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDataPolicyOperation, callback);
    }

    @Nonnull
    public DataPolicyOperation post(@Nonnull final DataPolicyOperation newDataPolicyOperation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DataPolicyOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDataPolicyOperation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DataPolicyOperationCollectionRequest expand(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DataPolicyOperationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public DataPolicyOperationCollectionRequest filter(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DataPolicyOperationCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public DataPolicyOperationCollectionRequest orderBy(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DataPolicyOperationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public DataPolicyOperationCollectionRequest select(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DataPolicyOperationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public DataPolicyOperationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DataPolicyOperationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public DataPolicyOperationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DataPolicyOperationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public DataPolicyOperationCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (DataPolicyOperationCollectionRequest)this;
    }
    @Nonnull
    public DataPolicyOperationCollectionPage buildFromResponse(@Nonnull final DataPolicyOperationCollectionResponse response) {
        final DataPolicyOperationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DataPolicyOperationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DataPolicyOperationCollectionPage page = new DataPolicyOperationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
