package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؚؔۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7013l extends C3446l {
    public C3446l purchase;

    public C7013l(C3446l c3446l) {
        this.purchase = c3446l;
    }

    @Override // defpackage.C3446l
    public final C3446l amazon(long j) {
        return this.purchase.amazon(j);
    }

    @Override // defpackage.C3446l
    public final void billing() throws InterruptedIOException {
        this.purchase.billing();
    }

    @Override // defpackage.C3446l
    public final long crashlytics() {
        return this.purchase.crashlytics();
    }

    @Override // defpackage.C3446l
    public final C3446l loadAd() {
        return this.purchase.loadAd();
    }

    @Override // defpackage.C3446l
    public final C3446l mopub(long j, TimeUnit timeUnit) {
        return this.purchase.mopub(j, timeUnit);
    }

    @Override // defpackage.C3446l
    public final boolean purchase() {
        return this.purchase.purchase();
    }

    @Override // defpackage.C3446l
    public final C3446l yandex() {
        return this.purchase.yandex();
    }
}
