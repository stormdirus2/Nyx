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

package net.scirave.nyx.impl;

import net.minecraftforge.fml.common.Mod;
import net.scirave.nyx.common.NyxUtil;

@Mod(
    //#if MC<=11202
    //$$ modid =
    //#endif
        NyxUtil.MOD_ID
)
public class Nyx {
    public Nyx() {
        NyxUtil.sayHello();
    }
}
