package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؓۚؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2094l {
    public static final C8688l yandex = new C8688l(new C8241l(7));
    public static final C8688l loadAd = new C8688l(new C8241l(8));

    public static ArrayList loadAd(InterfaceC5389l interfaceC5389l, int i) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            Object objCrashlytics = ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION);
            if (objCrashlytics == null) {
                C8339l.metrica("Required value was null.");
                return null;
            }
            int iIntValue = ((Number) objCrashlytics).intValue();
            if (iIntValue >= 35 && i != 3) {
                arrayList.addAll((List) yandex.getValue());
            }
            if (iIntValue >= 36 && i != 4) {
                arrayList.addAll((List) loadAd.getValue());
                return arrayList;
            }
        }
        return arrayList;
    }

    public static ArrayList yandex(EnumC7005l enumC7005l, EnumC7005l enumC7005l2) {
        ArrayList arrayList = new ArrayList();
        C13476l c13476l = new C13476l();
        EnumC18632l enumC18632l = C2483l.purchase;
        EnumC13290l enumC13290l = EnumC13290l.f26074l;
        c13476l.yandex(C2582l.tapsense(enumC13290l, enumC7005l));
        C13476l c13476lMetrica = AbstractC2812l.metrica(EnumC13290l.f26072l, enumC7005l2, c13476l, arrayList, c13476l);
        c13476lMetrica.yandex(C2582l.tapsense(enumC13290l, enumC7005l));
        c13476lMetrica.yandex(C2582l.tapsense(EnumC13290l.f26076l, enumC7005l2));
        arrayList.add(c13476lMetrica);
        return arrayList;
    }
}
