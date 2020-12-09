/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.workday;

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
public class WorkdayEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WorkdayEndpoint target = (WorkdayEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": target.getWorkdayConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": target.getWorkdayConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "host": target.getWorkdayConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpconnectionmanager":
        case "httpConnectionManager": target.getWorkdayConfiguration().setHttpConnectionManager(property(camelContext, org.apache.http.impl.conn.PoolingHttpClientConnectionManager.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "reportformat":
        case "reportFormat": target.getWorkdayConfiguration().setReportFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tenant": target.getWorkdayConfiguration().setTenant(property(camelContext, java.lang.String.class, value)); return true;
        case "tokenrefresh":
        case "tokenRefresh": target.getWorkdayConfiguration().setTokenRefresh(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("clientId", java.lang.String.class);
        answer.put("clientSecret", java.lang.String.class);
        answer.put("host", java.lang.String.class);
        answer.put("httpConnectionManager", org.apache.http.impl.conn.PoolingHttpClientConnectionManager.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("reportFormat", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("tenant", java.lang.String.class);
        answer.put("tokenRefresh", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        WorkdayEndpoint target = (WorkdayEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "clientid":
        case "clientId": return target.getWorkdayConfiguration().getClientId();
        case "clientsecret":
        case "clientSecret": return target.getWorkdayConfiguration().getClientSecret();
        case "host": return target.getWorkdayConfiguration().getHost();
        case "httpconnectionmanager":
        case "httpConnectionManager": return target.getWorkdayConfiguration().getHttpConnectionManager();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "reportformat":
        case "reportFormat": return target.getWorkdayConfiguration().getReportFormat();
        case "synchronous": return target.isSynchronous();
        case "tenant": return target.getWorkdayConfiguration().getTenant();
        case "tokenrefresh":
        case "tokenRefresh": return target.getWorkdayConfiguration().getTokenRefresh();
        default: return null;
        }
    }
}

