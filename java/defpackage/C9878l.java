package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٍٟۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9878l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C16117l f20100l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f20101l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20102l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9878l(C16117l c16117l, InterfaceC14029l interfaceC14029l) {
        super(interfaceC14029l);
        this.f20100l = c16117l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f20101l = obj;
        this.f20102l |= RecyclerView.UNDEFINED_DURATION;
        return this.f20100l.isPro(null, this);
    }
}
