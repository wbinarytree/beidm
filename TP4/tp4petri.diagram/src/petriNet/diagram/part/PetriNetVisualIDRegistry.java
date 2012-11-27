package petriNet.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PetriNetVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "tp4petri.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (petriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
					.equals(view.getType())) {
				return petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return petriNet.diagram.part.PetriNetVisualIDRegistry.getVisualID(view
				.getType());
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
				petriNet.diagram.part.PetriNetDiagramEditorPlugin.getInstance()
						.logError(
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
		if (petriNet.PetriNetPackage.eINSTANCE.getPetriNet().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((petriNet.PetriNet) domainElement)) {
			return petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
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
		String containerModelID = petriNet.diagram.part.PetriNetVisualIDRegistry
				.getModelID(containerView);
		if (!petriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (petriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = petriNet.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			if (petriNet.PetriNetPackage.eINSTANCE.getTransition()
					.isSuperTypeOf(domainElement.eClass())) {
				return petriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID;
			}
			if (petriNet.PetriNetPackage.eINSTANCE.getPlace().isSuperTypeOf(
					domainElement.eClass())) {
				return petriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = petriNet.diagram.part.PetriNetVisualIDRegistry
				.getModelID(containerView);
		if (!petriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (petriNet.diagram.edit.parts.PetriNetEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = petriNet.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			if (petriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (petriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case petriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			if (petriNet.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case petriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			if (petriNet.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (petriNet.PetriNetPackage.eINSTANCE.getArc().isSuperTypeOf(
				domainElement.eClass())) {
			return petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(petriNet.PetriNet element) {
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
		case petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return false;
		case petriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
		case petriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
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
			return petriNet.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return petriNet.diagram.part.PetriNetVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return petriNet.diagram.part.PetriNetVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return petriNet.diagram.part.PetriNetVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return petriNet.diagram.part.PetriNetVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return petriNet.diagram.part.PetriNetVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
