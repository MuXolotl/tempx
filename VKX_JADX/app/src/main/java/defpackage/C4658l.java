package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lؗؖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4658l {
    public C16710l loadAd;
    public final Bundle yandex;

    public C4658l(C16710l c16710l, boolean z) {
        if (c16710l == null) {
            C8339l.metrica("selector must not be null");
            throw null;
        }
        Bundle bundle = new Bundle();
        this.yandex = bundle;
        this.loadAd = c16710l;
        bundle.putBundle("selector", c16710l.yandex);
        bundle.putBoolean("activeScan", z);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4658l) {
            C4658l c4658l = (C4658l) obj;
            yandex();
            C16710l c16710l = this.loadAd;
            c4658l.yandex();
            if (c16710l.equals(c4658l.loadAd) && loadAd() == c4658l.loadAd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        yandex();
        return (loadAd() ? 1 : 0) ^ this.loadAd.hashCode();
    }

    public final boolean loadAd() {
        return this.yandex.getBoolean("activeScan");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        yandex();
        sb.append(this.loadAd);
        sb.append(", activeScan=");
        sb.append(loadAd());
        sb.append(", isValid=");
        yandex();
        C16710l c16710l = this.loadAd;
        c16710l.yandex();
        return AbstractC5020l.Signature(sb, !c16710l.loadAd.contains(null), " }");
    }

    public final void yandex() {
        if (this.loadAd == null) {
            Bundle bundle = this.yandex.getBundle("selector");
            C16710l c16710l = null;
            if (bundle != null) {
                c16710l = new C16710l(bundle, null);
            } else {
                C16710l c16710l2 = C16710l.crashlytics;
            }
            this.loadAd = c16710l;
            if (c16710l == null) {
                this.loadAd = C16710l.crashlytics;
            }
        }
    }
}
