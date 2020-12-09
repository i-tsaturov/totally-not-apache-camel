/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jira;

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
public class JiraComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.jira.JiraConfiguration getOrCreateConfiguration(JiraComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.jira.JiraConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JiraComponent target = (JiraComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": getOrCreateConfiguration(target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.jira.JiraConfiguration.class, value)); return true;
        case "consumerkey":
        case "consumerKey": getOrCreateConfiguration(target).setConsumerKey(property(camelContext, java.lang.String.class, value)); return true;
        case "delay": getOrCreateConfiguration(target).setDelay(property(camelContext, java.lang.Integer.class, value)); return true;
        case "jiraurl":
        case "jiraUrl": getOrCreateConfiguration(target).setJiraUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekey":
        case "privateKey": getOrCreateConfiguration(target).setPrivateKey(property(camelContext, java.lang.String.class, value)); return true;
        case "username": getOrCreateConfiguration(target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "verificationcode":
        case "verificationCode": getOrCreateConfiguration(target).setVerificationCode(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessToken", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("configuration", org.apache.camel.component.jira.JiraConfiguration.class);
        answer.put("consumerKey", java.lang.String.class);
        answer.put("delay", java.lang.Integer.class);
        answer.put("jiraUrl", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("password", java.lang.String.class);
        answer.put("privateKey", java.lang.String.class);
        answer.put("username", java.lang.String.class);
        answer.put("verificationCode", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JiraComponent target = (JiraComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return getOrCreateConfiguration(target).getAccessToken();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "consumerkey":
        case "consumerKey": return getOrCreateConfiguration(target).getConsumerKey();
        case "delay": return getOrCreateConfiguration(target).getDelay();
        case "jiraurl":
        case "jiraUrl": return getOrCreateConfiguration(target).getJiraUrl();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "privatekey":
        case "privateKey": return getOrCreateConfiguration(target).getPrivateKey();
        case "username": return getOrCreateConfiguration(target).getUsername();
        case "verificationcode":
        case "verificationCode": return getOrCreateConfiguration(target).getVerificationCode();
        default: return null;
        }
    }
}

