package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15569l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f30407l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7324l f30408l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30409l;

    public /* synthetic */ C15569l(InterfaceC17242l interfaceC17242l, C7324l c7324l) {
        this.f30409l = 0;
        this.f30407l = interfaceC17242l;
        this.f30408l = c7324l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f30409l;
        InterfaceC17242l interfaceC17242l = this.f30407l;
        C7324l c7324l = this.f30408l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C2209l c2209l = AbstractC8209l.yandex;
                    AbstractC16291l.crashlytics(this.f30407l, null, AbstractC8209l.yandex(((C10936l) c6956l.isPro(AbstractC10689l.yandex)).isPro(), 0L, c6956l, 0, 2), AbstractC14566l.amazon(-1278699168, new C1350l(0, c7324l), c6956l), c6956l, 54);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                c7324l.yandex(interfaceC17242l, (C6956l) obj, AbstractC0545l.purchase(7));
                break;
            case 2:
                ((Integer) obj2).getClass();
                c7324l.admob(interfaceC17242l, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                ((Integer) obj2).getClass();
                c7324l.mopub(interfaceC17242l, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15569l(C7324l c7324l, InterfaceC17242l interfaceC17242l, int i, int i2) {
        this.f30409l = i2;
        this.f30408l = c7324l;
        this.f30407l = interfaceC17242l;
    }
}
