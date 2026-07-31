package defpackage;

import android.net.NetworkRequest;

/* JADX INFO: renamed from: lٌٚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8891l {
    public static final String loadAd = C14513l.applovin("NetworkRequestCompat");
    public final Object yandex;

    public C8891l(NetworkRequest networkRequest) {
        this.yandex = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8891l) && AbstractC8576l.yandex(this.yandex, ((C8891l) obj).yandex);
    }

    public final int hashCode() {
        Object obj = this.yandex;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.yandex + ')';
    }
}
