package test;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import test.views.SampleView;
import test.views.SecondView;

public class PerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		// TODO Auto-generated method stub
		/*
		String editorArea=layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.addView(SampleView.ID, IPageLayout.RIGHT, 0.2f, editorArea);
		layout.addView(SecondView.ID, IPageLayout.RIGHT, 0.8f, editorArea);
		*/
		IFolderLayout folder = layout.createFolder("Folder", IPageLayout.LEFT, 0.5f, layout.getEditorArea());
	    folder.addView(SampleView.ID);
	    folder.addView(SecondView.ID);
	}

}
