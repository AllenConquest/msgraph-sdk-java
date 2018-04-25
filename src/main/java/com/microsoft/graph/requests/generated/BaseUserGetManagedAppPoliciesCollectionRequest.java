// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

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
 * The class for the Base User Get Managed App Policies Collection Request.
 */
public class BaseUserGetManagedAppPoliciesCollectionRequest extends BaseCollectionRequest<BaseUserGetManagedAppPoliciesCollectionResponse, IUserGetManagedAppPoliciesCollectionPage> implements IBaseUserGetManagedAppPoliciesCollectionRequest {


    /**
     * The request for this UserGetManagedAppPolicies
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseUserGetManagedAppPoliciesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseUserGetManagedAppPoliciesCollectionResponse.class, IUserGetManagedAppPoliciesCollectionPage.class);
    }


    public void get(final ICallback<IUserGetManagedAppPoliciesCollectionPage> callback) {
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

    public IUserGetManagedAppPoliciesCollectionPage get() throws ClientException {
        final BaseUserGetManagedAppPoliciesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IUserGetManagedAppPoliciesCollectionPage buildFromResponse(final BaseUserGetManagedAppPoliciesCollectionResponse response) {
        final IUserGetManagedAppPoliciesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserGetManagedAppPoliciesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IUserGetManagedAppPoliciesCollectionPage page = new UserGetManagedAppPoliciesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserGetManagedAppPoliciesCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IUserGetManagedAppPoliciesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserGetManagedAppPoliciesCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IUserGetManagedAppPoliciesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserGetManagedAppPoliciesCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IUserGetManagedAppPoliciesCollectionRequest)this;
    }

}
