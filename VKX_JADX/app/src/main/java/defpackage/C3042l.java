package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؔۦؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3042l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f6558l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f6559l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f6560l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C6565l f6561l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3042l(C6565l c6565l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f6561l = c6565l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f6559l = obj;
        this.f6558l |= RecyclerView.UNDEFINED_DURATION;
        return this.f6561l.subscription(null, this);
    }
}
