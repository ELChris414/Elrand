package com.elchris.elrand.proxy;

import com.elchris.elrand.init.ElrandBlocks;
import com.elchris.elrand.init.ElrandItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		ElrandItems.registerRenders();
		ElrandBlocks.registerRenders();
	}
}
