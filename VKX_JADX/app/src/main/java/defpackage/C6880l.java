package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.PublicKey;

/* JADX INFO: renamed from: lؙۥۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6880l implements PublicKey {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f14406l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10198l f14407l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C12378l f14408l;

    public C6880l(C0610l c0610l) {
        C12378l c12378l = c0610l.f2066l.metrica()[0];
        C10198l c10198l = c0610l.f2065l;
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c0610l.f2064l);
        this.f14408l = c12378l;
        this.f14407l = c10198l;
        this.f14406l = AbstractC14024l.crashlytics(bArrCrashlytics);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "ExternalKey";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            C10198l c10198l = new C10198l(InterfaceC2522l.f5458l);
            C12378l c12378l = this.f14408l;
            C10198l c10198l2 = this.f14407l;
            byte[] bArr = this.f14406l;
            C9018l c9018l = new C9018l(c12378l);
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(bArr);
            appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
            appmetricaVar.purchase(c9018l);
            appmetricaVar.purchase(c10198l2);
            appmetricaVar.purchase(new C11327l(bArrCrashlytics));
            C11138l c11138l = new C11138l(appmetricaVar);
            c11138l.f22357l = -1;
            C13353l c13353l = new C13353l(c11138l.remoteconfig("DER"), 0);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C11138l(c10198l, c13353l).tapsense(byteArrayOutputStream, "DER");
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            C8339l.smaato(AbstractC5020l.adcel(e, new StringBuilder("unable to encode composite key: ")));
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }
}
