package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٍٞۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9725l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f19837l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f19838l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Context f19839l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C2319l f19840l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9725l(C2319l c2319l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f19840l = c2319l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f19838l = obj;
        this.f19837l |= RecyclerView.UNDEFINED_DURATION;
        return this.f19840l.crashlytics(null, null, this);
    }
}
