package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؙۜؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6756l extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient int[] f14157l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public transient int f14158l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public transient AbstractSet f14159l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient Object f14160l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14161l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public transient AbstractCollection f14162l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public transient Object[] f14163l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public transient Object[] f14164l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public transient AbstractSet f14165l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public transient int f14166l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final Object f14156l = new Object();

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final Object f14155l = new Object();

    public C6756l(int i) {
        this.f14161l = i;
        switch (i) {
            case 1:
                this.f14166l = Math.min(Math.max(12, 1), 1073741823);
                break;
        }
    }

    public static C6756l loadAd(int i) {
        C6756l c6756l = new C6756l(0);
        AbstractC12442l.subs(i >= 0, "Expected size must be >= 0");
        c6756l.f14166l = AbstractC9966l.purchase(i, 1);
        return c6756l;
    }

    public static C6756l yandex() {
        C6756l c6756l = new C6756l(0);
        c6756l.f14166l = AbstractC9966l.purchase(3, 1);
        return c6756l;
    }

    public int Signature(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objSubscription = AbstractC16431l.subscription(i2);
        if (i4 != 0) {
            AbstractC16431l.tapsense(i3 & i5, i4 + 1, objSubscription);
        }
        Object obj = this.f14160l;
        Objects.requireNonNull(obj);
        int[] iArrRemoteconfig = remoteconfig();
        for (int i6 = 0; i6 <= i; i6++) {
            int iAds = AbstractC16431l.ads(i6, obj);
            while (iAds != 0) {
                int i7 = iAds - 1;
                int i8 = iArrRemoteconfig[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iAds2 = AbstractC16431l.ads(i10, objSubscription);
                AbstractC16431l.tapsense(i10, iAds, objSubscription);
                iArrRemoteconfig[i7] = ((~i5) & i9) | (iAds2 & i5);
                iAds = i8 & i;
            }
        }
        this.f14160l = objSubscription;
        this.f14166l = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f14166l & (-32));
        return i5;
    }

    public void adcel(int i, int i2) {
        Object obj = this.f14160l;
        Objects.requireNonNull(obj);
        int[] iArrRemoteconfig = remoteconfig();
        Object[] objArrVip = vip();
        Object[] objArrMetrica = metrica();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrVip[i] = null;
            objArrMetrica[i] = null;
            iArrRemoteconfig[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrVip[i3];
        objArrVip[i] = obj2;
        objArrMetrica[i] = objArrMetrica[i3];
        objArrVip[i3] = null;
        objArrMetrica[i3] = null;
        iArrRemoteconfig[i] = iArrRemoteconfig[i3];
        iArrRemoteconfig[i3] = 0;
        int iAdcel = AbstractC2387l.adcel(obj2) & i2;
        int iAds = AbstractC16431l.ads(iAdcel, obj);
        if (iAds == size) {
            AbstractC16431l.tapsense(iAdcel, i4, obj);
            return;
        }
        while (true) {
            int i5 = iAds - 1;
            int i6 = iArrRemoteconfig[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrRemoteconfig[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iAds = i7;
        }
    }

    public Object admob(Object obj) {
        if (!mopub()) {
            int iAmazon = amazon();
            Object obj2 = this.f14160l;
            Objects.requireNonNull(obj2);
            int iFirebase = AbstractC15576l.firebase(obj, null, iAmazon, obj2, subs(), isPro(), null);
            if (iFirebase != -1) {
                Object obj3 = firebase()[iFirebase];
                billing(iFirebase, iAmazon);
                this.f14158l--;
                this.f14166l += 32;
                return obj3;
            }
        }
        return f14156l;
    }

    public boolean ads() {
        return this.f14160l == null;
    }

    public int amazon() {
        return (1 << (this.f14166l & 31)) - 1;
    }

    public void billing(int i, int i2) {
        Object obj = this.f14160l;
        Objects.requireNonNull(obj);
        int[] iArrSubs = subs();
        Object[] objArrIsPro = isPro();
        Object[] objArrFirebase = firebase();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrIsPro[i] = null;
            objArrFirebase[i] = null;
            iArrSubs[i] = 0;
            return;
        }
        Object obj2 = objArrIsPro[i3];
        objArrIsPro[i] = obj2;
        objArrFirebase[i] = objArrFirebase[i3];
        objArrIsPro[i3] = null;
        objArrFirebase[i3] = null;
        iArrSubs[i] = iArrSubs[i3];
        iArrSubs[i3] = 0;
        int iAmazon = AbstractC12027l.amazon(obj2) & i2;
        int iSmaato = AbstractC15576l.smaato(iAmazon, obj);
        if (iSmaato == size) {
            AbstractC15576l.remoteconfig(iAmazon, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iSmaato - 1;
            int i5 = iArrSubs[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrSubs[i4] = AbstractC15576l.subs(i5, i + 1, i2);
                return;
            }
            iSmaato = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.f14161l) {
            case 0:
                if (!mopub()) {
                    this.f14166l += 32;
                    Map mapCrashlytics = crashlytics();
                    if (mapCrashlytics == null) {
                        Arrays.fill(isPro(), 0, this.f14158l, (Object) null);
                        Arrays.fill(firebase(), 0, this.f14158l, (Object) null);
                        Object obj = this.f14160l;
                        Objects.requireNonNull(obj);
                        if (obj instanceof byte[]) {
                            Arrays.fill((byte[]) obj, (byte) 0);
                        } else if (obj instanceof short[]) {
                            Arrays.fill((short[]) obj, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj, 0);
                        }
                        Arrays.fill(subs(), 0, this.f14158l, 0);
                        this.f14158l = 0;
                    } else {
                        this.f14166l = AbstractC9966l.purchase(size(), 3);
                        mapCrashlytics.clear();
                        this.f14160l = null;
                        this.f14158l = 0;
                    }
                    break;
                }
                break;
            default:
                if (!ads()) {
                    this.f14166l += 32;
                    Map mapStartapp = startapp();
                    if (mapStartapp == null) {
                        Arrays.fill(vip(), 0, this.f14158l, (Object) null);
                        Arrays.fill(metrica(), 0, this.f14158l, (Object) null);
                        Object obj2 = this.f14160l;
                        Objects.requireNonNull(obj2);
                        if (obj2 instanceof byte[]) {
                            Arrays.fill((byte[]) obj2, (byte) 0);
                        } else if (obj2 instanceof short[]) {
                            Arrays.fill((short[]) obj2, (short) 0);
                        } else {
                            Arrays.fill((int[]) obj2, 0);
                        }
                        Arrays.fill(remoteconfig(), 0, this.f14158l, 0);
                        this.f14158l = 0;
                    } else {
                        this.f14166l = Math.min(Math.max(size(), 3), 1073741823);
                        mapStartapp.clear();
                        this.f14160l = null;
                        this.f14158l = 0;
                    }
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f14161l) {
            case 0:
                Map mapCrashlytics = crashlytics();
                if (mapCrashlytics != null) {
                    return mapCrashlytics.containsKey(obj);
                }
                return purchase(obj) != -1;
            default:
                Map mapStartapp = startapp();
                if (mapStartapp != null) {
                    return mapStartapp.containsKey(obj);
                }
                return tapsense(obj) != -1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f14161l) {
            case 0:
                Map mapCrashlytics = crashlytics();
                if (mapCrashlytics != null) {
                    return mapCrashlytics.containsValue(obj);
                }
                for (int i = 0; i < this.f14158l; i++) {
                    if (AbstractC7000l.loadAd(obj, firebase()[i])) {
                        return true;
                    }
                }
                return false;
            default:
                Map mapStartapp = startapp();
                if (mapStartapp != null) {
                    return mapStartapp.containsValue(obj);
                }
                for (int i2 = 0; i2 < this.f14158l; i2++) {
                    if (AbstractC7574l.firebase(obj, metrica()[i2])) {
                        return true;
                    }
                }
                return false;
        }
    }

    public Map crashlytics() {
        Object obj = this.f14160l;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        int i = 0;
        switch (this.f14161l) {
            case 0:
                C11320l c11320l = (C11320l) this.f14165l;
                if (c11320l != null) {
                    return c11320l;
                }
                C11320l c11320l2 = new C11320l(this, i);
                this.f14165l = c11320l2;
                return c11320l2;
            default:
                C6446l c6446l = (C6446l) this.f14165l;
                if (c6446l != null) {
                    return c6446l;
                }
                C6446l c6446l2 = new C6446l(this, i);
                this.f14165l = c6446l2;
                return c6446l2;
        }
    }

    public Object[] firebase() {
        Object[] objArr = this.f14163l;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        switch (this.f14161l) {
            case 0:
                Map mapCrashlytics = crashlytics();
                if (mapCrashlytics != null) {
                    return mapCrashlytics.get(obj);
                }
                int iPurchase = purchase(obj);
                if (iPurchase == -1) {
                    return null;
                }
                return firebase()[iPurchase];
            default:
                Map mapStartapp = startapp();
                if (mapStartapp != null) {
                    return mapStartapp.get(obj);
                }
                int iTapsense = tapsense(obj);
                if (iTapsense == -1) {
                    return null;
                }
                return metrica()[iTapsense];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        switch (this.f14161l) {
            case 0:
                return size() == 0;
            default:
                return size() == 0;
        }
    }

    public Object[] isPro() {
        Object[] objArr = this.f14164l;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        int i = 1;
        switch (this.f14161l) {
            case 0:
                C11320l c11320l = (C11320l) this.f14159l;
                if (c11320l != null) {
                    return c11320l;
                }
                C11320l c11320l2 = new C11320l(this, i);
                this.f14159l = c11320l2;
                return c11320l2;
            default:
                C6446l c6446l = (C6446l) this.f14159l;
                if (c6446l != null) {
                    return c6446l;
                }
                C6446l c6446l2 = new C6446l(this, i);
                this.f14159l = c6446l2;
                return c6446l2;
        }
    }

    public Object license(Object obj) {
        if (!ads()) {
            int iSubscription = subscription();
            Object obj2 = this.f14160l;
            Objects.requireNonNull(obj2);
            int iAdcel = AbstractC16431l.adcel(obj, null, iSubscription, obj2, remoteconfig(), vip(), null);
            if (iAdcel != -1) {
                Object obj3 = metrica()[iAdcel];
                adcel(iAdcel, iSubscription);
                this.f14158l--;
                this.f14166l += 32;
                return obj3;
            }
        }
        return f14155l;
    }

    public Object[] metrica() {
        Object[] objArr = this.f14163l;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public boolean mopub() {
        return this.f14160l == null;
    }

    public int purchase(Object obj) {
        if (mopub()) {
            return -1;
        }
        int iAmazon = AbstractC12027l.amazon(obj);
        int iAmazon2 = amazon();
        Object obj2 = this.f14160l;
        Objects.requireNonNull(obj2);
        int iSmaato = AbstractC15576l.smaato(iAmazon & iAmazon2, obj2);
        if (iSmaato == 0) {
            return -1;
        }
        int i = ~iAmazon2;
        int i2 = iAmazon & i;
        do {
            int i3 = iSmaato - 1;
            int i4 = subs()[i3];
            if ((i4 & i) == i2 && AbstractC7000l.loadAd(obj, isPro()[i3])) {
                return i3;
            }
            iSmaato = i4 & iAmazon2;
        } while (iSmaato != 0);
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0286  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0299 -> B:96:0x0280). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x010d -> B:42:0x00f4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:94:0x026d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6756l.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public int[] remoteconfig() {
        int[] iArr = this.f14157l;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.f14161l) {
            case 0:
                Map mapCrashlytics = crashlytics();
                if (mapCrashlytics != null) {
                    return mapCrashlytics.remove(obj);
                }
                Object objAdmob = admob(obj);
                if (objAdmob == f14156l) {
                    return null;
                }
                return objAdmob;
            default:
                Map mapStartapp = startapp();
                if (mapStartapp != null) {
                    return mapStartapp.remove(obj);
                }
                Object objLicense = license(obj);
                if (objLicense == f14155l) {
                    return null;
                }
                return objLicense;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.f14161l) {
            case 0:
                Map mapCrashlytics = crashlytics();
                return mapCrashlytics != null ? mapCrashlytics.size() : this.f14158l;
            default:
                Map mapStartapp = startapp();
                return mapStartapp != null ? mapStartapp.size() : this.f14158l;
        }
    }

    public int smaato(int i, int i2, int i3, int i4) {
        Object objMopub = AbstractC15576l.mopub(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AbstractC15576l.remoteconfig(i3 & i5, i4 + 1, objMopub);
        }
        Object obj = this.f14160l;
        Objects.requireNonNull(obj);
        int[] iArrSubs = subs();
        for (int i6 = 0; i6 <= i; i6++) {
            int iSmaato = AbstractC15576l.smaato(i6, obj);
            while (iSmaato != 0) {
                int i7 = iSmaato - 1;
                int i8 = iArrSubs[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iSmaato2 = AbstractC15576l.smaato(i10, objMopub);
                AbstractC15576l.remoteconfig(i10, iSmaato, objMopub);
                iArrSubs[i7] = AbstractC15576l.subs(i9, iSmaato2, i5);
                iSmaato = i8 & i;
            }
        }
        this.f14160l = objMopub;
        this.f14166l = AbstractC15576l.subs(this.f14166l, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    public Map startapp() {
        Object obj = this.f14160l;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public int[] subs() {
        int[] iArr = this.f14157l;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public int subscription() {
        return (1 << (this.f14166l & 31)) - 1;
    }

    public int tapsense(Object obj) {
        if (ads()) {
            return -1;
        }
        int iAdcel = AbstractC2387l.adcel(obj);
        int iSubscription = subscription();
        Object obj2 = this.f14160l;
        Objects.requireNonNull(obj2);
        int iAds = AbstractC16431l.ads(iAdcel & iSubscription, obj2);
        if (iAds != 0) {
            int i = ~iSubscription;
            int i2 = iAdcel & i;
            do {
                int i3 = iAds - 1;
                int i4 = remoteconfig()[i3];
                if ((i4 & i) == i2 && AbstractC7574l.firebase(obj, vip()[i3])) {
                    return i3;
                }
                iAds = i4 & iSubscription;
            } while (iAds != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.f14161l) {
            case 0:
                C9897l c9897l = (C9897l) this.f14162l;
                if (c9897l != null) {
                    return c9897l;
                }
                C9897l c9897l2 = new C9897l(2, this);
                this.f14162l = c9897l2;
                return c9897l2;
            default:
                C9897l c9897l3 = (C9897l) this.f14162l;
                if (c9897l3 != null) {
                    return c9897l3;
                }
                C9897l c9897l4 = new C9897l(4, this);
                this.f14162l = c9897l4;
                return c9897l4;
        }
    }

    public Object[] vip() {
        Object[] objArr = this.f14164l;
        Objects.requireNonNull(objArr);
        return objArr;
    }
}
