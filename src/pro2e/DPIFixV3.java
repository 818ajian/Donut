package pro2e;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.UIManager;

// https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html#dynamic
// http://thebadprogrammer.com/swing-uimanager-keys/
// https://edn.embarcadero.com/article/29991
// http://stackoverflow.com/questions/7434845/setting-the-default-font-of-swing-program

public class DPIFixV3 {
	public static final Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	private static final int ifontSizeSwing = 17;
	private static final float fScale = 0.8f;
	public static float fontFactor = fScale * screen.height / 1080;
	private static Font fSwingFont = new Font("Sans-serif", Font.PLAIN, (int) (ifontSizeSwing * fontFactor));

	public static String[] swingFonts = { "Button.font", "CheckBox.font", "CheckBoxMenuItem.font",
			"CheckBoxMenuItem.acceleratorFont", "ColorChooser.font", "ComboBox.font", "EditorPane.font",
			"FormattedTextField.font", "IconButton.font", "InternalFrame.optionDialogTitleFont",
			"InternalFrame.titleFont", "InternalFrame.paletteTitleFont", "Label.font", "List.font", "Menu.font",
			"Menu.acceleratorFont", "MenuBar.font", "MenuItem.font", "MenuItem.acceleratorFont", "OptionPane.font",
			"OptionPane.buttonFont", "OptionPane.messageFont", "Panel.font", "PasswordField.font", "PopupMenu.font",
			"ProgressBar.font", "RadioButton.font", "RadioButtonMenuItem.font", "RadioButtonMenuItem.acceleratorFont",
			"ScrollPane.font", "Slider.font", "Spinner.font", "TabbedPane.font", "Table.font", "TabbedPane.smallFont",
			"TableHeader.font", "TextArea.font", "TextField.font", "TextPane.font", "TitledBorder.font",
			"ToggleButton.font", "ToolBar.font", "ToolTip.font", "Tree.font", "Viewport.font" };

	public static void scaleSwingFonts() {
		for (int i = 0; i < swingFonts.length; i++) {
			UIManager.put(swingFonts[i], fSwingFont);
		}
	}
}
