package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: lَؙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0153l implements InterfaceC1227l {
    public static final C13975l smaato;
    public final long admob;
    public final long amazon;
    public final double billing;
    public final C13442l crashlytics;
    public final String firebase;
    public final int isPro;
    public final C16161l loadAd;
    public final double mopub;
    public long purchase;
    public final long subs;
    public final C16468l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        smaato = new C13975l(4);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0163  */
    /* JADX WARN: Code duplicated, block: B:71:0x0198  */
    /* JADX WARN: Code duplicated, block: B:73:0x019c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x01d8  */
    public C0153l(C10111l c10111l, long j, String str) throws IOException, C9541l {
        int i;
        long j2;
        double dIntValue;
        int i2;
        int i3;
        int i4;
        long jYandex;
        C16161l c16161l;
        C13442l c13442l;
        double d;
        C13442l c13442l2;
        int i5;
        C16161l c16161l2;
        C11534l c11534l;
        int i6;
        boolean z;
        long j3;
        this.firebase = "";
        C13975l c13975l = smaato;
        FileChannel fileChannel = (FileChannel) c10111l.f20589l;
        long size = fileChannel.size();
        C0869l c0869l = new C0869l();
        long j4 = 5000;
        long j5 = 0;
        long j6 = j;
        c10111l.applovin(j6, Math.max(Math.min(5000L, size - j), 0L), c0869l);
        while (true) {
            boolean z2 = false;
            try {
                try {
                    if (c0869l.f2526l <= 196) {
                        c0869l.yandex();
                        c10111l.applovin(j6, Math.max(Math.min(j4, size - j6), j5), c0869l);
                        if (c0869l.f2526l <= 196) {
                        }
                        if (z2) {
                            return;
                        }
                        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                        c13975l.getClass();
                        int i7 = C17500l.yandex;
                        Locale.getDefault();
                        throw new C9541l(AbstractC14814l.startapp("No audio header found within ", str));
                    }
                    if (C16468l.crashlytics(c0869l)) {
                        try {
                            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i8 = C17500l.yandex;
                            this.yandex = C16468l.amazon(c0869l);
                            C0869l c0869lYandex = C16161l.yandex(c0869l.clone(), this.yandex);
                            if (c0869lYandex == null) {
                                C0869l c0869lYandex2 = C13442l.yandex(c0869l.clone());
                                if (c0869lYandex2 != null) {
                                    c13975l.getClass();
                                    this.crashlytics = C13442l.loadAd(c0869lYandex2);
                                    c0869lYandex2.skip(c0869lYandex2.f2526l);
                                } else {
                                    j3 = j4;
                                    try {
                                        long j7 = j6;
                                        j5 = j5;
                                        j2 = j7;
                                        i = 1;
                                        try {
                                            try {
                                                boolean zYandex = yandex(j2, c0869l.clone(), c10111l, str);
                                                z = zYandex ? zYandex : true;
                                            } catch (C9541l unused) {
                                            }
                                        } catch (EOFException unused2) {
                                            EnumC8711l[] enumC8711lArr3 = EnumC8711l.f17925l;
                                            c13975l.getClass();
                                            int i9 = C17500l.yandex;
                                        }
                                    } catch (C9541l unused3) {
                                        j2 = j6;
                                    }
                                }
                                z2 = z;
                                EnumC8711l[] enumC8711lArr4 = EnumC8711l.f17925l;
                                c13975l.getClass();
                                int i10 = C17500l.yandex;
                                this.amazon = fileChannel.size();
                                this.purchase = j2;
                                C16468l c16468l = this.yandex;
                                dIntValue = ((double) ((Integer) ((Map) C16468l.license.get(Integer.valueOf(c16468l.loadAd))).get(Integer.valueOf(c16468l.amazon))).intValue()) / this.yandex.remoteconfig.doubleValue();
                                this.billing = dIntValue;
                                C16468l c16468l2 = this.yandex;
                                i2 = c16468l2.loadAd;
                                if ((i2 != 2 || i2 == 0) && (((i3 = c16468l2.amazon) == 2 || i3 == i) && (i4 = c16468l2.mopub) != 0 && i4 != i && i4 != 2 && i4 == 3)) {
                                    this.billing = dIntValue / 2.0d;
                                }
                                jYandex = (this.amazon - this.purchase) / ((long) c16468l2.yandex());
                                this.subs = jYandex;
                                c16161l = this.loadAd;
                                if (c16161l == null && c16161l.loadAd) {
                                    this.admob = c16161l.crashlytics;
                                } else {
                                    c13442l = this.crashlytics;
                                    if (c13442l != null) {
                                        this.admob = c13442l.yandex;
                                    } else {
                                        this.admob = jYandex;
                                    }
                                }
                                d = this.admob * this.billing;
                                this.mopub = d;
                                if (c16161l != null || !c16161l.yandex) {
                                    c13442l2 = this.crashlytics;
                                    if (c13442l2 != null) {
                                        i5 = c13442l2.loadAd;
                                        if (i5 > 0) {
                                            this.isPro = (int) (((double) (i5 * 8)) / (d * 1000.0d));
                                        } else {
                                            this.isPro = (int) (((this.amazon - this.purchase) * 8) / (d * 1000.0d));
                                        }
                                    } else {
                                        this.isPro = this.yandex.billing.intValue();
                                    }
                                } else if (!c16161l.amazon || (i6 = c16161l.purchase) <= 0) {
                                    this.isPro = (int) (((this.amazon - this.purchase) * 8) / (d * 1000.0d));
                                } else {
                                    this.isPro = (int) (((double) (i6 * 8)) / (d * 1000.0d));
                                }
                                c16161l2 = this.loadAd;
                                if (c16161l2 != null) {
                                    c11534l = c16161l2.billing;
                                    if (c11534l != null) {
                                        this.firebase = c11534l.f23200l;
                                    }
                                } else if (this.crashlytics != null) {
                                    this.firebase = "Fraunhofer";
                                }
                                if (z2) {
                                    return;
                                }
                                EnumC8711l[] enumC8711lArr5 = EnumC8711l.f17925l;
                                c13975l.getClass();
                                int i11 = C17500l.yandex;
                                Locale.getDefault();
                                throw new C9541l(AbstractC14814l.startapp("No audio header found within ", str));
                            }
                            c13975l.getClass();
                            try {
                                this.loadAd = C16161l.loadAd(c0869lYandex);
                                c0869lYandex.skip(c0869lYandex.f2526l);
                            } catch (C9541l unused4) {
                            }
                            i = 1;
                            j2 = j6;
                            z2 = z;
                            EnumC8711l[] enumC8711lArr6 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i12 = C17500l.yandex;
                            this.amazon = fileChannel.size();
                            this.purchase = j2;
                            C16468l c16468l3 = this.yandex;
                            dIntValue = ((double) ((Integer) ((Map) C16468l.license.get(Integer.valueOf(c16468l3.loadAd))).get(Integer.valueOf(c16468l3.amazon))).intValue()) / this.yandex.remoteconfig.doubleValue();
                            this.billing = dIntValue;
                            C16468l c16468l4 = this.yandex;
                            i2 = c16468l4.loadAd;
                            if (i2 != 2) {
                                this.billing = dIntValue / 2.0d;
                            } else {
                                this.billing = dIntValue / 2.0d;
                            }
                            jYandex = (this.amazon - this.purchase) / ((long) c16468l4.yandex());
                            this.subs = jYandex;
                            c16161l = this.loadAd;
                            if (c16161l == null) {
                                c13442l = this.crashlytics;
                                if (c13442l != null) {
                                    this.admob = c13442l.yandex;
                                } else {
                                    this.admob = jYandex;
                                }
                            } else {
                                c13442l = this.crashlytics;
                                if (c13442l != null) {
                                    this.admob = c13442l.yandex;
                                } else {
                                    this.admob = jYandex;
                                }
                            }
                            d = this.admob * this.billing;
                            this.mopub = d;
                            if (c16161l != null) {
                                c13442l2 = this.crashlytics;
                                if (c13442l2 != null) {
                                    i5 = c13442l2.loadAd;
                                    if (i5 > 0) {
                                        this.isPro = (int) (((double) (i5 * 8)) / (d * 1000.0d));
                                    } else {
                                        this.isPro = (int) (((this.amazon - this.purchase) * 8) / (d * 1000.0d));
                                    }
                                } else {
                                    this.isPro = this.yandex.billing.intValue();
                                }
                            } else {
                                c13442l2 = this.crashlytics;
                                if (c13442l2 != null) {
                                    i5 = c13442l2.loadAd;
                                    if (i5 > 0) {
                                        this.isPro = (int) (((double) (i5 * 8)) / (d * 1000.0d));
                                    } else {
                                        this.isPro = (int) (((this.amazon - this.purchase) * 8) / (d * 1000.0d));
                                    }
                                } else {
                                    this.isPro = this.yandex.billing.intValue();
                                }
                            }
                            c16161l2 = this.loadAd;
                            if (c16161l2 != null) {
                                c11534l = c16161l2.billing;
                                if (c11534l != null) {
                                    this.firebase = c11534l.f23200l;
                                }
                            } else if (this.crashlytics != null) {
                                this.firebase = "Fraunhofer";
                            }
                            if (z2) {
                                return;
                            }
                            EnumC8711l[] enumC8711lArr7 = EnumC8711l.f17925l;
                            c13975l.getClass();
                            int i13 = C17500l.yandex;
                            Locale.getDefault();
                            throw new C9541l(AbstractC14814l.startapp("No audio header found within ", str));
                        } catch (C9541l unused5) {
                            j2 = j6;
                            j3 = j4;
                        }
                    } else {
                        j2 = j6;
                        j3 = j4;
                    }
                    c0869l.readByte();
                    long j8 = j5;
                    j6 = j2 + 1;
                    j5 = j8;
                    j4 = j3;
                } catch (EOFException unused6) {
                    i = 1;
                    j2 = j6;
                }
            } catch (IOException e) {
                EnumC8711l[] enumC8711lArr8 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i14 = C17500l.yandex;
                throw e;
            }
        }
    }

    public final String toString() {
        C18449l c18449lBilling = AbstractC11999l.billing(this);
        c18449lBilling.Signature(this.yandex, "mp3FrameHeader");
        c18449lBilling.Signature(this.loadAd, "mp3XingFrame");
        c18449lBilling.Signature(this.crashlytics, "mp3VbriFrame");
        c18449lBilling.Signature(null, "audioDataStartPosition");
        c18449lBilling.Signature(null, "audioDataEndPosition");
        c18449lBilling.tapsense(this.amazon, "fileSize");
        c18449lBilling.tapsense(this.purchase, "startByte");
        c18449lBilling.license("timePerFrame", String.valueOf(this.billing));
        c18449lBilling.license("trackLength", String.valueOf(this.mopub));
        c18449lBilling.tapsense(this.admob, "numberOfFrames");
        c18449lBilling.tapsense(this.subs, "numberOfFramesEstimate");
        c18449lBilling.subscription(this.isPro, "bitrate");
        c18449lBilling.Signature(this.firebase, "encoder");
        return c18449lBilling.toString();
    }

    public final boolean yandex(long j, C0869l c0869l, C10111l c10111l, String str) throws IOException {
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        C16468l c16468l = this.yandex;
        c16468l.yandex();
        C13975l c13975l = smaato;
        c13975l.getClass();
        int i = C17500l.yandex;
        long size = ((FileChannel) c10111l.f20589l).size();
        if (c16468l.yandex() > 4804) {
            c16468l.yandex();
            c13975l.getClass();
            return false;
        }
        if (c0869l.f2526l <= c16468l.yandex() + 196) {
            c13975l.getClass();
            c0869l.yandex();
            c10111l.applovin(j, Math.max(Math.min(5000L, size - j), 0L), c0869l);
            if (c0869l.f2526l <= 196) {
                c13975l.getClass();
                return false;
            }
        }
        c0869l.skip(c16468l.yandex());
        if (!C16468l.crashlytics(c0869l)) {
            c13975l.getClass();
            return false;
        }
        try {
            C16468l.amazon(c0869l);
            c13975l.getClass();
            return true;
        } catch (C9541l unused) {
            EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
            c13975l.getClass();
            int i2 = C17500l.yandex;
            return false;
        }
    }
}
