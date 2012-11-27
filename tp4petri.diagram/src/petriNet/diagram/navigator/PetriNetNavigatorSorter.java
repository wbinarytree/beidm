package petriNet.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class PetriNetNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof petriNet.diagram.navigator.PetriNetNavigatorItem) {
			petriNet.diagram.navigator.PetriNetNavigatorItem item = (petriNet.diagram.navigator.PetriNetNavigatorItem) element;
			return petriNet.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
