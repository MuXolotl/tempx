package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُِؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0259l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16385l f1253l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1254l = 0;

    public /* synthetic */ C0259l(C16385l c16385l) {
        this.f1253l = c16385l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1254l;
        C16385l c16385l = this.f1253l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (c16385l.m4177return()) {
                        c6956l.m2123default(898047875);
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check_circle_16, 0, c6956l), null, null, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex, c6956l, 56, 4);
                    } else {
                        c6956l.m2123default(891979935);
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c16385l.mo3076try((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C0259l(C16385l c16385l, int i) {
        this.f1253l = c16385l;
    }
}
