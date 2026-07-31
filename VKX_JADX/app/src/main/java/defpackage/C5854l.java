package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: lؘٞٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5854l {
    public final Method loadAd;
    public final int yandex;

    public C5854l(int i, Method method) {
        this.yandex = i;
        this.loadAd = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5854l)) {
            return false;
        }
        C5854l c5854l = (C5854l) obj;
        return this.yandex == c5854l.yandex && this.loadAd.getName().equals(c5854l.loadAd.getName());
    }

    public final int hashCode() {
        return this.loadAd.getName().hashCode() + (this.yandex * 31);
    }
}
