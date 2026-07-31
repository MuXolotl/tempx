package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lؗؕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4652l {
    public final int amazon;
    public final InterfaceC15244l billing;
    public final Set crashlytics;
    public final Set loadAd;
    public final Set mopub;
    public final int purchase;
    public final String yandex;

    public C4652l(String str, Set set, Set set2, int i, int i2, InterfaceC15244l interfaceC15244l, Set set3) {
        this.yandex = str;
        this.loadAd = DesugarCollections.unmodifiableSet(set);
        this.crashlytics = DesugarCollections.unmodifiableSet(set2);
        this.amazon = i;
        this.purchase = i2;
        this.billing = interfaceC15244l;
        this.mopub = DesugarCollections.unmodifiableSet(set3);
    }

    public static C4652l crashlytics(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C12638l.yandex(cls));
        for (Class cls2 : clsArr) {
            AbstractC11064l.loadAd(cls2, "Null interface");
            hashSet.add(C12638l.yandex(cls2));
        }
        return new C4652l(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C3441l(1, obj), hashSet3);
    }

    public static C1652l loadAd(Class cls) {
        return new C1652l(cls, new Class[0]);
    }

    public static C1652l yandex(C12638l c12638l) {
        C12638l[] c12638lArr = new C12638l[0];
        C1652l c1652l = new C1652l();
        c1652l.yandex = null;
        HashSet hashSet = new HashSet();
        c1652l.amazon = hashSet;
        c1652l.purchase = new HashSet();
        c1652l.loadAd = 0;
        c1652l.crashlytics = 0;
        c1652l.billing = new HashSet();
        hashSet.add(c12638l);
        for (C12638l c12638l2 : c12638lArr) {
            AbstractC11064l.loadAd(c12638l2, "Null interface");
        }
        Collections.addAll((HashSet) c1652l.amazon, c12638lArr);
        return c1652l;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.loadAd.toArray()) + ">{" + this.amazon + ", type=" + this.purchase + ", deps=" + Arrays.toString(this.crashlytics.toArray()) + "}";
    }
}
