package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؑؑ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0029l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f878l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f879l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C1501l f880l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C11761l f881l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0029l(C11761l c11761l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f881l = c11761l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f879l = obj;
        this.f878l |= RecyclerView.UNDEFINED_DURATION;
        return this.f881l.crashlytics(null, this);
    }
}
