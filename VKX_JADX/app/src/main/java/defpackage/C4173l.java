package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؖٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4173l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11090l f8561l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f8562l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8563l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f8564l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f8565l;

    public /* synthetic */ C4173l(long j, C11090l c11090l, Function2 function2, int i, int i2) {
        this.f8563l = i2;
        this.f8562l = j;
        this.f8561l = c11090l;
        this.f8565l = function2;
        this.f8564l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8563l) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC3383l.billing(this.f8562l, this.f8561l, this.f8565l, (C6956l) obj, AbstractC0545l.purchase(this.f8564l | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC15042l.purchase(this.f8562l, this.f8561l, this.f8565l, (C6956l) obj, AbstractC0545l.purchase(this.f8564l | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
