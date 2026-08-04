package defpackage;

import android.content.SharedPreferences;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3957l {
    public static SharedPreferences amazon;
    public static SharedPreferences billing;
    public static SharedPreferences purchase;
    public static final C15578l yandex = new C15578l(901218053, false, new C8337l(4));
    public static final C15578l loadAd = new C15578l(-1883788314, false, new C8337l(5));
    public static final C15578l crashlytics = new C15578l(-419264916, false, new C8337l(6));

    public static final boolean amazon(InterfaceC9708l interfaceC9708l) {
        if (interfaceC9708l instanceof C11181l) {
            return true;
        }
        if (!(interfaceC9708l instanceof AbstractC11563l)) {
            return false;
        }
        ArrayList arrayList = ((AbstractC11563l) interfaceC9708l).loadAd;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (amazon((InterfaceC9708l) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean crashlytics(byte b) {
        return b > -65;
    }

    public static final boolean loadAd(C7615l c7615l, String str) throws C7410l {
        if (AbstractC8576l.yandex(Build.FINGERPRINT, "robolectric")) {
            if (!AbstractC5088l.firebase("CXCP")) {
                return true;
            }
            Log.d("CXCP", "isBackwardCompatible method returns true because robolectric build detected.");
            return true;
        }
        try {
            C10160l.yandex(str);
            int[] iArr = (int[]) ((C10861l) AbstractC14814l.amazon(c7615l, str)).crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                return AbstractC8669l.tapsense(iArr, 0);
            }
            return false;
        } catch (CameraAccessException e) {
            if (AbstractC5088l.smaato()) {
                Log.e("CXCP", "Error while accessing metadata for cameraID: ".concat(str), e);
            }
            throw new C7410l(e);
        }
    }

    public static final void yandex(C6956l c6956l, int i) {
        c6956l.m2133new(1257244356);
        if (i == 0 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = C1911l.f4368l;
                c6956l.m2147try(objM2132native);
            }
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
            c6956l.m2125final(-1115894518);
            c6956l.m2125final(1886828752);
            if (!(c6956l.yandex instanceof C2416l)) {
                AbstractC8238l.amazon();
                throw null;
            }
            c6956l.m2131interface();
            if (c6956l.f14603switch) {
                c6956l.firebase(new C9632l(1, function0));
            } else {
                c6956l.m2136protected();
            }
            AbstractC12900l.ads(c6956l, true, false, false);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12513l(i);
        }
    }
}
