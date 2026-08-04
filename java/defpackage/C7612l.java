package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚۣۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7612l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f15659l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f15660l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f15661l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f15662l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f15663l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f15664l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f15665l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7612l(Object obj, Object obj2, Object obj3, InterfaceC14328l interfaceC14328l, int i, int i2, int i3) {
        super(2);
        this.f15662l = i3;
        this.f15663l = obj;
        this.f15665l = obj2;
        this.f15660l = obj3;
        this.f15661l = interfaceC14328l;
        this.f15659l = i;
        this.f15664l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15662l;
        int i2 = this.f15659l;
        InterfaceC14328l interfaceC14328l = this.f15661l;
        Object obj3 = this.f15660l;
        Object obj4 = this.f15665l;
        Object obj5 = this.f15663l;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC3017l.yandex((InterfaceC16711l) obj5, (Function0) obj4, (C12288l) obj3, (C15578l) interfaceC14328l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), this.f15664l);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC11397l.loadAd((Function1) obj5, (InterfaceC17242l) obj4, (Function1) obj3, (Function1) interfaceC14328l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), this.f15664l);
                break;
        }
        return Unit.INSTANCE;
    }
}
