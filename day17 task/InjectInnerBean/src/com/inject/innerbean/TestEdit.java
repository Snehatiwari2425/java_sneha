package com.inject.innerbean;

public class TestEdit {
	
	private SpellCheck   spellCheck;
	
	public void setSpellCheck(SpellCheck   spellCheck)//setter method to inject the dependencies
	{
		System.out.println("inside setSpellCheck method..");
		this.spellCheck=spellCheck;
	}
	
	public SpellCheck getSpellCheck()
	{
		return spellCheck;
	}
	
	public void spellCheck()
	{
		spellCheck.checkSpelling();
	}

}
