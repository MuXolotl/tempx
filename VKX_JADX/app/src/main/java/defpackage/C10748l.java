package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lُؐؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10748l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13264l f21776l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f21777l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C13315l f21778l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f21779l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f21780l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10748l(AbstractC13264l abstractC13264l, InterfaceC14029l interfaceC14029l) {
        super(interfaceC14029l);
        this.f21776l = abstractC13264l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f21780l = obj;
        this.f21777l |= RecyclerView.UNDEFINED_DURATION;
        return this.f21776l.billing(0, null, this);
    }
}
