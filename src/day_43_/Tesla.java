package day_43_;

public class Tesla {
	private String model;
	private double zeroTo60;
	private double price;
	private int range;
	private boolean isSelfDriving;

	public String toString() {
		return "Tesla [model=" + model + ", zeroTo60=" + zeroTo60 + ", price=" + price + ", range=" + range
				+ ", isSelfDriving=" + isSelfDriving + "]";
	}

	public String getModel() {
		return model;

	}

	public void setModel(String model) {
		//call is ValidModel here then assign if true
		//if false: invalid model- camry
		//assign"unknow" to model
		if(isValidModel(model)) {
		this.model=model;
		}else {
			System.out.println("Invalid model "+model);
			this.model="unknown";
		}
	}

	public double getzero0To60() {
		return zeroTo60;

	}

	public void setzero0To60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}

	public double getprice() {
		return price;

	}

	public void setprice(double price) {
		this.price = price;
	}

	public int getrange() {
		return range;

	}

	public void setrange(int range) {
		this.range = range;
	}

	public boolean getisSelfDriving() {
		return isSelfDriving;

	}

	public void setisSelfDriving(boolean isSelfDriving) {
		this.isSelfDriving = isSelfDriving;
	}

	public boolean isValidModel(String model) {
		if (model.equalsIgnoreCase("MODEL S")
				|| (model.equalsIgnoreCase("MODEL 3") || (model.equalsIgnoreCase("MODEL X")
						|| (model.equalsIgnoreCase("MODEL Y") || (model.equalsIgnoreCase("Roadster")))))) {
			return true;
		}
		return false;

	}
	public void setInfo(String model, double zeroTo60,double price,int range,boolean isSelfDriving) {
		setModel(model);
		setisSelfDriving(isSelfDriving);
		setprice(price);
		setrange(range);
		setzero0To60(zeroTo60);
		
	}

}
