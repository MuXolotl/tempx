package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lِْٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11810l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C16240l f23631l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f23632l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f23633l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11810l(C16240l c16240l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f23631l = c16240l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f23632l = obj;
        this.f23633l |= RecyclerView.UNDEFINED_DURATION;
        return this.f23631l.crashlytics(this);
    }
}
