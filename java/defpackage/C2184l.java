package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓۡۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2184l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f4829l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4830l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4831l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4832l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f4833l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f4834l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f4835l;

    public /* synthetic */ C2184l(C16016l c16016l, int i, int i2, Function1 function1, Function1 function2, InterfaceC8714l interfaceC8714l) {
        this.f4834l = c16016l;
        this.f4831l = i;
        this.f4829l = i2;
        this.f4833l = function1;
        this.f4835l = function2;
        this.f4830l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f4832l;
        Object obj2 = this.f4830l;
        Object obj3 = this.f4835l;
        Object obj4 = this.f4833l;
        Object obj5 = this.f4834l;
        switch (i) {
            case 0:
                AbstractC9383l.loadAd((AbstractC9601l) obj, (AbstractC10113l) obj5, (InterfaceC6357l) obj4, ((InterfaceC7448l) obj3).getLayoutDirection(), this.f4831l, this.f4829l, ((C13538l) obj2).yandex);
                break;
            default:
                C16016l c16016l = (C16016l) obj5;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj2;
                C1336l c1336l = (C1336l) obj;
                List list = c16016l.yandex;
                c1336l.firebase(list.size(), null, new C13512l(list, 7, false), new C15578l(2039820996, true, new C4423l(list, this.f4831l, this.f4829l, (Function1) obj4, (Function1) obj3, interfaceC8714l)));
                String str = c16016l.loadAd;
                if (str != null && str.length() > 0) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(493215258, true, new C17359l(c16016l, 1)), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C2184l(AbstractC10113l abstractC10113l, InterfaceC6357l interfaceC6357l, InterfaceC7448l interfaceC7448l, int i, int i2, C13538l c13538l) {
        this.f4834l = abstractC10113l;
        this.f4833l = interfaceC6357l;
        this.f4835l = interfaceC7448l;
        this.f4831l = i;
        this.f4829l = i2;
        this.f4830l = c13538l;
    }
}
