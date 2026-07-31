package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lُؚِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7188l {
    public final C6064l amazon() {
        return this instanceof C6064l ? (C6064l) this : new C6064l(this);
    }

    public abstract void billing(C3631l c3631l, Object obj);

    public final Object crashlytics(String str) {
        C0869l c0869l = new C0869l();
        c0869l.m718l(str);
        C0396l c0396l = new C0396l(c0869l);
        Object objLoadAd = loadAd(c0396l);
        if (c0396l.m510while() == 10) {
            return objLoadAd;
        }
        C11467l.subscription("JSON document was not fully consumed.");
        return null;
    }

    public abstract Object loadAd(C0396l c0396l);

    public final String purchase(Object obj) {
        C0869l c0869l = new C0869l();
        try {
            billing(new C3631l(c0869l), obj);
            return c0869l.m703continue();
        } catch (IOException e) {
            C8339l.subs(e);
            return null;
        }
    }

    public final Object yandex(InterfaceC9473l interfaceC9473l) {
        return loadAd(new C0396l(interfaceC9473l));
    }
}
