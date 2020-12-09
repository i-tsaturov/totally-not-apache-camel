/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.reactive.streams;

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
public class ReactiveStreamsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ReactiveStreamsEndpoint target = (ReactiveStreamsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backpressurestrategy":
        case "backpressureStrategy": target.setBackpressureStrategy(property(camelContext, org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "exchangesrefilllowwatermark":
        case "exchangesRefillLowWatermark": target.setExchangesRefillLowWatermark(property(camelContext, double.class, value)); return true;
        case "forwardoncomplete":
        case "forwardOnComplete": target.setForwardOnComplete(property(camelContext, boolean.class, value)); return true;
        case "forwardonerror":
        case "forwardOnError": target.setForwardOnError(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxinflightexchanges":
        case "maxInflightExchanges": target.setMaxInflightExchanges(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("backpressureStrategy", org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("concurrentConsumers", int.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("exchangesRefillLowWatermark", double.class);
        answer.put("forwardOnComplete", boolean.class);
        answer.put("forwardOnError", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxInflightExchanges", java.lang.Integer.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ReactiveStreamsEndpoint target = (ReactiveStreamsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backpressurestrategy":
        case "backpressureStrategy": return target.getBackpressureStrategy();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "concurrentconsumers":
        case "concurrentConsumers": return target.getConcurrentConsumers();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "exchangesrefilllowwatermark":
        case "exchangesRefillLowWatermark": return target.getExchangesRefillLowWatermark();
        case "forwardoncomplete":
        case "forwardOnComplete": return target.isForwardOnComplete();
        case "forwardonerror":
        case "forwardOnError": return target.isForwardOnError();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxinflightexchanges":
        case "maxInflightExchanges": return target.getMaxInflightExchanges();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

