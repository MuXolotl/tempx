package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4879l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f9950l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f9951l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9952l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f9953l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f9954l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f9955l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4879l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(1);
        this.f9952l = i;
        this.f9954l = obj;
        this.f9950l = obj2;
        this.f9953l = obj3;
        this.f9955l = obj4;
        this.f9951l = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f9952l;
        Object obj2 = this.f9950l;
        Object obj3 = this.f9951l;
        Object obj4 = this.f9955l;
        Object obj5 = this.f9953l;
        Object obj6 = this.f9954l;
        switch (i) {
            case 0:
                C11941l c11941l = (C11941l) obj6;
                c11941l.f23790l.addView(c11941l, c11941l.f23793l);
                c11941l.metrica((Function0) obj2, (C12288l) obj5, (String) obj4, (EnumC9931l) obj3);
                return new C9582l(3, c11941l);
            case 1:
                return new C12266l((Function0) obj2, (InterfaceC8714l) obj6, (InterfaceC8714l) obj5, (InterfaceC2262l) obj4, (C2403l) obj3);
            case 2:
                long j = ((C1187l) obj).yandex;
                ((InterfaceC8714l) obj2).setValue(Boolean.TRUE);
                C1311l c1311l = new C1311l();
                AbstractC10999l.mopub((InterfaceC2262l) obj5, null, 0, new C17286l((C2403l) obj4, c1311l, null, 1), 3);
                ((InterfaceC8714l) obj3).setValue(c1311l);
                ((Function1) obj6).invoke(new C1187l(j));
                return Unit.INSTANCE;
            default:
                long j2 = ((C1187l) obj).yandex;
                AbstractC10999l.mopub((InterfaceC2262l) obj6, null, 0, new C17949l((C18297l) obj5, (InterfaceC8714l) obj4, (InterfaceC8714l) obj3, null, 18), 3);
                ((Function1) obj2).invoke(new C1187l(j2));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4879l(Function0 function0, InterfaceC8714l interfaceC8714l, InterfaceC8714l interfaceC8714l2, InterfaceC2262l interfaceC2262l, C2403l c2403l) {
        super(1);
        this.f9952l = 1;
        this.f9950l = function0;
        this.f9954l = interfaceC8714l;
        this.f9953l = interfaceC8714l2;
        this.f9955l = interfaceC2262l;
        this.f9951l = c2403l;
    }
}
