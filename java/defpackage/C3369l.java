package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْؕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3369l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1774l f7173l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7174l = 1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7174l;
        C1774l c1774l = this.f7173l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c1774l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7741l.purchase(((C14288l) c1774l.f4197l.getValue()).crashlytics, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(AbstractC3605l.startapp(C4346l.f8873l, 16.0f, 0.0f, 8.0f, 0.0f, 10), 42.0f), AbstractC7497l.yandex), new C18627l(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads), null, null, c6956l, 4144, 0, 32752);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3369l(C1774l c1774l, int i) {
        this.f7173l = c1774l;
    }
}
