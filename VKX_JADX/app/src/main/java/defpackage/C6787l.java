package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: lؙ۟ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6787l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Inflater f14216l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C1503l f14217l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public byte f14218l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final CRC32 f14219l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C17237l f14220l;

    public C6787l(InterfaceC9473l interfaceC9473l) {
        C1503l c1503l = new C1503l(interfaceC9473l);
        this.f14217l = c1503l;
        Inflater inflater = new Inflater(true);
        this.f14216l = inflater;
        this.f14220l = new C17237l(c1503l, inflater);
        this.f14219l = new CRC32();
    }

    public static void yandex(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbAdvert = AbstractC5020l.advert(str, ": actual 0x");
        sbAdvert.append(AbstractC12024l.m3340static(8, AbstractC9334l.firebase(i2)));
        sbAdvert.append(" != expected 0x");
        sbAdvert.append(AbstractC12024l.m3340static(8, AbstractC9334l.firebase(i)));
        throw new IOException(sbAdvert.toString());
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) throws IOException {
        C6787l c6787l = this;
        if (j < 0) {
            C10754l.metrica(AbstractC2812l.ads(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = c6787l.f14218l;
        CRC32 crc32 = c6787l.f14219l;
        C1503l c1503l = c6787l.f14217l;
        if (b == 0) {
            c1503l.subscription(10L);
            C0869l c0869l2 = c1503l.f3755l;
            byte bAds = c0869l2.ads(3L);
            boolean z = ((bAds >> 1) & 1) == 1;
            if (z) {
                c6787l.billing(0L, 10L, c0869l2);
            }
            yandex(8075, c1503l.readShort(), "ID1ID2");
            c1503l.skip(8L);
            if (((bAds >> 2) & 1) == 1) {
                c1503l.subscription(2L);
                if (z) {
                    billing(0L, 2L, c0869l2);
                }
                long jM731switch = c0869l2.m731switch() & 65535;
                c1503l.subscription(jM731switch);
                if (z) {
                    billing(0L, jM731switch, c0869l2);
                }
                c1503l.skip(jM731switch);
            }
            if (((bAds >> 3) & 1) == 1) {
                long jYandex = c1503l.yandex((byte) 0, 0L, Long.MAX_VALUE);
                if (jYandex == -1) {
                    C8339l.vip();
                    return 0L;
                }
                if (z) {
                    billing(0L, jYandex + 1, c0869l2);
                }
                c1503l.skip(jYandex + 1);
            }
            if (((bAds >> 4) & 1) == 1) {
                long jYandex2 = c1503l.yandex((byte) 0, 0L, Long.MAX_VALUE);
                if (jYandex2 == -1) {
                    C8339l.vip();
                    return 0L;
                }
                if (z) {
                    c6787l = this;
                    c6787l.billing(0L, jYandex2 + 1, c0869l2);
                } else {
                    c6787l = this;
                }
                c1503l.skip(jYandex2 + 1);
            } else {
                c6787l = this;
            }
            if (z) {
                yandex(c1503l.adcel(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c6787l.f14218l = (byte) 1;
        }
        if (c6787l.f14218l == 1) {
            long j2 = c0869l.f2526l;
            long jAd = c6787l.f14220l.ad(c0869l, j);
            if (jAd != -1) {
                c6787l.billing(j2, jAd, c0869l);
                return jAd;
            }
            c6787l.f14218l = (byte) 2;
        }
        if (c6787l.f14218l == 2) {
            yandex(c1503l.mo715l(), (int) crc32.getValue(), "CRC");
            yandex(c1503l.mo715l(), (int) c6787l.f14216l.getBytesWritten(), "ISIZE");
            c6787l.f14218l = (byte) 3;
            if (!c1503l.subs()) {
                C18262l.metrica("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    public final void billing(long j, long j2, C0869l c0869l) {
        C18346l c18346l = c0869l.f2527l;
        while (true) {
            int i = c18346l.crashlytics;
            int i2 = c18346l.loadAd;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c18346l = c18346l.billing;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c18346l.loadAd) + j);
            int iMin = (int) Math.min(c18346l.crashlytics - i3, j2);
            this.f14219l.update(c18346l.yandex, i3, iMin);
            j2 -= (long) iMin;
            c18346l = c18346l.billing;
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f14220l.close();
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return this.f14217l.f3756l.isPro();
    }
}
