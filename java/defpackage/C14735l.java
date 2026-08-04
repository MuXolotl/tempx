package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lؚٔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14735l extends SecureRandom {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC13380l f28812l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f28813l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC14314l f28814l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public InterfaceC4190l f28815l;

    public C14735l(InterfaceC13380l interfaceC13380l, InterfaceC14314l interfaceC14314l, boolean z) {
        this.f28812l = interfaceC13380l;
        this.f28814l = interfaceC14314l;
        this.f28813l = z;
    }

    @Override // java.security.SecureRandom
    public final byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        int i2 = i * 8;
        InterfaceC13380l interfaceC13380l = this.f28812l;
        if (i2 <= interfaceC13380l.entropySize()) {
            System.arraycopy(interfaceC13380l.getEntropy(), 0, bArr, 0, i);
            return bArr;
        }
        int iEntropySize = interfaceC13380l.entropySize() / 8;
        for (int i3 = 0; i3 < i; i3 += iEntropySize) {
            byte[] entropy = interfaceC13380l.getEntropy();
            int i4 = i - i3;
            if (entropy.length <= i4) {
                System.arraycopy(entropy, 0, bArr, i3, entropy.length);
            } else {
                System.arraycopy(entropy, 0, bArr, i3, i4);
            }
        }
        return bArr;
    }

    @Override // java.security.SecureRandom
    public final String getAlgorithm() {
        return this.f28814l.getAlgorithm();
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void nextBytes(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.f28815l == null) {
                    this.f28815l = this.f28814l.tapsense(this.f28812l);
                }
                if (this.f28815l.amazon(this.f28813l, bArr) < 0) {
                    this.f28815l.purchase(null);
                    this.f28815l.amazon(this.f28813l, bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public final void setSeed(long j) {
        synchronized (this) {
        }
    }

    public final void yandex(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.f28815l == null) {
                    this.f28815l = this.f28814l.tapsense(this.f28812l);
                }
                this.f28815l.purchase(bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.SecureRandom
    public final void setSeed(byte[] bArr) {
        synchronized (this) {
        }
    }
}
