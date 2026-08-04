package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؗٞۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5054l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C1461l f10322l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f10323l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f10324l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public CachedTrack f10325l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f10326l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5054l(C1461l c1461l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f10322l = c1461l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f10326l = obj;
        this.f10323l |= RecyclerView.UNDEFINED_DURATION;
        return this.f10322l.pro(null, false, this);
    }
}
