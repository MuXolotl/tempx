package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* JADX INFO: renamed from: lؙ٘ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17669l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ DedicatedCacheService f34434l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f34435l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC11075l f34436l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C17685l f34437l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f34438l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17669l(DedicatedCacheService dedicatedCacheService, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f34434l = dedicatedCacheService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f34438l = obj;
        this.f34435l |= RecyclerView.UNDEFINED_DURATION;
        int i = DedicatedCacheService.f36826l;
        return this.f34434l.firebase(null, null, this);
    }
}
