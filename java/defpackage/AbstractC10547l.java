package defpackage;

import android.view.inputmethod.ExtractedText;
import android.widget.RemoteViews;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَۙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10547l {
    public static final C0941l yandex = new C0941l();

    public static final ExtractedText amazon(C0639l c0639l) {
        ExtractedText extractedText = new ExtractedText();
        String str = c0639l.yandex.f7563l;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c0639l.loadAd;
        extractedText.selectionStart = C12814l.mopub(j);
        extractedText.selectionEnd = C12814l.billing(j);
        extractedText.flags = !AbstractC12024l.inmobi(c0639l.yandex.f7563l, '\n') ? 1 : 0;
        return extractedText;
    }

    public static int billing(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static final int crashlytics(RemoteViews remoteViews, C4372l c4372l, int i, int i2, Integer num) {
        int iIntValue;
        if (i == -1) {
            C8339l.metrica("viewStubId must not be View.NO_ID");
            return 0;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int iIncrementAndGet = c4372l.mopub.incrementAndGet();
            if (iIncrementAndGet >= AbstractC4468l.isPro) {
                C8339l.smaato("There are too many views");
                return 0;
            }
            iIntValue = iIncrementAndGet + AbstractC4468l.subs;
        }
        if (iIntValue != -1) {
            remoteViews.setInt(i, "setInflatedId", iIntValue);
        }
        if (i2 != 0) {
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return iIntValue;
    }

    public static final void loadAd(C15578l c15578l, C15578l c15578l2, InterfaceC17242l interfaceC17242l, C15578l c15578l3, Function2 function2, C8127l c8127l, C2403l c2403l, C6956l c6956l, int i) {
        C15578l c15578l4;
        Function2 function3;
        C8127l c8127l2;
        C2403l c2403l2;
        C8127l c8127l3;
        C2403l c2403l3;
        Function2 function4;
        long j;
        c6956l.m2133new(-461880444);
        int i2 = i | 1662976;
        if (c6956l.m2127for(i2 & 1, (599187 & i2) != 599186)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                long jPurchase = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).purchase();
                c8127l3 = new C8127l(jPurchase, jPurchase, jPurchase);
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                c2403l3 = (C2403l) objM2132native;
                function4 = AbstractC9679l.yandex;
            } else {
                c6956l.m2124else();
                function4 = function2;
                c8127l3 = c8127l;
                c2403l3 = c2403l;
            }
            c6956l.adcel();
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC8317l.loadAd(c2403l3, c6956l, 6);
            InterfaceC8714l interfaceC8714lCrashlytics = C10053l.crashlytics(c2403l3, c6956l, 6);
            C15089l c15089l = C18450l.f36046l;
            C11485l c11485l = AbstractC8313l.crashlytics;
            C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, c15089l, c6956l, 0);
            long j2 = c6956l.f14595continue;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.crashlytics(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C7219l.yandex, false);
            long j3 = c6956l.f14595continue;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, C4346l.f8873l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC8182l.crashlytics(c6956l, Integer.valueOf(i4), c6415l3);
            AbstractC8182l.purchase(c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            c15578l4 = c15578l;
            c15578l4.invoke(c2403l3, c6956l, 54);
            c6956l.startapp(true);
            C15089l c15089l2 = C18450l.f36034l;
            C14020l c14020l = new C14020l(c15089l2);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, c15089l2, c6956l, 48);
            Function2 function5 = function4;
            long j4 = c6956l.f14595continue;
            int i5 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, c14020l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC8182l.crashlytics(c6956l, Integer.valueOf(i5), c6415l3);
            AbstractC8182l.purchase(c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            boolean zBooleanValue = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue();
            if (zBooleanValue) {
                j = c8127l3.loadAd;
            } else {
                j = zBooleanValue2 ? c8127l3.crashlytics : c8127l3.yandex;
            }
            yandex(c15578l2, c15578l3, function5, j, c6956l, 438);
            c6956l.startapp(true);
            c6956l.startapp(true);
            function3 = function5;
            c8127l2 = c8127l3;
            c2403l2 = c2403l3;
        } else {
            c15578l4 = c15578l;
            c6956l.m2124else();
            function3 = function2;
            c8127l2 = c8127l;
            c2403l2 = c2403l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11191l(c15578l4, c15578l2, interfaceC17242l, c15578l3, function3, c8127l2, c2403l2, i);
        }
    }

    public static int purchase(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static final void yandex(C15578l c15578l, C15578l c15578l2, Function2 function2, long j, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(1541076188);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c15578l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.purchase(j) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            AbstractC10478l.yandex(AbstractC5020l.startapp(j, AbstractC1017l.yandex), AbstractC14566l.amazon(1615845788, new C2719l(c15578l, c15578l2, function2), c6956l), c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3409l(c15578l, c15578l2, function2, j, i);
        }
    }
}
