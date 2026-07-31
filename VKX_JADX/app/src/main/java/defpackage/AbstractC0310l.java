package defpackage;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: lؑٓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0310l {
    public static final float yandex = ViewConfiguration.getScrollFriction();

    public static final C17308l yandex(C6956l c6956l) {
        InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
        boolean zCrashlytics = c6956l.crashlytics(interfaceC13490l.loadAd());
        Object objM2132native = c6956l.m2132native();
        if (zCrashlytics || objM2132native == C1867l.yandex) {
            objM2132native = new C17308l(new C5008l(interfaceC13490l));
            c6956l.m2147try(objM2132native);
        }
        return (C17308l) objM2132native;
    }
}
