package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lّۣۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12795l extends AbstractC17942l {
    public final String amazon;
    public final InterfaceC4701l crashlytics;
    public final InterfaceC4701l loadAd;
    public final Context yandex;

    public C12795l(Context context, InterfaceC4701l interfaceC4701l, InterfaceC4701l interfaceC4701l2, String str) {
        if (context == null) {
            C6541l.subs("Null applicationContext");
            throw null;
        }
        this.yandex = context;
        if (interfaceC4701l == null) {
            C6541l.subs("Null wallClock");
            throw null;
        }
        this.loadAd = interfaceC4701l;
        if (interfaceC4701l2 == null) {
            C6541l.subs("Null monotonicClock");
            throw null;
        }
        this.crashlytics = interfaceC4701l2;
        if (str != null) {
            this.amazon = str;
        } else {
            C6541l.subs("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17942l) {
            C12795l c12795l = (C12795l) ((AbstractC17942l) obj);
            if (this.yandex.equals(c12795l.yandex) && this.loadAd.equals(c12795l.loadAd) && this.crashlytics.equals(c12795l.crashlytics) && this.amazon.equals(c12795l.amazon)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.amazon.hashCode() ^ ((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.yandex);
        sb.append(", wallClock=");
        sb.append(this.loadAd);
        sb.append(", monotonicClock=");
        sb.append(this.crashlytics);
        sb.append(", backendName=");
        return AbstractC0653l.ads(sb, this.amazon, "}");
    }
}
