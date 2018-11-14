package com.googoo.common.utils;

import java.net.URI;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
 
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
 
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
 
public class Main 
{
	static final String url = "https://www.baidu.com";
	
	/**
	 * 方法一
	 * @param clientBuilder
	 */
	public static void configureHttpClient(HttpClientBuilder clientBuilder) 
	{
		try
		{
			SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy()
			{
				// 信任所有
				public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException 
				{
					return true;
				}
			}).build();
	        
	        clientBuilder.setSSLContext(sslContext);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * 方法二
	 * @param clientBuilder
	 */
	public static void configureHttpClient2(HttpClientBuilder clientBuilder) 
	{
		try
		{
			SSLContext ctx = SSLContext.getInstance("TLS");  
	        X509TrustManager tm = new X509TrustManager()
	        {  
	                public void checkClientTrusted(X509Certificate[] chain,  String authType) throws CertificateException 
	                {
	                	
	                }  
	                public void checkServerTrusted(X509Certificate[] chain,  String authType) throws CertificateException 
	                {
	                	
	                }  
	                public X509Certificate[] getAcceptedIssuers() 
	                {  
	                    return null;  
	                }  
	        };  
	        ctx.init(null, new TrustManager[]{tm}, null);  
	        
	        clientBuilder.setSSLContext(ctx);
	        
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)throws Exception
	{
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		
		configureHttpClient2(httpClientBuilder);
		
		CloseableHttpClient httpClient = httpClientBuilder.build();
		
		HttpPost post = new HttpPost();
		
		post.setURI(new URI(url));
		
		CloseableHttpResponse resp = httpClient.execute(post);
		
		HttpEntity httpEntity = resp.getEntity();  
        
        System.out.println(EntityUtils.toString(httpEntity));
		
		httpClient.close();
	}
}
