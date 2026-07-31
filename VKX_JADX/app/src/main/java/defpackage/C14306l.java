package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lٓٞٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14306l {
    public boolean loadAd;
    public final C2902l yandex = C2902l.billing();

    static {
        new C14306l(0);
    }

    public C14306l(int i) {
        loadAd();
        loadAd();
    }

    public static void crashlytics(C10107l c10107l, EnumC3932l enumC3932l, int i, Object obj) {
        if (enumC3932l == EnumC3932l.f8106l) {
            c10107l.signatures(i, 3);
            ((AbstractC8760l) ((AbstractC1200l) obj)).smaato(c10107l);
            c10107l.signatures(i, 4);
        }
        c10107l.signatures(i, enumC3932l.f8108l);
        switch (enumC3932l.ordinal()) {
            case 0:
                c10107l.Signature(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c10107l.subscription(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c10107l.inmobi(((Long) obj).longValue());
                break;
            case 3:
                c10107l.inmobi(((Long) obj).longValue());
                break;
            case 4:
                c10107l.pro(((Integer) obj).intValue());
                break;
            case 5:
                c10107l.Signature(((Long) obj).longValue());
                break;
            case 6:
                c10107l.subscription(((Integer) obj).intValue());
                break;
            case 7:
                c10107l.remoteconfig(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C4966l)) {
                    c10107l.isVip((String) obj);
                } else {
                    c10107l.adcel((C4966l) obj);
                }
                break;
            case 9:
                ((AbstractC8760l) ((AbstractC1200l) obj)).smaato(c10107l);
                break;
            case 10:
                AbstractC1200l abstractC1200l = (AbstractC1200l) obj;
                c10107l.applovin(((AbstractC8760l) abstractC1200l).yandex(null));
                ((AbstractC8760l) abstractC1200l).smaato(c10107l);
                break;
            case 11:
                if (!(obj instanceof C4966l)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c10107l.applovin(length);
                    c10107l.vip(bArr, 0, length);
                } else {
                    c10107l.adcel((C4966l) obj);
                }
                break;
            case 12:
                c10107l.applovin(((Integer) obj).intValue());
                break;
            case 13:
                c10107l.pro(((Integer) obj).intValue());
                break;
            case 14:
                c10107l.subscription(((Integer) obj).intValue());
                break;
            case 15:
                c10107l.Signature(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c10107l.applovin((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                c10107l.inmobi((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public static int yandex(EnumC3932l enumC3932l, int i, Object obj) {
        int size;
        int iSubs;
        int iAdmob = C10107l.admob(i);
        if (enumC3932l == EnumC3932l.f8106l) {
            iAdmob *= 2;
        }
        int iIsPro = 1;
        switch (enumC3932l.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = C10107l.billing;
                iIsPro = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = C10107l.billing;
                iIsPro = 4;
                break;
            case 2:
                iIsPro = C10107l.isPro(((Long) obj).longValue());
                break;
            case 3:
                iIsPro = C10107l.isPro(((Long) obj).longValue());
                break;
            case 4:
                iIsPro = C10107l.isPro(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = C10107l.billing;
                iIsPro = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = C10107l.billing;
                iIsPro = 4;
                break;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = C10107l.billing;
                break;
            case 8:
                if (!(obj instanceof C4966l)) {
                    iIsPro = C10107l.mopub((String) obj);
                } else {
                    Logger logger6 = C10107l.billing;
                    size = ((C4966l) obj).size();
                    iSubs = C10107l.subs(size);
                    iIsPro = iSubs + size;
                }
                break;
            case 9:
                iIsPro = ((AbstractC8760l) ((AbstractC1200l) obj)).yandex(null);
                break;
            case 10:
                Logger logger7 = C10107l.billing;
                size = ((AbstractC8760l) ((AbstractC1200l) obj)).yandex(null);
                iSubs = C10107l.subs(size);
                iIsPro = iSubs + size;
                break;
            case 11:
                if (obj instanceof C4966l) {
                    Logger logger8 = C10107l.billing;
                    size = ((C4966l) obj).size();
                    iSubs = C10107l.subs(size);
                } else {
                    Logger logger9 = C10107l.billing;
                    size = ((byte[]) obj).length;
                    iSubs = C10107l.subs(size);
                }
                iIsPro = iSubs + size;
                break;
            case 12:
                iIsPro = C10107l.subs(((Integer) obj).intValue());
                break;
            case 13:
                iIsPro = C10107l.isPro(((Integer) obj).intValue());
                break;
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = C10107l.billing;
                iIsPro = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = C10107l.billing;
                iIsPro = 8;
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iIsPro = C10107l.subs((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                iIsPro = C10107l.isPro((jLongValue << 1) ^ (jLongValue >> 63));
                break;
            default:
                C18073l.license("There is no way to get here, but the compiler thinks otherwise.");
                iIsPro = 0;
                break;
        }
        return iIsPro + iAdmob;
    }

    public final Object clone() {
        C14306l c14306l = new C14306l();
        C2902l c2902l = this.yandex;
        if (c2902l.f6308l > 0) {
            c2902l.crashlytics(0).f18639l.getClass();
            C18725l.loadAd();
            return null;
        }
        Iterator it = c2902l.amazon().iterator();
        if (!it.hasNext()) {
            return c14306l;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            C18725l.loadAd();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14306l) {
            return this.yandex.equals(((C14306l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final void loadAd() {
        if (this.loadAd) {
            return;
        }
        C2902l c2902l = this.yandex;
        int i = c2902l.f6308l;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c2902l.crashlytics(i2).f18638l;
            if (obj instanceof AbstractC8760l) {
                ((AbstractC8760l) obj).mopub();
            }
        }
        Iterator it = c2902l.amazon().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC8760l) {
                ((AbstractC8760l) value).mopub();
            }
        }
        if (!c2902l.f6311l) {
            if (c2902l.f6308l > 0) {
                c2902l.crashlytics(0).f18639l.getClass();
                C18725l.loadAd();
                return;
            } else {
                Iterator it2 = c2902l.amazon().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    C18725l.loadAd();
                    return;
                }
            }
        }
        if (!c2902l.f6311l) {
            c2902l.f6307l = c2902l.f6307l.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c2902l.f6307l);
            c2902l.f6312l = c2902l.f6312l.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c2902l.f6312l);
            c2902l.f6311l = true;
        }
        this.loadAd = true;
    }

    public C14306l() {
    }
}
