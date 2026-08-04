package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: lٍْٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9530l {
    public static final LinkedHashSet yandex;

    static {
        Set set = EnumC15893l.f31163l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3974l.firebase.yandex(((EnumC15893l) it.next()).f31171l));
        }
        ArrayList<C2312l> arrayListM4218final = AbstractC16901l.m4218final(AbstractC3333l.isPro.subs(), AbstractC16901l.m4218final(AbstractC3333l.admob.subs(), AbstractC16901l.m4218final(AbstractC3333l.billing.subs(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C2312l c2312l : arrayListM4218final) {
            linkedHashSet.add(new C3624l(c2312l.loadAd(), c2312l.yandex.mopub()));
        }
        yandex = linkedHashSet;
    }
}
