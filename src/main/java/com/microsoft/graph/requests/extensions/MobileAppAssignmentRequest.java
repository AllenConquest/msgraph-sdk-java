// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Assignment Request.
 */
public class MobileAppAssignmentRequest extends BaseRequest {
	
    /**
     * The request for the MobileAppAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppAssignment.class);
    }

    /**
     * Gets the MobileAppAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MobileAppAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileAppAssignment from the service
     *
     * @return the MobileAppAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MobileAppAssignment> callback) {
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
     * Patches this MobileAppAssignment with a source
     *
     * @param sourceMobileAppAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MobileAppAssignment sourceMobileAppAssignment, @Nonnull final ICallback<? super MobileAppAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileAppAssignment);
    }

    /**
     * Patches this MobileAppAssignment with a source
     *
     * @param sourceMobileAppAssignment the source object with updates
     * @return the updated MobileAppAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppAssignment patch(@Nonnull final MobileAppAssignment sourceMobileAppAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppAssignment);
    }

    /**
     * Creates a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MobileAppAssignment newMobileAppAssignment, @Nonnull final ICallback<? super MobileAppAssignment> callback) {
        send(HttpMethod.POST, callback, newMobileAppAssignment);
    }

    /**
     * Creates a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the new object to create
     * @return the created MobileAppAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppAssignment post(@Nonnull final MobileAppAssignment newMobileAppAssignment) throws ClientException {
        return send(HttpMethod.POST, newMobileAppAssignment);
    }

    /**
     * Creates a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MobileAppAssignment newMobileAppAssignment, @Nonnull final ICallback<? super MobileAppAssignment> callback) {
        send(HttpMethod.PUT, callback, newMobileAppAssignment);
    }

    /**
     * Creates a MobileAppAssignment with a new object
     *
     * @param newMobileAppAssignment the object to create/update
     * @return the created MobileAppAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppAssignment put(@Nonnull final MobileAppAssignment newMobileAppAssignment) throws ClientException {
        return send(HttpMethod.PUT, newMobileAppAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppAssignmentRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MobileAppAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppAssignmentRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MobileAppAssignmentRequest)this;
     }

}

