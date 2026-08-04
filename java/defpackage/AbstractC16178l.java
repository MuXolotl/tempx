package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٖؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16178l implements InterfaceC7922l {
    public static final C0518l yandex = new C0518l(0);
    public static final C0518l loadAd = new C0518l(1);

    public final void amazon(C7972l c7972l, Object obj, HashMap map) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            InterfaceC3189l interfaceC3189l = (InterfaceC3189l) entry.getValue();
            String str = (String) entry.getKey();
            if (interfaceC3189l.loadAd(obj)) {
                String strYandex = interfaceC3189l.yandex(obj);
                sb.append(str);
                sb.append("=");
                sb.append(strYandex);
                sb.append(AbstractC6052l.loadAd);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        c7972l.m2225const(loadAd(), sb.toString());
    }

    public abstract boolean crashlytics();

    public abstract String loadAd();

    @Override // defpackage.InterfaceC7922l
    public void yandex(C7972l c7972l, C2434l c2434l) {
        if (crashlytics()) {
            return;
        }
        c7972l.m2231implements(loadAd());
    }
}
