package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٌٜۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8929l {
    public final /* synthetic */ C14541l crashlytics;
    public final ArrayList loadAd = new ArrayList();
    public final int yandex;

    public C8929l(C14541l c14541l, int i) {
        this.crashlytics = c14541l;
        this.yandex = i;
    }

    public final void yandex(int i) {
        C14541l c14541l = this.crashlytics;
        C11919l c11919l = c14541l.crashlytics;
        if (c11919l == null) {
            return;
        }
        this.loadAd.add(new C11045l(c11919l, i, c14541l.loadAd, null));
    }
}
