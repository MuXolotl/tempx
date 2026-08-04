package defpackage;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٔۖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15081l implements InterfaceC5252l {
    public C5978l Signature;
    public boolean ad;
    public C13698l adcel;
    public C13698l ads;
    public int advert;
    public final PlaybackSession amazon;
    public final C6219l crashlytics;
    public PlaybackMetrics.Builder firebase;
    public String isPro;
    public int isVip;
    public boolean license;
    public C14723l metrica;
    public boolean premium;
    public int pro;
    public int signatures;
    public int smaato;
    public C13698l startapp;
    public C5978l subscription;
    public C5978l tapsense;
    public final Context yandex;
    public final Executor loadAd = AbstractC2991l.firebase();
    public final C4322l billing = new C4322l();
    public final C3904l mopub = new C3904l();
    public final HashMap subs = new HashMap();
    public final HashMap admob = new HashMap();
    public final long purchase = SystemClock.elapsedRealtime();
    public int remoteconfig = 0;
    public int vip = 0;

    public C15081l(Context context, PlaybackSession playbackSession) {
        this.yandex = context.getApplicationContext();
        this.amazon = playbackSession;
        C6219l c6219l = new C6219l();
        this.crashlytics = c6219l;
        c6219l.amazon = this;
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static C15081l m3926import(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C15081l(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // defpackage.InterfaceC5252l
    public final void Signature(C5597l c5597l, C15074l c15074l) {
        C13698l c13698l = this.startapp;
        if (c13698l != null) {
            C5978l c5978l = (C5978l) c13698l.f26743l;
            if (c5978l.pro == -1) {
                C12984l c12984lYandex = c5978l.yandex();
                c12984lYandex.Signature = c15074l.yandex;
                c12984lYandex.license = c15074l.loadAd;
                this.startapp = new C13698l(new C5978l(c12984lYandex), c13698l.f26744l, (String) c13698l.f26746l, 15);
            }
        }
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m3929abstract() {
        PlaybackMetrics.Builder builder = this.firebase;
        if (builder != null && this.premium) {
            builder.setAudioUnderrunCount(this.signatures);
            this.firebase.setVideoFramesDropped(this.advert);
            this.firebase.setVideoFramesPlayed(this.isVip);
            Long l = (Long) this.admob.get(this.isPro);
            this.firebase.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.subs.get(this.isPro);
            this.firebase.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.firebase.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.loadAd.execute(new RunnableC12388l(this, this.firebase.build(), 16));
        }
        this.firebase = null;
        this.isPro = null;
        this.signatures = 0;
        this.advert = 0;
        this.isVip = 0;
        this.subscription = null;
        this.tapsense = null;
        this.Signature = null;
        this.premium = false;
    }

    @Override // defpackage.InterfaceC5252l
    public final void admob(C5597l c5597l, C2040l c2040l, IOException iOException) {
        this.pro = c2040l.yandex;
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: class */
    public final void mo1739class(C5597l c5597l, C14723l c14723l) {
        this.metrica = c14723l;
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m3930finally(C5597l c5597l, String str) {
        C5019l c5019l = c5597l.amazon;
        if (c5019l == null || !c5019l.loadAd()) {
            m3929abstract();
            this.isPro = str;
            this.firebase = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
            m3932public(c5597l.loadAd, c5019l);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final LogSessionId m3931instanceof() {
        return this.amazon.getSessionId();
    }

    /* JADX WARN: Code duplicated, block: B:226:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:244:0x042d  */
    /* JADX WARN: Code duplicated, block: B:245:0x042f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0445  */
    /* JADX WARN: Code duplicated, block: B:254:0x0447  */
    /* JADX WARN: Code duplicated, block: B:342:0x0570 A[PHI: r5
  0x0570: PHI (r5v57 int) = (r5v55 int), (r5v54 int), (r5v54 int), (r5v54 int) binds: [B:349:0x0581, B:331:0x0555, B:332:0x0557, B:333:0x0559] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:359:0x0593  */
    /* JADX WARN: Code duplicated, block: B:362:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:387:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28, types: [lْٜ۟] */
    /* JADX WARN: Type inference failed for: r8v55 */
    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: interface */
    public final void mo1744interface(InterfaceC9814l interfaceC9814l, C3797l c3797l) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C9754l c9754l;
        C9754l c9754l2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ?? r8;
        int i13;
        int i14;
        int i15;
        boolean z2;
        C5978l c5978l;
        int i16;
        int i17;
        C17564l c17564l;
        int i18;
        if (((C4094l) c3797l.f7903l).yandex.size() == 0) {
            return;
        }
        int i19 = 0;
        for (int i20 = 0; i20 < ((C4094l) c3797l.f7903l).yandex.size(); i20++) {
            int iLoadAd = ((C4094l) c3797l.f7903l).loadAd(i20);
            C5597l c5597l = (C5597l) ((SparseArray) c3797l.f7902l).get(iLoadAd);
            c5597l.getClass();
            C6219l c6219l = this.crashlytics;
            if (iLoadAd == 0) {
                synchronized (c6219l) {
                    try {
                        c6219l.amazon.getClass();
                        AbstractC10759l abstractC10759l = c6219l.purchase;
                        c6219l.purchase = c5597l.loadAd;
                        Iterator it = c6219l.crashlytics.values().iterator();
                        while (it.hasNext()) {
                            C6964l c6964l = (C6964l) it.next();
                            if (!c6964l.loadAd(abstractC10759l, c6219l.purchase) || c6964l.yandex(c5597l)) {
                                it.remove();
                                if (c6964l.yandex.equals(c6219l.billing)) {
                                    c6219l.yandex(c6964l);
                                }
                                if (c6964l.purchase) {
                                    c6219l.amazon.m3934this(c5597l, c6964l.yandex);
                                }
                            }
                        }
                        c6219l.purchase(c5597l);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iLoadAd == 11) {
                c6219l.mopub(c5597l, this.smaato);
            } else {
                c6219l.billing(c5597l);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c3797l.firebase(0)) {
            C5597l c5597l2 = (C5597l) ((SparseArray) c3797l.f7902l).get(0);
            c5597l2.getClass();
            if (this.firebase != null) {
                m3932public(c5597l2.loadAd, c5597l2.amazon);
            }
        }
        if (c3797l.firebase(2) && this.firebase != null) {
            C9258l c9258lListIterator = interfaceC9814l.mo2762import().yandex.listIterator(0);
            loop2: while (true) {
                if (!c9258lListIterator.hasNext()) {
                    c17564l = null;
                    break;
                }
                C14446l c14446l = (C14446l) c9258lListIterator.next();
                for (int i21 = 0; i21 < c14446l.yandex; i21++) {
                    if (c14446l.purchase[i21] && (c17564l = c14446l.loadAd.amazon[i21].subscription) != null) {
                        break loop2;
                    }
                }
            }
            if (c17564l != null) {
                PlaybackMetrics.Builder builder = this.firebase;
                String str = AbstractC15323l.yandex;
                int i22 = 0;
                while (true) {
                    if (i22 >= c17564l.f34191l) {
                        i18 = 1;
                        break;
                    }
                    UUID uuid = c17564l.f34190l[i22].f25008l;
                    if (uuid.equals(AbstractC17252l.purchase)) {
                        i18 = 3;
                        break;
                    } else if (uuid.equals(AbstractC17252l.billing)) {
                        i18 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC17252l.amazon)) {
                            i18 = 6;
                            break;
                        }
                        i22++;
                    }
                }
                builder.setDrmType(i18);
            }
        }
        if (c3797l.firebase(1011)) {
            this.signatures++;
        }
        C14723l c14723l = this.metrica;
        int i23 = 5;
        int i24 = 4;
        if (c14723l == null) {
            i12 = 2;
            i11 = 1;
            i6 = 13;
            i2 = 9;
            i3 = 8;
            i4 = 7;
            i5 = 6;
        } else {
            int i25 = c14723l.f28797l;
            Context context = this.yandex;
            boolean z3 = this.pro == 4;
            if (i25 == 1001) {
                c9754l = new C9754l(20, i19, i24);
            } else {
                if (c14723l instanceof C17361l) {
                    C17361l c17361l = (C17361l) c14723l;
                    z = c17361l.f33825l == 1;
                    i = c17361l.f33829l;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = c14723l.getCause();
                cause.getClass();
                int i26 = 23;
                if (!(cause instanceof IOException)) {
                    int i27 = 24;
                    i2 = 9;
                    i3 = 8;
                    i4 = 7;
                    i5 = 6;
                    if (z && (i == 0 || i == 1)) {
                        c9754l = new C9754l(35, i19, i24);
                    } else if (z && i == 3) {
                        c9754l = new C9754l(15, i19, i24);
                    } else if (z && i == 2) {
                        c9754l = new C9754l(i26, i19, i24);
                    } else {
                        if (cause instanceof C8780l) {
                            i6 = 13;
                            c9754l2 = new C9754l(i6, AbstractC15323l.premium(((C8780l) cause).f18078l), i24);
                        } else {
                            i6 = 13;
                            if (cause instanceof C18406l) {
                                c9754l2 = new C9754l(14, ((C18406l) cause).f35949l, i24);
                            } else {
                                int i28 = 14;
                                if (cause instanceof OutOfMemoryError) {
                                    c9754l = new C9754l(i28, i19, i24);
                                } else if (cause instanceof C13621l) {
                                    c9754l = new C9754l(17, i19, i24);
                                } else if (cause instanceof C10945l) {
                                    c9754l2 = new C9754l(18, ((C10945l) cause).f22073l, i24);
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    switch (AbstractC15323l.signatures(errorCode)) {
                                        case 6002:
                                            break;
                                        case 6003:
                                            i27 = 28;
                                            break;
                                        case 6004:
                                            i27 = 25;
                                            break;
                                        case 6005:
                                            i27 = 26;
                                            break;
                                        default:
                                            i27 = 27;
                                            break;
                                    }
                                    c9754l2 = new C9754l(i27, errorCode, i24);
                                } else {
                                    c9754l = new C9754l(22, i19, i24);
                                }
                            }
                        }
                        c9754l = c9754l2;
                    }
                    i6 = 13;
                } else if (cause instanceof C4590l) {
                    c9754l = new C9754l(i23, ((C4590l) cause).f9323l, i24);
                } else {
                    if ((cause instanceof C2216l) || (cause instanceof C17655l)) {
                        i7 = 7;
                        i8 = 6;
                        i9 = 8;
                        i2 = 9;
                        c9754l = new C9754l(z3 ? 10 : 11, i19, i24);
                    } else {
                        boolean z4 = cause instanceof C5759l;
                        if (z4 || (cause instanceof C3645l)) {
                            i2 = 9;
                            if (C1196l.adcel(context).ads() == 1) {
                                c9754l = new C9754l(3, i19, i24);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    c9754l = new C9754l(6, i19, i24);
                                    i5 = 6;
                                    i6 = 13;
                                    i3 = 8;
                                    i4 = 7;
                                } else {
                                    i8 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i7 = 7;
                                        c9754l = new C9754l(i7, i19, i24);
                                    } else {
                                        i7 = 7;
                                        if (z4 && ((C5759l) cause).f12149l == 1) {
                                            c9754l = new C9754l(i24, i19, i24);
                                        } else {
                                            i9 = 8;
                                            c9754l = new C9754l(i9, i19, i24);
                                        }
                                    }
                                    i4 = i7;
                                    i5 = 6;
                                    i6 = 13;
                                    i3 = 8;
                                }
                            }
                        } else if (i25 == 1002) {
                            c9754l = new C9754l(21, i19, i24);
                        } else if (cause instanceof C4684l) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int iPremium = AbstractC15323l.premium(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (AbstractC15323l.signatures(iPremium)) {
                                    case 6002:
                                        i10 = 24;
                                        break;
                                    case 6003:
                                        i10 = 28;
                                        break;
                                    case 6004:
                                        i10 = 25;
                                        break;
                                    case 6005:
                                        i10 = 26;
                                        break;
                                    default:
                                        i10 = 27;
                                        break;
                                }
                                c9754l = new C9754l(i10, iPremium, i24);
                            } else if (cause3 instanceof MediaDrmResetException) {
                                c9754l = new C9754l(27, i19, i24);
                            } else if (cause3 instanceof NotProvisionedException) {
                                c9754l = new C9754l(24, i19, i24);
                            } else if (cause3 instanceof DeniedByServerException) {
                                c9754l = new C9754l(29, i19, i24);
                            } else if (cause3 instanceof C18628l) {
                                c9754l = new C9754l(i26, i19, i24);
                            } else {
                                c9754l = cause3 instanceof C13976l ? new C9754l(28, i19, i24) : new C9754l(30, i19, i24);
                            }
                        } else if ((cause instanceof C0312l) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            c9754l = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new C9754l(32, i19, i24) : new C9754l(31, i19, i24);
                        } else {
                            i2 = 9;
                            c9754l = new C9754l(i2, i19, i24);
                        }
                        i6 = 13;
                        i3 = 8;
                        i4 = 7;
                        i5 = 6;
                    }
                    i4 = i7;
                    i5 = i8;
                    i3 = i9;
                    i6 = 13;
                }
                this.loadAd.execute(new RunnableC12388l(this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.purchase).setErrorCode(c9754l.f19893l).setSubErrorCode(c9754l.f19892l).setException(c14723l).build(), 15));
                i11 = 1;
                this.premium = true;
                this.metrica = null;
                i12 = 2;
            }
            i6 = 13;
            i2 = 9;
            i3 = 8;
            i4 = 7;
            i5 = 6;
            this.loadAd.execute(new RunnableC12388l(this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.purchase).setErrorCode(c9754l.f19893l).setSubErrorCode(c9754l.f19892l).setException(c14723l).build(), 15));
            i11 = 1;
            this.premium = true;
            this.metrica = null;
            i12 = 2;
        }
        if (c3797l.firebase(i12)) {
            C1047l c1047lMo2762import = interfaceC9814l.mo2762import();
            boolean zYandex = c1047lMo2762import.yandex(i12);
            boolean zYandex2 = c1047lMo2762import.yandex(i11);
            boolean zYandex3 = c1047lMo2762import.yandex(3);
            if (zYandex || zYandex2 || zYandex3) {
                if (zYandex) {
                    c5978l = null;
                } else {
                    c5978l = null;
                    if (!Objects.equals(this.subscription, null)) {
                        int i29 = this.subscription == null ? 1 : 0;
                        this.subscription = null;
                        i13 = 10;
                        m3935try(1, jElapsedRealtime, null, i29);
                    }
                    if (!zYandex2 && !Objects.equals(this.tapsense, c5978l)) {
                        if (this.tapsense == null) {
                            i17 = 1;
                        } else {
                            i17 = 0;
                        }
                        this.tapsense = c5978l;
                        m3935try(0, jElapsedRealtime, c5978l, i17);
                    }
                    if (!zYandex3 && !Objects.equals(this.Signature, c5978l)) {
                        if (this.Signature == null) {
                            i16 = 1;
                        } else {
                            i16 = 0;
                        }
                        this.Signature = c5978l;
                        m3935try(2, jElapsedRealtime, c5978l, i16);
                    }
                    r8 = c5978l;
                }
                i13 = 10;
                if (!zYandex2) {
                    if (this.tapsense == null) {
                        i17 = 1;
                    } else {
                        i17 = 0;
                    }
                    this.tapsense = c5978l;
                    m3935try(0, jElapsedRealtime, c5978l, i17);
                }
                if (!zYandex3) {
                    if (this.Signature == null) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    this.Signature = c5978l;
                    m3935try(2, jElapsedRealtime, c5978l, i16);
                }
                r8 = c5978l;
            } else {
                r8 = 0;
                i13 = 10;
            }
        } else {
            r8 = 0;
            i13 = 10;
        }
        if (m3933super(this.startapp)) {
            C13698l c13698l = this.startapp;
            C5978l c5978l2 = (C5978l) c13698l.f26743l;
            if (c5978l2.pro != -1) {
                int i30 = c13698l.f26744l;
                if (!Objects.equals(this.subscription, c5978l2)) {
                    int i31 = (this.subscription == null && i30 == 0) ? 1 : i30;
                    this.subscription = c5978l2;
                    m3935try(1, jElapsedRealtime, c5978l2, i31);
                }
                this.startapp = r8;
            }
        }
        if (m3933super(this.adcel)) {
            C13698l c13698l2 = this.adcel;
            C5978l c5978l3 = (C5978l) c13698l2.f26743l;
            int i32 = c13698l2.f26744l;
            if (!Objects.equals(this.tapsense, c5978l3)) {
                int i33 = (this.tapsense == null && i32 == 0) ? 1 : i32;
                this.tapsense = c5978l3;
                m3935try(0, jElapsedRealtime, c5978l3, i33);
            }
            this.adcel = r8;
        }
        if (m3933super(this.ads)) {
            C13698l c13698l3 = this.ads;
            C5978l c5978l4 = (C5978l) c13698l3.f26743l;
            int i34 = c13698l3.f26744l;
            if (!Objects.equals(this.Signature, c5978l4)) {
                int i35 = (this.Signature == null && i34 == 0) ? 1 : i34;
                this.Signature = c5978l4;
                m3935try(2, jElapsedRealtime, c5978l4, i35);
            }
            this.ads = r8;
        }
        switch (C1196l.adcel(this.yandex).ads()) {
            case 0:
                i14 = 0;
                break;
            case 1:
                i14 = i2;
                break;
            case 2:
                i14 = 2;
                break;
            case 3:
                i14 = 4;
                break;
            case 4:
                i14 = 5;
                break;
            case 5:
                i14 = i5;
                break;
            case 6:
            case 8:
            default:
                i14 = 1;
                break;
            case 7:
                i14 = 3;
                break;
            case 9:
                i14 = i3;
                break;
            case 10:
                i14 = i4;
                break;
        }
        if (i14 != this.vip) {
            this.vip = i14;
            this.loadAd.execute(new RunnableC12388l(this, new NetworkEvent.Builder().setNetworkType(i14).setTimeSinceCreatedMillis(jElapsedRealtime - this.purchase).build(), 14));
        }
        if (interfaceC9814l.purchase() != 2) {
            this.license = false;
        }
        if (interfaceC9814l.mo2807switch() == null) {
            this.ad = false;
        } else if (c3797l.firebase(i13)) {
            this.ad = true;
        }
        int iPurchase = interfaceC9814l.purchase();
        if (this.license) {
            i15 = 5;
        } else {
            if (!this.ad) {
                if (iPurchase == 4) {
                    z2 = true;
                    i15 = 11;
                } else {
                    i15 = 12;
                    int i36 = 2;
                    if (iPurchase == 2) {
                        int i37 = this.remoteconfig;
                        if (i37 == 0 || i37 == 2 || i37 == 12) {
                            i15 = i36;
                        } else if (interfaceC9814l.startapp()) {
                            i15 = interfaceC9814l.mo2770l() != 0 ? i13 : i5;
                        } else {
                            i15 = i4;
                        }
                    } else {
                        i36 = 3;
                        if (iPurchase != 3) {
                            z2 = true;
                            if (iPurchase != 1 || this.remoteconfig == 0) {
                                i15 = this.remoteconfig;
                            }
                        } else if (!interfaceC9814l.startapp()) {
                            i15 = 4;
                        } else if (interfaceC9814l.mo2770l() != 0) {
                            i15 = i2;
                        } else {
                            i15 = i36;
                        }
                    }
                }
                if (this.remoteconfig != i15) {
                    this.remoteconfig = i15;
                    this.premium = z2;
                    this.loadAd.execute(new RunnableC12388l(this, new PlaybackStateEvent.Builder().setState(this.remoteconfig).setTimeSinceCreatedMillis(jElapsedRealtime - this.purchase).build(), 17));
                }
                if (c3797l.firebase(1028)) {
                    C6219l c6219l2 = this.crashlytics;
                    C5597l c5597l3 = (C5597l) ((SparseArray) c3797l.f7902l).get(1028);
                    c5597l3.getClass();
                    c6219l2.loadAd(c5597l3);
                }
            }
            i15 = i6;
        }
        z2 = true;
        if (this.remoteconfig != i15) {
            this.remoteconfig = i15;
            this.premium = z2;
            this.loadAd.execute(new RunnableC12388l(this, new PlaybackStateEvent.Builder().setState(this.remoteconfig).setTimeSinceCreatedMillis(jElapsedRealtime - this.purchase).build(), 17));
        }
        if (c3797l.firebase(1028)) {
            C6219l c6219l3 = this.crashlytics;
            C5597l c5597l4 = (C5597l) ((SparseArray) c3797l.f7902l).get(1028);
            c5597l4.getClass();
            c6219l3.loadAd(c5597l4);
        }
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: native */
    public final void mo1745native(int i, C5597l c5597l, C4262l c4262l, C4262l c4262l2) {
        if (i == 1) {
            this.license = true;
        }
        this.smaato = i;
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: package */
    public final void mo1746package(int i, long j, C5597l c5597l) {
        C5019l c5019l = c5597l.amazon;
        if (c5019l != null) {
            String strAmazon = this.crashlytics.amazon(c5597l.loadAd, c5019l);
            HashMap map = this.subs;
            Long l = (Long) map.get(strAmazon);
            HashMap map2 = this.admob;
            Long l2 = (Long) map2.get(strAmazon);
            map.put(strAmazon, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strAmazon, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: private */
    public final void mo1747private(C5597l c5597l, C2040l c2040l) {
        C5019l c5019l = c5597l.amazon;
        if (c5019l == null) {
            return;
        }
        C5978l c5978l = c2040l.crashlytics;
        c5978l.getClass();
        int i = c2040l.amazon;
        AbstractC10759l abstractC10759l = c5597l.loadAd;
        c5019l.getClass();
        C13698l c13698l = new C13698l(c5978l, i, this.crashlytics.amazon(abstractC10759l, c5019l), 15);
        int i2 = c2040l.loadAd;
        if (i2 != 0) {
            if (i2 == 1) {
                this.adcel = c13698l;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.ads = c13698l;
                return;
            }
        }
        this.startapp = c13698l;
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m3932public(AbstractC10759l abstractC10759l, C5019l c5019l) {
        int iLoadAd;
        PlaybackMetrics.Builder builder = this.firebase;
        if (c5019l == null || (iLoadAd = abstractC10759l.loadAd(c5019l.yandex)) == -1) {
            return;
        }
        C3904l c3904l = this.mopub;
        int i = 0;
        abstractC10759l.billing(iLoadAd, c3904l, false);
        int i2 = c3904l.crashlytics;
        C4322l c4322l = this.billing;
        abstractC10759l.vip(i2, c4322l);
        C17805l c17805l = c4322l.crashlytics.loadAd;
        if (c17805l != null) {
            int iM3976private = AbstractC15323l.m3976private(c17805l.yandex, c17805l.loadAd);
            if (iM3976private == 0) {
                i = 3;
            } else if (iM3976private != 1) {
                i = iM3976private != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (c4322l.remoteconfig != -9223372036854775807L && !c4322l.firebase && !c4322l.subs && !c4322l.yandex()) {
            builder.setMediaDurationMillis(AbstractC15323l.m3986try(c4322l.remoteconfig));
        }
        builder.setPlaybackType(c4322l.yandex() ? 2 : 1);
        this.premium = true;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final boolean m3933super(C13698l c13698l) {
        String str;
        if (c13698l == null) {
            return false;
        }
        String str2 = (String) c13698l.f26746l;
        C6219l c6219l = this.crashlytics;
        synchronized (c6219l) {
            str = c6219l.billing;
        }
        return str2.equals(str);
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m3934this(C5597l c5597l, String str) {
        C5019l c5019l = c5597l.amazon;
        if ((c5019l == null || !c5019l.loadAd()) && str.equals(this.isPro)) {
            m3929abstract();
        }
        this.admob.remove(str);
        this.subs.remove(str);
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m3935try(int i, long j, C5978l c5978l, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.purchase);
        if (c5978l != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = c5978l.vip;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c5978l.metrica;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c5978l.firebase;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = c5978l.isPro;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = c5978l.license;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = c5978l.pro;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = c5978l.f12619package;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = c5978l.f12622synchronized;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = c5978l.amazon;
            if (str4 != null) {
                String str5 = AbstractC15323l.yandex;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c5978l.isVip;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.premium = true;
        this.loadAd.execute(new RunnableC12388l(this, timeSinceCreatedMillis.build(), 13));
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: volatile */
    public final void mo1753volatile(C5597l c5597l, C9294l c9294l) {
        this.advert += c9294l.mopub;
        this.isVip += c9294l.purchase;
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void applovin(C5597l c5597l) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo1740continue(C5597l c5597l) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: extends */
    public final /* synthetic */ void mo1742extends(C5597l c5597l) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void loadAd(C5597l c5597l) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void tapsense(C5597l c5597l) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: throws */
    public final /* synthetic */ void mo1752throws(C5597l c5597l) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void ad(C5597l c5597l, int i) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void adcel(C5597l c5597l, int i) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void ads(C5597l c5597l, C13736l c13736l) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void advert(C5597l c5597l, int i) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void amazon(C5597l c5597l, String str) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void appmetrica(C5597l c5597l, int i) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void billing(C5597l c5597l, C1372l c1372l) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ void mo1738catch(C5597l c5597l, C1047l c1047l) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void crashlytics(C5597l c5597l, boolean z) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: else */
    public final /* synthetic */ void mo1741else(C5597l c5597l, Exception exc) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void firebase(C5597l c5597l, long j) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: for */
    public final /* synthetic */ void mo1743for(C5597l c5597l, String str) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void inmobi(C5597l c5597l, int i) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void isPro(C5597l c5597l, Object obj) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void isVip(C5597l c5597l, String str) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void license(C5597l c5597l, int i) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void metrica(C5597l c5597l, C2040l c2040l) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void mopub(C5597l c5597l, String str) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void pro(C5597l c5597l, C5978l c5978l) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void purchase(C5597l c5597l, boolean z) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void remoteconfig(C5597l c5597l, C7417l c7417l) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void signatures(C5597l c5597l, C16583l c16583l) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void smaato(C5597l c5597l, int i) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void subs(C5597l c5597l, int i) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void subscription(C5597l c5597l, C16583l c16583l) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: switch */
    public final /* synthetic */ void mo1749switch(C5597l c5597l, int i) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: synchronized */
    public final /* synthetic */ void mo1750synchronized(C5597l c5597l, float f) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: throw */
    public final /* synthetic */ void mo1751throw(C5597l c5597l, boolean z) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void vip(C5597l c5597l, C5978l c5978l) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void yandex(C5597l c5597l, boolean z) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: case */
    public final /* synthetic */ void mo1737case(C5597l c5597l, int i, boolean z) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void startapp(C5597l c5597l, int i, int i2) {
    }

    @Override // defpackage.InterfaceC5252l
    public final /* synthetic */ void premium(C5597l c5597l, int i, int i2, boolean z) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: strictfp */
    public final /* synthetic */ void mo1748strictfp(C5597l c5597l, int i, long j, long j2) {
    }
}
