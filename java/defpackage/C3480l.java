package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؕٚؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3480l extends AbstractC11563l {
    public int amazon;
    public InterfaceC12001l crashlytics;
    public int purchase;

    public C3480l() {
        super(0, 3);
        this.crashlytics = C9885l.yandex;
        this.amazon = 0;
        this.purchase = 0;
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
        return "EmittableColumn(modifier=" + this.crashlytics + ", verticalAlignment=" + ((Object) C15667l.loadAd(this.amazon)) + ", horizontalAlignment=" + ((Object) C12347l.loadAd(this.purchase)) + ", children=[\n" + amazon() + "\n])";
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC9708l yandex() {
        C3480l c3480l = new C3480l();
        c3480l.crashlytics = this.crashlytics;
        c3480l.amazon = this.amazon;
        c3480l.purchase = this.purchase;
        ArrayList arrayList = this.loadAd;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC9708l) it.next()).yandex());
        }
        c3480l.loadAd.addAll(arrayList2);
        return c3480l;
    }
}
