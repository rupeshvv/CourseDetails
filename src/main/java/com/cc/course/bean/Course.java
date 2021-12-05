package com.cc.course.bean;

import javax.persistence.Column;
import javax.persistence.*;
@Entity
@Table(name="mycourses")
//course pojo
public class Course {
	@Id
	 @Column(name="cid")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;

	 @Column(name="cname")
	private String cname;

	 @Column(name="cost")
	private double cost;

	 @Column(name="duration")
	private int duration;

	 @Column(name="trainer")
	private String trainer; 
	 
	 public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
public Course() {}
	public Course(String cname, double cost, int duration, String trainer) {
		super();
		this.cname = cname;
		this.cost = cost;
		this.duration = duration;
		this.trainer = trainer;
	}

	@Override
	 public String toString() {
	  return cid + "\t" + cname + "\t" + cost + "\t" + duration + "\t" + trainer ;
	 } 
}
