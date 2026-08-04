package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؒؕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0826l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C1254l f2466l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f2467l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f2468l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0826l(C1254l c1254l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f2466l = c1254l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f2467l = obj;
        this.f2468l |= RecyclerView.UNDEFINED_DURATION;
        return C1254l.pro(this.f2466l, this);
    }
}
