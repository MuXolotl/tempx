package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lِؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2553l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C2354l f5559l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f5560l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f5561l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2553l(C2354l c2354l, InterfaceC14029l interfaceC14029l) {
        super(interfaceC14029l);
        this.f5559l = c2354l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f5560l = obj;
        this.f5561l |= RecyclerView.UNDEFINED_DURATION;
        return this.f5559l.loadAd(this);
    }
}
