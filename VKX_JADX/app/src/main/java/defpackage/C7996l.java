package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* JADX INFO: renamed from: lًٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7996l implements IBinder.DeathRecipient {
    public final C16701l amazon;
    public final HashMap billing = new HashMap();
    public final int crashlytics;
    public final int loadAd;
    public final /* synthetic */ ServiceC16415l mopub;
    public final C15053l purchase;
    public final String yandex;

    public C7996l(ServiceC16415l serviceC16415l, String str, int i, int i2, C15053l c15053l) {
        this.mopub = serviceC16415l;
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = new C16701l(str, i, i2);
        this.purchase = c15053l;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.mopub.f32105l.post(new RunnableC5360l(16, this));
    }
}
