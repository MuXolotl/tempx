package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؕٛؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3499l implements Function3 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7389l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C3499l f7386l = new C3499l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C3499l f7385l = new C3499l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C3499l f7388l = new C3499l(2);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C3499l f7387l = new C3499l(3);

    public /* synthetic */ C3499l(int i) {
        this.f7389l = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7389l) {
            case 0:
                try {
                    AbstractC12589l.m3422package((C18389l) obj2);
                    break;
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            case 1:
                long j = ((C9735l) obj).yandex;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.purchase(j) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    AbstractC9383l.yandex(AbstractC4927l.crashlytics(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), C1083l.license(AbstractC14055l.remoteconfig(new C9735l(j), new C9735l(AbstractC12953l.firebase(C9735l.loadAd(0.25f, j), C9735l.loadAd))), 0.0f, 0.0f, 14)), c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            default:
                return null;
        }
    }
}
