package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: lؘّۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5934l {
    public static final String subs = C14513l.applovin("WorkContinuationImpl");
    public C16543l admob;
    public final List amazon;
    public final ArrayList billing = new ArrayList();
    public final int crashlytics;
    public final String loadAd;
    public boolean mopub;
    public final ArrayList purchase;
    public final C13432l yandex;

    public C5934l(C13432l c13432l, String str, int i, List list) {
        this.yandex = c13432l;
        this.loadAd = str;
        this.crashlytics = i;
        this.amazon = list;
        this.purchase = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == 1 && ((C9335l) list.get(i2)).loadAd.Signature != Long.MAX_VALUE) {
                C8339l.metrica("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((C9335l) list.get(i2)).yandex.toString();
            this.purchase.add(string);
            this.billing.add(string);
        }
    }

    public static HashSet loadAd(C5934l c5934l) {
        HashSet hashSet = new HashSet();
        c5934l.getClass();
        return hashSet;
    }

    public final C16543l yandex() {
        String str;
        if (this.mopub) {
            C14513l.tapsense().appmetrica(subs, "Already enqueued work ids (" + TextUtils.join(", ", this.purchase) + ")");
        } else {
            C13432l c13432l = this.yandex;
            C15617l c15617l = c13432l.loadAd.remoteconfig;
            int i = this.crashlytics;
            if (i == 1) {
                str = "REPLACE";
            } else if (i == 2) {
                str = "KEEP";
            } else if (i == 3) {
                str = "APPEND";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "APPEND_OR_REPLACE";
            }
            this.admob = AbstractC1805l.purchase(c15617l, "EnqueueRunnable_".concat(str), c13432l.amazon.yandex, new C13932l(14, this));
        }
        return this.admob;
    }
}
