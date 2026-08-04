package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lۣؗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4886l extends AbstractC6641l implements InterfaceC10666l {

    /* JADX INFO: renamed from: lٖؑؓ, reason: contains not printable characters */
    public int f9958l;

    /* JADX INFO: renamed from: lًُؓ, reason: contains not printable characters */
    public boolean f9959l;

    /* JADX INFO: renamed from: lٕؕٝ, reason: contains not printable characters */
    public final Context f9960l;

    /* JADX INFO: renamed from: lٍؙ۟, reason: contains not printable characters */
    public C5978l f9961l;

    /* JADX INFO: renamed from: lؙ۟ۧ, reason: contains not printable characters */
    public C5978l f9962l;

    /* JADX INFO: renamed from: lؙۤؖ, reason: contains not printable characters */
    public boolean f9963l;

    /* JADX INFO: renamed from: lًؘؐ, reason: contains not printable characters */
    public long f9964l;

    /* JADX INFO: renamed from: lً۟ۛ, reason: contains not printable characters */
    public boolean f9965l;

    /* JADX INFO: renamed from: lُۢۧ, reason: contains not printable characters */
    public final C16957l f9966l;

    /* JADX INFO: renamed from: lِؗٚ, reason: contains not printable characters */
    public long f9967l;

    /* JADX INFO: renamed from: lُِۤ, reason: contains not printable characters */
    public boolean f9968l;

    /* JADX INFO: renamed from: lَٓؗ, reason: contains not printable characters */
    public boolean f9969l;

    /* JADX INFO: renamed from: lٟٓؗ, reason: contains not printable characters */
    public boolean f9970l;

    /* JADX INFO: renamed from: lٌٔؕ, reason: contains not printable characters */
    public int f9971l;

    /* JADX INFO: renamed from: lُٔۡ, reason: contains not printable characters */
    public final C7653l f9972l;

    /* JADX INFO: renamed from: lٕٔۚ, reason: contains not printable characters */
    public final C18595l f9973l;

    /* JADX INFO: renamed from: l٘ۙۜ, reason: contains not printable characters */
    public boolean f9974l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4886l(Context context, InterfaceC11856l interfaceC11856l, boolean z, Handler handler, SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l, C7653l c7653l) {
        super(context.getApplicationContext(), 1, interfaceC11856l, z, 44100.0f);
        C16957l c16957l = Build.VERSION.SDK_INT >= 35 ? new C16957l() : null;
        this.f9960l = context.getApplicationContext();
        this.f9972l = c7653l;
        this.f9966l = c16957l;
        this.f9971l = -1000;
        this.f9973l = new C18595l(handler, surfaceHolderCallbackC18330l, 8);
        this.f9967l = -9223372036854775807L;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final C7977l mo1629abstract(C10023l c10023l) {
        C5978l c5978l = (C5978l) c10023l.f20418l;
        c5978l.getClass();
        this.f9961l = c5978l;
        C7977l c7977lMo1629abstract = super.mo1629abstract(c10023l);
        C18595l c18595l = this.f9973l;
        Handler handler = (Handler) c18595l.f36317l;
        if (handler != null) {
            handler.post(new RunnableC10613l(c18595l, c5978l, c7977lMo1629abstract, 2));
        }
        return c7977lMo1629abstract;
    }

    @Override // defpackage.AbstractC1091l
    public final void adcel() {
        C16957l c16957l;
        ((C4856l) this.f9972l.subscription).amazon();
        if (Build.VERSION.SDK_INT < 35 || (c16957l = this.f9966l) == null) {
            return;
        }
        c16957l.loadAd();
    }

    @Override // defpackage.InterfaceC10666l
    public final boolean admob() {
        boolean z = this.f9969l;
        this.f9969l = false;
        return z;
    }

    @Override // defpackage.AbstractC1091l
    public final void ads() {
        C7653l c7653l = this.f9972l;
        this.f9969l = false;
        this.f9959l = false;
        this.f9967l = -9223372036854775807L;
        try {
            try {
                this.f13902l = false;
                m2033const();
                m2060while();
                InterfaceC9655l interfaceC9655l = this.f13921l;
                if (interfaceC9655l != null) {
                    interfaceC9655l.amazon(null);
                }
                this.f13921l = null;
                if (this.f9965l) {
                    this.f9965l = false;
                    c7653l.subscription();
                }
            } catch (Throwable th) {
                InterfaceC9655l interfaceC9655l2 = this.f13921l;
                if (interfaceC9655l2 != null) {
                    interfaceC9655l2.amazon(null);
                }
                this.f13921l = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.f9965l) {
                this.f9965l = false;
                c7653l.subscription();
            }
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC10666l
    public final C1372l billing() {
        return this.f9972l.advert;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final ArrayList mo1630catch(C3010l c3010l, C5978l c5978l, boolean z) {
        C13708l c13708lMopub;
        if (c5978l.metrica == null) {
            c13708lMopub = C13708l.f26763l;
        } else if (this.f9972l.admob(c5978l) != 0) {
            List listPurchase = AbstractC4727l.purchase("audio/raw", false, false);
            C6403l c6403l = listPurchase.isEmpty() ? null : (C6403l) listPurchase.get(0);
            if (c6403l != null) {
                c13708lMopub = AbstractC1186l.isVip(c6403l);
            } else {
                c13708lMopub = AbstractC4727l.mopub(c3010l, c5978l, z, false);
            }
        } else {
            c13708lMopub = AbstractC4727l.mopub(c3010l, c5978l, z, false);
        }
        HashMap map = AbstractC4727l.yandex;
        ArrayList arrayList = new ArrayList(c13708lMopub);
        Collections.sort(arrayList, new C9933l(1, new C5131l(this.f9960l, c5978l, 20)));
        return arrayList;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void mo1631continue(C4136l c4136l) {
        C5978l c5978l;
        C1955l c1955l;
        if (Build.VERSION.SDK_INT < 29 || (c5978l = c4136l.f8495l) == null || !Objects.equals(c5978l.metrica, "audio/opus") || !this.f13902l) {
            return;
        }
        ByteBuffer byteBuffer = c4136l.f8497l;
        byteBuffer.getClass();
        C5978l c5978l2 = c4136l.f8495l;
        c5978l2.getClass();
        int i = c5978l2.f12625volatile;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            C7653l c7653l = this.f9972l;
            C4636l c4636l = c7653l.Signature;
            if (c4636l == null || !c4636l.crashlytics() || (c1955l = c7653l.adcel) == null || !((C17953l) c1955l.f4450l).firebase) {
                return;
            }
            c7653l.Signature.amazon(i, i2);
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final long mo1632else(long j, long j2, boolean z) {
        long jM3970import;
        C7653l c7653l = this.f9972l;
        boolean z2 = c7653l.smaato() && this.f9967l != -9223372036854775807L;
        if (this.f9970l) {
            if (!c7653l.vip()) {
                jM3970import = -9223372036854775807L;
            } else if (C1955l.yandex(c7653l.adcel)) {
                jM3970import = AbstractC15323l.m3969goto(((C17953l) c7653l.adcel.f4450l).loadAd, c7653l.Signature.yandex.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = c7653l.Signature.yandex.getBufferSizeInFrames();
                int iCrashlytics = AbstractC0377l.crashlytics(((C17953l) c7653l.adcel.f4450l).yandex);
                AbstractC12442l.subscription(iCrashlytics != -2147483647);
                jM3970import = AbstractC15323l.m3970import(bufferSizeInFrames, 1000000L, iCrashlytics, RoundingMode.DOWN);
            }
            if (this.f9959l && z2 && jM3970import != -9223372036854775807L) {
                float fMin = Math.min(jM3970import, this.f9967l - j);
                C1372l c1372l = c7653l.advert;
                return Math.max(10000L, (long) ((fMin / (c1372l != null ? c1372l.yandex : 1.0f)) / 2.0f));
            }
        } else if (z2 || this.f13925l) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void mo1633goto(String str, long j, long j2) {
        C18595l c18595l = this.f9973l;
        Handler handler = (Handler) c18595l.f36317l;
        if (handler != null) {
            handler.post(new RunnableC1773l(c18595l, str, j, j2, 0));
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final void mo1634implements() throws C17361l {
        try {
            C7653l c7653l = this.f9972l;
            if (!c7653l.f15758extends && c7653l.vip() && c7653l.purchase()) {
                c7653l.startapp();
                c7653l.f15758extends = true;
            }
            long j = this.f13926l.billing;
            if (j != -9223372036854775807L) {
                this.f9967l = j;
            }
        } catch (C10945l e) {
            throw crashlytics(e, e.f22071l, e.f22072l, this.f13902l ? 5003 : 5002);
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void mo1635import(String str) {
        C18595l c18595l = this.f9973l;
        Handler handler = (Handler) c18595l.f36317l;
        if (handler != null) {
            handler.post(new RunnableC7762l(c18595l, str, 7));
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0104 A[Catch: lؚٞۦ -> 0x0102, TryCatch #0 {lؚٞۦ -> 0x0102, blocks: (B:44:0x00d9, B:47:0x00e1, B:49:0x00e5, B:51:0x00ee, B:55:0x00fc, B:58:0x0104, B:62:0x010b, B:63:0x0110), top: B:67:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0109  */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void mo1636instanceof(C5978l c5978l, MediaFormat mediaFormat) throws C17361l {
        int iM3985throws;
        C5978l c5978l2 = this.f9962l;
        boolean z = true;
        int[] iArr = null;
        if (c5978l2 != null) {
            c5978l = c5978l2;
        } else if (this.f13920l != null) {
            mediaFormat.getClass();
            String str = c5978l.metrica;
            int i = c5978l.f12619package;
            if ("audio/raw".equals(str)) {
                iM3985throws = c5978l.f12621strictfp;
            } else if (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iM3985throws = mediaFormat.containsKey("v-bits-per-sample") ? AbstractC15323l.m3985throws(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            } else {
                iM3985throws = mediaFormat.getInteger("pcm-encoding");
            }
            C12984l c12984l = new C12984l();
            c12984l.vip = AbstractC3825l.vip("audio/raw");
            c12984l.f25445synchronized = iM3985throws;
            c12984l.f25444strictfp = c5978l.f12625volatile;
            c12984l.f25448volatile = c5978l.f12618native;
            c12984l.firebase = c5978l.smaato;
            c12984l.yandex = c5978l.yandex;
            c12984l.loadAd = c5978l.loadAd;
            c12984l.crashlytics = AbstractC1186l.Signature(c5978l.crashlytics);
            c12984l.amazon = c5978l.amazon;
            c12984l.purchase = c5978l.purchase;
            c12984l.billing = c5978l.billing;
            c12984l.f25447throws = mediaFormat.getInteger("channel-count");
            c12984l.f25442package = mediaFormat.getInteger("sample-rate");
            c5978l = new C5978l(c12984l);
            boolean z2 = this.f9968l;
            int i2 = c5978l.f12619package;
            if (z2 && i2 == 6 && i < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.f9963l) {
                if (i2 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i2 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i2 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i2 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i2 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i4 = Build.VERSION.SDK_INT;
            C7653l c7653l = this.f9972l;
            if (i4 >= 29) {
                if (this.f13902l) {
                    C17614l c17614l = this.f3018l;
                    c17614l.getClass();
                    if (c17614l.yandex != 0) {
                        C17614l c17614l2 = this.f3018l;
                        c17614l2.getClass();
                        int i5 = c17614l2.yandex;
                        c7653l.getClass();
                        if (i4 < 29) {
                            z = false;
                        }
                        AbstractC12442l.subscription(z);
                        c7653l.isPro = i5;
                    } else {
                        c7653l.getClass();
                        if (i4 >= 29) {
                            z = false;
                        }
                        AbstractC12442l.subscription(z);
                        c7653l.isPro = 0;
                    }
                } else {
                    c7653l.getClass();
                    if (i4 >= 29) {
                        z = false;
                    }
                    AbstractC12442l.subscription(z);
                    c7653l.isPro = 0;
                }
            }
            c7653l.crashlytics(c5978l, iArr);
        } catch (C7419l e) {
            throw crashlytics(e, e.f15369l, false, 5001);
        }
    }

    @Override // defpackage.AbstractC1091l
    public final String isPro() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.InterfaceC10666l
    public final void loadAd(C1372l c1372l) {
        C7653l c7653l = this.f9972l;
        if (c7653l.license()) {
            c7653l.advert = c1372l;
            c7653l.tapsense();
            return;
        }
        C1372l c1372l2 = new C1372l(AbstractC15323l.subs(c1372l.yandex, 0.1f, 8.0f), AbstractC15323l.subs(c1372l.loadAd, 0.1f, 8.0f));
        c7653l.advert = c1372l2;
        C15384l c15384l = new C15384l(c1372l2, -9223372036854775807L, -9223372036854775807L);
        if (c7653l.vip()) {
            c7653l.pro = c15384l;
        } else {
            c7653l.ad = c15384l;
        }
    }

    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public final int m1637l(C6403l c6403l, C5978l c5978l) {
        if ("OMX.google.raw.decoder".equals(c6403l.yandex) && Build.VERSION.SDK_INT == 23 && !AbstractC15323l.m3964else(this.f9960l)) {
            return -1;
        }
        return c5978l.startapp;
    }

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public final void m1638l() {
        long j;
        long jMax;
        long j2;
        smaato();
        C7653l c7653l = this.f9972l;
        C10111l c10111l = c7653l.loadAd;
        if (!c7653l.vip() || c7653l.f15766package) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(c7653l.Signature.yandex(), AbstractC15323l.m3969goto(((C17953l) c7653l.adcel.f4450l).loadAd, c7653l.isPro()));
            ArrayDeque arrayDeque = c7653l.admob;
            while (!arrayDeque.isEmpty() && jMin >= ((C15384l) arrayDeque.getFirst()).crashlytics) {
                c7653l.ad = (C15384l) arrayDeque.remove();
            }
            C15384l c15384l = c7653l.ad;
            long jM3970import = jMin - c15384l.crashlytics;
            long jAppmetrica = AbstractC15323l.appmetrica(c15384l.yandex.yandex, jM3970import);
            if (arrayDeque.isEmpty()) {
                C6353l c6353l = (C6353l) c10111l.f20589l;
                if (!c6353l.mopub()) {
                    j = Long.MIN_VALUE;
                } else if (c6353l.vip >= 1024) {
                    long j3 = c6353l.remoteconfig;
                    C2006l c2006l = c6353l.isPro;
                    c2006l.getClass();
                    long jMetrica = j3 - ((long) (c2006l.subs.metrica() * (c2006l.isPro * c2006l.loadAd)));
                    int i = c6353l.admob.yandex;
                    int i2 = c6353l.mopub.yandex;
                    j = Long.MIN_VALUE;
                    long j4 = c6353l.vip;
                    jM3970import = i == i2 ? AbstractC15323l.m3970import(jM3970import, jMetrica, j4, RoundingMode.DOWN) : AbstractC15323l.m3970import(jM3970import, jMetrica * ((long) i), j4 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jM3970import = (long) (((double) c6353l.crashlytics) * jM3970import);
                }
                C15384l c15384l2 = c7653l.ad;
                j2 = c15384l2.loadAd + jM3970import;
                c15384l2.amazon = jM3970import - jAppmetrica;
            } else {
                j = Long.MIN_VALUE;
                C15384l c15384l3 = c7653l.ad;
                j2 = c15384l3.loadAd + jAppmetrica + c15384l3.amazon;
            }
            long j5 = ((C3505l) c10111l.f20586l).adcel;
            jMax = AbstractC15323l.m3969goto(((C17953l) c7653l.adcel.f4450l).loadAd, j5) + j2;
            long j6 = c7653l.f15761goto;
            if (j5 > j6) {
                long jM3969goto = AbstractC15323l.m3969goto(((C17953l) c7653l.adcel.f4450l).loadAd, j5 - j6);
                c7653l.f15761goto = j5;
                c7653l.f15770super += jM3969goto;
                if (c7653l.f15762import == null) {
                    c7653l.f15762import = new Handler(Looper.myLooper());
                }
                c7653l.f15762import.removeCallbacksAndMessages(null);
                c7653l.f15762import.postDelayed(new RunnableC16112l(21, c7653l), 100L);
            }
        }
        if (jMax != j) {
            if (!this.f9974l) {
                jMax = Math.max(this.f9964l, jMax);
            }
            this.f9964l = jMax;
            this.f9974l = false;
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public final boolean mo1639l(C5978l c5978l) {
        C17614l c17614l = this.f3018l;
        c17614l.getClass();
        if (c17614l.yandex != 0) {
            int iM1641l = m1641l(c5978l);
            if ((iM1641l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                C17614l c17614l2 = this.f3018l;
                c17614l2.getClass();
                if (c17614l2.yandex == 2 || (iM1641l & 1024) != 0 || (c5978l.f12625volatile == 0 && c5978l.f12618native == 0)) {
                    return true;
                }
            }
        }
        return this.f9972l.admob(c5978l) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public final int mo1640l(C3010l c3010l, C5978l c5978l) {
        int iM1641l;
        C13708l c13708lMopub;
        boolean z;
        boolean z2;
        int iAds = AbstractC4338l.ads(1, 0, 0, 0);
        String str = c5978l.metrica;
        String str2 = c5978l.metrica;
        if (!AbstractC3825l.subs(str)) {
            return AbstractC4338l.ads(0, 0, 0, 0);
        }
        int i = c5978l.f12614catch;
        boolean z3 = i != 0;
        boolean z4 = i == 0 || i == 2;
        int i2 = 8;
        C7653l c7653l = this.f9972l;
        if (z4) {
            if (z3) {
                List listPurchase = AbstractC4727l.purchase("audio/raw", false, false);
                if ((listPurchase.isEmpty() ? null : (C6403l) listPurchase.get(0)) == null) {
                    iM1641l = 0;
                }
            }
            iM1641l = m1641l(c5978l);
            if (c7653l.admob(c5978l) != 0) {
                return AbstractC4338l.ads(4, 8, 32, iM1641l);
            }
        } else {
            iM1641l = 0;
        }
        if (!"audio/raw".equals(str2) || c7653l.admob(c5978l) != 0) {
            int i3 = c5978l.f12619package;
            int i4 = c5978l.f12622synchronized;
            C12984l c12984l = new C12984l();
            c12984l.vip = AbstractC3825l.vip("audio/raw");
            c12984l.f25447throws = i3;
            c12984l.f25442package = i4;
            c12984l.f25445synchronized = 2;
            if (c7653l.admob(new C5978l(c12984l)) != 0) {
                if (str2 == null) {
                    c13708lMopub = C13708l.f26763l;
                } else if (c7653l.admob(c5978l) != 0) {
                    List listPurchase2 = AbstractC4727l.purchase("audio/raw", false, false);
                    C6403l c6403l = listPurchase2.isEmpty() ? null : (C6403l) listPurchase2.get(0);
                    if (c6403l != null) {
                        c13708lMopub = AbstractC1186l.isVip(c6403l);
                    } else {
                        c13708lMopub = AbstractC4727l.mopub(c3010l, c5978l, false, false);
                    }
                } else {
                    c13708lMopub = AbstractC4727l.mopub(c3010l, c5978l, false, false);
                }
                if (!c13708lMopub.isEmpty()) {
                    if (!z4) {
                        return AbstractC4338l.ads(2, 0, 0, 0);
                    }
                    C6403l c6403l2 = (C6403l) c13708lMopub.get(0);
                    Context context = this.f9960l;
                    boolean zPurchase = c6403l2.purchase(context, c5978l);
                    if (!zPurchase) {
                        int i5 = 1;
                        while (true) {
                            if (i5 >= c13708lMopub.f26765l) {
                                z = zPurchase;
                                z2 = true;
                                break;
                            }
                            C6403l c6403l3 = (C6403l) c13708lMopub.get(i5);
                            if (c6403l3.purchase(context, c5978l)) {
                                z2 = false;
                                c6403l2 = c6403l3;
                                z = true;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        z = zPurchase;
                        z2 = true;
                        break;
                    }
                    int i6 = z ? 4 : 3;
                    if (z && c6403l2.billing(c5978l)) {
                        i2 = 16;
                    }
                    return (c6403l2.mopub ? 64 : 0) | i6 | i2 | 32 | (z2 ? 128 : 0) | iM1641l;
                }
            }
        }
        return iAds;
    }

    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public final int m1641l(C5978l c5978l) {
        C15934l c15934lYandex;
        C7653l c7653l = this.f9972l;
        if (c7653l.f15759final) {
            c15934lYandex = C15934l.amazon;
        } else {
            C1608l c1608lLoadAd = ((C4856l) c7653l.subscription).loadAd(c7653l.mopub(c5978l));
            C10458l c10458l = new C10458l(0);
            c10458l.loadAd = c1608lLoadAd.yandex;
            c10458l.crashlytics = c1608lLoadAd.loadAd;
            c10458l.amazon = c1608lLoadAd.crashlytics;
            c15934lYandex = c10458l.yandex();
        }
        if (!c15934lYandex.yandex) {
            return 0;
        }
        int i = c15934lYandex.loadAd ? 1536 : AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        return c15934lYandex.crashlytics ? i | 2048 : i;
    }

    @Override // defpackage.AbstractC1091l
    public final void metrica(boolean z, boolean z2) {
        C9294l c9294l = new C9294l();
        this.f13942l = c9294l;
        C18595l c18595l = this.f9973l;
        Handler handler = (Handler) c18595l.f36317l;
        int i = 1;
        if (handler != null) {
            handler.post(new RunnableC7302l(c18595l, c9294l, i));
        }
        C17614l c17614l = this.f3018l;
        c17614l.getClass();
        boolean z3 = c17614l.loadAd;
        C7653l c7653l = this.f9972l;
        if (z3) {
            AbstractC12442l.subscription(c7653l.f15757else);
            if (!c7653l.f15768static) {
                c7653l.f15768static = true;
                c7653l.ads();
            }
        } else if (c7653l.f15768static) {
            c7653l.f15768static = false;
            c7653l.ads();
        }
        C17849l c17849l = this.f3021l;
        c17849l.getClass();
        c7653l.vip = c17849l;
        C18527l c18527l = this.f3009l;
        c18527l.getClass();
        ((C4856l) c7653l.subscription).mopub = c18527l;
        c7653l.metrica = new C7026l(12, this);
    }

    @Override // defpackage.InterfaceC10666l
    public final long mopub() {
        if (this.f3010l == 2) {
            m1638l();
        }
        return this.f9964l;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final void mo1642new(Exception exc) {
        AbstractC6427l.subs("MediaCodecAudioRenderer", "Audio codec error", exc);
        C18595l c18595l = this.f9973l;
        Handler handler = (Handler) c18595l.f36317l;
        if (handler != null) {
            handler.post(new RunnableC15668l(c18595l, exc, 0));
        }
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C7977l mo1643package(C6403l c6403l, C5978l c5978l, C5978l c5978l2, boolean z) {
        C7977l c7977lLoadAd = c6403l.loadAd(c5978l, c5978l2);
        int i = c7977lLoadAd.purchase;
        if (this.f13921l == null && mo1639l(c5978l2)) {
            i |= 32768;
        }
        if (m1637l(c6403l, c5978l2) > this.f9958l) {
            i |= 64;
        }
        int i2 = i;
        return new C7977l(c6403l.yandex, c5978l, c5978l2, i2 != 0 ? 0 : c7977lLoadAd.amazon, i2);
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void mo1644public() {
        this.f9972l.getClass();
    }

    @Override // defpackage.AbstractC1091l
    public final boolean remoteconfig() {
        return this.f9972l.smaato();
    }

    @Override // defpackage.AbstractC1091l
    public final boolean smaato() {
        if (!this.f13925l) {
            return false;
        }
        C7653l c7653l = this.f9972l;
        if (c7653l.vip()) {
            return c7653l.f15758extends && !c7653l.smaato();
        }
        return true;
    }

    @Override // defpackage.AbstractC6641l, defpackage.AbstractC1091l
    public final void startapp(long j, boolean z, boolean z2) {
        super.startapp(j, z, z2);
        this.f9972l.billing();
        this.f9964l = j;
        this.f9967l = -9223372036854775807L;
        this.f9969l = false;
        this.f9959l = false;
        this.f9974l = true;
    }

    @Override // defpackage.AbstractC1091l
    public final void subscription() {
        this.f9972l.metrica();
        this.f9970l = true;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void mo1645super(C5536l c5536l) {
        C18595l c18595l = this.f9973l;
        Handler handler = (Handler) c18595l.f36317l;
        if (handler != null) {
            handler.post(new RunnableC7762l(c18595l, c5536l, 8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final C1424l mo1646switch(C6403l c6403l, C5978l c5978l, MediaCrypto mediaCrypto, float f) {
        boolean z;
        int iIntValue;
        Integer num;
        C5978l[] c5978lArr = this.f3015l;
        c5978lArr.getClass();
        int iM1637l = m1637l(c6403l, c5978l);
        String str = c6403l.yandex;
        int i = 0;
        if (c5978lArr.length != 1) {
            for (C5978l c5978l2 : c5978lArr) {
                if (c6403l.loadAd(c5978l, c5978l2).amazon != 0) {
                    iM1637l = Math.max(iM1637l, m1637l(c6403l, c5978l2));
                }
            }
        }
        this.f9958l = iM1637l;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f9968l = z;
        this.f9963l = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = c6403l.crashlytics;
        int i3 = this.f9958l;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i4 = c5978l.f12619package;
        String str4 = c5978l.metrica;
        mediaFormat.setInteger("channel-count", i4);
        int i5 = c5978l.f12622synchronized;
        mediaFormat.setInteger("sample-rate", i5);
        AbstractC0837l.billing(mediaFormat, c5978l.ads);
        AbstractC0837l.purchase(mediaFormat, "max-input-size", i3);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            if (i2 == 23) {
                String str5 = Build.MODEL;
                if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                    mediaFormat.setFloat("operating-rate", f);
                }
            } else {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if ("audio/ac4".equals(str4)) {
            Pair pairLoadAd = AbstractC14501l.loadAd(c5978l);
            if (pairLoadAd != null) {
                AbstractC0837l.purchase(mediaFormat, "profile", ((Integer) pairLoadAd.first).intValue());
                AbstractC0837l.purchase(mediaFormat, "level", ((Integer) pairLoadAd.second).intValue());
            }
            if (i2 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        C7653l c7653l = this.f9972l;
        if (i2 >= 24) {
            int i6 = c5978l.f12619package;
            C12984l c12984l = new C12984l();
            c12984l.vip = AbstractC3825l.vip("audio/raw");
            c12984l.f25447throws = i6;
            c12984l.f25442package = i5;
            c12984l.f25445synchronized = 4;
            if (c7653l.admob(new C5978l(c12984l)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f9971l));
        }
        C5978l c5978l3 = null;
        if (Objects.equals(str4, "audio/iamf")) {
            InterfaceC17193l interfaceC17193l = c7653l.subscription;
            C8193l c8193l = interfaceC17193l instanceof C4856l ? ((C4856l) interfaceC17193l).admob : null;
            int i7 = 12;
            if (c8193l == null) {
                AbstractC6427l.vip("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                AbstractC8481l abstractC8481l = AbstractC16707l.yandex;
                Iterator it = c8193l.amazon.iterator();
                do {
                    if (!it.hasNext()) {
                        iIntValue = 0;
                        break;
                    }
                    num = (Integer) it.next();
                    iIntValue = num.intValue();
                } while (!AbstractC16707l.yandex.contains(num));
                if (iIntValue != 0) {
                    i7 = iIntValue;
                } else {
                    for (Integer num2 : c8193l.crashlytics) {
                        int iIntValue2 = num2.intValue();
                        if (AbstractC16707l.yandex.contains(num2)) {
                            i = iIntValue2;
                            break;
                        }
                    }
                    if (i != 0) {
                        i7 = i;
                    }
                }
                int iBitCount = Integer.bitCount(i7);
                mediaFormat.setInteger("channel-mask", i7);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        inmobi(mediaFormat);
        if ("audio/raw".equals(c6403l.loadAd) && !"audio/raw".equals(str4)) {
            c5978l3 = c5978l;
        }
        this.f9962l = c5978l3;
        return new C1424l(c6403l, mediaFormat, c5978l, (Object) null, mediaCrypto, this.f9966l);
    }

    @Override // defpackage.AbstractC1091l
    public final void tapsense() {
        m1638l();
        this.f9970l = false;
        C7653l c7653l = this.f9972l;
        c7653l.f15753catch = false;
        if (c7653l.vip()) {
            C4636l c4636l = c7653l.Signature;
            C0558l c0558l = c4636l.billing;
            c0558l.firebase = 0L;
            c0558l.tapsense = 0;
            c0558l.subscription = 0;
            c0558l.smaato = 0L;
            c0558l.advert = -9223372036854775807L;
            c0558l.isVip = -9223372036854775807L;
            if (c0558l.Signature == -9223372036854775807L) {
                c0558l.admob.yandex(0);
            }
            c0558l.pro = c0558l.yandex();
            if (!c4636l.firebase || c4636l.crashlytics()) {
                c4636l.yandex.pause();
            }
        }
        this.f9959l = false;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void mo1647this() {
        this.f9972l.f15774throws = true;
    }

    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final float mo1648throw(float f, C5978l c5978l, C5978l[] c5978lArr) {
        int iMax = -1;
        for (C5978l c5978l2 : c5978lArr) {
            int i = c5978l2.f12622synchronized;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    @Override // defpackage.AbstractC6641l
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final boolean mo1649transient(long j, long j2, InterfaceC17529l interfaceC17529l, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C5978l c5978l) throws C17361l {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.f9967l = -9223372036854775807L;
        if (this.f9962l != null && (i2 & 2) != 0) {
            interfaceC17529l.getClass();
            interfaceC17529l.billing(i);
            return true;
        }
        C7653l c7653l = this.f9972l;
        if (z) {
            if (interfaceC17529l != null) {
                interfaceC17529l.billing(i);
            }
            this.f13942l.billing += i3;
            c7653l.f15774throws = true;
            return true;
        }
        try {
            if (!c7653l.firebase(i3, j3, byteBuffer)) {
                this.f9967l = j3;
                return false;
            }
            if (interfaceC17529l != null) {
                interfaceC17529l.billing(i);
            }
            this.f13942l.purchase += i3;
            return true;
        } catch (C10945l e) {
            if (this.f13902l) {
                C17614l c17614l = this.f3018l;
                c17614l.getClass();
                if (c17614l.yandex != 0) {
                    i5 = 5003;
                } else {
                    i5 = 5002;
                }
            } else {
                i5 = 5002;
            }
            throw crashlytics(e, c5978l, e.f22072l, i5);
        } catch (C13621l e2) {
            C5978l c5978l2 = this.f9961l;
            if (this.f13902l) {
                C17614l c17614l2 = this.f3018l;
                c17614l2.getClass();
                if (c17614l2.yandex != 0) {
                    i4 = 5004;
                } else {
                    i4 = 5001;
                }
            } else {
                i4 = 5001;
            }
            throw crashlytics(e2, c5978l2, e2.f26651l, i4);
        }
    }

    @Override // defpackage.AbstractC6641l, defpackage.AbstractC1091l
    public final void vip() {
        C18595l c18595l = this.f9973l;
        this.f9965l = true;
        this.f9961l = null;
        this.f9967l = -9223372036854775807L;
        this.f9959l = false;
        try {
            this.f9972l.billing();
            try {
                super.vip();
            } finally {
                c18595l.firebase(this.f13942l);
            }
        } catch (Throwable th) {
            try {
                super.vip();
                throw th;
            } finally {
                c18595l.firebase(this.f13942l);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    @Override // defpackage.AbstractC6641l, defpackage.AbstractC1091l, defpackage.InterfaceC3184l
    public final void yandex(int i, Object obj) {
        C16957l c16957l;
        C7653l c7653l = this.f9972l;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (c7653l.f15769strictfp != fFloatValue) {
                c7653l.f15769strictfp = fFloatValue;
                if (c7653l.vip()) {
                    c7653l.Signature.yandex.setVolume(c7653l.f15769strictfp);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            C13736l c13736l = (C13736l) obj;
            c13736l.getClass();
            if (c7653l.license.equals(c13736l)) {
                return;
            }
            c7653l.license = c13736l;
            if (c7653l.f15768static) {
                return;
            }
            c7653l.ads();
            return;
        }
        if (i == 6) {
            C13302l c13302l = (C13302l) obj;
            c13302l.getClass();
            if (c7653l.f15755continue.equals(c13302l)) {
                return;
            }
            if (c7653l.Signature != null) {
                c7653l.f15755continue.getClass();
            }
            c7653l.f15755continue = c13302l;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            c7653l.f15754class = audioDeviceInfo;
            C4636l c4636l = c7653l.Signature;
            if (c4636l != null) {
                c4636l.yandex.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f9971l = ((Integer) obj).intValue();
            InterfaceC17529l interfaceC17529l = this.f13920l;
            if (interfaceC17529l != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f9971l));
                interfaceC17529l.yandex(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            c7653l.isVip = ((Boolean) obj).booleanValue();
            C15384l c15384l = new C15384l(c7653l.license() ? C1372l.amazon : c7653l.advert, -9223372036854775807L, -9223372036854775807L);
            if (c7653l.vip()) {
                c7653l.pro = c15384l;
                return;
            } else {
                c7653l.ad = c15384l;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (c7653l.f15771switch) {
                if (c7653l.f15752case == iIntValue) {
                    c7653l.f15771switch = false;
                    if (c7653l.f15752case != iIntValue) {
                        c7653l.f15752case = iIntValue;
                        c7653l.f15757else = iIntValue != 0;
                        c7653l.ads();
                    }
                }
            } else if (c7653l.f15752case != iIntValue) {
                c7653l.f15752case = iIntValue;
                c7653l.f15757else = iIntValue != 0;
                c7653l.ads();
            }
            if (Build.VERSION.SDK_INT < 35 || (c16957l = this.f9966l) == null) {
                return;
            }
            c16957l.amazon(iIntValue);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            AtomicInteger atomicInteger = C7653l.f15751abstract;
            if (iIntValue2 == 0 || iIntValue2 == -1) {
                iIntValue2 = -1;
            }
            if (c7653l.f15763interface == iIntValue2) {
                return;
            }
            c7653l.f15763interface = iIntValue2;
            c7653l.ads();
            return;
        }
        if (i != 20) {
            super.yandex(i, obj);
            return;
        }
        obj.getClass();
        InterfaceC17193l interfaceC17193l = (InterfaceC17193l) obj;
        if (interfaceC17193l.equals(c7653l.subscription)) {
            return;
        }
        ((C4856l) c7653l.subscription).amazon();
        c7653l.subscription = interfaceC17193l;
        C2591l c2591l = c7653l.tapsense;
        if (c2591l != null) {
            C4856l c4856l = (C4856l) interfaceC17193l;
            c4856l.billing();
            if (c4856l.billing == null) {
                c4856l.billing = new C8961l(Thread.currentThread());
            }
            c4856l.billing.yandex(c2591l);
        }
        c7653l.ads();
    }

    @Override // defpackage.AbstractC1091l
    public final InterfaceC10666l subs() {
        return this;
    }
}
