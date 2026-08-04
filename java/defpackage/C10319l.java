package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* JADX INFO: renamed from: lَٕۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10319l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f21038l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ DedicatedCacheService f21039l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f21040l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AudioTrack f21041l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f21042l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public CachedTrack f21043l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10319l(DedicatedCacheService dedicatedCacheService, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f21039l = dedicatedCacheService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f21038l = obj;
        this.f21042l |= RecyclerView.UNDEFINED_DURATION;
        return DedicatedCacheService.isPro(this.f21039l, null, null, this);
    }
}
