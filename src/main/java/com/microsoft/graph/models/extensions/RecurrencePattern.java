// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DayOfWeek;
import com.microsoft.graph.models.generated.WeekIndex;
import com.microsoft.graph.models.generated.RecurrencePatternType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Recurrence Pattern.
 */
public class RecurrencePattern implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Day Of Month.
     * The day of the month on which the event occurs. Required if type is absoluteMonthly or absoluteYearly.
     */
    @SerializedName(value = "dayOfMonth", alternate = {"DayOfMonth"})
    @Expose
	@Nullable
    public Integer dayOfMonth;

    /**
     * The Days Of Week.
     * A collection of the days of the week on which the event occurs. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. If type is relativeMonthly or relativeYearly, and daysOfWeek specifies more than one day, the event falls on the first day that satisfies the pattern.  Required if type is weekly, relativeMonthly, or relativeYearly.
     */
    @SerializedName(value = "daysOfWeek", alternate = {"DaysOfWeek"})
    @Expose
	@Nullable
    public java.util.List<DayOfWeek> daysOfWeek;

    /**
     * The First Day Of Week.
     * The first day of the week. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. Default is sunday. Required if type is weekly.
     */
    @SerializedName(value = "firstDayOfWeek", alternate = {"FirstDayOfWeek"})
    @Expose
	@Nullable
    public DayOfWeek firstDayOfWeek;

    /**
     * The Index.
     * Specifies on which instance of the allowed days specified in daysOfsWeek the event occurs, counted from the first instance in the month. The possible values are: first, second, third, fourth, last. Default is first. Optional and used if type is relativeMonthly or relativeYearly.
     */
    @SerializedName(value = "index", alternate = {"Index"})
    @Expose
	@Nullable
    public WeekIndex index;

    /**
     * The Interval.
     * The number of units between occurrences, where units can be in days, weeks, months, or years, depending on the type. Required.
     */
    @SerializedName(value = "interval", alternate = {"Interval"})
    @Expose
	@Nullable
    public Integer interval;

    /**
     * The Month.
     * The month in which the event occurs.  This is a number from 1 to 12.
     */
    @SerializedName(value = "month", alternate = {"Month"})
    @Expose
	@Nullable
    public Integer month;

    /**
     * The Type.
     * The recurrence pattern type: daily, weekly, absoluteMonthly, relativeMonthly, absoluteYearly, relativeYearly. Required.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public RecurrencePatternType type;


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

    }
}
