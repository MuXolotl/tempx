package defpackage;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lَؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10033l {
    public static C5254l admob(String str) {
        if (AbstractC12024l.m3315catch(str)) {
            return C5254l.f11335l;
        }
        C5705l c5705l = (C5705l) AbstractC16901l.m4214continue(AbstractC9092l.billing(str));
        String str2 = c5705l.yandex;
        List list = c5705l.loadAd;
        int iM3321extends = AbstractC12024l.m3321extends(str2, '/', 0, 6);
        if (iM3321extends == -1) {
            if (AbstractC8576l.yandex(AbstractC12024l.m3330l(str2).toString(), "*")) {
                return C5254l.f11335l;
            }
            throw new C2120l(str);
        }
        String string = AbstractC12024l.m3330l(AbstractC12024l.m3332l(iM3321extends, str2)).toString();
        if (string.length() == 0) {
            throw new C2120l(str);
        }
        String string2 = AbstractC12024l.m3330l(str2.substring(iM3321extends + 1)).toString();
        if (AbstractC12024l.inmobi(string, ' ') || AbstractC12024l.inmobi(string2, ' ')) {
            throw new C2120l(str);
        }
        if (string2.length() == 0 || AbstractC12024l.inmobi(string2, '/')) {
            throw new C2120l(str);
        }
        return new C5254l(string, string2, list);
    }

    public static boolean amazon(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC16648l.isVip(Build.MODEL.toUpperCase(Locale.ROOT), (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static final int mopub(C9696l c9696l, EnumC7283l enumC7283l) {
        return (int) (enumC7283l == EnumC7283l.f15126l ? c9696l.ad & 4294967295L : c9696l.ad >> 32);
    }

    public boolean billing() {
        return this instanceof C0221l;
    }

    public boolean crashlytics(AbstractC17931l abstractC17931l) {
        return true;
    }

    public abstract void isPro(InterfaceC16805l interfaceC16805l);

    public abstract C12105l loadAd();

    public boolean purchase() {
        return false;
    }

    public abstract void subs(String str);

    public abstract long yandex();
}
