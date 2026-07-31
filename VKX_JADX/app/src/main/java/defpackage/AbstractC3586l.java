package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؕۘۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3586l {
    public static final ExecutorC11374l yandex = new ExecutorC11374l(2);

    public static C3179l amazon(InterfaceC16922l interfaceC16922l) {
        interfaceC16922l.getDigestSize();
        return new C3179l(interfaceC16922l.getAlgorithmName(), 1);
    }

    public static final C13138l billing(C6956l c6956l, int i) {
        Object objM2132native = c6956l.m2132native();
        if (objM2132native == C1867l.yandex) {
            objM2132native = new C13138l();
            c6956l.m2147try(objM2132native);
        }
        C13138l c13138l = (C13138l) objM2132native;
        c13138l.yandex(c6956l, 0);
        return c13138l;
    }

    public static final void crashlytics(C6742l c6742l) throws Exception {
        try {
            c6742l.yandex();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            if (!AbstractC12024l.appmetrica(message, "mViewFlags", false) && !AbstractC12024l.appmetrica(message, "LayoutNode", false)) {
                throw e;
            }
        }
    }

    public static final C8456l loadAd(C13138l c13138l, Number number, Number number2, C0010l c0010l, C4165l c4165l, String str, C6956l c6956l, int i, int i2) {
        C13138l c13138l2;
        Number number3;
        Object objM2132native = c6956l.m2132native();
        C13863l c13863l = C1867l.yandex;
        if (objM2132native == c13863l) {
            c13138l2 = c13138l;
            C8456l c8456l = new C8456l(c13138l2, number, number2, c0010l, c4165l);
            number3 = number2;
            c6956l.m2147try(c8456l);
            objM2132native = c8456l;
        } else {
            c13138l2 = c13138l;
            number3 = number2;
        }
        C8456l c8456l2 = (C8456l) objM2132native;
        boolean z = (((57344 & i) ^ 24576) > 16384 && c6956l.admob(c4165l)) || (i & 24576) == 16384;
        Object objM2132native2 = c6956l.m2132native();
        if (z || objM2132native2 == c13863l) {
            C17026l c17026l = new C17026l(number, c8456l2, number3, c4165l, 6);
            c6956l.m2147try(c17026l);
            objM2132native2 = c17026l;
        }
        AbstractC12311l.billing((Function0) objM2132native2, c6956l);
        boolean zAdmob = c6956l.admob(c13138l2);
        Object objM2132native3 = c6956l.m2132native();
        if (zAdmob || objM2132native3 == c13863l) {
            objM2132native3 = new C3005l(c13138l2, c8456l2, 22);
            c6956l.m2147try(objM2132native3);
        }
        AbstractC12311l.loadAd(c8456l2, (Function1) objM2132native3, c6956l);
        return c8456l2;
    }

    public static final void mopub(InterfaceC16031l interfaceC16031l, Function1 function1) {
        InterfaceC3685l interfaceC3685l = (InterfaceC3685l) AbstractC13402l.loadAd(interfaceC16031l, AbstractC4751l.mopub);
        C11925l c11925lCrashlytics = interfaceC3685l.crashlytics();
        try {
            function1.invoke(c11925lCrashlytics);
        } finally {
            interfaceC3685l.yandex(c11925lCrashlytics);
        }
    }

    public static C3823l purchase(C3823l c3823l, C3823l c3823l2) {
        C1770l c1770l = new C1770l(7);
        C2350l c2350l = new C2350l((C5008l) c1770l.f4179l);
        C17706l c17706l = new C17706l(c2350l, new AtomicBoolean(false), c1770l, 0);
        ExecutorC11374l executorC11374l = yandex;
        c3823l.admob(executorC11374l, c17706l);
        c3823l2.admob(executorC11374l, c17706l);
        return c2350l.yandex;
    }

    public static final C8456l yandex(C13138l c13138l, float f, float f2, C4165l c4165l, String str, C6956l c6956l, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        return loadAd(c13138l, Float.valueOf(f), Float.valueOf(f2), AbstractC3483l.purchase, c4165l, str, c6956l, 33208 | ((i << 3) & 458752), 0);
    }
}
