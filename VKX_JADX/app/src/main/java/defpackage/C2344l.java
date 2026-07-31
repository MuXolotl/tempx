package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؔؒۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2344l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5099l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2186l f5100l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5101l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f5102l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f5103l;

    public C2344l(InterfaceC2186l interfaceC2186l, boolean z, C6402l c6402l, Function0 function0) {
        this.f5100l = interfaceC2186l;
        this.f5099l = z;
        this.f5102l = c6402l;
        this.f5103l = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f5101l;
        Object obj4 = this.f5102l;
        InterfaceC2186l interfaceC2186l = this.f5100l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                ((Number) obj3).intValue();
                c6956l.m2123default(-1525724089);
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == c13863l) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                C2403l c2403l = (C2403l) objM2132native;
                InterfaceC17242l interfaceC17242lYandex = AbstractC14631l.yandex(c4346l, c2403l, interfaceC2186l);
                Function0 function0 = this.f5103l;
                InterfaceC17242l interfaceC17242lPremium = interfaceC17242lYandex.premium(new C8057l(c2403l, null, false, this.f5099l, null, (C6402l) obj4, function0));
                c6956l.startapp(false);
                return interfaceC17242lPremium;
            default:
                C6956l c6956l2 = (C6956l) obj2;
                ((Number) obj3).intValue();
                c6956l2.m2123default(-1525724089);
                Object objM2132native2 = c6956l2.m2132native();
                if (objM2132native2 == c13863l) {
                    objM2132native2 = AbstractC14814l.isPro(c6956l2);
                }
                C2403l c2403l2 = (C2403l) objM2132native2;
                InterfaceC17242l interfaceC17242lPremium2 = AbstractC14631l.yandex(c4346l, c2403l2, interfaceC2186l).premium(new C17236l(null, c2403l2, null, this.f5103l, (Function0) obj4, false, this.f5099l));
                c6956l2.startapp(false);
                return interfaceC17242lPremium2;
        }
    }

    public C2344l(InterfaceC2186l interfaceC2186l, boolean z, Function0 function0, Function0 function1) {
        this.f5100l = interfaceC2186l;
        this.f5099l = z;
        this.f5103l = function0;
        this.f5102l = function1;
    }
}
