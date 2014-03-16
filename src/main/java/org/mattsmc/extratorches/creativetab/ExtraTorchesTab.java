package org.mattsmc.extratorches.creativetab;

import org.mattsmc.extratorches.common.ExtraTorches;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExtraTorchesTab extends CreativeTabs{

	public ExtraTorchesTab(int tabId, String tabName) {
		super(tabId, tabName);
		
	}

	@Override
	public Item getTabIconItem() {
		return ExtraTorches.ExtraTorchesTabPlaceHolder;
	}

}
