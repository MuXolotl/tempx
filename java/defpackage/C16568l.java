package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؚٖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16568l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17984l f32528l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32529l;

    public /* synthetic */ C16568l(C17984l c17984l, int i) {
        this.f32529l = i;
        this.f32528l = c17984l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f32529l) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    int i = AbstractC15548l.yandex;
                    long j = C9735l.isPro;
                    C10707l c10707l = AbstractC16964l.yandex;
                    C15087l c15087lYandex = AbstractC15548l.yandex(j, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, c6956l, 472);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
                    C17984l c17984l = this.f32528l;
                    boolean zAdmob = c6956l.admob(c17984l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C13246l c13246l = new C13246l(0, c17984l, C17984l.class, "startAuth", "startAuth()V", 0, 0, 16);
                        c6956l.m2147try(c13246l);
                        objM2132native = c13246l;
                    }
                    AbstractC13319l.yandex(AbstractC4959l.metrica, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, AbstractC4959l.startapp, AbstractC14566l.amazon(1566362085, new C9759l(c17984l), c6956l), c15087lYandex, c6956l, 221190, 396);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                long jLongValue = ((Long) obj3).longValue();
                C17984l c17984l2 = this.f32528l;
                AbstractC9033l.crashlytics((AppActivity) c17984l2.isVip(), new C9718l(c17984l2, jLongValue, (String) obj, iIntValue2, (InterfaceC14029l) null));
                break;
        }
        return Unit.INSTANCE;
    }
}
