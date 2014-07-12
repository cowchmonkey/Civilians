package com.cowch.civilians.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //Create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);

        boolean configValue = false;
        try
        {
            //Load the confuration file
            configuration.load();

            // Read in properties from configuration file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example of config value").getBoolean(true);

        }
        catch (Exception e)
        {
            // Log the exception

        }
        finally
        {
            //saves the configuration file
            configuration.save();

        }

        System.out.println("Configuration Test: " + configValue); //shows in the console what the value is
    }
}
