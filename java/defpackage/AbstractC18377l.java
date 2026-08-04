package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: l٘ۧۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18377l {
    public static int adcel(int i, byte[] bArr, int i2, int i3, C10096l c10096l, C16292l c16292l) throws C9893l {
        if ((i >>> 3) == 0) {
            C11586l.admob("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iMopub = mopub(bArr, i2, c16292l);
            c10096l.amazon(i, Long.valueOf(c16292l.loadAd));
            return iMopub;
        }
        if (i4 == 1) {
            c10096l.amazon(i, Long.valueOf(subs(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iPurchase = purchase(bArr, i2, c16292l);
            int i5 = c16292l.yandex;
            if (i5 < 0) {
                C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iPurchase) {
                C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                c10096l.amazon(i, AbstractC15619l.f30516l);
            } else {
                c10096l.amazon(i, AbstractC15619l.vip(iPurchase, i5, bArr));
            }
            return iPurchase + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                c10096l.amazon(i, Integer.valueOf(admob(i2, bArr)));
                return i2 + 4;
            }
            C11586l.admob("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        C10096l c10096lYandex = C10096l.yandex();
        int i7 = c16292l.amazon + 1;
        c16292l.amazon = i7;
        if (i7 >= 100) {
            C11586l.admob("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iPurchase2 = purchase(bArr, i2, c16292l);
            int i9 = c16292l.yandex;
            if (i9 == i6) {
                i8 = i9;
                i2 = iPurchase2;
                break;
            }
            i2 = adcel(i9, bArr, iPurchase2, i3, c10096lYandex, c16292l);
            i8 = i9;
        }
        c16292l.amazon--;
        if (i2 > i3 || i8 != i6) {
            C11586l.admob("Failed to parse the message.");
            return 0;
        }
        c10096l.amazon(i, c10096lYandex);
        return i2;
    }

    public static int admob(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int ads(int i, byte[] bArr, int i2, int i3, C16292l c16292l) throws C9893l {
        if ((i >>> 3) == 0) {
            C11586l.admob("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return mopub(bArr, i2, c16292l);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return purchase(bArr, i2, c16292l) + c16292l.yandex;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            C11586l.admob("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = purchase(bArr, i2, c16292l);
            i6 = c16292l.yandex;
            if (i6 == i5) {
                break;
            }
            i2 = ads(i6, bArr, i2, i3, c16292l);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        C11586l.admob("Failed to parse the message.");
        return 0;
    }

    public static final InterfaceC17242l amazon(InterfaceC17242l interfaceC17242l, InterfaceC17955l interfaceC17955l, EnumC7283l enumC7283l, C10306l c10306l, boolean z, InterfaceC14745l interfaceC14745l, C2403l c2403l, C12849l c12849l) {
        EnumC7283l enumC7283l2 = EnumC7283l.f15126l;
        C4346l c4346l = C4346l.f8873l;
        return interfaceC17242l.premium(enumC7283l == enumC7283l2 ? AbstractC0019l.crashlytics(c4346l, C9946l.crashlytics) : AbstractC0019l.crashlytics(c4346l, C9946l.loadAd)).premium(new C3907l(c10306l, c12849l, interfaceC14745l, c2403l, enumC7283l, interfaceC17955l, z, false));
    }

    public static int billing(int i, byte[] bArr, int i2, C16292l c16292l) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c16292l.yandex = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c16292l.yandex = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c16292l.yandex = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c16292l.yandex = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c16292l.yandex = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static final Drawable crashlytics(Context context, int i) {
        Drawable drawableLoadAd = AbstractC13273l.loadAd(context, i);
        if (drawableLoadAd != null) {
            return drawableLoadAd;
        }
        C8936l.subs(AbstractC0653l.vip(i, "Invalid resource ID: "));
        return null;
    }

    public static int firebase(byte[] bArr, int i, C16292l c16292l) throws C9893l {
        int iPurchase = purchase(bArr, i, c16292l);
        int i2 = c16292l.yandex;
        if (i2 < 0) {
            C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iPurchase) {
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            c16292l.crashlytics = AbstractC15619l.f30516l;
            return iPurchase;
        }
        c16292l.crashlytics = AbstractC15619l.vip(iPurchase, i2, bArr);
        return iPurchase + i2;
    }

    public static int isPro(byte[] bArr, int i, C16292l c16292l) throws C9893l {
        int iPurchase = purchase(bArr, i, c16292l);
        int i2 = c16292l.yandex;
        if (i2 < 0) {
            C11586l.admob("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            c16292l.crashlytics = "";
            return iPurchase;
        }
        c16292l.crashlytics = AbstractC13388l.amazon(iPurchase, i2, bArr);
        return iPurchase + i2;
    }

    public static C1453l loadAd(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            C1453l c1453l = new C1453l();
            new LinkedHashMap();
            c1453l.yandex = new C3557l(C14054l.f27396l);
            return c1453l;
        }
        bundle.setClassLoader(C1453l.class.getClassLoader());
        C17963l c17963l = new C17963l(bundle.size());
        for (String str : bundle.keySet()) {
            c17963l.put(str, bundle.get(str));
        }
        C17963l c17963lCrashlytics = c17963l.crashlytics();
        C1453l c1453l2 = new C1453l();
        new LinkedHashMap();
        c1453l2.yandex = new C3557l(c17963lCrashlytics);
        return c1453l2;
    }

    public static int metrica(byte[] bArr, int i, InterfaceC9971l interfaceC9971l, C16292l c16292l) throws C9893l {
        C12405l c12405l = (C12405l) interfaceC9971l;
        int iPurchase = purchase(bArr, i, c16292l);
        int i2 = c16292l.yandex + iPurchase;
        while (iPurchase < i2) {
            iPurchase = purchase(bArr, iPurchase, c16292l);
            c12405l.admob(c16292l.yandex);
        }
        if (iPurchase == i2) {
            return iPurchase;
        }
        C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int mopub(byte[] bArr, int i, C16292l c16292l) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c16292l.loadAd = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c16292l.loadAd = j2;
        return i3;
    }

    public static int purchase(byte[] bArr, int i, C16292l c16292l) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return billing(b, bArr, i2, c16292l);
        }
        c16292l.yandex = b;
        return i2;
    }

    public static int remoteconfig(Object obj, InterfaceC12940l interfaceC12940l, byte[] bArr, int i, int i2, int i3, C16292l c16292l) throws C9893l {
        C3661l c3661l = (C3661l) interfaceC12940l;
        int i4 = c16292l.amazon + 1;
        c16292l.amazon = i4;
        if (i4 >= 100) {
            C11586l.admob("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iAd = c3661l.ad(obj, bArr, i, i2, i3, c16292l);
        c16292l.amazon--;
        c16292l.crashlytics = obj;
        return iAd;
    }

    public static int smaato(Object obj, InterfaceC12940l interfaceC12940l, byte[] bArr, int i, int i2, C16292l c16292l) throws C9893l {
        int iBilling = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iBilling = billing(i3, bArr, iBilling, c16292l);
            i3 = c16292l.yandex;
        }
        int i4 = iBilling;
        if (i3 < 0 || i3 > i2 - i4) {
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = c16292l.amazon + 1;
        c16292l.amazon = i5;
        if (i5 >= 100) {
            C11586l.admob("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        interfaceC12940l.billing(obj, bArr, i4, i6, c16292l);
        c16292l.amazon--;
        c16292l.crashlytics = obj;
        return i6;
    }

    public static int startapp(InterfaceC12940l interfaceC12940l, int i, byte[] bArr, int i2, int i3, InterfaceC9971l interfaceC9971l, C16292l c16292l) throws C9893l {
        AbstractC0288l abstractC0288lZza = interfaceC12940l.zza();
        InterfaceC12940l interfaceC12940l2 = interfaceC12940l;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C16292l c16292l2 = c16292l;
        int iSmaato = smaato(abstractC0288lZza, interfaceC12940l2, bArr2, i2, i4, c16292l2);
        interfaceC12940l2.loadAd(abstractC0288lZza);
        c16292l2.crashlytics = abstractC0288lZza;
        interfaceC9971l.add(abstractC0288lZza);
        while (iSmaato < i4) {
            C16292l c16292l3 = c16292l2;
            int i5 = i4;
            int iPurchase = purchase(bArr2, iSmaato, c16292l3);
            if (i != c16292l3.yandex) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC12940l interfaceC12940l3 = interfaceC12940l2;
            AbstractC0288l abstractC0288lZza2 = interfaceC12940l3.zza();
            iSmaato = smaato(abstractC0288lZza2, interfaceC12940l3, bArr3, iPurchase, i5, c16292l3);
            interfaceC12940l2 = interfaceC12940l3;
            bArr2 = bArr3;
            i4 = i5;
            c16292l2 = c16292l3;
            interfaceC12940l2.loadAd(abstractC0288lZza2);
            c16292l2.crashlytics = abstractC0288lZza2;
            interfaceC9971l.add(abstractC0288lZza2);
        }
        return iSmaato;
    }

    public static long subs(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int vip(int i, byte[] bArr, int i2, int i3, InterfaceC9971l interfaceC9971l, C16292l c16292l) {
        C12405l c12405l = (C12405l) interfaceC9971l;
        int iPurchase = purchase(bArr, i2, c16292l);
        c12405l.admob(c16292l.yandex);
        while (iPurchase < i3) {
            int iPurchase2 = purchase(bArr, iPurchase, c16292l);
            if (i != c16292l.yandex) {
                break;
            }
            iPurchase = purchase(bArr, iPurchase2, c16292l);
            c12405l.admob(c16292l.yandex);
        }
        return iPurchase;
    }

    public static final void yandex(Function0 function0, InterfaceC17242l interfaceC17242l, C14541l c14541l, InterfaceC2948l interfaceC2948l, C6956l c6956l, int i) {
        c6956l.m2133new(1055276397);
        int i2 = (c6956l.admob(function0) ? 4 : 2) | i | (c6956l.billing(interfaceC17242l) ? 32 : 16) | (c6956l.billing(c14541l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(interfaceC2948l) ? 2048 : 1024);
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            AbstractC9831l.yandex(AbstractC14566l.amazon(-933153643, new C11223l(c14541l, interfaceC17242l, interfaceC2948l, AbstractC8020l.vip(function0, c6956l), 0), c6956l), c6956l, 6);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(function0, interfaceC17242l, c14541l, interfaceC2948l, i, 7);
        }
    }
}
