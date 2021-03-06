/*
 * Copyright 2016 EPAM Systems
 * 
 * 
 * This file is part of EPAM Report Portal.
 * https://github.com/epam/ReportPortal
 * 
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */ 
 
package com.epam.ta.reportportal.ws.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JSON Representation of Report Portal domain object. Extends Spring's
 * {@link org.springframework.hateoas.ResourceSupport} class which contains
 * several fields related to HATEAOS constraint
 * 
 * @see <a href="http://en.wikipedia.org/wiki/HATEOAS">HATEOAS Description</a>
 */
@JsonInclude(Include.NON_NULL)
public class ActivityResource extends ResourceSupport {

	@NotNull
	@JsonProperty(value = "activityId", required = true)
	@ApiModelProperty(required = true)
	private String activityId;

	@NotNull
	@JsonProperty(value = "userRef", required = true)
	@ApiModelProperty(required = true)
	private String userRef;

	@NotNull
	@JsonProperty(value = "loggedObjectRef", required = true)
	@ApiModelProperty(required = true)
	private String loggedObjectRef;

	@NotNull
	@JsonProperty(value = "lastModifiedDate", required = true)
	@ApiModelProperty(required = true)
	private Date lastModifiedDate;

	@NotNull
	@JsonProperty(value = "actionType", required = true)
	@ApiModelProperty(required = true)
	private String actionType;

	@NotNull
	@JsonProperty(value = "objectType", required = true)
	@ApiModelProperty(required = true)
	private String objectType;

	@NotNull
	@JsonProperty(value = "projectRef", required = true)
	@ApiModelProperty(required = true)
	private String projectRef;

	@JsonProperty(value = "history")
	private Map<String, FieldValues> history;

	public String getProjectRef() {
		return projectRef;
	}

	public void setProjectRef(String projectRef) {
		this.projectRef = projectRef;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getUserRef() {
		return userRef;
	}

	public void setUserRef(String userRef) {
		this.userRef = userRef;
	}

	public String getLoggedObjectRef() {
		return loggedObjectRef;
	}

	public void setLoggedObjectRef(String loggedObjectRef) {
		this.loggedObjectRef = loggedObjectRef;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Map<String, FieldValues> getHistory() {
		return null == history ? new HashMap<String, FieldValues>() : history;
	}

	public void setHistory(Map<String, FieldValues> history) {
		this.history = history;
	}

	@JsonInclude(Include.NON_NULL)
	public static class FieldValues {

		@JsonProperty(value = "oldValue")
		private String oldValue;

		@JsonProperty(value = "newValue")
		private String newValue;

		public String getOldValue() {
			return oldValue;
		}

		public void setOldValue(String oldValue) {
			this.oldValue = oldValue;
		}

		public String getNewValue() {
			return newValue;
		}

		public void setNewValue(String newValue) {
			this.newValue = newValue;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder("FieldValues{");
			sb.append("oldValue='").append(oldValue).append('\'');
			sb.append(", newValue='").append(newValue).append('\'');
			sb.append('}');
			return sb.toString();
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ActivityResource{");
		sb.append("activityId='").append(activityId).append('\'');
		sb.append(", userRef='").append(userRef).append('\'');
		sb.append(", loggedObjectRef='").append(loggedObjectRef).append('\'');
		sb.append(", lastModifiedDate=").append(lastModifiedDate);
		sb.append(", actionType='").append(actionType).append('\'');
		sb.append(", objectType='").append(objectType).append('\'');
		sb.append(", projectRef='").append(projectRef).append('\'');
		sb.append(", history=").append(history);
		sb.append('}');
		return sb.toString();
	}
}