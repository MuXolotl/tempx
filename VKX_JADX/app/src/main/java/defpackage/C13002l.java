package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: renamed from: lّۧؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13002l {
    public static final C13002l loadAd;
    public final HashMap yandex = new HashMap();

    static {
        C0882l c0882l = new C0882l(12);
        C13002l c13002l = new C13002l();
        try {
            c13002l.yandex(c0882l, C6457l.class);
            loadAd = c13002l;
        } catch (GeneralSecurityException e) {
            C4875l.remoteconfig("unexpected error.", e);
        }
    }

    public final AbstractC6968l loadAd(AbstractC3302l abstractC3302l, Integer num) {
        AbstractC6968l abstractC6968lYandex;
        synchronized (this) {
            C0882l c0882l = (C0882l) this.yandex.get(abstractC3302l.getClass());
            if (c0882l == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(abstractC3302l) + ": no key creator for this class was registered.");
            }
            abstractC6968lYandex = c0882l.yandex(abstractC3302l, num);
        }
        return abstractC6968lYandex;
    }

    public final synchronized void yandex(C0882l c0882l, Class cls) {
        try {
            C0882l c0882l2 = (C0882l) this.yandex.get(cls);
            if (c0882l2 != null && !c0882l2.equals(c0882l)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + String.valueOf(cls) + " already inserted");
            }
            this.yandex.put(cls, c0882l);
        } catch (Throwable th) {
            throw th;
        }
    }
}
