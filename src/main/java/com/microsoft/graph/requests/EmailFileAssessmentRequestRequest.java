// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EmailFileAssessmentRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email File Assessment Request Request.
 */
public class EmailFileAssessmentRequestRequest extends BaseRequest<EmailFileAssessmentRequest> {
	
    /**
     * The request for the EmailFileAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmailFileAssessmentRequestRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EmailFileAssessmentRequest.class);
    }

    /**
     * Gets the EmailFileAssessmentRequest from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailFileAssessmentRequest> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EmailFileAssessmentRequest from the service
     *
     * @return the EmailFileAssessmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailFileAssessmentRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailFileAssessmentRequest> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EmailFileAssessmentRequest delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EmailFileAssessmentRequest with a source
     *
     * @param sourceEmailFileAssessmentRequest the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailFileAssessmentRequest> patchAsync(@Nonnull final EmailFileAssessmentRequest sourceEmailFileAssessmentRequest) {
        return sendAsync(HttpMethod.PATCH, sourceEmailFileAssessmentRequest);
    }

    /**
     * Patches this EmailFileAssessmentRequest with a source
     *
     * @param sourceEmailFileAssessmentRequest the source object with updates
     * @return the updated EmailFileAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailFileAssessmentRequest patch(@Nonnull final EmailFileAssessmentRequest sourceEmailFileAssessmentRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceEmailFileAssessmentRequest);
    }

    /**
     * Creates a EmailFileAssessmentRequest with a new object
     *
     * @param newEmailFileAssessmentRequest the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailFileAssessmentRequest> postAsync(@Nonnull final EmailFileAssessmentRequest newEmailFileAssessmentRequest) {
        return sendAsync(HttpMethod.POST, newEmailFileAssessmentRequest);
    }

    /**
     * Creates a EmailFileAssessmentRequest with a new object
     *
     * @param newEmailFileAssessmentRequest the new object to create
     * @return the created EmailFileAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailFileAssessmentRequest post(@Nonnull final EmailFileAssessmentRequest newEmailFileAssessmentRequest) throws ClientException {
        return send(HttpMethod.POST, newEmailFileAssessmentRequest);
    }

    /**
     * Creates a EmailFileAssessmentRequest with a new object
     *
     * @param newEmailFileAssessmentRequest the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EmailFileAssessmentRequest> putAsync(@Nonnull final EmailFileAssessmentRequest newEmailFileAssessmentRequest) {
        return sendAsync(HttpMethod.PUT, newEmailFileAssessmentRequest);
    }

    /**
     * Creates a EmailFileAssessmentRequest with a new object
     *
     * @param newEmailFileAssessmentRequest the object to create/update
     * @return the created EmailFileAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EmailFileAssessmentRequest put(@Nonnull final EmailFileAssessmentRequest newEmailFileAssessmentRequest) throws ClientException {
        return send(HttpMethod.PUT, newEmailFileAssessmentRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EmailFileAssessmentRequestRequest select(@Nonnull final String value) {
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
     public EmailFileAssessmentRequestRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
