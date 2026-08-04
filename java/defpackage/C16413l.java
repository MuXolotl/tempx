package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lِٖٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16413l implements InterfaceC18035l, InterfaceC16555l {
    public final List[] admob;
    public final List amazon;
    public final String[] billing;
    public final int crashlytics;
    public final InterfaceC18035l[] firebase;
    public final Map isPro;
    public final AbstractC2021l loadAd;
    public final InterfaceC18035l[] mopub;
    public final HashSet purchase;
    public final C8688l smaato;
    public final boolean[] subs;
    public final String yandex;

    public C16413l(String str, AbstractC2021l abstractC2021l, int i, List list, C14416l c14416l) {
        this.yandex = str;
        this.loadAd = abstractC2021l;
        this.crashlytics = i;
        this.amazon = c14416l.loadAd;
        ArrayList arrayList = c14416l.crashlytics;
        HashSet hashSet = new HashSet(AbstractC2200l.firebase(AbstractC14055l.billing(arrayList, 12)));
        AbstractC16901l.m4235protected(arrayList, hashSet);
        this.purchase = hashSet;
        int i2 = 0;
        this.billing = (String[]) arrayList.toArray(new String[0]);
        this.mopub = AbstractC16164l.purchase(c14416l.purchase);
        this.admob = (List[]) c14416l.billing.toArray(new List[0]);
        ArrayList arrayList2 = c14416l.mopub;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.subs = zArr;
        C14297l c14297l = new C14297l(1, new C9636l(10, this.billing));
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(c14297l, 10));
        Iterator it2 = c14297l.iterator();
        while (true) {
            C14596l c14596l = (C14596l) it2;
            if (!c14596l.f28578l.hasNext()) {
                this.isPro = AbstractC8676l.subscription(arrayList3);
                this.firebase = AbstractC16164l.purchase(list);
                this.smaato = new C8688l(new C5767l(6, this));
                return;
            }
            C1143l c1143l = (C1143l) c14596l.next();
            arrayList3.add(new C8195l(c1143l.loadAd, Integer.valueOf(c1143l.yandex)));
        }
    }

    @Override // defpackage.InterfaceC18035l
    public final String admob(int i) {
        return this.billing[i];
    }

    @Override // defpackage.InterfaceC18035l
    public final int amazon(String str) {
        Integer num = (Integer) this.isPro.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.InterfaceC18035l
    public final AbstractC2021l billing() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ boolean crashlytics() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16413l) {
            InterfaceC18035l interfaceC18035l = (InterfaceC18035l) obj;
            if (this.yandex.equals(interfaceC18035l.yandex()) && Arrays.equals(this.firebase, ((C16413l) obj).firebase)) {
                int iMopub = interfaceC18035l.mopub();
                int i = this.crashlytics;
                if (i == iMopub) {
                    for (int i2 = 0; i2 < i; i2++) {
                        InterfaceC18035l[] interfaceC18035lArr = this.mopub;
                        if (AbstractC8576l.yandex(interfaceC18035lArr[i2].yandex(), interfaceC18035l.isPro(i2).yandex()) && AbstractC8576l.yandex(interfaceC18035lArr[i2].billing(), interfaceC18035l.isPro(i2).billing())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final boolean firebase(int i) {
        return this.subs[i];
    }

    @Override // defpackage.InterfaceC18035l
    public final List getAnnotations() {
        return this.amazon;
    }

    public final int hashCode() {
        return ((Number) this.smaato.getValue()).intValue();
    }

    @Override // defpackage.InterfaceC18035l
    public final InterfaceC18035l isPro(int i) {
        return this.mopub[i];
    }

    @Override // defpackage.InterfaceC16555l
    public final Set loadAd() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC18035l
    public final int mopub() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC18035l
    public final /* bridge */ boolean purchase() {
        return false;
    }

    @Override // defpackage.InterfaceC18035l
    public final List subs(int i) {
        return this.admob[i];
    }

    public final String toString() {
        return AbstractC3670l.billing(this);
    }

    @Override // defpackage.InterfaceC18035l
    public final String yandex() {
        return this.yandex;
    }
}
