package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: renamed from: lٌؖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4007l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C2182l f8229l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f8230l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C0809l f8231l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Iterator f8232l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f8233l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4007l(C2182l c2182l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f8229l = c2182l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f8233l = obj;
        this.f8230l |= RecyclerView.UNDEFINED_DURATION;
        return this.f8229l.loadAd(null, this);
    }
}
