package defpackage;

import android.opengl.EGLSurface;

/* JADX INFO: renamed from: lٌّۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8744l {
    public final int crashlytics;
    public final int loadAd;
    public final EGLSurface yandex;

    public C8744l(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            C6541l.subs("Null eglSurface");
            throw null;
        }
        this.yandex = eGLSurface;
        this.loadAd = i;
        this.crashlytics = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8744l) {
            C8744l c8744l = (C8744l) obj;
            if (this.yandex.equals(c8744l.yandex) && this.loadAd == c8744l.loadAd && this.crashlytics == c8744l.crashlytics) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.crashlytics ^ ((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.yandex);
        sb.append(", width=");
        sb.append(this.loadAd);
        sb.append(", height=");
        return AbstractC14814l.remoteconfig(this.crashlytics, "}", sb);
    }
}
