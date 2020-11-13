// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.PolicyPlatformType;
import com.microsoft.graph.models.extensions.DeviceComplianceSettingState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Setting State Summary.
 */
public class DeviceCompliancePolicySettingStateSummary extends Entity implements IJsonBackedObject {


    /**
     * The Compliant Device Count.
     * Number of compliant devices
     */
    @SerializedName(value = "compliantDeviceCount", alternate = {"CompliantDeviceCount"})
    @Expose
	@Nullable
    public Integer compliantDeviceCount;

    /**
     * The Conflict Device Count.
     * Number of conflict devices
     */
    @SerializedName(value = "conflictDeviceCount", alternate = {"ConflictDeviceCount"})
    @Expose
	@Nullable
    public Integer conflictDeviceCount;

    /**
     * The Error Device Count.
     * Number of error devices
     */
    @SerializedName(value = "errorDeviceCount", alternate = {"ErrorDeviceCount"})
    @Expose
	@Nullable
    public Integer errorDeviceCount;

    /**
     * The Non Compliant Device Count.
     * Number of NonCompliant devices
     */
    @SerializedName(value = "nonCompliantDeviceCount", alternate = {"NonCompliantDeviceCount"})
    @Expose
	@Nullable
    public Integer nonCompliantDeviceCount;

    /**
     * The Not Applicable Device Count.
     * Number of not applicable devices
     */
    @SerializedName(value = "notApplicableDeviceCount", alternate = {"NotApplicableDeviceCount"})
    @Expose
	@Nullable
    public Integer notApplicableDeviceCount;

    /**
     * The Platform Type.
     * Setting platform. Possible values are: android, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, all.
     */
    @SerializedName(value = "platformType", alternate = {"PlatformType"})
    @Expose
	@Nullable
    public PolicyPlatformType platformType;

    /**
     * The Remediated Device Count.
     * Number of remediated devices
     */
    @SerializedName(value = "remediatedDeviceCount", alternate = {"RemediatedDeviceCount"})
    @Expose
	@Nullable
    public Integer remediatedDeviceCount;

    /**
     * The Setting.
     * The setting class name and property name.
     */
    @SerializedName(value = "setting", alternate = {"Setting"})
    @Expose
	@Nullable
    public String setting;

    /**
     * The Setting Name.
     * Name of the setting.
     */
    @SerializedName(value = "settingName", alternate = {"SettingName"})
    @Expose
	@Nullable
    public String settingName;

    /**
     * The Unknown Device Count.
     * Number of unknown devices
     */
    @SerializedName(value = "unknownDeviceCount", alternate = {"UnknownDeviceCount"})
    @Expose
	@Nullable
    public Integer unknownDeviceCount;

    /**
     * The Device Compliance Setting States.
     * Not yet documented
     */
    @SerializedName(value = "deviceComplianceSettingStates", alternate = {"DeviceComplianceSettingStates"})
    @Expose
	@Nullable
    public DeviceComplianceSettingStateCollectionPage deviceComplianceSettingStates;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("deviceComplianceSettingStates")) {
            deviceComplianceSettingStates = serializer.deserializeObject(json.get("deviceComplianceSettingStates").toString(), DeviceComplianceSettingStateCollectionPage.class);
        }
    }
}
