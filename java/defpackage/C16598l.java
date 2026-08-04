package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٖۘۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16598l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11941l f32576l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17078l f32577l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ long f32578l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C16918l f32579l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ long f32580l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16598l(C17078l c17078l, C11941l c11941l, C16918l c16918l, long j, long j2) {
        super(0);
        this.f32577l = c17078l;
        this.f32576l = c11941l;
        this.f32579l = c16918l;
        this.f32578l = j;
        this.f32580l = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C11941l c11941l = this.f32576l;
        InterfaceC16711l positionProvider = c11941l.getPositionProvider();
        EnumC9931l parentLayoutDirection = c11941l.getParentLayoutDirection();
        this.f32577l.f33243l = positionProvider.license(this.f32578l, this.f32580l, this.f32579l, parentLayoutDirection);
        return Unit.INSTANCE;
    }
}
