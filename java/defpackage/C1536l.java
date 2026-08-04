package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lؓؐۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1536l {
    public final boolean loadAd;
    public final List yandex;

    public C1536l(C4300l c4300l) {
        this.yandex = c4300l.loadAd;
        this.loadAd = c4300l.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1536l)) {
            return false;
        }
        C1536l c1536l = (C1536l) obj;
        return this.yandex.equals(c1536l.yandex) && this.loadAd == c1536l.loadAd;
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, Boolean.valueOf(this.loadAd), null);
    }
}
