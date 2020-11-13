// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Profile Photo Request.
 */
public class ProfilePhotoRequest extends BaseRequest {
	
    /**
     * The request for the ProfilePhoto
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProfilePhotoRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ProfilePhoto.class);
    }

    /**
     * Gets the ProfilePhoto from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ProfilePhoto> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ProfilePhoto from the service
     *
     * @return the ProfilePhoto from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ProfilePhoto get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ProfilePhoto> callback) {
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
     * Patches this ProfilePhoto with a source
     *
     * @param sourceProfilePhoto the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ProfilePhoto sourceProfilePhoto, @Nonnull final ICallback<? super ProfilePhoto> callback) {
        send(HttpMethod.PATCH, callback, sourceProfilePhoto);
    }

    /**
     * Patches this ProfilePhoto with a source
     *
     * @param sourceProfilePhoto the source object with updates
     * @return the updated ProfilePhoto
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ProfilePhoto patch(@Nonnull final ProfilePhoto sourceProfilePhoto) throws ClientException {
        return send(HttpMethod.PATCH, sourceProfilePhoto);
    }

    /**
     * Creates a ProfilePhoto with a new object
     *
     * @param newProfilePhoto the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ProfilePhoto newProfilePhoto, @Nonnull final ICallback<? super ProfilePhoto> callback) {
        send(HttpMethod.POST, callback, newProfilePhoto);
    }

    /**
     * Creates a ProfilePhoto with a new object
     *
     * @param newProfilePhoto the new object to create
     * @return the created ProfilePhoto
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ProfilePhoto post(@Nonnull final ProfilePhoto newProfilePhoto) throws ClientException {
        return send(HttpMethod.POST, newProfilePhoto);
    }

    /**
     * Creates a ProfilePhoto with a new object
     *
     * @param newProfilePhoto the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ProfilePhoto newProfilePhoto, @Nonnull final ICallback<? super ProfilePhoto> callback) {
        send(HttpMethod.PUT, callback, newProfilePhoto);
    }

    /**
     * Creates a ProfilePhoto with a new object
     *
     * @param newProfilePhoto the object to create/update
     * @return the created ProfilePhoto
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ProfilePhoto put(@Nonnull final ProfilePhoto newProfilePhoto) throws ClientException {
        return send(HttpMethod.PUT, newProfilePhoto);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ProfilePhotoRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ProfilePhotoRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ProfilePhotoRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ProfilePhotoRequest)this;
     }

}

