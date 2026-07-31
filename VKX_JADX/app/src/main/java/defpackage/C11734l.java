package defpackage;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;

/* JADX INFO: renamed from: lٍِ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11734l {
    public static final C14727l loadAd = C14727l.loadAd(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String yandex;

    public C11734l(Context context, C6664l c6664l) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        AbstractC8109l.yandex(context);
        synchronized (C1083l.class) {
            int i = 0;
            if (C1083l.f2986l == null) {
                C1083l.f2986l = new C1083l(i);
            }
        }
        this.yandex = "common";
        C5138l c5138lM1704new = C5138l.m1704new();
        CallableC15551l callableC15551l = new CallableC15551l(6, this);
        c5138lM1704new.getClass();
        C5138l.m1703implements(callableC15551l);
        C5138l c5138lM1704new2 = C5138l.m1704new();
        Objects.requireNonNull(c6664l);
        CallableC14197l callableC14197l = new CallableC14197l(c6664l, 1);
        c5138lM1704new2.getClass();
        C5138l.m1703implements(callableC14197l);
        C14727l c14727l = loadAd;
        if (c14727l.containsKey("common")) {
            C7269l.amazon(context, (String) c14727l.get("common"), false);
        }
    }
}
