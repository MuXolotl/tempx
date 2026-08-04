package defpackage;

import android.util.SparseArray;
import androidx.car.app.hardware.common.CarZone;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَٗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10348l implements InterfaceC2232l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Cloneable f21132l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Cloneable f21133l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f21134l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f21135l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f21136l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Cloneable f21137l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Cloneable f21138l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f21139l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Cloneable f21140l;

    /* JADX WARN: Type inference failed for: r0v10, types: [byte[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [byte[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [byte[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [byte[], java.lang.Cloneable] */
    public C10348l(InterfaceC10952l interfaceC10952l) {
        int iLicense = interfaceC10952l.license() * 8;
        if (iLicense % 8 != 0) {
            C8339l.metrica("MAC size must be multiple of 8");
            throw null;
        }
        if (iLicense > interfaceC10952l.license() * 8) {
            C10754l.smaato(interfaceC10952l.license() * 8, "MAC size must be less or equal to ");
            throw null;
        }
        this.f21139l = new C4998l(interfaceC10952l);
        this.f21135l = iLicense / 8;
        int iLicense2 = interfaceC10952l.license() * 8;
        int i = 135;
        switch (iLicense2) {
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 320:
                i = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i = 45;
                break;
            case 224:
                i = 777;
                break;
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                i = 1061;
                break;
            case 384:
                i = 4109;
                break;
            case 448:
                i = 2129;
                break;
            case AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE /* 512 */:
                i = 293;
                break;
            case 768:
                i = 655377;
                break;
            case 1024:
                i = 524355;
                break;
            case 2048:
                i = 548865;
                break;
            default:
                C8339l.metrica(AbstractC0653l.vip(iLicense2, "Unknown block size for CMAC: "));
                throw null;
        }
        ?? r0 = new byte[4];
        AbstractC10000l.isPro(i, 0, r0);
        this.f21132l = r0;
        this.f21137l = new byte[interfaceC10952l.license()];
        this.f21140l = new byte[interfaceC10952l.license()];
        this.f21138l = new byte[interfaceC10952l.license()];
        this.f21136l = 0;
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        Object obj;
        byte[] bArr2 = (byte[]) this.f21137l;
        byte[] bArr3 = (byte[]) this.f21140l;
        C4998l c4998l = (C4998l) this.f21139l;
        int iLicense = c4998l.f10232l.license();
        int i2 = this.f21136l;
        if (i2 == iLicense) {
            obj = this.f21133l;
        } else {
            int length = bArr3.length;
            bArr3[i2] = -128;
            while (true) {
                i2++;
                if (i2 >= bArr3.length) {
                    break;
                }
                bArr3[i2] = 0;
            }
            obj = this.f21134l;
        }
        byte[] bArr4 = (byte[]) obj;
        for (int i3 = 0; i3 < bArr2.length; i3++) {
            bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i3]);
        }
        c4998l.tapsense(0, 0, bArr3, bArr2);
        int i4 = this.f21135l;
        System.arraycopy(bArr2, 0, bArr, 0, i4);
        reset();
        return i4;
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        return ((C4998l) this.f21139l).getAlgorithmName();
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return this.f21135l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.lang.Cloneable] */
    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        C4998l c4998l = (C4998l) this.f21139l;
        if (interfaceC9719l != null && !(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica("CMac mode only permits key to be set.");
            return;
        }
        c4998l.init(true, interfaceC9719l);
        byte[] bArr = (byte[]) this.f21138l;
        byte[] bArr2 = new byte[bArr.length];
        c4998l.tapsense(0, 0, bArr, bArr2);
        ?? Yandex = yandex(bArr2);
        this.f21133l = Yandex;
        this.f21134l = yandex(Yandex);
        reset();
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f21140l;
            if (i >= bArr.length) {
                this.f21136l = 0;
                ((C4998l) this.f21139l).reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = (byte[]) this.f21137l;
        byte[] bArr3 = (byte[]) this.f21140l;
        C4998l c4998l = (C4998l) this.f21139l;
        if (i2 < 0) {
            C8339l.metrica("Can't have a negative input length!");
            return;
        }
        int iLicense = c4998l.f10232l.license();
        int i3 = this.f21136l;
        int i4 = iLicense - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, bArr3, i3, i4);
            c4998l.tapsense(0, 0, bArr3, bArr2);
            this.f21136l = 0;
            i2 -= i4;
            i += i4;
            while (i2 > iLicense) {
                c4998l.tapsense(i, 0, bArr, bArr2);
                i2 -= iLicense;
                i += iLicense;
            }
        }
        System.arraycopy(bArr, i, bArr3, this.f21136l, i2);
        this.f21136l += i2;
    }

    public byte[] yandex(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                int i2 = (-i) & 255;
                int length2 = bArr.length - 3;
                byte b = bArr2[length2];
                byte[] bArr3 = (byte[]) this.f21132l;
                bArr2[length2] = (byte) (b ^ (bArr3[1] & i2));
                int length3 = bArr.length - 2;
                bArr2[length3] = (byte) ((bArr3[2] & i2) ^ bArr2[length3]);
                int length4 = bArr.length - 1;
                bArr2[length4] = (byte) ((bArr3[3] & i2) ^ bArr2[length4]);
                return bArr2;
            }
            int i3 = bArr[length] & 255;
            bArr2[length] = (byte) (i | (i3 << 1));
            i = (i3 >>> 7) & 1;
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) {
        int i = this.f21136l;
        byte[] bArr = (byte[]) this.f21140l;
        if (i == bArr.length) {
            ((C4998l) this.f21139l).tapsense(0, 0, bArr, (byte[]) this.f21137l);
            this.f21136l = 0;
        }
        int i2 = this.f21136l;
        this.f21136l = i2 + 1;
        bArr[i2] = b;
    }

    public C10348l(int i, int i2) {
        this.f21136l = i;
        this.f21135l = i2;
        this.f21132l = new SparseArray();
        this.f21138l = new SparseArray();
        this.f21137l = new SparseArray();
        this.f21140l = new SparseArray();
        this.f21133l = new SparseArray();
    }
}
