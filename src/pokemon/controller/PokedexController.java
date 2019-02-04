package pokemon.controller;

import pokemon.view.*;

public class PokedexController
{
	private PokedexFrame appFrame;
	public void start ()
	{

		this.appFrame = new PokedexFrame(this);
               // System.out.println(simpleBot.processText("test"));


	}
}
