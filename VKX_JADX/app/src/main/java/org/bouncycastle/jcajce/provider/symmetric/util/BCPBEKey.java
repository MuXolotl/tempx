package org.bouncycastle.jcajce.provider.symmetric.util;

import defpackage.AbstractC11186l;
import defpackage.AbstractC14024l;
import defpackage.C0272l;
import defpackage.C13886l;
import defpackage.C8339l;
import defpackage.Cfor;
import defpackage.InterfaceC9719l;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes3.dex */
public class BCPBEKey implements PBEKey, Destroyable {
    String algorithm;
    int digest;
    private final AtomicBoolean hasBeenDestroyed;
    private final int iterationCount;
    int ivSize;
    int keySize;
    Cfor oid;
    private final InterfaceC9719l param;
    private final char[] password;
    private final byte[] salt;
    boolean tryWrong;
    int type;

    public BCPBEKey(String str, Cfor cfor, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, InterfaceC9719l interfaceC9719l) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.tryWrong = false;
        this.algorithm = str;
        this.oid = cfor;
        this.type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.password = pBEKeySpec.getPassword();
        this.iterationCount = pBEKeySpec.getIterationCount();
        this.salt = pBEKeySpec.getSalt();
        this.param = interfaceC9719l;
    }

    public static void checkDestroyed(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            C8339l.smaato("key has been destroyed");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.hasBeenDestroyed.getAndSet(true)) {
            return;
        }
        char[] cArr = this.password;
        if (cArr != null) {
            Arrays.fill(cArr, (char) 0);
        }
        byte[] bArr = this.salt;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        String str = this.algorithm;
        checkDestroyed(this);
        return str;
    }

    public int getDigest() {
        int i = this.digest;
        checkDestroyed(this);
        return i;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArrPKCS5PasswordToUTF8Bytes;
        InterfaceC9719l interfaceC9719l = this.param;
        if (interfaceC9719l != null) {
            if (interfaceC9719l instanceof C0272l) {
                interfaceC9719l = ((C0272l) interfaceC9719l).f1272l;
            }
            bArrPKCS5PasswordToUTF8Bytes = ((C13886l) interfaceC9719l).f27156l;
        } else {
            int i = this.type;
            if (i == 2) {
                bArrPKCS5PasswordToUTF8Bytes = AbstractC11186l.PKCS12PasswordToBytes(this.password);
            } else {
                char[] cArr = this.password;
                bArrPKCS5PasswordToUTF8Bytes = i == 5 ? AbstractC11186l.PKCS5PasswordToUTF8Bytes(cArr) : AbstractC11186l.PKCS5PasswordToBytes(cArr);
            }
        }
        checkDestroyed(this);
        return bArrPKCS5PasswordToUTF8Bytes;
    }

    @Override // java.security.Key
    public String getFormat() {
        checkDestroyed(this);
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        int i = this.iterationCount;
        checkDestroyed(this);
        return i;
    }

    public int getIvSize() {
        int i = this.ivSize;
        checkDestroyed(this);
        return i;
    }

    public int getKeySize() {
        int i = this.keySize;
        checkDestroyed(this);
        return i;
    }

    public Cfor getOID() {
        Cfor cfor = this.oid;
        checkDestroyed(this);
        return cfor;
    }

    public InterfaceC9719l getParam() {
        InterfaceC9719l interfaceC9719l = this.param;
        checkDestroyed(this);
        return interfaceC9719l;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        char[] cArr = this.password;
        char[] cArr2 = cArr == null ? null : (char[]) cArr.clone();
        checkDestroyed(this);
        if (cArr2 != null) {
            return cArr2;
        }
        C8339l.smaato("no password available");
        return null;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(this.salt);
        checkDestroyed(this);
        return bArrCrashlytics;
    }

    public int getType() {
        int i = this.type;
        checkDestroyed(this);
        return i;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }

    public void setTryWrongPKCS12Zero(boolean z) {
        this.tryWrong = z;
    }

    public boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }

    public BCPBEKey(String str, InterfaceC9719l interfaceC9719l) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.tryWrong = false;
        this.algorithm = str;
        this.param = interfaceC9719l;
        this.password = null;
        this.iterationCount = -1;
        this.salt = null;
    }
}
