package simplepdl.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import simplepdl.SimplepdlPackage;
import simplepdl.diagram.edit.parts.GuidanceEditPart;
import simplepdl.diagram.edit.parts.ProcessEditPart;
import simplepdl.diagram.edit.parts.RessourceDefinitionEditPart;
import simplepdl.diagram.edit.parts.RessourceInstanceEditPart;
import simplepdl.diagram.edit.parts.WorkDefinitionEditPart;
import simplepdl.diagram.edit.parts.WorkSequenceEditPart;
import simplepdl.diagram.part.SimplePDLDiagramEditorPlugin;

/**
 * @generated
 */
public class SimplePDLElementTypes {

	/**
	 * @generated
	 */
	private SimplePDLElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Process_1000 = getElementType("BE.Graphical.diagram.Process_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RessourceDefinition_2001 = getElementType("BE.Graphical.diagram.RessourceDefinition_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Guidance_2004 = getElementType("BE.Graphical.diagram.Guidance_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WorkDefinition_2003 = getElementType("BE.Graphical.diagram.WorkDefinition_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RessourceInstance_4001 = getElementType("BE.Graphical.diagram.RessourceInstance_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WorkSequence_4002 = getElementType("BE.Graphical.diagram.WorkSequence_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return SimplePDLDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Process_1000, SimplepdlPackage.eINSTANCE.getProcess());

			elements.put(WorkDefinition_2003,
					SimplepdlPackage.eINSTANCE.getWorkDefinition());

			elements.put(RessourceDefinition_2001,
					SimplepdlPackage.eINSTANCE.getRessourceDefinition());

			elements.put(Guidance_2004,
					SimplepdlPackage.eINSTANCE.getGuidance());

			elements.put(RessourceInstance_4001,
					SimplepdlPackage.eINSTANCE.getRessourceInstance());

			elements.put(WorkSequence_4002,
					SimplepdlPackage.eINSTANCE.getWorkSequence());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Process_1000);
			KNOWN_ELEMENT_TYPES.add(WorkDefinition_2003);
			KNOWN_ELEMENT_TYPES.add(RessourceDefinition_2001);
			KNOWN_ELEMENT_TYPES.add(Guidance_2004);
			KNOWN_ELEMENT_TYPES.add(RessourceInstance_4001);
			KNOWN_ELEMENT_TYPES.add(WorkSequence_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ProcessEditPart.VISUAL_ID:
			return Process_1000;
		case WorkDefinitionEditPart.VISUAL_ID:
			return WorkDefinition_2003;
		case RessourceDefinitionEditPart.VISUAL_ID:
			return RessourceDefinition_2001;
		case GuidanceEditPart.VISUAL_ID:
			return Guidance_2004;
		case RessourceInstanceEditPart.VISUAL_ID:
			return RessourceInstance_4001;
		case WorkSequenceEditPart.VISUAL_ID:
			return WorkSequence_4002;
		}
		return null;
	}

}
