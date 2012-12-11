package simplepdl.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import simplepdl.SimplepdlPackage;
import simplepdl.diagram.edit.parts.GuidanceTextEditPart;
import simplepdl.diagram.edit.parts.RessourceDefinitionNameEditPart;
import simplepdl.diagram.edit.parts.WorkDefinitionNameEditPart;
import simplepdl.diagram.parsers.MessageFormatParser;
import simplepdl.diagram.part.SimplePDLVisualIDRegistry;

/**
 * @generated
 */
public class SimplePDLParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser ressourceDefinitionName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getRessourceDefinitionName_5001Parser() {
		if (ressourceDefinitionName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplepdlPackage.eINSTANCE
					.getRessourceDefinition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ressourceDefinitionName_5001Parser = parser;
		}
		return ressourceDefinitionName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser guidanceText_5004Parser;

	/**
	 * @generated
	 */
	private IParser getGuidanceText_5004Parser() {
		if (guidanceText_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplepdlPackage.eINSTANCE
					.getGuidance_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			guidanceText_5004Parser = parser;
		}
		return guidanceText_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser workDefinitionName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getWorkDefinitionName_5003Parser() {
		if (workDefinitionName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplepdlPackage.eINSTANCE
					.getWorkDefinition_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			workDefinitionName_5003Parser = parser;
		}
		return workDefinitionName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WorkDefinitionNameEditPart.VISUAL_ID:
			return getWorkDefinitionName_5003Parser();
		case RessourceDefinitionNameEditPart.VISUAL_ID:
			return getRessourceDefinitionName_5001Parser();
		case GuidanceTextEditPart.VISUAL_ID:
			return getGuidanceText_5004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SimplePDLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SimplePDLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SimplePDLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
