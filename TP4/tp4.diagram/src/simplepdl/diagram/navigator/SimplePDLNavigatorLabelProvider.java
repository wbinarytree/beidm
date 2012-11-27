package simplepdl.diagram.navigator;

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

import simplepdl.Process;
import simplepdl.WorkSequence;
import simplepdl.diagram.edit.parts.GuidanceEditPart;
import simplepdl.diagram.edit.parts.GuidanceElementEditPart;
import simplepdl.diagram.edit.parts.GuidanceTextEditPart;
import simplepdl.diagram.edit.parts.ProcessEditPart;
import simplepdl.diagram.edit.parts.WorkDefinitionEditPart;
import simplepdl.diagram.edit.parts.WorkDefinitionNameEditPart;
import simplepdl.diagram.edit.parts.WorkSequenceEditPart;
import simplepdl.diagram.part.SimplePDLDiagramEditorPlugin;
import simplepdl.diagram.part.SimplePDLVisualIDRegistry;
import simplepdl.diagram.providers.SimplePDLElementTypes;
import simplepdl.diagram.providers.SimplePDLParserProvider;

/**
 * @generated
 */
public class SimplePDLNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SimplePDLDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SimplePDLDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SimplePDLNavigatorItem
				&& !isOwnView(((SimplePDLNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SimplePDLNavigatorGroup) {
			SimplePDLNavigatorGroup group = (SimplePDLNavigatorGroup) element;
			return SimplePDLDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof SimplePDLNavigatorItem) {
			SimplePDLNavigatorItem navigatorItem = (SimplePDLNavigatorItem) element;
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
		switch (SimplePDLVisualIDRegistry.getVisualID(view)) {
		case GuidanceElementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://simplepdl?Guidance?element", SimplePDLElementTypes.GuidanceElement_4001); //$NON-NLS-1$
		case WorkSequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://simplepdl?WorkSequence", SimplePDLElementTypes.WorkSequence_4002); //$NON-NLS-1$
		case ProcessEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://simplepdl?Process", SimplePDLElementTypes.Process_1000); //$NON-NLS-1$
		case GuidanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://simplepdl?Guidance", SimplePDLElementTypes.Guidance_2002); //$NON-NLS-1$
		case WorkDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://simplepdl?WorkDefinition", SimplePDLElementTypes.WorkDefinition_2001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SimplePDLDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SimplePDLElementTypes.isKnownElementType(elementType)) {
			image = SimplePDLElementTypes.getImage(elementType);
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
		if (element instanceof SimplePDLNavigatorGroup) {
			SimplePDLNavigatorGroup group = (SimplePDLNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SimplePDLNavigatorItem) {
			SimplePDLNavigatorItem navigatorItem = (SimplePDLNavigatorItem) element;
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
		switch (SimplePDLVisualIDRegistry.getVisualID(view)) {
		case GuidanceElementEditPart.VISUAL_ID:
			return getGuidanceElement_4001Text(view);
		case WorkSequenceEditPart.VISUAL_ID:
			return getWorkSequence_4002Text(view);
		case ProcessEditPart.VISUAL_ID:
			return getProcess_1000Text(view);
		case GuidanceEditPart.VISUAL_ID:
			return getGuidance_2002Text(view);
		case WorkDefinitionEditPart.VISUAL_ID:
			return getWorkDefinition_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getWorkDefinition_2001Text(View view) {
		IParser parser = SimplePDLParserProvider.getParser(
				SimplePDLElementTypes.WorkDefinition_2001,
				view.getElement() != null ? view.getElement() : view,
				SimplePDLVisualIDRegistry
						.getType(WorkDefinitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplePDLDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGuidanceElement_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWorkSequence_4002Text(View view) {
		WorkSequence domainModelElement = (WorkSequence) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getLinkType());
		} else {
			SimplePDLDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcess_1000Text(View view) {
		Process domainModelElement = (Process) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SimplePDLDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGuidance_2002Text(View view) {
		IParser parser = SimplePDLParserProvider.getParser(
				SimplePDLElementTypes.Guidance_2002,
				view.getElement() != null ? view.getElement() : view,
				SimplePDLVisualIDRegistry
						.getType(GuidanceTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplePDLDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
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
		return ProcessEditPart.MODEL_ID.equals(SimplePDLVisualIDRegistry
				.getModelID(view));
	}

}
