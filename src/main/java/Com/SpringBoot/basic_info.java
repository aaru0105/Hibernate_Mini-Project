package Com.SpringBoot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WORKER")
public class basic_info {
	@Id
	@Column(name="Worker_ID")
	 private int id;
	
	@Column(name="Worker_Name")
	private String name;
	
	@Column(name="Hours")
	private int  hrs;
	
	@Column(name="Days")
	private int days;
	
	@Column(name="Ab_Days")
	private int ab_days1;
	
	@Column(name="Extra_Hours")
	private int e_hrs;
	
	@Column(name="Rate")
	private int rate;
	
	@Column(name="Wages")
	private float amt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getAb_days1() {
		return ab_days1;
	}

	public void setAb_days1(int ab_days1) {
		this.ab_days1 = ab_days1;
	}

	public int getE_hrs() {
		return e_hrs;
	}

	public void setE_hrs(int e_hrs) {
		this.e_hrs = e_hrs;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "basic_info [id=" + id + ", name=" + name + ", hrs=" + hrs + ", days=" + days + ", ab_days1=" + ab_days1
				+ ", e_hrs=" + e_hrs + ", rate=" + rate + ", amt=" + amt + "]";
	}

	public basic_info(int id, String name, int hrs, int days, int ab_days1, int e_hrs, int rate, float amt) {
		super();
		this.id = id;
		this.name = name;
		this.hrs = hrs;
		this.days = days;
		this.ab_days1 = ab_days1;
		this.e_hrs = e_hrs;
		this.rate = rate;
		this.amt = amt;
	}

	public basic_info() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}