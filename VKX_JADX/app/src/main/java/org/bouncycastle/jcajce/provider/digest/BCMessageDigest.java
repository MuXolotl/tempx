package org.bouncycastle.jcajce.provider.digest;

import defpackage.InterfaceC16922l;
import java.security.DigestException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class BCMessageDigest extends MessageDigest {
    protected InterfaceC16922l digest;
    protected int digestSize;

    public BCMessageDigest(InterfaceC16922l interfaceC16922l) {
        super(interfaceC16922l.getAlgorithmName());
        this.digest = interfaceC16922l;
        this.digestSize = interfaceC16922l.getDigestSize();
    }

    @Override // java.security.MessageDigestSpi
    public int engineDigest(byte[] bArr, int i, int i2) throws DigestException {
        int i3 = this.digestSize;
        if (i2 < i3) {
            throw new DigestException("partial digests not returned");
        }
        if (bArr.length - i < i3) {
            throw new DigestException("insufficient space in the output buffer to store the digest");
        }
        this.digest.doFinal(bArr, i);
        return this.digestSize;
    }

    @Override // java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return this.digestSize;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.digest.reset();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        this.digest.update(b);
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        byte[] bArr = new byte[this.digestSize];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }
}
