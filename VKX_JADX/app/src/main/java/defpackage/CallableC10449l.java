package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lَٞؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC10449l implements Callable {
    public final /* synthetic */ C17503l loadAd;
    public final /* synthetic */ long yandex;

    public CallableC10449l(C17503l c17503l, long j) {
        this.loadAd = c17503l;
        this.yandex = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.yandex);
        this.loadAd.firebase.startapp(bundle);
        return null;
    }
}
