/*
 * This file is part of trolCommander, http://www.trolsoft.ru/soft/trolcommander
 * Copyright (C) 2013-2014 Oleg Trifonov
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mucommander.ui.action.impl;

import com.mucommander.ui.action.*;
import com.mucommander.ui.dialog.commands.EditCommandsDialog;
import com.mucommander.ui.main.MainFrame;

import javax.swing.KeyStroke;
import java.util.Map;

/**
 * @author Oleg Trifonov
 * Created on 09/10/14.
 */
public class EditCommandsAction extends MuAction {

    /**
     * Creates a new <code>MuAction</code> associated with the specified {@link com.mucommander.ui.main.MainFrame}. The properties contained by
     * the given {@link Map} are used to initialize this action's property map.
     *
     * @param mainFrame  the MainFrame to associate with this new MuAction
     * @param properties the initial properties to use in this action. The Hashtable may simply be empty if no initial
     */
    public EditCommandsAction(MainFrame mainFrame, Map<String, Object> properties) {
        super(mainFrame, properties);
    }

    @Override
    public void performAction() {
        new EditCommandsDialog(mainFrame, mainFrame).showDialog();
    }

    @Override
    public ActionDescriptor getDescriptor() {
        return new Descriptor();
    }

    // - Factory -------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------
    public static class Factory implements ActionFactory {

        public MuAction createAction(MainFrame mainFrame, Map<String, Object> properties) {
            return new EditCommandsAction(mainFrame, properties);
        }
    }


    public static class Descriptor extends AbstractActionDescriptor {
        public static final String ACTION_ID = "EditCommands";

        public String getId() {
            return ACTION_ID;
        }

        public ActionCategory getCategory() {
            return ActionCategory.MISC;
        }

        public KeyStroke getDefaultAltKeyStroke() {
            return null;
        }

        public KeyStroke getDefaultKeyStroke() {
            return null;
        }
    }

}