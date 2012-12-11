package simplepdl.diagram.part;

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

import simplepdl.Process;
import simplepdl.ProcessElement;
import simplepdl.RessourceDefinition;
import simplepdl.RessourceInstance;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.diagram.edit.parts.GuidanceEditPart;
import simplepdl.diagram.edit.parts.ProcessEditPart;
import simplepdl.diagram.edit.parts.RessourceDefinitionEditPart;
import simplepdl.diagram.edit.parts.RessourceInstanceEditPart;
import simplepdl.diagram.edit.parts.WorkDefinitionEditPart;
import simplepdl.diagram.edit.parts.WorkSequenceEditPart;
import simplepdl.diagram.providers.SimplePDLElementTypes;

/**
 * @generated
 */
public class SimplePDLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SimplePDLNodeDescriptor> getSemanticChildren(View view) {
		switch (SimplePDLVisualIDRegistry.getVisualID(view)) {
		case ProcessEditPart.VISUAL_ID:
			return getProcess_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLNodeDescriptor> getProcess_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Process modelElement = (Process) view.getElement();
		LinkedList<SimplePDLNodeDescriptor> result = new LinkedList<SimplePDLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProcessElements().iterator(); it
				.hasNext();) {
			ProcessElement childElement = (ProcessElement) it.next();
			int visualID = SimplePDLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WorkDefinitionEditPart.VISUAL_ID) {
				result.add(new SimplePDLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RessourceDefinitionEditPart.VISUAL_ID) {
				result.add(new SimplePDLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GuidanceEditPart.VISUAL_ID) {
				result.add(new SimplePDLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getContainedLinks(View view) {
		switch (SimplePDLVisualIDRegistry.getVisualID(view)) {
		case ProcessEditPart.VISUAL_ID:
			return getProcess_1000ContainedLinks(view);
		case WorkDefinitionEditPart.VISUAL_ID:
			return getWorkDefinition_2003ContainedLinks(view);
		case RessourceDefinitionEditPart.VISUAL_ID:
			return getRessourceDefinition_2001ContainedLinks(view);
		case GuidanceEditPart.VISUAL_ID:
			return getGuidance_2004ContainedLinks(view);
		case RessourceInstanceEditPart.VISUAL_ID:
			return getRessourceInstance_4001ContainedLinks(view);
		case WorkSequenceEditPart.VISUAL_ID:
			return getWorkSequence_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getIncomingLinks(View view) {
		switch (SimplePDLVisualIDRegistry.getVisualID(view)) {
		case WorkDefinitionEditPart.VISUAL_ID:
			return getWorkDefinition_2003IncomingLinks(view);
		case RessourceDefinitionEditPart.VISUAL_ID:
			return getRessourceDefinition_2001IncomingLinks(view);
		case GuidanceEditPart.VISUAL_ID:
			return getGuidance_2004IncomingLinks(view);
		case RessourceInstanceEditPart.VISUAL_ID:
			return getRessourceInstance_4001IncomingLinks(view);
		case WorkSequenceEditPart.VISUAL_ID:
			return getWorkSequence_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getOutgoingLinks(View view) {
		switch (SimplePDLVisualIDRegistry.getVisualID(view)) {
		case WorkDefinitionEditPart.VISUAL_ID:
			return getWorkDefinition_2003OutgoingLinks(view);
		case RessourceDefinitionEditPart.VISUAL_ID:
			return getRessourceDefinition_2001OutgoingLinks(view);
		case GuidanceEditPart.VISUAL_ID:
			return getGuidance_2004OutgoingLinks(view);
		case RessourceInstanceEditPart.VISUAL_ID:
			return getRessourceInstance_4001OutgoingLinks(view);
		case WorkSequenceEditPart.VISUAL_ID:
			return getWorkSequence_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getProcess_1000ContainedLinks(
			View view) {
		Process modelElement = (Process) view.getElement();
		LinkedList<SimplePDLLinkDescriptor> result = new LinkedList<SimplePDLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RessourceInstance_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_WorkSequence_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getRessourceDefinition_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getGuidance_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getWorkDefinition_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getRessourceInstance_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getWorkSequence_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getRessourceDefinition_2001IncomingLinks(
			View view) {
		RessourceDefinition modelElement = (RessourceDefinition) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimplePDLLinkDescriptor> result = new LinkedList<SimplePDLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RessourceInstance_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getGuidance_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getWorkDefinition_2003IncomingLinks(
			View view) {
		WorkDefinition modelElement = (WorkDefinition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimplePDLLinkDescriptor> result = new LinkedList<SimplePDLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_WorkSequence_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getRessourceInstance_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getWorkSequence_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getRessourceDefinition_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getGuidance_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getWorkDefinition_2003OutgoingLinks(
			View view) {
		WorkDefinition modelElement = (WorkDefinition) view.getElement();
		LinkedList<SimplePDLLinkDescriptor> result = new LinkedList<SimplePDLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RessourceInstance_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_WorkSequence_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getRessourceInstance_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplePDLLinkDescriptor> getWorkSequence_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SimplePDLLinkDescriptor> getContainedTypeModelFacetLinks_RessourceInstance_4001(
			Process container) {
		LinkedList<SimplePDLLinkDescriptor> result = new LinkedList<SimplePDLLinkDescriptor>();
		for (Iterator<?> links = container.getProcessElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RessourceInstance) {
				continue;
			}
			RessourceInstance link = (RessourceInstance) linkObject;
			if (RessourceInstanceEditPart.VISUAL_ID != SimplePDLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RessourceDefinition dst = link.getType();
			WorkDefinition src = link.getActivity();
			result.add(new SimplePDLLinkDescriptor(src, dst, link,
					SimplePDLElementTypes.RessourceInstance_4001,
					RessourceInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimplePDLLinkDescriptor> getContainedTypeModelFacetLinks_WorkSequence_4002(
			Process container) {
		LinkedList<SimplePDLLinkDescriptor> result = new LinkedList<SimplePDLLinkDescriptor>();
		for (Iterator<?> links = container.getProcessElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WorkSequence) {
				continue;
			}
			WorkSequence link = (WorkSequence) linkObject;
			if (WorkSequenceEditPart.VISUAL_ID != SimplePDLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WorkDefinition dst = link.getSuccessor();
			WorkDefinition src = link.getPredecessor();
			result.add(new SimplePDLLinkDescriptor(src, dst, link,
					SimplePDLElementTypes.WorkSequence_4002,
					WorkSequenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimplePDLLinkDescriptor> getIncomingTypeModelFacetLinks_RessourceInstance_4001(
			RessourceDefinition target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimplePDLLinkDescriptor> result = new LinkedList<SimplePDLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SimplepdlPackage.eINSTANCE
					.getRessourceInstance_Type()
					|| false == setting.getEObject() instanceof RessourceInstance) {
				continue;
			}
			RessourceInstance link = (RessourceInstance) setting.getEObject();
			if (RessourceInstanceEditPart.VISUAL_ID != SimplePDLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WorkDefinition src = link.getActivity();
			result.add(new SimplePDLLinkDescriptor(src, target, link,
					SimplePDLElementTypes.RessourceInstance_4001,
					RessourceInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimplePDLLinkDescriptor> getIncomingTypeModelFacetLinks_WorkSequence_4002(
			WorkDefinition target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimplePDLLinkDescriptor> result = new LinkedList<SimplePDLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SimplepdlPackage.eINSTANCE
					.getWorkSequence_Successor()
					|| false == setting.getEObject() instanceof WorkSequence) {
				continue;
			}
			WorkSequence link = (WorkSequence) setting.getEObject();
			if (WorkSequenceEditPart.VISUAL_ID != SimplePDLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WorkDefinition src = link.getPredecessor();
			result.add(new SimplePDLLinkDescriptor(src, target, link,
					SimplePDLElementTypes.WorkSequence_4002,
					WorkSequenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimplePDLLinkDescriptor> getOutgoingTypeModelFacetLinks_RessourceInstance_4001(
			WorkDefinition source) {
		Process container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Process) {
				container = (Process) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SimplePDLLinkDescriptor> result = new LinkedList<SimplePDLLinkDescriptor>();
		for (Iterator<?> links = container.getProcessElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RessourceInstance) {
				continue;
			}
			RessourceInstance link = (RessourceInstance) linkObject;
			if (RessourceInstanceEditPart.VISUAL_ID != SimplePDLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			RessourceDefinition dst = link.getType();
			WorkDefinition src = link.getActivity();
			if (src != source) {
				continue;
			}
			result.add(new SimplePDLLinkDescriptor(src, dst, link,
					SimplePDLElementTypes.RessourceInstance_4001,
					RessourceInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimplePDLLinkDescriptor> getOutgoingTypeModelFacetLinks_WorkSequence_4002(
			WorkDefinition source) {
		Process container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Process) {
				container = (Process) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SimplePDLLinkDescriptor> result = new LinkedList<SimplePDLLinkDescriptor>();
		for (Iterator<?> links = container.getProcessElements().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof WorkSequence) {
				continue;
			}
			WorkSequence link = (WorkSequence) linkObject;
			if (WorkSequenceEditPart.VISUAL_ID != SimplePDLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			WorkDefinition dst = link.getSuccessor();
			WorkDefinition src = link.getPredecessor();
			if (src != source) {
				continue;
			}
			result.add(new SimplePDLLinkDescriptor(src, dst, link,
					SimplePDLElementTypes.WorkSequence_4002,
					WorkSequenceEditPart.VISUAL_ID));
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
		public List<SimplePDLNodeDescriptor> getSemanticChildren(View view) {
			return SimplePDLDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SimplePDLLinkDescriptor> getContainedLinks(View view) {
			return SimplePDLDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SimplePDLLinkDescriptor> getIncomingLinks(View view) {
			return SimplePDLDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SimplePDLLinkDescriptor> getOutgoingLinks(View view) {
			return SimplePDLDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
