package e4.app.filemanager.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

import e4.app.filemanager.viewers.FileExplorerTreeViewer;

/**
 * Tree to show the file system.
 * 
 * @author psuzzi
 *
 */
public class FileTree {

	@Inject
	public FileTree() {

	}

	TreeViewer fViewer;
	Tree tree;

	@PostConstruct
	public void postConstruct(Composite parent) {

		fViewer = createViewer(parent);
		fViewer.setUseHashlookup(true);
		fViewer.setContentProvider(getFContentProvider());
		fViewer.setLabelProvider(getFLabelProvider());
		fViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				fSelectionChanged();
			}

		});
		
		
		tree = fViewer.getTree();

	}

	/** react to the tree selection changed */
	private void fSelectionChanged() {
		// TODO Auto-generated method stub
		
	}
	
	/** create the tree label provider */
	private IBaseLabelProvider getFLabelProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	/** create the tree label provider */
	private IContentProvider getFContentProvider() {
		// TODO Auto-generated method stub
		return new ContentPro;
	}

	private TreeViewer createViewer(Composite composite) {
		return new FileExplorerTreeViewer(composite, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
	}

}