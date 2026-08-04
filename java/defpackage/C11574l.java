package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11574l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f23252l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f23253l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23254l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f23255l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f23256l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f23257l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11574l(C11941l c11941l, Function0 function0, C12288l c12288l, String str, EnumC9931l enumC9931l) {
        super(0);
        this.f23254l = 2;
        this.f23256l = c11941l;
        this.f23252l = function0;
        this.f23253l = c12288l;
        this.f23255l = str;
        this.f23257l = enumC9931l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f23254l;
        Object obj = this.f23257l;
        Object obj2 = this.f23255l;
        Object obj3 = this.f23253l;
        Function0 function0 = this.f23252l;
        Object obj4 = this.f23256l;
        switch (i) {
            case 0:
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj3;
                C1311l c1311l = (C1311l) ((InterfaceC8714l) obj4).getValue();
                if (c1311l != null) {
                    AbstractC10999l.mopub((InterfaceC2262l) obj2, null, 0, new C17286l((C2403l) obj, c1311l, null, 2), 3);
                }
                if (((Boolean) interfaceC8714l.getValue()).booleanValue()) {
                    function0.invoke();
                }
                interfaceC8714l.setValue(Boolean.FALSE);
                break;
            case 1:
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj3;
                C1311l c1311l2 = (C1311l) ((InterfaceC8714l) obj4).getValue();
                if (c1311l2 != null) {
                    AbstractC10999l.mopub((InterfaceC2262l) obj2, null, 0, new C17286l((C2403l) obj, c1311l2, null, 3), 3);
                }
                if (((Boolean) interfaceC8714l2.getValue()).booleanValue()) {
                    function0.invoke();
                }
                interfaceC8714l2.setValue(Boolean.FALSE);
                break;
            default:
                ((C11941l) obj4).metrica(function0, (C12288l) obj3, (String) obj2, (EnumC9931l) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11574l(Function0 function0, InterfaceC8714l interfaceC8714l, InterfaceC2262l interfaceC2262l, C2403l c2403l, InterfaceC8714l interfaceC8714l2, int i) {
        super(0);
        this.f23254l = i;
        this.f23252l = function0;
        this.f23256l = interfaceC8714l;
        this.f23255l = interfaceC2262l;
        this.f23257l = c2403l;
        this.f23253l = interfaceC8714l2;
    }
}
