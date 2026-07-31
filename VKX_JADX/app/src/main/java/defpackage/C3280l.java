package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٌٖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3280l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C13470l f7022l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f7023l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7024l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3280l(C13470l c13470l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f7022l = c13470l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f7023l = obj;
        this.f7024l |= RecyclerView.UNDEFINED_DURATION;
        return C13470l.admob(this.f7022l, null, this);
    }
}
