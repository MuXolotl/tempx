package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚٕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15923l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f31251l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f31252l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31253l;

    public /* synthetic */ C15923l(C15578l c15578l, Function2 function2, int i) {
        this.f31253l = i;
        this.f31252l = c15578l;
        this.f31251l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31253l;
        Function2 function2 = this.f31251l;
        C15578l c15578l = this.f31252l;
        int i2 = 1;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = ((C14467l) c6956l.isPro(AbstractC16434l.crashlytics)).f28331l;
                    if (Float.isNaN(f)) {
                        f = 0.0f;
                    }
                    C17253l c17253l = C12719l.yandex;
                    C14467l c14467l = new C14467l(8.0f - (f - C12719l.billing()));
                    C14467l c14467l2 = new C14467l(0.0f);
                    C14467l c14467l3 = new C14467l(8.0f);
                    if (c14467l2.compareTo(c14467l3) > 0) {
                        C8876l.admob("Cannot coerce value to an empty range: maximum ", c14467l3, " is less than minimum ", c14467l2, 46);
                        return null;
                    }
                    if (c14467l.compareTo(c14467l2) < 0) {
                        c14467l = c14467l2;
                    } else if (c14467l.compareTo(c14467l3) > 0) {
                        c14467l = c14467l3;
                    }
                    AbstractC0850l.loadAd(c14467l.f28331l, AbstractC14566l.amazon(-459506658, new C15923l(c15578l, function2, i2), c6956l), c6956l, 390);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c15578l.invoke(c6956l, 0);
                    if (function2 == null) {
                        c6956l.m2123default(-1102003461);
                    } else {
                        c6956l.m2123default(795735494);
                        function2.invoke(c6956l, 0);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
        }
    }
}
