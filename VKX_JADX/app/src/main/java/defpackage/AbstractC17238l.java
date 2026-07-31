package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lٗٛؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17238l implements Serializable {
    public static C13464l amazon(Object obj) {
        obj.getClass();
        return new C13464l(obj);
    }

    public static AbstractC17238l yandex(Object obj) {
        return obj == null ? C1972l.f4482l : new C13464l(obj);
    }

    public abstract Object billing();

    public abstract boolean crashlytics();

    public abstract Object loadAd();

    public abstract Object purchase(Object obj);
}
