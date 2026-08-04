package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؓٞٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2003l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f4521l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f4522l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C4910l f4523l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C2258l f4524l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2003l(C2258l c2258l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f4524l = c2258l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f4522l = obj;
        this.f4521l |= RecyclerView.UNDEFINED_DURATION;
        return this.f4524l.crashlytics(this);
    }
}
