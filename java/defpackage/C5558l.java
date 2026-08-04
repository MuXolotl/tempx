package defpackage;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lٌؘۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5558l implements InterfaceC14833l {
    public static final int[] adcel = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] ads = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] subscription;
    public static final byte[] tapsense;
    public int admob;
    public long amazon;
    public int billing;
    public boolean crashlytics;
    public InterfaceC8979l firebase;
    public InterfaceC2053l isPro;
    public final C6120l loadAd;
    public long metrica;
    public int purchase;
    public InterfaceC12703l remoteconfig;
    public InterfaceC8979l smaato;
    public boolean startapp;
    public long subs;
    public boolean vip;
    public final byte[] yandex = new byte[1];
    public int mopub = -1;

    static {
        String str = AbstractC15323l.yandex;
        Charset charset = StandardCharsets.UTF_8;
        subscription = "#!AMR\n".getBytes(charset);
        tapsense = "#!AMR-WB\n".getBytes(charset);
    }

    public C5558l() {
        C6120l c6120l = new C6120l();
        this.loadAd = c6120l;
        this.smaato = c6120l;
    }

    public final boolean admob(InterfaceC10430l interfaceC10430l) {
        interfaceC10430l.smaato();
        byte[] bArr = subscription;
        byte[] bArr2 = new byte[bArr.length];
        interfaceC10430l.yandex(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.crashlytics = false;
            interfaceC10430l.remoteconfig(bArr.length);
            return true;
        }
        interfaceC10430l.smaato();
        byte[] bArr3 = tapsense;
        byte[] bArr4 = new byte[bArr3.length];
        interfaceC10430l.yandex(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.crashlytics = true;
        interfaceC10430l.remoteconfig(bArr3.length);
        return true;
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        this.amazon = 0L;
        this.purchase = 0;
        this.billing = 0;
        this.metrica = j2;
        InterfaceC12703l interfaceC12703l = this.remoteconfig;
        if (!(interfaceC12703l instanceof C3762l)) {
            if (j == 0 || !(interfaceC12703l instanceof C12060l)) {
                this.subs = 0L;
                return;
            } else {
                C12060l c12060l = (C12060l) interfaceC12703l;
                this.subs = (Math.max(0L, j - c12060l.loadAd) * 8000000) / ((long) c12060l.purchase);
                return;
            }
        }
        C3762l c3762l = (C3762l) interfaceC12703l;
        C15206l c15206l = c3762l.loadAd;
        long jAmazon = c15206l.loadAd == 0 ? -9223372036854775807L : c15206l.amazon(AbstractC15323l.crashlytics(c3762l.yandex, j));
        this.subs = jAmazon;
        if (Math.abs(this.metrica - jAmazon) < 20000) {
            return;
        }
        this.vip = true;
        this.smaato = this.loadAd;
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.isPro = interfaceC2053l;
        InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(0, 1);
        this.firebase = interfaceC8979lStartapp;
        this.smaato = interfaceC8979lStartapp;
        interfaceC2053l.firebase();
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        return admob(interfaceC10430l);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00eb A[PHI: r4
  0x00eb: PHI (r4v1 lَٜۤ) = (r4v0 lَٜۤ), (r4v6 lَٜۤ) binds: [B:53:0x00e9, B:56:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        InterfaceC10430l interfaceC10430l2;
        int iBilling;
        int i;
        this.firebase.getClass();
        String str = AbstractC15323l.yandex;
        if (interfaceC10430l.getPosition() == 0 && !admob(interfaceC10430l)) {
            throw C17655l.yandex(null, "Could not find AMR header.");
        }
        if (!this.startapp) {
            this.startapp = true;
            boolean z = this.crashlytics;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i2 = z ? AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            int i3 = z ? ads[8] : adcel[7];
            InterfaceC8979l interfaceC8979l = this.firebase;
            C12984l c12984l = new C12984l();
            c12984l.remoteconfig = AbstractC3825l.vip(str2);
            c12984l.vip = AbstractC3825l.vip(str3);
            c12984l.metrica = i3;
            c12984l.f25447throws = 1;
            c12984l.f25442package = i2;
            AbstractC9029l.license(c12984l, interfaceC8979l);
        }
        int i4 = 0;
        if (this.billing == 0) {
            try {
                int iMopub = mopub(interfaceC10430l);
                this.purchase = iMopub;
                this.billing = iMopub;
                if (this.mopub == -1) {
                    interfaceC10430l.getPosition();
                    this.mopub = this.purchase;
                }
                if (this.mopub == this.purchase) {
                    this.admob++;
                }
                InterfaceC12703l interfaceC12703l = this.remoteconfig;
                if (interfaceC12703l instanceof C3762l) {
                    C3762l c3762l = (C3762l) interfaceC12703l;
                    long j = this.subs + this.amazon + 20000;
                    long position = interfaceC10430l.getPosition() + ((long) this.purchase);
                    C15206l c15206l = c3762l.loadAd;
                    int i5 = c15206l.loadAd;
                    if (i5 == 0 || j - c15206l.amazon(i5 - 1) >= 100000) {
                        C15206l c15206l2 = c3762l.yandex;
                        C15206l c15206l3 = c3762l.loadAd;
                        if (c15206l3.loadAd == 0 && j > 0) {
                            c15206l2.yandex(0L);
                            c15206l3.yandex(0L);
                        }
                        c15206l2.yandex(position);
                        c15206l3.yandex(j);
                    }
                    if (this.vip && Math.abs(this.metrica - j) < 20000) {
                        this.vip = false;
                        this.smaato = this.firebase;
                    }
                }
                interfaceC10430l2 = interfaceC10430l;
                iBilling = this.smaato.billing(interfaceC10430l2, this.billing, true);
                if (iBilling == -1) {
                    i4 = -1;
                } else {
                    i = this.billing - iBilling;
                    this.billing = i;
                    if (i <= 0) {
                        this.smaato.yandex(this.amazon + this.subs, 1, this.purchase, 0, null);
                        this.amazon += 20000;
                    }
                }
            } catch (EOFException unused) {
                interfaceC10430l2 = interfaceC10430l;
            }
        } else {
            interfaceC10430l2 = interfaceC10430l;
            iBilling = this.smaato.billing(interfaceC10430l2, this.billing, true);
            if (iBilling == -1) {
                i4 = -1;
            } else {
                i = this.billing - iBilling;
                this.billing = i;
                if (i <= 0) {
                    this.smaato.yandex(this.amazon + this.subs, 1, this.purchase, 0, null);
                    this.amazon += 20000;
                }
            }
        }
        interfaceC10430l2.getLength();
        if (this.remoteconfig == null) {
            C9828l c9828l = new C9828l(-9223372036854775807L);
            this.remoteconfig = c9828l;
            this.isPro.tapsense(c9828l);
        }
        if (i4 == -1) {
            InterfaceC12703l interfaceC12703l2 = this.remoteconfig;
            if (interfaceC12703l2 instanceof C3762l) {
                long j2 = this.subs + this.amazon;
                ((C3762l) interfaceC12703l2).crashlytics = j2;
                this.isPro.tapsense(interfaceC12703l2);
                this.firebase.amazon(j2);
            }
        }
        return i4;
    }

    public final int mopub(InterfaceC10430l interfaceC10430l) throws C17655l {
        boolean z;
        interfaceC10430l.smaato();
        byte[] bArr = this.yandex;
        interfaceC10430l.yandex(0, 1, bArr);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw C17655l.yandex(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.crashlytics) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? ads[i] : adcel[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.crashlytics ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C17655l.yandex(null, sb.toString());
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
