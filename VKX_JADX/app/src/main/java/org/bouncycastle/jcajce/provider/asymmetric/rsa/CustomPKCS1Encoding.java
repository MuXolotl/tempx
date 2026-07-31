package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import defpackage.AbstractC8151l;
import defpackage.AbstractC8776l;
import defpackage.AbstractC8831l;
import defpackage.C6114l;
import defpackage.C8339l;
import defpackage.InterfaceC5788l;
import defpackage.InterfaceC9719l;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class CustomPKCS1Encoding implements InterfaceC5788l {
    private static final int HEADER_LENGTH = 10;
    private byte[] blockBuffer;
    private InterfaceC5788l engine;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private SecureRandom random;
    private boolean useStrictLength = useStrict();

    public CustomPKCS1Encoding(InterfaceC5788l interfaceC5788l) {
        this.engine = interfaceC5788l;
    }

    private static int checkPkcs1Encoding1(byte[] bArr) {
        int i = 0;
        int i2 = -((bArr[0] & 255) ^ 1);
        int i3 = 0;
        for (int i4 = 1; i4 < bArr.length; i4++) {
            int i5 = bArr[i4] & 255;
            int i6 = (i5 - 1) >> 31;
            i ^= ((~i3) & i4) & i6;
            i3 |= i6;
            i2 |= ~((((i5 ^ 255) - 1) >> 31) | i3);
        }
        return ((bArr.length - 1) - i) | (((i - 9) | i2) >> 31);
    }

    private static int checkPkcs1Encoding2(byte[] bArr) {
        int i = 0;
        int i2 = -((bArr[0] & 255) ^ 2);
        int i3 = 0;
        for (int i4 = 1; i4 < bArr.length; i4++) {
            int i5 = ((bArr[i4] & 255) - 1) >> 31;
            i ^= ((~i3) & i4) & i5;
            i3 |= i5;
        }
        return ((bArr.length - 1) - i) | ((i2 | (i - 9)) >> 31);
    }

    private byte[] decodeBlock(byte[] bArr, int i, int i2) {
        int outputBlockSize = this.engine.getOutputBlockSize();
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i, i2);
        boolean z = this.useStrictLength & (bArrProcessBlock.length != outputBlockSize);
        byte[] bArr2 = bArrProcessBlock.length < outputBlockSize ? this.blockBuffer : bArrProcessBlock;
        int iCheckPkcs1Encoding2 = this.forPrivateKey ? checkPkcs1Encoding2(bArr2) : checkPkcs1Encoding1(bArr2);
        if (z || (iCheckPkcs1Encoding2 < 0)) {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            byte[] bArr3 = this.blockBuffer;
            Arrays.fill(bArr3, 0, Math.max(0, bArr3.length - bArrProcessBlock.length), (byte) 0);
            return null;
        }
        try {
            byte[] bArr4 = new byte[iCheckPkcs1Encoding2];
            System.arraycopy(bArr2, bArr2.length - iCheckPkcs1Encoding2, bArr4, 0, iCheckPkcs1Encoding2);
            return bArr4;
        } finally {
            Arrays.fill(bArrProcessBlock, (byte) 0);
            byte[] bArr5 = this.blockBuffer;
            Arrays.fill(bArr5, 0, Math.max(0, bArr5.length - bArrProcessBlock.length), (byte) 0);
        }
    }

    private byte[] encodeBlock(byte[] bArr, int i, int i2) {
        if (i2 > getInputBlockSize()) {
            C8339l.metrica("input data too large");
            return null;
        }
        int inputBlockSize = this.engine.getInputBlockSize();
        byte[] bArr2 = new byte[inputBlockSize];
        if (this.forPrivateKey) {
            bArr2[0] = 1;
            for (int i3 = 1; i3 != (inputBlockSize - i2) - 1; i3++) {
                bArr2[i3] = -1;
            }
        } else {
            this.random.nextBytes(bArr2);
            bArr2[0] = 2;
            for (int i4 = 1; i4 != (inputBlockSize - i2) - 1; i4++) {
                while (bArr2[i4] == 0) {
                    bArr2[i4] = (byte) this.random.nextInt();
                }
            }
        }
        int i5 = inputBlockSize - i2;
        bArr2[i5 - 1] = 0;
        System.arraycopy(bArr, i, bArr2, i5, i2);
        return this.engine.processBlock(bArr2, 0, inputBlockSize);
    }

    private boolean useStrict() {
        if (AbstractC8151l.amazon("org.bouncycastle.pkcs1.not_strict", true)) {
            return false;
        }
        return !AbstractC8151l.amazon("org.bouncycastle.pkcs1.strict", false);
    }

    @Override // defpackage.InterfaceC5788l
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? inputBlockSize - 10 : inputBlockSize;
    }

    @Override // defpackage.InterfaceC5788l
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : outputBlockSize - 10;
    }

    public InterfaceC5788l getUnderlyingCipher() {
        return this.engine;
    }

    @Override // defpackage.InterfaceC5788l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        AbstractC8831l abstractC8831l;
        if (interfaceC9719l instanceof C6114l) {
            C6114l c6114l = (C6114l) interfaceC9719l;
            this.random = c6114l.f12904l;
            abstractC8831l = (AbstractC8831l) c6114l.f12903l;
        } else {
            abstractC8831l = (AbstractC8831l) interfaceC9719l;
            if (!abstractC8831l.f18137l && z) {
                this.random = AbstractC8776l.loadAd();
            }
        }
        this.engine.init(z, interfaceC9719l);
        this.forPrivateKey = abstractC8831l.f18137l;
        this.forEncryption = z;
        this.blockBuffer = new byte[this.engine.getOutputBlockSize()];
    }

    @Override // defpackage.InterfaceC5788l
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        return this.forEncryption ? encodeBlock(bArr, i, i2) : decodeBlock(bArr, i, i2);
    }
}
