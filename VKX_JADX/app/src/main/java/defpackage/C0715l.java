package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: lؑۦۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0715l extends AbstractC16653l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f2202l;

    public C0715l(long j, C0715l c0715l, int i) {
        super(j, c0715l, i);
        this.f2202l = new AtomicReferenceArray(AbstractC5936l.billing);
    }

    @Override // defpackage.AbstractC16653l
    public final void admob(int i, InterfaceC12932l interfaceC12932l) {
        this.f2202l.set(i, AbstractC5936l.purchase);
        subs();
    }

    @Override // defpackage.AbstractC16653l
    public final int mopub() {
        return AbstractC5936l.billing;
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f32620l + ", hashCode=" + hashCode() + ']';
    }
}
