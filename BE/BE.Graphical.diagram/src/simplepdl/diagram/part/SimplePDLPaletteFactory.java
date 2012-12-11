package simplepdl.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import simplepdl.diagram.providers.SimplePDLElementTypes;

/**
 * @generated
 */
public class SimplePDLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSimplepdl1Group());
	}

	/**
	 * Creates "simplepdl" palette tool group
	 * @generated
	 */
	private PaletteContainer createSimplepdl1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Simplepdl1Group_title);
		paletteContainer.setId("createSimplepdl1Group"); //$NON-NLS-1$
		paletteContainer.add(createWorkDefinition1CreationTool());
		paletteContainer.add(createWorkSequence2CreationTool());
		paletteContainer.add(createRessourceDefinition3CreationTool());
		paletteContainer.add(createRessourceInstance4CreationTool());
		paletteContainer.add(createGuidance5CreationTool());
		paletteContainer.add(createGuidanceElement6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWorkDefinition1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WorkDefinition1CreationTool_title,
				Messages.WorkDefinition1CreationTool_desc,
				Collections
						.singletonList(SimplePDLElementTypes.WorkDefinition_2003));
		entry.setId("createWorkDefinition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplePDLElementTypes
				.getImageDescriptor(SimplePDLElementTypes.WorkDefinition_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWorkSequence2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.WorkSequence2CreationTool_title,
				Messages.WorkSequence2CreationTool_desc,
				Collections
						.singletonList(SimplePDLElementTypes.WorkSequence_4002));
		entry.setId("createWorkSequence2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplePDLElementTypes
				.getImageDescriptor(SimplePDLElementTypes.WorkSequence_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRessourceDefinition3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RessourceDefinition3CreationTool_title,
				Messages.RessourceDefinition3CreationTool_desc,
				Collections
						.singletonList(SimplePDLElementTypes.RessourceDefinition_2001));
		entry.setId("createRessourceDefinition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplePDLElementTypes
				.getImageDescriptor(SimplePDLElementTypes.RessourceDefinition_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRessourceInstance4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RessourceInstance4CreationTool_title,
				Messages.RessourceInstance4CreationTool_desc,
				Collections
						.singletonList(SimplePDLElementTypes.RessourceInstance_4001));
		entry.setId("createRessourceInstance4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplePDLElementTypes
				.getImageDescriptor(SimplePDLElementTypes.RessourceInstance_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGuidance5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Guidance5CreationTool_title,
				Messages.Guidance5CreationTool_desc,
				Collections.singletonList(SimplePDLElementTypes.Guidance_2004));
		entry.setId("createGuidance5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplePDLElementTypes
				.getImageDescriptor(SimplePDLElementTypes.Guidance_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGuidanceElement6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.GuidanceElement6CreationTool_title,
				Messages.GuidanceElement6CreationTool_desc, null, null) {
		};
		entry.setId("createGuidanceElement6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
