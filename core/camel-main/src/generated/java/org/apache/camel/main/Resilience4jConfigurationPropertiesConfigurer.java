/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.main.Resilience4jConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Resilience4jConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.Resilience4jConfigurationProperties target = (org.apache.camel.main.Resilience4jConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "automatictransitionfromopentohalfopenenabled":
        case "AutomaticTransitionFromOpenToHalfOpenEnabled": target.setAutomaticTransitionFromOpenToHalfOpenEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "bulkheadenabled":
        case "BulkheadEnabled": target.setBulkheadEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "bulkheadmaxconcurrentcalls":
        case "BulkheadMaxConcurrentCalls": target.setBulkheadMaxConcurrentCalls(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bulkheadmaxwaitduration":
        case "BulkheadMaxWaitDuration": target.setBulkheadMaxWaitDuration(property(camelContext, java.lang.Integer.class, value)); return true;
        case "circuitbreakerref":
        case "CircuitBreakerRef": target.setCircuitBreakerRef(property(camelContext, java.lang.String.class, value)); return true;
        case "configref":
        case "ConfigRef": target.setConfigRef(property(camelContext, java.lang.String.class, value)); return true;
        case "failureratethreshold":
        case "FailureRateThreshold": target.setFailureRateThreshold(property(camelContext, java.lang.Float.class, value)); return true;
        case "minimumnumberofcalls":
        case "MinimumNumberOfCalls": target.setMinimumNumberOfCalls(property(camelContext, java.lang.Integer.class, value)); return true;
        case "permittednumberofcallsinhalfopenstate":
        case "PermittedNumberOfCallsInHalfOpenState": target.setPermittedNumberOfCallsInHalfOpenState(property(camelContext, java.lang.Integer.class, value)); return true;
        case "slidingwindowsize":
        case "SlidingWindowSize": target.setSlidingWindowSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "slidingwindowtype":
        case "SlidingWindowType": target.setSlidingWindowType(property(camelContext, java.lang.String.class, value)); return true;
        case "slowcalldurationthreshold":
        case "SlowCallDurationThreshold": target.setSlowCallDurationThreshold(property(camelContext, java.lang.Integer.class, value)); return true;
        case "slowcallratethreshold":
        case "SlowCallRateThreshold": target.setSlowCallRateThreshold(property(camelContext, java.lang.Float.class, value)); return true;
        case "timeoutcancelrunningfuture":
        case "TimeoutCancelRunningFuture": target.setTimeoutCancelRunningFuture(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "timeoutduration":
        case "TimeoutDuration": target.setTimeoutDuration(property(camelContext, java.lang.Integer.class, value)); return true;
        case "timeoutenabled":
        case "TimeoutEnabled": target.setTimeoutEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "timeoutexecutorserviceref":
        case "TimeoutExecutorServiceRef": target.setTimeoutExecutorServiceRef(property(camelContext, java.lang.String.class, value)); return true;
        case "waitdurationinopenstate":
        case "WaitDurationInOpenState": target.setWaitDurationInOpenState(property(camelContext, java.lang.Integer.class, value)); return true;
        case "writablestacktraceenabled":
        case "WritableStackTraceEnabled": target.setWritableStackTraceEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        default: return false;
        }
    }

}

