package defpackage;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: renamed from: lؙؚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6916l {
    public final Object crashlytics;
    public final Class loadAd;
    public final String yandex;

    public C6916l(String str, Class cls, CaptureRequest.Key key) {
        this.yandex = str;
        if (cls == null) {
            C6541l.subs("Null valueClass");
            throw null;
        }
        this.loadAd = cls;
        this.crashlytics = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6916l)) {
            return false;
        }
        C6916l c6916l = (C6916l) obj;
        if (!this.yandex.equals(c6916l.yandex) || !this.loadAd.equals(c6916l.loadAd)) {
            return false;
        }
        Object obj2 = c6916l.crashlytics;
        Object obj3 = this.crashlytics;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        int iHashCode = (((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003;
        Object obj = this.crashlytics;
        return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Option{id=" + this.yandex + ", valueClass=" + this.loadAd + ", token=" + this.crashlytics + "}";
    }
}
