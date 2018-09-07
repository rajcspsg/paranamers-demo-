import com.thoughtworks.paranamer.*;
import java.lang.reflect.Constructor;

public class ParanamerExample {
    public static void main(String[] args) {
        final Paranamer paranamer = new CachingParanamer(new AdaptiveParanamer(new BytecodeReadingParanamer(), new AnnotationParanamer()));
        Class clazz = PersonV03.class;
        final Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            String[] params = paranamer.lookupParameterNames(constructor);
            ParanamerUtil.printNames(params);
        }
    }


}
