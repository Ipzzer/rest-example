package com.rest.services.model;

public class UserProfileSubscribe {
	
	private String address;
	private String eventDateTime;
	private String groupCode;
	private String serviceCode;
	private String channel;
	private String contextData;
	private boolean userRequest;
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEventDateTime() {
		return eventDateTime;
	}
	
	public void setEventDateTime(String eventDateTime) {
		this.eventDateTime = eventDateTime;
	}
	
	public String getGroupCode() {
		return groupCode;
	}
	
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	
	public String getServiceCode() {
		return serviceCode;
	}
	
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	
	public String getChannel() {
		return channel;
	}
	
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	public String getContextData() {
		return contextData;
	}
	
	public void setContextData(String contextData) {
		this.contextData = contextData;
	}
	
	public boolean isUserRequest() {
		return userRequest;
	}
	
	public void setUserRequest(boolean userRequest) {
		this.userRequest = userRequest;
	}
	
}
