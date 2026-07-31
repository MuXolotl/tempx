package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌَٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17027l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f33169l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f33170l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33171l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f33172l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f33173l;

    public /* synthetic */ C17027l(C18306l c18306l, long j, C7070l c7070l, int i) {
        this.f33171l = 0;
        this.f33173l = c18306l;
        this.f33170l = j;
        this.f33172l = c7070l;
        this.f33169l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f33171l;
        int i2 = this.f33169l;
        Object obj3 = this.f33172l;
        Object obj4 = this.f33173l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                long j = this.f33170l;
                ((C18306l) obj4).m4511finally(j, (C7070l) obj3, (C6956l) obj, iPurchase);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                long j2 = this.f33170l;
                AbstractC10464l.amazon(j2, (C11090l) obj4, (C15578l) obj3, (C6956l) obj, iPurchase2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(i2 | 1);
                long j3 = this.f33170l;
                AbstractC3308l.mopub(iPurchase3, j3, (C6956l) obj, (InterfaceC18579l) obj4, (Function2) obj3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C17027l(long j, Object obj, Function2 function2, int i, int i2) {
        this.f33171l = i2;
        this.f33170l = j;
        this.f33173l = obj;
        this.f33172l = function2;
        this.f33169l = i;
    }
}
