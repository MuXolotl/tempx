package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lّٕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12625l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C7119l f24849l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f24850l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f24851l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12625l(C7119l c7119l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f24849l = c7119l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f24850l = obj;
        this.f24851l |= RecyclerView.UNDEFINED_DURATION;
        Object objM2170synchronized = C7119l.m2170synchronized(this.f24849l, this);
        return objM2170synchronized == EnumC9342l.f19165l ? objM2170synchronized : new C0381l(objM2170synchronized);
    }
}
