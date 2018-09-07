import java.lang.reflect.Constructor;

public class ParametersExample {
    public static void main(String[] args) {
        Class clazz = TestCaseClasses.PersonVO.class;

        final Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            String[] params = ParanamerUtil.getParanamers(constructor);
            ParanamerUtil.printNames(params);
        }
    }
}
