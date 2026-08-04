package defpackage;

import android.app.RemoteAction;
import android.view.autofill.AutofillManager;
import android.view.textclassifier.TextClassifier;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.cert.CertPath;
import java.security.cert.PKIXRevocationChecker;
import java.security.spec.InvalidKeySpecException;
import org.bouncycastle.jce.provider.AnnotatedException;

/* JADX INFO: renamed from: l٘ٝۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C18073l implements InterfaceC2785l, InterfaceC16004l {
    public static /* synthetic */ void Signature(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void ad(String str) {
        throw new C7727l(str);
    }

    public static /* synthetic */ void adcel(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void admob() {
        throw new IllegalStateException();
    }

    public static /* bridge */ /* synthetic */ boolean ads(Object obj) {
        return obj instanceof PKIXRevocationChecker;
    }

    public static /* bridge */ /* synthetic */ AutofillManager amazon(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class billing() {
        return AutofillManager.class;
    }

    public static /* synthetic */ void firebase(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void isPro(Object obj) throws IOException {
        throw new IOException("Error encoding certificate: " + ((Object) obj.toString()));
    }

    public static /* synthetic */ void license(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void metrica(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void pro(String str) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(str);
    }

    public static /* bridge */ /* synthetic */ TextClassifier purchase(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* synthetic */ void remoteconfig(String str, Exception exc, CertPath certPath, int i) throws C1524l {
        throw new C1524l(str, exc, certPath, i);
    }

    public static /* synthetic */ void smaato(String str) throws InvalidKeyException {
        throw new InvalidKeyException(str);
    }

    public static /* synthetic */ void startapp(String str, Throwable th) throws AnnotatedException {
        throw new AnnotatedException(str, th);
    }

    public static /* synthetic */ void subs(int i, int i2, Object obj, String str) {
        throw new IllegalStateException(str + i + obj + i2);
    }

    public static /* synthetic */ void subscription(String str) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(str);
    }

    public static /* synthetic */ void tapsense(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void vip(String str, Object obj, Object obj2, int i, int i2) {
        throw new IllegalArgumentException((str + obj + obj2 + i + ((char) i2)).toString());
    }

    public static /* bridge */ /* synthetic */ RemoteAction yandex(Object obj) {
        return (RemoteAction) obj;
    }

    @Override // defpackage.InterfaceC16004l
    /* JADX INFO: renamed from: apply */
    public Object mo1368apply(Object obj) {
        return C0466l.loadAd;
    }

    @Override // defpackage.InterfaceC2785l
    public void loadAd(InterfaceC15189l interfaceC15189l) {
    }
}
