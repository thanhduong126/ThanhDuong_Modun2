package LopVaDoiTuongTrongJAVA.XayDungLopStopWatch;

import java.sql.Time;
import java.time.LocalTime;

public class StopWatch {
	private String starTime;
	private  String endTime;

	public StopWatch() {
	}

	public StopWatch(String starTime, String endTime) {
		this.starTime = starTime;
		this.endTime = endTime;
	}

	public String getStarTime() {
		return starTime;
	}

	public void setStarTime(String starTime) {
		this.starTime = starTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
