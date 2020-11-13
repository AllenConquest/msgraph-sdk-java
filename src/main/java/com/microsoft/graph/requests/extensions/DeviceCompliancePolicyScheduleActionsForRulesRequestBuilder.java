// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyScheduleActionsForRulesRequest;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Schedule Actions For Rules Request Builder.
 */
public class DeviceCompliancePolicyScheduleActionsForRulesRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this DeviceCompliancePolicyScheduleActionsForRules
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param deviceComplianceScheduledActionForRules the deviceComplianceScheduledActionForRules
     */
    public DeviceCompliancePolicyScheduleActionsForRulesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final java.util.List<DeviceComplianceScheduledActionForRule> deviceComplianceScheduledActionForRules) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("deviceComplianceScheduledActionForRules", deviceComplianceScheduledActionForRules);
    }

    /**
     * Creates the DeviceCompliancePolicyScheduleActionsForRulesRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceCompliancePolicyScheduleActionsForRulesRequest instance
     */
    @Nonnull
    public DeviceCompliancePolicyScheduleActionsForRulesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceCompliancePolicyScheduleActionsForRulesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceCompliancePolicyScheduleActionsForRulesRequest instance
     */
    @Nonnull
    public DeviceCompliancePolicyScheduleActionsForRulesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceCompliancePolicyScheduleActionsForRulesRequest request = new DeviceCompliancePolicyScheduleActionsForRulesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("deviceComplianceScheduledActionForRules")) {
            request.body.deviceComplianceScheduledActionForRules = getParameter("deviceComplianceScheduledActionForRules");
        }

        return request;
    }
}
