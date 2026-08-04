package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍؘ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5578l {
    public static final C15578l yandex = new C15578l(1065684890, false, new C12851l(7));
    public static final C15578l loadAd = new C15578l(1735521689, false, new C12851l(8));
    public static final C15578l crashlytics = new C15578l(1198433816, false, new C8918l(7));

    public static C3890l amazon(Status status) {
        return status.f582l != null ? new C6707l(status) : new C3890l(status);
    }

    public static String billing(String str) {
        str.getClass();
        String name = new File(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    public static void crashlytics(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        C10754l.pro(file, "Unable to create parent directories of ");
    }

    public static final C8896l loadAd(AbstractC9601l abstractC9601l, int i, C4991l c4991l, C0327l c0327l, boolean z, int i2) {
        C8896l c8896lCrashlytics = c0327l != null ? c0327l.crashlytics(c4991l.loadAd.admob(i)) : C8896l.purchase;
        float f = c8896lCrashlytics.yandex;
        abstractC9601l.getClass();
        int iYandex = AbstractC9361l.yandex(abstractC9601l, 2.0f);
        return C8896l.loadAd(c8896lCrashlytics, z ? (i2 - f) - iYandex : f, z ? i2 - f : iYandex + f, 0.0f, 10);
    }

    public static String purchase(String str) {
        str.getClass();
        String name = new File(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
    }

    public static final void yandex(int i, int i2, C11362l c11362l, Function1 function1, Function0 function0, Function0 function2, Function1 function3, Function0 function4, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i3) {
        float f;
        C4346l c4346l;
        boolean z;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-356091971);
        int i4 = i3 | (c6956l2.amazon(i) ? 4 : 2) | (c6956l2.amazon(i2) ? 32 : 16) | (c6956l2.billing(c11362l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l2.admob(function1) ? 2048 : 1024) | (c6956l2.admob(function0) ? 16384 : 8192) | (c6956l2.admob(function2) ? 131072 : 65536) | (c6956l2.admob(function3) ? 1048576 : 524288) | (c6956l2.admob(function4) ? 8388608 : 4194304);
        if (c6956l2.m2127for(i4 & 1, (38347923 & i4) != 38347922)) {
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
            long j = c6956l2.f14595continue;
            int i5 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i5), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            boolean zIsEmpty = c11362l.isEmpty();
            C4346l c4346l2 = C4346l.f8873l;
            if (zIsEmpty) {
                f = 16.0f;
                c4346l = c4346l2;
                z = false;
                c6956l2.m2123default(1671736975);
            } else {
                c6956l2.m2123default(1673344046);
                C9247l c9247l = new C9247l(1.0f, false);
                boolean z2 = ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
                Object objM2132native = c6956l2.m2132native();
                if (z2 || objM2132native == C1867l.yandex) {
                    objM2132native = new C8854l(c11362l, function1, 12);
                    c6956l2.m2147try(objM2132native);
                }
                f = 16.0f;
                c4346l = c4346l2;
                AbstractC16336l.yandex(c9247l, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 510);
                c6956l2 = c6956l;
                AbstractC0555l.loadAd(AbstractC3605l.smaato(c4346l, 16.0f), 0.0f, ((C18718l) c6956l2.isPro(AbstractC5992l.yandex)).amazon, c6956l2, 6, 2);
                z = false;
            }
            c6956l2.startapp(z);
            int i6 = i4 >> 9;
            C6956l c6956l3 = c6956l2;
            AbstractC11173l.yandex(i, i2, function2, function3, function4, AbstractC3605l.vip(c4346l, 8.0f, 0.0f, 2), c6956l3, (i4 & 14) | 196608 | (i4 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344));
            C10707l c10707l = AbstractC5992l.yandex;
            AbstractC0555l.loadAd(AbstractC3605l.smaato(c4346l, f), 0.0f, ((C18718l) c6956l3.isPro(c10707l)).amazon, c6956l3, 6, 2);
            int i7 = AbstractC15548l.yandex;
            AbstractC13319l.yandex(AbstractC14770l.yandex, AbstractC9151l.loadAd(AbstractC0080l.amazon(c4346l, 1.0f), false, null, function0, 15), null, null, AbstractC14770l.loadAd, null, AbstractC15548l.yandex(C9735l.isPro, ((C18718l) c6956l3.isPro(c10707l)).yandex, ((C18718l) c6956l3.isPro(c10707l)).loadAd, 0L, c6956l3, 504), c6956l, 24582, 428);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4686l(i, i2, c11362l, function1, function0, function2, function3, function4, interfaceC17242l, i3);
        }
    }
}
