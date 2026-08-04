package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lؘؙٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6641l extends AbstractC1091l {

    /* JADX INFO: renamed from: lٌّۚ, reason: contains not printable characters */
    public static final byte[] f13899l = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public C5978l f13900l;

    /* JADX INFO: renamed from: lؑٔۦ, reason: contains not printable characters */
    public boolean f13901l;

    /* JADX INFO: renamed from: lؑۚؓ, reason: contains not printable characters */
    public boolean f13902l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C5467l f13903l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public float f13904l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final boolean f13905l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public C5978l f13906l;

    /* JADX INFO: renamed from: lؓٗؗ, reason: contains not printable characters */
    public boolean f13907l;

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public ArrayDeque f13908l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C3010l f13909l;

    /* JADX INFO: renamed from: lؔۗۖ, reason: contains not printable characters */
    public AbstractC8481l f13910l;

    /* JADX INFO: renamed from: lّؔ۟, reason: contains not printable characters */
    public boolean f13911l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final InterfaceC11856l f13912l;

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public boolean f13913l;

    /* JADX INFO: renamed from: lۣؕ٘, reason: contains not printable characters */
    public ByteBuffer f13914l;

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public int f13915l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public float f13916l;

    /* JADX INFO: renamed from: lؖٙؓ, reason: contains not printable characters */
    public int f13917l;

    /* JADX INFO: renamed from: lٟؖٓ, reason: contains not printable characters */
    public long f13918l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public final long f13919l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public InterfaceC17529l f13920l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public InterfaceC9655l f13921l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C4136l f13922l;

    /* JADX INFO: renamed from: lؗۘۨ, reason: contains not printable characters */
    public C5536l f13923l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public MediaFormat f13924l;

    /* JADX INFO: renamed from: lؘٝؕ, reason: contains not printable characters */
    public boolean f13925l;

    /* JADX INFO: renamed from: lؘٜۘ, reason: contains not printable characters */
    public C13057l f13926l;

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public boolean f13927l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final Context f13928l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final AtomicInteger f13929l;

    /* JADX INFO: renamed from: lؙۨۨ, reason: contains not printable characters */
    public C5536l f13930l;

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public float f13931l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final MediaCodec.BufferInfo f13932l;

    /* JADX INFO: renamed from: lؚٕۤ, reason: contains not printable characters */
    public int f13933l;

    /* JADX INFO: renamed from: lؚۤۜ, reason: contains not printable characters */
    public boolean f13934l;

    /* JADX INFO: renamed from: lؚۤ۟, reason: contains not printable characters */
    public boolean f13935l;

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public boolean f13936l;

    /* JADX INFO: renamed from: lًؙؗ, reason: contains not printable characters */
    public boolean f13937l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C4136l f13938l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public C2865l f13939l;

    /* JADX INFO: renamed from: lٍٜٛ, reason: contains not printable characters */
    public boolean f13940l;

    /* JADX INFO: renamed from: lٍۥ۟, reason: contains not printable characters */
    public long f13941l;

    /* JADX INFO: renamed from: lًَؘ, reason: contains not printable characters */
    public C9294l f13942l;

    /* JADX INFO: renamed from: lُۢۗ, reason: contains not printable characters */
    public boolean f13943l;

    /* JADX INFO: renamed from: lُۨ, reason: contains not printable characters */
    public boolean f13944l;

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public boolean f13945l;

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public boolean f13946l;

    /* JADX INFO: renamed from: lًّۥ, reason: contains not printable characters */
    public boolean f13947l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final ArrayDeque f13948l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C4136l f13949l;

    /* JADX INFO: renamed from: lٌْؔ, reason: contains not printable characters */
    public int f13950l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public MediaCrypto f13951l;

    /* JADX INFO: renamed from: lٓؔۧ, reason: contains not printable characters */
    public boolean f13952l;

    /* JADX INFO: renamed from: lؙٓۦ, reason: contains not printable characters */
    public long f13953l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public C5978l f13954l;

    /* JADX INFO: renamed from: lٜٔٚ, reason: contains not printable characters */
    public C17361l f13955l;

    /* JADX INFO: renamed from: lٕؑٞ, reason: contains not printable characters */
    public int f13956l;

    /* JADX INFO: renamed from: lٕٖٙ, reason: contains not printable characters */
    public int f13957l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public InterfaceC9655l f13958l;

    /* JADX INFO: renamed from: lٖ٘ؕ, reason: contains not printable characters */
    public boolean f13959l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public C8780l f13960l;

    /* JADX INFO: renamed from: lٖۣ۠, reason: contains not printable characters */
    public boolean f13961l;

    /* JADX INFO: renamed from: lٖٗ٘, reason: contains not printable characters */
    public long f13962l;

    /* JADX INFO: renamed from: lٟٗٛ, reason: contains not printable characters */
    public boolean f13963l;

    /* JADX INFO: renamed from: lٌؚ٘, reason: contains not printable characters */
    public long f13964l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final C5601l f13965l;

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public C6403l f13966l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final float f13967l;

    /* JADX INFO: renamed from: lُ٘ۙ, reason: contains not printable characters */
    public boolean f13968l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6641l(Context context, int i, InterfaceC11856l interfaceC11856l, boolean z, float f) {
        super(i);
        C3010l c3010l = C3010l.f6526l;
        this.f13928l = context.getApplicationContext();
        this.f13912l = interfaceC11856l;
        this.f13909l = c3010l;
        this.f13905l = z;
        this.f13967l = f;
        this.f13929l = new AtomicInteger();
        this.f13922l = new C4136l(0);
        this.f13938l = new C4136l(0);
        this.f13949l = new C4136l(2);
        C5467l c5467l = new C5467l(2);
        c5467l.f11707l = 32;
        this.f13903l = c5467l;
        this.f13932l = new MediaCodec.BufferInfo();
        this.f13904l = 1.0f;
        this.f13916l = 1.0f;
        this.f13919l = -9223372036854775807L;
        this.f13948l = new ArrayDeque();
        this.f13926l = C13057l.mopub;
        c5467l.startapp(0);
        c5467l.f8498l.order(ByteOrder.nativeOrder());
        C5601l c5601l = new C5601l(0);
        c5601l.f11899l = InterfaceC15103l.yandex;
        c5601l.f11896l = 0;
        c5601l.f11897l = 2;
        this.f13965l = c5601l;
        this.f13931l = -1.0f;
        this.f13915l = 0;
        this.f13956l = 0;
        this.f13957l = -1;
        this.f13950l = -1;
        this.f13941l = -9223372036854775807L;
        this.f13953l = -9223372036854775807L;
        this.f13962l = -9223372036854775807L;
        this.f13964l = -9223372036854775807L;
        this.f13917l = 0;
        this.f13933l = 0;
        this.f13942l = new C9294l();
        this.f13934l = false;
        this.f13918l = 0L;
        int i2 = AbstractC8481l.f17529l;
        this.f13910l = C13825l.f26967l;
        C5536l c5536l = C5536l.loadAd;
        this.f13930l = c5536l;
        this.f13923l = c5536l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // defpackage.AbstractC1091l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Signature(defpackage.C5978l[] r12, long r13, long r15, defpackage.C5019l r17) {
        /*
            r11 = this;
            lْؑٝ r12 = r11.f13926l
            long r0 = r12.crashlytics
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            lْؑٝ r4 = new lْؑٝ
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.m2048l(r4)
            boolean r12 = r11.f13961l
            if (r12 == 0) goto L56
            r11.mo1647this()
            return
        L24:
            java.util.ArrayDeque r12 = r11.f13948l
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.f13953l
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.f13962l
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            lْؑٝ r4 = new lْؑٝ
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.m2048l(r4)
            lْؑٝ r12 = r11.f13926l
            long r12 = r12.crashlytics
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.mo1647this()
        L56:
            return
        L57:
            lْؑٝ r0 = new lْؑٝ
            long r1 = r11.f13953l
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6641l.Signature(lؘۜٔ[], long, long, lٜؗٚ):void");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x015a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:98:0x014d  */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0126, code lost:
    
        if (r4.billing(r2) != false) goto L150;
     */
    /* JADX INFO: renamed from: abstract */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.C7977l mo1629abstract(defpackage.C10023l r15) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6641l.mo1629abstract(lَؒؐ):lًٓؓ");
    }

    @Override // defpackage.AbstractC1091l
    public void ad(long j, long j2) throws C17361l {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.f13959l) {
            this.f13959l = false;
            m2030break();
        }
        C17361l c17361l = this.f13955l;
        if (c17361l != null) {
            this.f13955l = null;
            throw c17361l;
        }
        try {
            if (this.f13925l) {
                mo1634implements();
                return;
            }
            if (this.f13954l != null || m2052protected(2)) {
                m2054static();
                if (this.f13902l) {
                    Trace.beginSection("bypassRender");
                    while (m2057throws(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.f13920l != null) {
                    this.f3009l.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (m2059volatile(j, j2)) {
                        long j3 = this.f13919l;
                        if (j3 != -9223372036854775807L) {
                            this.f3009l.getClass();
                            z2 = SystemClock.elapsedRealtime() - jElapsedRealtime < j3;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    while (m2050native()) {
                        long j4 = this.f13919l;
                        if (j4 != -9223372036854775807L) {
                            this.f3009l.getClass();
                            z = SystemClock.elapsedRealtime() - jElapsedRealtime < j4;
                        }
                        if (!z) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    C9294l c9294l = this.f13942l;
                    int i = c9294l.amazon;
                    InterfaceC11759l interfaceC11759l = this.f3020l;
                    interfaceC11759l.getClass();
                    c9294l.amazon = i + interfaceC11759l.smaato(j - this.f3022l);
                    m2052protected(1);
                }
                synchronized (this.f13942l) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw crashlytics(e, this.f13954l, false, AbstractC15323l.signatures(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z4 = e2 instanceof MediaCodec.CodecException;
            if (!z4) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            mo1642new(e2);
            if (z4 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z3 = true;
            }
            if (z3) {
                m2060while();
            }
            C18406l c18406lMo2056synchronized = mo2056synchronized(e2, this.f13966l);
            throw crashlytics(c18406lMo2056synchronized, this.f13954l, z3, c18406lMo2056synchronized.f35949l == 1101 ? 4006 : 4003);
        }
    }

    @Override // defpackage.AbstractC1091l
    public final int applovin() {
        return 8;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void m2030break() throws C17361l {
        int i = this.f13933l;
        if (i == 1) {
            m2051private();
            return;
        }
        if (i == 2) {
            m2051private();
            m2041l();
        } else if (i != 3) {
            this.f13925l = true;
            mo1634implements();
        } else {
            m2060while();
            m2054static();
        }
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final C13057l m2031case() {
        ArrayDeque arrayDeque = this.f13948l;
        return !arrayDeque.isEmpty() ? (C13057l) arrayDeque.getLast() : this.f13926l;
    }

    /* JADX INFO: renamed from: catch */
    public abstract ArrayList mo1630catch(C3010l c3010l, C5978l c5978l, boolean z);

    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void m2032class(C6403l c6403l, MediaCrypto mediaCrypto) {
        int i;
        this.f13966l = c6403l;
        C5978l c5978l = this.f13954l;
        c5978l.getClass();
        String str = c6403l.yandex;
        float f = this.f13916l;
        C5978l[] c5978lArr = this.f3015l;
        c5978lArr.getClass();
        float fMo1648throw = mo1648throw(f, c5978l, c5978lArr);
        if (fMo1648throw <= this.f13967l) {
            fMo1648throw = -1.0f;
        }
        this.f3009l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1424l c1424lMo1646switch = mo1646switch(c6403l, c5978l, mediaCrypto, fMo1648throw);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            C17849l c17849l = this.f3021l;
            c17849l.getClass();
            AbstractC12148l.m3366synchronized(c1424lMo1646switch, c17849l);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            InterfaceC17529l interfaceC17529lIsPro = this.f13912l.isPro(c1424lMo1646switch);
            this.f13920l = interfaceC17529lIsPro;
            this.f13901l = interfaceC17529lIsPro.subscription(new C14965l(this));
            Trace.endSection();
            this.f3009l.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c6403l.purchase(this.f13928l, c5978l)) {
                String strCrashlytics = C5978l.crashlytics(c5978l);
                Locale locale = Locale.US;
                AbstractC6427l.vip("MediaCodecRenderer", AbstractC14814l.ads("Format exceeds selected codec's capabilities [", strCrashlytics, ", ", str, "]"));
            }
            this.f13931l = fMo1648throw;
            this.f13906l = c5978l;
            boolean z = false;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i = 2;
                } else if (i2 < 24) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if (i2 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i = 0;
            } else {
                String str3 = Build.DEVICE;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            this.f13915l = i;
            this.f13913l = i2 == 29 && "c2.android.aac.decoder".equals(str);
            this.f13936l = i2 == 23 && "OMX.google.vorbis.decoder".equals(str);
            String str4 = c6403l.yandex;
            if ((i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && c6403l.billing))) {
                z = true;
            }
            this.f13947l = z;
            this.f13920l.getClass();
            if (this.f3010l == 2) {
                this.f3009l.getClass();
                this.f13941l = SystemClock.elapsedRealtime() + 1000;
            }
            this.f13942l.yandex++;
            long j = jElapsedRealtime2 - jElapsedRealtime;
            if (i2 >= 31 && !this.f13910l.isEmpty()) {
                InterfaceC17529l interfaceC17529l = this.f13920l;
                interfaceC17529l.getClass();
                interfaceC17529l.adcel(new ArrayList(this.f13910l));
            }
            mo1633goto(str, jElapsedRealtime2, j);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final void m2033const() {
        this.f13953l = -9223372036854775807L;
        m2031case().billing = -9223372036854775807L;
        this.f13962l = -9223372036854775807L;
        this.f13940l = false;
        this.f13903l.remoteconfig();
        this.f13949l.remoteconfig();
        this.f13952l = false;
        C5601l c5601l = this.f13965l;
        c5601l.getClass();
        c5601l.f11899l = InterfaceC15103l.yandex;
        c5601l.f11896l = 0;
        c5601l.f11897l = 2;
    }

    /* JADX INFO: renamed from: continue */
    public abstract void mo1631continue(C4136l c4136l);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m2034default(MediaCrypto mediaCrypto, boolean z) throws C8780l {
        C5978l c5978l = this.f13954l;
        c5978l.getClass();
        if (this.f13908l == null) {
            try {
                List listM2035extends = m2035extends(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f13908l = arrayDeque;
                if (this.f13905l) {
                    arrayDeque.addAll(listM2035extends);
                } else {
                    ArrayList arrayList = (ArrayList) listM2035extends;
                    if (!arrayList.isEmpty()) {
                        this.f13908l.add((C6403l) arrayList.get(0));
                    }
                }
                this.f13960l = null;
            } catch (C11928l e) {
                throw new C8780l(c5978l, e, z, -49998);
            }
        }
        if (this.f13908l.isEmpty()) {
            throw new C8780l(c5978l, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.f13908l;
        arrayDeque2.getClass();
        while (this.f13920l == null) {
            C6403l c6403l = (C6403l) arrayDeque2.peekFirst();
            c6403l.getClass();
            if (!mo2036final(c5978l) || !mo2042l(c6403l)) {
                return;
            }
            try {
                m2032class(c6403l, mediaCrypto);
            } catch (Exception e2) {
                AbstractC6427l.metrica("MediaCodecRenderer", "Failed to initialize decoder: " + c6403l, e2);
                arrayDeque2.removeFirst();
                C8780l c8780l = new C8780l("Decoder init failed: " + c6403l.yandex + ", " + c5978l, e2, c5978l.metrica, z, c6403l, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                mo1642new(c8780l);
                C8780l c8780l2 = this.f13960l;
                if (c8780l2 == null) {
                    this.f13960l = c8780l;
                } else {
                    this.f13960l = new C8780l(c8780l2.getMessage(), c8780l2.getCause(), c8780l2.f18077l, c8780l2.f18076l, c8780l2.f18075l, c8780l2.f18078l);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f13960l;
                }
            }
        }
        this.f13908l = null;
    }

    /* JADX INFO: renamed from: else */
    public long mo1632else(long j, long j2, boolean z) {
        return super.purchase(j, j2);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final List m2035extends(boolean z) {
        C5978l c5978l = this.f13954l;
        c5978l.getClass();
        C3010l c3010l = this.f13909l;
        ArrayList arrayListMo1630catch = mo1630catch(c3010l, c5978l, z);
        if (!arrayListMo1630catch.isEmpty() || !z) {
            return arrayListMo1630catch;
        }
        ArrayList arrayListMo1630catch2 = mo1630catch(c3010l, c5978l, false);
        if (!arrayListMo1630catch2.isEmpty()) {
            AbstractC6427l.vip("MediaCodecRenderer", "Drm session requires secure decoder for " + c5978l.metrica + ", but no secure decoder available. Trying to proceed with " + arrayListMo1630catch2 + ".");
        }
        return arrayListMo1630catch2;
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public boolean mo2036final(C5978l c5978l) {
        return true;
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public void mo2037finally(long j) {
        this.f13962l = j;
        while (true) {
            ArrayDeque arrayDeque = this.f13948l;
            if (arrayDeque.isEmpty() || j < ((C13057l) arrayDeque.peek()).yandex) {
                return;
            }
            C13057l c13057l = (C13057l) arrayDeque.poll();
            c13057l.getClass();
            m2048l(c13057l);
            mo1647this();
        }
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public int mo2038for(C4136l c4136l) {
        return 0;
    }

    /* JADX INFO: renamed from: goto */
    public abstract void mo1633goto(String str, long j, long j2);

    /* JADX INFO: renamed from: implements */
    public abstract void mo1634implements();

    /* JADX INFO: renamed from: import */
    public abstract void mo1635import(String str);

    public final void inmobi(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.f13930l.yandex.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX INFO: renamed from: instanceof */
    public abstract void mo1636instanceof(C5978l c5978l, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final boolean m2039interface(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        C5978l c5978l = this.f13900l;
        return c5978l == null || !Objects.equals(c5978l.metrica, "audio/opus") || j - j2 > 80000;
    }

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public final boolean m2040l(C5978l c5978l) throws C17361l {
        if (this.f13920l != null && this.f13933l != 3 && this.f3010l != 0) {
            float f = this.f13916l;
            c5978l.getClass();
            C5978l[] c5978lArr = this.f3015l;
            c5978lArr.getClass();
            float fMo1648throw = mo1648throw(f, c5978l, c5978lArr);
            float f2 = this.f13931l;
            if (f2 != fMo1648throw) {
                if (fMo1648throw == -1.0f) {
                    if (this.f13907l) {
                        this.f13917l = 1;
                        this.f13933l = 3;
                        return false;
                    }
                    m2060while();
                    m2054static();
                    return false;
                }
                if (f2 != -1.0f || fMo1648throw > this.f13967l) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo1648throw);
                    InterfaceC17529l interfaceC17529l = this.f13920l;
                    interfaceC17529l.getClass();
                    interfaceC17529l.yandex(bundle);
                    this.f13931l = fMo1648throw;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public final void m2041l() throws C17361l {
        InterfaceC9655l interfaceC9655l = this.f13921l;
        interfaceC9655l.getClass();
        C11102l c11102lAdmob = interfaceC9655l.admob();
        if (c11102lAdmob instanceof C11102l) {
            try {
                MediaCrypto mediaCrypto = this.f13951l;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(c11102lAdmob.loadAd);
            } catch (MediaCryptoException e) {
                throw crashlytics(e, this.f13954l, false, 6006);
            }
        }
        m2044l(this.f13921l);
        this.f13917l = 0;
        this.f13933l = 0;
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public boolean mo2042l(C6403l c6403l) {
        return true;
    }

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public boolean mo2043l() {
        return true;
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final void m2044l(InterfaceC9655l interfaceC9655l) {
        InterfaceC9655l interfaceC9655l2 = this.f13958l;
        if (interfaceC9655l2 != interfaceC9655l) {
            if (interfaceC9655l != null) {
                interfaceC9655l.purchase(null);
            }
            if (interfaceC9655l2 != null) {
                interfaceC9655l2.amazon(null);
            }
        }
        this.f13958l = interfaceC9655l;
    }

    /* JADX INFO: renamed from: lْٓؒ */
    public boolean mo1639l(C5978l c5978l) {
        return false;
    }

    /* JADX INFO: renamed from: lْ٘ۚ */
    public abstract int mo1640l(C3010l c3010l, C5978l c5978l);

    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public final void m2045l(long j) {
        C5978l c5978l = (C5978l) this.f13926l.amazon.m3103continue(j);
        if (c5978l == null && this.f13943l && this.f13924l != null) {
            c5978l = (C5978l) this.f13926l.amazon.m3123switch();
        }
        if (c5978l != null) {
            this.f13900l = c5978l;
        } else if (!this.f13945l || this.f13900l == null) {
            return;
        }
        C5978l c5978l2 = this.f13900l;
        c5978l2.getClass();
        mo1636instanceof(c5978l2, this.f13924l);
        this.f13945l = false;
        this.f13943l = false;
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public boolean mo2046l(C4136l c4136l) {
        return false;
    }

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public boolean mo2047l() {
        int i = this.f13933l;
        if (i == 3 || ((this.f13913l && !this.f13968l) || (this.f13936l && this.f13963l))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            m2041l();
            return false;
        } catch (C17361l e) {
            AbstractC6427l.metrica("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final void m2048l(C13057l c13057l) {
        this.f13926l = c13057l;
        if (c13057l.crashlytics != -9223372036854775807L) {
            this.f13943l = true;
            mo1644public();
        }
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final void m2049l() {
        mo2053return();
        this.f13955l = null;
        this.f13908l = null;
        this.f13966l = null;
        this.f13906l = null;
        this.f13924l = null;
        this.f13945l = false;
        this.f13968l = false;
        this.f13931l = -1.0f;
        this.f13915l = 0;
        this.f13913l = false;
        this.f13936l = false;
        this.f13947l = false;
        this.f13901l = false;
        this.f13944l = false;
        this.f13956l = 0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:112:0x0091 A[EDGE_INSN: B:112:0x0091->B:33:0x0091 BREAK  A[LOOP:0: B:30:0x006f->B:32:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x006f->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:76:0x012f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:79:0x0137  */
    /* JADX WARN: Code duplicated, block: B:81:0x013b  */
    /* JADX WARN: Code duplicated, block: B:85:0x014e  */
    /* JADX WARN: Code duplicated, block: B:88:0x016e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0176  */
    /* JADX WARN: Code duplicated, block: B:93:0x0189  */
    /* JADX WARN: Code duplicated, block: B:96:0x0190  */
    /* JADX WARN: Code duplicated, block: B:98:0x0196  */
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final boolean m2050native() throws C17361l {
        int iPosition;
        C10023l c10023l;
        int i;
        long j;
        boolean zCrashlytics;
        int iMo2038for;
        long j2;
        int i2;
        long j3;
        C4276l c4276l;
        int i3;
        C5978l c5978l;
        InterfaceC17529l interfaceC17529l = this.f13920l;
        if (interfaceC17529l != null && this.f13917l != 2 && !this.f13937l) {
            int i4 = this.f13957l;
            C4136l c4136l = this.f13938l;
            if (i4 < 0) {
                int iIsPro = interfaceC17529l.isPro();
                this.f13957l = iIsPro;
                if (iIsPro >= 0) {
                    c4136l.f8498l = interfaceC17529l.vip(iIsPro);
                    c4136l.remoteconfig();
                    if (this.f13917l == 1) {
                        if (!this.f13947l) {
                            this.f13963l = true;
                            interfaceC17529l.purchase(this.f13957l, 0, 4, 0L);
                            this.f13957l = -1;
                            c4136l.f8498l = null;
                        }
                        this.f13917l = 2;
                        return false;
                    }
                    if (this.f13946l) {
                        this.f13946l = false;
                        ByteBuffer byteBuffer = c4136l.f8498l;
                        byteBuffer.getClass();
                        byteBuffer.put(f13899l);
                        interfaceC17529l.purchase(this.f13957l, 38, 0, 0L);
                        this.f13957l = -1;
                        c4136l.f8498l = null;
                        this.f13907l = true;
                        return true;
                    }
                    if (this.f13956l == 1) {
                        i3 = 0;
                        while (true) {
                            c5978l = this.f13906l;
                            c5978l.getClass();
                            if (i3 < c5978l.ads.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.f13906l.ads.get(i3);
                            ByteBuffer byteBuffer2 = c4136l.f8498l;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i3++;
                        }
                        this.f13956l = 2;
                    }
                    ByteBuffer byteBuffer3 = c4136l.f8498l;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    c10023l = this.f3008l;
                    c10023l.Signature();
                    try {
                        interfaceC17529l.smaato(new RunnableC12388l(this, c10023l, 6));
                        i = this.f13929l.get();
                        if (i == -3) {
                            if (firebase()) {
                                m2031case().billing = this.f13953l;
                                return false;
                            }
                        } else {
                            if (i == -5) {
                                if (this.f13956l == 2) {
                                    c4136l.remoteconfig();
                                    this.f13956l = 1;
                                }
                                mo1629abstract(c10023l);
                                return true;
                            }
                            if (c4136l.crashlytics(4)) {
                                if (!this.f13907l || c4136l.crashlytics(1)) {
                                    j = c4136l.f8496l;
                                    if (!mo2046l(c4136l)) {
                                        zCrashlytics = c4136l.crashlytics(1073741824);
                                        if (zCrashlytics) {
                                            c4276l = c4136l.f8499l;
                                            if (iPosition == 0) {
                                                c4276l.getClass();
                                            } else {
                                                if (c4276l.amazon == null) {
                                                    int[] iArr = new int[1];
                                                    c4276l.amazon = iArr;
                                                    c4276l.subs.numBytesOfClearData = iArr;
                                                }
                                                int[] iArr2 = c4276l.amazon;
                                                iArr2[0] = iArr2[0] + iPosition;
                                            }
                                        }
                                        if (this.f13935l) {
                                            C13057l c13057lM2031case = m2031case();
                                            C11522l c11522l = c13057lM2031case.amazon;
                                            C5978l c5978l2 = this.f13954l;
                                            c5978l2.getClass();
                                            c11522l.billing(j, c5978l2);
                                            c13057lM2031case.purchase = true;
                                            this.f13935l = false;
                                        }
                                        this.f13953l = Math.max(this.f13953l, j);
                                        if (firebase() || c4136l.crashlytics(536870912)) {
                                            m2031case().billing = this.f13953l;
                                        }
                                        c4136l.adcel();
                                        if (c4136l.crashlytics(268435456)) {
                                            mo1631continue(c4136l);
                                        }
                                        if (this.f13934l) {
                                            j3 = this.f13953l;
                                            if (j <= j3) {
                                                this.f13918l = (j3 - j) + 1 + this.f13918l;
                                            }
                                            this.f13953l = j;
                                            this.f13934l = false;
                                        }
                                        mo2058try(c4136l);
                                        iMo2038for = mo2038for(c4136l);
                                        j2 = j + this.f13918l;
                                        i2 = this.f13957l;
                                        if (zCrashlytics) {
                                            interfaceC17529l.loadAd(i2, c4136l.f8499l, j2, iMo2038for);
                                        } else {
                                            ByteBuffer byteBuffer4 = c4136l.f8498l;
                                            byteBuffer4.getClass();
                                            interfaceC17529l.purchase(i2, byteBuffer4.limit(), iMo2038for, j2);
                                        }
                                        this.f13957l = -1;
                                        c4136l.f8498l = null;
                                        this.f13907l = true;
                                        this.f13956l = 0;
                                        this.f13942l.crashlytics++;
                                        return true;
                                    }
                                } else {
                                    c4136l.remoteconfig();
                                    if (this.f13956l == 2) {
                                        this.f13956l = 1;
                                        return true;
                                    }
                                }
                                return true;
                            }
                            m2031case().billing = this.f13953l;
                            if (this.f13956l == 2) {
                                c4136l.remoteconfig();
                                this.f13956l = 1;
                            }
                            this.f13937l = true;
                            if (!this.f13907l) {
                                m2030break();
                                return false;
                            }
                            if (!this.f13947l) {
                                this.f13963l = true;
                                interfaceC17529l.purchase(this.f13957l, 0, 4, 0L);
                                this.f13957l = -1;
                                c4136l.f8498l = null;
                                return false;
                            }
                        }
                    } catch (C17241l e) {
                        mo1642new(e);
                        m2052protected(0);
                        m2051private();
                        return true;
                    }
                }
            } else {
                if (this.f13917l == 1) {
                    if (!this.f13947l) {
                        this.f13963l = true;
                        interfaceC17529l.purchase(this.f13957l, 0, 4, 0L);
                        this.f13957l = -1;
                        c4136l.f8498l = null;
                    }
                    this.f13917l = 2;
                    return false;
                }
                if (this.f13946l) {
                    this.f13946l = false;
                    ByteBuffer byteBuffer5 = c4136l.f8498l;
                    byteBuffer5.getClass();
                    byteBuffer5.put(f13899l);
                    interfaceC17529l.purchase(this.f13957l, 38, 0, 0L);
                    this.f13957l = -1;
                    c4136l.f8498l = null;
                    this.f13907l = true;
                    return true;
                }
                if (this.f13956l == 1) {
                    i3 = 0;
                    while (true) {
                        c5978l = this.f13906l;
                        c5978l.getClass();
                        if (i3 < c5978l.ads.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.f13906l.ads.get(i3);
                        ByteBuffer byteBuffer6 = c4136l.f8498l;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i3++;
                    }
                    this.f13956l = 2;
                }
                ByteBuffer byteBuffer7 = c4136l.f8498l;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                c10023l = this.f3008l;
                c10023l.Signature();
                interfaceC17529l.smaato(new RunnableC12388l(this, c10023l, 6));
                i = this.f13929l.get();
                if (i == -3) {
                    if (firebase()) {
                        m2031case().billing = this.f13953l;
                        return false;
                    }
                } else {
                    if (i == -5) {
                        if (this.f13956l == 2) {
                            c4136l.remoteconfig();
                            this.f13956l = 1;
                        }
                        mo1629abstract(c10023l);
                        return true;
                    }
                    if (c4136l.crashlytics(4)) {
                        if (this.f13907l) {
                            j = c4136l.f8496l;
                            if (!mo2046l(c4136l)) {
                                zCrashlytics = c4136l.crashlytics(1073741824);
                                if (zCrashlytics) {
                                    c4276l = c4136l.f8499l;
                                    if (iPosition == 0) {
                                        c4276l.getClass();
                                    } else {
                                        if (c4276l.amazon == null) {
                                            int[] iArr3 = new int[1];
                                            c4276l.amazon = iArr3;
                                            c4276l.subs.numBytesOfClearData = iArr3;
                                        }
                                        int[] iArr4 = c4276l.amazon;
                                        iArr4[0] = iArr4[0] + iPosition;
                                    }
                                }
                                if (this.f13935l) {
                                    C13057l c13057lM2031case2 = m2031case();
                                    C11522l c11522l2 = c13057lM2031case2.amazon;
                                    C5978l c5978l3 = this.f13954l;
                                    c5978l3.getClass();
                                    c11522l2.billing(j, c5978l3);
                                    c13057lM2031case2.purchase = true;
                                    this.f13935l = false;
                                }
                                this.f13953l = Math.max(this.f13953l, j);
                                if (firebase()) {
                                    m2031case().billing = this.f13953l;
                                } else {
                                    m2031case().billing = this.f13953l;
                                }
                                c4136l.adcel();
                                if (c4136l.crashlytics(268435456)) {
                                    mo1631continue(c4136l);
                                }
                                if (this.f13934l) {
                                    j3 = this.f13953l;
                                    if (j <= j3) {
                                        this.f13918l = (j3 - j) + 1 + this.f13918l;
                                    }
                                    this.f13953l = j;
                                    this.f13934l = false;
                                }
                                mo2058try(c4136l);
                                iMo2038for = mo2038for(c4136l);
                                j2 = j + this.f13918l;
                                i2 = this.f13957l;
                                if (zCrashlytics) {
                                    interfaceC17529l.loadAd(i2, c4136l.f8499l, j2, iMo2038for);
                                } else {
                                    ByteBuffer byteBuffer8 = c4136l.f8498l;
                                    byteBuffer8.getClass();
                                    interfaceC17529l.purchase(i2, byteBuffer8.limit(), iMo2038for, j2);
                                }
                                this.f13957l = -1;
                                c4136l.f8498l = null;
                                this.f13907l = true;
                                this.f13956l = 0;
                                this.f13942l.crashlytics++;
                                return true;
                            }
                        } else {
                            j = c4136l.f8496l;
                            if (!mo2046l(c4136l)) {
                                zCrashlytics = c4136l.crashlytics(1073741824);
                                if (zCrashlytics) {
                                    c4276l = c4136l.f8499l;
                                    if (iPosition == 0) {
                                        c4276l.getClass();
                                    } else {
                                        if (c4276l.amazon == null) {
                                            int[] iArr5 = new int[1];
                                            c4276l.amazon = iArr5;
                                            c4276l.subs.numBytesOfClearData = iArr5;
                                        }
                                        int[] iArr6 = c4276l.amazon;
                                        iArr6[0] = iArr6[0] + iPosition;
                                    }
                                }
                                if (this.f13935l) {
                                    C13057l c13057lM2031case3 = m2031case();
                                    C11522l c11522l3 = c13057lM2031case3.amazon;
                                    C5978l c5978l4 = this.f13954l;
                                    c5978l4.getClass();
                                    c11522l3.billing(j, c5978l4);
                                    c13057lM2031case3.purchase = true;
                                    this.f13935l = false;
                                }
                                this.f13953l = Math.max(this.f13953l, j);
                                if (firebase()) {
                                    m2031case().billing = this.f13953l;
                                } else {
                                    m2031case().billing = this.f13953l;
                                }
                                c4136l.adcel();
                                if (c4136l.crashlytics(268435456)) {
                                    mo1631continue(c4136l);
                                }
                                if (this.f13934l) {
                                    j3 = this.f13953l;
                                    if (j <= j3) {
                                        this.f13918l = (j3 - j) + 1 + this.f13918l;
                                    }
                                    this.f13953l = j;
                                    this.f13934l = false;
                                }
                                mo2058try(c4136l);
                                iMo2038for = mo2038for(c4136l);
                                j2 = j + this.f13918l;
                                i2 = this.f13957l;
                                if (zCrashlytics) {
                                    interfaceC17529l.loadAd(i2, c4136l.f8499l, j2, iMo2038for);
                                } else {
                                    ByteBuffer byteBuffer9 = c4136l.f8498l;
                                    byteBuffer9.getClass();
                                    interfaceC17529l.purchase(i2, byteBuffer9.limit(), iMo2038for, j2);
                                }
                                this.f13957l = -1;
                                c4136l.f8498l = null;
                                this.f13907l = true;
                                this.f13956l = 0;
                                this.f13942l.crashlytics++;
                                return true;
                            }
                        }
                        return true;
                    }
                    m2031case().billing = this.f13953l;
                    if (this.f13956l == 2) {
                        c4136l.remoteconfig();
                        this.f13956l = 1;
                    }
                    this.f13937l = true;
                    if (!this.f13907l) {
                        m2030break();
                        return false;
                    }
                    if (!this.f13947l) {
                        this.f13963l = true;
                        interfaceC17529l.purchase(this.f13957l, 0, 4, 0L);
                        this.f13957l = -1;
                        c4136l.f8498l = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: new */
    public abstract void mo1642new(Exception exc);

    /* JADX INFO: renamed from: package */
    public abstract C7977l mo1643package(C6403l c6403l, C5978l c5978l, C5978l c5978l2, boolean z);

    @Override // defpackage.AbstractC1091l
    public final int premium(C5978l c5978l) throws C17361l {
        try {
            return mo1640l(this.f13909l, c5978l);
        } catch (C11928l e) {
            throw crashlytics(e, c5978l, false, 4002);
        }
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m2051private() {
        try {
            InterfaceC17529l interfaceC17529l = this.f13920l;
            interfaceC17529l.getClass();
            interfaceC17529l.flush();
        } finally {
            mo2053return();
        }
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final boolean m2052protected(int i) throws C17361l {
        C10023l c10023l = this.f3008l;
        c10023l.Signature();
        C4136l c4136l = this.f13922l;
        c4136l.remoteconfig();
        int iPro = pro(c10023l, c4136l, i | 4);
        if (iPro == -5) {
            mo1629abstract(c10023l);
            return true;
        }
        if (iPro != -4 || !c4136l.crashlytics(4)) {
            return false;
        }
        this.f13937l = true;
        m2030break();
        return false;
    }

    @Override // defpackage.AbstractC1091l
    public final long purchase(long j, long j2) {
        return mo1632else(j, j2, this.f13901l);
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public void mo2053return() {
        this.f13957l = -1;
        this.f13938l.f8498l = null;
        this.f13950l = -1;
        this.f13914l = null;
        this.f13953l = -9223372036854775807L;
        m2031case().billing = -9223372036854775807L;
        this.f13962l = -9223372036854775807L;
        this.f13941l = -9223372036854775807L;
        this.f13963l = false;
        this.f13964l = -9223372036854775807L;
        this.f13907l = false;
        this.f13946l = false;
        this.f13927l = false;
        this.f13911l = false;
        this.f13917l = 0;
        this.f13933l = 0;
        this.f13956l = this.f13944l ? 1 : 0;
        this.f13934l = false;
        this.f13918l = 0L;
    }

    @Override // defpackage.AbstractC1091l
    public void signatures(float f, float f2) throws C17361l {
        this.f13904l = f;
        this.f13916l = f2;
        m2040l(this.f13906l);
    }

    @Override // defpackage.AbstractC1091l
    public void startapp(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.f13948l;
        if (!arrayDeque.isEmpty()) {
            this.f13926l = (C13057l) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.f13937l = false;
            this.f13925l = false;
            this.f13959l = false;
            if (this.f13902l) {
                m2033const();
            } else if (this.f13920l != null) {
                if (mo2047l()) {
                    m2060while();
                    m2054static();
                } else if (mo2043l()) {
                    m2051private();
                } else {
                    this.f13934l = true;
                }
            }
            if (this.f13926l.amazon.m3116new() > 0) {
                this.f13935l = true;
            }
            this.f13926l.amazon.smaato();
            this.f13926l.purchase = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad A[Catch: lٌٕٔ -> 0x00bd, TryCatch #1 {lٌٕٔ -> 0x00bd, blocks: (B:50:0x00a9, B:52:0x00ad, B:54:0x00b4, B:59:0x00bf, B:63:0x00cc), top: B:75:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final void m2054static() throws C17361l {
        C5978l c5978l;
        InterfaceC9655l interfaceC9655l;
        if (this.f13920l != null || this.f13902l || (c5978l = this.f13954l) == null) {
            return;
        }
        String str = c5978l.metrica;
        boolean z = true;
        if (this.f13921l == null && mo1639l(c5978l)) {
            this.f13902l = false;
            m2033const();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            C5467l c5467l = this.f13903l;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                c5467l.getClass();
                c5467l.f11707l = 32;
            } else {
                c5467l.getClass();
                c5467l.f11707l = 1;
            }
            this.f13902l = true;
            return;
        }
        m2044l(this.f13921l);
        if (this.f13958l == null) {
            try {
                interfaceC9655l = this.f13958l;
                if (interfaceC9655l == null && (interfaceC9655l.yandex() == 3 || this.f13958l.yandex() == 4)) {
                    InterfaceC9655l interfaceC9655l2 = this.f13958l;
                    str.getClass();
                    if (!interfaceC9655l2.billing(str)) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                m2034default(this.f13951l, z);
            } catch (C8780l e) {
                throw crashlytics(e, c5978l, false, 4001);
            }
        } else {
            AbstractC12442l.subscription(this.f13951l == null);
            InterfaceC9655l interfaceC9655l3 = this.f13958l;
            C11102l c11102lAdmob = interfaceC9655l3.admob();
            if (C11102l.crashlytics && (c11102lAdmob instanceof C11102l)) {
                int iYandex = interfaceC9655l3.yandex();
                if (iYandex == 1) {
                    C4684l c4684lMopub = interfaceC9655l3.mopub();
                    c4684lMopub.getClass();
                    throw crashlytics(c4684lMopub, this.f13954l, false, c4684lMopub.f9521l);
                }
                if (iYandex == 4) {
                    if (c11102lAdmob == null) {
                        if (interfaceC9655l3.mopub() != null) {
                        }
                    } else if (c11102lAdmob instanceof C11102l) {
                        this.f13951l = new MediaCrypto(c11102lAdmob.yandex, c11102lAdmob.loadAd);
                    }
                    interfaceC9655l = this.f13958l;
                    if (interfaceC9655l == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    m2034default(this.f13951l, z);
                }
            } else {
                if (c11102lAdmob == null) {
                    if (interfaceC9655l3.mopub() != null) {
                    }
                } else if (c11102lAdmob instanceof C11102l) {
                    try {
                        this.f13951l = new MediaCrypto(c11102lAdmob.yandex, c11102lAdmob.loadAd);
                    } catch (MediaCryptoException e2) {
                        throw crashlytics(e2, this.f13954l, false, 6006);
                    }
                }
                interfaceC9655l = this.f13958l;
                if (interfaceC9655l == null) {
                    z = false;
                } else {
                    z = false;
                }
                m2034default(this.f13951l, z);
            }
        }
        MediaCrypto mediaCrypto = this.f13951l;
        if (mediaCrypto == null || this.f13920l != null) {
            return;
        }
        mediaCrypto.release();
        this.f13951l = null;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final boolean m2055strictfp() throws C17361l {
        if (!this.f13907l) {
            m2041l();
            return true;
        }
        this.f13917l = 1;
        if (this.f13936l) {
            this.f13933l = 3;
            return false;
        }
        this.f13933l = 2;
        return true;
    }

    /* JADX INFO: renamed from: super */
    public abstract void mo1645super(C5536l c5536l);

    /* JADX INFO: renamed from: switch */
    public abstract C1424l mo1646switch(C6403l c6403l, C5978l c5978l, MediaCrypto mediaCrypto, float f);

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public C18406l mo2056synchronized(IllegalStateException illegalStateException, C6403l c6403l) {
        return new C18406l(illegalStateException, c6403l);
    }

    /* JADX INFO: renamed from: this */
    public abstract void mo1647this();

    /* JADX INFO: renamed from: throw */
    public abstract float mo1648throw(float f, C5978l c5978l, C5978l[] c5978lArr);

    /* JADX WARN: Code duplicated, block: B:107:0x02f3  */
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean m2057throws(long j, long j2) throws C17361l {
        C5467l c5467l;
        int length;
        ByteBuffer byteBuffer;
        AbstractC12442l.subscription(!this.f13925l);
        C5467l c5467l2 = this.f13903l;
        if (c5467l2.tapsense()) {
            ByteBuffer byteBuffer2 = c5467l2.f8498l;
            int i = this.f13950l;
            int i2 = c5467l2.f11708l;
            long j3 = c5467l2.f8496l;
            boolean zM2039interface = m2039interface(this.f3019l, c5467l2.f11706l);
            boolean zCrashlytics = c5467l2.crashlytics(4);
            C5978l c5978l = this.f13900l;
            c5978l.getClass();
            c5467l = c5467l2;
            if (!mo1649transient(j, j2, null, byteBuffer2, i, 0, i2, j3, zM2039interface, zCrashlytics, c5978l)) {
                return false;
            }
            mo2037finally(c5467l.f11706l);
            c5467l.remoteconfig();
        } else {
            c5467l = c5467l2;
        }
        if (this.f13937l) {
            this.f13925l = true;
            return false;
        }
        boolean z = this.f13952l;
        C4136l c4136l = this.f13949l;
        if (z) {
            AbstractC12442l.subscription(c5467l.ads(c4136l));
            this.f13952l = false;
        }
        if (this.f13940l) {
            if (c5467l.tapsense()) {
                return true;
            }
            this.f13902l = false;
            m2033const();
            this.f13940l = false;
            m2054static();
            if (!this.f13902l) {
                return false;
            }
        }
        AbstractC12442l.subscription(!this.f13937l);
        C10023l c10023l = this.f3008l;
        c10023l.Signature();
        c4136l.remoteconfig();
        while (true) {
            c4136l.remoteconfig();
            int iPro = pro(c10023l, c4136l, 0);
            if (iPro == -5) {
                mo1629abstract(c10023l);
                break;
            }
            if (iPro != -4) {
                if (iPro != -3) {
                    C18073l.admob();
                    return false;
                }
                if (!firebase()) {
                    break;
                }
                m2031case().billing = this.f13953l;
                break;
            }
            if (c4136l.crashlytics(4)) {
                this.f13937l = true;
                m2031case().billing = this.f13953l;
                break;
            }
            this.f13953l = Math.max(this.f13953l, c4136l.f8496l);
            if (firebase() || this.f13938l.crashlytics(536870912)) {
                m2031case().billing = this.f13953l;
            }
            byte[] bArr = null;
            if (this.f13935l) {
                C5978l c5978l2 = this.f13954l;
                c5978l2.getClass();
                this.f13900l = c5978l2;
                if (Objects.equals(c5978l2.metrica, "audio/opus") && !this.f13900l.ads.isEmpty()) {
                    byte[] bArr2 = (byte[]) this.f13900l.ads.get(0);
                    int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                    C12984l c12984lYandex = this.f13900l.yandex();
                    c12984lYandex.f25444strictfp = i3;
                    this.f13900l = new C5978l(c12984lYandex);
                }
                mo1636instanceof(this.f13900l, null);
                this.f13935l = false;
            }
            c4136l.adcel();
            C5978l c5978l3 = this.f13900l;
            if (c5978l3 == null || !Objects.equals(c5978l3.metrica, "audio/opus")) {
                c5467l = c5467l;
            } else {
                if (c4136l.crashlytics(268435456)) {
                    c4136l.f8495l = this.f13900l;
                    mo1631continue(c4136l);
                }
                if (this.f3019l - c4136l.f8496l <= 80000) {
                    List list = this.f13900l.ads;
                    C5601l c5601l = this.f13965l;
                    c5601l.getClass();
                    c4136l.f8498l.getClass();
                    if (c4136l.f8498l.limit() - c4136l.f8498l.position() == 0) {
                        c5467l = c5467l;
                    } else {
                        if (c5601l.f11897l == 2 && (list.size() == 1 || list.size() == 3)) {
                            bArr = (byte[]) list.get(0);
                        }
                        ByteBuffer byteBuffer3 = c4136l.f8498l;
                        int iPosition = byteBuffer3.position();
                        int iLimit = byteBuffer3.limit();
                        int i4 = iLimit - iPosition;
                        int i5 = (i4 + 255) / 255;
                        int i6 = i5 + 27 + i4;
                        if (c5601l.f11897l == 2) {
                            length = bArr != null ? bArr.length + 28 : 47;
                            i6 = length + 44 + i6;
                        } else {
                            length = 0;
                        }
                        if (((ByteBuffer) c5601l.f11899l).capacity() < i6) {
                            c5601l.f11899l = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            ((ByteBuffer) c5601l.f11899l).clear();
                        }
                        ByteBuffer byteBuffer4 = (ByteBuffer) c5601l.f11899l;
                        if (c5601l.f11897l == 2) {
                            if (bArr != null) {
                                C5601l.subs(byteBuffer4, 0L, 0, 1, true);
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(AbstractC1762l.loadAd(bArr.length));
                                byteBuffer.put(bArr);
                                byteBuffer.putInt(22, AbstractC15323l.adcel(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
                                byteBuffer.position(bArr.length + 28);
                            } else {
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(C5601l.f11894l);
                            }
                            byteBuffer.put(C5601l.f11895l);
                        } else {
                            c5467l = c5467l;
                            byteBuffer = byteBuffer4;
                        }
                        int iPurchase = c5601l.f11896l + ((int) ((AbstractC13251l.purchase(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
                        c5601l.f11896l = iPurchase;
                        C5601l.subs(byteBuffer, iPurchase, c5601l.f11897l, i5, false);
                        for (int i7 = 0; i7 < i5; i7++) {
                            if (i4 >= 255) {
                                byteBuffer.put((byte) -1);
                                i4 -= 255;
                            } else {
                                byteBuffer.put((byte) i4);
                                i4 = 0;
                            }
                        }
                        while (iPosition < iLimit) {
                            byteBuffer.put(byteBuffer3.get(iPosition));
                            iPosition++;
                        }
                        byteBuffer3.position(byteBuffer3.limit());
                        byteBuffer.flip();
                        if (c5601l.f11897l == 2) {
                            byteBuffer.putInt(length + 66, AbstractC15323l.adcel(byteBuffer.array(), byteBuffer.arrayOffset() + length + 44, byteBuffer.limit() - byteBuffer.position(), 0));
                        } else {
                            byteBuffer.putInt(22, AbstractC15323l.adcel(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0));
                        }
                        c5601l.f11897l++;
                        c5601l.f11899l = byteBuffer;
                        c4136l.remoteconfig();
                        c4136l.startapp(((ByteBuffer) c5601l.f11899l).remaining());
                        c4136l.f8498l.put((ByteBuffer) c5601l.f11899l);
                        c4136l.adcel();
                    }
                } else {
                    c5467l = c5467l;
                }
            }
            if (c5467l.tapsense()) {
                long j4 = this.f3019l;
                c5467l = c5467l;
                if (m2039interface(j4, c5467l.f11706l) == m2039interface(j4, c4136l.f8496l)) {
                }
                this.f13952l = true;
                break;
            }
            c5467l = c5467l;
            if (!c5467l.ads(c4136l)) {
                this.f13952l = true;
                break;
            }
        }
        if (c5467l.tapsense()) {
            c5467l.adcel();
        }
        return c5467l.tapsense() || this.f13937l || this.f13940l;
    }

    /* JADX INFO: renamed from: transient */
    public abstract boolean mo1649transient(long j, long j2, InterfaceC17529l interfaceC17529l, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C5978l c5978l);

    @Override // defpackage.AbstractC1091l
    public void vip() {
        this.f13954l = null;
        m2048l(C13057l.mopub);
        this.f13948l.clear();
        if (this.f13902l) {
            this.f13902l = false;
            m2033const();
        } else {
            if (this.f13920l == null) {
                return;
            }
            if (mo2047l()) {
                m2060while();
            } else if (mo2043l()) {
                m2051private();
            } else {
                this.f13934l = true;
            }
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final boolean m2059volatile(long j, long j2) throws C17361l {
        InterfaceC17529l interfaceC17529l = this.f13920l;
        interfaceC17529l.getClass();
        int i = this.f13950l;
        MediaCodec.BufferInfo bufferInfo = this.f13932l;
        if (i < 0) {
            int iFirebase = interfaceC17529l.firebase(bufferInfo);
            if (iFirebase < 0) {
                if (iFirebase != -2) {
                    if (this.f13947l && (this.f13937l || this.f13917l == 2)) {
                        m2030break();
                    }
                    long j3 = this.f13964l;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.f3009l.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            m2030break();
                            return false;
                        }
                    }
                    return false;
                }
                this.f13968l = true;
                InterfaceC17529l interfaceC17529l2 = this.f13920l;
                interfaceC17529l2.getClass();
                MediaFormat mediaFormatMopub = interfaceC17529l2.mopub();
                if (this.f13915l != 0 && mediaFormatMopub.getInteger("width") == 32 && mediaFormatMopub.getInteger("height") == 32) {
                    this.f13927l = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.f13910l.isEmpty()) {
                    C5536l c5536l = new C5536l((HashMap) C5536l.yandex(mediaFormatMopub, this.f13910l).f21690l);
                    if (!c5536l.equals(this.f13923l)) {
                        this.f13923l = c5536l;
                        mo1645super(c5536l);
                    }
                }
                this.f13924l = mediaFormatMopub;
                this.f13945l = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.f13918l;
            if (this.f13927l) {
                this.f13927l = false;
                interfaceC17529l.billing(iFirebase);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m2030break();
                return false;
            }
            this.f13950l = iFirebase;
            ByteBuffer byteBufferStartapp = interfaceC17529l.startapp(iFirebase);
            this.f13914l = byteBufferStartapp;
            if (byteBufferStartapp != null) {
                byteBufferStartapp.position(bufferInfo.offset);
                this.f13914l.limit(bufferInfo.offset + bufferInfo.size);
            }
            m2045l(bufferInfo.presentationTimeUs);
        }
        boolean z = this.f13934l || bufferInfo.presentationTimeUs < this.f3019l;
        long j5 = this.f13926l.billing;
        boolean z2 = j5 != -9223372036854775807L && j5 <= bufferInfo.presentationTimeUs;
        this.f13911l = z2;
        ByteBuffer byteBuffer = this.f13914l;
        int i2 = this.f13950l;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        C5978l c5978l = this.f13900l;
        c5978l.getClass();
        if (!mo1649transient(j, j2, interfaceC17529l, byteBuffer, i2, i3, 1, j6, z, z2, c5978l)) {
            return false;
        }
        mo2037finally(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.f13963l && this.f13911l) {
            this.f3009l.getClass();
            this.f13964l = System.currentTimeMillis();
        }
        this.f13950l = -1;
        this.f13914l = null;
        if (!z3) {
            return true;
        }
        m2030break();
        return false;
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final void m2060while() {
        try {
            InterfaceC17529l interfaceC17529l = this.f13920l;
            if (interfaceC17529l != null) {
                interfaceC17529l.release();
                this.f13942l.loadAd++;
                C6403l c6403l = this.f13966l;
                c6403l.getClass();
                mo1635import(c6403l.yandex);
            }
            this.f13920l = null;
            try {
                MediaCrypto mediaCrypto = this.f13951l;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f13951l = null;
                m2044l(null);
                m2049l();
            }
        } catch (Throwable th) {
            this.f13920l = null;
            try {
                MediaCrypto mediaCrypto2 = this.f13951l;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f13951l = null;
                m2044l(null);
                m2049l();
            }
        }
    }

    @Override // defpackage.AbstractC1091l, defpackage.InterfaceC3184l
    public void yandex(int i, Object obj) {
        int i2;
        if (i == 11) {
            C2865l c2865l = (C2865l) obj;
            c2865l.getClass();
            this.f13939l = c2865l;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                AbstractC8481l abstractC8481l = (AbstractC8481l) obj;
                if (this.f13910l.equals(abstractC8481l)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(abstractC8481l);
                    HashSet hashSet2 = new HashSet();
                    AbstractC10199l it = this.f13910l.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    InterfaceC17529l interfaceC17529l = this.f13920l;
                    if (interfaceC17529l != null) {
                        if (!hashSet2.isEmpty()) {
                            interfaceC17529l.tapsense(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            interfaceC17529l.adcel(new ArrayList(hashSet));
                        }
                    }
                }
                this.f13910l = abstractC8481l;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            C5536l c5536l = (C5536l) obj;
            this.f13930l = c5536l;
            InterfaceC17529l interfaceC17529l2 = this.f13920l;
            if (interfaceC17529l2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : c5536l.yandex.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                interfaceC17529l2.yandex(bundle);
            }
        }
    }

    /* JADX INFO: renamed from: public */
    public void mo1644public() {
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public void mo2058try(C4136l c4136l) {
    }
}
