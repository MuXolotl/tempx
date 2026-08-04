package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: lؘِ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12164l extends AbstractC10759l {
    public static final /* synthetic */ int vip = 0;
    public final int admob;
    public final C12800l billing;
    public final AbstractC10759l[] firebase;
    public final int[] isPro;
    public final int mopub;
    public final int purchase;
    public final HashMap remoteconfig;
    public final Object[] smaato;
    public final int[] subs;

    public C12164l(AbstractC10759l[] abstractC10759lArr, Object[] objArr, C12800l c12800l) {
        this.billing = c12800l;
        this.purchase = c12800l.loadAd.length;
        int length = abstractC10759lArr.length;
        this.firebase = abstractC10759lArr;
        this.subs = new int[length];
        this.isPro = new int[length];
        this.smaato = objArr;
        this.remoteconfig = new HashMap();
        int length2 = abstractC10759lArr.length;
        int i = 0;
        int iMetrica = 0;
        int iAdmob = 0;
        int i2 = 0;
        while (i < length2) {
            AbstractC10759l abstractC10759l = abstractC10759lArr[i];
            this.firebase[i2] = abstractC10759l;
            this.isPro[i2] = iMetrica;
            this.subs[i2] = iAdmob;
            iMetrica += abstractC10759l.metrica();
            iAdmob += this.firebase[i2].admob();
            this.remoteconfig.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.mopub = iMetrica;
        this.admob = iAdmob;
    }

    public final int adcel(int i, boolean z) {
        if (!z) {
            if (i < this.purchase - 1) {
                return i + 1;
            }
            return -1;
        }
        C12800l c12800l = this.billing;
        int i2 = c12800l.crashlytics[i] + 1;
        int[] iArr = c12800l.loadAd;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    @Override // defpackage.AbstractC10759l
    public final int admob() {
        return this.admob;
    }

    public final int ads(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        C12800l c12800l = this.billing;
        int i2 = c12800l.crashlytics[i] - 1;
        if (i2 >= 0) {
            return c12800l.loadAd[i2];
        }
        return -1;
    }

    @Override // defpackage.AbstractC10759l
    public final C3904l billing(int i, C3904l c3904l, boolean z) {
        int[] iArr = this.subs;
        int iPurchase = AbstractC15323l.purchase(iArr, i + 1, false, false);
        int i2 = this.isPro[iPurchase];
        this.firebase[iPurchase].billing(i - iArr[iPurchase], c3904l, z);
        c3904l.crashlytics += i2;
        if (z) {
            Object obj = this.smaato[iPurchase];
            Object obj2 = c3904l.loadAd;
            obj2.getClass();
            c3904l.loadAd = Pair.create(obj, obj2);
        }
        return c3904l;
    }

    @Override // defpackage.AbstractC10759l
    public final int crashlytics(boolean z) {
        int iAds;
        int i = this.purchase;
        if (i != 0) {
            if (z) {
                int[] iArr = this.billing.loadAd;
                iAds = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iAds = i - 1;
            }
            do {
                AbstractC10759l[] abstractC10759lArr = this.firebase;
                if (!abstractC10759lArr[iAds].startapp()) {
                    return abstractC10759lArr[iAds].crashlytics(z) + this.isPro[iAds];
                }
                iAds = ads(iAds, z);
            } while (iAds != -1);
        }
        return -1;
    }

    @Override // defpackage.AbstractC10759l
    public final int firebase(int i, int i2, boolean z) {
        int[] iArr = this.isPro;
        int iPurchase = AbstractC15323l.purchase(iArr, i + 1, false, false);
        int i3 = iArr[iPurchase];
        AbstractC10759l[] abstractC10759lArr = this.firebase;
        int iFirebase = abstractC10759lArr[iPurchase].firebase(i - i3, i2 != 2 ? i2 : 0, z);
        if (iFirebase != -1) {
            return i3 + iFirebase;
        }
        int iAds = ads(iPurchase, z);
        while (iAds != -1 && abstractC10759lArr[iAds].startapp()) {
            iAds = ads(iAds, z);
        }
        if (iAds != -1) {
            return abstractC10759lArr[iAds].crashlytics(z) + iArr[iAds];
        }
        if (i2 == 2) {
            return crashlytics(z);
        }
        return -1;
    }

    @Override // defpackage.AbstractC10759l
    public final int loadAd(Object obj) {
        int iLoadAd;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.remoteconfig.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iLoadAd = this.firebase[iIntValue].loadAd(obj3)) != -1) {
                return this.subs[iIntValue] + iLoadAd;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC10759l
    public final int metrica() {
        return this.mopub;
    }

    @Override // defpackage.AbstractC10759l
    public final C3904l mopub(Object obj, C3904l c3904l) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.remoteconfig.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.isPro[iIntValue];
        this.firebase[iIntValue].mopub(obj3, c3904l);
        c3904l.crashlytics += i;
        c3904l.loadAd = obj;
        return c3904l;
    }

    @Override // defpackage.AbstractC10759l
    public final int purchase(int i, int i2, boolean z) {
        int[] iArr = this.isPro;
        int iPurchase = AbstractC15323l.purchase(iArr, i + 1, false, false);
        int i3 = iArr[iPurchase];
        AbstractC10759l[] abstractC10759lArr = this.firebase;
        int iPurchase2 = abstractC10759lArr[iPurchase].purchase(i - i3, i2 != 2 ? i2 : 0, z);
        if (iPurchase2 != -1) {
            return i3 + iPurchase2;
        }
        int iAdcel = adcel(iPurchase, z);
        while (iAdcel != -1 && abstractC10759lArr[iAdcel].startapp()) {
            iAdcel = adcel(iAdcel, z);
        }
        if (iAdcel != -1) {
            return abstractC10759lArr[iAdcel].yandex(z) + iArr[iAdcel];
        }
        if (i2 == 2) {
            return yandex(z);
        }
        return -1;
    }

    @Override // defpackage.AbstractC10759l
    public final C4322l remoteconfig(int i, C4322l c4322l, long j) {
        int[] iArr = this.isPro;
        int iPurchase = AbstractC15323l.purchase(iArr, i + 1, false, false);
        int i2 = iArr[iPurchase];
        int i3 = this.subs[iPurchase];
        this.firebase[iPurchase].remoteconfig(i - i2, c4322l, j);
        Object objCreate = this.smaato[iPurchase];
        Object obj = C4322l.adcel;
        Object obj2 = c4322l.yandex;
        if (obj != obj2) {
            objCreate = Pair.create(objCreate, obj2);
        }
        c4322l.yandex = objCreate;
        c4322l.vip += i3;
        c4322l.metrica += i3;
        return c4322l;
    }

    @Override // defpackage.AbstractC10759l
    public final Object smaato(int i) {
        int[] iArr = this.subs;
        int iPurchase = AbstractC15323l.purchase(iArr, i + 1, false, false);
        return Pair.create(this.smaato[iPurchase], this.firebase[iPurchase].smaato(i - iArr[iPurchase]));
    }

    @Override // defpackage.AbstractC10759l
    public final int yandex(boolean z) {
        if (this.purchase != 0) {
            int iAdcel = 0;
            if (z) {
                int[] iArr = this.billing.loadAd;
                iAdcel = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC10759l[] abstractC10759lArr = this.firebase;
                if (!abstractC10759lArr[iAdcel].startapp()) {
                    return abstractC10759lArr[iAdcel].yandex(z) + this.isPro[iAdcel];
                }
                iAdcel = adcel(iAdcel, z);
            } while (iAdcel != -1);
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12164l(ArrayList arrayList, C12800l c12800l) {
        AbstractC10759l[] abstractC10759lArr = new AbstractC10759l[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            abstractC10759lArr[i2] = ((InterfaceC14220l) it.next()).crashlytics();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC14220l) it2.next()).loadAd();
            i++;
        }
        this(abstractC10759lArr, objArr, c12800l);
    }
}
