package defpackage;

import java.io.IOException;
import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lََؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10043l implements InterfaceC14091l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C9314l f20481l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public byte[] f20482l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public byte[] f20483l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f20484l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte[] f20485l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public byte[] f20486l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public SecureRandom f20487l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C1180l f20488l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public byte[] f20489l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public InterfaceC16922l f20490l;

    @Override // defpackage.InterfaceC14091l
    public final byte[] crashlytics() {
        byte[] bArr = new byte[this.f20490l.getDigestSize()];
        this.f20490l.doFinal(bArr, 0);
        SecureRandom secureRandom = this.f20487l;
        if (secureRandom != null) {
            secureRandom.nextBytes(this.f20484l);
        } else {
            byte[] bArrCrashlytics = AbstractC14024l.crashlytics(this.f20488l.f3173l.yandex);
            byte[] bArr2 = this.f20484l;
            System.arraycopy(bArrCrashlytics, 0, bArr2, 0, bArr2.length);
        }
        return AbstractC6716l.admob((C18097l) this.f20488l.f16541l, this.f20489l, this.f20486l, this.f20482l, this.f20483l, this.f20485l, bArr, this.f20484l);
    }

    @Override // defpackage.InterfaceC14091l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        C11702l c11702l;
        C18097l c18097l;
        InterfaceC16922l c17951l;
        if (interfaceC9719l instanceof C11702l) {
            C11702l c11702l2 = (C11702l) interfaceC9719l;
            InterfaceC9719l interfaceC9719l2 = c11702l2.f23447l;
            if (c11702l2.f23446l.length > 255) {
                C8339l.metrica("context too long");
                return;
            } else {
                c11702l = c11702l2;
                interfaceC9719l = interfaceC9719l2;
            }
        } else {
            c11702l = null;
        }
        if (z) {
            this.f20481l = null;
            if (interfaceC9719l instanceof C6114l) {
                C6114l c6114l = (C6114l) interfaceC9719l;
                this.f20488l = (C1180l) c6114l.f12903l;
                this.f20487l = c6114l.f12904l;
            } else {
                this.f20488l = (C1180l) interfaceC9719l;
                this.f20487l = null;
            }
            C1180l c1180l = this.f20488l;
            c18097l = (C18097l) c1180l.f16541l;
            this.f20489l = AbstractC14024l.crashlytics(c1180l.f3172l.yandex);
            this.f20486l = AbstractC14024l.crashlytics(this.f20488l.f3172l.loadAd);
            this.f20482l = AbstractC14024l.crashlytics(this.f20488l.f3173l.yandex);
            this.f20483l = AbstractC14024l.crashlytics(this.f20488l.f3173l.loadAd);
            this.f20484l = new byte[c18097l.loadAd.crashlytics()];
        } else {
            C9314l c9314l = (C9314l) interfaceC9719l;
            this.f20481l = c9314l;
            this.f20488l = null;
            this.f20487l = null;
            this.f20489l = null;
            this.f20486l = null;
            this.f20482l = AbstractC14024l.crashlytics(c9314l.f19126l);
            this.f20483l = AbstractC14024l.crashlytics(this.f20481l.f19127l);
            c18097l = (C18097l) this.f20481l.f16541l;
        }
        int i = c18097l.crashlytics;
        if (i != 0) {
            if (i == 1) {
                c17951l = new C2657l();
            } else if (i == 2) {
                c17951l = new C17711l();
            } else if (i == 3) {
                c17951l = new C17951l(128);
            } else {
                if (i != 4) {
                    C8339l.metrica("unknown parameters type");
                    return;
                }
                c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
        } else if (c18097l.yandex.startsWith("sha2")) {
            c17951l = (C18097l.amazon == c18097l || C18097l.purchase == c18097l) ? new C2657l() : new C17711l();
        } else {
            c17951l = (C18097l.isPro == c18097l || C18097l.firebase == c18097l) ? new C17951l(128) : new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        this.f20490l = c17951l;
        try {
            byte[] bArrRemoteconfig = AbstractC9237l.yandex(c17951l.getAlgorithmName()).remoteconfig("DER");
            int length = c11702l == null ? 0 : c11702l.f23446l.length;
            int i2 = length + 2;
            byte[] bArr = new byte[bArrRemoteconfig.length + i2];
            this.f20485l = bArr;
            bArr[0] = 1;
            bArr[1] = (byte) length;
            if (c11702l != null) {
                byte[] bArr2 = c11702l.f23446l;
                if (bArr2.length != length) {
                    C8339l.metrica("len");
                    return;
                }
                System.arraycopy(bArr2, 0, bArr, 2, length);
            }
            System.arraycopy(bArrRemoteconfig, 0, this.f20485l, i2, bArrRemoteconfig.length);
        } catch (IOException e) {
            C8339l.smaato(AbstractC5020l.adcel(e, new StringBuilder("oid encoding failed: ")));
        }
    }

    @Override // defpackage.InterfaceC14091l
    public final boolean loadAd(byte[] bArr) {
        byte[] bArr2 = new byte[this.f20490l.getDigestSize()];
        this.f20490l.doFinal(bArr2, 0);
        return AbstractC6716l.subs((C18097l) this.f20481l.f16541l, this.f20482l, this.f20483l, this.f20485l, bArr2, bArr);
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte b) {
        this.f20490l.update(b);
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte[] bArr, int i, int i2) {
        this.f20490l.update(bArr, i, i2);
    }
}
