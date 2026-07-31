package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؘؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C7084l {
    public int admob;
    public int amazon;
    public long loadAd;
    public final InterfaceC9473l yandex;
    public long crashlytics = Long.MAX_VALUE;
    public int purchase = 2;
    public int billing = -1;
    public long mopub = -1;
    public final ArrayList subs = new ArrayList();

    public C7084l(InterfaceC9473l interfaceC9473l) {
        this.yandex = interfaceC9473l;
    }

    public final void adcel(int i) throws IOException {
        while (this.loadAd < this.crashlytics) {
            InterfaceC9473l interfaceC9473l = this.yandex;
            if (interfaceC9473l.subs()) {
                break;
            }
            int iBilling = billing();
            if (iBilling == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.loadAd);
                sb.append(". Last read tag: ");
                throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
            }
            int i2 = iBilling >>> 3;
            int i3 = iBilling & 7;
            if (i3 == 0) {
                this.purchase = 0;
                metrica();
            } else if (i3 == 1) {
                this.purchase = 1;
                firebase();
            } else if (i3 == 2) {
                int iBilling2 = billing();
                if (iBilling2 < 0) {
                    StringBuilder sbSignature = AbstractC2812l.Signature("Negative length: ", iBilling2, ". Reader position: ");
                    sbSignature.append(this.loadAd);
                    sbSignature.append(". Last read tag: ");
                    sbSignature.append(i2);
                    sbSignature.append('.');
                    throw new ProtocolException(sbSignature.toString());
                }
                long j = iBilling2;
                this.loadAd += j;
                interfaceC9473l.skip(j);
            } else {
                if (i3 == 3) {
                    int i4 = this.amazon + 1;
                    this.amazon = i4;
                    if (i4 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        adcel(i2);
                        this.amazon--;
                    } catch (Throwable th) {
                        this.amazon--;
                        throw th;
                    }
                    this.amazon--;
                    throw th;
                }
                if (i3 == 4) {
                    if (i2 == i) {
                        return;
                    }
                    throw new ProtocolException("Unexpected end group. Reader position: " + this.loadAd + ". Last read tag: " + i2 + '.');
                }
                if (i3 != 5) {
                    StringBuilder sbSignature2 = AbstractC2812l.Signature("Unexpected field encoding: ", i3, ". Reader position: ");
                    sbSignature2.append(this.loadAd);
                    sbSignature2.append(". Last read tag: ");
                    sbSignature2.append(i2);
                    sbSignature2.append('.');
                    throw new ProtocolException(sbSignature2.toString());
                }
                this.purchase = 5;
                isPro();
            }
        }
        C8339l.vip();
    }

    public int admob() {
        return this.admob;
    }

    public long amazon() {
        if (this.purchase != 2) {
            C8339l.smaato("Unexpected call to beginMessage()");
            return 0L;
        }
        int i = this.amazon + 1;
        this.amazon = i;
        if (i > 100) {
            C18262l.metrica("Wire recursion limit exceeded");
            return 0L;
        }
        ArrayList arrayList = this.subs;
        if (i > arrayList.size()) {
            arrayList.add(new C0869l());
        }
        long j = this.mopub;
        this.mopub = -1L;
        this.purchase = 6;
        return j;
    }

    public final int billing() throws ProtocolException {
        int i;
        InterfaceC9473l interfaceC9473l = this.yandex;
        interfaceC9473l.subscription(1L);
        this.loadAd++;
        byte b = interfaceC9473l.readByte();
        if (b >= 0) {
            return b;
        }
        int i2 = b & 127;
        interfaceC9473l.subscription(1L);
        this.loadAd++;
        byte b2 = interfaceC9473l.readByte();
        if (b2 >= 0) {
            i = b2 << 7;
        } else {
            i2 |= (b2 & 127) << 7;
            interfaceC9473l.subscription(1L);
            this.loadAd++;
            byte b3 = interfaceC9473l.readByte();
            if (b3 >= 0) {
                i = b3 << 14;
            } else {
                i2 |= (b3 & 127) << 14;
                interfaceC9473l.subscription(1L);
                this.loadAd++;
                byte b4 = interfaceC9473l.readByte();
                if (b4 < 0) {
                    int i3 = i2 | ((b4 & 127) << 21);
                    interfaceC9473l.subscription(1L);
                    this.loadAd++;
                    byte b5 = interfaceC9473l.readByte();
                    int i4 = i3 | (b5 << 28);
                    if (b5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            interfaceC9473l.subscription(1L);
                            this.loadAd++;
                            if (interfaceC9473l.readByte() < 0) {
                            }
                        }
                        StringBuilder sb = new StringBuilder("Malformed VARINT. Reader position: ");
                        sb.append(this.loadAd);
                        sb.append(". Last read tag: ");
                        throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
                    }
                    return i4;
                }
                i = b4 << 21;
            }
        }
        return i | i2;
    }

    public final long crashlytics() throws ProtocolException {
        if (this.purchase != 2) {
            StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
            sb.append(this.purchase);
            sb.append(". Reader position: ");
            sb.append(this.loadAd);
            sb.append(". Last read tag: ");
            throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
        }
        long j = this.crashlytics - this.loadAd;
        this.yandex.subscription(j);
        this.purchase = 6;
        this.loadAd = this.crashlytics;
        this.crashlytics = this.mopub;
        this.mopub = -1L;
        return j;
    }

    public long firebase() throws IOException {
        int i = this.purchase;
        if (i == 1 || i == 2) {
            InterfaceC9473l interfaceC9473l = this.yandex;
            interfaceC9473l.subscription(8L);
            this.loadAd += 8;
            long jMo711l = interfaceC9473l.mo711l();
            loadAd(1);
            return jMo711l;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.purchase);
        sb.append(". Reader position: ");
        sb.append(this.loadAd);
        sb.append(". Last read tag: ");
        throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
    }

    public int isPro() throws IOException {
        int i = this.purchase;
        if (i == 5 || i == 2) {
            InterfaceC9473l interfaceC9473l = this.yandex;
            interfaceC9473l.subscription(4L);
            this.loadAd += 4;
            int iMo715l = interfaceC9473l.mo715l();
            loadAd(5);
            return iMo715l;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.purchase);
        sb.append(". Reader position: ");
        sb.append(this.loadAd);
        sb.append(". Last read tag: ");
        throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
    }

    public final void loadAd(int i) throws IOException {
        if (this.purchase == i) {
            this.purchase = 6;
            return;
        }
        long j = this.loadAd;
        long j2 = this.crashlytics;
        if (j <= j2) {
            if (j != j2) {
                this.purchase = 7;
                return;
            }
            this.crashlytics = this.mopub;
            this.mopub = -1L;
            this.purchase = 6;
            return;
        }
        throw new IOException("Expected to end at " + this.crashlytics + " but was " + this.loadAd);
    }

    public long metrica() throws IOException {
        int i = this.purchase;
        if (i != 0 && i != 2) {
            StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
            sb.append(this.purchase);
            sb.append(". Reader position: ");
            sb.append(this.loadAd);
            sb.append(". Last read tag: ");
            throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            InterfaceC9473l interfaceC9473l = this.yandex;
            interfaceC9473l.subscription(1L);
            this.loadAd++;
            byte b = interfaceC9473l.readByte();
            j |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                loadAd(0);
                return j;
            }
        }
        StringBuilder sb2 = new StringBuilder("Malformed VARINT. Reader position: ");
        sb2.append(this.loadAd);
        sb2.append(". Last read tag: ");
        throw new ProtocolException(AbstractC0653l.adcel(sb2, this.billing, '.'));
    }

    public int mopub() {
        int i = this.purchase;
        if (i == 7) {
            this.purchase = 2;
            return this.billing;
        }
        if (i != 6) {
            C8339l.smaato("Unexpected call to nextTag()");
            return 0;
        }
        while (this.loadAd < this.crashlytics && !this.yandex.subs()) {
            int iBilling = billing();
            if (iBilling == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.loadAd);
                sb.append(". Last read tag: ");
                throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
            }
            int i2 = iBilling >>> 3;
            this.billing = i2;
            int i3 = iBilling & 7;
            if (i3 == 0) {
                this.admob = 1;
                this.purchase = 0;
                return i2;
            }
            if (i3 == 1) {
                this.admob = 2;
                this.purchase = 1;
                return i2;
            }
            if (i3 == 2) {
                this.admob = 3;
                this.purchase = 2;
                int iBilling2 = billing();
                if (iBilling2 < 0) {
                    StringBuilder sbSignature = AbstractC2812l.Signature("Negative length: ", iBilling2, ". Reader position: ");
                    sbSignature.append(this.loadAd);
                    sbSignature.append(". Last read tag: ");
                    throw new ProtocolException(AbstractC0653l.adcel(sbSignature, this.billing, '.'));
                }
                if (this.mopub != -1) {
                    C18073l.admob();
                    return 0;
                }
                long j = this.crashlytics;
                this.mopub = j;
                long j2 = this.loadAd + ((long) iBilling2);
                this.crashlytics = j2;
                if (j2 <= j) {
                    return this.billing;
                }
                C8339l.vip();
                return 0;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    StringBuilder sb2 = new StringBuilder("Unexpected end group. Reader position: ");
                    sb2.append(this.loadAd);
                    sb2.append(". Last read tag: ");
                    throw new ProtocolException(AbstractC0653l.adcel(sb2, this.billing, '.'));
                }
                if (i3 == 5) {
                    this.admob = 4;
                    this.purchase = 5;
                    return i2;
                }
                StringBuilder sbSignature2 = AbstractC2812l.Signature("Unexpected field encoding: ", i3, ". Reader position: ");
                sbSignature2.append(this.loadAd);
                sbSignature2.append(". Last read tag: ");
                throw new ProtocolException(AbstractC0653l.adcel(sbSignature2, this.billing, '.'));
            }
            adcel(i2);
        }
        return -1;
    }

    public C3844l purchase(long j) {
        if (this.purchase != 6) {
            C8339l.smaato("Unexpected call to endMessage()");
            return null;
        }
        int i = this.amazon - 1;
        this.amazon = i;
        if (i < 0 || this.mopub != -1) {
            C8339l.smaato("No corresponding call to beginMessage()");
            return null;
        }
        if (this.loadAd == this.crashlytics || i == 0) {
            this.crashlytics = j;
            C0869l c0869l = (C0869l) this.subs.get(i);
            long j2 = c0869l.f2526l;
            return j2 > 0 ? c0869l.premium(j2) : C3844l.f7950l;
        }
        throw new IOException("Expected to end at " + this.crashlytics + " but was " + this.loadAd);
    }

    public void remoteconfig(int i) {
        int iAdmob = admob();
        yandex(i, iAdmob, AbstractC9361l.billing(iAdmob).crashlytics(this));
    }

    public String smaato() {
        long jCrashlytics = crashlytics();
        InterfaceC9473l interfaceC9473l = this.yandex;
        interfaceC9473l.subscription(jCrashlytics);
        return interfaceC9473l.pro(jCrashlytics);
    }

    public void startapp() throws IOException {
        int i = this.purchase;
        if (i == 0) {
            metrica();
            return;
        }
        if (i == 1) {
            firebase();
            return;
        }
        if (i == 2) {
            this.yandex.skip(crashlytics());
        } else if (i == 5) {
            isPro();
        } else {
            C8339l.smaato("Unexpected call to skip()");
        }
    }

    public C3844l subs() throws ProtocolException {
        long jCrashlytics = crashlytics();
        InterfaceC9473l interfaceC9473l = this.yandex;
        interfaceC9473l.subscription(jCrashlytics);
        return interfaceC9473l.premium(jCrashlytics);
    }

    public int vip() {
        int i = this.purchase;
        if (i == 0 || i == 2) {
            int iBilling = billing();
            loadAd(0);
            return iBilling;
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.purchase);
        sb.append(". Reader position: ");
        sb.append(this.loadAd);
        sb.append(". Last read tag: ");
        throw new ProtocolException(AbstractC0653l.adcel(sb, this.billing, '.'));
    }

    public void yandex(int i, int i2, Object obj) {
        AbstractC9361l.billing(i2).admob(new C13161l((InterfaceC16805l) this.subs.get(this.amazon - 1)), i, obj);
    }
}
