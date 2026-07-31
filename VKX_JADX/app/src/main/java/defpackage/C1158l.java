package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* JADX INFO: renamed from: lؒٚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1158l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ DedicatedCacheService f3135l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f3136l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f3137l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158l(DedicatedCacheService dedicatedCacheService, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f3135l = dedicatedCacheService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f3136l = obj;
        this.f3137l |= RecyclerView.UNDEFINED_DURATION;
        int i = DedicatedCacheService.f36826l;
        return this.f3135l.remoteconfig(null, this);
    }
}
