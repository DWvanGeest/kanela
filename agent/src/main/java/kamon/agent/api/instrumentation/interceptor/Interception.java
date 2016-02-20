package kamon.agent.api.instrumentation.interceptor;

import lombok.Builder;
import lombok.Value;
import net.bytebuddy.jar.asm.Type;
import net.bytebuddy.jar.asm.commons.Method;

@Builder
@Value
public class Interception {
    private Type interceptorType;
    private Method beforeMethod;
    private Method afterMethod;
    private Type travelerType;
}