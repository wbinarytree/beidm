package petriNet.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class PetriNetDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetNodeDescriptor> getSemanticChildren(
			View view) {
		switch (petriNet.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetNodeDescriptor> getPetriNet_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		petriNet.PetriNet modelElement = (petriNet.PetriNet) view.getElement();
		LinkedList<petriNet.diagram.part.PetriNetNodeDescriptor> result = new LinkedList<petriNet.diagram.part.PetriNetNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			petriNet.Node childElement = (petriNet.Node) it.next();
			int visualID = petriNet.diagram.part.PetriNetVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == petriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID) {
				result.add(new petriNet.diagram.part.PetriNetNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == petriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID) {
				result.add(new petriNet.diagram.part.PetriNetNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getContainedLinks(
			View view) {
		switch (petriNet.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
			return getPetriNet_1000ContainedLinks(view);
		case petriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2002ContainedLinks(view);
		case petriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2001ContainedLinks(view);
		case petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return getArc_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getIncomingLinks(
			View view) {
		switch (petriNet.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case petriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2002IncomingLinks(view);
		case petriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2001IncomingLinks(view);
		case petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return getArc_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (petriNet.diagram.part.PetriNetVisualIDRegistry
				.getVisualID(view)) {
		case petriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_2002OutgoingLinks(view);
		case petriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
			return getPlace_2001OutgoingLinks(view);
		case petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID:
			return getArc_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getPetriNet_1000ContainedLinks(
			View view) {
		petriNet.PetriNet modelElement = (petriNet.PetriNet) view.getElement();
		LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getPlace_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getTransition_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getArc_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getPlace_2001IncomingLinks(
			View view) {
		petriNet.Place modelElement = (petriNet.Place) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getTransition_2002IncomingLinks(
			View view) {
		petriNet.Transition modelElement = (petriNet.Transition) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getArc_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getPlace_2001OutgoingLinks(
			View view) {
		petriNet.Place modelElement = (petriNet.Place) view.getElement();
		LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getTransition_2002OutgoingLinks(
			View view) {
		petriNet.Transition modelElement = (petriNet.Transition) view
				.getElement();
		LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<petriNet.diagram.part.PetriNetLinkDescriptor> getArc_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<petriNet.diagram.part.PetriNetLinkDescriptor> getContainedTypeModelFacetLinks_Arc_4001(
			petriNet.PetriNet container) {
		LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor>();
		for (Iterator<?> links = container.getArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof petriNet.Arc) {
				continue;
			}
			petriNet.Arc link = (petriNet.Arc) linkObject;
			if (petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID != petriNet.diagram.part.PetriNetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			petriNet.Node dst = link.getTarget();
			petriNet.Node src = link.getSource();
			result.add(new petriNet.diagram.part.PetriNetLinkDescriptor(src,
					dst, link,
					petriNet.diagram.providers.PetriNetElementTypes.Arc_4001,
					petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<petriNet.diagram.part.PetriNetLinkDescriptor> getIncomingTypeModelFacetLinks_Arc_4001(
			petriNet.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != petriNet.PetriNetPackage.eINSTANCE
					.getArc_Target()
					|| false == setting.getEObject() instanceof petriNet.Arc) {
				continue;
			}
			petriNet.Arc link = (petriNet.Arc) setting.getEObject();
			if (petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID != petriNet.diagram.part.PetriNetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			petriNet.Node src = link.getSource();
			result.add(new petriNet.diagram.part.PetriNetLinkDescriptor(src,
					target, link,
					petriNet.diagram.providers.PetriNetElementTypes.Arc_4001,
					petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<petriNet.diagram.part.PetriNetLinkDescriptor> getOutgoingTypeModelFacetLinks_Arc_4001(
			petriNet.Node source) {
		petriNet.PetriNet container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof petriNet.PetriNet) {
				container = (petriNet.PetriNet) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor> result = new LinkedList<petriNet.diagram.part.PetriNetLinkDescriptor>();
		for (Iterator<?> links = container.getArcs().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof petriNet.Arc) {
				continue;
			}
			petriNet.Arc link = (petriNet.Arc) linkObject;
			if (petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID != petriNet.diagram.part.PetriNetVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			petriNet.Node dst = link.getTarget();
			petriNet.Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new petriNet.diagram.part.PetriNetLinkDescriptor(src,
					dst, link,
					petriNet.diagram.providers.PetriNetElementTypes.Arc_4001,
					petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<petriNet.diagram.part.PetriNetNodeDescriptor> getSemanticChildren(
				View view) {
			return PetriNetDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<petriNet.diagram.part.PetriNetLinkDescriptor> getContainedLinks(
				View view) {
			return PetriNetDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<petriNet.diagram.part.PetriNetLinkDescriptor> getIncomingLinks(
				View view) {
			return PetriNetDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<petriNet.diagram.part.PetriNetLinkDescriptor> getOutgoingLinks(
				View view) {
			return PetriNetDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
