package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lَۦٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10712l {
    public C18152l admob;
    public HashMap amazon;
    public HashMap billing;
    public HashMap crashlytics;
    public Rect firebase;
    public ArrayList isPro;
    public boolean metrica;
    public ArrayList mopub;
    public float purchase;
    public float remoteconfig;
    public float smaato;
    public C3994l subs;
    public float vip;
    public final C1770l yandex = new C1770l(21);
    public final HashSet loadAd = new HashSet();
    public int startapp = 0;

    public final Map crashlytics() {
        float fCrashlytics = AbstractC4218l.crashlytics();
        if (fCrashlytics != this.purchase) {
            for (Map.Entry entry : this.amazon.entrySet()) {
                HashMap map = this.amazon;
                String str = (String) entry.getKey();
                C3547l c3547l = (C3547l) entry.getValue();
                float f = this.purchase / fCrashlytics;
                int i = (int) (c3547l.yandex * f);
                int i2 = (int) (c3547l.loadAd * f);
                C3547l c3547l2 = new C3547l(i, i2, c3547l.crashlytics, c3547l.amazon, c3547l.purchase);
                Bitmap bitmap = c3547l.billing;
                if (bitmap != null) {
                    c3547l2.billing = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, c3547l2);
            }
        }
        this.purchase = fCrashlytics;
        return this.amazon;
    }

    public final float loadAd() {
        return (long) (((this.remoteconfig - this.smaato) / this.vip) * 1000.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.isPro.iterator();
        while (it.hasNext()) {
            sb.append(((C4913l) it.next()).yandex("\t"));
        }
        return sb.toString();
    }

    public final void yandex(String str) {
        AbstractC17968l.loadAd(str);
        this.loadAd.add(str);
    }
}
