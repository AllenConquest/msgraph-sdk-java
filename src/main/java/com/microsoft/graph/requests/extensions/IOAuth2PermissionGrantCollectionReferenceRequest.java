// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the OAuth2Permission Grant Collection Reference Request.
 */
public interface IOAuth2PermissionGrantCollectionReferenceRequest {

    void post(final OAuth2PermissionGrant newOAuth2PermissionGrant, final ICallback<? super OAuth2PermissionGrant> callback);

    OAuth2PermissionGrant post(final OAuth2PermissionGrant newOAuth2PermissionGrant) throws ClientException;

    IOAuth2PermissionGrantCollectionReferenceRequest select(final String value);

    IOAuth2PermissionGrantCollectionReferenceRequest top(final int value);

}