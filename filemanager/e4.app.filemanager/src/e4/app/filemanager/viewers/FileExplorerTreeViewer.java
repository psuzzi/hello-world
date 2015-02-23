package e4.app.filemanager.viewers;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

/**
 * Extends treeviewer to improve performances in visualization
 * @author psuzzi
 *
 */
public class FileExplorerTreeViewer extends TreeViewer {

	public FileExplorerTreeViewer(Composite parent, int style) {
		super(parent, style);
	}

}
