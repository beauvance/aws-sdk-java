/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reserved for future use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/WeeklySchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WeeklySchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     */
    private String dayOfWeek;

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * 
     * @param dayOfWeek
     *        Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY,
     *        THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * @see DayOfWeek
     */

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * 
     * @return Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY,
     *         THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * @see DayOfWeek
     */

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * 
     * @param dayOfWeek
     *        Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY,
     *        THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public WeeklySchedule withDayOfWeek(String dayOfWeek) {
        setDayOfWeek(dayOfWeek);
        return this;
    }

    /**
     * <p>
     * Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
     * FRIDAY, SATURDAY, and SUNDAY.
     * </p>
     * 
     * @param dayOfWeek
     *        Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY,
     *        THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DayOfWeek
     */

    public WeeklySchedule withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: ").append(getDayOfWeek());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WeeklySchedule == false)
            return false;
        WeeklySchedule other = (WeeklySchedule) obj;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        return hashCode;
    }

    @Override
    public WeeklySchedule clone() {
        try {
            return (WeeklySchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.WeeklyScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
