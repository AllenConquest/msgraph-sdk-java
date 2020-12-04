// Template Source: Templates\Java\requests_extensions\BaseEntityStreamRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.FileAttachment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import java.io.InputStream;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Attachment Stream Request Builder.
 */
public class FileAttachmentStreamRequestBuilder extends BaseRequestBuilder<InputStream> {

    /**
     * The request builder for the FileAttachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FileAttachmentStreamRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the FileAttachmentStreamRequest instance
     */
    @Nonnull
    public FileAttachmentStreamRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the FileAttachmentStreamRequest instance
     */
    @Nonnull
    public FileAttachmentStreamRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new FileAttachmentStreamRequest(getRequestUrl(), getClient(), requestOptions);
    }


}
