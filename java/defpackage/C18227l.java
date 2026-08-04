package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ۜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18227l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f35696l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f35697l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35698l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f35699l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ String f35700l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17807l f35701l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C15578l f35702l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18227l(Object obj, InterfaceC17242l interfaceC17242l, InterfaceC17807l interfaceC17807l, String str, C15578l c15578l, int i, int i2) {
        super(2);
        this.f35699l = obj;
        this.f35696l = interfaceC17242l;
        this.f35701l = interfaceC17807l;
        this.f35700l = str;
        this.f35702l = c15578l;
        this.f35697l = i;
        this.f35698l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC18037l.crashlytics(this.f35699l, this.f35696l, this.f35701l, this.f35700l, this.f35702l, (C6956l) obj, AbstractC0545l.purchase(this.f35697l | 1), this.f35698l);
        return Unit.INSTANCE;
    }
}
