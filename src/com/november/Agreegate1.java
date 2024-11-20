package com.november;



	class Heart{
		private float weight;
		private float bpm;
		public Heart(float weight, float bpm) {
			super();
			this.weight = weight;
			this.bpm = bpm;
		}
		public float getWeight() {
			return weight;
		}
		public float getBpm() {
			return bpm;
		}
		
		
	}

	class Brain{
		private float weight;
		private String colour;
		public Brain(float weight, String colour) {
			super();
			this.weight = weight;
			this.colour = colour;
		}
		public float getWeight() {
			return weight;
		}
		public String getColour() {
			return colour;
		}
		
	}
	class Bike{
		private String company;
		private String model;
		public Bike(String company, String model) {
			super();
			this.company = company;
			this.model = model;
		}
		public String getCompany() {
			return company;
		}
		public String getModel() {
			return model;
		}
		
		
	}

	class Books {
		private String name;
		private String author;

		public Books(String name, String author) {
			super();
			this.name = name;
			this.author = author;
		}

		public String getName() {
			return name;
		}

		public String getAuthor() {
			return author;
		}

	}
	class HumanBeing {
		
		Heart heart=new Heart(450.0f,72.0f);
		
		Brain brain=new Brain(1400.0f,"Grey");
		
		void sports(Bike b) {
			System.out.println("BIke Company name is "+b.getCompany());
			System.out.println("Model name is "+b.getModel());
		}
		void study(Books b1) {
			System.out.println("Best Author is "+b1.getName());
			System.out.println("Best Language is "+b1.getAuthor());
		}

	}
	
	public class Agreegate1 {
		
	public static void main(String[] args) {
		
		Bike b=new Bike("KTM","Duke");
		Books b1=new Books("James","Java");
		HumanBeing hm=new HumanBeing();
		System.out.println("Human Body heart weight is "+hm.heart.getWeight());
		System.out.println("Human Body heart rate is "+hm.heart.getBpm());
		
		System.out.println("Human Body brain weight is "+hm.brain.getWeight());
		System.out.println("Human Body brain colour is "+hm.brain.getColour());
		hm.sports(b);
		hm.study(b1);
		
	}

}
