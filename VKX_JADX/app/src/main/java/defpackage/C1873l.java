package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٖؓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1873l extends AbstractC9813l implements RandomAccess {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f4295l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f4296l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC9813l f4297l;

    public C1873l(AbstractC9813l abstractC9813l, int i, int i2) {
        this.f4297l = abstractC9813l;
        this.f4296l = i;
        AbstractC15918l.subs(i, i2, abstractC9813l.pro());
        this.f4295l = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f4295l;
        if (i < 0 || i >= i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.f4297l.get(this.f4296l + i);
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f4295l;
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final List subList(int i, int i2) {
        AbstractC15918l.subs(i, i2, this.f4295l);
        int i3 = this.f4296l;
        return new C1873l(this.f4297l, i + i3, i3 + i2);
    }
}
