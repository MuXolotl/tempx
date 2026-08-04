package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؓۗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2051l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f4586l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f4587l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2051l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f4586l = i2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        float f = 0.0f;
        Throwable th = null;
        boolean z = true;
        boolean z2 = false;
        switch (this.f4586l) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                AbstractC5387l abstractC5387l = (AbstractC5387l) this.f4587l;
                if (!(abstractC5387l instanceof C11968l) && !(abstractC5387l instanceof C8172l)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                AbstractC2829l.crashlytics(obj);
                return Boolean.valueOf(((AbstractC5387l) this.f4587l) instanceof C8172l);
            case 2:
                AbstractC10022l abstractC10022l = (AbstractC10022l) this.f4587l;
                AbstractC2829l.crashlytics(obj);
                return Boolean.valueOf(AbstractC8576l.yandex(abstractC10022l.mopub(), C2759l.f5983l));
            case 3:
                AbstractC10022l abstractC10022l2 = (AbstractC10022l) this.f4587l;
                AbstractC2829l.crashlytics(obj);
                InterfaceC1814l interfaceC1814l = abstractC10022l2.loadAd().f27846l;
                if (interfaceC1814l == null) {
                    interfaceC1814l = null;
                }
                if (interfaceC1814l.getAttributes().billing(AbstractC0105l.loadAd) != null) {
                    C18725l.loadAd();
                }
                return null;
            case 4:
                AbstractC2829l.crashlytics(obj);
                return Boolean.valueOf(!(((AbstractC5387l) this.f4587l) instanceof C2797l));
            case 5:
                AbstractC12669l abstractC12669l = (AbstractC12669l) this.f4587l;
                AbstractC2829l.crashlytics(obj);
                return Boolean.valueOf(!(abstractC12669l instanceof C15647l));
            case 6:
                C3597l c3597l = (C3597l) this.f4587l;
                AbstractC2829l.crashlytics(obj);
                C15744l c15744l = c3597l.f7519l;
                int i = 6;
                C15744l c15744lLoadAd = c15744l != null ? C15744l.loadAd(c15744l, false, 0.0f, 6) : new C15744l(f, i, z2);
                C15744l c15744l2 = c3597l.f7533l;
                C15744l c15744lLoadAd2 = c15744l2 != null ? C15744l.loadAd(c15744l2, false, 0.0f, 6) : new C15744l(f, i, z2);
                C15744l c15744l3 = c3597l.f7532l;
                C15744l c15744lLoadAd3 = c15744l3 != null ? C15744l.loadAd(c15744l3, false, 0.0f, 6) : new C15744l(f, i, z2);
                C15744l c15744l4 = c3597l.f7529l;
                return C3597l.loadAd(c3597l, null, null, null, null, c15744lLoadAd3, c15744l4 != null ? C15744l.loadAd(c15744l4, false, 0.0f, 6) : new C15744l(f, i, z2), c15744lLoadAd, c15744lLoadAd2, 129151);
            case 7:
                AbstractC8870l abstractC8870l = (AbstractC8870l) this.f4587l;
                AbstractC2829l.crashlytics(obj);
                return Boolean.valueOf(abstractC8870l != null);
            case 8:
                C3278l c3278l = (C3278l) this.f4587l;
                AbstractC2829l.crashlytics(obj);
                return C3278l.loadAd(c3278l, false, null, null, true, 191);
            case 9:
                C16811l c16811l = (C16811l) this.f4587l;
                AbstractC2829l.crashlytics(obj);
                c16811l.adcel();
                c16811l.stop();
                c16811l.release();
                return Unit.INSTANCE;
            case 10:
                AbstractC2829l.crashlytics(obj);
                return Boolean.valueOf(((EnumC6767l) this.f4587l) == EnumC6767l.f14180l);
            case 11:
                AbstractC2829l.crashlytics(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f4587l));
                return Unit.INSTANCE;
            case 12:
                AbstractC2829l.crashlytics(obj);
                return Boolean.valueOf(!AbstractC8576l.yandex((AbstractC5387l) this.f4587l, C2797l.yandex));
            case 13:
                AbstractC2829l.crashlytics(obj);
                ((C12469l) this.f4587l).yandex(0.0f);
                return Unit.INSTANCE;
            case 14:
                InterfaceC3393l interfaceC3393l = (InterfaceC3393l) this.f4587l;
                AbstractC2829l.crashlytics(obj);
                return Boolean.valueOf(AbstractC8576l.yandex(interfaceC3393l, C2675l.yandex));
            case 15:
                EnumC0920l enumC0920l = (EnumC0920l) this.f4587l;
                AbstractC2829l.crashlytics(obj);
                return Boolean.valueOf(enumC0920l != EnumC0920l.f2595l);
            case 16:
                AbstractC2829l.crashlytics(obj);
                C12382l c12382l = AbstractC5921l.f12465l;
                C13434l.yandex.getClass();
                String str = C14025l.f27330l;
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                C7167l c7167l = new C7167l(c12382l.mo691continue(C6162l.ads(vKXApplication.getFilesDir()).purchase("vkx_eq_custom.json"), false));
                try {
                    C15913l c15913l = AbstractC8237l.amazon;
                    C11362l c11362l = C13434l.purchase;
                    c15913l.getClass();
                    AbstractC10802l.crashlytics(c15913l, new C5138l(17, c7167l), new C0087l(C11359l.Companion.serializer(), 0), c11362l);
                    Unit unit = Unit.INSTANCE;
                    try {
                        c7167l.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    break;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        c7167l.close();
                    } catch (Throwable th4) {
                        AbstractC11718l.yandex(th, th4);
                    }
                    break;
                }
                if (th == null) {
                    return Unit.INSTANCE;
                }
                throw th;
            default:
                C15343l c15343l = (C15343l) this.f4587l;
                AbstractC2829l.crashlytics(obj);
                return C15343l.loadAd(c15343l, 0, 0, 0, 0, 0, 0, false, false, false, false, C14054l.f27396l, 0, false, 15359);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f4586l) {
            case 0:
                C2051l c2051l = new C2051l(2, interfaceC14029l, 0);
                c2051l.f4587l = obj;
                return c2051l;
            case 1:
                C2051l c2051l2 = new C2051l(2, interfaceC14029l, 1);
                c2051l2.f4587l = obj;
                return c2051l2;
            case 2:
                C2051l c2051l3 = new C2051l(2, interfaceC14029l, 2);
                c2051l3.f4587l = obj;
                return c2051l3;
            case 3:
                C2051l c2051l4 = new C2051l(2, interfaceC14029l, 3);
                c2051l4.f4587l = obj;
                return c2051l4;
            case 4:
                C2051l c2051l5 = new C2051l(2, interfaceC14029l, 4);
                c2051l5.f4587l = obj;
                return c2051l5;
            case 5:
                C2051l c2051l6 = new C2051l(2, interfaceC14029l, 5);
                c2051l6.f4587l = obj;
                return c2051l6;
            case 6:
                C2051l c2051l7 = new C2051l(2, interfaceC14029l, 6);
                c2051l7.f4587l = obj;
                return c2051l7;
            case 7:
                C2051l c2051l8 = new C2051l(2, interfaceC14029l, 7);
                c2051l8.f4587l = obj;
                return c2051l8;
            case 8:
                C2051l c2051l9 = new C2051l(2, interfaceC14029l, 8);
                c2051l9.f4587l = obj;
                return c2051l9;
            case 9:
                C2051l c2051l10 = new C2051l(2, interfaceC14029l, 9);
                c2051l10.f4587l = obj;
                return c2051l10;
            case 10:
                C2051l c2051l11 = new C2051l(2, interfaceC14029l, 10);
                c2051l11.f4587l = obj;
                return c2051l11;
            case 11:
                C2051l c2051l12 = new C2051l(2, interfaceC14029l, 11);
                c2051l12.f4587l = obj;
                return c2051l12;
            case 12:
                C2051l c2051l13 = new C2051l(2, interfaceC14029l, 12);
                c2051l13.f4587l = obj;
                return c2051l13;
            case 13:
                C2051l c2051l14 = new C2051l(2, interfaceC14029l, 13);
                c2051l14.f4587l = obj;
                return c2051l14;
            case 14:
                C2051l c2051l15 = new C2051l(2, interfaceC14029l, 14);
                c2051l15.f4587l = obj;
                return c2051l15;
            case 15:
                C2051l c2051l16 = new C2051l(2, interfaceC14029l, 15);
                c2051l16.f4587l = obj;
                return c2051l16;
            case 16:
                C2051l c2051l17 = new C2051l(2, interfaceC14029l, 16);
                c2051l17.f4587l = obj;
                return c2051l17;
            default:
                C2051l c2051l18 = new C2051l(2, interfaceC14029l, 17);
                c2051l18.f4587l = obj;
                return c2051l18;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f4586l) {
            case 0:
                return ((C2051l) ads((InterfaceC14029l) obj2, (AbstractC5387l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C2051l) ads((InterfaceC14029l) obj2, (AbstractC5387l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C2051l) ads((InterfaceC14029l) obj2, (AbstractC10022l) obj)).Signature(Unit.INSTANCE);
            case 3:
                ((C2051l) ads((InterfaceC14029l) obj2, (AbstractC10022l) obj)).Signature(Unit.INSTANCE);
                return null;
            case 4:
                return ((C2051l) ads((InterfaceC14029l) obj2, (AbstractC5387l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C2051l) ads((InterfaceC14029l) obj2, (AbstractC12669l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C2051l) ads((InterfaceC14029l) obj2, (C3597l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C2051l) ads((InterfaceC14029l) obj2, (AbstractC8870l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C2051l) ads((InterfaceC14029l) obj2, (C3278l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C2051l) ads((InterfaceC14029l) obj2, (C16811l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C2051l) ads((InterfaceC14029l) obj2, (EnumC6767l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C2051l) ads((InterfaceC14029l) obj2, (String) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C2051l) ads((InterfaceC14029l) obj2, (AbstractC5387l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C2051l) ads((InterfaceC14029l) obj2, (C12469l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C2051l) ads((InterfaceC14029l) obj2, (InterfaceC3393l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C2051l) ads((InterfaceC14029l) obj2, (EnumC0920l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C2051l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C2051l) ads((InterfaceC14029l) obj2, (C15343l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
