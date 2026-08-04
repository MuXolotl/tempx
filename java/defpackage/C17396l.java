package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٗۚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17396l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f33878l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4456l f33879l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33880l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f33881l;

    public /* synthetic */ C17396l(C4456l c4456l, Function0 function0, Function0 function1, int i, int i2) {
        this.f33880l = i2;
        this.f33879l = c4456l;
        this.f33878l = function0;
        this.f33881l = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f33880l;
        Function0 function0 = this.f33881l;
        Function0 function1 = this.f33878l;
        C4456l c4456l = this.f33879l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c4456l.premium(function1, function0, c6956l, AbstractC0545l.purchase(1));
                break;
            case 1:
                c4456l.applovin(function1, function0, c6956l, AbstractC0545l.purchase(1));
                break;
            default:
                c4456l.inmobi(function1, function0, c6956l, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
