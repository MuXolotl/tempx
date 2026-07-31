package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lؚٔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7258l {
    public final InterfaceC11766l amazon;
    public final InterfaceC11766l crashlytics;
    public final InterfaceC11766l loadAd;
    public final Context yandex;
    public volatile int purchase = 0;
    public final CopyOnWriteArrayList billing = new CopyOnWriteArrayList();
    public final Object mopub = new Object();
    public volatile AbstractC12138l admob = null;

    public C7258l(Context context, InterfaceC11766l interfaceC11766l, InterfaceC11766l interfaceC11766l2, InterfaceC11766l interfaceC11766l3) {
        this.yandex = context;
        this.loadAd = interfaceC11766l;
        this.crashlytics = interfaceC11766l2;
        this.amazon = interfaceC11766l3;
    }
}
