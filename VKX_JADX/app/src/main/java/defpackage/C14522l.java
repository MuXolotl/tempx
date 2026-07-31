package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14522l {
    public final <T> InterfaceC16588l serializer(final InterfaceC16588l interfaceC16588l) {
        return new InterfaceC13593l() { // from class: lٖٖؔ
            private final InterfaceC18035l descriptor;

            {
                C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.RootItemsResponseDto", this, 2);
                c13637l.smaato("count", true);
                c13637l.smaato("items", true);
                this.descriptor = c13637l;
            }

            @Override // defpackage.InterfaceC13593l
            public final InterfaceC16588l[] amazon() {
                return new InterfaceC16588l[]{AbstractC7303l.crashlytics(C1313l.yandex), new C0087l(interfaceC16588l, 0)};
            }

            @Override // defpackage.InterfaceC16588l
            public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
                C11979l c11979l = (C11979l) obj;
                List list = c11979l.loadAd;
                Integer num = c11979l.yandex;
                InterfaceC18035l interfaceC18035l = this.descriptor;
                InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
                C14522l c14522l = C11979l.Companion;
                if (interfaceC0039lCrashlytics.ads() || num != null) {
                    interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, C1313l.yandex, num);
                }
                if (interfaceC0039lCrashlytics.ads() || !AbstractC8576l.yandex(list, C2580l.f5619l)) {
                    ((AbstractC4072l) interfaceC0039lCrashlytics).applovin(interfaceC18035l, 1, new C0087l(interfaceC16588l, 0), list);
                }
                interfaceC0039lCrashlytics.yandex(interfaceC18035l);
            }

            @Override // defpackage.InterfaceC16588l
            public final Object loadAd(InterfaceC10726l interfaceC10726l) {
                InterfaceC18035l interfaceC18035l = this.descriptor;
                InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
                boolean z = true;
                int i = 0;
                Integer num = null;
                List list = null;
                while (z) {
                    int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
                    if (iAdmob == -1) {
                        z = false;
                    } else if (iAdmob == 0) {
                        num = (Integer) interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, C1313l.yandex, num);
                        i |= 1;
                    } else {
                        if (iAdmob != 1) {
                            C8936l.mopub(iAdmob);
                            return null;
                        }
                        list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 1, new C0087l(interfaceC16588l, 0), list);
                        i |= 2;
                    }
                }
                interfaceC14988lCrashlytics.yandex(interfaceC18035l);
                return new C11979l(i, num, list);
            }

            @Override // defpackage.InterfaceC16588l
            public final InterfaceC18035l purchase() {
                return this.descriptor;
            }

            @Override // defpackage.InterfaceC13593l
            public final InterfaceC16588l[] yandex() {
                return new InterfaceC16588l[]{interfaceC16588l};
            }
        };
    }
}
