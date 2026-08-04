package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّۨٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13025l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C11644l f25510l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f25511l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f25512l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13025l(C11644l c11644l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f25511l = i;
        this.f25510l = c11644l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f25511l;
        C11644l c11644l = this.f25510l;
        Object obj2 = this.f25512l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                ((C10086l) c11644l.f23361l).setValue(((C1725l) obj2).yandex.loadAd);
                break;
            case 1:
                AbstractC2829l.crashlytics(obj);
                ((C10086l) c11644l.f23361l).setValue(((C1725l) obj2).yandex.loadAd);
                break;
            case 2:
                AbstractC2829l.crashlytics(obj);
                ((C10086l) c11644l.f23358l).setValue(((C11134l) obj2).yandex);
                break;
            case 3:
                C14759l c14759l = (C14759l) obj2;
                AbstractC2829l.crashlytics(obj);
                ((C10086l) c11644l.f23357l).setValue(c14759l.yandex);
                ((C10086l) c11644l.f23362l).setValue(Boolean.valueOf(c14759l.loadAd));
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                ((C10086l) c11644l.f23360l).setValue(((C5075l) obj2).yandex);
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f25511l;
        C11644l c11644l = this.f25510l;
        switch (i) {
            case 0:
                C13025l c13025l = new C13025l(c11644l, interfaceC14029l, 0);
                c13025l.f25512l = obj;
                return c13025l;
            case 1:
                C13025l c13025l2 = new C13025l(c11644l, interfaceC14029l, 1);
                c13025l2.f25512l = obj;
                return c13025l2;
            case 2:
                C13025l c13025l3 = new C13025l(c11644l, interfaceC14029l, 2);
                c13025l3.f25512l = obj;
                return c13025l3;
            case 3:
                C13025l c13025l4 = new C13025l(c11644l, interfaceC14029l, 3);
                c13025l4.f25512l = obj;
                return c13025l4;
            default:
                C13025l c13025l5 = new C13025l(c11644l, interfaceC14029l, 4);
                c13025l5.f25512l = obj;
                return c13025l5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25511l) {
            case 0:
                return ((C13025l) ads((InterfaceC14029l) obj2, (C1725l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C13025l) ads((InterfaceC14029l) obj2, (C1725l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C13025l) ads((InterfaceC14029l) obj2, (C11134l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C13025l) ads((InterfaceC14029l) obj2, (C14759l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C13025l) ads((InterfaceC14029l) obj2, (C5075l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
