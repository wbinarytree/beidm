package simplepdl.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import simplepdl.Process;
import simplepdl.SimplepdlPackage;
import simplepdl.diagram.edit.parts.GuidanceEditPart;
import simplepdl.diagram.edit.parts.GuidanceTextEditPart;
import simplepdl.diagram.edit.parts.ProcessEditPart;
import simplepdl.diagram.edit.parts.RessourceDefinitionEditPart;
import simplepdl.diagram.edit.parts.RessourceDefinitionNameEditPart;
import simplepdl.diagram.edit.parts.RessourceInstanceEditPart;
import simplepdl.diagram.edit.parts.WorkDefinitionEditPart;
import simplepdl.diagram.edit.parts.WorkDefinitionNameEditPart;
import simplepdl.diagram.edit.parts.WorkSequenceEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SimplePDLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "BE.Graphical.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ProcessEditPart.MODEL_ID.equals(view.getType())) {
				return ProcessEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return simplepdl.diagram.part.SimplePDLVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SimplePDLDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SimplepdlPackage.eINSTANCE.getProcess().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Process) domainElement)) {
			return ProcessEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = simplepdl.diagram.part.SimplePDLVisualIDRegistry
				.getModelID(containerView);
		if (!ProcessEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ProcessEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = simplepdl.diagram.part.SimplePDLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProcessEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ProcessEditPart.VISUAL_ID:
			if (SimplepdlPackage.eINSTANCE.getWorkDefinition().isSuperTypeOf(
					domainElement.eClass())) {
				return WorkDefinitionEditPart.VISUAL_ID;
			}
			if (SimplepdlPackage.eINSTANCE.getRessourceDefinition()
					.isSuperTypeOf(domainElement.eClass())) {
				return RessourceDefinitionEditPart.VISUAL_ID;
			}
			if (SimplepdlPackage.eINSTANCE.getGuidance().isSuperTypeOf(
					domainElement.eClass())) {
				return GuidanceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = simplepdl.diagram.part.SimplePDLVisualIDRegistry
				.getModelID(containerView);
		if (!ProcessEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ProcessEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = simplepdl.diagram.part.SimplePDLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProcessEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ProcessEditPart.VISUAL_ID:
			if (WorkDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RessourceDefinitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GuidanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkDefinitionEditPart.VISUAL_ID:
			if (WorkDefinitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RessourceDefinitionEditPart.VISUAL_ID:
			if (RessourceDefinitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GuidanceEditPart.VISUAL_ID:
			if (GuidanceTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SimplepdlPackage.eINSTANCE.getRessourceInstance().isSuperTypeOf(
				domainElement.eClass())) {
			return RessourceInstanceEditPart.VISUAL_ID;
		}
		if (SimplepdlPackage.eINSTANCE.getWorkSequence().isSuperTypeOf(
				domainElement.eClass())) {
			return WorkSequenceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Process element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ProcessEditPart.VISUAL_ID:
			return false;
		case RessourceDefinitionEditPart.VISUAL_ID:
		case WorkDefinitionEditPart.VISUAL_ID:
		case GuidanceEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return simplepdl.diagram.part.SimplePDLVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return simplepdl.diagram.part.SimplePDLVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return simplepdl.diagram.part.SimplePDLVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return simplepdl.diagram.part.SimplePDLVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return simplepdl.diagram.part.SimplePDLVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return simplepdl.diagram.part.SimplePDLVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
