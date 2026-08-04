package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٌ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8863l {
    public final Map loadAd;
    public final C7931l yandex;

    public C8863l(C7931l c7931l, Map map) {
        this.yandex = c7931l;
        this.loadAd = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8863l)) {
            return false;
        }
        C8863l c8863l = (C8863l) obj;
        return this.yandex.equals(c8863l.yandex) && this.loadAd.equals(c8863l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "CameraGraphCreationResult(config=" + this.yandex + ", streamConfigMap=" + this.loadAd + ')';
    }
}
