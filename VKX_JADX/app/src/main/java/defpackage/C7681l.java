package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؚۨٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7681l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f16106l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C10539l f16107l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C5203l f16108l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C10539l f16109l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f16110l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f16111l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7681l(C10539l c10539l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f16107l = c10539l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f16106l = obj;
        this.f16110l |= RecyclerView.UNDEFINED_DURATION;
        return this.f16107l.billing(false, this);
    }
}
