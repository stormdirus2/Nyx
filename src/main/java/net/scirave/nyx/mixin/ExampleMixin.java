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

package net.scirave.nyx.mixin;

import net.scirave.nyx.common.NyxUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


//#if MC>=11701
import net.minecraft.client.gui.screen.TitleScreen;
//#elseif FABRIC==1
//$$ import net.minecraft.client.gui.screen.TitleScreen;
//#endif


@Mixin(
    //#if MC<11701
    //#if FORGE==1
    //#if MC>11202
    //$$ net.minecraft.client.gui.screen.MainMenuScreen
    //#else
    //$$ net.minecraft.client.gui.GuiMainMenu
    //#endif
    //#else
    //$$ TitleScreen
    //#endif
    //#else
    TitleScreen
    //#endif
            .class
)
public class ExampleMixin {
    @Inject(at = @At("TAIL"), method = "<init>*")
    private void init(CallbackInfo info) {
        NyxUtil.LOGGER.info("This line is printed by a cross-version example mod mixin!");
    }
}
