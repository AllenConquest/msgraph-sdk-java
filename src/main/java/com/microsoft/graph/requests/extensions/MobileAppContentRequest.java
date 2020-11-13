// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppContent;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content Request.
 */
public class MobileAppContentRequest extends BaseRequest {
	
    /**
     * The request for the MobileAppContent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppContentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppContent.class);
    }

    /**
     * Gets the MobileAppContent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MobileAppContent> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileAppContent from the service
     *
     * @return the MobileAppContent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MobileAppContent> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MobileAppContent with a source
     *
     * @param sourceMobileAppContent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MobileAppContent sourceMobileAppContent, @Nonnull final ICallback<? super MobileAppContent> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileAppContent);
    }

    /**
     * Patches this MobileAppContent with a source
     *
     * @param sourceMobileAppContent the source object with updates
     * @return the updated MobileAppContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContent patch(@Nonnull final MobileAppContent sourceMobileAppContent) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppContent);
    }

    /**
     * Creates a MobileAppContent with a new object
     *
     * @param newMobileAppContent the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MobileAppContent newMobileAppContent, @Nonnull final ICallback<? super MobileAppContent> callback) {
        send(HttpMethod.POST, callback, newMobileAppContent);
    }

    /**
     * Creates a MobileAppContent with a new object
     *
     * @param newMobileAppContent the new object to create
     * @return the created MobileAppContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContent post(@Nonnull final MobileAppContent newMobileAppContent) throws ClientException {
        return send(HttpMethod.POST, newMobileAppContent);
    }

    /**
     * Creates a MobileAppContent with a new object
     *
     * @param newMobileAppContent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MobileAppContent newMobileAppContent, @Nonnull final ICallback<? super MobileAppContent> callback) {
        send(HttpMethod.PUT, callback, newMobileAppContent);
    }

    /**
     * Creates a MobileAppContent with a new object
     *
     * @param newMobileAppContent the object to create/update
     * @return the created MobileAppContent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContent put(@Nonnull final MobileAppContent newMobileAppContent) throws ClientException {
        return send(HttpMethod.PUT, newMobileAppContent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppContentRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MobileAppContentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppContentRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MobileAppContentRequest)this;
     }

}

