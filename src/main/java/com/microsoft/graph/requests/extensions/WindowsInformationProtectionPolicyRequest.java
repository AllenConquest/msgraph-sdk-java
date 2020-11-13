// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Policy Request.
 */
public class WindowsInformationProtectionPolicyRequest extends BaseRequest {
	
    /**
     * The request for the WindowsInformationProtectionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionPolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionPolicy.class);
    }

    /**
     * Gets the WindowsInformationProtectionPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WindowsInformationProtectionPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsInformationProtectionPolicy from the service
     *
     * @return the WindowsInformationProtectionPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super WindowsInformationProtectionPolicy> callback) {
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
     * Patches this WindowsInformationProtectionPolicy with a source
     *
     * @param sourceWindowsInformationProtectionPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final WindowsInformationProtectionPolicy sourceWindowsInformationProtectionPolicy, @Nonnull final ICallback<? super WindowsInformationProtectionPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsInformationProtectionPolicy);
    }

    /**
     * Patches this WindowsInformationProtectionPolicy with a source
     *
     * @param sourceWindowsInformationProtectionPolicy the source object with updates
     * @return the updated WindowsInformationProtectionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionPolicy patch(@Nonnull final WindowsInformationProtectionPolicy sourceWindowsInformationProtectionPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsInformationProtectionPolicy);
    }

    /**
     * Creates a WindowsInformationProtectionPolicy with a new object
     *
     * @param newWindowsInformationProtectionPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final WindowsInformationProtectionPolicy newWindowsInformationProtectionPolicy, @Nonnull final ICallback<? super WindowsInformationProtectionPolicy> callback) {
        send(HttpMethod.POST, callback, newWindowsInformationProtectionPolicy);
    }

    /**
     * Creates a WindowsInformationProtectionPolicy with a new object
     *
     * @param newWindowsInformationProtectionPolicy the new object to create
     * @return the created WindowsInformationProtectionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionPolicy post(@Nonnull final WindowsInformationProtectionPolicy newWindowsInformationProtectionPolicy) throws ClientException {
        return send(HttpMethod.POST, newWindowsInformationProtectionPolicy);
    }

    /**
     * Creates a WindowsInformationProtectionPolicy with a new object
     *
     * @param newWindowsInformationProtectionPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WindowsInformationProtectionPolicy newWindowsInformationProtectionPolicy, @Nonnull final ICallback<? super WindowsInformationProtectionPolicy> callback) {
        send(HttpMethod.PUT, callback, newWindowsInformationProtectionPolicy);
    }

    /**
     * Creates a WindowsInformationProtectionPolicy with a new object
     *
     * @param newWindowsInformationProtectionPolicy the object to create/update
     * @return the created WindowsInformationProtectionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionPolicy put(@Nonnull final WindowsInformationProtectionPolicy newWindowsInformationProtectionPolicy) throws ClientException {
        return send(HttpMethod.PUT, newWindowsInformationProtectionPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsInformationProtectionPolicyRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsInformationProtectionPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public WindowsInformationProtectionPolicyRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsInformationProtectionPolicyRequest)this;
     }

}

