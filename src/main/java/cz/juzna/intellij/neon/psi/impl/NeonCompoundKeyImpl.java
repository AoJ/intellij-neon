package cz.juzna.intellij.neon.psi.impl;

import com.intellij.lang.ASTNode;
import cz.juzna.intellij.neon.psi.NeonKey;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class NeonCompoundKeyImpl extends NeonPsiElementImpl implements NeonKey {
	public NeonCompoundKeyImpl(@NotNull ASTNode astNode) {
		super(astNode);
	}

	public String toString() {
		return "Neon key";
	}


	@Override
	public String getKeyText() {
		return getNode().getText();
	}

	@Override
	public String getName() {
		return getKeyText();
	}
}
