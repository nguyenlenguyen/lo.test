package com.logigear.qtium;
import com.logigear.selenium.QTiumAutomation;

public class QTiumAutomationManager {

	private static ThreadLocal<QTiumAutomation> _qtiumAutomation = new ThreadLocal<QTiumAutomation>();

	public static QTiumAutomation getAutomation(){
		return _qtiumAutomation.get();
	}

	public static void setAutomation(QTiumAutomation automation) {
		_qtiumAutomation.set(automation);				
	}
	
	public static void remove() {
		_qtiumAutomation.remove();			
	}
}
