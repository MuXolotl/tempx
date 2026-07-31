package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: renamed from: lٕٜٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15807l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C2182l f31038l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f31039l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Iterator f31040l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C10463l f31041l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f31042l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15807l(C2182l c2182l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f31038l = c2182l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f31042l = obj;
        this.f31039l |= RecyclerView.UNDEFINED_DURATION;
        return this.f31038l.billing(null, this);
    }
}
