package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13402l {
    public static final StackTraceElement[] yandex = new StackTraceElement[0];

    public static C4569l amazon(String str) {
        return str.equals("/") ? C4569l.loadAd : new C4569l(AbstractC17587l.adcel(new C11100l(AbstractC17587l.firebase(new C11100l(AbstractC12024l.m3319default(str, new String[]{"/"}, 0), new C0783l(3, str)), new C5266l(4)), new C5266l(5))));
    }

    public static String crashlytics(String str, List list) {
        if (list == null || list.size() == 0) {
            C8339l.metrica("valueList might not be null or empty!");
            return null;
        }
        if (str == null) {
            C8339l.metrica("separator might not be null!");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < list.size()) {
            sb.append(list.get(i).toString());
            i++;
            if (i < list.size()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object loadAd(InterfaceC16031l interfaceC16031l, AbstractC5189l abstractC5189l) {
        if (!((AbstractC14971l) interfaceC16031l).f29454l.f29462l) {
            AbstractC0081l.crashlytics("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C11890l c11890l = (C11890l) AbstractC5573l.metrica(interfaceC16031l).f7709l;
        c11890l.getClass();
        return AbstractC9690l.billing(c11890l, abstractC5189l);
    }

    public static String purchase(String str, String str2, boolean z) throws C2584l {
        if (str == null && z) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i == 0 && AbstractC17551l.amazon(cCharAt)) {
                throw new C2584l(7, str2);
            }
            if (cCharAt == '\"') {
                sb.append('\\');
                sb.append(cCharAt);
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append("\"");
        return sb.toString();
    }

    public static final void yandex(boolean z, Function1 function1, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        long jFirebase;
        c6956l.m2133new(-1682403882);
        int i2 = i | (c6956l.mopub(z) ? 4 : 2) | (c6956l.admob(function1) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                c6956l.m2123default(-1882420291);
                jFirebase = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1882417245);
                C10707l c10707l = AbstractC16964l.yandex;
                jFirebase = AbstractC12953l.firebase(C9735l.loadAd(0.25f, ((C14370l) c6956l.isPro(c10707l)).yandex.tapsense), ((C14370l) c6956l.isPro(c10707l)).yandex.Signature);
                c6956l.startapp(false);
            }
            C12654l c12654lYandex = AbstractC13880l.yandex(((C9735l) AbstractC0703l.yandex(jFirebase, null, "", null, c6956l, 384, 10).getValue()).yandex, 0L, 0L, 0L, c6956l, 0, 14);
            C6839l c6839lYandex = AbstractC7497l.yandex(28.0f);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objM2132native = c6956l.m2132native();
            if (z2 || objM2132native == C1867l.yandex) {
                objM2132native = new C1926l(3, function1, z);
                c6956l.m2147try(objM2132native);
            }
            AbstractC3383l.loadAd((Function0) objM2132native, interfaceC17242l, false, c6839lYandex, c12654lYandex, null, null, AbstractC14566l.amazon(-896339381, new C8985l(z, function1, 2), c6956l), c6956l, 100663344, 228);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16693l(z, function1, interfaceC17242l, i, 2);
        }
    }
}
