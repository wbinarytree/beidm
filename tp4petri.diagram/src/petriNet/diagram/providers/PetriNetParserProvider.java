package petriNet.diagram.providers;

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

/**
 * @generated
 */
public class PetriNetParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser placeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPlaceName_5001Parser() {
		if (placeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { petriNet.PetriNetPackage.eINSTANCE
					.getNode_Name() };
			petriNet.diagram.parsers.MessageFormatParser parser = new petriNet.diagram.parsers.MessageFormatParser(
					features);
			placeName_5001Parser = parser;
		}
		return placeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionName_5002Parser() {
		if (transitionName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { petriNet.PetriNetPackage.eINSTANCE
					.getNode_Name() };
			petriNet.diagram.parsers.MessageFormatParser parser = new petriNet.diagram.parsers.MessageFormatParser(
					features);
			transitionName_5002Parser = parser;
		}
		return transitionName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case petriNet.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID:
			return getTransitionName_5002Parser();
		case petriNet.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID:
			return getPlaceName_5001Parser();
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
			return getParser(petriNet.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(petriNet.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (petriNet.diagram.providers.PetriNetElementTypes
					.getElement(hint) == null) {
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
