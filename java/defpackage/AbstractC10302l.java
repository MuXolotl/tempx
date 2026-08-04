package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَٕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10302l extends AbstractC4366l implements InterfaceC3754l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC1220l f20989l = AbstractC9968l.crashlytics(2, new C10484l(this, 0));

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC1220l f20988l = AbstractC9968l.crashlytics(2, new C10484l(this, 1));

    @Override // defpackage.InterfaceC18672l
    public final List admob() {
        return AbstractC16901l.m4218final(this.f20989l.getValue(), mo1540extends().admob());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC10302l) && AbstractC8576l.yandex(mo1540extends(), ((AbstractC10302l) obj).mo1540extends());
    }

    @Override // defpackage.InterfaceC6902l
    public final String getName() {
        return AbstractC2812l.tapsense(new StringBuilder("<set-"), mo1540extends().f23985l.loadAd, '>');
    }

    @Override // defpackage.InterfaceC6902l
    public final List getParameters() {
        return AbstractC16901l.m4218final(this.f20989l.getValue(), mo1540extends().getParameters());
    }

    public final int hashCode() {
        return mo1540extends().hashCode();
    }

    @Override // defpackage.InterfaceC18672l
    public final InterfaceC16148l isPro() {
        return (InterfaceC16148l) this.f20988l.getValue();
    }

    @Override // defpackage.AbstractC4366l
    /* JADX INFO: renamed from: private */
    public final C8230l mo1101private() {
        return mo1540extends().f23985l.amazon;
    }

    @Override // defpackage.InterfaceC6902l
    public final InterfaceC13012l smaato() {
        return AbstractC1806l.purchase;
    }

    public final String toString() {
        return "setter of " + mo1540extends();
    }
}
