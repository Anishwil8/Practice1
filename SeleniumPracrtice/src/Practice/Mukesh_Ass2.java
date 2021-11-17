package Practice;

public class Mukesh_Ass2 {

	private String trainerName = "Mukesh";;
	
	public static void main(String[] args) {
		// TODO Auto-generated method study
	
		 
		 Mukesh_Ass2 Dude = new Mukesh_Ass2();
	     Dude.seleniumTraining();
	     Dude.devOpsTraining();
	     Dude.jmeterTraining();
	}
	

		public void seleniumTraining() {
			
			String price = "200USD";
		   
		   System.out.println("Welcome to Online Training Program\n"
		   		+ "	Thank you showing interest in training program\n"
		   		+ "	Selenium Training charges are "+price+" and Trainer name is "+this.trainerName);

	   		}
		
	   public void devOpsTraining() {
		   
		   String price = "300USD";
		   System.out.println("Welcome to Online Training Program\n"
		   		+ "	Thank you showing interest in training program\n"
		   		+ "	DevOps Training charges are "+price+" and Trainer name is "+this.trainerName);
		   }
		
	   public void jmeterTraining() {
		   
		   String price = "400USD";
		   
		   System.out.println("Welcome to Online Training Program\n"
		   		+ "	Thank you showing interest in training program\n"
		   		+ "	JMeter Training charges are "+price+" and Trainer name is "+this.trainerName);
		  }
	

}
