package boundly.ui;

import boundly.menu.*;
import boundly.mode.*;

public class UI
{
	public static Select select;
	public static Exec exec;
	public static void main(String[] args)
	{
		select = new Select();
		exec = new Exec();
	}
}
