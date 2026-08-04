package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؗؒ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4600l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f9341l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f9342l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f9343l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C5483l f9344l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600l(C5483l c5483l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f9344l = c5483l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f9342l = obj;
        this.f9341l |= RecyclerView.UNDEFINED_DURATION;
        return this.f9344l.crashlytics(null, this);
    }
}
