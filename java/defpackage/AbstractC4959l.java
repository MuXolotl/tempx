package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؗ٘ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4959l {
    public static final C15578l yandex = new C15578l(-1643941996, false, new C11112l(17));
    public static final C15578l loadAd = new C15578l(287183638, false, new C11112l(23));
    public static final C15578l crashlytics = new C15578l(-1844402534, false, new C14484l(26));
    public static final C15578l amazon = new C15578l(-878839717, false, new C14484l(17));
    public static final C15578l purchase = new C15578l(86723100, false, new C14484l(18));
    public static final C15578l billing = new C15578l(-1006554274, false, new C11112l(18));
    public static final C15578l mopub = new C15578l(-177090020, false, new C11112l(19));
    public static final C15578l admob = new C15578l(1933212406, false, new C11112l(20));
    public static final C15578l subs = new C15578l(2121518062, false, new C11112l(21));
    public static final C15578l isPro = new C15578l(47497260, false, new C11112l(22));
    public static final C15578l firebase = new C15578l(182570024, false, new C14484l(19));
    public static final C15578l smaato = new C15578l(-854440377, false, new C14484l(20));
    public static final C15578l remoteconfig = new C15578l(-1891450778, false, new C14484l(21));
    public static final C15578l vip = new C15578l(-78674513, false, new C14484l(22));
    public static final C15578l metrica = new C15578l(-996086774, false, new C14484l(23));
    public static final C15578l startapp = new C15578l(194878854, false, new C14484l(24));
    public static final C15578l adcel = new C15578l(-1269359481, false, new C14484l(25));

    public static final AbstractC2249l amazon(AbstractC2249l abstractC2249l) {
        AbstractC2249l abstractC2249lCrashlytics = abstractC2249l.crashlytics();
        int iLoadAd = abstractC2249lCrashlytics.loadAd();
        for (int i = 0; i < iLoadAd; i++) {
            abstractC2249lCrashlytics.purchase(i, abstractC2249l.yandex(i));
        }
        return abstractC2249lCrashlytics;
    }

    public static IOException crashlytics(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return loadAd(file, iOException);
        }
        if (!parentFile.exists()) {
            return loadAd(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? loadAd(file, iOException) : loadAd(file, iOException);
            }
            return parentFile.canWrite() ? loadAd(file, iOException) : loadAd(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? loadAd(file, iOException) : loadAd(file, iOException);
        }
        return parentFile.canWrite() ? loadAd(file, iOException) : loadAd(file, iOException);
    }

    public static IOException loadAd(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static final boolean purchase(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final void yandex(AbstractC18643l abstractC18643l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(1674006481);
        int i2 = (c6956l.billing(abstractC18643l) ? 4 : 2) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C7819l c7819lVip = null;
            if (abstractC18643l == null) {
                c6956l.m2123default(1462000977);
            } else {
                c6956l.m2123default(1462000978);
                c7819lVip = AbstractC15042l.vip(abstractC18643l, (Context) c6956l.isPro(AbstractC1242l.loadAd), 5, null);
            }
            c6956l.startapp(false);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C1306l(10);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC7477l.loadAd(interfaceC17242l, (Function1) objM2132native);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C1306l(11);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC7741l.amazon(c7819lVip, null, AbstractC14289l.firebase(interfaceC17242lLoadAd, (Function1) objM2132native2), C4176l.yandex, null, c6956l, 1572912, 1976);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9825l(abstractC18643l, interfaceC17242l, i, i3);
        }
    }
}
