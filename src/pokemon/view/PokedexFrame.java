package pokemon.view;


	import javax.swing.JFrame ;

import pokemon.controller.PokedexController;
import pokemon.view.PokedexPanel;

	public class PokedexFrame extends JFrame
	{
		private PokedexController appController;
		private PokedexPanel appPanel;
		
		public PokedexFrame(PokedexController appController) 
		{
			super();
			
			this.appController = appController;
			this.appPanel = new PokedexPanel(appController);
			
			setupFrame();
		}
		
		private void setupFrame()
		{
			this.setContentPane(appPanel);
			this.setSize(800, 600);
			this.setTitle("clothes on back, wind on my teeth");
			this.setResizable(false);
			this.setVisible(true);
		}
}
