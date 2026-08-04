package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘۢٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6045l {
    public static final C16367l mopub = new C16367l(4);
    public final int amazon;
    public final Set billing;
    public int crashlytics;
    public final LinkedHashMap loadAd;
    public final LinkedHashSet purchase;
    public final Context yandex;

    public C6045l(Context context, LinkedHashMap linkedHashMap, int i, int i2, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.yandex = context;
        this.loadAd = linkedHashMap;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = linkedHashSet;
        this.billing = set;
    }

    public final Object loadAd(C9275l c9275l) throws Throwable {
        Object objAmazon = C18188l.yandex.amazon(this.yandex, C15656l.loadAd, AbstractC16422l.billing(this.amazon), new C13624l(this, null, 26), c9275l);
        return objAmazon == EnumC9342l.f19165l ? objAmazon : Unit.INSTANCE;
    }

    public final int yandex(AbstractC11563l abstractC11563l) {
        C7300l c7300lLoadAd = AbstractC16422l.loadAd(this.yandex, abstractC11563l);
        synchronized (this) {
            Integer num = (Integer) this.loadAd.get(c7300lLoadAd);
            if (num != null) {
                int iIntValue = num.intValue();
                this.purchase.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int i = this.crashlytics;
            while (this.billing.contains(Integer.valueOf(i))) {
                i = (i + 1) % AbstractC5267l.crashlytics;
                if (i == this.crashlytics) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.crashlytics = (i + 1) % AbstractC5267l.crashlytics;
            this.purchase.add(Integer.valueOf(i));
            this.billing.add(Integer.valueOf(i));
            this.loadAd.put(c7300lLoadAd, Integer.valueOf(i));
            return i;
        }
    }
}
