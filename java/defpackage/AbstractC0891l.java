package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؙؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0891l {
    public static final ThreadLocal yandex = new ThreadLocal();
    public static final Class loadAd = C10038l.class;
    public static final Class crashlytics = C14187l.class;

    public static final boolean crashlytics(AbstractC9707l abstractC9707l, Class cls) {
        Type typeSubs = AbstractC8020l.subs(abstractC9707l.mo1109synchronized());
        Class<?> cls2 = typeSubs instanceof Class ? (Class) typeSubs : null;
        if (cls2 != null) {
            return cls.isAssignableFrom(cls2);
        }
        return false;
    }

    public static final boolean loadAd(InterfaceC5059l interfaceC5059l) {
        if (interfaceC5059l.tapsense() || interfaceC5059l.signatures() || interfaceC5059l.purchase() || interfaceC5059l.mo823volatile()) {
            return false;
        }
        AbstractC9707l abstractC9707lPurchase = AbstractC0825l.purchase(interfaceC5059l);
        if (abstractC9707lPurchase != null && !crashlytics(abstractC9707lPurchase, crashlytics) && !crashlytics(abstractC9707lPurchase, loadAd)) {
            return false;
        }
        Method methodMetrica = AbstractC13095l.metrica(interfaceC5059l);
        if (methodMetrica == null) {
            return true;
        }
        if (methodMetrica.isSynthetic()) {
            return false;
        }
        return (Modifier.isStatic(methodMetrica.getModifiers()) && interfaceC5059l.getParameters().isEmpty()) ? false : true;
    }

    public static final InterfaceC5059l yandex(ArrayList arrayList) {
        return (InterfaceC5059l) AbstractC16901l.m4212class(AbstractC16901l.m4243this(arrayList, AbstractC2920l.loadAd(new C10351l(3), new C10351l(4), new C10351l(5))));
    }
}
