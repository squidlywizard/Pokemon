package pokemon.controller;

import java.util.function.BooleanSupplier;

import pokemon.view.*;
import pokemon.model.*;

public class PokedexController
{
	private PokedexFrame appFrame;
	public void start ()
	{

		this.appFrame = new PokedexFrame(this);
               // System.out.println(simpleBot.processText("test"));


	}
	public Pokemon getPokemonList()
	{
		// TODO Auto-generated method stub
	return null;
	}
	public Boolean isInt(String string)
	{
		// TODO Auto-generated method stub
		return null;
	}
	public Boolean isDouble(String string)
	{
		// TODO Auto-generated method stub
		return null;
	}
	public PokedexFrame getFrame()
	{
		// TODO Auto-generated method stub
		return appFrame;
	}
}
