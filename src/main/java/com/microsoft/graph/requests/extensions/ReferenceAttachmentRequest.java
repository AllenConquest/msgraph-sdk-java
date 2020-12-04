// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReferenceAttachment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Reference Attachment Request.
 */
public class ReferenceAttachmentRequest extends BaseRequest<ReferenceAttachment> {
	
    /**
     * The request for the ReferenceAttachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReferenceAttachmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReferenceAttachment.class);
    }

    /**
     * Gets the ReferenceAttachment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ReferenceAttachment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ReferenceAttachment from the service
     *
     * @return the ReferenceAttachment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ReferenceAttachment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ReferenceAttachment> callback) {
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
     * Patches this ReferenceAttachment with a source
     *
     * @param sourceReferenceAttachment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ReferenceAttachment sourceReferenceAttachment, @Nonnull final ICallback<? super ReferenceAttachment> callback) {
        send(HttpMethod.PATCH, callback, sourceReferenceAttachment);
    }

    /**
     * Patches this ReferenceAttachment with a source
     *
     * @param sourceReferenceAttachment the source object with updates
     * @return the updated ReferenceAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ReferenceAttachment patch(@Nonnull final ReferenceAttachment sourceReferenceAttachment) throws ClientException {
        return send(HttpMethod.PATCH, sourceReferenceAttachment);
    }

    /**
     * Creates a ReferenceAttachment with a new object
     *
     * @param newReferenceAttachment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ReferenceAttachment newReferenceAttachment, @Nonnull final ICallback<? super ReferenceAttachment> callback) {
        send(HttpMethod.POST, callback, newReferenceAttachment);
    }

    /**
     * Creates a ReferenceAttachment with a new object
     *
     * @param newReferenceAttachment the new object to create
     * @return the created ReferenceAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ReferenceAttachment post(@Nonnull final ReferenceAttachment newReferenceAttachment) throws ClientException {
        return send(HttpMethod.POST, newReferenceAttachment);
    }

    /**
     * Creates a ReferenceAttachment with a new object
     *
     * @param newReferenceAttachment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ReferenceAttachment newReferenceAttachment, @Nonnull final ICallback<? super ReferenceAttachment> callback) {
        send(HttpMethod.PUT, callback, newReferenceAttachment);
    }

    /**
     * Creates a ReferenceAttachment with a new object
     *
     * @param newReferenceAttachment the object to create/update
     * @return the created ReferenceAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ReferenceAttachment put(@Nonnull final ReferenceAttachment newReferenceAttachment) throws ClientException {
        return send(HttpMethod.PUT, newReferenceAttachment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ReferenceAttachmentRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ReferenceAttachmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

