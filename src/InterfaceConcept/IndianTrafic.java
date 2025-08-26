package InterfaceConcept;

public class IndianTrafic implements CentralTraficRule {

	public static void main(String[] args) {
		CentralTraficRule tr=new IndianTrafic();
		tr.redSignal();
		tr.greenSignal();
		tr.yellowSignal();

	}

	@Override
	public void redSignal() {
		System.out.println("Stop your vehicle, Red signal is ON");
	
		
	}

	@Override
	public void greenSignal() {
		System.out.println("Go, Green signal is ON");
		
	}

	@Override
	public void yellowSignal() {
		System.out.println("Get ready to stop, Yellow signal is ON");
		
	}

}
