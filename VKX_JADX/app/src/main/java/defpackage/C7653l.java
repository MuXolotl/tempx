package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.car.app.navigation.model.Maneuver;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚۦٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7653l {

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final AtomicInteger f15751abstract = new AtomicInteger();
    public C4636l Signature;
    public C15384l ad;
    public C1955l adcel;
    public final ArrayDeque admob;
    public C0669l ads;
    public C1372l advert;
    public final C4406l amazon;
    public long applovin;
    public long appmetrica;
    public final C4123l billing;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public int f15752case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public boolean f15753catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public AudioDeviceInfo f15754class;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public C13302l f15755continue;
    public final C8808l crashlytics;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public long f15756default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public boolean f15757else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public boolean f15758extends;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public boolean f15759final;
    public C9482l firebase;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public boolean f15760for;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public long f15761goto;

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public Handler f15762import;
    public int inmobi;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public int f15763interface;
    public int isPro;
    public boolean isVip;
    public C13736l license;
    public final C10111l loadAd;
    public C7026l metrica;
    public final C13708l mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public int f15764native;

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public boolean f15765new;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public boolean f15766package;
    public long premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public ByteBuffer f15767private;
    public C15384l pro;
    public final C8261l purchase;
    public final C9799l remoteconfig;
    public long signatures;
    public final C9799l smaato;
    public C1955l startapp;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public boolean f15768static;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public float f15769strictfp;
    public final boolean subs;
    public InterfaceC17193l subscription;

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public long f15770super;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public boolean f15771switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public long f15772synchronized;
    public C2591l tapsense;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public boolean f15773throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public boolean f15774throws;
    public C17849l vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public ByteBuffer f15775volatile;
    public final Context yandex;

    public C7653l(C3512l c3512l) {
        int deviceId;
        Context context = (Context) c3512l.crashlytics;
        this.yandex = context.getApplicationContext();
        this.license = C13736l.subs;
        this.loadAd = (C10111l) c3512l.amazon;
        this.subs = c3512l.yandex;
        this.isPro = 0;
        this.subscription = (C4856l) c3512l.billing;
        C8808l c8808l = new C8808l();
        this.crashlytics = c8808l;
        C4406l c4406l = new C4406l();
        c4406l.remoteconfig = AbstractC15323l.loadAd;
        this.amazon = c4406l;
        this.purchase = new C8261l();
        this.billing = new C4123l();
        this.mopub = AbstractC1186l.signatures(c4406l, c8808l);
        this.f15769strictfp = 1.0f;
        this.f15752case = 0;
        this.f15755continue = new C13302l();
        C1372l c1372l = C1372l.amazon;
        this.ad = new C15384l(c1372l, 0L, 0L);
        this.advert = c1372l;
        this.isVip = false;
        this.admob = new ArrayDeque();
        this.smaato = new C9799l();
        this.remoteconfig = new C9799l();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.f15763interface = i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    public static int subs(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((AbstractC13251l.purchase(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = AbstractC15323l.yandex;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i6 = (iReverseBytes >>> 19) & 3) == 1 || (i7 = (iReverseBytes >>> 17) & 3) == 0) {
                        i5 = -1;
                    } else {
                        int i14 = (iReverseBytes >>> 12) & 15;
                        int i15 = (iReverseBytes >>> 10) & 3;
                        if (i14 == 0 || i14 == 15 || i15 == 3) {
                            i5 = -1;
                        } else {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        C11983l.crashlytics();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                        }
                    }
                    if (i5 != -1) {
                        return i5;
                    }
                    C11983l.crashlytics();
                    return 0;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i16 = iPosition2;
                            while (true) {
                                if (i16 <= iLimit) {
                                    String str2 = AbstractC15323l.yandex;
                                    int iReverseBytes2 = byteBuffer.getInt(i16 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i8 = i16 - iPosition2;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                        case 16:
                            return 1024;
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return AbstractC13693l.billing(new C5257l(bArr, 16)).amazon;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            break;
                        default:
                            C8339l.smaato(AbstractC0653l.vip(i, "Unexpected audio encoding: "));
                            return 0;
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return AbstractC2991l.loadAd[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition4 = byteBuffer.position();
        byte b5 = byteBuffer.get(iPosition4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                b = byteBuffer.get(iPosition4 + 5);
            } else {
                i3 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 6);
            }
            i4 = b2 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
        b = byteBuffer.get(iPosition4 + 4);
        i4 = b & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0175  */
    /* JADX WARN: Code duplicated, block: B:57:0x0178  */
    /* JADX WARN: Code duplicated, block: B:59:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0180  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    /* JADX WARN: Code duplicated, block: B:67:0x018c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0192  */
    /* JADX WARN: Code duplicated, block: B:71:0x019b  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01df  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x0209 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0213  */
    /* JADX WARN: Code duplicated, block: B:82:0x021a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0221  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0061 A[SYNTHETIC] */
    public final void Signature(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        AbstractC12442l.subscription(this.f15767private == null);
        if (byteBuffer.hasRemaining()) {
            if (C1955l.yandex(this.adcel)) {
                int iM3970import = (int) AbstractC15323l.m3970import(AbstractC15323l.m3962continue(20L), ((C17953l) this.adcel.f4450l).loadAd, 1000000L, RoundingMode.UP);
                long jIsPro = isPro();
                long j = iM3970import;
                if (jIsPro >= j) {
                    byteBufferOrder = byteBuffer;
                } else {
                    C1955l c1955l = this.adcel;
                    int i5 = ((C17953l) c1955l.f4450l).yandex;
                    int i6 = c1955l.f4448l;
                    int i7 = (int) jIsPro;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iM3970import) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i5 == 4) {
                                float fSubs = AbstractC15323l.subs(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i3 = (int) (fSubs < 0.0f ? (-fSubs) * (-2.1474836E9f) : fSubs * 2.1474836E9f);
                            } else if (i5 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            } else if (i5 != 22) {
                                if (i5 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i5 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i5 == 1610612736) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                } else if (i5 != 1879048192) {
                                    C18073l.admob();
                                    return;
                                } else {
                                    double dMax = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                    i3 = (int) (dMax < 0.0d ? (-dMax) * (-2.147483648E9d) : dMax * 2.147483647E9d);
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            i4 = (int) ((((long) i3) * ((long) i7)) / j);
                            if (i5 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 4) {
                                if (i5 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i5 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else if (i5 != 1610612736) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                } else if (i5 == 1879048192) {
                                    C18073l.admob();
                                    return;
                                } else if (i4 < 0) {
                                    byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                                } else {
                                    byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i6) {
                                i7++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i7)) / j);
                        if (i5 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 4) {
                            if (i5 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i5 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i5 != 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else if (i5 == 1879048192) {
                                C18073l.admob();
                                return;
                            } else if (i4 < 0) {
                                byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i6) {
                            i7++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            } else {
                byteBufferOrder = byteBuffer;
            }
            this.f15767private = byteBufferOrder;
        }
    }

    public final void adcel(long j) throws C10945l {
        ByteBuffer byteBuffer;
        amazon(j);
        if (this.f15767private != null) {
            return;
        }
        if (!this.ads.amazon()) {
            ByteBuffer byteBuffer2 = this.f15775volatile;
            if (byteBuffer2 != null) {
                Signature(byteBuffer2);
                amazon(j);
                return;
            }
            return;
        }
        while (!this.ads.crashlytics()) {
            do {
                C0669l c0669l = this.ads;
                if (c0669l.amazon()) {
                    ByteBuffer byteBuffer3 = c0669l.crashlytics[c0669l.loadAd()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c0669l.purchase(InterfaceC15103l.yandex);
                        byteBuffer = c0669l.crashlytics[c0669l.loadAd()];
                    }
                } else {
                    byteBuffer = InterfaceC15103l.yandex;
                }
                if (byteBuffer.hasRemaining()) {
                    Signature(byteBuffer);
                    amazon(j);
                } else {
                    ByteBuffer byteBuffer4 = this.f15775volatile;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C0669l c0669l2 = this.ads;
                    ByteBuffer byteBuffer5 = this.f15775volatile;
                    if (c0669l2.amazon() && !c0669l2.amazon) {
                        c0669l2.purchase(byteBuffer5);
                    }
                }
            } while (this.f15767private == null);
            return;
        }
    }

    public final int admob(C5978l c5978l) {
        boolean z;
        if (!AbstractC15323l.m3968for(c5978l.f12621strictfp) || c5978l.f12621strictfp == 2) {
            z = false;
        } else {
            C12984l c12984lYandex = c5978l.yandex();
            c12984lYandex.f25445synchronized = 2;
            c5978l = new C5978l(c12984lYandex);
            z = true;
        }
        int i = ((C4856l) this.subscription).loadAd(mopub(c5978l)).amazon;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final void ads() {
        if (this.adcel != null) {
            C1955l c1955l = this.startapp;
            if (c1955l != null) {
                this.adcel = c1955l;
                this.startapp = null;
            }
            try {
                C17953l c17953lCrashlytics = ((C4856l) this.subscription).crashlytics(mopub((C5978l) this.adcel.f4451l));
                C1955l c1955l2 = this.adcel;
                this.adcel = new C1955l((C5978l) c1955l2.f4447l, (C5978l) c1955l2.f4451l, c1955l2.f4449l, c1955l2.f4448l, c17953lCrashlytics, (C0669l) c1955l2.f4452l);
            } catch (C10699l e) {
                C11983l.ads(new C7419l(e, (C5978l) this.adcel.f4447l));
                return;
            }
        }
        billing();
    }

    public final void amazon(long j) throws C10945l {
        C7026l c7026l;
        C2865l c2865l;
        if (this.f15767private == null) {
            return;
        }
        C9799l c9799l = this.remoteconfig;
        if (c9799l.yandex != null && (f15751abstract.get() > 0 || SystemClock.elapsedRealtime() < c9799l.crashlytics)) {
            return;
        }
        int iRemaining = this.f15767private.remaining();
        boolean z = false;
        try {
            boolean zMopub = this.Signature.mopub(this.f15764native, j, this.f15767private);
            this.f15756default = SystemClock.elapsedRealtime();
            c9799l.yandex = null;
            c9799l.loadAd = -9223372036854775807L;
            c9799l.crashlytics = -9223372036854775807L;
            if (this.Signature.crashlytics()) {
                if (this.appmetrica > 0) {
                    this.f15765new = false;
                }
                if (this.f15753catch && (c7026l = this.metrica) != null && !zMopub && !this.f15765new && (c2865l = ((C4886l) c7026l.f14720l).f13939l) != null) {
                    c2865l.yandex.f1762l = true;
                }
            }
            if (C1955l.yandex(this.adcel)) {
                this.applovin += (long) (iRemaining - this.f15767private.remaining());
            }
            if (zMopub) {
                if (!C1955l.yandex(this.adcel)) {
                    AbstractC12442l.subscription(this.f15767private == this.f15775volatile);
                    this.appmetrica = (((long) this.inmobi) * ((long) this.f15764native)) + this.appmetrica;
                }
                this.f15767private = null;
            }
        } catch (C4287l e) {
            boolean z2 = e.f8776l;
            if (z2) {
                if (isPro() > 0) {
                    z = true;
                } else if (this.Signature.crashlytics()) {
                    if (((C17953l) this.adcel.f4450l).purchase) {
                        this.f15759final = true;
                    }
                    z = true;
                }
            }
            C10945l c10945l = new C10945l(e.f8777l, (C5978l) this.adcel.f4447l, z);
            C7026l c7026l2 = this.metrica;
            if (c7026l2 != null) {
                c7026l2.license(c10945l);
            }
            if (z2) {
                throw c10945l;
            }
            c9799l.yandex(c10945l);
        }
    }

    public final void billing() {
        C4390l c4390l;
        if (vip()) {
            this.signatures = 0L;
            this.premium = 0L;
            this.applovin = 0L;
            this.appmetrica = 0L;
            this.f15765new = false;
            this.inmobi = 0;
            this.ad = new C15384l(this.advert, 0L, 0L);
            this.f15772synchronized = 0L;
            this.pro = null;
            this.admob.clear();
            this.f15775volatile = null;
            this.f15764native = 0;
            this.f15767private = null;
            this.f15760for = false;
            this.f15758extends = false;
            this.f15773throw = false;
            this.amazon.metrica = 0L;
            C0669l c0669l = (C0669l) this.adcel.f4452l;
            this.ads = c0669l;
            c0669l.yandex();
            this.firebase = null;
            C1955l c1955l = this.startapp;
            if (c1955l != null) {
                this.adcel = c1955l;
                this.startapp = null;
            }
            f15751abstract.incrementAndGet();
            C4636l c4636l = this.Signature;
            int i = 3;
            if (c4636l.billing.amazon.getPlayState() == 3) {
                c4636l.yandex.pause();
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29 && c4636l.crashlytics()) {
                C2815l c2815l = c4636l.subs;
                c2815l.getClass();
                C2815l.yandex(c2815l);
            }
            if (i2 >= 24 && (c4390l = c4636l.purchase) != null) {
                C4390l.loadAd(c4390l);
                c4636l.purchase = null;
            }
            AudioTrack audioTrack = c4636l.yandex;
            C8961l c8961l = c4636l.isPro;
            Handler handlerAds = AbstractC15323l.ads(null);
            synchronized (C4636l.tapsense) {
                try {
                    if (C4636l.Signature == null) {
                        C4636l.Signature = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC17973l());
                    }
                    C4636l.license++;
                    C4636l.Signature.schedule(new RunnableC10613l(audioTrack, handlerAds, c8961l, i), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.Signature = null;
        }
        C9799l c9799l = this.remoteconfig;
        c9799l.yandex = null;
        c9799l.loadAd = -9223372036854775807L;
        c9799l.crashlytics = -9223372036854775807L;
        C9799l c9799l2 = this.smaato;
        c9799l2.yandex = null;
        c9799l2.loadAd = -9223372036854775807L;
        c9799l2.crashlytics = -9223372036854775807L;
        this.f15761goto = 0L;
        this.f15770super = 0L;
        Handler handler = this.f15762import;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void crashlytics(C5978l c5978l, int[] iArr) {
        C0669l c0669l;
        C5978l c5978l2;
        int i;
        int iLicense;
        if (this.tapsense == null && this.yandex != null) {
            C2591l c2591l = new C2591l(this);
            this.tapsense = c2591l;
            C4856l c4856l = (C4856l) this.subscription;
            c4856l.billing();
            if (c4856l.billing == null) {
                c4856l.billing = new C8961l(Thread.currentThread());
            }
            c4856l.billing.yandex(c2591l);
        }
        String str = c5978l.metrica;
        int i2 = c5978l.f12619package;
        int i3 = c5978l.f12621strictfp;
        if ("audio/raw".equals(str)) {
            AbstractC12442l.admob(AbstractC15323l.m3968for(i3));
            int iLicense2 = AbstractC15323l.license(i3) * i2;
            C16971l c16971l = new C16971l(4);
            c16971l.amazon(this.mopub);
            c16971l.crashlytics(this.purchase);
            c16971l.billing((InterfaceC15103l[]) this.loadAd.f20587l);
            c0669l = new C0669l(c16971l.mopub());
            if (c0669l.equals(this.ads)) {
                c0669l = this.ads;
            }
            int i4 = c5978l.f12625volatile;
            int i5 = c5978l.f12618native;
            C4406l c4406l = this.amazon;
            c4406l.subs = i4;
            c4406l.isPro = i5;
            this.crashlytics.subs = iArr;
            C6696l c6696l = new C6696l(c5978l.f12622synchronized, i2, i3);
            try {
                AbstractC1186l abstractC1186l = c0669l.yandex;
                if (c6696l.equals(C6696l.purchase)) {
                    throw new C16758l(c6696l);
                }
                for (int i6 = 0; i6 < abstractC1186l.size(); i6++) {
                    InterfaceC15103l interfaceC15103l = (InterfaceC15103l) abstractC1186l.get(i6);
                    C6696l c6696lSmaato = interfaceC15103l.smaato(c6696l);
                    if (interfaceC15103l.mopub()) {
                        AbstractC12442l.subscription(!c6696lSmaato.equals(C6696l.purchase));
                        c6696l = c6696lSmaato;
                    }
                }
                int i7 = c6696l.loadAd;
                int i8 = c6696l.crashlytics;
                C12984l c12984lYandex = c5978l.yandex();
                c12984lYandex.f25445synchronized = i8;
                c12984lYandex.f25442package = c6696l.yandex;
                c12984lYandex.f25447throws = i7;
                c5978l2 = new C5978l(c12984lYandex);
                i = iLicense2;
                iLicense = AbstractC15323l.license(i8) * i7;
            } catch (C16758l e) {
                throw new C7419l(e, c5978l);
            }
        } else {
            c0669l = new C0669l(C13708l.f26763l);
            c5978l2 = c5978l;
            i = -1;
            iLicense = -1;
        }
        C0669l c0669l2 = c0669l;
        C5402l c5402lMopub = mopub(c5978l2);
        C5978l c5978l3 = c5402lMopub.yandex;
        try {
            C17953l c17953lCrashlytics = ((C4856l) this.subscription).crashlytics(c5402lMopub);
            boolean z = c17953lCrashlytics.purchase;
            if (c17953lCrashlytics.yandex == 0) {
                throw new C7419l("Invalid output encoding (isOffload=" + z + ")", c5978l3);
            }
            if (c17953lCrashlytics.crashlytics == 0) {
                throw new C7419l("Invalid output channel config (isOffload=" + z + ")", c5978l3);
            }
            this.f15759final = false;
            C1955l c1955l = new C1955l(c5978l, c5978l2, i, iLicense, c17953lCrashlytics, c0669l2);
            if (vip()) {
                this.startapp = c1955l;
            } else {
                this.adcel = c1955l;
            }
        } catch (C10699l e2) {
            throw new C7419l(e2, c5978l);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final boolean firebase(int r21, long r22, java.nio.ByteBuffer r24) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7653l.firebase(int, long, java.nio.ByteBuffer):boolean");
    }

    public final long isPro() {
        if (!C1955l.yandex(this.adcel)) {
            return this.appmetrica;
        }
        long j = this.applovin;
        long j2 = this.adcel.f4448l;
        return ((j + j2) - 1) / j2;
    }

    public final boolean license() {
        C1955l c1955l = this.adcel;
        return c1955l != null && ((C17953l) c1955l.f4450l).isPro;
    }

    public final C4636l loadAd(C17953l c17953l) throws C13621l {
        try {
            return ((C4856l) this.subscription).yandex(c17953l);
        } catch (C1210l e) {
            C13621l c13621l = new C13621l(c17953l.loadAd, c17953l.crashlytics, c17953l.yandex, c17953l.billing, (C5978l) this.adcel.f4447l, c17953l.purchase, e);
            C7026l c7026l = this.metrica;
            if (c7026l == null) {
                throw c13621l;
            }
            c7026l.license(c13621l);
            throw c13621l;
        }
    }

    public final void metrica() {
        this.f15753catch = true;
        if (vip()) {
            C4636l c4636l = this.Signature;
            C0558l c0558l = c4636l.billing;
            if (c0558l.Signature != -9223372036854775807L) {
                c0558l.loadAd.getClass();
                c0558l.Signature = AbstractC15323l.m3962continue(SystemClock.elapsedRealtime());
            }
            c0558l.isPro = AbstractC15323l.m3969goto(c0558l.purchase, c0558l.yandex());
            c0558l.admob.yandex(0);
            if (!c4636l.firebase || c4636l.crashlytics()) {
                c4636l.yandex.play();
            }
        }
    }

    public final C5402l mopub(C5978l c5978l) {
        C5402l c5402l = new C5402l(c5978l);
        c5402l.loadAd = this.license;
        c5402l.amazon = this.subs;
        c5402l.purchase = this.isPro != 0;
        c5402l.crashlytics = this.f15754class;
        c5402l.billing = this.f15752case;
        c5402l.admob = this.f15768static;
        c5402l.subs = -1;
        c5402l.mopub = this.f15763interface;
        return new C5402l(c5402l);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    public final boolean purchase() throws C10945l {
        ByteBuffer byteBuffer;
        if (!this.ads.amazon()) {
            amazon(Long.MIN_VALUE);
            if (this.f15767private == null) {
                return true;
            }
            return false;
        }
        C0669l c0669l = this.ads;
        if (c0669l.amazon() && !c0669l.amazon) {
            c0669l.amazon = true;
            ((InterfaceC15103l) c0669l.loadAd.get(0)).remoteconfig();
        }
        adcel(Long.MIN_VALUE);
        if (!this.ads.crashlytics() || ((byteBuffer = this.f15767private) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final boolean remoteconfig() throws C13621l {
        C4636l c4636lLoadAd;
        C16957l c16957l;
        C9799l c9799l = this.smaato;
        if (c9799l.yandex != null && (f15751abstract.get() > 0 || SystemClock.elapsedRealtime() < c9799l.crashlytics)) {
            return false;
        }
        int i = 1;
        try {
            c4636lLoadAd = loadAd((C17953l) this.adcel.f4450l);
        } catch (C13621l e) {
            int i2 = ((C17953l) this.adcel.f4450l).billing;
            while (true) {
                C1955l c1955l = this.adcel;
                if (i2 <= 1000000) {
                    if (!((C17953l) c1955l.f4450l).purchase) {
                        throw e;
                    }
                    this.f15759final = true;
                    throw e;
                }
                int i3 = i2 / 2;
                int i4 = c1955l.f4448l;
                if (i4 == -1) {
                    i4 = 1;
                }
                int i5 = i3 % i4;
                int i6 = i5 != 0 ? (i4 - i5) + i3 : i3;
                C0734l c0734lYandex = ((C17953l) c1955l.f4450l).yandex();
                c0734lYandex.billing = i6;
                C17953l c17953l = new C17953l(c0734lYandex);
                try {
                    c4636lLoadAd = loadAd(c17953l);
                    C1955l c1955l2 = this.adcel;
                    this.adcel = new C1955l((C5978l) c1955l2.f4447l, (C5978l) c1955l2.f4451l, c1955l2.f4449l, c1955l2.f4448l, c17953l, (C0669l) c1955l2.f4452l);
                    break;
                } catch (C13621l e2) {
                    e.addSuppressed(e2);
                    i2 = i6;
                }
            }
        }
        this.Signature = c4636lLoadAd;
        C9482l c9482l = new C9482l(this, (C17953l) this.adcel.f4450l);
        this.firebase = c9482l;
        c4636lLoadAd.isPro.yandex(c9482l);
        if (this.Signature.crashlytics()) {
            C1955l c1955l3 = this.adcel;
            if (((C17953l) c1955l3.f4450l).firebase) {
                C4636l c4636l = this.Signature;
                C5978l c5978l = (C5978l) c1955l3.f4447l;
                c4636l.amazon(c5978l.f12625volatile, c5978l.f12618native);
            }
        }
        C17849l c17849l = this.vip;
        if (c17849l != null) {
            this.Signature.billing(c17849l);
        }
        if (vip()) {
            this.Signature.yandex.setVolume(this.f15769strictfp);
        }
        this.f15755continue.getClass();
        AudioDeviceInfo audioDeviceInfo = this.f15754class;
        if (audioDeviceInfo != null) {
            this.Signature.yandex.setPreferredDevice(audioDeviceInfo);
        }
        this.f15766package = true;
        int audioSessionId = this.Signature.yandex.getAudioSessionId();
        boolean z = audioSessionId != this.f15752case;
        this.f15752case = audioSessionId;
        C7026l c7026l = this.metrica;
        if (c7026l != null) {
            C17953l c17953l2 = (C17953l) this.adcel.f4450l;
            C16583l c16583l = new C16583l(c17953l2.yandex, c17953l2.loadAd, c17953l2.crashlytics, c17953l2.amazon, c17953l2.purchase, c17953l2.billing);
            C18595l c18595l = ((C4886l) c7026l.f14720l).f9973l;
            Handler handler = (Handler) c18595l.f36317l;
            if (handler != null) {
                handler.post(new RunnableC7667l(c18595l, c16583l, i));
            }
            if (z) {
                this.f15771switch = true;
                C1955l c1955l4 = this.adcel;
                C0734l c0734lYandex2 = ((C17953l) c1955l4.f4450l).yandex();
                c0734lYandex2.admob = this.f15752case;
                this.adcel = new C1955l((C5978l) c1955l4.f4447l, (C5978l) c1955l4.f4451l, c1955l4.f4449l, c1955l4.f4448l, new C17953l(c0734lYandex2), (C0669l) c1955l4.f4452l);
                C1955l c1955l5 = this.startapp;
                if (c1955l5 != null) {
                    C0734l c0734lYandex3 = ((C17953l) c1955l5.f4450l).yandex();
                    c0734lYandex3.admob = this.f15752case;
                    this.startapp = new C1955l((C5978l) c1955l5.f4447l, (C5978l) c1955l5.f4451l, c1955l5.f4449l, c1955l5.f4448l, new C17953l(c0734lYandex3), (C0669l) c1955l5.f4452l);
                }
                C7026l c7026l2 = this.metrica;
                int i7 = this.f15752case;
                C4886l c4886l = (C4886l) c7026l2.f14720l;
                if (Build.VERSION.SDK_INT >= 35 && (c16957l = c4886l.f9966l) != null) {
                    c16957l.amazon(i7);
                }
                C18595l c18595l2 = c4886l.f9973l;
                Handler handler2 = (Handler) c18595l2.f36317l;
                if (handler2 != null) {
                    handler2.post(new RunnableC9534l(c18595l2, i7, 2));
                }
            }
        }
        return true;
    }

    public final boolean smaato() {
        if (!vip()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.Signature.crashlytics() && this.f15773throw) {
            return false;
        }
        long jIsPro = isPro();
        long jYandex = this.Signature.yandex();
        C4636l c4636l = this.Signature;
        c4636l.getClass();
        return jIsPro > AbstractC15323l.m3970import(jYandex, (long) c4636l.yandex.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final void startapp() {
        if (this.f15760for) {
            return;
        }
        this.f15760for = true;
        if (this.Signature.crashlytics()) {
            this.f15773throw = false;
        }
        C4636l c4636l = this.Signature;
        if (c4636l.firebase) {
            return;
        }
        c4636l.firebase = true;
        C0558l c0558l = c4636l.billing;
        long jLoadAd = c4636l.loadAd();
        c0558l.pro = c0558l.yandex();
        c0558l.loadAd.getClass();
        c0558l.Signature = AbstractC15323l.m3962continue(SystemClock.elapsedRealtime());
        c0558l.ad = jLoadAd;
        c4636l.yandex.stop();
        c4636l.startapp = 0;
    }

    public final void subscription() {
        billing();
        C9258l c9258lListIterator = this.mopub.listIterator(0);
        while (c9258lListIterator.hasNext()) {
            ((InterfaceC15103l) c9258lListIterator.next()).reset();
        }
        this.purchase.reset();
        this.billing.reset();
        C0669l c0669l = this.ads;
        if (c0669l != null) {
            AbstractC1186l abstractC1186l = c0669l.yandex;
            for (int i = 0; i < abstractC1186l.size(); i++) {
                InterfaceC15103l interfaceC15103l = (InterfaceC15103l) abstractC1186l.get(i);
                interfaceC15103l.isPro(C4388l.loadAd);
                interfaceC15103l.reset();
            }
            c0669l.loadAd.clear();
            c0669l.crashlytics = new ByteBuffer[0];
            C6696l c6696l = C6696l.purchase;
            c0669l.amazon = false;
        }
        this.f15753catch = false;
        this.f15759final = false;
    }

    public final void tapsense() {
        if (vip()) {
            C4636l c4636l = this.Signature;
            C1372l c1372l = this.advert;
            AudioTrack audioTrack = c4636l.yandex;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(AbstractC15323l.subs(c1372l.yandex, 0.1f, c4636l.crashlytics)).setPitch(AbstractC15323l.subs(c1372l.loadAd, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                AbstractC6427l.metrica("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            C0558l c0558l = c4636l.billing;
            c0558l.subs = audioTrack.getPlaybackParams().getSpeed();
            c0558l.admob.yandex(0);
            c0558l.firebase = 0L;
            c0558l.tapsense = 0;
            c0558l.subscription = 0;
            c0558l.smaato = 0L;
            c0558l.advert = -9223372036854775807L;
            c0558l.isVip = -9223372036854775807L;
            PlaybackParams playbackParams = this.Signature.yandex.getPlaybackParams();
            this.advert = new C1372l(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final boolean vip() {
        return this.Signature != null;
    }

    public final void yandex(long j) {
        C1372l c1372l;
        boolean zLicense = license();
        boolean z = false;
        C10111l c10111l = this.loadAd;
        if (zLicense) {
            c1372l = C1372l.amazon;
        } else {
            if (this.f15768static || !C1955l.yandex(this.adcel)) {
                c1372l = C1372l.amazon;
            } else {
                int i = ((C5978l) this.adcel.f4447l).f12621strictfp;
                c1372l = this.advert;
                C6353l c6353l = (C6353l) c10111l.f20589l;
                float f = c1372l.yandex;
                c6353l.getClass();
                AbstractC12442l.admob(f > 0.0f);
                if (c6353l.crashlytics != f) {
                    c6353l.crashlytics = f;
                    c6353l.subs = true;
                }
                float f2 = c1372l.loadAd;
                AbstractC12442l.admob(f2 > 0.0f);
                if (c6353l.amazon != f2) {
                    c6353l.amazon = f2;
                    c6353l.subs = true;
                }
            }
            this.advert = c1372l;
        }
        C1372l c1372l2 = c1372l;
        if (!this.f15768static && C1955l.yandex(this.adcel)) {
            int i2 = ((C5978l) this.adcel.f4447l).f12621strictfp;
            z = this.isVip;
            ((C3505l) c10111l.f20586l).metrica = z;
        }
        this.isVip = z;
        this.admob.add(new C15384l(c1372l2, Math.max(0L, j), AbstractC15323l.m3969goto(((C17953l) this.adcel.f4450l).loadAd, isPro())));
        C0669l c0669l = (C0669l) this.adcel.f4452l;
        this.ads = c0669l;
        c0669l.yandex();
        C7026l c7026l = this.metrica;
        if (c7026l != null) {
            final boolean z2 = this.isVip;
            final C18595l c18595l = ((C4886l) c7026l.f14720l).f9973l;
            Handler handler = (Handler) c18595l.f36317l;
            if (handler != null) {
                handler.post(new Runnable() { // from class: lًٗۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) c18595l.f36316l;
                        String str = AbstractC15323l.yandex;
                        C17804l c17804l = surfaceHolderCallbackC18330l.yandex;
                        boolean z3 = c17804l.f34735l;
                        boolean z4 = z2;
                        if (z3 == z4) {
                            return;
                        }
                        c17804l.f34735l = z4;
                        c17804l.f34677l.mopub(23, new C7603l(z4, 2));
                    }
                });
            }
        }
    }
}
