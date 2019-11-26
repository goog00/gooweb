package com.googoo.config;

import com.googoo.properties.RedissonProperties;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunteng
 * @create 2019-10-10 下午 3:34
 **/
@Configuration
@AutoConfigureAfter(value = {RedissonProperties.class})
public class RedissonConfiguration {

   @Autowired
   private RedissonProperties redissonProperties;


    /**
     * 单体模式
     * @return
     */
    @Bean
    public RedissonClient redissonSingle(){
         Config config = new Config();
         config.useSingleServer().setAddress(redissonProperties.getAddress())
                 .setTimeout(redissonProperties.getTimeout())
                 .setDatabase(redissonProperties.getDatabase())
                 .setConnectionPoolSize(redissonProperties.getConnectionPoolSize())
                 .setConnectionMinimumIdleSize(redissonProperties.getConnectionMiniumIdleSize())
                 .setPassword(redissonProperties.getPassword());

         return Redisson.create(config);

    }


//    /**
//     * 集群模式
//     * @return
//     */
//    @Bean
//    @ConditionalOnProperty(value = "redisson.masterAddress")
//    public RedissonClient redissonSentinel(){
//        Config config = new Config();
//        config.useClusterServers().addNodeAddress(redissonProperties.getMasterAddresses())
//                .setTimeout(redissonProperties.getTimeout())
//                .setScanInterval(redissonProperties.getScanInterval())
//                .setMasterConnectionPoolSize(redissonProperties.getMasterConnectionPoolSize())
//                .setMasterConnectionMinimumIdleSize(redissonProperties.getConnectionMiniumIdleSize())
//                .setPassword(redissonProperties.getPassword());
//
//        return Redisson.create(config);
//    }
}
