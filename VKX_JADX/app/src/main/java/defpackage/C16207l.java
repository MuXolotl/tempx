package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٖؗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16207l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C7185l f31705l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f31706l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C17467l f31707l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C17467l f31708l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f31709l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16207l(C7185l c7185l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f31705l = c7185l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f31709l = obj;
        this.f31706l |= RecyclerView.UNDEFINED_DURATION;
        return this.f31705l.crashlytics(null, null, null, this);
    }
}
