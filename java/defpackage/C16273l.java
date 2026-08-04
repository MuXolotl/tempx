package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lٌَٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16273l implements Ccatch {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f31844l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31845l = 1;

    public C16273l(Cstatic cstatic) {
        this.f31844l = cstatic;
    }

    @Override // defpackage.Ccatch
    public final InputStream amazon() {
        switch (this.f31845l) {
            case 0:
                return new C3135l((Cstatic) this.f31844l);
            default:
                return (C9774l) this.f31844l;
        }
    }

    @Override // defpackage.applovin
    public final Ccase billing() {
        switch (this.f31845l) {
            case 0:
                try {
                    return new C6864l(AbstractC7016l.crashlytics(new C3135l((Cstatic) this.f31844l)), null);
                } catch (IOException e) {
                    throw new Celse(AbstractC5020l.adcel(e, new StringBuilder("IOException converting stream to byte array: ")), e, 0);
                }
            default:
                try {
                    return smaato();
                } catch (IOException e2) {
                    throw new Celse(AbstractC5020l.adcel(e2, new StringBuilder("IOException converting stream to byte array: ")), e2, 0);
                }
        }
    }

    @Override // defpackage.InterfaceC12254l
    public final Ccase smaato() {
        switch (this.f31845l) {
            case 0:
                return new C6864l(AbstractC7016l.crashlytics(new C3135l((Cstatic) this.f31844l)), null);
            default:
                return new C11327l(((C9774l) this.f31844l).billing());
        }
    }

    public /* synthetic */ C16273l() {
    }
}
