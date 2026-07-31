package defpackage;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؓۗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2058l extends C1109l {
    public static final HashSet purchase;
    public final Hashtable amazon;

    static {
        HashSet hashSet = new HashSet();
        purchase = hashSet;
        hashSet.add(C4421l.remoteconfig);
    }

    public AbstractC2058l(C4421l c4421l, long j, BigInteger bigInteger) {
        super(c4421l, j, bigInteger);
        this.amazon = new Hashtable();
    }

    public final String crashlytics(String str, String str2) {
        StringBuilder sb = new StringBuilder(super.yandex(str));
        sb.append(str2);
        sb.append(str);
        sb.append("  |");
        sb.append(AbstractC3848l.yandex);
        ArrayList arrayList = new ArrayList();
        Hashtable hashtable = this.amazon;
        Iterator it = DesugarCollections.bridge_synchronizedCollection(hashtable.values(), hashtable).iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new C0530l());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sb.append(((C1109l) it2.next()).yandex(str.concat("  |")));
            sb.append(str);
            sb.append("  |");
            sb.append(AbstractC3848l.yandex);
        }
        return sb.toString();
    }

    public final C1109l loadAd(C4421l c4421l, Class cls) {
        List list = (List) this.amazon.get(c4421l);
        if (list == null || list.isEmpty()) {
            return null;
        }
        C1109l c1109l = (C1109l) list.get(0);
        if (cls.isAssignableFrom(c1109l.getClass())) {
            return c1109l;
        }
        return null;
    }

    @Override // defpackage.C1109l
    public String yandex(String str) {
        return crashlytics(str, "");
    }
}
