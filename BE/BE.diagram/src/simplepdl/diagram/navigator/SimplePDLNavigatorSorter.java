package simplepdl.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import simplepdl.diagram.part.SimplePDLVisualIDRegistry;

/**
 * @generated
 */
public class SimplePDLNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SimplePDLNavigatorItem) {
			SimplePDLNavigatorItem item = (SimplePDLNavigatorItem) element;
			return SimplePDLVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
