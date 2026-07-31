package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lْۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13629l {
    public final int loadAd;
    public final int yandex;
    public static final C13629l crashlytics = new C13629l(0, 2);
    public static final Set amazon = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final C3301l purchase = new C3301l(new C13629l(0, 1));

    public C13629l(int i, int i2) {
        this.yandex = i;
        if (i2 != 0) {
            this.loadAd = i2;
        } else {
            C6541l.subs("Null streamState");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13629l)) {
            return false;
        }
        C13629l c13629l = (C13629l) obj;
        return this.yandex == c13629l.yandex && AbstractC5020l.firebase(this.loadAd, c13629l.loadAd);
    }

    public final int hashCode() {
        return (AbstractC5020l.inmobi(this.loadAd) ^ ((this.yandex ^ 1000003) * 1000003)) * 1000003;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.yandex);
        sb.append(", streamState=");
        int i = this.loadAd;
        if (i != 1) {
            str = i != 2 ? "null" : "INACTIVE";
        } else {
            str = "ACTIVE";
        }
        sb.append(str);
        sb.append(", inProgressTransformationInfo=null}");
        return sb.toString();
    }
}
