package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٌۨۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9232l implements InterfaceC4121l {
    public final /* synthetic */ int yandex;
    public static final C9232l loadAd = new C9232l(0);
    public static final C9232l crashlytics = new C9232l(1);

    public /* synthetic */ C9232l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC4121l
    public final /* bridge */ String crashlytics(C12113l c12113l) {
        switch (this.yandex) {
            case 0:
                break;
        }
        return AbstractC9966l.smaato(this, c12113l);
    }

    @Override // defpackage.InterfaceC4121l
    public final boolean loadAd(C12113l c12113l) {
        AbstractC15211l abstractC15211lAdcel;
        switch (this.yandex) {
            case 0:
                C17538l c17538l = (C17538l) c12113l.mo1007finally().get(1);
                C2183l c2183l = C3182l.amazon;
                int i = AbstractC3759l.yandex;
                InterfaceC11865l interfaceC11865lCrashlytics = AbstractC11125l.crashlytics(c17538l);
                c2183l.getClass();
                InterfaceC17477l interfaceC17477lAmazon = AbstractC9033l.amazon(interfaceC11865lCrashlytics, AbstractC3333l.f7082case);
                if (interfaceC17477lAmazon == null) {
                    abstractC15211lAdcel = null;
                } else {
                    C16017l.f31395l.getClass();
                    abstractC15211lAdcel = AbstractC3605l.adcel(C16017l.f31394l, interfaceC17477lAmazon, Collections.singletonList(new C12768l((InterfaceC16902l) AbstractC16901l.m4208abstract(interfaceC17477lAmazon.metrica().getParameters()))));
                }
                if (abstractC15211lAdcel == null) {
                    return false;
                }
                return InterfaceC17975l.yandex.loadAd(abstractC15211lAdcel, AbstractC12008l.mopub(c17538l.yandex(), false));
            default:
                List<C17538l> listMo1007finally = c12113l.mo1007finally();
                if (!listMo1007finally.isEmpty()) {
                    for (C17538l c17538l2 : listMo1007finally) {
                        if (AbstractC3759l.yandex(c17538l2) || c17538l2.f34151l != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // defpackage.InterfaceC4121l
    public final String yandex() {
        switch (this.yandex) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
