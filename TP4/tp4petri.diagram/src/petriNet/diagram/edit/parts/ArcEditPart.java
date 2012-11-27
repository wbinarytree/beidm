package petriNet.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ArcEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public ArcEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new petriNet.diagram.edit.policies.ArcItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ArcFigure();
	}

	/**
	 * @generated
	 */
	public ArcFigure getPrimaryShape() {
		return (ArcFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ArcFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureArcWeightFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureArcKindFigure;

		/**
		 * @generated
		 */
		public ArcFigure() {

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureArcWeightFigure = new WrappingLabel();

			fFigureArcWeightFigure.setText("<...>");

			this.add(fFigureArcWeightFigure);

			fFigureArcKindFigure = new WrappingLabel();

			fFigureArcKindFigure.setText("<...>");

			this.add(fFigureArcKindFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureArcWeightFigure() {
			return fFigureArcWeightFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureArcKindFigure() {
			return fFigureArcKindFigure;
		}

	}

}
