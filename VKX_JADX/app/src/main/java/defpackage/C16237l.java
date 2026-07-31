package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16237l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f31783l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31784l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18656l f31785l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f31786l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17807l f31787l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C15578l f31788l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16237l(C18656l c18656l, InterfaceC17242l interfaceC17242l, InterfaceC17807l interfaceC17807l, Function1 function1, C15578l c15578l, int i) {
        super(2);
        this.f31785l = c18656l;
        this.f31783l = interfaceC17242l;
        this.f31787l = interfaceC17807l;
        this.f31786l = function1;
        this.f31788l = c15578l;
        this.f31784l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC18037l.loadAd(this.f31785l, this.f31783l, this.f31787l, this.f31786l, this.f31788l, (C6956l) obj, AbstractC0545l.purchase(this.f31784l | 1));
        return Unit.INSTANCE;
    }
}
