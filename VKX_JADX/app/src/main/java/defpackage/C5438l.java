package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؘؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5438l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f11660l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f11661l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f11662l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C11485l f11663l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5438l(C11485l c11485l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f11663l = c11485l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f11661l = obj;
        this.f11660l |= RecyclerView.UNDEFINED_DURATION;
        return this.f11663l.subscription(null, this);
    }
}
