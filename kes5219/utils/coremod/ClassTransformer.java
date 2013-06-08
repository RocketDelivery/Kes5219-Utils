package kes5219.utils.coremod;

import cpw.mods.fml.relauncher.IClassTransformer;

public class ClassTransformer implements IClassTransformer
{

	@Override
	public byte[] transform(String name, String transformedName, byte[] bytes)
	{
		//Does not do anything yet. Reserved for future use.
		return bytes;
	}

}
