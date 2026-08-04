package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒۥ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1470l extends AbstractC16840l {
    public final /* synthetic */ Serializable amazon;
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ int loadAd;

    public C1470l(C10700l c10700l, Function1 function1) {
        this.loadAd = 1;
        this.amazon = c10700l;
        this.crashlytics = function1;
    }

    @Override // defpackage.AbstractC16840l
    public final boolean amazon(Object obj) {
        int i = this.loadAd;
        Object obj2 = this.crashlytics;
        Object obj3 = this.amazon;
        switch (i) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                if (((Boolean) ((Function1) obj2).invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                return ((C10700l) obj3).f21708l == null;
            default:
                InterfaceC17477l interfaceC17477l = (InterfaceC17477l) obj;
                C10700l c10700l = (C10700l) obj3;
                String str = (String) obj2;
                String str2 = C4632l.yandex;
                C3624l c3624lAdmob = C4632l.admob(AbstractC3759l.mopub(interfaceC17477l).yandex);
                String strAdmob = AbstractC11043l.admob('.', c3624lAdmob != null ? C8353l.purchase(c3624lAdmob) : C0516l.yandex(interfaceC17477l, C18450l.f36014l), str);
                if (C2602l.loadAd.contains(strAdmob)) {
                    c10700l.f21708l = EnumC13860l.f27096l;
                } else if (C2602l.amazon.contains(strAdmob)) {
                    c10700l.f21708l = EnumC13860l.f27095l;
                } else if (C2602l.crashlytics.contains(strAdmob)) {
                    c10700l.f21708l = EnumC13860l.f27094l;
                } else if (C2602l.yandex.contains(strAdmob)) {
                    c10700l.f21708l = EnumC13860l.f27097l;
                }
                return c10700l.f21708l == null;
        }
    }

    @Override // defpackage.AbstractC16840l
    public final Object billing() {
        int i = this.loadAd;
        Object obj = this.amazon;
        switch (i) {
            case 0:
                return Boolean.valueOf(((boolean[]) obj)[0]);
            case 1:
                return (InterfaceC0207l) ((C10700l) obj).f21708l;
            default:
                EnumC13860l enumC13860l = (EnumC13860l) ((C10700l) obj).f21708l;
                return enumC13860l == null ? EnumC13860l.f27098l : enumC13860l;
        }
    }

    @Override // defpackage.AbstractC16840l
    public void loadAd(Object obj) {
        switch (this.loadAd) {
            case 1:
                InterfaceC0207l interfaceC0207l = (InterfaceC0207l) obj;
                C10700l c10700l = (C10700l) this.amazon;
                if (c10700l.f21708l == null && ((Boolean) ((Function1) this.crashlytics).invoke(interfaceC0207l)).booleanValue()) {
                    c10700l.f21708l = interfaceC0207l;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C1470l(Object obj, Serializable serializable, int i) {
        this.loadAd = i;
        this.crashlytics = obj;
        this.amazon = serializable;
    }
}
