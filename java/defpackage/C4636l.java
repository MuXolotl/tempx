package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: lؗؔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4636l {
    public static ScheduledExecutorService Signature;
    public static int license;
    public static final Object tapsense = new Object();
    public int adcel;
    public final int admob;
    public int ads;
    public final C3316l amazon;
    public final C0558l billing;
    public final float crashlytics;
    public boolean firebase;
    public final C8961l isPro = new C8961l(Thread.currentThread());
    public final C17953l loadAd;
    public ByteBuffer metrica;
    public final boolean mopub;
    public C4390l purchase;
    public long remoteconfig;
    public long smaato;
    public int startapp;
    public final C2815l subs;
    public boolean subscription;
    public long vip;
    public final AudioTrack yandex;

    public C4636l(AudioTrack audioTrack, C17953l c17953l, C3316l c3316l, float f, C18527l c18527l) {
        this.yandex = audioTrack;
        this.loadAd = c17953l;
        this.crashlytics = f;
        this.amazon = c3316l;
        boolean zM3968for = AbstractC15323l.m3968for(c17953l.yandex);
        this.mopub = zM3968for;
        if (zM3968for) {
            this.admob = AbstractC15323l.license(c17953l.yandex) * Integer.bitCount(c17953l.crashlytics);
        } else {
            this.admob = -1;
        }
        this.billing = new C0558l(new C16543l(4, this), c18527l, audioTrack, c17953l.yandex, this.admob, c17953l.billing);
        if (Build.VERSION.SDK_INT >= 24 && c3316l != null) {
            this.purchase = new C4390l(audioTrack, c3316l);
        }
        this.subs = crashlytics() ? new C2815l(this) : null;
    }

    public final void amazon(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.yandex.setOffloadDelayPadding(i, i2);
    }

    public final void billing(C17849l c17849l) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdYandex = c17849l.yandex();
        if (logSessionIdYandex.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.yandex.setLogSessionId(logSessionIdYandex);
    }

    public final boolean crashlytics() {
        return Build.VERSION.SDK_INT >= 29 && this.yandex.isOffloadedPlayback();
    }

    public final long loadAd() {
        if (!this.mopub) {
            return this.remoteconfig;
        }
        long j = this.smaato;
        long j2 = this.admob;
        String str = AbstractC15323l.yandex;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    public final boolean mopub(int i, long j, ByteBuffer byteBuffer) throws C4287l {
        AudioTrack audioTrack;
        int iWrite;
        boolean z;
        C3316l c3316l;
        C4856l c4856l;
        C17274l c17274l;
        int underrunCount;
        long j2 = j;
        C17953l c17953l = this.loadAd;
        boolean z2 = this.mopub;
        if (!z2 && this.adcel == 0) {
            this.adcel = C7653l.subs(c17953l.yandex, byteBuffer);
        }
        C8961l c8961l = this.isPro;
        c8961l.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = (Thread) c8961l.crashlytics;
        AudioTrack audioTrack2 = this.yandex;
        if (threadCurrentThread == thread) {
            long jLoadAd = loadAd();
            if (Build.VERSION.SDK_INT >= 24) {
                underrunCount = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z3 = this.subscription;
                long jYandex = yandex();
                int sampleRate = audioTrack2.getSampleRate();
                String str = AbstractC15323l.yandex;
                audioTrack = audioTrack2;
                boolean z4 = jLoadAd > AbstractC15323l.m3970import(jYandex, (long) sampleRate, 1000000L, RoundingMode.UP);
                this.subscription = z4;
                underrunCount = (!z3 || z4 || audioTrack.getPlayState() == 1) ? this.ads : this.ads + 1;
            }
            boolean z5 = underrunCount > this.ads;
            this.ads = underrunCount;
            if (z5) {
                c8961l.mopub(-1, new C8339l(17));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int iRemaining = byteBuffer.remaining();
        if (c17953l.amazon) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.vip;
            } else {
                this.vip = j2;
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j2 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.metrica == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.metrica = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.metrica.putInt(1431633921);
                }
                if (this.startapp == 0) {
                    this.metrica.putInt(4, iRemaining2);
                    this.metrica.putLong(8, j2 * 1000);
                    this.metrica.position(0);
                    this.startapp = iRemaining2;
                }
                int iRemaining3 = this.metrica.remaining();
                if (iRemaining3 <= 0) {
                    iWrite = audioTrack3.write(byteBuffer, iRemaining2, 1);
                    if (iWrite < 0) {
                        this.startapp = 0;
                    } else {
                        this.startapp -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack3.write(this.metrica, iRemaining3, 1);
                    if (iWrite2 < 0) {
                        this.startapp = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining3) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack3.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.startapp = 0;
                        } else {
                            this.startapp -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z2) {
                this.smaato += (long) iWrite;
                return z;
            }
            if (z) {
                this.remoteconfig = (((long) this.adcel) * ((long) i)) + this.remoteconfig;
            }
            return z;
        }
        z = (Build.VERSION.SDK_INT >= 24 && iWrite == -6) || iWrite == -32;
        if (z && (c3316l = this.amazon) != null && (c17274l = (c4856l = (C4856l) c3316l.f7072l).subs) != null) {
            C8193l c8193l = C8193l.billing;
            c4856l.admob = c8193l;
            c17274l.billing(c8193l);
        }
        throw new C4287l(iWrite, z);
    }

    public final void purchase() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        AudioTrack audioTrack = this.yandex;
        if (audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.setOffloadEndOfStream();
        C0558l c0558l = this.billing;
        c0558l.signatures = true;
        c0558l.admob.yandex.billing = true;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:111:0x0301  */
    /* JADX WARN: Code duplicated, block: B:112:0x031d  */
    /* JADX WARN: Code duplicated, block: B:115:0x032a  */
    /* JADX WARN: Code duplicated, block: B:116:0x032c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0334  */
    /* JADX WARN: Code duplicated, block: B:124:0x0342  */
    /* JADX WARN: Code duplicated, block: B:126:0x035b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0377  */
    /* JADX WARN: Code duplicated, block: B:132:0x037a  */
    public final long yandex() {
        long j;
        long j2;
        boolean z;
        long jNanoTime;
        boolean z2;
        C0558l c0558l;
        long jLoadAd;
        int playState;
        long j3;
        long j4;
        long jAppmetrica;
        long j5;
        int i;
        boolean z3;
        AudioTimestamp audioTimestamp;
        float f;
        C9252l c9252l;
        int i2;
        long j6;
        Method method;
        long j7;
        Method method2;
        C0558l c0558l2 = this.billing;
        C18527l c18527l = c0558l2.loadAd;
        C10350l c10350l = c0558l2.admob;
        AudioTrack audioTrack = c0558l2.amazon;
        if (audioTrack.getPlayState() == 3) {
            long[] jArr = c0558l2.crashlytics;
            c18527l.getClass();
            long jNanoTime2 = System.nanoTime() / 1000;
            if (jNanoTime2 - c0558l2.smaato >= 30000) {
                j = 1000;
                long jM3969goto = AbstractC15323l.m3969goto(c0558l2.purchase, c0558l2.yandex());
                if (jM3969goto != 0) {
                    jArr[c0558l2.subscription] = AbstractC15323l.m3975package(c0558l2.subs, jM3969goto) - jNanoTime2;
                    c0558l2.subscription = (c0558l2.subscription + 1) % 10;
                    int i3 = c0558l2.tapsense;
                    if (i3 < 10) {
                        c0558l2.tapsense = i3 + 1;
                    }
                    c0558l2.smaato = jNanoTime2;
                    c0558l2.firebase = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = c0558l2.tapsense;
                        if (i4 >= i5) {
                            break;
                        }
                        int i6 = i4;
                        c0558l2.firebase = (jArr[i6] / ((long) i5)) + c0558l2.firebase;
                        i4 = i6 + 1;
                    }
                }
            } else {
                j = 1000;
            }
            long j8 = c0558l2.vip;
            if (c0558l2.mopub && (method = c0558l2.remoteconfig) != null && jNanoTime2 - c0558l2.metrica >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, null);
                    String str = AbstractC15323l.yandex;
                    j7 = jNanoTime2;
                    try {
                        long jIntValue = (((long) num.intValue()) * j) - c0558l2.billing;
                        c0558l2.vip = jIntValue;
                        long jMax = Math.max(jIntValue, 0L);
                        c0558l2.vip = jMax;
                        if (jMax > 10000000) {
                            AbstractC6427l.vip("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + jMax);
                            c0558l2.vip = 0L;
                        }
                    } catch (Exception unused) {
                        method2 = null;
                        c0558l2.remoteconfig = method2;
                    }
                } catch (Exception unused2) {
                    j7 = jNanoTime2;
                    method2 = null;
                }
                jNanoTime2 = j7;
                c0558l2.metrica = jNanoTime2;
            }
            boolean z4 = j8 != c0558l2.vip;
            float f2 = c0558l2.subs;
            long jLoadAd2 = c0558l2.loadAd(jNanoTime2);
            C9252l c9252l2 = c10350l.yandex;
            C9252l c9252l3 = c10350l.yandex;
            j2 = 0;
            int i7 = c10350l.loadAd;
            if (z4 || jNanoTime2 - c10350l.mopub >= c10350l.billing) {
                c10350l.mopub = jNanoTime2;
                AudioTrack audioTrack2 = c9252l2.yandex;
                AudioTimestamp audioTimestamp2 = c9252l2.loadAd;
                boolean timestamp = audioTrack2.getTimestamp(audioTimestamp2);
                if (timestamp) {
                    long j9 = audioTimestamp2.framePosition;
                    long j10 = c9252l2.amazon;
                    if (j10 > j9) {
                        if (c9252l2.billing) {
                            c9252l2.mopub += j10;
                            c9252l2.billing = false;
                        } else {
                            c9252l2.crashlytics++;
                        }
                    }
                    c9252l2.amazon = j9;
                    c9252l2.purchase = j9 + c9252l2.mopub + (c9252l2.crashlytics << 32);
                }
                if (timestamp) {
                    C16543l c16543l = c10350l.crashlytics;
                    long j11 = audioTimestamp2.nanoTime / j;
                    audioTrack = audioTrack;
                    c9252l = c9252l3;
                    long jAppmetrica2 = AbstractC15323l.appmetrica(f2, jNanoTime2 - (c9252l3.loadAd.nanoTime / j)) + AbstractC15323l.m3969goto(i7, c9252l3.purchase);
                    if (Math.abs(j11 - jNanoTime2) > 5000000) {
                        long j12 = c9252l2.purchase;
                        c16543l.getClass();
                        AbstractC6427l.vip("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + j12 + ", " + j11 + ", " + jNanoTime2 + ", " + jLoadAd2 + ", " + ((C4636l) c16543l.f32482l).loadAd());
                        i2 = 4;
                        c10350l.yandex(4);
                        z3 = timestamp;
                        audioTimestamp = audioTimestamp2;
                        f = f2;
                    } else if (Math.abs(jAppmetrica2 - jLoadAd2) > 5000000) {
                        z3 = timestamp;
                        long j13 = c9252l2.purchase;
                        c16543l.getClass();
                        audioTimestamp = audioTimestamp2;
                        f = f2;
                        AbstractC6427l.vip("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + j13 + ", " + j11 + ", " + jNanoTime2 + ", " + jLoadAd2 + ", " + ((C4636l) c16543l.f32482l).loadAd());
                        i2 = 4;
                        c10350l.yandex(4);
                    } else {
                        z3 = timestamp;
                        audioTimestamp = audioTimestamp2;
                        f = f2;
                        i2 = 4;
                        if (c10350l.amazon == 4) {
                            c10350l.yandex(0);
                        }
                    }
                } else {
                    z3 = timestamp;
                    audioTimestamp = audioTimestamp2;
                    f = f2;
                    audioTrack = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x022b: MOVE (r31v4 'audioTrack' android.media.AudioTrack) = (r9v6 android.media.AudioTrack) (LINE:556) in method: l￘ﾗ￘ﾔￛﾚ.yandex():long, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v6 android.media.AudioTrack
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 894
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C4636l.yandex():long");
                }
            }
