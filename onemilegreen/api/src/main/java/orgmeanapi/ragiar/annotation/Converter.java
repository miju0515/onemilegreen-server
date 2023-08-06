package orgmeanapi.ragiar.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Service
public @interface Converter {
    @AliasFor(annotation = Service.class)
    String value() default "";
}
