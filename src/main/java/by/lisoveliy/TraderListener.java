package by.lisoveliy;

import org.bukkit.Material;
import org.bukkit.entity.WanderingTrader;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TraderListener implements Listener {
    @EventHandler
    public void on(EntitySpawnEvent event){
        var entity = event.getEntity();
        if(entity instanceof WanderingTrader trader){
            var discoveredRecipes = trader.getRecipes();
            var recipe = new MerchantRecipe(new ItemStack(Material.ENDER_PEARL, 1), Integer.MAX_VALUE);
            recipe.addIngredient(new ItemStack(Material.GOLD_INGOT, new Random().nextInt(1,4)));
            List<MerchantRecipe> newRecipes = new ArrayList<MerchantRecipe>(discoveredRecipes);
            newRecipes.add(recipe);
            trader.setRecipes(newRecipes);
        }
    }
}
