package defpackage;

import java.io.File;

/* JADX INFO: renamed from: lؗؔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4635l {
    public final File crashlytics;
    public final String loadAd;
    public final C11091l yandex;

    public C4635l(C11091l c11091l, String str, File file) {
        this.yandex = c11091l;
        if (str == null) {
            C6541l.subs("Null sessionId");
            throw null;
        }
        this.loadAd = str;
        this.crashlytics = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4635l)) {
            return false;
        }
        C4635l c4635l = (C4635l) obj;
        return this.yandex.equals(c4635l.yandex) && this.loadAd.equals(c4635l.loadAd) && this.crashlytics.equals(c4635l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() ^ ((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.yandex + ", sessionId=" + this.loadAd + ", reportFile=" + this.crashlytics + "}";
    }
}
