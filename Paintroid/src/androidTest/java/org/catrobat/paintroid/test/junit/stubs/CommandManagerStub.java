/**
 * Paintroid: An image manipulation application for Android.
 * Copyright (C) 2010-2015 The Catrobat Team
 * (<http://developer.catrobat.org/credits>)
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catrobat.paintroid.test.junit.stubs;

import org.catrobat.paintroid.command.Command;
import org.catrobat.paintroid.command.CommandManager;
import org.catrobat.paintroid.command.implementation.LayerCommand;

public class CommandManagerStub extends BaseStub implements CommandManager {


	@Override
	public void commitCommandToLayer(LayerCommand layerCommand, Command bitmapCommand) {

	}

	@Override
	public void commitAddLayerCommand(LayerCommand layerCommand) {

	}

	@Override
	public void commitRemoveLayerCommand(LayerCommand layerCommand) {

	}

	@Override
	public void commitMergeLayerCommand(LayerCommand layerCommand) {

	}

	@Override
	public void commitLayerVisibilityCommand(LayerCommand layerCommand) {

	}

	@Override
	public void commitLayerLockCommand(LayerCommand layerCommand) {

	}

	@Override
	public void commitRenameLayerCommand(LayerCommand layerCommand) {

	}

	@Override
	public void resetAndClear(boolean clearLayerBitmapCommandsList) {

	}

	@Override
	public boolean checkIfDrawn() {

		return false;
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub

	}


}
