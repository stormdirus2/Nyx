/*
 * -------------------------------------------------------------------
 * Nyx
 * Copyright (c) 2023 SciRave
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * -------------------------------------------------------------------
 */

package net.scirave.nyx.common;

import java.util.logging.Logger;

public class NyxUtil {
    public final static String MOD_ID = "nyx";
    public final static Logger LOGGER = Logger.getLogger(MOD_ID);

    public static void sayHello() {
        LOGGER.info("Hello! I am a multi-version mod!");
    }
}
