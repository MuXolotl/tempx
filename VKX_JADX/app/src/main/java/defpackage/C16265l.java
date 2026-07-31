package defpackage;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: renamed from: lًٖۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16265l {
    public int admob;
    public long amazon;
    public Handler billing;
    public InterfaceC11856l crashlytics;
    public boolean loadAd;
    public SurfaceHolderCallbackC18330l mopub;
    public boolean purchase;
    public final Context yandex;

    public C16265l(Context context) {
        this.yandex = context;
        this.crashlytics = new C7947l(context);
    }
}
