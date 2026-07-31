package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُْۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11021l extends AbstractC1387l {
    public static final C11021l admob;
    public static final C11021l billing;
    public static final C11021l mopub;
    public static final C11021l purchase;
    public final /* synthetic */ int amazon;

    static {
        int i = 1;
        purchase = new C11021l(i, 2, 0);
        int i2 = 1;
        billing = new C11021l(i2, i2, 1);
        mopub = new C11021l(i, 2, 2);
        int i3 = 1;
        admob = new C11021l(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11021l(int i, int i2, int i3) {
        super(i, i2, 1, (byte) 0);
        this.amazon = i3;
    }

    @Override // defpackage.AbstractC1387l
    public final void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        switch (this.amazon) {
            case 0:
                Object objInvoke = ((Function0) c12676l.admob(0)).invoke();
                C12317l c12317l = (C12317l) c12676l.admob(1);
                int iMopub = c12676l.mopub(0);
                c12317l.getClass();
                c13006l.m3517class(c13006l.crashlytics(c12317l), objInvoke);
                interfaceC3770l.Signature(iMopub, objInvoke);
                interfaceC3770l.admob(objInvoke);
                break;
            case 1:
                C12317l c12317l2 = (C12317l) c12676l.admob(0);
                int iMopub2 = c12676l.mopub(0);
                interfaceC3770l.adcel();
                c12317l2.getClass();
                interfaceC3770l.billing(iMopub2, c13006l.appmetrica(c13006l.crashlytics(c12317l2)));
                break;
            case 2:
                Object objAdmob = c12676l.admob(0);
                C12317l c12317l3 = (C12317l) c12676l.admob(1);
                int iMopub3 = c12676l.mopub(0);
                if (objAdmob instanceof InterfaceC17142l) {
                    InterfaceC17142l interfaceC17142l = (InterfaceC17142l) objAdmob;
                    ((C17893l) c15389l.purchase).crashlytics(interfaceC17142l);
                    ((C6295l) c15389l.amazon).yandex(interfaceC17142l);
                }
                Object objM3522native = c13006l.m3522native(c13006l.crashlytics(c12317l3), iMopub3, objAdmob);
                if (objM3522native instanceof InterfaceC17142l) {
                    c15389l.mopub((InterfaceC17142l) objM3522native);
                } else if (objM3522native instanceof C4224l) {
                    ((C4224l) objM3522native).crashlytics();
                }
                break;
            default:
                Object objAdmob2 = c12676l.admob(0);
                int iMopub4 = c12676l.mopub(0);
                if (objAdmob2 instanceof InterfaceC17142l) {
                    InterfaceC17142l interfaceC17142l2 = (InterfaceC17142l) objAdmob2;
                    ((C17893l) c15389l.purchase).crashlytics(interfaceC17142l2);
                    ((C6295l) c15389l.amazon).yandex(interfaceC17142l2);
                }
                Object objM3522native2 = c13006l.m3522native(c13006l.tapsense, iMopub4, objAdmob2);
                if (objM3522native2 instanceof InterfaceC17142l) {
                    c15389l.mopub((InterfaceC17142l) objM3522native2);
                } else if (objM3522native2 instanceof C4224l) {
                    ((C4224l) objM3522native2).crashlytics();
                }
                break;
        }
    }

    @Override // defpackage.AbstractC1387l
    public C12317l billing(C12676l c12676l) {
        switch (this.amazon) {
            case 0:
                return (C12317l) c12676l.admob(1);
            case 1:
                return (C12317l) c12676l.admob(0);
            default:
                return super.billing(c12676l);
        }
    }
}
