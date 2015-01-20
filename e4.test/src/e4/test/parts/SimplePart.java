 
package e4.test.parts;

import javax.inject.Inject;
import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

public class SimplePart {
	@Inject
	public SimplePart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		
		Label lblLabelCreatedBy = new Label(parent, SWT.NONE);
		lblLabelCreatedBy.setText("Label created by Window Builder");
		
	}
	
	
	
	
}