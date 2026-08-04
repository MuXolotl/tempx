package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؘؙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5500l extends AbstractC11563l {
    public C9224l amazon;
    public InterfaceC12001l crashlytics;

    public C5500l() {
        super(0, 3);
        this.crashlytics = C9885l.yandex;
        this.amazon = C9224l.crashlytics;
    }

    @Override // defpackage.InterfaceC9708l
    public final void crashlytics(InterfaceC12001l interfaceC12001l) {
        this.crashlytics = interfaceC12001l;
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC12001l loadAd() {
        return this.crashlytics;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.crashlytics + ", contentAlignment=" + this.amazon + "children=[\n" + amazon() + "\n])";
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC9708l yandex() {
        C5500l c5500l = new C5500l();
        c5500l.crashlytics = this.crashlytics;
        c5500l.amazon = this.amazon;
        ArrayList arrayList = this.loadAd;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC9708l) it.next()).yandex());
        }
        c5500l.loadAd.addAll(arrayList2);
        return c5500l;
    }
}
