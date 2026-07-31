package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16169l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5891l f31673l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31674l;

    public /* synthetic */ C16169l(C5891l c5891l, int i) {
        this.f31674l = i;
        this.f31673l = c5891l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f31674l;
        C5891l c5891l = this.f31673l;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                c5891l.f12414l.setValue(bool);
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                c5891l.f12414l.setValue(bool2);
                break;
            default:
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-261775230, true, new C11492l(c5891l, 1)), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC1789l.crashlytics, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC1789l.amazon, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC1789l.purchase, 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
