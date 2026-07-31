package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٌٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16283l {
    public final <C> InterfaceC16588l serializer(final InterfaceC16588l interfaceC16588l) {
        return new InterfaceC13593l() { // from class: lؗؖٔ
            private final InterfaceC18035l descriptor;

            {
                C13637l c13637l = new C13637l("com.arkivanov.decompose.router.pages.SerializablePages", this, 2);
                c13637l.smaato("items", false);
                c13637l.smaato("selectedIndex", false);
                this.descriptor = c13637l;
            }

            @Override // defpackage.InterfaceC13593l
            public final InterfaceC16588l[] amazon() {
                return new InterfaceC16588l[]{new C0087l(interfaceC16588l, 0), C1313l.yandex};
            }

            @Override // defpackage.InterfaceC16588l
            public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
                C16049l c16049l = (C16049l) obj;
                InterfaceC18035l interfaceC18035l = this.descriptor;
                InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035l);
                C16283l c16283l = C16049l.Companion;
                AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
                abstractC4072l.applovin(interfaceC18035l, 0, new C0087l(interfaceC16588l, 0), c16049l.yandex);
                abstractC4072l.signatures(1, c16049l.loadAd, interfaceC18035l);
                interfaceC0039lCrashlytics.yandex(interfaceC18035l);
            }

            @Override // defpackage.InterfaceC16588l
            public final Object loadAd(InterfaceC10726l interfaceC10726l) {
                InterfaceC18035l interfaceC18035l = this.descriptor;
                InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035l);
                boolean z = true;
                int i = 0;
                int iSubscription = 0;
                List list = null;
                while (z) {
                    int iAdmob = interfaceC14988lCrashlytics.admob(interfaceC18035l);
                    if (iAdmob == -1) {
                        z = false;
                    } else if (iAdmob == 0) {
                        list = (List) interfaceC14988lCrashlytics.ads(interfaceC18035l, 0, new C0087l(interfaceC16588l, 0), list);
                        i |= 1;
                    } else {
                        if (iAdmob != 1) {
                            C8936l.mopub(iAdmob);
                            return null;
                        }
                        iSubscription = interfaceC14988lCrashlytics.subscription(interfaceC18035l, 1);
                        i |= 2;
                    }
                }
                interfaceC14988lCrashlytics.yandex(interfaceC18035l);
                return new C16049l(i, iSubscription, list);
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
