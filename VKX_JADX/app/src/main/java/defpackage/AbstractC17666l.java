package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l٘ؕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC17666l {
    public static final /* synthetic */ int yandex = 0;

    static {
        C6916l c6916l = InterfaceC4089l.premium;
    }

    public static int amazon(InterfaceC4089l interfaceC4089l) {
        return ((Integer) interfaceC4089l.adcel(InterfaceC4089l.premium)).intValue();
    }

    public static void billing(InterfaceC4089l interfaceC4089l) {
        boolean zMo1482continue = interfaceC4089l.mo1482continue();
        boolean z = interfaceC4089l.mo1487volatile() != null;
        if (zMo1482continue && z) {
            C8339l.metrica("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (interfaceC4089l.ad() != null) {
            if (zMo1482continue || z) {
                C8339l.metrica("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    public static int crashlytics(InterfaceC4089l interfaceC4089l) {
        return ((Integer) interfaceC4089l.smaato(InterfaceC4089l.inmobi, -1)).intValue();
    }

    public static ArrayList loadAd(InterfaceC4089l interfaceC4089l) {
        List list = (List) interfaceC4089l.smaato(InterfaceC4089l.f8422native, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static int purchase(InterfaceC4089l interfaceC4089l, int i) {
        return ((Integer) interfaceC4089l.smaato(InterfaceC4089l.applovin, Integer.valueOf(i))).intValue();
    }

    public static int yandex(InterfaceC4089l interfaceC4089l) {
        return ((Integer) interfaceC4089l.smaato(InterfaceC4089l.appmetrica, -1)).intValue();
    }
}
