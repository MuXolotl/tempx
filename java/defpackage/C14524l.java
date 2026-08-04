package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lْٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14524l extends AbstractC11563l {
    public InterfaceC12001l amazon;
    public final int crashlytics;

    public C14524l(int i) {
        super(i, 2);
        this.crashlytics = i;
        this.amazon = C9885l.yandex;
    }

    @Override // defpackage.InterfaceC9708l
    public final void crashlytics(InterfaceC12001l interfaceC12001l) {
        this.amazon = interfaceC12001l;
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC12001l loadAd() {
        return this.amazon;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.amazon + ", children=[\n" + amazon() + "\n])";
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC9708l yandex() {
        C14524l c14524l = new C14524l(this.crashlytics);
        c14524l.amazon = this.amazon;
        ArrayList arrayList = this.loadAd;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC9708l) it.next()).yandex());
        }
        c14524l.loadAd.addAll(arrayList2);
        return c14524l;
    }
}
