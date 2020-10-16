// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserTeamwork;
import com.microsoft.graph.models.extensions.UserScopeTeamsAppInstallation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationCollectionResponse;
import com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Scope Teams App Installation Collection Request.
 */
public class UserScopeTeamsAppInstallationCollectionRequest extends BaseCollectionRequest<UserScopeTeamsAppInstallation, UserScopeTeamsAppInstallationCollectionResponse, UserScopeTeamsAppInstallationCollectionPage> {

    /**
     * The request builder for this collection of UserScopeTeamsAppInstallation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public UserScopeTeamsAppInstallationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserScopeTeamsAppInstallationCollectionResponse.class, UserScopeTeamsAppInstallationCollectionPage.class, UserScopeTeamsAppInstallationCollectionRequestBuilder.class);
    }

    public void post(final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation, final ICallback<? super UserScopeTeamsAppInstallation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UserScopeTeamsAppInstallationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserScopeTeamsAppInstallation, callback);
    }

    public UserScopeTeamsAppInstallation post(final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserScopeTeamsAppInstallationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserScopeTeamsAppInstallation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public UserScopeTeamsAppInstallationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public UserScopeTeamsAppInstallationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public UserScopeTeamsAppInstallationCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public UserScopeTeamsAppInstallationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public UserScopeTeamsAppInstallationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public UserScopeTeamsAppInstallationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public UserScopeTeamsAppInstallationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return this;
    }
}
