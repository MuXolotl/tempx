package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّٕٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12622l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f24845l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f24846l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Function1 f24847l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C16290l f24848l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12622l(C16290l c16290l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f24848l = c16290l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f24846l = obj;
        this.f24845l |= RecyclerView.UNDEFINED_DURATION;
        return this.f24848l.crashlytics(null, 0.0f, null, this);
    }
}
