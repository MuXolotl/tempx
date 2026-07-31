package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؗۥۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5280l extends AbstractC14971l implements InterfaceC16388l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C12660l f11389l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5280l) && AbstractC8576l.yandex(this.f11389l, ((C5280l) obj).f11389l);
    }

    public final int hashCode() {
        return this.f11389l.hashCode();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        C12660l c12660l = this.f11389l;
        c12660l.purchase();
        c12660l.loadAd = null;
        c12660l.crashlytics = -1;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        this.f11389l.isPro = this;
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        ArrayList arrayList = this.f11389l.subs;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7136l c7136l = (C7136l) arrayList.get(i);
            C11925l c11925l = c7136l.metrica;
            if (c11925l != null) {
                long j = c7136l.remoteconfig;
                long j2 = c11925l.tapsense;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                C13601l c13601l = c6742l.f14144l;
                ((C16543l) c13601l.f26629l.f36010l).inmobi(f, f2);
                try {
                    AbstractC2576l.loadAd(c6742l, c11925l);
                    ((C16543l) c13601l.f26629l.f36010l).inmobi(-f, -f2);
                } catch (Throwable th) {
                    ((C16543l) c13601l.f26629l.f36010l).inmobi(-f, -f2);
                    throw th;
                }
            }
        }
        c6742l.yandex();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f11389l + ")";
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
