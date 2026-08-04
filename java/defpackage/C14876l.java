package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14876l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C0554l f29106l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1831l f29107l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29108l;

    public /* synthetic */ C14876l(C1831l c1831l, C0554l c0554l, int i) {
        this.f29108l = i;
        this.f29107l = c1831l;
        this.f29106l = c0554l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f29108l;
        C0554l c0554l = this.f29106l;
        C1831l c1831l = this.f29107l;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                c1831l.crashlytics(c0554l, iIntValue, iIntValue2);
                break;
            default:
                c1831l.crashlytics(c0554l, iIntValue, iIntValue2);
                break;
        }
        return Unit.INSTANCE;
    }
}
