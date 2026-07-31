package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: lِٖۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16730l implements InterfaceC14090l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f32739l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f32740l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14090l f32741l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public CipherInputStream f32742l;

    public C16730l(InterfaceC14090l interfaceC14090l, byte[] bArr, byte[] bArr2) {
        this.f32741l = interfaceC14090l;
        this.f32740l = bArr;
        this.f32739l = bArr2;
    }

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        if (this.f32742l != null) {
            this.f32742l = null;
            this.f32741l.close();
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f32740l, "AES"), new IvParameterSpec(this.f32739l));
                C8162l c8162l = new C8162l(this.f32741l, c2432l);
                this.f32742l = new CipherInputStream(c8162l, cipher);
                c8162l.yandex();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                C11467l.metrica(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            C11467l.metrica(e2);
            return 0L;
        }
    }

    @Override // defpackage.InterfaceC14090l
    public final Map isPro() {
        return this.f32741l.isPro();
    }

    @Override // defpackage.InterfaceC14090l
    public final void metrica(C7713l c7713l) {
        c7713l.getClass();
        this.f32741l.metrica(c7713l);
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.f32742l.getClass();
        int i3 = this.f32742l.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        return this.f32741l.vip();
    }
}
