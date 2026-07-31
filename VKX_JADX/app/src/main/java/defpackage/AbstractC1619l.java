package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؓؖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1619l {
    public static final String yandex = C14513l.applovin("DiagnosticsWrkr");

    public static final String yandex(C10154l c10154l, C0480l c0480l, C7392l c7392l, List list) throws IOException {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7718l c7718l = (C7718l) it.next();
            C0350l c0350lIsPro = AbstractC3605l.isPro(c7718l);
            String str = c7718l.yandex;
            C11059l c11059l = (C11059l) AbstractC2021l.purchase(c7392l.yandex, true, false, new C5568l(c0350lIsPro.yandex, c0350lIsPro.loadAd, 1));
            Integer numValueOf = c11059l != null ? Integer.valueOf(c11059l.crashlytics) : null;
            String strM4210case = AbstractC16901l.m4210case((List) AbstractC2021l.purchase(c10154l.yandex, true, false, new C6908l(str, 23)), ",", null, null, null, 62);
            String strM4210case2 = AbstractC16901l.m4210case((List) AbstractC2021l.purchase(c0480l.yandex, true, false, new C6789l(str, 5)), ",", null, null, null, 62);
            StringBuilder sbIsVip = AbstractC5020l.isVip("\n", str, "\t ");
            sbIsVip.append(c7718l.crashlytics);
            sbIsVip.append("\t ");
            sbIsVip.append(numValueOf);
            sbIsVip.append("\t ");
            sbIsVip.append(c7718l.loadAd.name());
            sbIsVip.append("\t ");
            sbIsVip.append(strM4210case);
            sbIsVip.append("\t ");
            sbIsVip.append(strM4210case2);
            sbIsVip.append('\t');
            sb.append(sbIsVip.toString());
        }
        return sb.toString();
    }
}
