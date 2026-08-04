package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lّٖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13024l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C8218l f25507l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f25508l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f25509l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13024l(C8218l c8218l, InterfaceC14029l interfaceC14029l) {
        super(interfaceC14029l);
        this.f25507l = c8218l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f25508l = obj;
        this.f25509l |= RecyclerView.UNDEFINED_DURATION;
        return this.f25507l.billing(this);
    }
}
