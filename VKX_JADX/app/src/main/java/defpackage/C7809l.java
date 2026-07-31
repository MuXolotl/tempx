package defpackage;

import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: renamed from: lًؗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7809l implements KeyStore.LoadStoreParameter {
    private final boolean forDEREncoding;
    private final C10198l macAlgorithm;
    private final OutputStream out;
    private final boolean overwriteFriendlyName;
    private final KeyStore.ProtectionParameter protectionParameter;
    private final boolean useISO8859d1ForDecryption;

    public C7809l(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z, boolean z2) {
        C10198l c10198l = new C10198l(InterfaceC4502l.billing, C14998l.f29509l);
        this.out = outputStream;
        this.protectionParameter = protectionParameter;
        this.forDEREncoding = z;
        this.overwriteFriendlyName = z2;
        this.macAlgorithm = c10198l;
        this.useISO8859d1ForDecryption = false;
    }

    public static C16698l builder(OutputStream outputStream, char[] cArr) {
        return builder(outputStream, new KeyStore.PasswordProtection(cArr));
    }

    public static C2480l pbmac1WithPBKDF2Builder() {
        C2480l c2480l = new C2480l();
        Cfor cfor = InterfaceC0543l.f1922throw;
        return c2480l;
    }

    public C10198l getMacAlgorithm() {
        return this.macAlgorithm;
    }

    public OutputStream getOutputStream() {
        return this.out;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.protectionParameter;
    }

    public boolean isForDEREncoding() {
        return this.forDEREncoding;
    }

    public boolean isOverwriteFriendlyName() {
        return this.overwriteFriendlyName;
    }

    public boolean useISO8859d1ForDecryption() {
        return this.useISO8859d1ForDecryption;
    }

    public static C16698l builder(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        return new C16698l(outputStream);
    }
}
