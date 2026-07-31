package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍؔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2518l implements InterfaceC4182l {
    public final String loadAd;
    public final List yandex;

    public C2518l(List list, String str) {
        this.yandex = list;
        this.loadAd = str;
        list.size();
        AbstractC16901l.m4229l(list).size();
    }

    @Override // defpackage.InterfaceC4182l
    public final void crashlytics(C2312l c2312l, ArrayList arrayList) {
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            AbstractC15011l.crashlytics((InterfaceC4182l) it.next(), c2312l, arrayList);
        }
    }

    @Override // defpackage.InterfaceC4182l
    public final boolean loadAd(C2312l c2312l) {
        List list = this.yandex;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC15011l.mopub((InterfaceC4182l) it.next(), c2312l)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC4182l
    public final Collection remoteconfig(C2312l c2312l, Function1 function1) {
        HashSet hashSet = new HashSet();
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC4182l) it.next()).remoteconfig(c2312l, function1));
        }
        return hashSet;
    }

    public final String toString() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC4182l
    public final List yandex(C2312l c2312l) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            AbstractC15011l.crashlytics((InterfaceC4182l) it.next(), c2312l, arrayList);
        }
        return AbstractC16901l.m4213const(arrayList);
    }
}
