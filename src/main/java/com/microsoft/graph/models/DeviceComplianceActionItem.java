// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.DeviceComplianceActionType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Action Item.
 */
public class DeviceComplianceActionItem extends Entity implements IJsonBackedObject {


    /**
     * The Action Type.
     * What action to take. Possible values are: noAction, notification, block, retire, wipe, removeResourceAccessProfiles, pushNotification.
     */
    @SerializedName(value = "actionType", alternate = {"ActionType"})
    @Expose
	@Nullable
    public DeviceComplianceActionType actionType;

    /**
     * The Grace Period Hours.
     * Number of hours to wait till the action will be enforced. Valid values 0 to 8760
     */
    @SerializedName(value = "gracePeriodHours", alternate = {"GracePeriodHours"})
    @Expose
	@Nullable
    public Integer gracePeriodHours;

    /**
     * The Notification Message CCList.
     * A list of group IDs to speicify who to CC this notification message to.
     */
    @SerializedName(value = "notificationMessageCCList", alternate = {"NotificationMessageCCList"})
    @Expose
	@Nullable
    public java.util.List<String> notificationMessageCCList;

    /**
     * The Notification Template Id.
     * What notification Message template to use
     */
    @SerializedName(value = "notificationTemplateId", alternate = {"NotificationTemplateId"})
    @Expose
	@Nullable
    public String notificationTemplateId;


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
	@Override
    @Nullable
    public ISerializer getSerializer() {
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

    }
}