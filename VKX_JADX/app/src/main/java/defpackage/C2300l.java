package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؓۨۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2300l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C9154l f4999l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f5000l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f5001l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2300l(C9154l c9154l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f4999l = c9154l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f5000l = obj;
        this.f5001l |= RecyclerView.UNDEFINED_DURATION;
        return this.f4999l.loadAd(this);
    }
}
