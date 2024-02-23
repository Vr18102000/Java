//class D is not allowed to inherit A

sealed class I extends Thread implements Cloneable permits G,H {
	
}

non-sealed class G extends I {						//sub-class should be sealed, non-sealed, final if it extends sealed class
	
}

final class H extends I {
	
}

class J extends G {
	
}


public class Sealed_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
