package basic.enu;
import static basic.enu.PowerState.OFF;
import static basic.enu.PowerState.ON;
import static basic.enu.PowerState.SUSPEND;;

public class ComputerTest {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.setState(OFF);
		com.setState(ON);
		com.setState(SUSPEND);
	}
}

