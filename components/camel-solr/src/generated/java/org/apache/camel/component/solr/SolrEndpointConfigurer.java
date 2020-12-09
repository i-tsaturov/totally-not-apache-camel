/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.solr;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SolrEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SolrEndpoint target = (SolrEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcompression":
        case "allowCompression": target.setAllowCompression(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "collection": target.setCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "defaultmaxconnectionsperhost":
        case "defaultMaxConnectionsPerHost": target.setDefaultMaxConnectionsPerHost(property(camelContext, java.lang.Integer.class, value)); return true;
        case "followredirects":
        case "followRedirects": target.setFollowRedirects(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxretries":
        case "maxRetries": target.setMaxRetries(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxtotalconnections":
        case "maxTotalConnections": target.setMaxTotalConnections(property(camelContext, java.lang.Integer.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "requesthandler":
        case "requestHandler": target.setRequestHandler(property(camelContext, java.lang.String.class, value)); return true;
        case "sotimeout":
        case "soTimeout": target.setSoTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "streamingqueuesize":
        case "streamingQueueSize": target.setStreamingQueueSize(property(camelContext, int.class, value)); return true;
        case "streamingthreadcount":
        case "streamingThreadCount": target.setStreamingThreadCount(property(camelContext, int.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "zkhost":
        case "zkHost": target.setZkHost(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("allowCompression", java.lang.Boolean.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("collection", java.lang.String.class);
        answer.put("connectionTimeout", java.lang.Integer.class);
        answer.put("defaultMaxConnectionsPerHost", java.lang.Integer.class);
        answer.put("followRedirects", java.lang.Boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxRetries", java.lang.Integer.class);
        answer.put("maxTotalConnections", java.lang.Integer.class);
        answer.put("password", java.lang.String.class);
        answer.put("requestHandler", java.lang.String.class);
        answer.put("soTimeout", java.lang.Integer.class);
        answer.put("streamingQueueSize", int.class);
        answer.put("streamingThreadCount", int.class);
        answer.put("synchronous", boolean.class);
        answer.put("username", java.lang.String.class);
        answer.put("zkHost", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SolrEndpoint target = (SolrEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcompression":
        case "allowCompression": return target.getAllowCompression();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "collection": return target.getCollection();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConnectionTimeout();
        case "defaultmaxconnectionsperhost":
        case "defaultMaxConnectionsPerHost": return target.getDefaultMaxConnectionsPerHost();
        case "followredirects":
        case "followRedirects": return target.getFollowRedirects();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxretries":
        case "maxRetries": return target.getMaxRetries();
        case "maxtotalconnections":
        case "maxTotalConnections": return target.getMaxTotalConnections();
        case "password": return target.getPassword();
        case "requesthandler":
        case "requestHandler": return target.getRequestHandler();
        case "sotimeout":
        case "soTimeout": return target.getSoTimeout();
        case "streamingqueuesize":
        case "streamingQueueSize": return target.getStreamingQueueSize();
        case "streamingthreadcount":
        case "streamingThreadCount": return target.getStreamingThreadCount();
        case "synchronous": return target.isSynchronous();
        case "username": return target.getUsername();
        case "zkhost":
        case "zkHost": return target.getZkHost();
        default: return null;
        }
    }
}

