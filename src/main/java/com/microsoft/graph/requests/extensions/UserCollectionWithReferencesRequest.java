// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.AttendeeBase;
import com.microsoft.graph.models.extensions.LocationConstraint;
import com.microsoft.graph.models.extensions.TimeConstraint;
import com.microsoft.graph.models.extensions.MeetingTimeSuggestionsResult;
import com.microsoft.graph.models.generated.MailTipsType;
import com.microsoft.graph.models.extensions.MailTips;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.generated.ExchangeIdFormat;
import com.microsoft.graph.models.extensions.ConvertIdResult;
import com.microsoft.graph.models.extensions.Reminder;
import com.microsoft.graph.models.extensions.ManagedAppDiagnosticStatus;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Collection With References Request.
 */
public class UserCollectionWithReferencesRequest extends BaseCollectionRequest<UserCollectionResponse, UserCollectionPage> {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserCollectionWithReferencesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserCollectionResponse.class, UserCollectionPage.class);
    }

    public void get(@Nonnull final ICallback<? super UserCollectionWithReferencesPage> callback) {
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
    public UserCollectionWithReferencesPage get() throws ClientException {
        final UserCollectionResponse response = send();
        return buildFromResponse(response);
    }

    @Nonnull
    public UserCollectionWithReferencesRequest expand(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    @Nonnull
    public UserCollectionWithReferencesRequest filter(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    @Nonnull
    public UserCollectionWithReferencesRequest orderBy(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    @Nonnull
    public UserCollectionWithReferencesRequest select(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    @Nonnull
    public UserCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    @Nonnull
    public UserCollectionWithReferencesPage buildFromResponse(@Nonnull final UserCollectionResponse response) {
        final UserCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UserCollectionWithReferencesPage page = new UserCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
