package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؑؒؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0032l extends AbstractC11563l {
    public InterfaceC18579l amazon;
    public long crashlytics;

    public C0032l() {
        super(0, 3);
        this.crashlytics = 9205357640488583168L;
        this.amazon = C7261l.yandex;
    }

    @Override // defpackage.InterfaceC9708l
    public final void crashlytics(InterfaceC12001l interfaceC12001l) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC12001l loadAd() {
        InterfaceC12001l interfaceC12001lLoadAd;
        InterfaceC9708l interfaceC9708l = (InterfaceC9708l) AbstractC16901l.m4236public(this.loadAd);
        return (interfaceC9708l == null || (interfaceC12001lLoadAd = interfaceC9708l.loadAd()) == null) ? AbstractC5573l.purchase(C9885l.yandex) : interfaceC12001lLoadAd;
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) C2261l.crashlytics(this.crashlytics)) + ", sizeMode=" + this.amazon + ", children=[\n" + amazon() + "\n])";
    }

    @Override // defpackage.InterfaceC9708l
    public final InterfaceC9708l yandex() {
        C0032l c0032l = new C0032l();
        c0032l.crashlytics = this.crashlytics;
        c0032l.amazon = this.amazon;
        ArrayList arrayList = this.loadAd;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC9708l) it.next()).yandex());
        }
        c0032l.loadAd.addAll(arrayList2);
        return c0032l;
    }
}
