package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lۣٔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15275l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f29874l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f29875l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f29876l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15275l(C12217l c12217l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f29874l = c12217l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f29875l = obj;
        this.f29876l |= RecyclerView.UNDEFINED_DURATION;
        return this.f29874l.subscription(this);
    }
}
