package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؚٗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16871l implements InterfaceC11759l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9159l f32924l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f32925l;

    public C16871l(C9159l c9159l, int i) {
        this.f32924l = c9159l;
        this.f32925l = i;
    }

    @Override // defpackage.InterfaceC11759l
    public final int adcel(C10023l c10023l, C4136l c4136l, int i) {
        C9159l c9159l = this.f32924l;
        if (c9159l.m2619package()) {
            return -3;
        }
        int i2 = this.f32925l;
        c9159l.premium(i2);
        int iSignatures = c9159l.f18817l[i2].signatures(c10023l, c4136l, i, c9159l.f18831l);
        if (iSignatures == -3) {
            c9159l.applovin(i2);
        }
        return iSignatures;
    }

    @Override // defpackage.InterfaceC11759l
    public final void firebase() throws IOException {
        int i = this.f32925l;
        C9159l c9159l = this.f32924l;
        C15637l c15637l = c9159l.f18817l[i];
        InterfaceC9655l interfaceC9655l = c15637l.admob;
        if (interfaceC9655l != null && interfaceC9655l.yandex() == 1) {
            C4684l c4684lMopub = c15637l.admob.mopub();
            c4684lMopub.getClass();
            throw c4684lMopub;
        }
        C18449l c18449l = c9159l.f18818l;
        int iLicense = c9159l.f18843l.license(c9159l.f18849l);
        IOException iOException = (IOException) c18449l.f36012l;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC9564l handlerC9564l = (HandlerC9564l) c18449l.f36009l;
        if (handlerC9564l != null) {
            if (iLicense == Integer.MIN_VALUE) {
                iLicense = handlerC9564l.f19484l;
            }
            IOException iOException2 = handlerC9564l.f19486l;
            if (iOException2 != null && handlerC9564l.f19489l > iLicense) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.InterfaceC11759l
    public final int smaato(long j) throws Throwable {
        C9159l c9159l = this.f32924l;
        if (c9159l.m2619package()) {
            return 0;
        }
        int i = this.f32925l;
        c9159l.premium(i);
        C15637l c15637l = c9159l.f18817l[i];
        int iSignature = c15637l.Signature(j, c9159l.f18831l);
        c15637l.m4096package(iSignature);
        if (iSignature == 0) {
            c9159l.applovin(i);
        }
        return iSignature;
    }

    @Override // defpackage.InterfaceC11759l
    public final boolean yandex() {
        C9159l c9159l = this.f32924l;
        return !c9159l.m2619package() && c9159l.f18817l[this.f32925l].pro(c9159l.f18831l);
    }
}
