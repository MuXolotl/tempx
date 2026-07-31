package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;

/* JADX INFO: renamed from: lّ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12664l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C14025l f24949l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C14025l f24950l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public /* synthetic */ Object f24951l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public AbstractC0085l f24952l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AbstractC0085l f24953l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f24954l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C14025l f24955l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C14025l f24956l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ DedicatedCacheMigrationService f24957l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12664l(DedicatedCacheMigrationService dedicatedCacheMigrationService, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f24957l = dedicatedCacheMigrationService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f24951l = obj;
        this.f24954l |= RecyclerView.UNDEFINED_DURATION;
        return DedicatedCacheMigrationService.crashlytics(this.f24957l, null, null, this);
    }
}
