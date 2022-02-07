/**
 * 
 */
package annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target({FIELD, METHOD})

/**
 * @author 1000475
 * @Retention(RUNTIME) -> This annotation is available at Runtime as well, if you access the annotation
 * using reflection like class.getAnnotations(), you will get this annotation, where as the 
 * other 2 Retention Policies like SOURCE | CLASS will be discarded.
 * 
 * We use annotations for validations, look at SpringDataJpa for full custom validations
 */
public @interface PhonePrefix {
	
}
