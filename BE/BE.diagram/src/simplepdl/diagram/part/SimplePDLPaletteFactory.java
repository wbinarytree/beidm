package simplepdl.diagram.part;

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
		paletteContainer.add(createGuidance3CreationTool());
		paletteContainer.add(createGuidanceElement4CreationTool());
		paletteContainer.add(createRessource5CreationTool());
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
		ToolEntry entry = new ToolEntry(
				Messages.WorkSequence2CreationTool_title,
				Messages.WorkSequence2CreationTool_desc, null, null) {
		};
		entry.setId("createWorkSequence2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGuidance3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Guidance3CreationTool_title,
				Messages.Guidance3CreationTool_desc,
				Collections.singletonList(SimplePDLElementTypes.Guidance_2002));
		entry.setId("createGuidance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplePDLElementTypes
				.getImageDescriptor(SimplePDLElementTypes.Guidance_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGuidanceElement4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.GuidanceElement4CreationTool_title,
				Messages.GuidanceElement4CreationTool_desc,
				Collections
						.singletonList(SimplePDLElementTypes.WorkSequence_4001));
		entry.setId("createGuidanceElement4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplePDLElementTypes
				.getImageDescriptor(SimplePDLElementTypes.WorkSequence_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRessource5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ressource5CreationTool_title,
				Messages.Ressource5CreationTool_desc,
				Collections.singletonList(SimplePDLElementTypes.Ressource_2001));
		entry.setId("createRessource5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplePDLElementTypes
				.getImageDescriptor(SimplePDLElementTypes.Ressource_2001));
		entry.setLargeIcon(entry.getSmallIcon());
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
