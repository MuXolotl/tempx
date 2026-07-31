package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؙٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1675l extends AbstractC18650l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f4039l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7687l f4040l;

    public C1675l(int i, C7687l c7687l) {
        this.f4040l = c7687l;
        this.f4039l = i;
    }

    @Override // defpackage.AbstractC18650l
    public final int amazon() {
        return 1;
    }

    @Override // defpackage.AbstractC18650l
    public final void billing(int i, C7687l c7687l) {
        throw new IllegalStateException();
    }

    @Override // defpackage.AbstractC18650l
    public final Object get(int i) {
        if (i == this.f4039l) {
            return this.f4040l;
        }
        return null;
    }

    @Override // defpackage.AbstractC18650l, java.lang.Iterable
    public final Iterator iterator() {
        return new C18568l(2, this);
    }
}
