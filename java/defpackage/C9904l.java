package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lٍۣؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9904l {
    public boolean amazon;
    public boolean billing;
    public C16174l crashlytics;
    public final C7578l loadAd;
    public final Context yandex;
    public long mopub = 15000;
    public final C8887l admob = new C8887l();
    public C18527l purchase = C18527l.yandex;

    public C9904l(Context context, C7578l c7578l) {
        this.yandex = context.getApplicationContext();
        this.loadAd = c7578l;
    }
}
