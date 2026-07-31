package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؑٚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0419l {
    public final BigInteger crashlytics;
    public final BigInteger loadAd;
    public final BigInteger yandex;

    public C0419l(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.yandex = bigInteger;
        this.loadAd = bigInteger2;
        this.crashlytics = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0419l) {
            C0419l c0419l = (C0419l) obj;
            if (this.crashlytics.equals(c0419l.crashlytics) && this.yandex.equals(c0419l.yandex) && this.loadAd.equals(c0419l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ (this.crashlytics.hashCode() ^ this.yandex.hashCode());
    }
}
