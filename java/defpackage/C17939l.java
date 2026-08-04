package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؚٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17939l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f34914l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f34915l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C7504l f34916l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C17249l f34917l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17939l(C17249l c17249l, AbstractC12050l abstractC12050l) {
        super(abstractC12050l);
        this.f34917l = c17249l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f34915l = obj;
        this.f34914l |= RecyclerView.UNDEFINED_DURATION;
        return this.f34917l.billing(0L, null, this);
    }
}
