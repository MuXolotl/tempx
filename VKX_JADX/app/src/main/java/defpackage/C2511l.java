package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٍّؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2511l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f5310l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f5311l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C13698l f5312l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C11140l f5313l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2511l(C11140l c11140l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f5313l = c11140l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f5311l = obj;
        this.f5310l |= RecyclerView.UNDEFINED_DURATION;
        Object objVip = this.f5313l.vip(null, this);
        return objVip == EnumC9342l.f19165l ? objVip : new C1171l(objVip);
    }
}
