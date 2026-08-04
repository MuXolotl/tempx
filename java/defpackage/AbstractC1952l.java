package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؓٛٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1952l extends AbstractC4366l implements InterfaceC14626l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC1220l f4444l = AbstractC9968l.crashlytics(2, new C8467l(3, this));

    @Override // defpackage.InterfaceC18672l
    public final List admob() {
        return mo1540extends().admob();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC1952l) && AbstractC8576l.yandex(mo1540extends(), ((AbstractC1952l) obj).mo1540extends());
    }

    @Override // defpackage.InterfaceC6902l
    public final String getName() {
        return AbstractC2812l.tapsense(new StringBuilder("<get-"), mo1540extends().f23985l.loadAd, '>');
    }

    @Override // defpackage.InterfaceC6902l
    public final List getParameters() {
        return mo1540extends().getParameters();
    }

    public final int hashCode() {
        return mo1540extends().hashCode();
    }

    @Override // defpackage.InterfaceC18672l
    public final InterfaceC16148l isPro() {
        return (InterfaceC16148l) this.f4444l.getValue();
    }

    @Override // defpackage.AbstractC4366l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final C8230l mo1101private() {
        return mo1540extends().f23985l.crashlytics;
    }

    @Override // defpackage.InterfaceC6902l
    public final InterfaceC13012l smaato() {
        return mo1540extends().smaato();
    }

    public final String toString() {
        return "getter of " + mo1540extends();
    }
}
