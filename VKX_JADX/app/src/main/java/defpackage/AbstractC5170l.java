package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؗۜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5170l {
    public static final C15578l yandex = new C15578l(-994594703, false, new C11902l(25));
    public static final C15578l loadAd = new C15578l(762815636, false, new C11902l(26));
    public static final C15578l crashlytics = new C15578l(-755019677, false, new C11902l(27));
    public static final C15578l amazon = new C15578l(1957084782, false, new C11891l(11));
    public static final C15578l purchase = new C15578l(497011419, false, new C10673l(14));
    public static final C15578l billing = new C15578l(-243495218, false, new C10673l(15));

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC18041l amazon(AbstractC18041l abstractC18041l) {
        if (abstractC18041l instanceof InterfaceC2708l) {
            return ((InterfaceC2708l) abstractC18041l).mopub();
        }
        return null;
    }

    public static byte[] crashlytics(int i, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i2 = 1;
        byte[] bArrAmazon = AbstractC17265l.amazon(bArr, bArr2);
        Mac mac = (Mac) C12437l.crashlytics.yandex.appmetrica(str);
        if (i > mac.getMacLength() * 255) {
            C18262l.ads("size too large");
            return null;
        }
        if (bArr3 == null || bArr3.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr3, str));
        }
        byte[] bArr4 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(bArrAmazon), str));
        byte[] bArrDoFinal = new byte[0];
        int length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update((byte[]) null);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr4, length, i - length);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i2++;
        }
    }

    public static final void loadAd(InterfaceC9354l interfaceC9354l) {
        interfaceC9354l.yandex(new IOException("Channel was cancelled"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC14318l purchase(AbstractC14318l abstractC14318l, AbstractC18041l abstractC18041l) {
        if (abstractC14318l instanceof InterfaceC2708l) {
            return purchase(((InterfaceC2708l) abstractC14318l).appmetrica(), abstractC18041l);
        }
        if (abstractC18041l == null || abstractC18041l.equals(abstractC14318l)) {
            return abstractC14318l;
        }
        if (abstractC14318l instanceof AbstractC15211l) {
            return new C7287l((AbstractC15211l) abstractC14318l, abstractC18041l);
        }
        if (abstractC14318l instanceof AbstractC4317l) {
            return new C1643l((AbstractC4317l) abstractC14318l, abstractC18041l);
        }
        C18725l.billing();
        return null;
    }

    public static final void yandex(int i, C6956l c6956l, InterfaceC17242l interfaceC17242l, Function0 function0, Function0 function1) {
        InterfaceC17242l interfaceC17242l2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1519463979);
        int i2 = i | 6 | (c6956l2.admob(function0) ? 32 : 16) | (c6956l2.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i3 = (int) ((j >>> 32) ^ j);
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
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
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            if (1.0f <= 0.0d) {
                AbstractC10440l.yandex("invalid weight; must be greater than zero");
            }
            C9247l c9247l = new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C6839l c6839l = AbstractC13106l.billing(c6956l2).crashlytics;
            C17253l c17253l = C12719l.yandex;
            AbstractC17457l.loadAd(function0, c9247l, false, c6839l, C12719l.yandex(AbstractC13106l.purchase(c6956l2).adcel, AbstractC13106l.purchase(c6956l2).license, 0L, 0L, c6956l2, 12), null, null, AbstractC3605l.loadAd(0.0f, 8.0f, 1), AbstractC14412l.yandex, c6956l, ((i2 >> 3) & 14) | 817889280, 356);
            if (1.0f <= 0.0d) {
                AbstractC10440l.yandex("invalid weight; must be greater than zero");
            }
            AbstractC17457l.loadAd(function1, new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC13106l.billing(c6956l).crashlytics, C12719l.yandex(AbstractC13106l.purchase(c6956l).startapp, AbstractC13106l.purchase(c6956l).adcel, 0L, 0L, c6956l, 12), null, null, AbstractC3605l.loadAd(0.0f, 8.0f, 1), AbstractC14412l.loadAd, c6956l, ((i2 >> 6) & 14) | 817889280, 356);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            interfaceC17242l2 = c4346l;
        } else {
            c6956l2.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l(interfaceC17242l2, function0, function1, i, 28);
        }
    }
}
