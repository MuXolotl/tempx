package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑٓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0304l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int[] f1352l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC12866l f1353l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1354l;

    public /* synthetic */ C0304l(AbstractC12866l abstractC12866l, int[] iArr, int i) {
        this.f1354l = i;
        this.f1353l = abstractC12866l;
        this.f1352l = iArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f1354l;
        int[] iArr = this.f1352l;
        AbstractC12866l abstractC12866l = this.f1353l;
        C14354l c14354l = (C14354l) obj;
        switch (i) {
            case 0:
                C13696l c13696lSubscription = C2318l.subscription();
                String canonicalName = abstractC12866l.getClass().getCanonicalName();
                c13696lSubscription.crashlytics();
                C2318l.vip((C2318l) c13696lSubscription.f16394l, canonicalName);
                List listM2406goto = AbstractC8669l.m2406goto(iArr);
                c13696lSubscription.crashlytics();
                C2318l.metrica((C2318l) c13696lSubscription.f16394l, listM2406goto);
                C2318l c2318l = (C2318l) c13696lSubscription.yandex();
                c14354l.crashlytics();
                C11208l.startapp((C11208l) c14354l.f16394l, c2318l);
                break;
            default:
                C3130l c3130lSubscription = C12057l.subscription();
                String canonicalName2 = abstractC12866l.getClass().getCanonicalName();
                c3130lSubscription.crashlytics();
                C12057l.vip((C12057l) c3130lSubscription.f16394l, canonicalName2);
                List listM2406goto2 = AbstractC8669l.m2406goto(iArr);
                c3130lSubscription.crashlytics();
                C12057l.metrica((C12057l) c3130lSubscription.f16394l, listM2406goto2);
                C12057l c12057l = (C12057l) c3130lSubscription.yandex();
                c14354l.crashlytics();
                C11208l.vip((C11208l) c14354l.f16394l, c12057l);
                break;
        }
        return Unit.INSTANCE;
    }
}
