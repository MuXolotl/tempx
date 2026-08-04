package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lّْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13316l {
    public final Handler loadAd;
    public final Executor yandex;

    public C13316l(Executor executor, Handler handler) {
        if (executor == null) {
            C6541l.subs("Null cameraExecutor");
            throw null;
        }
        this.yandex = executor;
        if (handler != null) {
            this.loadAd = handler;
        } else {
            C6541l.subs("Null schedulerHandler");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13316l) {
            C13316l c13316l = (C13316l) obj;
            if (this.yandex.equals(c13316l.yandex) && this.loadAd.equals(c13316l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.yandex + ", schedulerHandler=" + this.loadAd + "}";
    }
}
