package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.AbstractC12900l;
import defpackage.AbstractC14024l;
import defpackage.C0649l;
import defpackage.C18229l;
import defpackage.C2275l;
import defpackage.InterfaceC12575l;
import defpackage.advert;
import defpackage.applovin;
import java.io.IOException;
import java.security.cert.CRLException;

/* JADX INFO: loaded from: classes3.dex */
class X509CRLObject extends X509CRLImpl {
    private final Object cacheLock;
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CRLInternal internalCRLValue;

    public X509CRLObject(InterfaceC12575l interfaceC12575l, C0649l c0649l) {
        super(interfaceC12575l, c0649l, createSigAlgName(c0649l), createSigAlgParams(c0649l), isIndirectCRL(c0649l));
        this.cacheLock = new Object();
    }

    private static String createSigAlgName(C0649l c0649l) throws X509CRLException {
        try {
            return X509SignatureUtil.getSignatureName(c0649l.f2108l);
        } catch (Exception e) {
            throw new X509CRLException(AbstractC12900l.admob(e, new StringBuilder("CRL contents invalid: ")), e);
        }
    }

    private static byte[] createSigAlgParams(C0649l c0649l) throws CRLException {
        try {
            applovin applovinVar = c0649l.f2108l.f20786l;
            if (applovinVar == null) {
                return null;
            }
            return applovinVar.billing().remoteconfig("DER");
        } catch (Exception e) {
            throw new CRLException("CRL contents invalid: " + e);
        }
    }

    private X509CRLInternal getInternalCRL() {
        byte[] bArrRemoteconfig;
        X509CRLException x509CRLException;
        X509CRLInternal x509CRLInternal;
        synchronized (this.cacheLock) {
            try {
                X509CRLInternal x509CRLInternal2 = this.internalCRLValue;
                if (x509CRLInternal2 != null) {
                    return x509CRLInternal2;
                }
                try {
                    bArrRemoteconfig = this.c.remoteconfig("DER");
                    x509CRLException = null;
                } catch (IOException e) {
                    bArrRemoteconfig = null;
                    x509CRLException = new X509CRLException(e);
                }
                X509CRLInternal x509CRLInternal3 = new X509CRLInternal(this.bcHelper, this.c, this.sigAlgName, this.sigAlgParams, this.isIndirect, bArrRemoteconfig, x509CRLException);
                synchronized (this.cacheLock) {
                    try {
                        if (this.internalCRLValue == null) {
                            this.internalCRLValue = x509CRLInternal3;
                        }
                        x509CRLInternal = this.internalCRLValue;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return x509CRLInternal;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean isIndirectCRL(C0649l c0649l) throws ExtCRLException {
        try {
            byte[] extensionOctets = X509CRLImpl.getExtensionOctets(c0649l, C18229l.f35729l);
            if (extensionOctets == null) {
                return false;
            }
            return C2275l.metrica(extensionOctets).f4969l;
        } catch (Exception e) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    @Override // java.security.cert.X509CRL
    public boolean equals(Object obj) {
        X509CRLInternal internalCRL;
        advert advertVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof X509CRLObject) {
            X509CRLObject x509CRLObject = (X509CRLObject) obj;
            if (this.hashValueSet && x509CRLObject.hashValueSet) {
                if (this.hashValue != x509CRLObject.hashValue) {
                    return false;
                }
            } else if ((this.internalCRLValue == null || x509CRLObject.internalCRLValue == null) && (advertVar = this.c.f2107l) != null && !advertVar.ad(x509CRLObject.c.f2107l)) {
                return false;
            }
            internalCRL = getInternalCRL();
            obj = x509CRLObject.getInternalCRL();
        } else {
            internalCRL = getInternalCRL();
        }
        return internalCRL.equals(obj);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() {
        return AbstractC14024l.crashlytics(getInternalCRL().getEncoded());
    }

    @Override // java.security.cert.X509CRL
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = getInternalCRL().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    public static class X509CRLException extends CRLException {
        private final Throwable cause;

        public X509CRLException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public X509CRLException(Throwable th) {
            this.cause = th;
        }
    }
}
