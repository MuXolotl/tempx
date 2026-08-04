package defpackage;

/* JADX INFO: renamed from: lؓؖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1620l {
    public final <T> InterfaceC16588l serializer(final InterfaceC16588l interfaceC16588l) {
        return new InterfaceC13593l() { // from class: lِٙ٘
            private final InterfaceC18035l descriptor;

            {
                C13637l c13637l = new C13637l("bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse", this, 2);
                c13637l.smaato("response", true);
                c13637l.smaato("error", true);
                this.descriptor = c13637l;
            }

            @Override // defpackage.InterfaceC13593l
            public final InterfaceC16588l[] amazon() {
                return new InterfaceC16588l[]{AbstractC7303l.crashlytics(interfaceC16588l), AbstractC7303l.crashlytics(C14862l.yandex)};
            }

            @Override // defpackage.InterfaceC16588l
            public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
                C0951l c0951l = (C0951l) obj;
                C4513l c4513l = c0951l.loadAd;
                Object obj2 = c0951l.yandex;
                InterfaceC18035l interfaceC18035l = this.descriptor;
                InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
                C1620l c1620l = C0951l.Companion;
                if (interfaceC0039lCrashlytics.ads() || obj2 != null) {
                    interfaceC0039lCrashlytics.startapp(interfaceC18035l, 0, interfaceC16588l, obj2);
                }
                if (interfaceC0039lCrashlytics.ads() || c4513l != null) {
                    interfaceC0039lCrashlytics.startapp(interfaceC18035l, 1, C14862l.yandex, c4513l);
                }
                interfaceC0039lCrashlytics.yandex(interfaceC18035l);
            }

            @Override // defpackage.InterfaceC16588l
            public final Object loadAd(InterfaceC10726l interfaceC10726l) {
                InterfaceC18035l interfaceC18035l = this.descriptor;
                InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
                boolean z = true;
                int i = 0;
                Object objAd = null;
                C4513l c4513l = null;
                while (z) {
                    int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
                    if (iAdmob == -1) {
                        z = false;
                    } else if (iAdmob == 0) {
                        objAd = interfaceC14988lCrashlytics.ad(interfaceC18035l, 0, interfaceC16588l, objAd);
                        i |= 1;
                    } else {
                        if (iAdmob != 1) {
                            C8936l.mopub(iAdmob);
                            return null;
                        }
                        c4513l = (C4513l) interfaceC14988lCrashlytics.ad(interfaceC18035l, 1, C14862l.yandex, c4513l);
                        i |= 2;
                    }
                }
                interfaceC14988lCrashlytics.yandex(interfaceC18035l);
                return new C0951l(i, objAd, c4513l);
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
