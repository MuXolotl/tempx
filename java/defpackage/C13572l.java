package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: renamed from: lَْۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13572l {
    public final C3726l yandex;
    public static final Object loadAd = new Object();
    public static final HashMap crashlytics = new HashMap();

    public C13572l(Context context, String str, InterfaceC9814l interfaceC9814l, PendingIntent pendingIntent, AbstractC1186l abstractC1186l, AbstractC1186l abstractC1186l2, AbstractC1186l abstractC1186l3, C15035l c15035l, Bundle bundle, Bundle bundle2, InterfaceC9474l interfaceC9474l, boolean z, boolean z2, int i) {
        synchronized (loadAd) {
            HashMap map = crashlytics;
            if (map.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            map.put(str, this);
        }
        this.yandex = new C3726l(this, context, str, interfaceC9814l, pendingIntent, abstractC1186l, abstractC1186l2, abstractC1186l3, c15035l, bundle, bundle2, interfaceC9474l, z, z2, i);
    }

    public final InterfaceC9814l yandex() {
        return (InterfaceC9814l) this.yandex.tapsense.f33215l;
    }
}
