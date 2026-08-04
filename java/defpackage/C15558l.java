package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15558l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f30395l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11611l f30396l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30397l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C0205l f30398l;

    public /* synthetic */ C15558l(C0205l c0205l, C11611l c11611l, C15578l c15578l) {
        this.f30398l = c0205l;
        this.f30396l = c11611l;
        this.f30395l = c15578l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f30397l;
        C0205l c0205l = this.f30398l;
        C15578l c15578l = this.f30395l;
        C11611l c11611l = this.f30396l;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1896l.yandex(c0205l, AbstractC14566l.amazon(201187952, new C15558l(c11611l, c15578l, c0205l), c6956l), c6956l, 48);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC10478l.yandex(AbstractC8548l.yandex.yandex(c11611l), AbstractC14566l.amazon(1199015344, new C6959l(c15578l, c0205l), c6956l), c6956l, 56);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15558l(C11611l c11611l, C15578l c15578l, C0205l c0205l) {
        this.f30396l = c11611l;
        this.f30395l = c15578l;
        this.f30398l = c0205l;
    }
}
