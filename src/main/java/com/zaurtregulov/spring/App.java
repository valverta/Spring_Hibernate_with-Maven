package com.zaurtregulov.spring;

import com.zaurtregulov.spring.Model.Util;
import com.zaurtregulov.spring.Service.Service;
import org.hibernate.cfg.Environment;

import javax.imageio.spi.ServiceRegistry;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Service use = new Service();
        use.createTable();
        Util.closeFactory();
    }
}
