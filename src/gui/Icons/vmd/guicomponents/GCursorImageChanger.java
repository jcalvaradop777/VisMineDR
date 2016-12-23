/*
  Part of the GUI for Processing library 
  	http://gui4processing.lagers.org.uk
	http://gui4processing.googlecode.com/svn/trunk/

  Copyright (c) 2008-09 Peter Lager

  This library is free software; you can redistribute it and/or
  modify it under the terms of the GNU Lesser General Public
  License as published by the Free Software Foundation; either
  version 2.1 of the License, or (at your option) any later version.

  This library is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General
  Public License along with this library; if not, write to the
  Free Software Foundation, Inc., 59 Temple Place, Suite 330,
  Boston, MA  02111-1307  USA
 */

package gui.Icons.vmd.guicomponents;

import processing.core.PConstants;

/**
 * DO NOT CREATE OBJECTS FROM THIS CLASS
 * use the appropriate cursor control methods 
 * in the G4P class
 * 
 * @author Peter Lager
 *
 */
public class GCursorImageChanger implements PConstants {


	GCursorImageChanger(){}

	public void post(){
		if(G4P.cursorChangeEnabled){
			if(GComponent.cursorIsOver != null)
				G4P.mainWinApp.cursor(G4P.mouseOver);
			else
				G4P.mainWinApp.cursor(G4P.mouseOff);
		}
	}

}