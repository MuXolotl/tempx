package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: l٘ؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17697l {
    public final float admob;
    public final float amazon;
    public final float billing;
    public final float crashlytics;
    public final ArrayList isPro;
    public final float loadAd;
    public final float mopub;
    public final float purchase;
    public final List subs;
    public final String yandex;

    public C17697l(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            int i2 = AbstractC8192l.yandex;
            list = C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList();
        this.yandex = str;
        this.loadAd = f;
        this.crashlytics = f2;
        this.amazon = f3;
        this.purchase = f4;
        this.billing = f5;
        this.mopub = f6;
        this.admob = f7;
        this.subs = list;
        this.isPro = arrayList;
    }
}
