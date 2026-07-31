package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import j$.util.Objects;

/* JADX INFO: renamed from: lُٗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceHolderCallbackC17042l implements SurfaceHolder.Callback {
    public final /* synthetic */ C14439l admob;
    public C17706l amazon;
    public C15691l crashlytics;
    public C15691l loadAd;
    public Size purchase;
    public Size yandex;
    public boolean billing = false;
    public boolean mopub = false;

    public SurfaceHolderCallbackC17042l(C14439l c14439l) {
        this.admob = c14439l;
    }

    public final boolean loadAd() {
        C14439l c14439l = this.admob;
        Surface surface = c14439l.purchase.getHolder().getSurface();
        if (this.billing || this.loadAd == null || !Objects.equals(this.yandex, this.purchase)) {
            return false;
        }
        AbstractC5088l.yandex("SurfaceViewImpl", "Surface set on Preview.");
        C17706l c17706l = this.amazon;
        C15691l c15691l = this.loadAd;
        Objects.requireNonNull(c15691l);
        c15691l.yandex(surface, AbstractC7720l.amazon(c14439l.purchase.getContext()), new C10927l(1, c17706l));
        this.billing = true;
        c14439l.amazon = true;
        c14439l.billing();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        AbstractC5088l.yandex("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
        this.purchase = new Size(i2, i3);
        loadAd();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C15691l c15691l;
        AbstractC5088l.yandex("SurfaceViewImpl", "Surface created.");
        if (!this.mopub || (c15691l = this.crashlytics) == null) {
            return;
        }
        c15691l.crashlytics();
        c15691l.firebase.loadAd(null);
        this.crashlytics = null;
        this.mopub = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractC5088l.yandex("SurfaceViewImpl", "Surface destroyed.");
        if (!this.billing) {
            yandex();
        } else if (this.loadAd != null) {
            AbstractC5088l.yandex("SurfaceViewImpl", "Surface closed " + this.loadAd);
            this.loadAd.remoteconfig.yandex();
        }
        this.mopub = true;
        C15691l c15691l = this.loadAd;
        if (c15691l != null) {
            this.crashlytics = c15691l;
        }
        this.billing = false;
        this.loadAd = null;
        this.amazon = null;
        this.purchase = null;
        this.yandex = null;
    }

    public final void yandex() {
        C17706l c17706l;
        if (this.loadAd != null) {
            AbstractC5088l.yandex("SurfaceViewImpl", "Request canceled: " + this.loadAd);
            if (!this.loadAd.crashlytics() || (c17706l = this.amazon) == null) {
                return;
            }
            c17706l.yandex();
        }
    }
}
