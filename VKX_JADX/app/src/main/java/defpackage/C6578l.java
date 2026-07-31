package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؙٛ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6578l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f13750l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f13751l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C4910l f13752l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C0360l f13753l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6578l(C0360l c0360l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f13753l = c0360l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f13751l = obj;
        this.f13750l |= RecyclerView.UNDEFINED_DURATION;
        return C0360l.crashlytics(this.f13753l, this);
    }
}
