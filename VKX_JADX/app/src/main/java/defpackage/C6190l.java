package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙؙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6190l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f13055l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9197l f13056l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13057l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C1682l f13058l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f13059l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f13060l;

    public /* synthetic */ C6190l(C9197l c9197l, Function0 function0, Function1 function1, C1682l c1682l, int i, int i2) {
        this.f13057l = i2;
        this.f13056l = c9197l;
        this.f13055l = function0;
        this.f13059l = function1;
        this.f13058l = c1682l;
        this.f13060l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f13057l;
        int i2 = this.f13060l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                this.f13056l.m2622import(this.f13055l, this.f13059l, this.f13058l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                this.f13056l.m2621abstract(this.f13055l, this.f13059l, this.f13058l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
