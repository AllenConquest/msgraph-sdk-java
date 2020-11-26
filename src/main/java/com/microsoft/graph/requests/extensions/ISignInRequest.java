// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SignIn;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Sign In Request.
 */
public interface ISignInRequest extends IHttpRequest {

    /**
     * Gets the SignIn from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SignIn> callback);

    /**
     * Gets the SignIn from the service
     *
     * @return the SignIn from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SignIn get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SignIn> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SignIn with a source
     *
     * @param sourceSignIn the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SignIn sourceSignIn, final ICallback<? super SignIn> callback);

    /**
     * Patches this SignIn with a source
     *
     * @param sourceSignIn the source object with updates
     * @return the updated SignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SignIn patch(final SignIn sourceSignIn) throws ClientException;

    /**
     * Posts a SignIn with a new object
     *
     * @param newSignIn the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SignIn newSignIn, final ICallback<? super SignIn> callback);

    /**
     * Posts a SignIn with a new object
     *
     * @param newSignIn the new object to create
     * @return the created SignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SignIn post(final SignIn newSignIn) throws ClientException;

    /**
     * Posts a SignIn with a new object
     *
     * @param newSignIn the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SignIn newSignIn, final ICallback<? super SignIn> callback);

    /**
     * Posts a SignIn with a new object
     *
     * @param newSignIn the object to create/update
     * @return the created SignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SignIn put(final SignIn newSignIn) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISignInRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISignInRequest expand(final String value);

}
