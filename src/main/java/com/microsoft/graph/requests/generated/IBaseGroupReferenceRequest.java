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
 * The interface for the Base Group Reference Request.
 */
public interface IBaseGroupReferenceRequest extends IHttpRequest {

    void delete(final ICallback<Group> callback);

    Group delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseGroupReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseGroupReferenceRequest expand(final String value);

    /**
     * Puts the Group
     *
     * @param srcGroup the Group to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Group srcGroup, final ICallback<Group> callback);

    /**
     * Puts the Group
     *
     * @param srcGroup the Group to PUT
     * @return the Group
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Group put(Group srcGroup) throws ClientException;
}
