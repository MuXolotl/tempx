package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC14024l;
import defpackage.AbstractC8831l;
import defpackage.C11702l;
import defpackage.C16833l;
import defpackage.C18073l;
import defpackage.C18119l;
import defpackage.C6114l;
import defpackage.C7633l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC9719l;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDeterministicOrRandomSignature extends SignatureSpi {
    protected AlgorithmParameters engineParams;
    protected AbstractC8831l keyParams;
    protected C16833l paramSpec;
    private final InterfaceC12575l helper = new C7633l();
    protected boolean isInitState = true;
    private final AlgorithmParameterSpec originalSpec = C16833l.f32861l;

    public BaseDeterministicOrRandomSignature(String str) {
    }

    private void reInit() {
        InterfaceC9719l c11702l;
        boolean z;
        InterfaceC9719l interfaceC9719l;
        InterfaceC9719l c6114l;
        AbstractC8831l abstractC8831l = this.keyParams;
        if (abstractC8831l.f18137l) {
            SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
            if (secureRandom != null) {
                c6114l = abstractC8831l;
                c6114l = new C6114l(abstractC8831l, secureRandom);
            }
            c6114l = abstractC8831l;
            C16833l c16833l = this.paramSpec;
            InterfaceC9719l c11702l2 = c6114l;
            if (c16833l != null) {
                c11702l2 = new C11702l(c6114l, AbstractC14024l.crashlytics(c16833l.f32862l));
            }
            z = true;
            interfaceC9719l = c11702l2;
        } else {
            C16833l c16833l2 = this.paramSpec;
            if (c16833l2 != null) {
                c11702l = abstractC8831l;
                c11702l = new C11702l(abstractC8831l, AbstractC14024l.crashlytics(c16833l2.f32862l));
            }
            c11702l = abstractC8831l;
            z = false;
            interfaceC9719l = c11702l;
        }
        reInitialize(z, interfaceC9719l);
    }

    @Override // java.security.SignatureSpi
    public final Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("GetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public final AlgorithmParameters engineGetParameters() {
        C16833l c16833l;
        if (this.engineParams == null && (c16833l = this.paramSpec) != null && c16833l != C16833l.f32861l) {
            try {
                AlgorithmParameters algorithmParametersAdvert = this.helper.advert("CONTEXT");
                this.engineParams = algorithmParametersAdvert;
                algorithmParametersAdvert.init(this.paramSpec);
            } catch (Exception e) {
                throw new IllegalStateException(e.toString(), e);
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey) {
        signInit(privateKey, null);
        this.paramSpec = C16833l.f32861l;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    public final void engineInitVerify(PublicKey publicKey) {
        verifyInit(publicKey);
        this.paramSpec = C16833l.f32861l;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null && (algorithmParameterSpec = this.originalSpec) == null) {
            return;
        }
        if (!this.isInitState) {
            throw new ProviderException("cannot call setParameter in the middle of update");
        }
        if (algorithmParameterSpec instanceof C16833l) {
            this.paramSpec = (C16833l) algorithmParameterSpec;
            reInit();
            return;
        }
        byte[] bArr = (byte[]) AccessController.doPrivileged(new C18119l(algorithmParameterSpec, 1));
        if (bArr == null) {
            C18073l.pro("unknown AlgorithmParameterSpec in signature");
        } else {
            this.paramSpec = new C16833l(bArr);
            reInit();
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte b) {
        this.isInitState = false;
        updateEngine(b);
    }

    public abstract void reInitialize(boolean z, InterfaceC9719l interfaceC9719l);

    public abstract void signInit(PrivateKey privateKey, SecureRandom secureRandom);

    public abstract void updateEngine(byte b);

    public abstract void updateEngine(byte[] bArr, int i, int i2);

    public abstract void verifyInit(PublicKey publicKey);

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        this.isInitState = false;
        updateEngine(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        signInit(privateKey, secureRandom);
        this.paramSpec = C16833l.f32861l;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("SetParameter unsupported");
    }
}
