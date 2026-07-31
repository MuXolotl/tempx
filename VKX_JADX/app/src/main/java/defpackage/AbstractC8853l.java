package defpackage;

import android.os.Build;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌُ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8853l {
    public static final C15578l yandex = new C15578l(-610545491, false, new C2834l(1));
    public static final C15578l loadAd = new C15578l(1680955756, false, new C2834l(2));

    public static final int[] amazon(int i, List list) {
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = AbstractC12953l.startapp(((C9735l) list.get(i3)).yandex);
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int iSmaato = AbstractC14055l.smaato(list);
        int size2 = list.size();
        int i4 = 0;
        while (i3 < size2) {
            long j = ((C9735l) list.get(i3)).yandex;
            if (C9735l.amazon(j) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = AbstractC12953l.startapp(C9735l.loadAd(0.0f, ((C9735l) list.get(1)).yandex));
                } else if (i3 == iSmaato) {
                    i2 = i4 + 1;
                    iArr2[i4] = AbstractC12953l.startapp(C9735l.loadAd(0.0f, ((C9735l) list.get(i3 - 1)).yandex));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = AbstractC12953l.startapp(C9735l.loadAd(0.0f, ((C9735l) list.get(i3 - 1)).yandex));
                    i4 += 2;
                    iArr2[i5] = AbstractC12953l.startapp(C9735l.loadAd(0.0f, ((C9735l) list.get(i3 + 1)).yandex));
                }
                i4 = i2;
            } else {
                iArr2[i4] = AbstractC12953l.startapp(j);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    public static boolean billing(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final int crashlytics(List list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iSmaato = AbstractC14055l.smaato(list);
        for (int i2 = 1; i2 < iSmaato; i2++) {
            if (C9735l.amazon(((C9735l) list.get(i2)).yandex) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] loadAd(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static final void mopub(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            C8339l.metrica("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            C8339l.metrica("colors and colorStops arguments must have equal length.");
        }
    }

    public static final float[] purchase(int i, List list, List list2) {
        if (i == 0) {
            if (list != null) {
                return AbstractC16901l.m4249while(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int iSmaato = AbstractC14055l.smaato(list2);
        int i2 = 1;
        for (int i3 = 1; i3 < iSmaato; i3++) {
            long j = ((C9735l) list2.get(i3)).yandex;
            float fFloatValue = list != null ? ((Number) list.get(i3)).floatValue() : i3 / AbstractC14055l.smaato(list2);
            int i4 = i2 + 1;
            fArr[i2] = fFloatValue;
            if (C9735l.amazon(j) == 0.0f) {
                i2 += 2;
                fArr[i4] = fFloatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? ((Number) list.get(AbstractC14055l.smaato(list2))).floatValue() : 1.0f;
        return fArr;
    }

    public static final void yandex(int i, String str, Function0 function0, C6956l c6956l, int i2) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-770821719);
        int i3 = i2 | (c6956l2.amazon(i) ? 4 : 2) | (c6956l2.billing(str) ? 32 : 16) | (c6956l2.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i3 & 1, (i3 & 147) != 146)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC3605l.remoteconfig(AbstractC9151l.loadAd(c4346l, false, null, function0, 15), 16.0f, 12.0f), 1.0f);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l2, 48);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(i, i3 & 14, c6956l2);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.yandex, c6956l2, 56, 4);
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.vip(c4346l, 16.0f));
            AbstractC13010l.loadAd(str, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.yandex, AbstractC7039l.isPro(15), null, C6886l.f14425l, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, ((i3 >> 3) & 14) | 1597440, 0, 262058);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(i, str, function0, i2);
        }
    }
}
