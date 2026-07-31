package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* JADX INFO: renamed from: lٕؔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2633l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f5729l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public AudioTrack f5730l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C2633l f5731l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f5732l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f5733l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ DedicatedCacheService f5734l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC11075l f5735l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AbstractC7317l f5736l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f5737l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f5738l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Iterator f5739l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f5740l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public /* synthetic */ Object f5741l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2633l(DedicatedCacheService dedicatedCacheService, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f5734l = dedicatedCacheService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f5741l = obj;
        this.f5732l |= RecyclerView.UNDEFINED_DURATION;
        return this.f5734l.billing(null, this);
    }
}
