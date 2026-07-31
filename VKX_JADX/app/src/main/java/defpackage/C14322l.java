package defpackage;

import java.io.EOFException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lَٟٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14322l extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C12952l yandex;

    public C14322l(C12952l c12952l) {
        this.yandex = c12952l;
        Set set = AbstractC7694l.yandex;
        this.loadAd = c12952l.loadAd(List.class, set, null);
        this.crashlytics = c12952l.loadAd(Map.class, set, null);
        this.amazon = c12952l.loadAd(String.class, set, null);
        this.purchase = c12952l.loadAd(Double.class, set, null);
        this.billing = c12952l.loadAd(Boolean.class, set, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017 A[PHI: r1
  0x0017: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:7:0x0015, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == Object.class) {
            c3631l.mopub();
            c3631l.adcel();
            return;
        }
        Class<?> cls2 = Map.class;
        if (cls2.isAssignableFrom(cls)) {
            cls = cls2;
        } else {
            cls2 = Collection.class;
            if (cls2.isAssignableFrom(cls)) {
                cls = cls2;
            }
        }
        this.yandex.loadAd(cls, AbstractC7694l.yandex, null).billing(c3631l, obj);
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        int iInmobi = AbstractC5020l.inmobi(c0396l.m510while());
        if (iInmobi == 0) {
            return this.loadAd.loadAd(c0396l);
        }
        if (iInmobi == 2) {
            return this.crashlytics.loadAd(c0396l);
        }
        if (iInmobi == 5) {
            return this.amazon.loadAd(c0396l);
        }
        if (iInmobi == 6) {
            return this.purchase.loadAd(c0396l);
        }
        if (iInmobi == 7) {
            return this.billing.loadAd(c0396l);
        }
        if (iInmobi == 8) {
            c0396l.m493default();
            return null;
        }
        C11983l.metrica("Expected a value but was ", AbstractC2812l.premium(c0396l.m510while()), " at path ", c0396l.inmobi());
        return null;
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
