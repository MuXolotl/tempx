package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙٓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13987l implements Closeable {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Logger f27287l = Logger.getLogger(AbstractC14207l.class.getName());

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f27288l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C0869l f27289l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC16805l f27290l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C8290l f27291l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f27292l;

    public C13987l(InterfaceC16805l interfaceC16805l) {
        this.f27290l = interfaceC16805l;
        C0869l c0869l = new C0869l();
        this.f27289l = c0869l;
        this.f27288l = 16384;
        this.f27291l = new C8290l(c0869l);
    }

    public final void adcel(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f27292l) {
                throw new IOException("closed");
            }
            this.f27291l.amazon(arrayList);
            long j = this.f27289l.f2526l;
            long jMin = Math.min(this.f27288l, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            mopub(i, (int) jMin, 1, i2);
            this.f27290l.mo390break(this.f27289l, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.f27288l, j2);
                    j2 -= jMin2;
                    mopub(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.f27290l.mo390break(this.f27289l, jMin2);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void ads(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.f27292l) {
                throw new IOException("closed");
            }
            mopub(0, 8, 6, z ? 1 : 0);
            this.f27290l.writeInt(i);
            this.f27290l.writeInt(i2);
            this.f27290l.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void billing(boolean z, int i, C0869l c0869l, int i2) {
        synchronized (this) {
            if (this.f27292l) {
                throw new IOException("closed");
            }
            mopub(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                this.f27290l.mo390break(c0869l, i2);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f27292l = true;
            this.f27290l.close();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f27292l) {
                throw new IOException("closed");
            }
            this.f27290l.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void inmobi(int i, long j) {
        synchronized (this) {
            try {
                if (this.f27292l) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f27287l;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC14207l.crashlytics(i, 4, j, false));
                }
                mopub(i, 4, 8, 0);
                this.f27290l.writeInt((int) j);
                this.f27290l.flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void isVip(int i, int i2) {
        synchronized (this) {
            if (this.f27292l) {
                throw new IOException("closed");
            }
            if (AbstractC5020l.inmobi(i2) == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            mopub(i, 4, 3, 0);
            this.f27290l.writeInt(AbstractC5020l.inmobi(i2));
            this.f27290l.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void mopub(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f27287l;
            if (logger.isLoggable(level)) {
                logger.fine(AbstractC14207l.loadAd(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.f27288l) {
            C11467l.subs(this.f27288l, i2, ": ", "FRAME_SIZE_ERROR length > ");
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = AbstractC7712l.yandex;
        InterfaceC16805l interfaceC16805l = this.f27290l;
        interfaceC16805l.writeByte((i2 >>> 16) & 255);
        interfaceC16805l.writeByte((i2 >>> 8) & 255);
        interfaceC16805l.writeByte(i2 & 255);
        interfaceC16805l.writeByte(i3 & 255);
        interfaceC16805l.writeByte(i4 & 255);
        interfaceC16805l.writeInt(i & Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final void signatures(C8463l c8463l) {
        synchronized (this) {
            try {
                if (this.f27292l) {
                    throw new IOException("closed");
                }
                mopub(0, Integer.bitCount(c8463l.yandex) * 6, 4, 0);
                for (int i = 0; i < 10; i++) {
                    boolean z = true;
                    if (((1 << i) & c8463l.yandex) == 0) {
                        z = false;
                    }
                    if (z) {
                        this.f27290l.writeShort(i);
                        this.f27290l.writeInt(c8463l.loadAd[i]);
                    }
                }
                this.f27290l.flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vip(int i, int i2, byte[] bArr) {
        synchronized (this) {
            if (this.f27292l) {
                throw new IOException("closed");
            }
            if (AbstractC5020l.inmobi(i2) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            mopub(0, bArr.length + 8, 7, 0);
            this.f27290l.writeInt(i);
            this.f27290l.writeInt(AbstractC5020l.inmobi(i2));
            if (bArr.length != 0) {
                this.f27290l.write(bArr);
            }
            this.f27290l.flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void yandex(C8463l c8463l) {
        synchronized (this) {
            try {
                if (this.f27292l) {
                    throw new IOException("closed");
                }
                int i = this.f27288l;
                int i2 = c8463l.yandex;
                if ((i2 & 32) != 0) {
                    i = c8463l.loadAd[5];
                }
                this.f27288l = i;
                if (((i2 & 2) != 0 ? c8463l.loadAd[1] : -1) != -1) {
                    C8290l c8290l = this.f27291l;
                    int iMin = Math.min((i2 & 2) != 0 ? c8463l.loadAd[1] : -1, 16384);
                    int i3 = c8290l.amazon;
                    if (i3 != iMin) {
                        if (iMin < i3) {
                            c8290l.loadAd = Math.min(c8290l.loadAd, iMin);
                        }
                        c8290l.crashlytics = true;
                        c8290l.amazon = iMin;
                        int i4 = c8290l.admob;
                        if (iMin < i4) {
                            if (iMin == 0) {
                                C18464l[] c18464lArr = c8290l.purchase;
                                Arrays.fill(c18464lArr, 0, c18464lArr.length, (Object) null);
                                c8290l.billing = c8290l.purchase.length - 1;
                                c8290l.mopub = 0;
                                c8290l.admob = 0;
                            } else {
                                c8290l.yandex(i4 - iMin);
                            }
                        }
                    }
                }
                mopub(0, 0, 4, 1);
                this.f27290l.flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
