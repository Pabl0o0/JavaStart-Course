
public class Computer {

	private String producer;
	private int model;
	

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
		if (model<1 || model>1000000){
			System.out.println("Model jest w zakresie 1 - 1 000 000....wprowadz poprawny numer modelu !!");
		}
		}
	
	
	public Computer(String producer, int model){
		setProducer(producer);
		setModel(model);
		
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Computer)) {
			return false;
		}
		Computer other = (Computer) obj;
		if (model != other.model) {
			return false;
		}
		if (producer == null) {
			if (other.producer != null) {
				return false;
			}
		} else if (!producer.equals(other.producer)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return producer + " " + model;
	}
	
}
