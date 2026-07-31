package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lؙُِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11677l {
    public static final AbstractC5189l yandex;

    static {
        Object c18435l;
        try {
            Method method = InterfaceC3187l.class.getClassLoader().loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC5189l) {
                        c18435l = (AbstractC5189l) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof InterfaceC2724l)) {
                    i++;
                }
                c18435l = null;
                break;
            }
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        AbstractC5189l c10707l = (AbstractC5189l) (c18435l instanceof C18435l ? null : c18435l);
        if (c10707l == null) {
            c10707l = new C10707l(new C6573l(0));
        }
        yandex = c10707l;
    }
}
