package defpackage;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: lٌٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8930l {
    public static final C0022l amazon = new C0022l("AnalyticsConsent", null);
    public final HandlerC4052l crashlytics = new HandlerC4052l(Looper.getMainLooper(), 6);
    public final long loadAd;
    public final C7560l yandex;

    public C8930l(Context context, long j) {
        this.yandex = new C7560l(context, AbstractC18122l.yandex, new C9476l(), C1308l.crashlytics);
        this.loadAd = j;
    }
}
