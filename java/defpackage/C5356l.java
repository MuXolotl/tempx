package defpackage;

import j$.util.DesugarCollections;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lٌؘؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5356l implements InterfaceC13883l {
    public static final byte[] amazon = new byte[0];
    public static final Set purchase;
    public final C8904l crashlytics;
    public final AbstractC3302l loadAd;
    public final String yandex;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        purchase = DesugarCollections.unmodifiableSet(hashSet);
    }

    public C5356l(C13608l c13608l, C8904l c8904l) {
        if (!purchase.contains(c13608l.inmobi())) {
            C8339l.metrica(AbstractC15560l.Signature("Unsupported DEK key type: ", c13608l.inmobi(), ". Only Tink AEAD key types are supported."));
            throw null;
        }
        this.yandex = c13608l.inmobi();
        C5001l c5001lM3652synchronized = C13608l.m3652synchronized(c13608l);
        c5001lM3652synchronized.admob(EnumC9483l.RAW);
        this.loadAd = AbstractC2130l.billing(((C13608l) c5001lM3652synchronized.yandex()).purchase());
        this.crashlytics = c8904l;
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] loadAd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrLoadAd = this.crashlytics.loadAd(bArr3, amazon);
            String str = this.yandex;
            try {
                C14809l c14809l = AbstractC15257l.f29847l;
                return ((InterfaceC13883l) ((C3300l) C16233l.loadAd.yandex.get()).yandex(C5535l.loadAd.yandex(C11644l.m3137l(str, AbstractC15257l.mopub(0, bArrLoadAd.length, bArrLoadAd), C18176l.f35614l, C9358l.purchase, null)), InterfaceC13883l.class)).loadAd(bArr4, bArr2);
            } catch (NegativeArraySizeException e) {
                e = e;
                throw new GeneralSecurityException("invalid ciphertext", e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new GeneralSecurityException("invalid ciphertext", e);
            }
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e3) {
            e = e3;
        }
    }

    @Override // defpackage.InterfaceC13883l
    public final byte[] yandex(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AbstractC6968l abstractC6968lLoadAd = C13002l.loadAd.loadAd(this.loadAd, null);
        byte[] bArrYandex = this.crashlytics.yandex(((AbstractC15257l) C5535l.loadAd.mopub(abstractC6968lLoadAd).f23357l).firebase(), amazon);
        if (bArrYandex.length <= 4096) {
            byte[] bArrYandex2 = ((InterfaceC13883l) ((C3300l) C16233l.loadAd.yandex.get()).yandex(abstractC6968lLoadAd, InterfaceC13883l.class)).yandex(bArr, bArr2);
            return ByteBuffer.allocate(bArrYandex.length + 4 + bArrYandex2.length).putInt(bArrYandex.length).put(bArrYandex).put(bArrYandex2).array();
        }
        C18262l.ads("length of encrypted DEK too large");
        return null;
    }
}
