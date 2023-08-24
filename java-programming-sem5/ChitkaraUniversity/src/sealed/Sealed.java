package sealed;

import java.io.Serializable;

// CLASSES
sealed class A permits B, C {
}
// permits part has to be after extends and implements parts
sealed class B extends A implements Serializable permits D {
}
final class C extends A {
}
non-sealed class D extends B {
}
class E extends D implements O {
}

// INTERFACES
sealed interface M extends Cloneable permits N {
}
sealed interface N extends M permits O {
}
non-sealed interface O extends N {
}
interface P extends O {
}

public class Sealed {
    public static void main(String[] args) {
        C objC = new C();
    }
}
