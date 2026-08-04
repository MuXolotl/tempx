package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* JADX INFO: renamed from: lُ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC17845l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f34773l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f34774l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f34775l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C9471l f34776l;

    public AbstractRunnableC17845l(C9471l c9471l, boolean z) {
        Objects.requireNonNull(c9471l);
        this.f34776l = c9471l;
        this.f34775l = System.currentTimeMillis();
        this.f34774l = SystemClock.elapsedRealtime();
        this.f34773l = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9471l c9471l = this.f34776l;
        if (c9471l.purchase) {
            loadAd();
            return;
        }
        try {
            yandex();
        } catch (Exception e) {
            c9471l.loadAd(e, false, this.f34773l);
            loadAd();
        }
    }

    public abstract void yandex();

    public void loadAd() {
    }
}
