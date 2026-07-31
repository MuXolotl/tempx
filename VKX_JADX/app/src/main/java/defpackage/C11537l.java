package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًِؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11537l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f23205l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f23206l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23207l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f23208l;

    public /* synthetic */ C11537l(InterfaceC8714l interfaceC8714l, Function1 function1, InterfaceC8714l interfaceC8714l2) {
        this.f23207l = 0;
        this.f23205l = interfaceC8714l;
        this.f23206l = function1;
        this.f23208l = interfaceC8714l2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f23207l;
        InterfaceC8714l interfaceC8714l = this.f23208l;
        InterfaceC8714l interfaceC8714l2 = this.f23205l;
        Function1 function1 = this.f23206l;
        switch (i) {
            case 0:
                C1336l c1336l = (C1336l) obj;
                AbstractC18082l abstractC18082l = (AbstractC18082l) interfaceC8714l2.getValue();
                c1336l.firebase(abstractC18082l.pro(), null, new C2214l(abstractC18082l, 0), new C15578l(802480018, true, new C6780l(abstractC18082l, function1, 0)));
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-740317719, true, new C2266l(interfaceC8714l, 0)), 3);
                break;
            case 1:
                C0639l c0639l = (C0639l) obj;
                interfaceC8714l2.setValue(c0639l);
                boolean zYandex = AbstractC8576l.yandex((String) interfaceC8714l.getValue(), c0639l.yandex.f7563l);
                C3625l c3625l = c0639l.yandex;
                interfaceC8714l.setValue(c3625l.f7563l);
                if (!zYandex) {
                    function1.invoke(c3625l.f7563l);
                }
                break;
            default:
                if (((C0639l) interfaceC8714l2.getValue()).yandex.f7563l.length() > 0) {
                    interfaceC8714l.setValue(Boolean.FALSE);
                    Float fMetrica = AbstractC12673l.metrica(((C0639l) interfaceC8714l2.getValue()).yandex.f7563l);
                    if (fMetrica != null) {
                        function1.invoke(fMetrica);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C11537l(Function1 function1, InterfaceC8714l interfaceC8714l, InterfaceC8714l interfaceC8714l2, int i) {
        this.f23207l = i;
        this.f23206l = function1;
        this.f23205l = interfaceC8714l;
        this.f23208l = interfaceC8714l2;
    }
}
