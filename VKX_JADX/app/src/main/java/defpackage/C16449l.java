package defpackage;

import android.os.Handler;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: lٖ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16449l {
    public static final C16449l purchase = new C16449l();
    public boolean amazon;
    public boolean crashlytics;
    public String loadAd;
    public final SparseIntArray yandex = new SparseIntArray();

    public C16449l() {
        Handler handler = AbstractC13209l.yandex;
        this.loadAd = "default";
        this.amazon = true;
    }
}
