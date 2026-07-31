package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lۣٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15269l {
    public static final C15578l yandex = new C15578l(142092563, false, new C7614l(13));
    public static final C15578l loadAd = new C15578l(-1389267306, false, new C7614l(14));
    public static final C15578l crashlytics = new C15578l(963590935, false, new C7614l(15));
    public static final C15578l amazon = new C15578l(604417226, false, new C7614l(16));
    public static final C15578l purchase = new C15578l(2141365645, false, new C7614l(17));
    public static final C15578l billing = new C15578l(-209629746, false, new C7614l(18));

    public static boolean amazon(int i, Context context, String str) {
        C3865l c3865lYandex = C16797l.yandex(context);
        c3865lYandex.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) c3865lYandex.yandex).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static void billing(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + i4;
            bArr2[i5] = (byte) (bArr2[i5] ^ bArr[i2 + i4]);
        }
    }

    public static InterfaceC17242l crashlytics(InterfaceC17242l interfaceC17242l, C17150l c17150l) {
        return interfaceC17242l.premium(new C4283l(c17150l));
    }

    public static boolean loadAd(Context context, int i) {
        if (amazon(i, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C12585l c12585lYandex = C12585l.yandex(context);
                c12585lYandex.getClass();
                if (packageInfo != null) {
                    if (!C12585l.crashlytics(packageInfo, false)) {
                        if (C12585l.crashlytics(packageInfo, true)) {
                            if (!AbstractC4197l.yandex(c12585lYandex.yandex)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static void mopub(byte[] bArr, int i, byte[] bArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i2]);
        }
    }

    public static void purchase(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i2 + i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
        }
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, C12818l c12818l, Function1 function1, C6956l c6956l, int i) {
        int i2;
        int i3;
        boolean z;
        c6956l.m2133new(-64133683);
        if (((i | (c6956l.billing(c12818l) ? 32 : 16) | (c6956l.billing(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128)) & 731) == 146 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            c6956l.m2125final(-492369756);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                i2 = 1;
                i3 = 3;
                objM2132native = C1083l.license(AbstractC14055l.remoteconfig(new C9735l(AbstractC12953l.amazon(4294901824L)), new C9735l(AbstractC12953l.amazon(4294902015L)), new C9735l(AbstractC12953l.amazon(4286578943L)), new C9735l(AbstractC12953l.amazon(4278190335L)), new C9735l(AbstractC12953l.amazon(4278223103L)), new C9735l(AbstractC12953l.amazon(4278255615L)), new C9735l(AbstractC12953l.amazon(4278255488L)), new C9735l(AbstractC12953l.amazon(4278255360L)), new C9735l(AbstractC12953l.amazon(4286643968L)), new C9735l(AbstractC12953l.amazon(4294967040L)), new C9735l(AbstractC12953l.amazon(4294934528L)), new C9735l(AbstractC12953l.amazon(4294901760L))), 0.0f, 0.0f, 14);
                c6956l.m2147try(objM2132native);
                z = false;
            } else {
                i2 = 1;
                i3 = 3;
                z = false;
            }
            c6956l.startapp(z);
            AbstractC9544l abstractC9544l = (AbstractC9544l) objM2132native;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(interfaceC17242l, 1.0f);
            Unit unit = Unit.INSTANCE;
            c6956l.m2125final(1157296644);
            boolean zBilling = c6956l.billing(function1);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == obj) {
                objM2132native2 = new C15908l(i3, null, function1);
                c6956l.m2147try(objM2132native2);
            }
            c6956l.startapp(false);
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242lCrashlytics.premium(new C8110l(unit, null, null, new C15463l((Function2) objM2132native2), 6));
            c6956l.m2125final(511388516);
            boolean zBilling2 = c6956l.billing(abstractC9544l) | c6956l.billing(c12818l);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling2 || objM2132native3 == obj) {
                objM2132native3 = new C7105l(abstractC9544l, c12818l, i2);
                c6956l.m2147try(objM2132native3);
            }
            c6956l.startapp(false);
            AbstractC12155l.yandex(interfaceC17242lPremium, (Function1) objM2132native3, c6956l, 0);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds == null) {
            return;
        }
        c4224lAds.amazon = new C3443l(interfaceC17242l, c12818l, function1, i, 1);
    }
}
