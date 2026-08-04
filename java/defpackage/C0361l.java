package defpackage;

import java.util.Hashtable;

/* JADX INFO: renamed from: lٖؑۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0361l implements InterfaceC2232l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Hashtable f1423l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f1424l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f1425l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f1426l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC16922l f1427l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC11512l f1428l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public InterfaceC11512l f1429l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f1430l;

    static {
        Hashtable hashtable = new Hashtable();
        f1423l = hashtable;
        hashtable.put("GOST3411", 32);
        hashtable.put("MD2", 16);
        hashtable.put("MD4", 64);
        hashtable.put("MD5", 64);
        hashtable.put("RIPEMD128", 64);
        hashtable.put("RIPEMD160", 64);
        hashtable.put("SHA-1", 64);
        hashtable.put("SHA-224", 64);
        hashtable.put("SHA-256", 64);
        hashtable.put("SHA-384", 128);
        hashtable.put("SHA-512", 128);
        hashtable.put("Tiger", 64);
        hashtable.put("Whirlpool", 64);
    }

    public C0361l(InterfaceC16922l interfaceC16922l) {
        int iIntValue;
        if (interfaceC16922l instanceof InterfaceC9273l) {
            iIntValue = ((InterfaceC9273l) interfaceC16922l).getByteLength();
        } else {
            Integer num = (Integer) f1423l.get(interfaceC16922l.getAlgorithmName());
            if (num == null) {
                C18262l.startapp(interfaceC16922l.getAlgorithmName(), "unknown digest passed: ");
                throw null;
            }
            iIntValue = num.intValue();
        }
        this.f1427l = interfaceC16922l;
        int digestSize = interfaceC16922l.getDigestSize();
        this.f1426l = digestSize;
        this.f1424l = iIntValue;
        this.f1430l = new byte[iIntValue];
        this.f1425l = new byte[iIntValue + digestSize];
    }

    @Override // defpackage.InterfaceC2232l
    public final int doFinal(byte[] bArr, int i) {
        InterfaceC16922l interfaceC16922l = this.f1427l;
        byte[] bArr2 = this.f1425l;
        int i2 = this.f1424l;
        interfaceC16922l.doFinal(bArr2, i2);
        InterfaceC11512l interfaceC11512l = this.f1428l;
        if (interfaceC11512l != null) {
            ((InterfaceC11512l) interfaceC16922l).loadAd(interfaceC11512l);
            interfaceC16922l.update(bArr2, i2, interfaceC16922l.getDigestSize());
        } else {
            interfaceC16922l.update(bArr2, 0, bArr2.length);
        }
        int iDoFinal = interfaceC16922l.doFinal(bArr, 0);
        while (i2 < bArr2.length) {
            bArr2[i2] = 0;
            i2++;
        }
        InterfaceC11512l interfaceC11512l2 = this.f1429l;
        if (interfaceC11512l2 != null) {
            ((InterfaceC11512l) interfaceC16922l).loadAd(interfaceC11512l2);
            return iDoFinal;
        }
        byte[] bArr3 = this.f1430l;
        interfaceC16922l.update(bArr3, 0, bArr3.length);
        return iDoFinal;
    }

    @Override // defpackage.InterfaceC2232l
    public final String getAlgorithmName() {
        return this.f1427l.getAlgorithmName() + "/HMAC";
    }

    @Override // defpackage.InterfaceC2232l
    public final int getMacSize() {
        return this.f1426l;
    }

    @Override // defpackage.InterfaceC2232l
    public final void init(InterfaceC9719l interfaceC9719l) {
        InterfaceC16922l interfaceC16922l = this.f1427l;
        interfaceC16922l.reset();
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        int length = bArr.length;
        byte[] bArr2 = this.f1430l;
        int i = this.f1424l;
        if (length > i) {
            interfaceC16922l.update(bArr, 0, length);
            interfaceC16922l.doFinal(bArr2, 0);
            length = this.f1426l;
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        while (length < bArr2.length) {
            bArr2[length] = 0;
            length++;
        }
        byte[] bArr3 = this.f1425l;
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            bArr2[i2] = (byte) (bArr2[i2] ^ 54);
        }
        for (int i3 = 0; i3 < i; i3++) {
            bArr3[i3] = (byte) (bArr3[i3] ^ 92);
        }
        boolean z = interfaceC16922l instanceof InterfaceC11512l;
        if (z) {
            InterfaceC11512l interfaceC11512lYandex = ((InterfaceC11512l) interfaceC16922l).yandex();
            this.f1428l = interfaceC11512lYandex;
            ((InterfaceC16922l) interfaceC11512lYandex).update(bArr3, 0, i);
        }
        interfaceC16922l.update(bArr2, 0, bArr2.length);
        if (z) {
            this.f1429l = ((InterfaceC11512l) interfaceC16922l).yandex();
        }
    }

    @Override // defpackage.InterfaceC2232l
    public final void reset() {
        InterfaceC11512l interfaceC11512l = this.f1429l;
        InterfaceC16922l interfaceC16922l = this.f1427l;
        if (interfaceC11512l != null) {
            ((InterfaceC11512l) interfaceC16922l).loadAd(interfaceC11512l);
            return;
        }
        interfaceC16922l.reset();
        byte[] bArr = this.f1430l;
        interfaceC16922l.update(bArr, 0, bArr.length);
    }

    @Override // defpackage.InterfaceC2232l
    public final void update(byte b) {
        this.f1427l.update(b);
    }

    @Override // defpackage.InterfaceC2232l
    public final void update(byte[] bArr, int i, int i2) {
        this.f1427l.update(bArr, i, i2);
    }
}
