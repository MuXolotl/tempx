package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍَٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14789l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f28913l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f28914l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28915l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5056l f28916l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28917l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f28918l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ boolean f28919l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14789l(C5056l c5056l, Object obj, InterfaceC17242l interfaceC17242l, boolean z, boolean z2, C15578l c15578l, int i) {
        super(2);
        this.f28916l = c5056l;
        this.f28913l = obj;
        this.f28918l = interfaceC17242l;
        this.f28917l = z;
        this.f28919l = z2;
        this.f28914l = c15578l;
        this.f28915l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC18296l.billing(this.f28916l, this.f28913l, this.f28918l, this.f28917l, this.f28919l, this.f28914l, (C6956l) obj, AbstractC0545l.purchase(this.f28915l | 1));
        return Unit.INSTANCE;
    }
}
