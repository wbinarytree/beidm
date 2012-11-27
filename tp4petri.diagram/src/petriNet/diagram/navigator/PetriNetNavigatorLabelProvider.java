package petriNet.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class PetriNetNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		petriNet.diagram.part.PetriNetDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		petriNet.diagram.part.PetriNetDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof petriNet.diagram.navigator.PetriNetNavigatorItem
				&& !isOwnView(((petriNet.diagram.navigator.PetriNetNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof petriNet.diagram.navigator.PetriNetNavigatorGroup) {
			petriNet.diagram.navigator.PetriNetNavigatorGroup group = (petriNet.diagram.navigator.PetriNetNavigatorGroup) element;
			return petriNet.diagram.part.PetriNetDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof petriNet.diagram.navigator.PetriNetNavigatorItem) {
			petriNet.diagram.navigator.PetriNetNavigatorItem navigatorItem = (petriNet.diagram.navigator.PetriNetNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (petriNet.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://petrinet?Arc", petriNet.diagram.providers.PetriNetElementTypes.Arc_4001); //$NON-NLS-1$
		case petriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://petrinet?Place", petriNet.diagram.providers.PetriNetElementTypes.Place_2001); //$NON-NLS-1$
		case petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://petrinet?PetriNet", petriNet.diagram.providers.PetriNetElementTypes.PetriNet_1000); //$NON-NLS-1$
		case petriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://petrinet?Transition", petriNet.diagram.providers.PetriNetElementTypes.Transition_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = petriNet.diagram.part.PetriNetDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& petriNet.diagram.providers.PetriNetElementTypes
						.isKnownElementType(elementType)) {
			image = petriNet.diagram.providers.PetriNetElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof petriNet.diagram.navigator.PetriNetNavigatorGroup) {
			petriNet.diagram.navigator.PetriNetNavigatorGroup group = (petriNet.diagram.navigator.PetriNetNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof petriNet.diagram.navigator.PetriNetNavigatorItem) {
			petriNet.diagram.navigator.PetriNetNavigatorItem navigatorItem = (petriNet.diagram.navigator.PetriNetNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (petriNet.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return getArc_4001Text(view);
		case petriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2001Text(view);
		case petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000Text(view);
		case petriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTransition_2002Text(View view) {
		IParser parser = petriNet.diagram.providers.PetriNetParserProvider
				.getParser(
						petriNet.diagram.providers.PetriNetElementTypes.Transition_2002,
						view.getElement() != null ? view.getElement() : view,
						petriNet.diagram.part.PetriNetVisualIDRegistry
								.getType(petriNet.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			petriNet.diagram.part.PetriNetDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArc_4001Text(View view) {
		petriNet.Arc domainModelElement = (petriNet.Arc) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getWeight());
		} else {
			petriNet.diagram.part.PetriNetDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlace_2001Text(View view) {
		IParser parser = petriNet.diagram.providers.PetriNetParserProvider
				.getParser(
						petriNet.diagram.providers.PetriNetElementTypes.Place_2001,
						view.getElement() != null ? view.getElement() : view,
						petriNet.diagram.part.PetriNetVisualIDRegistry
								.getType(petriNet.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			petriNet.diagram.part.PetriNetDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPetriNet_1000Text(View view) {
		petriNet.PetriNet domainModelElement = (petriNet.PetriNet) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			petriNet.diagram.part.PetriNetDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return petriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(petriNet.diagram.part.PetriNetVisualIDRegistry
						.getModelID(view));
	}

}
