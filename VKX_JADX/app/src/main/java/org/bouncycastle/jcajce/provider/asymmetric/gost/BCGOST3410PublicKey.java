package org.bouncycastle.jcajce.provider.asymmetric.gost;

import defpackage.C0277l;
import defpackage.C0419l;
import defpackage.C10198l;
import defpackage.C11327l;
import defpackage.C11853l;
import defpackage.C13777l;
import defpackage.C17029l;
import defpackage.C6230l;
import defpackage.C8339l;
import defpackage.C9669l;
import defpackage.Cfor;
import defpackage.InterfaceC11987l;
import defpackage.InterfaceC9920l;
import defpackage.InterfaceC9935l;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

/* JADX INFO: loaded from: classes3.dex */
public class BCGOST3410PublicKey implements InterfaceC9920l {
    static final long serialVersionUID = -6251023343619275990L;
    private transient InterfaceC9935l gost3410Spec;
    private BigInteger y;

    public BCGOST3410PublicKey(C17029l c17029l) {
        C13777l c13777lVip = C13777l.vip(c17029l.f33175l.f20786l);
        try {
            byte[] bArr = ((C11327l) c17029l.metrica()).f36593l;
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i != bArr.length; i++) {
                bArr2[i] = bArr[(bArr.length - 1) - i];
            }
            this.y = new BigInteger(1, bArr2);
            this.gost3410Spec = C6230l.yandex(c13777lVip);
        } catch (IOException unused) {
            C8339l.metrica("invalid info structure in GOST3410 public key");
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new C6230l(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            return;
        }
        this.gost3410Spec = new C6230l(new C0419l((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object obj;
        objectOutputStream.defaultWriteObject();
        InterfaceC9935l interfaceC9935l = this.gost3410Spec;
        if (((C6230l) interfaceC9935l).f13161l != null) {
            obj = ((C6230l) interfaceC9935l).f13161l;
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(((C6230l) this.gost3410Spec).f13162l.yandex);
            objectOutputStream.writeObject(((C6230l) this.gost3410Spec).f13162l.loadAd);
            obj = ((C6230l) this.gost3410Spec).f13162l.crashlytics;
        }
        objectOutputStream.writeObject(obj);
        objectOutputStream.writeObject(((C6230l) this.gost3410Spec).f13160l);
        objectOutputStream.writeObject(((C6230l) this.gost3410Spec).f13163l);
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCGOST3410PublicKey) {
            BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
            if (this.y.equals(bCGOST3410PublicKey.y) && this.gost3410Spec.equals(bCGOST3410PublicKey.gost3410Spec)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] byteArray = getY().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        try {
            InterfaceC9935l interfaceC9935l = this.gost3410Spec;
            return KeyUtil.getEncodedSubjectPublicKeyInfo(interfaceC9935l instanceof C6230l ? ((C6230l) interfaceC9935l).f13163l != null ? new C17029l(new C10198l(InterfaceC11987l.firebase, new C13777l(new Cfor(((C6230l) this.gost3410Spec).f13161l), new Cfor(((C6230l) this.gost3410Spec).f13160l), new Cfor(((C6230l) this.gost3410Spec).f13163l))), new C11327l(bArr)) : new C17029l(new C10198l(InterfaceC11987l.firebase, new C13777l(new Cfor(((C6230l) this.gost3410Spec).f13161l), new Cfor(((C6230l) this.gost3410Spec).f13160l))), new C11327l(bArr)) : new C17029l(new C10198l(InterfaceC11987l.firebase), new C11327l(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // defpackage.InterfaceC3016l
    public InterfaceC9935l getParameters() {
        return this.gost3410Spec;
    }

    @Override // defpackage.InterfaceC9920l
    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return this.gost3410Spec.hashCode() ^ this.y.hashCode();
    }

    public String toString() {
        try {
            return GOSTUtil.publicKeyToString("GOST3410", this.y, (C0277l) ((C9669l) GOST3410Util.generatePublicKeyParameter(this)).f16541l);
        } catch (InvalidKeyException e) {
            C8339l.smaato(e.getMessage());
            return null;
        }
    }

    public BCGOST3410PublicKey(C9669l c9669l, C6230l c6230l) {
        this.y = c9669l.f19749l;
        this.gost3410Spec = c6230l;
    }

    public BCGOST3410PublicKey(C11853l c11853l) {
        this.y = c11853l.f23679l;
        this.gost3410Spec = new C6230l(new C0419l(c11853l.f23678l, c11853l.f23677l, c11853l.f23680l));
    }

    public BCGOST3410PublicKey(InterfaceC9920l interfaceC9920l) {
        this.y = interfaceC9920l.getY();
        this.gost3410Spec = interfaceC9920l.getParameters();
    }

    public BCGOST3410PublicKey(BigInteger bigInteger, C6230l c6230l) {
        this.y = bigInteger;
        this.gost3410Spec = c6230l;
    }
}
