// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSheetRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Sheet Request Builder.
 */
public interface IWorkbookFunctionsSheetRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsSheetRequest
     *
     * @return the IWorkbookFunctionsSheetRequest instance
     */
    IWorkbookFunctionsSheetRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsSheetRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSheetRequest instance
     */
    IWorkbookFunctionsSheetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
