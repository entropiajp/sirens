package jp.entropia.sirens.model;

import java.time.ZonedDateTime;

public class EventModel {

	private Integer id;
	private String name;
	private ZonedDateTime startTime;
	private ZonedDateTime endTime;
	private String place;
	private String logoImage;
	private ZonedDateTime voteStartTime;
	private ZonedDateTime voteEndTime;
	private String description;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ZonedDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(ZonedDateTime startTime) {
		this.startTime = startTime;
	}
	public ZonedDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(ZonedDateTime endTime) {
		this.endTime = endTime;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getLogoImage() {
		return logoImage;
	}
	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}
	public ZonedDateTime getVoteStartTime() {
		return voteStartTime;
	}
	public void setVoteStartTime(ZonedDateTime voteStartTime) {
		this.voteStartTime = voteStartTime;
	}
	public ZonedDateTime getVoteEndTime() {
		return voteEndTime;
	}
	public void setVoteEndTime(ZonedDateTime voteEndTime) {
		this.voteEndTime = voteEndTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
